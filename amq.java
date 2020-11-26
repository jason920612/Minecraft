/*     */ import java.time.LocalDate;
/*     */ import java.time.temporal.ChronoField;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class amq
/*     */   extends ang
/*     */   implements anj
/*     */ {
/*  47 */   private static final or<Boolean> a = ou.a((Class)amq.class, ot.i);
/*     */   
/*  49 */   private final ahu<amq> b = new ahu<>(this, 1.0D, 20, 15.0F);
/*  50 */   private final ahe c = new ahe(this, this, 1.2D, false)
/*     */     {
/*     */       public void d() {
/*  53 */         super.d();
/*  54 */         this.d.s(false);
/*     */       }
/*     */ 
/*     */       
/*     */       public void c() {
/*  59 */         super.c();
/*  60 */         this.d.s(true);
/*     */       }
/*     */     };
/*     */   
/*     */   protected amq(aev<?> ☃, axy axy1) {
/*  65 */     super(☃, axy1);
/*     */     
/*  67 */     a(0.6F, 1.99F);
/*     */     
/*  69 */     dz();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  74 */     this.by.a(2, new ahx(this));
/*  75 */     this.by.a(3, new agl(this, 1.0D));
/*  76 */     this.by.a(3, new agd<>(this, akm.class, 6.0F, 1.0D, 1.2D));
/*  77 */     this.by.a(5, new aih(this, 1.0D));
/*  78 */     this.by.a(6, new ahb(this, (Class)aog.class, 8.0F));
/*  79 */     this.by.a(6, new ahq(this));
/*     */     
/*  81 */     this.bz.a(1, new ail(this, false, new Class[0]));
/*  82 */     this.bz.a(2, new aio<>(this, aog.class, true));
/*  83 */     this.bz.a(3, new aio<>(this, ajw.class, true));
/*  84 */     this.bz.a(3, new aio<>(this, (Class)akk.class, 10, true, false, akk.bC));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  89 */     super.bZ();
/*     */     
/*  91 */     a(ank.d).a(0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  96 */     super.x_();
/*     */     
/*  98 */     this.ab.a(a, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 103 */     a(l(), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   abstract wi l();
/*     */   
/*     */   public afd cA() {
/* 110 */     return afd.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 115 */     boolean ☃ = dq();
/* 116 */     if (☃) {
/* 117 */       ate ate = b(aew.f);
/* 118 */       if (!ate.a()) {
/* 119 */         if (ate.e()) {
/* 120 */           ate.b(ate.g() + this.T.nextInt(2));
/* 121 */           if (ate.g() >= ate.h()) {
/* 122 */             c(ate);
/* 123 */             a(aew.f, ate.a);
/*     */           } 
/*     */         } 
/*     */         
/* 127 */         ☃ = false;
/*     */       } 
/*     */       
/* 130 */       if (☃) {
/* 131 */         f(8);
/*     */       }
/*     */     } 
/*     */     
/* 135 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public void aH() {
/* 140 */     super.aH();
/*     */     
/* 142 */     if (bU() instanceof afg) {
/* 143 */       afg ☃ = (afg)bU();
/* 144 */       this.aQ = ☃.aQ;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adj ☃) {
/* 150 */     super.a(☃);
/*     */     
/* 152 */     a(aew.a, new ate(atf.g));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 158 */     afj1 = super.a(☃, afj1, gy1);
/*     */     
/* 160 */     a(☃);
/* 161 */     b(☃);
/* 162 */     dz();
/*     */     
/* 164 */     p((this.T.nextFloat() < 0.55F * ☃.d()));
/*     */     
/* 166 */     if (b(aew.f).a()) {
/* 167 */       LocalDate localDate = LocalDate.now();
/* 168 */       int i = localDate.get(ChronoField.DAY_OF_MONTH);
/* 169 */       int j = localDate.get(ChronoField.MONTH_OF_YEAR);
/*     */       
/* 171 */       if (j == 10 && i == 31 && this.T.nextFloat() < 0.25F) {
/*     */         
/* 173 */         a(aew.f, new ate((this.T.nextFloat() < 0.1F) ? bct.dj : bct.di));
/* 174 */         this.bB[aew.f.b()] = 0.0F;
/*     */       } 
/*     */     } 
/* 177 */     return afj1;
/*     */   }
/*     */   
/*     */   public void dz() {
/* 181 */     if (this.m == null || this.m.B) {
/*     */       return;
/*     */     }
/*     */     
/* 185 */     this.by.a(this.c);
/* 186 */     this.by.a(this.b);
/*     */     
/* 188 */     ate ☃ = cB();
/*     */     
/* 190 */     if (☃.b() == atf.g) {
/*     */       
/* 192 */       int i = 20;
/* 193 */       if (this.m.aj() != adi.d) {
/* 194 */         i = 40;
/*     */       }
/* 196 */       this.b.b(i);
/* 197 */       this.by.a(4, this.b);
/*     */     } else {
/* 199 */       this.by.a(4, this.c);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afa ☃, float f) {
/* 205 */     aok aok = a(f);
/*     */     
/* 207 */     double d1 = ☃.q - this.q;
/* 208 */     double d2 = (☃.bD()).b + (☃.I / 3.0F) - aok.r;
/* 209 */     double d3 = ☃.s - this.s;
/* 210 */     double d4 = xq.a(d1 * d1 + d3 * d3);
/* 211 */     aok.c(d1, d2 + d4 * 0.20000000298023224D, d3, 1.6F, (14 - this.m.aj().a() * 4));
/* 212 */     a(wj.iE, 1.0F, 1.0F / (ce().nextFloat() * 0.4F + 0.8F));
/* 213 */     this.m.a(aok);
/*     */   }
/*     */   
/*     */   protected aok a(float ☃) {
/* 217 */     aom aom = new aom(this.m, this);
/* 218 */     aom.a(this, ☃);
/* 219 */     return aom;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 224 */     super.a(☃);
/*     */     
/* 226 */     dz();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aew ☃, ate ate1) {
/* 231 */     super.a(☃, ate1);
/*     */     
/* 233 */     if (!this.m.B && ☃ == aew.a) {
/* 234 */       dz();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 240 */     return 1.74F;
/*     */   }
/*     */ 
/*     */   
/*     */   public double aI() {
/* 245 */     return -0.6D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void s(boolean ☃) {
/* 255 */     this.ab.b(a, Boolean.valueOf(☃));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */