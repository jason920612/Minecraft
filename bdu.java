/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bdu
/*    */   extends bcs
/*    */ {
/*    */   protected bdu(bcs.c ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 26 */     if (axy1.B) {
/* 27 */       return true;
/*    */     }
/* 29 */     aog1.a(new a(axy1, el1));
/* 30 */     aog1.a(ws.al);
/* 31 */     return true;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements adl
/*    */   {
/*    */     private final axy a;
/*    */     private final el b;
/*    */     
/*    */     public a(axy ☃, el el1) {
/* 41 */       this.a = ☃;
/* 42 */       this.b = el1;
/*    */     }
/*    */ 
/*    */     
/*    */     public ij N_() {
/* 47 */       return new ir(bct.co.m() + ".name", new Object[0]);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean O_() {
/* 52 */       return false;
/*    */     }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public ij e() {
/* 58 */       return null;
/*    */     }
/*    */ 
/*    */     
/*    */     public apv a(aof ☃, aog aog1) {
/* 63 */       return new aqd(☃, this.a, this.b);
/*    */     }
/*    */ 
/*    */     
/*    */     public String l() {
/* 68 */       return "minecraft:crafting_table";
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bdu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */