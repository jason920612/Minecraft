/*     */ package com.mojang.brigadier;
/*     */ 
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.context.CommandContextBuilder;
/*     */ import com.mojang.brigadier.context.StringRange;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import com.mojang.brigadier.tree.RootCommandNode;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ public class CommandDispatcher<S>
/*     */ {
/*     */   public static final String ARGUMENT_SEPARATOR = " ";
/*     */   public static final char ARGUMENT_SEPARATOR_CHAR = ' ';
/*     */   private static final String USAGE_OPTIONAL_OPEN = "[";
/*     */   private static final String USAGE_OPTIONAL_CLOSE = "]";
/*     */   private static final String USAGE_REQUIRED_OPEN = "(";
/*     */   private static final String USAGE_REQUIRED_CLOSE = ")";
/*     */   private static final String USAGE_OR = "|";
/*     */   private final RootCommandNode<S> root;
/*     */   
/*  39 */   private final Predicate<CommandNode<S>> hasCommand = new Predicate<CommandNode<S>>()
/*     */     {
/*     */       public boolean test(CommandNode<S> input) {
/*  42 */         return (input != null && (input.getCommand() != null || input.getChildren().stream().anyMatch(CommandDispatcher.this.hasCommand)));
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandDispatcher(RootCommandNode<S> root) {
/*  49 */     this.root = root;
/*     */   } private ResultConsumer<S> consumer = (c, s, r) -> {
/*     */     
/*     */     }; public CommandDispatcher() {
/*  53 */     this(new RootCommandNode());
/*     */   }
/*     */   
/*     */   public LiteralCommandNode<S> register(LiteralArgumentBuilder<S> command) {
/*  57 */     LiteralCommandNode<S> build = command.build();
/*  58 */     this.root.addChild((CommandNode)build);
/*  59 */     return build;
/*     */   }
/*     */   
/*     */   public void setConsumer(ResultConsumer<S> consumer) {
/*  63 */     this.consumer = consumer;
/*     */   }
/*     */   
/*     */   public int execute(String input, S source) throws CommandSyntaxException {
/*  67 */     return execute(new StringReader(input), source);
/*     */   }
/*     */   
/*     */   public int execute(StringReader input, S source) throws CommandSyntaxException {
/*  71 */     ParseResults<S> parse = parse(input, source);
/*  72 */     return execute(parse);
/*     */   }
/*     */   
/*     */   public int execute(ParseResults<S> parse) throws CommandSyntaxException {
/*  76 */     if (parse.getReader().canRead()) {
/*  77 */       if (parse.getExceptions().size() == 1)
/*  78 */         throw (CommandSyntaxException)parse.getExceptions().values().iterator().next(); 
/*  79 */       if (parse.getContext().getRange().isEmpty()) {
/*  80 */         throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parse.getReader());
/*     */       }
/*  82 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(parse.getReader());
/*     */     } 
/*     */ 
/*     */     
/*  86 */     int result = 0;
/*  87 */     int successfulForks = 0;
/*  88 */     boolean forked = false;
/*  89 */     boolean foundCommand = false;
/*  90 */     String command = parse.getReader().getString();
/*  91 */     CommandContext<S> original = parse.getContext().build(command);
/*  92 */     List<CommandContext<S>> contexts = Collections.singletonList(original);
/*  93 */     ArrayList<CommandContext<S>> next = null;
/*     */     
/*  95 */     while (contexts != null) {
/*  96 */       int size = contexts.size();
/*  97 */       for (int i = 0; i < size; i++) {
/*  98 */         CommandContext<S> context = contexts.get(i);
/*  99 */         CommandContext<S> child = context.getChild();
/* 100 */         if (child != null) {
/* 101 */           forked |= context.isForked();
/* 102 */           if (!child.getNodes().isEmpty()) {
/* 103 */             foundCommand = true;
/* 104 */             RedirectModifier<S> modifier = context.getRedirectModifier();
/* 105 */             if (modifier == null) {
/* 106 */               if (next == null) {
/* 107 */                 next = new ArrayList<>(1);
/*     */               }
/* 109 */               next.add(child.copyFor(context.getSource()));
/*     */             } else {
/*     */               try {
/* 112 */                 Collection<S> results = modifier.apply(context);
/* 113 */                 if (!results.isEmpty()) {
/* 114 */                   if (next == null) {
/* 115 */                     next = new ArrayList<>(results.size());
/*     */                   }
/* 117 */                   for (S source : results) {
/* 118 */                     next.add(child.copyFor(source));
/*     */                   }
/*     */                 } 
/* 121 */               } catch (CommandSyntaxException ex) {
/* 122 */                 this.consumer.onCommandComplete(context, false, 0);
/* 123 */                 if (!forked) {
/* 124 */                   throw ex;
/*     */                 }
/*     */               } 
/*     */             } 
/*     */           } 
/* 129 */         } else if (context.getCommand() != null) {
/* 130 */           foundCommand = true;
/*     */           try {
/* 132 */             int value = context.getCommand().run(context);
/* 133 */             result += value;
/* 134 */             this.consumer.onCommandComplete(context, true, value);
/* 135 */             successfulForks++;
/* 136 */           } catch (CommandSyntaxException ex) {
/* 137 */             this.consumer.onCommandComplete(context, false, 0);
/* 138 */             if (!forked) {
/* 139 */               throw ex;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 145 */       contexts = next;
/* 146 */       next = null;
/*     */     } 
/*     */     
/* 149 */     if (!foundCommand) {
/* 150 */       this.consumer.onCommandComplete(original, false, 0);
/* 151 */       throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parse.getReader());
/*     */     } 
/*     */     
/* 154 */     return forked ? successfulForks : result;
/*     */   }
/*     */   
/*     */   public ParseResults<S> parse(String command, S source) {
/* 158 */     return parse(new StringReader(command), source);
/*     */   }
/*     */   
/*     */   public ParseResults<S> parse(StringReader command, S source) {
/* 162 */     CommandContextBuilder<S> context = new CommandContextBuilder(this, source, 0);
/* 163 */     return parseNodes((CommandNode<S>)this.root, command, context);
/*     */   }
/*     */   
/*     */   private static class PartialParse<S> {
/*     */     public final CommandContextBuilder<S> context;
/*     */     public final ParseResults<S> parse;
/*     */     
/*     */     private PartialParse(CommandContextBuilder<S> context, ParseResults<S> parse) {
/* 171 */       this.context = context;
/* 172 */       this.parse = parse;
/*     */     }
/*     */   }
/*     */   
/*     */   private ParseResults<S> parseNodes(CommandNode<S> node, StringReader originalReader, CommandContextBuilder<S> contextSoFar) {
/* 177 */     S source = (S)contextSoFar.getSource();
/* 178 */     Map<CommandNode<S>, CommandSyntaxException> errors = null;
/* 179 */     List<PartialParse<S>> potentials = null;
/* 180 */     int cursor = originalReader.getCursor();
/*     */     
/* 182 */     for (CommandNode<S> child : (Iterable<CommandNode<S>>)node.getRelevantNodes(originalReader)) {
/* 183 */       if (!child.canUse(source)) {
/*     */         continue;
/*     */       }
/* 186 */       CommandContextBuilder<S> context = contextSoFar.copy();
/* 187 */       StringReader reader = new StringReader(originalReader);
/*     */       try {
/*     */         try {
/* 190 */           child.parse(reader, context);
/* 191 */         } catch (RuntimeException ex) {
/* 192 */           throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherParseException().createWithContext(reader, ex.getMessage());
/*     */         } 
/* 194 */         if (reader.canRead() && 
/* 195 */           reader.peek() != ' ') {
/* 196 */           throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherExpectedArgumentSeparator().createWithContext(reader);
/*     */         }
/*     */       }
/* 199 */       catch (CommandSyntaxException ex) {
/* 200 */         if (errors == null) {
/* 201 */           errors = new LinkedHashMap<>();
/*     */         }
/* 203 */         errors.put(child, ex);
/* 204 */         reader.setCursor(cursor);
/*     */         
/*     */         continue;
/*     */       } 
/* 208 */       context.withCommand(child.getCommand());
/* 209 */       if (reader.canRead((child.getRedirect() == null) ? 2 : 1)) {
/* 210 */         reader.skip();
/* 211 */         if (child.getRedirect() != null) {
/* 212 */           CommandContextBuilder<S> childContext = new CommandContextBuilder(this, source, reader.getCursor());
/* 213 */           childContext.withNode(child.getRedirect(), StringRange.between(cursor, reader.getCursor() - 1));
/* 214 */           ParseResults<S> parseResults = parseNodes(child.getRedirect(), reader, childContext);
/* 215 */           context.withChild(parseResults.getContext());
/* 216 */           return new ParseResults<>(context, originalReader.getCursor(), parseResults.getReader(), parseResults.getExceptions());
/*     */         } 
/* 218 */         ParseResults<S> parse = parseNodes(child, reader, context);
/* 219 */         if (potentials == null) {
/* 220 */           potentials = new ArrayList<>(1);
/*     */         }
/* 222 */         potentials.add(new PartialParse<>(context, parse));
/*     */         continue;
/*     */       } 
/* 225 */       if (potentials == null) {
/* 226 */         potentials = new ArrayList<>(1);
/*     */       }
/* 228 */       potentials.add(new PartialParse<>(context, new ParseResults<>(context, originalReader.getCursor(), reader, Collections.emptyMap())));
/*     */     } 
/*     */ 
/*     */     
/* 232 */     if (potentials != null) {
/* 233 */       if (potentials.size() > 1) {
/* 234 */         potentials.sort((a, b) -> 
/* 235 */             (!a.parse.getReader().canRead() && b.parse.getReader().canRead()) ? -1 : (
/*     */ 
/*     */             
/* 238 */             (a.parse.getReader().canRead() && !b.parse.getReader().canRead()) ? 1 : (
/*     */ 
/*     */             
/* 241 */             (a.parse.getExceptions().isEmpty() && !b.parse.getExceptions().isEmpty()) ? -1 : (
/*     */ 
/*     */             
/* 244 */             (!a.parse.getExceptions().isEmpty() && b.parse.getExceptions().isEmpty()) ? 1 : 0))));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 250 */       return ((PartialParse)potentials.get(0)).parse;
/*     */     } 
/*     */     
/* 253 */     return new ParseResults<>(contextSoFar, originalReader.getCursor(), originalReader, (errors == null) ? Collections.<CommandNode<S>, CommandSyntaxException>emptyMap() : errors);
/*     */   }
/*     */   
/*     */   public String[] getAllUsage(CommandNode<S> node, S source, boolean restricted) {
/* 257 */     ArrayList<String> result = Lists.newArrayList();
/* 258 */     getAllUsage(node, source, result, "", restricted);
/* 259 */     return result.<String>toArray(new String[result.size()]);
/*     */   }
/*     */   
/*     */   private void getAllUsage(CommandNode<S> node, S source, ArrayList<String> result, String prefix, boolean restricted) {
/* 263 */     if (restricted && !node.canUse(source)) {
/*     */       return;
/*     */     }
/*     */     
/* 267 */     if (node.getCommand() != null) {
/* 268 */       result.add(prefix);
/*     */     }
/*     */     
/* 271 */     if (node.getRedirect() != null) {
/* 272 */       String redirect = (node.getRedirect() == this.root) ? "..." : ("-> " + node.getRedirect().getUsageText());
/* 273 */       result.add(prefix.isEmpty() ? (node.getUsageText() + " " + redirect) : (prefix + " " + redirect));
/* 274 */     } else if (!node.getChildren().isEmpty()) {
/* 275 */       for (CommandNode<S> child : (Iterable<CommandNode<S>>)node.getChildren()) {
/* 276 */         getAllUsage(child, source, result, prefix.isEmpty() ? child.getUsageText() : (prefix + " " + child.getUsageText()), restricted);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public Map<CommandNode<S>, String> getSmartUsage(CommandNode<S> node, S source) {
/* 282 */     Map<CommandNode<S>, String> result = Maps.newLinkedHashMap();
/*     */     
/* 284 */     boolean optional = (node.getCommand() != null);
/* 285 */     for (CommandNode<S> child : (Iterable<CommandNode<S>>)node.getChildren()) {
/* 286 */       String usage = getSmartUsage(child, source, optional, false);
/* 287 */       if (usage != null) {
/* 288 */         result.put(child, usage);
/*     */       }
/*     */     } 
/* 291 */     return result;
/*     */   }
/*     */   
/*     */   private String getSmartUsage(CommandNode<S> node, S source, boolean optional, boolean deep) {
/* 295 */     if (!node.canUse(source)) {
/* 296 */       return null;
/*     */     }
/*     */     
/* 299 */     String self = optional ? ("[" + node.getUsageText() + "]") : node.getUsageText();
/* 300 */     boolean childOptional = (node.getCommand() != null);
/* 301 */     String open = childOptional ? "[" : "(";
/* 302 */     String close = childOptional ? "]" : ")";
/*     */     
/* 304 */     if (!deep) {
/* 305 */       if (node.getRedirect() != null) {
/* 306 */         String redirect = (node.getRedirect() == this.root) ? "..." : ("-> " + node.getRedirect().getUsageText());
/* 307 */         return self + " " + redirect;
/*     */       } 
/* 309 */       Collection<CommandNode<S>> children = (Collection<CommandNode<S>>)node.getChildren().stream().filter(c -> c.canUse(source)).collect(Collectors.toList());
/* 310 */       if (children.size() == 1) {
/* 311 */         String usage = getSmartUsage(children.iterator().next(), source, childOptional, childOptional);
/* 312 */         if (usage != null) {
/* 313 */           return self + " " + usage;
/*     */         }
/* 315 */       } else if (children.size() > 1) {
/* 316 */         Set<String> childUsage = Sets.newLinkedHashSet();
/* 317 */         for (CommandNode<S> child : children) {
/* 318 */           String usage = getSmartUsage(child, source, childOptional, true);
/* 319 */           if (usage != null) {
/* 320 */             childUsage.add(usage);
/*     */           }
/*     */         } 
/* 323 */         if (childUsage.size() == 1) {
/* 324 */           String usage = childUsage.iterator().next();
/* 325 */           return self + " " + (childOptional ? ("[" + usage + "]") : usage);
/* 326 */         }  if (childUsage.size() > 1) {
/* 327 */           StringBuilder builder = new StringBuilder(open);
/* 328 */           int count = 0;
/* 329 */           for (CommandNode<S> child : children) {
/* 330 */             if (count > 0) {
/* 331 */               builder.append("|");
/*     */             }
/* 333 */             builder.append(child.getUsageText());
/* 334 */             count++;
/*     */           } 
/* 336 */           if (count > 0) {
/* 337 */             builder.append(close);
/* 338 */             return self + " " + builder.toString();
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 345 */     return self;
/*     */   } public CompletableFuture<Suggestions> getCompletionSuggestions(ParseResults<S> parse) {
/*     */     RootCommandNode<S> rootCommandNode;
/*     */     int start;
/* 349 */     CommandContextBuilder<S> rootContext = parse.getContext();
/* 350 */     CommandContextBuilder<S> context = rootContext.getLastChild();
/*     */ 
/*     */ 
/*     */     
/* 354 */     if (context.getNodes().isEmpty()) {
/* 355 */       rootCommandNode = this.root;
/* 356 */       start = parse.getStartIndex();
/* 357 */     } else if (parse.getReader().canRead()) {
/* 358 */       Map.Entry<CommandNode<S>, StringRange> entry = (Map.Entry<CommandNode<S>, StringRange>)Iterables.getLast(context.getNodes().entrySet());
/* 359 */       CommandNode<S> parent = entry.getKey();
/* 360 */       start = ((StringRange)entry.getValue()).getEnd() + 1;
/* 361 */     } else if (context.getNodes().size() > 1) {
/* 362 */       Map.Entry<CommandNode<S>, StringRange> entry = (Map.Entry<CommandNode<S>, StringRange>)Iterables.get(context.getNodes().entrySet(), context.getNodes().size() - 2);
/* 363 */       CommandNode<S> parent = entry.getKey();
/* 364 */       start = ((StringRange)entry.getValue()).getEnd() + 1;
/* 365 */     } else if (rootContext != context && context.getNodes().size() > 0) {
/* 366 */       Map.Entry<CommandNode<S>, StringRange> entry = (Map.Entry<CommandNode<S>, StringRange>)Iterables.getLast(context.getNodes().entrySet());
/* 367 */       CommandNode<S> parent = entry.getKey();
/* 368 */       start = ((StringRange)entry.getValue()).getEnd() + 1;
/*     */     } else {
/* 370 */       rootCommandNode = this.root;
/* 371 */       start = parse.getStartIndex();
/*     */     } 
/*     */     
/* 374 */     CompletableFuture[] arrayOfCompletableFuture = new CompletableFuture[rootCommandNode.getChildren().size()];
/* 375 */     int i = 0;
/* 376 */     for (CommandNode<S> node : (Iterable<CommandNode<S>>)rootCommandNode.getChildren()) {
/* 377 */       CompletableFuture<Suggestions> future = Suggestions.empty();
/*     */       try {
/* 379 */         future = node.listSuggestions(context.build(parse.getReader().getString()), new SuggestionsBuilder(parse.getReader().getString(), start));
/* 380 */       } catch (CommandSyntaxException commandSyntaxException) {}
/*     */       
/* 382 */       arrayOfCompletableFuture[i++] = future;
/*     */     } 
/*     */     
/* 385 */     CompletableFuture<Suggestions> result = new CompletableFuture<>();
/* 386 */     CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture).thenRun(() -> {
/*     */           List<Suggestions> suggestions = Lists.newArrayList();
/*     */           
/*     */           for (CompletableFuture<Suggestions> future : futures) {
/*     */             suggestions.add(future.join());
/*     */           }
/*     */           result.complete(Suggestions.merge(parse.getReader().getString(), suggestions));
/*     */         });
/* 394 */     return result;
/*     */   }
/*     */   
/*     */   public RootCommandNode<S> getRoot() {
/* 398 */     return this.root;
/*     */   }
/*     */   
/*     */   public Collection<String> getPath(CommandNode<S> target) {
/* 402 */     List<List<CommandNode<S>>> nodes = new ArrayList<>();
/* 403 */     addPaths((CommandNode<S>)this.root, nodes, new ArrayList<>());
/*     */     
/* 405 */     for (List<CommandNode<S>> list : nodes) {
/* 406 */       if (list.get(list.size() - 1) == target) {
/* 407 */         List<String> result = new ArrayList<>(list.size());
/* 408 */         for (CommandNode<S> node : list) {
/* 409 */           if (node != this.root) {
/* 410 */             result.add(node.getName());
/*     */           }
/*     */         } 
/* 413 */         return result;
/*     */       } 
/*     */     } 
/*     */     
/* 417 */     return Collections.emptyList();
/*     */   }
/*     */   public CommandNode<S> findNode(Collection<String> path) {
/*     */     CommandNode<S> commandNode;
/* 421 */     RootCommandNode<S> rootCommandNode = this.root;
/* 422 */     for (String name : path) {
/* 423 */       commandNode = rootCommandNode.getChild(name);
/* 424 */       if (commandNode == null) {
/* 425 */         return null;
/*     */       }
/*     */     } 
/* 428 */     return commandNode;
/*     */   }
/*     */   
/*     */   public void findAmbiguities(AmbiguityConsumer<S> consumer) {
/* 432 */     this.root.findAmbiguities(consumer);
/*     */   }
/*     */   
/*     */   private void addPaths(CommandNode<S> node, List<List<CommandNode<S>>> result, List<CommandNode<S>> parents) {
/* 436 */     List<CommandNode<S>> current = new ArrayList<>(parents);
/* 437 */     current.add(node);
/* 438 */     result.add(current);
/*     */     
/* 440 */     for (CommandNode<S> child : (Iterable<CommandNode<S>>)node.getChildren())
/* 441 */       addPaths(child, result, current); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\CommandDispatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */