/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.RootCommandNode;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.function.Predicate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bv
/*     */ {
/* 104 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 117 */   private final CommandDispatcher<bu> b = new CommandDispatcher();
/*     */   
/*     */   public bv(boolean ☃) {
/* 120 */     px.a(this.b);
/* 121 */     qm.a(this.b);
/* 122 */     qb.a(this.b);
/* 123 */     qc.a(this.b);
/* 124 */     qd.a(this.b);
/* 125 */     sj.a(this.b);
/* 126 */     qe.a(this.b);
/* 127 */     qg.a(this.b);
/* 128 */     qh.a(this.b);
/* 129 */     qi.a(this.b);
/* 130 */     qj.a(this.b);
/* 131 */     qk.a(this.b);
/* 132 */     ql.a(this.b);
/* 133 */     qn.a(this.b);
/* 134 */     qo.a(this.b);
/* 135 */     qq.a(this.b);
/* 136 */     qr.a(this.b);
/* 137 */     qs.a(this.b);
/* 138 */     qt.a(this.b);
/* 139 */     qu.a(this.b);
/* 140 */     qv.a(this.b);
/* 141 */     qw.a(this.b);
/* 142 */     qx.a(this.b);
/* 143 */     qy.a(this.b);
/* 144 */     qz.a(this.b);
/* 145 */     rd.a(this.b);
/* 146 */     re.a(this.b);
/* 147 */     rf.a(this.b);
/* 148 */     rh.a(this.b);
/* 149 */     rg.a(this.b);
/* 150 */     ri.a(this.b);
/* 151 */     rm.a(this.b);
/* 152 */     rn.a(this.b);
/* 153 */     ro.a(this.b);
/* 154 */     rp.a(this.b);
/* 155 */     rr.a(this.b);
/* 156 */     rs.a(this.b);
/* 157 */     rt.a(this.b);
/* 158 */     rv.a(this.b);
/* 159 */     rw.a(this.b);
/* 160 */     rx.a(this.b);
/* 161 */     ry.a(this.b);
/* 162 */     rz.a(this.b);
/* 163 */     sa.a(this.b);
/* 164 */     qp.a(this.b);
/* 165 */     sb.a(this.b);
/* 166 */     sc.a(this.b);
/* 167 */     sd.a(this.b);
/* 168 */     se.a(this.b);
/* 169 */     sg.a(this.b);
/*     */     
/* 171 */     if (☃) {
/* 172 */       py.a(this.b);
/* 173 */       pz.a(this.b);
/* 174 */       qa.a(this.b);
/* 175 */       qf.a(this.b);
/* 176 */       ra.a(this.b);
/* 177 */       rb.a(this.b);
/* 178 */       rc.a(this.b);
/* 179 */       rj.a(this.b);
/* 180 */       rk.a(this.b);
/* 181 */       rl.a(this.b);
/* 182 */       rq.a(this.b);
/* 183 */       ru.a(this.b);
/* 184 */       sf.a(this.b);
/*     */     } 
/*     */     
/* 187 */     this.b.findAmbiguities((☃, commandNode1, commandNode2, collection) -> a.warn("Ambiguity between arguments {} and {} with inputs: {}", this.b.getPath(commandNode1), this.b.getPath(commandNode2), collection));
/*     */ 
/*     */ 
/*     */     
/* 191 */     this.b.setConsumer((☃, bool, i) -> ((bu)☃.getSource()).a(☃, bool, i));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(File ☃) {
/*     */     try {
/* 198 */       Files.write((new GsonBuilder()).setPrettyPrinting().create().toJson((JsonElement)dz.a(this.b, (CommandNode<bu>)this.b.getRoot())), ☃, StandardCharsets.UTF_8);
/* 199 */     } catch (IOException iOException) {
/* 200 */       a.error("Couldn't write out command tree!", iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(bu ☃, String str) {
/* 205 */     StringReader stringReader = new StringReader(str);
/* 206 */     if (stringReader.canRead() && stringReader.peek() == '/') {
/* 207 */       stringReader.skip();
/*     */     }
/* 209 */     (☃.j()).b.a(str);
/*     */     try {
/* 211 */       return this.b.execute(stringReader, ☃);
/* 212 */     } catch (bs bs) {
/* 213 */       ☃.a(bs.a());
/* 214 */       return 0;
/* 215 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 216 */       ☃.a(ik.a(commandSyntaxException.getRawMessage()));
/* 217 */       if (commandSyntaxException.getInput() != null && commandSyntaxException.getCursor() >= 0) {
/* 218 */         int i = Math.min(commandSyntaxException.getInput().length(), commandSyntaxException.getCursor());
/* 219 */         ij ij = (new iq("")).a(a.h).a(ip1 -> ip1.a(new ii(ii.a.d, ☃)));
/*     */ 
/*     */         
/* 222 */         if (i > 10) {
/* 223 */           ij.a("...");
/*     */         }
/* 225 */         ij.a(commandSyntaxException.getInput().substring(Math.max(0, i - 10), i));
/* 226 */         if (i < commandSyntaxException.getInput().length()) {
/* 227 */           ij ij1 = (new iq(commandSyntaxException.getInput().substring(i))).a(new a[] { a.m, a.t });
/* 228 */           ij.a(ij1);
/*     */         } 
/* 230 */         ij.a((new ir("command.context.here", new Object[0])).a(new a[] { a.m, a.u }));
/* 231 */         ☃.a(ij);
/*     */       } 
/* 233 */       return 0;
/* 234 */     } catch (Exception exception) {
/* 235 */       ij ij = new iq((exception.getMessage() == null) ? exception.getClass().getName() : exception.getMessage());
/* 236 */       if (a.isDebugEnabled()) {
/* 237 */         StackTraceElement[] arrayOfStackTraceElement = exception.getStackTrace();
/* 238 */         for (int i = 0; i < Math.min(arrayOfStackTraceElement.length, 3); i++) {
/* 239 */           ij.a("\n\n")
/* 240 */             .a(arrayOfStackTraceElement[i].getMethodName())
/* 241 */             .a("\n ")
/* 242 */             .a(arrayOfStackTraceElement[i].getFileName())
/* 243 */             .a(":")
/* 244 */             .a(String.valueOf(arrayOfStackTraceElement[i].getLineNumber()));
/*     */         }
/*     */       } 
/* 247 */       ☃.a((new ir("command.failed", new Object[0])).a(ip1 -> ip1.a(new il(il.a.a, ☃))));
/* 248 */       return 0;
/*     */     } finally {
/* 250 */       (☃.j()).b.e();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/* 255 */     Map<CommandNode<bu>, CommandNode<bw>> map = Maps.newHashMap();
/* 256 */     RootCommandNode<bw> rootCommandNode = new RootCommandNode();
/* 257 */     map.put(this.b.getRoot(), rootCommandNode);
/* 258 */     a((CommandNode<bu>)this.b.getRoot(), (CommandNode<bw>)rootCommandNode, ☃.bX(), map);
/* 259 */     ☃.a.a(new jq(rootCommandNode));
/*     */   }
/*     */   
/*     */   private void a(CommandNode<bu> ☃, CommandNode<bw> commandNode, bu bu1, Map<CommandNode<bu>, CommandNode<bw>> map) {
/* 263 */     for (CommandNode<bu> commandNode1 : (Iterable<CommandNode<bu>>)☃.getChildren()) {
/* 264 */       if (commandNode1.canUse(bu1)) {
/* 265 */         ArgumentBuilder<bw, ?> argumentBuilder = commandNode1.createBuilder();
/* 266 */         argumentBuilder.requires(☃ -> true);
/* 267 */         if (argumentBuilder.getCommand() != null)
/*     */         {
/*     */           
/* 270 */           argumentBuilder.executes(☃ -> 0);
/*     */         }
/* 272 */         if (argumentBuilder instanceof RequiredArgumentBuilder) {
/* 273 */           RequiredArgumentBuilder<bw, ?> requiredArgumentBuilder = (RequiredArgumentBuilder<bw, ?>)argumentBuilder;
/* 274 */           if (requiredArgumentBuilder.getSuggestionsProvider() != null)
/*     */           {
/*     */             
/* 277 */             requiredArgumentBuilder.suggests(eb.b(requiredArgumentBuilder.getSuggestionsProvider()));
/*     */           }
/*     */         } 
/* 280 */         if (argumentBuilder.getRedirect() != null) {
/* 281 */           argumentBuilder.redirect(map.get(argumentBuilder.getRedirect()));
/*     */         }
/* 283 */         CommandNode<bw> commandNode2 = argumentBuilder.build();
/* 284 */         map.put(commandNode1, commandNode2);
/* 285 */         commandNode.addChild(commandNode2);
/* 286 */         if (!commandNode1.getChildren().isEmpty()) {
/* 287 */           a(commandNode1, commandNode2, bu1, map);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static LiteralArgumentBuilder<bu> a(String ☃) {
/* 294 */     return LiteralArgumentBuilder.literal(☃);
/*     */   }
/*     */   
/*     */   public static <T> RequiredArgumentBuilder<bu, T> a(String ☃, ArgumentType<T> argumentType) {
/* 298 */     return RequiredArgumentBuilder.argument(☃, argumentType);
/*     */   }
/*     */   
/*     */   public static Predicate<String> a(a ☃) {
/* 302 */     return str -> {
/*     */         try {
/*     */           ☃.parse(new StringReader(str));
/*     */           return true;
/* 306 */         } catch (CommandSyntaxException commandSyntaxException) {
/*     */           return false;
/*     */         } 
/*     */       };
/*     */   }
/*     */   
/*     */   public CommandDispatcher<bu> a() {
/* 313 */     return this.b;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a {
/*     */     void parse(StringReader param1StringReader) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */