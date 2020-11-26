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
/*     */ public class akh
/*     */   extends ajo
/*     */   implements anj
/*     */ {
/*  39 */   private static final or<Byte> a = ou.a((Class)akh.class, ot.a);
/*     */ 
/*     */ 
/*     */   
/*     */   public akh(axy ☃) {
/*  44 */     super(aev.ao, ☃);
/*  45 */     a(0.7F, 1.9F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  50 */     this.by.a(1, new aht(this, 1.25D, 20, 10.0F));
/*  51 */     this.by.a(2, new aih(this, 1.0D, 1.0000001E-5F));
/*  52 */     this.by.a(3, new ahb(this, (Class)aog.class, 6.0F));
/*  53 */     this.by.a(4, new ahq(this));
/*     */     
/*  55 */     this.bz.a(1, new aio<>(this, (Class)afb.class, 10, true, false, amy.d));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  60 */     super.bZ();
/*     */     
/*  62 */     a(ank.a).a(4.0D);
/*  63 */     a(ank.d).a(0.20000000298023224D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  68 */     super.x_();
/*  69 */     this.ab.a(a, Byte.valueOf((byte)16));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  74 */     super.b(☃);
/*     */     
/*  76 */     ☃.a("Pumpkin", l());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/*  81 */     super.a(☃);
/*     */     
/*  83 */     if (☃.e("Pumpkin")) {
/*  84 */       a(☃.q("Pumpkin"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  90 */     super.k();
/*     */     
/*  92 */     if (!this.m.B) {
/*  93 */       int ☃ = xq.c(this.q);
/*  94 */       int i = xq.c(this.r);
/*  95 */       int j = xq.c(this.s);
/*     */       
/*  97 */       if (ap()) {
/*  98 */         a(aea.h, 1.0F);
/*     */       }
/*     */       
/* 101 */       if (this.m.d(new el(☃, 0, j)).c(new el(☃, i, j)) > 1.0F) {
/* 102 */         a(aea.c, 1.0F);
/*     */       }
/*     */       
/* 105 */       if (!this.m.X().b("mobGriefing")) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 110 */       blc blc = bct.cQ.p();
/* 111 */       for (int k = 0; k < 4; k++) {
/* 112 */         ☃ = xq.c(this.q + ((k % 2 * 2 - 1) * 0.25F));
/* 113 */         i = xq.c(this.r);
/* 114 */         j = xq.c(this.s + ((k / 2 % 2 * 2 - 1) * 0.25F));
/* 115 */         el el = new el(☃, i, j);
/* 116 */         if (this.m.a_(el).f() && this.m.d(el).c(el) < 0.8F && blc.a(this.m, el)) {
/* 117 */           this.m.a(el, blc);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 126 */     return ccl.H;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afa ☃, float f) {
/* 131 */     aox aox = new aox(this.m, this);
/* 132 */     double d1 = ☃.r + ☃.bF() - 1.100000023841858D;
/* 133 */     double d2 = ☃.q - this.q;
/* 134 */     double d3 = d1 - aox.r;
/* 135 */     double d4 = ☃.s - this.s;
/* 136 */     float f1 = xq.a(d2 * d2 + d4 * d4) * 0.2F;
/* 137 */     aox.c(d2, d3 + f1, d4, 1.6F, 12.0F);
/*     */     
/* 139 */     a(wj.jd, 1.0F, 1.0F / (ce().nextFloat() * 0.4F + 0.8F));
/* 140 */     this.m.a(aox);
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 145 */     return 1.7F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aog ☃, adk adk1) {
/* 150 */     ate ate = ☃.b(adk1);
/* 151 */     if (ate.b() == atf.bR && l() && 
/* 152 */       !this.m.B) {
/* 153 */       a(false);
/* 154 */       ate.a(1, ☃);
/*     */     } 
/*     */     
/* 157 */     return super.a(☃, adk1);
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 161 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x10) != 0);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 165 */     byte b = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 166 */     if (☃) {
/* 167 */       this.ab.b(a, Byte.valueOf((byte)(b | 0x10)));
/*     */     } else {
/* 169 */       this.ab.b(a, Byte.valueOf((byte)(b & 0xFFFFFFEF)));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi D() {
/* 176 */     return wj.ja;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi d(aea ☃) {
/* 182 */     return wj.jc;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected wi cs() {
/* 188 */     return wj.jb;
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {}
/*     */ }


/* Location:              F:\dw\server.jar!\akh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */