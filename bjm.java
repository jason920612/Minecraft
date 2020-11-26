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
/*     */ public class bjm
/*     */   extends bji
/*     */ {
/*     */   private boolean a;
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private final axh h;
/*     */   
/*     */   public bjm() {
/*  27 */     super(bjj.v);
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
/* 153 */     this.h = new axh(this)
/*     */       {
/*     */         public void a(String ☃) {
/* 156 */           super.a(☃);
/* 157 */           this.a.g();
/*     */         }
/*     */ 
/*     */         
/*     */         public td d() {
/* 162 */           return (td)this.a.c_;
/*     */         }
/*     */ 
/*     */         
/*     */         public void e() {
/* 167 */           blc ☃ = this.a.c_.a_(this.a.d_);
/* 168 */           d().a(this.a.d_, ☃, ☃, 3);
/*     */         }
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
/*     */         public bu h() {
/* 185 */           return new bu(this, new cee(this.a.d_.o() + 0.5D, this.a.d_.p() + 0.5D, this.a.d_.q() + 0.5D), ced.a, d(), 2, l().getString(), l(), d().z(), null);
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public gy a(gy ☃) {
/*     */     super.a(☃);
/*     */     this.h.a(☃);
/*     */     ☃.a("powered", d());
/*     */     ☃.a("conditionMet", f());
/*     */     ☃.a("auto", e());
/*     */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(gy ☃) {
/*     */     super.b(☃);
/*     */     this.h.b(☃);
/*     */     this.a = ☃.q("powered");
/*     */     this.f = ☃.q("conditionMet");
/*     */     b(☃.q("auto"));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ji Z_() {
/*     */     if (i()) {
/*     */       c(false);
/*     */       gy ☃ = a(new gy());
/*     */       return new ji(this.d_, 2, ☃);
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   public boolean B() {
/*     */     return true;
/*     */   }
/*     */   
/*     */   public axh c() {
/*     */     return this.h;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*     */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*     */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean e() {
/*     */     return this.e;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/*     */     boolean bool = this.e;
/*     */     this.e = ☃;
/*     */     if (!bool && ☃ && !this.a && this.c_ != null && j() != a.a) {
/*     */       bcs bcs = w().c();
/*     */       if (bcs instanceof bdm) {
/*     */         h();
/*     */         this.c_.J().a(this.d_, bcs, bcs.a(this.c_));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean f() {
/*     */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean h() {
/*     */     this.f = true;
/*     */     if (k()) {
/*     */       el ☃ = this.d_.a(((eq)this.c_.a_(this.d_).c(bdm.a)).d());
/*     */       if (this.c_.a_(☃).c() instanceof bdm) {
/*     */         bji bji1 = this.c_.f(☃);
/*     */         this.f = (bji1 instanceof bjm && ((bjm)bji1).c().i() > 0);
/*     */       } else {
/*     */         this.f = false;
/*     */       } 
/*     */     } 
/*     */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean i() {
/*     */     return this.g;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/*     */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public a j() {
/*     */     bcs ☃ = w().c();
/*     */     if (☃ == bct.et)
/*     */       return a.c; 
/*     */     if (☃ == bct.ih)
/*     */       return a.b; 
/*     */     if (☃ == bct.ii)
/*     */       return a.a; 
/*     */     return a.c;
/*     */   }
/*     */   
/*     */   public boolean k() {
/*     */     blc ☃ = this.c_.a_(v());
/*     */     if (☃.c() instanceof bdm)
/*     */       return ((Boolean)☃.c(bdm.b)).booleanValue(); 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public void z() {
/*     */     A();
/*     */     super.z();
/*     */   }
/*     */   
/*     */   public enum a {
/*     */     a, b, c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */