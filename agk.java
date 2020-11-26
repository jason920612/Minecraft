/*    */ import java.util.function.Predicate;
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
/*    */ 
/*    */ public class agk
/*    */   extends agt
/*    */ {
/* 21 */   private static final Predicate<blc> a = blp.a(bct.aR);
/*    */   
/*    */   private final afb b;
/*    */   private final axy c;
/*    */   private int d;
/*    */   
/*    */   public agk(afb ☃) {
/* 28 */     this.b = ☃;
/* 29 */     this.c = ☃.m;
/* 30 */     a(7);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 35 */     if (this.b.ce().nextInt(this.b.y_() ? 50 : 1000) != 0) {
/* 36 */       return false;
/*    */     }
/*    */     
/* 39 */     el ☃ = new el(this.b.q, this.b.r, this.b.s);
/* 40 */     if (a.test(this.c.a_(☃))) {
/* 41 */       return true;
/*    */     }
/* 43 */     if (this.c.a_(☃.b()).c() == bct.i) {
/* 44 */       return true;
/*    */     }
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 51 */     this.d = 40;
/* 52 */     this.c.a(this.b, (byte)10);
/* 53 */     this.b.t().q();
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 58 */     this.d = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 63 */     return (this.d > 0);
/*    */   }
/*    */   
/*    */   public int g() {
/* 67 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 72 */     this.d = Math.max(0, this.d - 1);
/* 73 */     if (this.d != 4) {
/*    */       return;
/*    */     }
/*    */     
/* 77 */     el ☃ = new el(this.b.q, this.b.r, this.b.s);
/*    */     
/* 79 */     if (a.test(this.c.a_(☃))) {
/* 80 */       if (this.c.X().b("mobGriefing")) {
/* 81 */         this.c.a(☃, false);
/*    */       }
/* 83 */       this.b.x();
/*    */     } else {
/* 85 */       el el = ☃.b();
/* 86 */       if (this.c.a_(el).c() == bct.i) {
/* 87 */         if (this.c.X().b("mobGriefing")) {
/* 88 */           this.c.b(2001, el, bcs.l(bct.i.p()));
/* 89 */           this.c.a(el, bct.j.p(), 2);
/*    */         } 
/* 91 */         this.b.x();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\agk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */