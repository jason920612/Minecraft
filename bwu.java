/*     */ import com.google.common.collect.Lists;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bwu
/*     */ {
/*  34 */   private static final pc[] a = new pc[] { new pc("underwater_ruin/warm_1"), new pc("underwater_ruin/warm_2"), new pc("underwater_ruin/warm_3"), new pc("underwater_ruin/warm_4"), new pc("underwater_ruin/warm_5"), new pc("underwater_ruin/warm_6"), new pc("underwater_ruin/warm_7"), new pc("underwater_ruin/warm_8") };
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
/*  45 */   private static final pc[] b = new pc[] { new pc("underwater_ruin/brick_1"), new pc("underwater_ruin/brick_2"), new pc("underwater_ruin/brick_3"), new pc("underwater_ruin/brick_4"), new pc("underwater_ruin/brick_5"), new pc("underwater_ruin/brick_6"), new pc("underwater_ruin/brick_7"), new pc("underwater_ruin/brick_8") };
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
/*  56 */   private static final pc[] c = new pc[] { new pc("underwater_ruin/cracked_1"), new pc("underwater_ruin/cracked_2"), new pc("underwater_ruin/cracked_3"), new pc("underwater_ruin/cracked_4"), new pc("underwater_ruin/cracked_5"), new pc("underwater_ruin/cracked_6"), new pc("underwater_ruin/cracked_7"), new pc("underwater_ruin/cracked_8") };
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
/*  67 */   private static final pc[] d = new pc[] { new pc("underwater_ruin/mossy_1"), new pc("underwater_ruin/mossy_2"), new pc("underwater_ruin/mossy_3"), new pc("underwater_ruin/mossy_4"), new pc("underwater_ruin/mossy_5"), new pc("underwater_ruin/mossy_6"), new pc("underwater_ruin/mossy_7"), new pc("underwater_ruin/mossy_8") };
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
/*  78 */   private static final pc[] e = new pc[] { new pc("underwater_ruin/big_brick_1"), new pc("underwater_ruin/big_brick_2"), new pc("underwater_ruin/big_brick_3"), new pc("underwater_ruin/big_brick_8") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  85 */   private static final pc[] f = new pc[] { new pc("underwater_ruin/big_mossy_1"), new pc("underwater_ruin/big_mossy_2"), new pc("underwater_ruin/big_mossy_3"), new pc("underwater_ruin/big_mossy_8") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  92 */   private static final pc[] g = new pc[] { new pc("underwater_ruin/big_cracked_1"), new pc("underwater_ruin/big_cracked_2"), new pc("underwater_ruin/big_cracked_3"), new pc("underwater_ruin/big_cracked_8") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  99 */   private static final pc[] h = new pc[] { new pc("underwater_ruin/big_warm_4"), new pc("underwater_ruin/big_warm_5"), new pc("underwater_ruin/big_warm_6"), new pc("underwater_ruin/big_warm_7") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a() {
/* 107 */     bwy.a((Class)a.class, "ORP");
/*     */   }
/*     */   
/*     */   private static pc a(Random ☃) {
/* 111 */     return a[☃.nextInt(a.length)];
/*     */   }
/*     */   
/*     */   private static pc b(Random ☃) {
/* 115 */     return h[☃.nextInt(h.length)];
/*     */   }
/*     */   
/*     */   public static void a(bxm ☃, el el1, bhb bhb1, List<bxb> list, Random random, bsc bsc1) {
/* 119 */     boolean bool = (random.nextFloat() <= bsc1.b);
/* 120 */     float f = bool ? 0.9F : 0.8F;
/*     */     
/* 122 */     a(☃, el1, bhb1, list, random, bsc1, bool, f);
/*     */     
/* 124 */     if (bool && random.nextFloat() <= bsc1.c) {
/* 125 */       a(☃, random, bhb1, el1, bsc1, list);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(bxm ☃, Random random, bhb bhb1, el el1, bsc bsc1, List<bxb> list) {
/* 130 */     int i = el1.o();
/* 131 */     int j = el1.q();
/* 132 */     el el2 = bxp.a(new el(15, 0, 15), bfz.a, bhb1, new el(0, 0, 0)).a(i, 0, j);
/* 133 */     bwf bwf = bwf.a(i, 0, j, el2.o(), 0, el2.q());
/* 134 */     el el3 = new el(Math.min(i, el2.o()), 0, Math.min(j, el2.q()));
/* 135 */     List<el> list1 = a(random, el3.o(), el3.q());
/* 136 */     int k = xq.a(random, 4, 8);
/*     */     
/* 138 */     for (int m = 0; m < k; m++) {
/* 139 */       if (!list1.isEmpty()) {
/* 140 */         int n = random.nextInt(list1.size());
/* 141 */         el el4 = list1.remove(n);
/* 142 */         int i1 = el4.o();
/* 143 */         int i2 = el4.q();
/* 144 */         bhb bhb2 = bhb.values()[random.nextInt((bhb.values()).length)];
/* 145 */         el el5 = bxp.a(new el(5, 0, 6), bfz.a, bhb2, new el(0, 0, 0)).a(i1, 0, i2);
/* 146 */         bwf bwf1 = bwf.a(i1, 0, i2, el5.o(), 0, el5.q());
/* 147 */         if (!bwf1.a(bwf))
/*     */         {
/*     */ 
/*     */           
/* 151 */           a(☃, el4, bhb2, list, random, bsc1, false, 0.8F); } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static List<el> a(Random ☃, int i, int j) {
/* 157 */     List<el> list = Lists.newArrayList();
/* 158 */     list.add(new el(i - 16 + xq.a(☃, 1, 8), 90, j + 16 + xq.a(☃, 1, 7)));
/* 159 */     list.add(new el(i - 16 + xq.a(☃, 1, 8), 90, j + xq.a(☃, 1, 7)));
/* 160 */     list.add(new el(i - 16 + xq.a(☃, 1, 8), 90, j - 16 + xq.a(☃, 4, 8)));
/* 161 */     list.add(new el(i + xq.a(☃, 1, 7), 90, j + 16 + xq.a(☃, 1, 7)));
/* 162 */     list.add(new el(i + xq.a(☃, 1, 7), 90, j - 16 + xq.a(☃, 4, 6)));
/* 163 */     list.add(new el(i + 16 + xq.a(☃, 1, 7), 90, j + 16 + xq.a(☃, 3, 8)));
/* 164 */     list.add(new el(i + 16 + xq.a(☃, 1, 7), 90, j + xq.a(☃, 1, 7)));
/* 165 */     list.add(new el(i + 16 + xq.a(☃, 1, 7), 90, j - 16 + xq.a(☃, 4, 8)));
/*     */     
/* 167 */     return list;
/*     */   }
/*     */   
/*     */   private static void a(bxm ☃, el el1, bhb bhb1, List<bxb> list, Random random, bsc bsc1, boolean bool, float f) {
/* 171 */     if (bsc1.a == bwt.b.a) {
/* 172 */       pc pc1 = bool ? b(random) : a(random);
/* 173 */       list.add(new a(☃, pc1, el1, bhb1, f, bsc1.a, bool));
/* 174 */     } else if (bsc1.a == bwt.b.b) {
/* 175 */       pc[] arrayOfPc1 = bool ? e : b;
/* 176 */       pc[] arrayOfPc2 = bool ? g : c;
/* 177 */       pc[] arrayOfPc3 = bool ? f : d;
/*     */       
/* 179 */       int i = random.nextInt(arrayOfPc1.length);
/* 180 */       list.add(new a(☃, arrayOfPc1[i], el1, bhb1, f, bsc1.a, bool));
/* 181 */       list.add(new a(☃, arrayOfPc2[i], el1, bhb1, 0.7F, bsc1.a, bool));
/* 182 */       list.add(new a(☃, arrayOfPc3[i], el1, bhb1, 0.5F, bsc1.a, bool));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends bxe
/*     */   {
/*     */     private bwt.b d;
/*     */     private float e;
/*     */     private pc f;
/*     */     private bhb g;
/*     */     private boolean h;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     public a(bxm ☃, pc pc1, el el1, bhb bhb1, float f, bwt.b b1, boolean bool) {
/* 198 */       super(0);
/*     */       
/* 200 */       this.f = pc1;
/* 201 */       this.c = el1;
/* 202 */       this.g = bhb1;
/* 203 */       this.e = f;
/* 204 */       this.d = b1;
/* 205 */       this.h = bool;
/*     */       
/* 207 */       a(☃);
/*     */     }
/*     */     
/*     */     private void a(bxm ☃) {
/* 211 */       bxp bxp = ☃.a(this.f);
/* 212 */       bxn bxn = (new bxn()).a(this.g).a(bfz.a).a(bct.a);
/* 213 */       a(bxp, this.c, bxn);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃) {
/* 218 */       super.a(☃);
/* 219 */       ☃.a("Template", this.f.toString());
/* 220 */       ☃.a("Rot", this.g.name());
/* 221 */       ☃.a("Integrity", this.e);
/* 222 */       ☃.a("BiomeType", this.d.toString());
/* 223 */       ☃.a("IsLarge", this.h);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃, bxm bxm1) {
/* 228 */       super.a(☃, bxm1);
/* 229 */       this.f = new pc(☃.l("Template"));
/* 230 */       this.g = bhb.valueOf(☃.l("Rot"));
/* 231 */       this.e = ☃.j("Integrity");
/* 232 */       this.d = bwt.b.valueOf(☃.l("BiomeType"));
/* 233 */       this.h = ☃.q("IsLarge");
/* 234 */       a(bxm1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(String ☃, el el1, axz axz1, Random random, bwf bwf1) {
/* 239 */       if ("chest".equals(☃)) {
/* 240 */         axz1.a(el1, bct.ck.p().a(bdh.c, Boolean.valueOf(axz1.b(el1).a(ww.a))), 2);
/*     */         
/* 242 */         bji bji = axz1.f(el1);
/* 243 */         if (bji instanceof bjl) {
/* 244 */           ((bjl)bji).a(this.h ? ccl.q : ccl.p, random.nextLong());
/*     */         }
/*     */       }
/* 247 */       else if ("drowned".equals(☃)) {
/* 248 */         amu amu = new amu(axz1.f());
/* 249 */         amu.di();
/* 250 */         amu.a(el1, 0.0F, 0.0F);
/* 251 */         amu.a(axz1.h(el1), (afj)null, (gy)null);
/* 252 */         axz1.a(amu);
/* 253 */         if (el1.p() > axz1.k()) {
/* 254 */           axz1.a(el1, bct.a.p(), 2);
/*     */         } else {
/* 256 */           axz1.a(el1, bct.A.p(), 2);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 263 */       this.b.a(this.e);
/* 264 */       int i = ☃.a(bor.a.b, this.c.o(), this.c.q());
/* 265 */       this.c = new el(this.c.o(), i, this.c.q());
/* 266 */       el el = bxp.a(new el(this.a.a().o() - 1, 0, this.a.a().q() - 1), bfz.a, this.g, new el(0, 0, 0)).a(this.c);
/* 267 */       this.c = new el(this.c.o(), a(this.c, ☃, el), this.c.q());
/*     */       
/* 269 */       return super.a(☃, random, bwf1, axm1);
/*     */     }
/*     */     
/*     */     private int a(el ☃, axk axk1, el el1) {
/* 273 */       int i = ☃.p();
/* 274 */       int j = 512;
/* 275 */       int k = i - 1;
/* 276 */       int m = 0;
/* 277 */       for (el el2 : el.a(☃, el1)) {
/* 278 */         int i1 = el2.o();
/* 279 */         int i2 = el2.q();
/* 280 */         int i3 = ☃.p() - 1;
/* 281 */         el.a a1 = new el.a(i1, i3, i2);
/* 282 */         blc blc = axk1.a_(a1);
/* 283 */         byw byw = axk1.b(a1);
/* 284 */         while ((blc.f() || byw.a(ww.a) || blc.c().a(wv.E)) && i3 > 1) {
/* 285 */           i3--;
/* 286 */           a1.c(i1, i3, i2);
/* 287 */           blc = axk1.a_(a1);
/* 288 */           byw = axk1.b(a1);
/*     */         } 
/*     */         
/* 291 */         j = Math.min(j, i3);
/* 292 */         if (i3 < k - 2) {
/* 293 */           m++;
/*     */         }
/*     */       } 
/*     */       
/* 297 */       int n = Math.abs(☃.o() - el1.o());
/* 298 */       if (k - j > 2 && m > n - 2) {
/* 299 */         i = j + 1;
/*     */       }
/*     */       
/* 302 */       return i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */