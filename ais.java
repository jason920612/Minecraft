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
/*     */ public abstract class ais
/*     */   extends agt
/*     */ {
/*     */   protected final afg e;
/*     */   protected boolean f;
/*     */   private final boolean a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   protected afa g;
/*  35 */   protected int h = 60;
/*     */   
/*     */   public ais(afg ☃, boolean bool) {
/*  38 */     this(☃, bool, false);
/*     */   }
/*     */   
/*     */   public ais(afg ☃, boolean bool1, boolean bool2) {
/*  42 */     this.e = ☃;
/*  43 */     this.f = bool1;
/*  44 */     this.a = bool2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  49 */     afa ☃ = this.e.v();
/*  50 */     if (☃ == null) {
/*  51 */       ☃ = this.g;
/*     */     }
/*  53 */     if (☃ == null) {
/*  54 */       return false;
/*     */     }
/*  56 */     if (!☃.aF()) {
/*  57 */       return false;
/*     */     }
/*     */     
/*  60 */     cfe cfe1 = this.e.be();
/*  61 */     cfe cfe2 = ☃.be();
/*  62 */     if (cfe1 != null && cfe2 == cfe1) {
/*  63 */       return false;
/*     */     }
/*     */     
/*  66 */     double d = i();
/*  67 */     if (this.e.h(☃) > d * d) {
/*  68 */       return false;
/*     */     }
/*  70 */     if (this.f) {
/*  71 */       if (this.e.u().a(☃)) {
/*  72 */         this.d = 0;
/*     */       }
/*  74 */       else if (++this.d > this.h) {
/*  75 */         return false;
/*     */       } 
/*     */     }
/*     */     
/*  79 */     if (☃ instanceof aog && 
/*  80 */       ((aog)☃).bV.a) {
/*  81 */       return false;
/*     */     }
/*     */     
/*  84 */     this.e.e(☃);
/*  85 */     return true;
/*     */   }
/*     */   
/*     */   protected double i() {
/*  89 */     afn ☃ = this.e.a(ank.b);
/*  90 */     return (☃ == null) ? 16.0D : ☃.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  95 */     this.b = 0;
/*  96 */     this.c = 0;
/*  97 */     this.d = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 102 */     this.e.e((afa)null);
/* 103 */     this.g = null;
/*     */   }
/*     */   
/*     */   public static boolean a(afb ☃, @Nullable afa afa1, boolean bool1, boolean bool2) {
/* 107 */     if (afa1 == null) {
/* 108 */       return false;
/*     */     }
/* 110 */     if (afa1 == ☃) {
/* 111 */       return false;
/*     */     }
/* 113 */     if (!afa1.aF()) {
/* 114 */       return false;
/*     */     }
/* 116 */     if (!☃.b((Class)afa1.getClass())) {
/* 117 */       return false;
/*     */     }
/*     */     
/* 120 */     if (☃.r(afa1)) {
/* 121 */       return false;
/*     */     }
/*     */     
/* 124 */     if (☃ instanceof aff && ((aff)☃).C_() != null) {
/* 125 */       if (afa1 instanceof aff && ((aff)☃).C_().equals(((aff)afa1).C_()))
/*     */       {
/* 127 */         return false;
/*     */       }
/*     */       
/* 130 */       if (afa1 == ((aff)☃).D_())
/*     */       {
/* 132 */         return false;
/*     */       }
/* 134 */     } else if (afa1 instanceof aog && 
/* 135 */       !bool1 && ((aog)afa1).bV.a) {
/* 136 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 140 */     if (bool2 && !☃.u().a(afa1)) {
/* 141 */       return false;
/*     */     }
/*     */     
/* 144 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(@Nullable afa ☃, boolean bool) {
/* 148 */     if (!a(this.e, ☃, bool, this.f)) {
/* 149 */       return false;
/*     */     }
/*     */     
/* 152 */     if (!this.e.f(new el(☃))) {
/* 153 */       return false;
/*     */     }
/*     */     
/* 156 */     if (this.a) {
/* 157 */       if (--this.c <= 0) {
/* 158 */         this.b = 0;
/*     */       }
/* 160 */       if (this.b == 0) {
/* 161 */         this.b = a(☃) ? 1 : 2;
/*     */       }
/* 163 */       if (this.b == 2) {
/* 164 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 168 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(afa ☃) {
/* 172 */     this.c = 10 + this.e.ce().nextInt(5);
/* 173 */     cbe cbe = this.e.t().a(☃);
/* 174 */     if (cbe == null) {
/* 175 */       return false;
/*     */     }
/* 177 */     cbc cbc = cbe.c();
/* 178 */     if (cbc == null) {
/* 179 */       return false;
/*     */     }
/* 181 */     int i = cbc.a - xq.c(☃.q);
/* 182 */     int j = cbc.c - xq.c(☃.s);
/* 183 */     return ((i * i + j * j) <= 2.25D);
/*     */   }
/*     */   
/*     */   public ais b(int ☃) {
/* 187 */     this.h = ☃;
/* 188 */     return this;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ais.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */