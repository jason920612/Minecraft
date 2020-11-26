/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.tree.ArgumentCommandNode;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import com.mojang.brigadier.tree.RootCommandNode;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.Deque;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class jq
/*     */   implements iv<iy>
/*     */ {
/*     */   private RootCommandNode<bw> a;
/*     */   
/*     */   public jq() {}
/*     */   
/*     */   public jq(RootCommandNode<bw> ☃) {
/*  44 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  49 */     a[] arrayOfA = new a[☃.g()];
/*  50 */     Deque<a> deque = new ArrayDeque<>(arrayOfA.length);
/*  51 */     for (int i = 0; i < arrayOfA.length; i++) {
/*  52 */       arrayOfA[i] = c(☃);
/*  53 */       deque.add(arrayOfA[i]);
/*     */     } 
/*     */     
/*  56 */     while (!deque.isEmpty()) {
/*  57 */       boolean bool = false;
/*  58 */       for (Iterator<a> iterator = deque.iterator(); iterator.hasNext(); ) {
/*  59 */         a a = iterator.next();
/*  60 */         if (a.a(arrayOfA)) {
/*  61 */           iterator.remove();
/*  62 */           bool = true;
/*     */         } 
/*     */       } 
/*  65 */       if (!bool) {
/*  66 */         throw new IllegalStateException("Server sent an impossible command tree");
/*     */       }
/*     */     } 
/*     */     
/*  70 */     this.a = (RootCommandNode<bw>)a.a(arrayOfA[☃.g()]);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  76 */     Map<CommandNode<bw>, Integer> map = Maps.newHashMap();
/*  77 */     Deque<CommandNode<bw>> deque = new ArrayDeque<>();
/*  78 */     deque.add(this.a);
/*     */     
/*  80 */     while (!deque.isEmpty()) {
/*  81 */       CommandNode<bw> commandNode = deque.pollFirst();
/*  82 */       if (map.containsKey(commandNode)) {
/*     */         continue;
/*     */       }
/*  85 */       int i = map.size();
/*  86 */       map.put(commandNode, Integer.valueOf(i));
/*  87 */       deque.addAll(commandNode.getChildren());
/*  88 */       if (commandNode.getRedirect() != null) {
/*  89 */         deque.add(commandNode.getRedirect());
/*     */       }
/*     */     } 
/*     */     
/*  93 */     CommandNode[] arrayOfCommandNode = new CommandNode[map.size()];
/*  94 */     for (Map.Entry<CommandNode<bw>, Integer> entry : map.entrySet()) {
/*  95 */       arrayOfCommandNode[((Integer)entry.getValue()).intValue()] = entry.getKey();
/*     */     }
/*     */     
/*  98 */     ☃.d(arrayOfCommandNode.length);
/*  99 */     for (CommandNode<bw> commandNode : arrayOfCommandNode) {
/* 100 */       a(☃, commandNode, map);
/*     */     }
/* 102 */     ☃.d(((Integer)map.get(this.a)).intValue());
/*     */   }
/*     */   
/*     */   private a c(hy ☃) {
/* 106 */     byte b = ☃.readByte();
/* 107 */     int[] arrayOfInt = ☃.b();
/* 108 */     int i = ((b & 0x8) != 0) ? ☃.g() : 0;
/* 109 */     ArgumentBuilder<bw, ?> argumentBuilder = a(☃, b);
/* 110 */     return new a(argumentBuilder, b, i, arrayOfInt);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ArgumentBuilder<bw, ?> a(hy ☃, byte b) {
/* 115 */     int i = b & 0x3;
/* 116 */     if (i == 2) {
/* 117 */       String str = ☃.e(32767);
/* 118 */       ArgumentType<?> argumentType = dz.a(☃);
/* 119 */       if (argumentType == null) {
/* 120 */         return null;
/*     */       }
/* 122 */       RequiredArgumentBuilder<bw, ?> requiredArgumentBuilder = RequiredArgumentBuilder.argument(str, argumentType);
/* 123 */       if ((b & 0x10) != 0) {
/* 124 */         requiredArgumentBuilder.suggests(eb.a(☃.l()));
/*     */       }
/* 126 */       return (ArgumentBuilder<bw, ?>)requiredArgumentBuilder;
/*     */     } 
/* 128 */     if (i == 1) {
/* 129 */       return (ArgumentBuilder<bw, ?>)LiteralArgumentBuilder.literal(☃.e(32767));
/*     */     }
/* 131 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(hy ☃, CommandNode<bw> commandNode, Map<CommandNode<bw>, Integer> map) {
/* 136 */     byte b = 0;
/* 137 */     if (commandNode.getRedirect() != null) {
/* 138 */       b = (byte)(b | 0x8);
/*     */     }
/* 140 */     if (commandNode.getCommand() != null) {
/* 141 */       b = (byte)(b | 0x4);
/*     */     }
/*     */     
/* 144 */     if (commandNode instanceof RootCommandNode) {
/* 145 */       b = (byte)(b | 0x0);
/* 146 */     } else if (commandNode instanceof ArgumentCommandNode) {
/* 147 */       b = (byte)(b | 0x2);
/* 148 */       if (((ArgumentCommandNode)commandNode).getCustomSuggestions() != null) {
/* 149 */         b = (byte)(b | 0x10);
/*     */       }
/* 151 */     } else if (commandNode instanceof LiteralCommandNode) {
/* 152 */       b = (byte)(b | 0x1);
/*     */     } else {
/* 154 */       throw new UnsupportedOperationException("Unknown node type " + commandNode);
/*     */     } 
/*     */     
/* 157 */     ☃.writeByte(b);
/*     */     
/* 159 */     ☃.d(commandNode.getChildren().size());
/* 160 */     for (CommandNode<bw> commandNode1 : (Iterable<CommandNode<bw>>)commandNode.getChildren()) {
/* 161 */       ☃.d(((Integer)map.get(commandNode1)).intValue());
/*     */     }
/*     */     
/* 164 */     if (commandNode.getRedirect() != null) {
/* 165 */       ☃.d(((Integer)map.get(commandNode.getRedirect())).intValue());
/*     */     }
/*     */     
/* 168 */     if (commandNode instanceof ArgumentCommandNode) {
/* 169 */       ArgumentCommandNode<bw, ?> argumentCommandNode = (ArgumentCommandNode)commandNode;
/* 170 */       ☃.a(argumentCommandNode.getName());
/* 171 */       dz.a(☃, argumentCommandNode.getType());
/* 172 */       if (argumentCommandNode.getCustomSuggestions() != null) {
/* 173 */         ☃.a(eb.a(argumentCommandNode.getCustomSuggestions()));
/*     */       }
/* 175 */     } else if (commandNode instanceof LiteralCommandNode) {
/* 176 */       ☃.a(((LiteralCommandNode)commandNode).getLiteral());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/* 182 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/*     */     @Nullable
/*     */     private final ArgumentBuilder<bw, ?> a;
/*     */     
/*     */     private final byte b;
/*     */     
/*     */     private final int c;
/*     */     private final int[] d;
/*     */     private CommandNode<bw> e;
/*     */     
/*     */     private a(@Nullable ArgumentBuilder<bw, ?> ☃, byte b, int i, int[] arrayOfInt) {
/* 198 */       this.a = ☃;
/* 199 */       this.b = b;
/* 200 */       this.c = i;
/* 201 */       this.d = arrayOfInt;
/*     */     }
/*     */     
/*     */     public boolean a(a[] ☃) {
/* 205 */       if (this.e == null) {
/* 206 */         if (this.a == null) {
/* 207 */           this.e = (CommandNode<bw>)new RootCommandNode();
/*     */         } else {
/* 209 */           if ((this.b & 0x8) != 0) {
/* 210 */             if ((☃[this.c]).e == null) {
/* 211 */               return false;
/*     */             }
/* 213 */             this.a.redirect((☃[this.c]).e);
/*     */           } 
/*     */           
/* 216 */           if ((this.b & 0x4) != 0) {
/* 217 */             this.a.executes(☃ -> 0);
/*     */           }
/*     */           
/* 220 */           this.e = this.a.build();
/*     */         } 
/*     */       }
/*     */       
/* 224 */       for (int i : this.d) {
/* 225 */         if ((☃[i]).e == null) {
/* 226 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 230 */       for (int i : this.d) {
/* 231 */         CommandNode<bw> commandNode = (☃[i]).e;
/* 232 */         if (!(commandNode instanceof RootCommandNode)) {
/* 233 */           this.e.addChild(commandNode);
/*     */         }
/*     */       } 
/*     */       
/* 237 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\jq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */