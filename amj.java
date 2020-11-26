/*     */ import java.util.List;
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
/*     */ public class amj
/*     */   extends ami
/*     */ {
/*     */   private int b;
/*     */   public long a;
/*     */   private int c;
/*     */   private final boolean d;
/*     */   @Nullable
/*     */   private tf e;
/*     */   
/*     */   public amj(axy ☃, double d1, double d2, double d3, boolean bool) {
/*  32 */     super(aev.aN, ☃);
/*  33 */     b(d1, d2, d3, 0.0F, 0.0F);
/*  34 */     this.b = 2;
/*  35 */     this.a = this.T.nextLong();
/*  36 */     this.c = this.T.nextInt(3) + 1;
/*  37 */     this.d = bool;
/*     */     
/*  39 */     adi adi = ☃.aj();
/*  40 */     if (adi == adi.c || adi == adi.d) {
/*  41 */       a(4);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public wk bV() {
/*  47 */     return wk.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(@Nullable tf ☃) {
/*  56 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  61 */     super.R_();
/*     */     
/*  63 */     if (this.b == 2) {
/*  64 */       this.m.a((aog)null, this.q, this.r, this.s, wj.eR, wk.d, 10000.0F, 0.8F + this.T.nextFloat() * 0.2F);
/*  65 */       this.m.a((aog)null, this.q, this.r, this.s, wj.eQ, wk.d, 2.0F, 0.5F + this.T.nextFloat() * 0.2F);
/*     */     } 
/*     */     
/*  68 */     this.b--;
/*  69 */     if (this.b < 0) {
/*  70 */       if (this.c == 0) {
/*  71 */         V();
/*  72 */       } else if (this.b < -this.T.nextInt(10)) {
/*  73 */         this.c--;
/*  74 */         this.b = 1;
/*  75 */         this.a = this.T.nextLong();
/*  76 */         a(0);
/*     */       } 
/*     */     }
/*     */     
/*  80 */     if (this.b >= 0) {
/*  81 */       if (this.m.B) {
/*  82 */         this.m.d(2);
/*  83 */       } else if (!this.d) {
/*  84 */         double ☃ = 3.0D;
/*  85 */         List<aer> list = this.m.a(this, new cea(this.q - 3.0D, this.r - 3.0D, this.s - 3.0D, this.q + 3.0D, this.r + 6.0D + 3.0D, this.s + 3.0D));
/*  86 */         for (int i = 0; i < list.size(); i++) {
/*  87 */           aer aer = list.get(i);
/*  88 */           aer.a(this);
/*     */         } 
/*  90 */         if (this.e != null) {
/*  91 */           p.E.a(this.e, list);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/*  98 */     if (this.d || this.m.B || !this.m.X().b("doFireTick")) {
/*     */       return;
/*     */     }
/*     */     
/* 102 */     blc blc = bct.ch.p();
/* 103 */     el el = new el(this);
/*     */     
/* 105 */     if (this.m.e(el, 10) && 
/* 106 */       this.m.a_(el).f() && blc.a(this.m, el)) {
/* 107 */       this.m.a(el, blc);
/*     */     }
/*     */ 
/*     */     
/* 111 */     for (int i = 0; i < ☃; i++) {
/* 112 */       el el1 = el.a(this.T.nextInt(3) - 1, this.T.nextInt(3) - 1, this.T.nextInt(3) - 1);
/* 113 */       if (this.m.a_(el1).f() && blc.a(this.m, el1))
/* 114 */         this.m.a(el1, blc); 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void x_() {}
/*     */   
/*     */   protected void a(gy ☃) {}
/*     */   
/*     */   protected void b(gy ☃) {}
/*     */ }


/* Location:              F:\dw\server.jar!\amj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */