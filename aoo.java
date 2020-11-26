/*     */ import java.util.List;
/*     */ import java.util.UUID;
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
/*     */ public class aoo
/*     */   extends aer
/*     */ {
/*     */   private int a;
/*     */   private boolean b;
/*  27 */   private int c = 22;
/*     */   
/*     */   private boolean d;
/*     */   private afa e;
/*     */   private UUID f;
/*     */   
/*     */   public aoo(axy ☃) {
/*  34 */     super(aev.u, ☃);
/*  35 */     a(0.5F, 0.8F);
/*     */   }
/*     */   
/*     */   public aoo(axy ☃, double d1, double d2, double d3, float f, int i, afa afa1) {
/*  39 */     this(☃);
/*  40 */     this.a = i;
/*  41 */     a(afa1);
/*  42 */     this.w = f * 57.295776F;
/*  43 */     b(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {}
/*     */ 
/*     */   
/*     */   public void a(@Nullable afa ☃) {
/*  51 */     this.e = ☃;
/*  52 */     this.f = (☃ == null) ? null : ☃.bt();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa f() {
/*  57 */     if (this.e == null && this.f != null && this.m instanceof td) {
/*  58 */       aer ☃ = ((td)this.m).a(this.f);
/*  59 */       if (☃ instanceof afa) {
/*  60 */         this.e = (afa)☃;
/*     */       }
/*     */     } 
/*     */     
/*  64 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  69 */     this.a = ☃.h("Warmup");
/*  70 */     if (☃.b("OwnerUUID")) {
/*  71 */       this.f = ☃.a("OwnerUUID");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/*  77 */     ☃.b("Warmup", this.a);
/*     */     
/*  79 */     if (this.f != null) {
/*  80 */       ☃.a("OwnerUUID", this.f);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  86 */     super.R_();
/*     */     
/*  88 */     if (this.m.B) {
/*  89 */       if (this.d) {
/*  90 */         this.c--;
/*  91 */         if (this.c == 14) {
/*  92 */           for (int ☃ = 0; ☃ < 12; ☃++) {
/*  93 */             double d1 = this.q + (this.T.nextDouble() * 2.0D - 1.0D) * this.H * 0.5D;
/*  94 */             double d2 = this.r + 0.05D + this.T.nextDouble();
/*  95 */             double d3 = this.s + (this.T.nextDouble() * 2.0D - 1.0D) * this.H * 0.5D;
/*  96 */             double d4 = (this.T.nextDouble() * 2.0D - 1.0D) * 0.3D;
/*  97 */             double d5 = 0.3D + this.T.nextDouble() * 0.3D;
/*  98 */             double d6 = (this.T.nextDouble() * 2.0D - 1.0D) * 0.3D;
/*  99 */             this.m.a(fm.h, d1, d2 + 1.0D, d3, d4, d5, d6);
/*     */           }
/*     */         
/*     */         }
/*     */       } 
/* 104 */     } else if (--this.a < 0) {
/* 105 */       if (this.a == -8) {
/*     */         
/* 107 */         List<afa> ☃ = this.m.a(afa.class, bD().c(0.2D, 0.0D, 0.2D));
/* 108 */         for (afa afa1 : ☃) {
/* 109 */           c(afa1);
/*     */         }
/*     */       } 
/* 112 */       if (!this.b) {
/* 113 */         this.m.a(this, (byte)4);
/* 114 */         this.b = true;
/*     */       } 
/* 116 */       if (--this.c < 0) {
/* 117 */         V();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(afa ☃) {
/* 124 */     afa afa1 = f();
/* 125 */     if (!☃.aF() || ☃.bl() || ☃ == afa1) {
/*     */       return;
/*     */     }
/* 128 */     if (afa1 == null) {
/* 129 */       ☃.a(aea.o, 6.0F);
/*     */     } else {
/* 131 */       if (afa1.r(☃)) {
/*     */         return;
/*     */       }
/* 134 */       ☃.a(aea.c(this, afa1), 6.0F);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aoo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */