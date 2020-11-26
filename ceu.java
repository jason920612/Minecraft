/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ 
/*    */ 
/*    */ public class ceu
/*    */   extends cew
/*    */ {
/*    */   private final cew b;
/*    */   private final eq.a c;
/*  9 */   private final DoubleList d = (DoubleList)new cej(1);
/*    */   
/*    */   public ceu(cew ☃, eq.a a1, int i) {
/* 12 */     super(a(☃.a, a1, i));
/* 13 */     this.b = ☃;
/* 14 */     this.c = a1;
/*    */   }
/*    */   
/*    */   private static cem a(cem ☃, eq.a a1, int i) {
/* 18 */     return new cev(☃, a1
/* 19 */         .a(i, 0, 0), a1
/* 20 */         .a(0, i, 0), a1
/* 21 */         .a(0, 0, i), a1
/* 22 */         .a(i + 1, ☃.a, ☃.a), a1
/* 23 */         .a(☃.b, i + 1, ☃.b), a1
/* 24 */         .a(☃.c, ☃.c, i + 1));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected DoubleList a(eq.a ☃) {
/* 30 */     if (☃ == this.c) {
/* 31 */       return this.d;
/*    */     }
/* 33 */     return this.b.a(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ceu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */