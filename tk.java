/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class tk
/*     */ {
/*  24 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final tl b;
/*  27 */   private final List<tf> c = Lists.newArrayList();
/*     */   private final axm d;
/*  29 */   private final short[] e = new short[64];
/*     */   
/*     */   @Nullable
/*     */   private bnj f;
/*     */   private int g;
/*     */   private int h;
/*     */   private long i;
/*     */   private boolean j;
/*     */   
/*     */   public tk(tl ☃, int i, int j) {
/*  39 */     this.b = ☃;
/*  40 */     this.d = new axm(i, j);
/*  41 */     tc tc = ☃.a().v();
/*  42 */     tc.a(i, j);
/*  43 */     this.f = tc.a(i, j, true, false);
/*     */   }
/*     */   
/*     */   public axm a() {
/*  47 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/*  51 */     if (this.c.contains(☃)) {
/*  52 */       a.debug("Failed to add player. {} already is in chunk {}, {}", ☃, Integer.valueOf(this.d.a), Integer.valueOf(this.d.b));
/*     */       
/*     */       return;
/*     */     } 
/*  56 */     if (this.c.isEmpty()) {
/*  57 */       this.i = this.b.a().V();
/*     */     }
/*     */     
/*  60 */     this.c.add(☃);
/*     */     
/*  62 */     if (this.j) {
/*  63 */       c(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(tf ☃) {
/*  68 */     if (!this.c.contains(☃)) {
/*     */       return;
/*     */     }
/*     */     
/*  72 */     if (this.j) {
/*  73 */       ☃.a.a(new kd(this.d.a, this.d.b));
/*     */     }
/*  75 */     this.c.remove(☃);
/*     */     
/*  77 */     if (this.c.isEmpty()) {
/*  78 */       this.b.b(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(boolean ☃) {
/*  83 */     if (this.f != null) {
/*  84 */       return true;
/*     */     }
/*     */     
/*  87 */     this.f = this.b.a().v().a(this.d.a, this.d.b, true, ☃);
/*  88 */     return (this.f != null);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  92 */     if (this.j) {
/*  93 */       return true;
/*     */     }
/*  95 */     if (this.f == null) {
/*  96 */       return false;
/*     */     }
/*  98 */     if (!this.f.u()) {
/*  99 */       return false;
/*     */     }
/*     */     
/* 102 */     this.g = 0;
/* 103 */     this.h = 0;
/* 104 */     this.j = true;
/*     */     
/* 106 */     if (!this.c.isEmpty()) {
/* 107 */       iv<?> ☃ = new kg(this.f, 65535);
/*     */       
/* 109 */       for (tf tf : this.c) {
/* 110 */         tf.a.a(☃);
/* 111 */         this.b.a().A().a(tf, this.f);
/*     */       } 
/*     */     } 
/*     */     
/* 115 */     return true;
/*     */   }
/*     */   
/*     */   public void c(tf ☃) {
/* 119 */     if (!this.j) {
/*     */       return;
/*     */     }
/* 122 */     ☃.a.a(new kg(this.f, 65535));
/* 123 */     this.b.a().A().a(☃, this.f);
/*     */   }
/*     */   
/*     */   public void c() {
/* 127 */     long ☃ = this.b.a().V();
/*     */     
/* 129 */     if (this.f != null) {
/* 130 */       this.f.b(this.f.m() + ☃ - this.i);
/*     */     }
/* 132 */     this.i = ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 136 */     if (!this.j) {
/*     */       return;
/*     */     }
/* 139 */     if (this.g == 0) {
/* 140 */       this.b.a(this);
/*     */     }
/* 142 */     this.h |= 1 << i >> 4;
/*     */     
/* 144 */     if (this.g < 64) {
/* 145 */       short s = (short)(☃ << 12 | j << 8 | i);
/*     */       
/* 147 */       for (int k = 0; k < this.g; k++) {
/* 148 */         if (this.e[k] == s) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */       
/* 153 */       this.e[this.g++] = s;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(iv<?> ☃) {
/* 158 */     if (!this.j) {
/*     */       return;
/*     */     }
/* 161 */     for (int i = 0; i < this.c.size(); i++) {
/* 162 */       ((tf)this.c.get(i)).a.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void d() {
/* 167 */     if (!this.j || this.f == null) {
/*     */       return;
/*     */     }
/*     */     
/* 171 */     if (this.g == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 175 */     if (this.g == 1) {
/* 176 */       int ☃ = (this.e[0] >> 12 & 0xF) + this.d.a * 16;
/* 177 */       int i = this.e[0] & 0xFF;
/* 178 */       int j = (this.e[0] >> 8 & 0xF) + this.d.b * 16;
/*     */       
/* 180 */       el el = new el(☃, i, j);
/* 181 */       a(new jk(this.b.a(), el));
/* 182 */       if (this.b.a().a_(el).c().i()) {
/* 183 */         a(this.b.a().f(el));
/*     */       }
/* 185 */     } else if (this.g == 64) {
/* 186 */       a(new kg(this.f, this.h));
/*     */     } else {
/* 188 */       a(new jo(this.g, this.e, this.f));
/*     */       
/* 190 */       for (int ☃ = 0; ☃ < this.g; ☃++) {
/* 191 */         int i = (this.e[☃] >> 12 & 0xF) + this.d.a * 16;
/* 192 */         int j = this.e[☃] & 0xFF;
/* 193 */         int k = (this.e[☃] >> 8 & 0xF) + this.d.b * 16;
/*     */         
/* 195 */         el el = new el(i, j, k);
/* 196 */         if (this.b.a().a_(el).c().i()) {
/* 197 */           a(this.b.a().f(el));
/*     */         }
/*     */       } 
/*     */     } 
/* 201 */     this.g = 0;
/* 202 */     this.h = 0;
/*     */   }
/*     */   
/*     */   private void a(@Nullable bji ☃) {
/* 206 */     if (☃ != null) {
/* 207 */       ji ji = ☃.Z_();
/* 208 */       if (ji != null) {
/* 209 */         a(ji);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean d(tf ☃) {
/* 215 */     return this.c.contains(☃);
/*     */   }
/*     */   
/*     */   public boolean a(Predicate<tf> ☃) {
/* 219 */     return this.c.stream().anyMatch(☃);
/*     */   }
/*     */   
/*     */   public boolean a(double ☃, Predicate<tf> predicate) {
/* 223 */     for (int i = 0, j = this.c.size(); i < j; i++) {
/* 224 */       tf tf = this.c.get(i);
/* 225 */       if (predicate.test(tf) && this.d.a(tf) < ☃ * ☃) {
/* 226 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 230 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 234 */     return this.j;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bnj f() {
/* 239 */     return this.f;
/*     */   }
/*     */   
/*     */   public double g() {
/* 243 */     double ☃ = Double.MAX_VALUE;
/* 244 */     for (tf tf : this.c) {
/* 245 */       double d = this.d.a(tf);
/* 246 */       if (d < ☃) {
/* 247 */         ☃ = d;
/*     */       }
/*     */     } 
/* 250 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\tk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */