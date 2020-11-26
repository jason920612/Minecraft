/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ww
/*    */ {
/*  9 */   private static xa<byv> c = new xa<>(☃ -> false, ☃ -> null, "", false, "");
/*    */ 
/*    */   
/*    */   private static int d;
/*    */ 
/*    */   
/* 15 */   public static final wz<byv> a = a("water");
/* 16 */   public static final wz<byv> b = a("lava");
/*    */   
/*    */   public static void a(xa<byv> ☃) {
/* 19 */     c = ☃;
/* 20 */     d++;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static wz<byv> a(String ☃) {
/* 28 */     return new a(new pc(☃));
/*    */   }
/*    */   
/*    */   public static class a extends wz<byv> {
/* 32 */     private int a = -1;
/*    */     private wz<byv> b;
/*    */     
/*    */     public a(pc ☃) {
/* 36 */       super(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(byv ☃) {
/* 41 */       if (this.a != ww.b()) {
/* 42 */         this.b = ww.c().b(c());
/* 43 */         this.a = ww.b();
/*    */       } 
/* 45 */       return this.b.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public Collection<byv> a() {
/* 50 */       if (this.a != ww.b()) {
/* 51 */         this.b = ww.c().b(c());
/* 52 */         this.a = ww.b();
/*    */       } 
/* 54 */       return this.b.a();
/*    */     }
/*    */ 
/*    */     
/*    */     public Collection<wz.b<byv>> b() {
/* 59 */       if (this.a != ww.b()) {
/* 60 */         this.b = ww.c().b(c());
/* 61 */         this.a = ww.b();
/*    */       } 
/* 63 */       return this.b.b();
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ww.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */