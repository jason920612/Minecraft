/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ail
/*    */   extends ais
/*    */ {
/*    */   private final boolean a;
/*    */   private int b;
/*    */   private final Class<?>[] c;
/*    */   
/*    */   public ail(afg ☃, boolean bool, Class<?>... arrayOfClass) {
/* 19 */     super(☃, true);
/* 20 */     this.a = bool;
/* 21 */     this.c = arrayOfClass;
/* 22 */     a(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     int ☃ = this.e.cg();
/* 28 */     afa afa = this.e.cf();
/* 29 */     return (☃ != this.b && afa != null && a(afa, false));
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 34 */     this.e.e(this.e.cf());
/* 35 */     this.g = this.e.v();
/* 36 */     this.b = this.e.cg();
/* 37 */     this.h = 300;
/*    */     
/* 39 */     if (this.a) {
/* 40 */       g();
/*    */     }
/*    */     
/* 43 */     super.c();
/*    */   }
/*    */   
/*    */   protected void g() {
/* 47 */     double ☃ = i();
/*    */     
/* 49 */     List<afg> list = (List)this.e.m.a(this.e.getClass(), (new cea(this.e.q, this.e.r, this.e.s, this.e.q + 1.0D, this.e.r + 1.0D, this.e.s + 1.0D)).c(☃, 10.0D, ☃));
/* 50 */     for (afg afg : list) {
/* 51 */       if (this.e == afg) {
/*    */         continue;
/*    */       }
/* 54 */       if (afg.v() != null) {
/*    */         continue;
/*    */       }
/* 57 */       if (this.e instanceof afl && ((afl)this.e).dB() != ((afl)afg).dB()) {
/*    */         continue;
/*    */       }
/* 60 */       if (afg.r(this.e.cf())) {
/*    */         continue;
/*    */       }
/* 63 */       boolean bool = false;
/* 64 */       for (Class<?> clazz : this.c) {
/* 65 */         if (afg.getClass() == clazz) {
/* 66 */           bool = true;
/*    */           break;
/*    */         } 
/*    */       } 
/* 70 */       if (bool) {
/*    */         continue;
/*    */       }
/*    */       
/* 74 */       a(afg, this.e.cf());
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void a(afg ☃, afa afa1) {
/* 79 */     ☃.e(afa1);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ail.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */