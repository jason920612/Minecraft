/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class x
/*     */ {
/*     */   private final l a;
/*     */   private final x b;
/*     */   private final x c;
/*     */   private final int d;
/*  13 */   private final List<x> e = Lists.newArrayList();
/*     */   private x f;
/*     */   private x g;
/*     */   private int h;
/*     */   private float i;
/*     */   private float j;
/*     */   private float k;
/*     */   private float l;
/*     */   
/*     */   public x(l ☃, @Nullable x x1, @Nullable x x2, int i, int j) {
/*  23 */     if (☃.c() == null) {
/*  24 */       throw new IllegalArgumentException("Can't position an invisible advancement!");
/*     */     }
/*  26 */     this.a = ☃;
/*  27 */     this.b = x1;
/*  28 */     this.c = x2;
/*  29 */     this.d = i;
/*  30 */     this.f = this;
/*  31 */     this.h = j;
/*  32 */     this.i = -1.0F;
/*     */     
/*  34 */     x x3 = null;
/*  35 */     for (l l1 : ☃.e()) {
/*  36 */       x3 = a(l1, x3);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private x a(l ☃, @Nullable x x1) {
/*  42 */     if (☃.c() != null) {
/*  43 */       x1 = new x(☃, this, x1, this.e.size() + 1, this.h + 1);
/*  44 */       this.e.add(x1);
/*     */     } else {
/*  46 */       for (l l1 : ☃.e()) {
/*  47 */         x1 = a(l1, x1);
/*     */       }
/*     */     } 
/*  50 */     return x1;
/*     */   }
/*     */   
/*     */   private void a() {
/*  54 */     if (this.e.isEmpty()) {
/*  55 */       if (this.c != null) {
/*  56 */         this.c.i++;
/*     */       } else {
/*  58 */         this.i = 0.0F;
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*  63 */     x ☃ = null;
/*  64 */     for (x x1 : this.e) {
/*  65 */       x1.a();
/*  66 */       ☃ = x1.a((☃ == null) ? x1 : ☃);
/*     */     } 
/*  68 */     b();
/*     */     
/*  70 */     float f = (((x)this.e.get(0)).i + ((x)this.e.get(this.e.size() - 1)).i) / 2.0F;
/*  71 */     if (this.c != null) {
/*  72 */       this.c.i++;
/*  73 */       this.j = this.i - f;
/*     */     } else {
/*  75 */       this.i = f;
/*     */     } 
/*     */   }
/*     */   
/*     */   private float a(float ☃, int i, float f1) {
/*  80 */     this.i += ☃;
/*  81 */     this.h = i;
/*     */     
/*  83 */     if (this.i < f1) {
/*  84 */       f1 = this.i;
/*     */     }
/*     */     
/*  87 */     for (x x1 : this.e) {
/*  88 */       f1 = x1.a(☃ + this.j, i + 1, f1);
/*     */     }
/*     */     
/*  91 */     return f1;
/*     */   }
/*     */   
/*     */   private void a(float ☃) {
/*  95 */     this.i += ☃;
/*  96 */     for (x x1 : this.e) {
/*  97 */       x1.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/* 102 */     float ☃ = 0.0F;
/* 103 */     float f1 = 0.0F;
/* 104 */     for (int i = this.e.size() - 1; i >= 0; i--) {
/* 105 */       x x1 = this.e.get(i);
/* 106 */       x1.i += ☃;
/* 107 */       x1.j += ☃;
/* 108 */       f1 += x1.k;
/* 109 */       ☃ += x1.l + f1;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private x c() {
/* 115 */     if (this.g != null) {
/* 116 */       return this.g;
/*     */     }
/* 118 */     if (!this.e.isEmpty()) {
/* 119 */       return this.e.get(0);
/*     */     }
/* 121 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private x d() {
/* 126 */     if (this.g != null) {
/* 127 */       return this.g;
/*     */     }
/* 129 */     if (!this.e.isEmpty()) {
/* 130 */       return this.e.get(this.e.size() - 1);
/*     */     }
/* 132 */     return null;
/*     */   }
/*     */   
/*     */   private x a(x ☃) {
/* 136 */     if (this.c == null) {
/* 137 */       return ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 142 */     x x1 = this;
/* 143 */     x x2 = this;
/* 144 */     x x3 = this.c;
/* 145 */     x x4 = this.b.e.get(0);
/* 146 */     float f1 = this.j;
/* 147 */     float f2 = this.j;
/* 148 */     float f3 = x3.j;
/* 149 */     float f4 = x4.j;
/*     */     
/* 151 */     while (x3.d() != null && x1.c() != null) {
/* 152 */       x3 = x3.d();
/* 153 */       x1 = x1.c();
/* 154 */       x4 = x4.c();
/* 155 */       x2 = x2.d();
/* 156 */       x2.f = this;
/* 157 */       float f = x3.i + f3 - x1.i + f1 + 1.0F;
/* 158 */       if (f > 0.0F) {
/* 159 */         x3.a(this, ☃).a(this, f);
/* 160 */         f1 += f;
/* 161 */         f2 += f;
/*     */       } 
/* 163 */       f3 += x3.j;
/* 164 */       f1 += x1.j;
/* 165 */       f4 += x4.j;
/* 166 */       f2 += x2.j;
/*     */     } 
/* 168 */     if (x3.d() != null && x2.d() == null) {
/* 169 */       x2.g = x3.d();
/* 170 */       x2.j += f3 - f2;
/*     */     } else {
/* 172 */       if (x1.c() != null && x4.c() == null) {
/* 173 */         x4.g = x1.c();
/* 174 */         x4.j += f1 - f4;
/*     */       } 
/* 176 */       ☃ = this;
/*     */     } 
/*     */     
/* 179 */     return ☃;
/*     */   }
/*     */   
/*     */   private void a(x ☃, float f) {
/* 183 */     float f1 = (☃.d - this.d);
/* 184 */     if (f1 != 0.0F) {
/* 185 */       ☃.k -= f / f1;
/* 186 */       this.k += f / f1;
/*     */     } 
/* 188 */     ☃.l += f;
/* 189 */     ☃.i += f;
/* 190 */     ☃.j += f;
/*     */   }
/*     */   
/*     */   private x a(x ☃, x x1) {
/* 194 */     if (this.f != null && ☃.b.e.contains(this.f)) {
/* 195 */       return this.f;
/*     */     }
/* 197 */     return x1;
/*     */   }
/*     */ 
/*     */   
/*     */   private void e() {
/* 202 */     if (this.a.c() != null) {
/* 203 */       this.a.c().a(this.h, this.i);
/*     */     }
/*     */     
/* 206 */     if (!this.e.isEmpty()) {
/* 207 */       for (x ☃ : this.e) {
/* 208 */         ☃.e();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(l ☃) {
/* 214 */     if (☃.c() == null) {
/* 215 */       throw new IllegalArgumentException("Can't position children of an invisible root!");
/*     */     }
/* 217 */     x x1 = new x(☃, null, null, 1, 0);
/* 218 */     x1.a();
/* 219 */     float f = x1.a(0.0F, 0, x1.i);
/* 220 */     if (f < 0.0F) {
/* 221 */       x1.a(-f);
/*     */     }
/* 223 */     x1.e();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */