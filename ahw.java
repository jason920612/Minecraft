/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahw
/*    */   extends agt
/*    */ {
/*    */   private final afg a;
/*    */   private ajf b;
/*    */   
/*    */   public ahw(afg ☃) {
/* 14 */     this.a = ☃;
/* 15 */     if (!(☃.t() instanceof aiv)) {
/* 16 */       throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 22 */     if (this.a.m.L()) {
/* 23 */       return false;
/*    */     }
/*    */     
/* 26 */     el ☃ = new el(this.a);
/*    */     
/* 28 */     ajg ajg = this.a.m.af().a(☃, 16);
/* 29 */     if (ajg == null) {
/* 30 */       return false;
/*    */     }
/* 32 */     this.b = ajg.b(☃);
/* 33 */     if (this.b == null) {
/* 34 */       return false;
/*    */     }
/* 36 */     return (this.b.b(☃) < 2.25D);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 41 */     if (this.a.m.L()) {
/* 42 */       return false;
/*    */     }
/* 44 */     return (!this.b.i() && this.b.c(new el(this.a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 49 */     ((aiv)this.a.t()).a(false);
/* 50 */     ((aiv)this.a.t()).b(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 55 */     ((aiv)this.a.t()).a(true);
/* 56 */     ((aiv)this.a.t()).b(true);
/* 57 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 62 */     this.b.b();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ahw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */