/*     */ import com.google.common.collect.ComparisonChain;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aek
/*     */   implements Comparable<aek>
/*     */ {
/*  12 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final aej b;
/*     */   
/*     */   private int c;
/*     */   private int d;
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   private boolean h;
/*     */   private boolean i;
/*     */   
/*     */   public aek(aej ☃) {
/*  24 */     this(☃, 0, 0);
/*     */   }
/*     */   
/*     */   public aek(aej ☃, int i) {
/*  28 */     this(☃, i, 0);
/*     */   }
/*     */   
/*     */   public aek(aej ☃, int i, int j) {
/*  32 */     this(☃, i, j, false, true);
/*     */   }
/*     */   
/*     */   public aek(aej ☃, int i, int j, boolean bool1, boolean bool2) {
/*  36 */     this(☃, i, j, bool1, bool2, bool2);
/*     */   }
/*     */   
/*     */   public aek(aej ☃, int i, int j, boolean bool1, boolean bool2, boolean bool3) {
/*  40 */     this.b = ☃;
/*  41 */     this.c = i;
/*  42 */     this.d = j;
/*  43 */     this.f = bool1;
/*  44 */     this.h = bool2;
/*  45 */     this.i = bool3;
/*     */   }
/*     */   
/*     */   public aek(aek ☃) {
/*  49 */     this.b = ☃.b;
/*  50 */     this.c = ☃.c;
/*  51 */     this.d = ☃.d;
/*  52 */     this.f = ☃.f;
/*  53 */     this.h = ☃.h;
/*  54 */     this.i = ☃.i;
/*     */   }
/*     */   
/*     */   public boolean a(aek ☃) {
/*  58 */     if (this.b != ☃.b) {
/*  59 */       a.warn("This method should only be called for matching effects!");
/*     */     }
/*  61 */     boolean bool = false;
/*  62 */     if (☃.d > this.d) {
/*  63 */       this.d = ☃.d;
/*  64 */       this.c = ☃.c;
/*  65 */       bool = true;
/*  66 */     } else if (☃.d == this.d && this.c < ☃.c) {
/*  67 */       this.c = ☃.c;
/*  68 */       bool = true;
/*     */     } 
/*  70 */     if ((!☃.f && this.f) || bool) {
/*  71 */       this.f = ☃.f;
/*  72 */       bool = true;
/*     */     } 
/*  74 */     if (☃.h != this.h) {
/*  75 */       this.h = ☃.h;
/*  76 */       bool = true;
/*     */     } 
/*  78 */     if (☃.i != this.i) {
/*  79 */       this.i = ☃.i;
/*  80 */       bool = true;
/*     */     } 
/*  82 */     return bool;
/*     */   }
/*     */   
/*     */   public aej a() {
/*  86 */     return this.b;
/*     */   }
/*     */   
/*     */   public int b() {
/*  90 */     return this.c;
/*     */   }
/*     */   
/*     */   public int c() {
/*  94 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 102 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 106 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 110 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(afa ☃) {
/* 120 */     if (this.c > 0) {
/* 121 */       if (this.b.a(this.c, this.d)) {
/* 122 */         b(☃);
/*     */       }
/* 124 */       i();
/*     */     } 
/* 126 */     return (this.c > 0);
/*     */   }
/*     */   
/*     */   private int i() {
/* 130 */     return --this.c;
/*     */   }
/*     */   
/*     */   public void b(afa ☃) {
/* 134 */     if (this.c > 0) {
/* 135 */       this.b.a(☃, this.d);
/*     */     }
/*     */   }
/*     */   
/*     */   public String g() {
/* 140 */     return this.b.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*     */     String ☃;
/* 146 */     if (this.d > 0) {
/* 147 */       ☃ = g() + " x " + (this.d + 1) + ", Duration: " + this.c;
/*     */     } else {
/* 149 */       ☃ = g() + ", Duration: " + this.c;
/*     */     } 
/* 151 */     if (this.e) {
/* 152 */       ☃ = ☃ + ", Splash: true";
/*     */     }
/* 154 */     if (!this.h) {
/* 155 */       ☃ = ☃ + ", Particles: false";
/*     */     }
/* 157 */     if (!this.i) {
/* 158 */       ☃ = ☃ + ", Show Icon: false";
/*     */     }
/*     */     
/* 161 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 166 */     if (this == ☃) {
/* 167 */       return true;
/*     */     }
/*     */     
/* 170 */     if (☃ instanceof aek) {
/* 171 */       aek aek1 = (aek)☃;
/*     */       
/* 173 */       return (this.c == aek1.c && this.d == aek1.d && this.e == aek1.e && this.f == aek1.f && this.b.equals(aek1.b));
/*     */     } 
/* 175 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 180 */     int ☃ = this.b.hashCode();
/* 181 */     ☃ = 31 * ☃ + this.c;
/* 182 */     ☃ = 31 * ☃ + this.d;
/* 183 */     ☃ = 31 * ☃ + (this.e ? 1 : 0);
/* 184 */     ☃ = 31 * ☃ + (this.f ? 1 : 0);
/* 185 */     return ☃;
/*     */   }
/*     */   
/*     */   public gy a(gy ☃) {
/* 189 */     ☃.a("Id", (byte)aej.a(a()));
/* 190 */     ☃.a("Amplifier", (byte)c());
/* 191 */     ☃.b("Duration", b());
/* 192 */     ☃.a("Ambient", d());
/* 193 */     ☃.a("ShowParticles", e());
/* 194 */     ☃.a("ShowIcon", f());
/* 195 */     return ☃;
/*     */   }
/*     */   
/*     */   public static aek b(gy ☃) {
/* 199 */     int i = ☃.f("Id");
/* 200 */     aej aej1 = aej.a(i);
/* 201 */     if (aej1 == null) {
/* 202 */       return null;
/*     */     }
/* 204 */     int j = ☃.f("Amplifier");
/* 205 */     int k = ☃.h("Duration");
/* 206 */     boolean bool1 = ☃.q("Ambient");
/* 207 */     boolean bool2 = true;
/* 208 */     if (☃.c("ShowParticles", 1)) {
/* 209 */       bool2 = ☃.q("ShowParticles");
/*     */     }
/* 211 */     boolean bool3 = bool2;
/* 212 */     if (☃.c("ShowIcon", 1)) {
/* 213 */       bool3 = ☃.q("ShowIcon");
/*     */     }
/* 215 */     return new aek(aej1, k, (j < 0) ? 0 : j, bool1, bool2, bool3);
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
/*     */   
/*     */   public int b(aek ☃) {
/* 228 */     int i = 32147;
/* 229 */     if ((b() > 32147 && ☃.b() > 32147) || (d() && ☃.d()))
/*     */     {
/* 231 */       return ComparisonChain.start()
/* 232 */         .compare(Boolean.valueOf(d()), Boolean.valueOf(☃.d()))
/* 233 */         .compare(a().i(), ☃.a().i())
/* 234 */         .result();
/*     */     }
/* 236 */     return ComparisonChain.start()
/* 237 */       .compare(Boolean.valueOf(d()), Boolean.valueOf(☃.d()))
/* 238 */       .compare(b(), ☃.b())
/* 239 */       .compare(a().i(), ☃.a().i())
/* 240 */       .result();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */