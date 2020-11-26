/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.RootCommandNode;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class a
/*     */ {
/*     */   @Nullable
/*     */   private final ArgumentBuilder<bw, ?> a;
/*     */   private final byte b;
/*     */   private final int c;
/*     */   private final int[] d;
/*     */   private CommandNode<bw> e;
/*     */   
/*     */   private a(@Nullable ArgumentBuilder<bw, ?> ☃, byte b, int i, int[] arrayOfInt) {
/* 198 */     this.a = ☃;
/* 199 */     this.b = b;
/* 200 */     this.c = i;
/* 201 */     this.d = arrayOfInt;
/*     */   }
/*     */   
/*     */   public boolean a(a[] ☃) {
/* 205 */     if (this.e == null) {
/* 206 */       if (this.a == null) {
/* 207 */         this.e = (CommandNode<bw>)new RootCommandNode();
/*     */       } else {
/* 209 */         if ((this.b & 0x8) != 0) {
/* 210 */           if ((☃[this.c]).e == null) {
/* 211 */             return false;
/*     */           }
/* 213 */           this.a.redirect((☃[this.c]).e);
/*     */         } 
/*     */         
/* 216 */         if ((this.b & 0x4) != 0) {
/* 217 */           this.a.executes(☃ -> 0);
/*     */         }
/*     */         
/* 220 */         this.e = this.a.build();
/*     */       } 
/*     */     }
/*     */     
/* 224 */     for (int i : this.d) {
/* 225 */       if ((☃[i]).e == null) {
/* 226 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 230 */     for (int i : this.d) {
/* 231 */       CommandNode<bw> commandNode = (☃[i]).e;
/* 232 */       if (!(commandNode instanceof RootCommandNode)) {
/* 233 */         this.e.addChild(commandNode);
/*     */       }
/*     */     } 
/*     */     
/* 237 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\jq$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */