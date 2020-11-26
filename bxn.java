/*     */ import java.util.List;
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
/*     */ public class bxn
/*     */ {
/*  18 */   private bfz a = bfz.a;
/*  19 */   private bhb b = bhb.a;
/*  20 */   private el c = new el(0, 0, 0);
/*     */   private boolean d;
/*     */   @Nullable
/*     */   private bcs e;
/*     */   @Nullable
/*     */   private axm f;
/*     */   @Nullable
/*     */   private bwf g;
/*     */   private boolean h = true;
/*     */   private boolean i = true;
/*  30 */   private float j = 1.0F;
/*     */   @Nullable
/*     */   private Random k;
/*     */   @Nullable
/*     */   private Long l;
/*     */   @Nullable
/*     */   private Integer m;
/*     */   private int n;
/*     */   
/*     */   public bxn a() {
/*  40 */     bxn ☃ = new bxn();
/*  41 */     ☃.a = this.a;
/*  42 */     ☃.b = this.b;
/*  43 */     ☃.c = this.c;
/*  44 */     ☃.d = this.d;
/*  45 */     ☃.e = this.e;
/*  46 */     ☃.f = this.f;
/*  47 */     ☃.g = this.g;
/*  48 */     ☃.h = this.h;
/*  49 */     ☃.i = this.i;
/*  50 */     ☃.j = this.j;
/*  51 */     ☃.k = this.k;
/*  52 */     ☃.l = this.l;
/*  53 */     ☃.m = this.m;
/*  54 */     ☃.n = this.n;
/*  55 */     return ☃;
/*     */   }
/*     */   
/*     */   public bxn a(bfz ☃) {
/*  59 */     this.a = ☃;
/*  60 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(bhb ☃) {
/*  64 */     this.b = ☃;
/*  65 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(el ☃) {
/*  69 */     this.c = ☃;
/*  70 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(boolean ☃) {
/*  74 */     this.d = ☃;
/*  75 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(bcs ☃) {
/*  79 */     this.e = ☃;
/*  80 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(axm ☃) {
/*  84 */     this.f = ☃;
/*  85 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(bwf ☃) {
/*  89 */     this.g = ☃;
/*  90 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(@Nullable Long ☃) {
/*  94 */     this.l = ☃;
/*  95 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(@Nullable Random ☃) {
/*  99 */     this.k = ☃;
/* 100 */     return this;
/*     */   }
/*     */   
/*     */   public bxn a(float ☃) {
/* 104 */     this.j = ☃;
/* 105 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bfz b() {
/* 114 */     return this.a;
/*     */   }
/*     */   
/*     */   public bxn c(boolean ☃) {
/* 118 */     this.h = ☃;
/* 119 */     return this;
/*     */   }
/*     */   
/*     */   public bhb c() {
/* 123 */     return this.b;
/*     */   }
/*     */   
/*     */   public el d() {
/* 127 */     return this.c;
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
/*     */   
/*     */   public Random b(@Nullable el ☃) {
/* 141 */     if (this.k != null) {
/* 142 */       return this.k;
/*     */     }
/*     */     
/* 145 */     if (this.l != null) {
/* 146 */       if (this.l.longValue() == 0L) {
/* 147 */         return new Random(k.b());
/*     */       }
/* 149 */       return new Random(this.l.longValue());
/*     */     } 
/*     */     
/* 152 */     if (☃ == null) {
/* 153 */       return new Random(k.b());
/*     */     }
/*     */     
/* 156 */     return boz.a(☃.o(), ☃.q(), 0L, 987234911L);
/*     */   }
/*     */   
/*     */   public float g() {
/* 160 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 164 */     return this.d;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bcs i() {
/* 169 */     return this.e;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bwf j() {
/* 174 */     if (this.g == null && this.f != null) {
/* 175 */       l();
/*     */     }
/* 177 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 181 */     return this.h;
/*     */   }
/*     */   
/*     */   void l() {
/* 185 */     if (this.f != null) {
/* 186 */       this.g = b(this.f);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 191 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<bxp.b> a(List<List<bxp.b>> ☃, @Nullable el el1) {
/* 200 */     this.m = Integer.valueOf(8);
/* 201 */     if (this.m != null && this.m.intValue() >= 0 && this.m.intValue() < ☃.size()) {
/* 202 */       return ☃.get(this.m.intValue());
/*     */     }
/* 204 */     this.m = Integer.valueOf(b(el1).nextInt(☃.size()));
/* 205 */     return ☃.get(this.m.intValue());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private bwf b(@Nullable axm ☃) {
/* 214 */     if (☃ == null) {
/* 215 */       return this.g;
/*     */     }
/* 217 */     int i = ☃.a * 16;
/* 218 */     int j = ☃.b * 16;
/* 219 */     return new bwf(i, 0, j, i + 16 - 1, 255, j + 16 - 1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */