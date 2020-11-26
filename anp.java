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
/*     */ public abstract class anp
/*     */   extends amp
/*     */ {
/*  19 */   private static final or<Byte> c = ou.a((Class)anp.class, ot.a);
/*     */   
/*     */   protected int b;
/*  22 */   private a bC = a.a;
/*     */   
/*     */   protected anp(aev<?> ☃, axy axy1) {
/*  25 */     super(☃, axy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  30 */     super.x_();
/*     */     
/*  32 */     this.ab.a(c, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/*  37 */     super.a(☃);
/*     */     
/*  39 */     this.b = ☃.h("SpellTicks");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  44 */     super.b(☃);
/*     */     
/*  46 */     ☃.b("SpellTicks", this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean dA() {
/*  58 */     if (this.m.B) {
/*  59 */       return (((Byte)this.ab.<Byte>a(c)).byteValue() > 0);
/*     */     }
/*  61 */     return (this.b > 0);
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/*  65 */     this.bC = ☃;
/*  66 */     this.ab.b(c, Byte.valueOf((byte)a.a(☃)));
/*     */   }
/*     */   
/*     */   protected a dB() {
/*  70 */     if (!this.m.B) {
/*  71 */       return this.bC;
/*     */     }
/*  73 */     return a.a(((Byte)this.ab.<Byte>a(c)).byteValue());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/*  78 */     super.J();
/*     */     
/*  80 */     if (this.b > 0) {
/*  81 */       this.b--;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  87 */     super.R_();
/*     */     
/*  89 */     if (this.m.B && dA()) {
/*  90 */       a ☃ = dB();
/*  91 */       double d1 = a.b(☃)[0];
/*  92 */       double d2 = a.b(☃)[1];
/*  93 */       double d3 = a.b(☃)[2];
/*     */ 
/*     */       
/*  96 */       float f1 = this.aQ * 0.017453292F + xq.b(this.U * 0.6662F) * 0.25F;
/*  97 */       float f2 = xq.b(f1);
/*  98 */       float f3 = xq.a(f1);
/*     */       
/* 100 */       this.m.a(fm.s, this.q + f2 * 0.6D, this.r + 1.8D, this.s + f3 * 0.6D, d1, d2, d3);
/* 101 */       this.m.a(fm.s, this.q - f2 * 0.6D, this.r + 1.8D, this.s - f3 * 0.6D, d1, d2, d3);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected int dC() {
/* 106 */     return this.b;
/*     */   }
/*     */   
/*     */   protected abstract wi dz();
/*     */   
/*     */   public class b extends agt {
/*     */     public b(anp ☃) {
/* 113 */       a(3);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 118 */       return (this.b.dC() > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 123 */       super.c();
/* 124 */       anp.a(this.b).q();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 129 */       super.d();
/* 130 */       this.b.a(anp.a.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 135 */       if (this.b.v() != null)
/* 136 */         this.b.p().a(this.b.v(), this.b.L(), this.b.K()); 
/*     */     }
/*     */   }
/*     */   
/*     */   public abstract class c extends agt {
/*     */     protected int b;
/*     */     protected int c;
/*     */     
/*     */     protected c(anp ☃) {}
/*     */     
/*     */     public boolean a() {
/* 147 */       if (this.d.v() == null) {
/* 148 */         return false;
/*     */       }
/* 150 */       if (this.d.dA())
/*     */       {
/* 152 */         return false;
/*     */       }
/* 154 */       if (this.d.U < this.c) {
/* 155 */         return false;
/*     */       }
/* 157 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 162 */       return (this.d.v() != null && this.b > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 167 */       this.b = m();
/* 168 */       this.d.b = g();
/* 169 */       this.c = this.d.U + i();
/* 170 */       wi ☃ = k();
/* 171 */       if (☃ != null) {
/* 172 */         this.d.a(☃, 1.0F, 1.0F);
/*     */       }
/* 174 */       this.d.a(l());
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 179 */       this.b--;
/* 180 */       if (this.b == 0) {
/* 181 */         j();
/* 182 */         this.d.a(this.d.dz(), 1.0F, 1.0F);
/*     */       } 
/*     */     }
/*     */     
/*     */     protected abstract void j();
/*     */     
/*     */     protected int m() {
/* 189 */       return 20;
/*     */     }
/*     */     
/*     */     protected abstract int g();
/*     */     
/*     */     protected abstract int i();
/*     */     
/*     */     @Nullable
/*     */     protected abstract wi k();
/*     */     
/*     */     protected abstract anp.a l();
/*     */   }
/*     */   
/*     */   public enum a {
/* 203 */     a(0, 0.0D, 0.0D, 0.0D),
/* 204 */     b(1, 0.7D, 0.7D, 0.8D),
/* 205 */     c(2, 0.4D, 0.3D, 0.35D),
/* 206 */     d(3, 0.7D, 0.5D, 0.2D),
/* 207 */     e(4, 0.3D, 0.3D, 0.8D),
/* 208 */     f(5, 0.1D, 0.1D, 0.2D);
/*     */     
/*     */     private final int g;
/*     */     
/*     */     private final double[] h;
/*     */     
/*     */     a(int ☃, double d1, double d2, double d3) {
/* 215 */       this.g = ☃;
/* 216 */       this.h = new double[] { d1, d2, d3 };
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 220 */       for (a a1 : values()) {
/* 221 */         if (☃ == a1.g) {
/* 222 */           return a1;
/*     */         }
/*     */       } 
/* 225 */       return a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\anp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */