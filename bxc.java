/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public abstract class bxc
/*     */ {
/*  29 */   protected final List<bxb> a = Lists.newArrayList();
/*     */   
/*     */   protected bwf b;
/*     */   
/*     */   protected int c;
/*     */   
/*     */   protected int d;
/*     */   private ayu e;
/*     */   private int f;
/*     */   
/*     */   public bxc() {}
/*     */   
/*     */   public bxc(int ☃, int i, ayu ayu1, boz boz1, long l) {
/*  42 */     this.c = ☃;
/*  43 */     this.d = i;
/*  44 */     this.e = ayu1;
/*  45 */     boz1.c(l, this.c, this.d);
/*     */   }
/*     */   
/*     */   public bwf c() {
/*  49 */     return this.b;
/*     */   }
/*     */   
/*     */   public List<bxb> d() {
/*  53 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  57 */     synchronized (this.a) {
/*  58 */       Iterator<bxb> iterator = this.a.iterator();
/*  59 */       while (iterator.hasNext()) {
/*  60 */         bxb bxb = iterator.next();
/*  61 */         if (bxb.d().a(bwf1) && 
/*  62 */           !bxb.a(☃, random, bwf1, axm1)) {
/*  63 */           iterator.remove();
/*     */         }
/*     */       } 
/*     */       
/*  67 */       a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(axk ☃) {
/*  72 */     this.b = bwf.a();
/*     */     
/*  74 */     for (bxb bxb : this.a) {
/*  75 */       this.b.b(bxb.d());
/*     */     }
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
/*     */   public gy a(int ☃, int i) {
/* 108 */     gy gy = new gy();
/*     */     
/* 110 */     if (b()) {
/* 111 */       gy.a("id", bwy.a(this));
/*     */     } else {
/* 113 */       gy.a("id", "INVALID");
/* 114 */       return gy;
/*     */     } 
/*     */     
/* 117 */     gy.a("biome", fc.m.b(this.e).toString());
/* 118 */     gy.b("ChunkX", ☃);
/* 119 */     gy.b("ChunkZ", i);
/* 120 */     gy.b("references", this.f);
/* 121 */     gy.a("BB", this.b.g());
/*     */     
/* 123 */     he he = new he();
/* 124 */     synchronized (this.a) {
/* 125 */       for (bxb bxb : this.a) {
/* 126 */         he.a(bxb.c());
/*     */       }
/*     */     } 
/* 129 */     gy.a("Children", he);
/*     */     
/* 131 */     a(gy);
/*     */     
/* 133 */     return gy;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {}
/*     */   
/*     */   public void a(axz ☃, gy gy1) {
/* 140 */     this.c = gy1.h("ChunkX");
/* 141 */     this.d = gy1.h("ChunkZ");
/* 142 */     this.f = gy1.h("references");
/* 143 */     this.e = gy1.e("biome") ? fc.m.b(new pc(gy1.l("biome"))) : ☃.H().f().b().a(new el((this.c << 4) + 9, 0, (this.d << 4) + 9), ayz.c);
/* 144 */     if (gy1.e("BB")) {
/* 145 */       this.b = new bwf(gy1.n("BB"));
/*     */     }
/*     */     
/* 148 */     he he = gy1.d("Children", 10);
/* 149 */     for (int i = 0; i < he.size(); i++) {
/* 150 */       this.a.add(bwy.b(he.e(i), ☃));
/*     */     }
/*     */     
/* 153 */     b(gy1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {}
/*     */   
/*     */   protected void a(ayc ☃, Random random, int i) {
/* 160 */     int j = ☃.k() - i;
/*     */ 
/*     */     
/* 163 */     int k = this.b.d() + 1;
/*     */     
/* 165 */     if (k < j) {
/* 166 */       k += random.nextInt(j - k);
/*     */     }
/*     */ 
/*     */     
/* 170 */     int m = k - this.b.e;
/* 171 */     this.b.a(0, m, 0);
/* 172 */     for (bxb bxb : this.a) {
/* 173 */       bxb.a(0, m, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(axk ☃, Random random, int i, int j) {
/* 178 */     int m, k = j - i + 1 - this.b.d();
/*     */ 
/*     */     
/* 181 */     if (k > 1) {
/* 182 */       m = i + random.nextInt(k);
/*     */     } else {
/* 184 */       m = i;
/*     */     } 
/*     */ 
/*     */     
/* 188 */     int n = m - this.b.b;
/* 189 */     this.b.a(0, n, 0);
/* 190 */     for (bxb bxb : this.a) {
/* 191 */       bxb.a(0, n, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 196 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(axm ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int e() {
/* 207 */     return this.c;
/*     */   }
/*     */   
/*     */   public int f() {
/* 211 */     return this.d;
/*     */   }
/*     */   
/*     */   public el a() {
/* 215 */     return new el(this.c << 4, 0, this.d << 4);
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 219 */     return (this.f < i());
/*     */   }
/*     */   
/*     */   public void h() {
/* 223 */     this.f++;
/*     */   }
/*     */   
/*     */   protected int i() {
/* 227 */     return 1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */