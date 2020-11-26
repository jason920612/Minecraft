/*     */ import java.util.Random;
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
/*     */ public class ahv
/*     */   extends ahh
/*     */ {
/*     */   private final bcs f;
/*     */   private final afb g;
/*     */   private int h;
/*     */   
/*     */   public ahv(bcs ☃, afg afg1, double d, int i) {
/*  29 */     super(afg1, d, 24, i);
/*  30 */     this.f = ☃;
/*  31 */     this.g = afg1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  36 */     if (!this.g.m.X().b("mobGriefing")) {
/*  37 */       return false;
/*     */     }
/*  39 */     if (this.g.ce().nextInt(20) != 0) {
/*  40 */       return false;
/*     */     }
/*  42 */     return super.a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int a(afg ☃) {
/*  47 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  52 */     return super.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  57 */     super.d();
/*  58 */     this.g.M = 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  63 */     super.c();
/*  64 */     this.h = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axz ☃, el el1) {}
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1) {}
/*     */ 
/*     */   
/*     */   public void e() {
/*  75 */     super.e();
/*  76 */     axy ☃ = this.g.m;
/*  77 */     el el1 = new el(this.g);
/*     */     
/*  79 */     el el2 = a(el1, ☃);
/*     */     
/*  81 */     Random random = this.g.ce();
/*  82 */     if (k() && el2 != null) {
/*  83 */       if (this.h > 0) {
/*  84 */         this.g.u = 0.3D;
/*  85 */         if (!☃.B) {
/*  86 */           double d = 0.08D;
/*  87 */           ((td)☃).a(new fj(fm.C, new ate(atf.aW)), el2
/*     */               
/*  89 */               .o() + 0.5D, el2
/*  90 */               .p() + 0.7D, el2
/*  91 */               .q() + 0.5D, 3, (random
/*     */               
/*  93 */               .nextFloat() - 0.5D) * 0.08D, (random
/*  94 */               .nextFloat() - 0.5D) * 0.08D, (random
/*  95 */               .nextFloat() - 0.5D) * 0.08D, 0.15000000596046448D);
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 101 */       if (this.h % 2 == 0) {
/* 102 */         this.g.u = -0.3D;
/*     */         
/* 104 */         if (this.h % 6 == 0) {
/* 105 */           a(☃, this.d);
/*     */         }
/*     */       } 
/*     */       
/* 109 */       if (this.h > 60) {
/* 110 */         ☃.g(el2);
/* 111 */         if (!☃.B) {
/* 112 */           for (int i = 0; i < 20; i++) {
/* 113 */             double d1 = random.nextGaussian() * 0.02D;
/* 114 */             double d2 = random.nextGaussian() * 0.02D;
/* 115 */             double d3 = random.nextGaussian() * 0.02D;
/* 116 */             ((td)☃).a(fm.J, el2.o() + 0.5D, el2.p(), el2.q() + 0.5D, 1, d1, d2, d3, 0.15000000596046448D);
/*     */           } 
/* 118 */           a(☃, this.d);
/*     */         } 
/*     */       } 
/* 121 */       this.h++;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private el a(el ☃, axk axk1) {
/* 127 */     if (axk1.a_(☃).c() == this.f) {
/* 128 */       return ☃;
/*     */     }
/* 130 */     el[] arrayOfEl = { ☃.b(), ☃.e(), ☃.f(), ☃.c(), ☃.d(), ☃.b().b() };
/* 131 */     for (el el1 : arrayOfEl) {
/* 132 */       if (axk1.a_(el1).c() == this.f) {
/* 133 */         return el1;
/*     */       }
/*     */     } 
/* 136 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(ayc ☃, el el1) {
/* 141 */     bcs bcs1 = ☃.a_(el1).c();
/* 142 */     return (bcs1 == this.f && ☃.a_(el1.a()).f() && ☃.a_(el1.b(2)).f());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ahv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */