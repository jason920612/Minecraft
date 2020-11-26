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
/*     */ public class anq
/*     */   extends ang
/*     */ {
/*  41 */   private static final or<Byte> a = ou.a((Class)anq.class, ot.a);
/*     */   
/*     */   protected anq(aev<?> ☃, axy axy1) {
/*  44 */     super(☃, axy1);
/*  45 */     a(1.4F, 0.9F);
/*     */   }
/*     */   
/*     */   public anq(axy ☃) {
/*  49 */     this(aev.ar, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  54 */     this.by.a(1, new agm(this));
/*     */     
/*  56 */     this.by.a(3, new agz(this, 0.4F));
/*  57 */     this.by.a(4, new a(this));
/*     */     
/*  59 */     this.by.a(5, new aih(this, 0.8D));
/*  60 */     this.by.a(6, new ahb(this, (Class)aog.class, 8.0F));
/*  61 */     this.by.a(6, new ahq(this));
/*     */     
/*  63 */     this.bz.a(1, new ail(this, false, new Class[0]));
/*  64 */     this.bz.a(2, new c<>(this, aog.class));
/*  65 */     this.bz.a(3, new c<>(this, ajw.class));
/*     */   }
/*     */ 
/*     */   
/*     */   public double aJ() {
/*  70 */     return (this.I * 0.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected aiw b(axy ☃) {
/*  75 */     return new aiy(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  80 */     super.x_();
/*     */     
/*  82 */     this.ab.a(a, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  87 */     super.R_();
/*     */     
/*  89 */     if (!this.m.B)
/*     */     {
/*     */       
/*  92 */       a(this.B);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  98 */     super.bZ();
/*     */     
/* 100 */     a(ank.a).a(16.0D);
/* 101 */     a(ank.d).a(0.30000001192092896D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 106 */     return wj.jh;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 111 */     return wj.jj;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 116 */     return wj.ji;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 121 */     a(wj.jk, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 127 */     return ccl.y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean z_() {
/* 136 */     return l();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void bh() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public afd cA() {
/* 146 */     return afd.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(aek ☃) {
/* 151 */     if (☃.a() == aem.s) {
/* 152 */       return false;
/*     */     }
/* 154 */     return super.d(☃);
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 158 */     return ((((Byte)this.ab.<Byte>a(a)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 162 */     byte b = ((Byte)this.ab.<Byte>a(a)).byteValue();
/* 163 */     if (☃) {
/* 164 */       b = (byte)(b | 0x1);
/*     */     } else {
/* 166 */       b = (byte)(b & 0xFFFFFFFE);
/*     */     } 
/* 168 */     this.ab.b(a, Byte.valueOf(b));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 174 */     afj1 = super.a(☃, afj1, gy1);
/*     */     
/* 176 */     if (this.m.s.nextInt(100) == 0) {
/* 177 */       ann ann = new ann(this.m);
/* 178 */       ann.b(this.q, this.r, this.s, this.w, 0.0F);
/* 179 */       ann.a(☃, (afj)null, (gy)null);
/* 180 */       this.m.a(ann);
/* 181 */       ann.m(this);
/*     */     } 
/*     */     
/* 184 */     if (afj1 == null) {
/* 185 */       afj1 = new b();
/*     */       
/* 187 */       if (this.m.aj() == adi.d && this.m.s.nextFloat() < 0.1F * ☃.d()) {
/* 188 */         ((b)afj1).a(this.m.s);
/*     */       }
/*     */     } 
/* 191 */     if (afj1 instanceof b) {
/* 192 */       aej aej = ((b)afj1).a;
/* 193 */       if (aej != null) {
/* 194 */         c(new aek(aej, 2147483647));
/*     */       }
/*     */     } 
/*     */     
/* 198 */     return afj1;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 203 */     return 0.65F;
/*     */   }
/*     */   
/*     */   public static class b
/*     */     implements afj
/*     */   {
/*     */     public aej a;
/*     */     
/*     */     public void a(Random ☃) {
/* 212 */       int i = ☃.nextInt(5);
/* 213 */       if (i <= 1) {
/* 214 */         this.a = aem.a;
/* 215 */       } else if (i <= 2) {
/* 216 */         this.a = aem.e;
/* 217 */       } else if (i <= 3) {
/* 218 */         this.a = aem.j;
/* 219 */       } else if (i <= 4) {
/* 220 */         this.a = aem.n;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends ahe {
/*     */     public a(anq ☃) {
/* 227 */       super(☃, 1.0D, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 232 */       float ☃ = this.a.az();
/* 233 */       if (☃ >= 0.5F && this.a.ce().nextInt(100) == 0) {
/* 234 */         this.a.e((afa)null);
/* 235 */         return false;
/*     */       } 
/* 237 */       return super.b();
/*     */     }
/*     */ 
/*     */     
/*     */     protected double a(afa ☃) {
/* 242 */       return (4.0F + ☃.H);
/*     */     }
/*     */   }
/*     */   
/*     */   static class c<T extends afa> extends aio<T> {
/*     */     public c(anq ☃, Class<T> clazz) {
/* 248 */       super(☃, clazz, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 253 */       float ☃ = this.e.az();
/* 254 */       if (☃ >= 0.5F) {
/* 255 */         return false;
/*     */       }
/*     */       
/* 258 */       return super.a();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */