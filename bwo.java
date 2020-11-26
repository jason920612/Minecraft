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
/*     */ public class bwo
/*     */   extends bwv
/*     */ {
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   
/*     */   public static void ad_() {
/*  26 */     bwy.a((Class)bwo.class, "TeJP");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bwo() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bwo(Random ☃, int i, int j) {
/*  39 */     super(☃, i, 64, j, 12, 10, 15);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  44 */     super.a(☃);
/*  45 */     ☃.a("placedMainChest", this.e);
/*  46 */     ☃.a("placedHiddenChest", this.f);
/*  47 */     ☃.a("placedTrap1", this.g);
/*  48 */     ☃.a("placedTrap2", this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/*  53 */     super.a(☃, bxm1);
/*  54 */     this.e = ☃.q("placedMainChest");
/*  55 */     this.f = ☃.q("placedHiddenChest");
/*  56 */     this.g = ☃.q("placedTrap1");
/*  57 */     this.h = ☃.q("placedTrap2");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  62 */     if (!a(☃, bwf1, 0)) {
/*  63 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  67 */     a(☃, bwf1, 0, -4, 0, this.a - 1, 0, this.c - 1, false, random, i);
/*     */ 
/*     */     
/*  70 */     a(☃, bwf1, 2, 1, 2, 9, 2, 2, false, random, i);
/*  71 */     a(☃, bwf1, 2, 1, 12, 9, 2, 12, false, random, i);
/*  72 */     a(☃, bwf1, 2, 1, 3, 2, 2, 11, false, random, i);
/*  73 */     a(☃, bwf1, 9, 1, 3, 9, 2, 11, false, random, i);
/*     */ 
/*     */     
/*  76 */     a(☃, bwf1, 1, 3, 1, 10, 6, 1, false, random, i);
/*  77 */     a(☃, bwf1, 1, 3, 13, 10, 6, 13, false, random, i);
/*  78 */     a(☃, bwf1, 1, 3, 2, 1, 6, 12, false, random, i);
/*  79 */     a(☃, bwf1, 10, 3, 2, 10, 6, 12, false, random, i);
/*     */ 
/*     */     
/*  82 */     a(☃, bwf1, 2, 3, 2, 9, 3, 12, false, random, i);
/*  83 */     a(☃, bwf1, 2, 6, 2, 9, 6, 12, false, random, i);
/*  84 */     a(☃, bwf1, 3, 7, 3, 8, 7, 11, false, random, i);
/*  85 */     a(☃, bwf1, 4, 8, 4, 7, 8, 10, false, random, i);
/*     */ 
/*     */     
/*  88 */     b(☃, bwf1, 3, 1, 3, 8, 2, 11);
/*  89 */     b(☃, bwf1, 4, 3, 6, 7, 3, 9);
/*  90 */     b(☃, bwf1, 2, 4, 2, 9, 5, 12);
/*  91 */     b(☃, bwf1, 4, 6, 5, 7, 6, 9);
/*  92 */     b(☃, bwf1, 5, 7, 6, 6, 7, 8);
/*     */ 
/*     */     
/*  95 */     b(☃, bwf1, 5, 1, 2, 6, 2, 2);
/*  96 */     b(☃, bwf1, 5, 2, 12, 6, 2, 12);
/*  97 */     b(☃, bwf1, 5, 5, 1, 6, 5, 1);
/*  98 */     b(☃, bwf1, 5, 5, 13, 6, 5, 13);
/*  99 */     a(☃, bct.a.p(), 1, 5, 5, bwf1);
/* 100 */     a(☃, bct.a.p(), 10, 5, 5, bwf1);
/* 101 */     a(☃, bct.a.p(), 1, 5, 9, bwf1);
/* 102 */     a(☃, bct.a.p(), 10, 5, 9, bwf1);
/*     */     
/*     */     int i;
/* 105 */     for (i = 0; i <= 14; i += 14) {
/* 106 */       a(☃, bwf1, 2, 4, i, 2, 5, i, false, random, i);
/* 107 */       a(☃, bwf1, 4, 4, i, 4, 5, i, false, random, i);
/* 108 */       a(☃, bwf1, 7, 4, i, 7, 5, i, false, random, i);
/* 109 */       a(☃, bwf1, 9, 4, i, 9, 5, i, false, random, i);
/*     */     } 
/* 111 */     a(☃, bwf1, 5, 6, 0, 6, 6, 0, false, random, i);
/* 112 */     for (i = 0; i <= 11; i += 11) {
/* 113 */       for (int k = 2; k <= 12; k += 2) {
/* 114 */         a(☃, bwf1, i, 4, k, i, 5, k, false, random, i);
/*     */       }
/* 116 */       a(☃, bwf1, i, 6, 5, i, 6, 5, false, random, i);
/* 117 */       a(☃, bwf1, i, 6, 9, i, 6, 9, false, random, i);
/*     */     } 
/* 119 */     a(☃, bwf1, 2, 7, 2, 2, 9, 2, false, random, i);
/* 120 */     a(☃, bwf1, 9, 7, 2, 9, 9, 2, false, random, i);
/* 121 */     a(☃, bwf1, 2, 7, 12, 2, 9, 12, false, random, i);
/* 122 */     a(☃, bwf1, 9, 7, 12, 9, 9, 12, false, random, i);
/* 123 */     a(☃, bwf1, 4, 9, 4, 4, 9, 4, false, random, i);
/* 124 */     a(☃, bwf1, 7, 9, 4, 7, 9, 4, false, random, i);
/* 125 */     a(☃, bwf1, 4, 9, 10, 4, 9, 10, false, random, i);
/* 126 */     a(☃, bwf1, 7, 9, 10, 7, 9, 10, false, random, i);
/* 127 */     a(☃, bwf1, 5, 9, 7, 6, 9, 7, false, random, i);
/*     */     
/* 129 */     blc blc1 = bct.cB.p().a(bhx.a, eq.f);
/* 130 */     blc blc2 = bct.cB.p().a(bhx.a, eq.e);
/* 131 */     blc blc3 = bct.cB.p().a(bhx.a, eq.d);
/* 132 */     blc blc4 = bct.cB.p().a(bhx.a, eq.c);
/*     */     
/* 134 */     a(☃, blc4, 5, 9, 6, bwf1);
/* 135 */     a(☃, blc4, 6, 9, 6, bwf1);
/* 136 */     a(☃, blc3, 5, 9, 8, bwf1);
/* 137 */     a(☃, blc3, 6, 9, 8, bwf1);
/*     */ 
/*     */     
/* 140 */     a(☃, blc4, 4, 0, 0, bwf1);
/* 141 */     a(☃, blc4, 5, 0, 0, bwf1);
/* 142 */     a(☃, blc4, 6, 0, 0, bwf1);
/* 143 */     a(☃, blc4, 7, 0, 0, bwf1);
/*     */ 
/*     */     
/* 146 */     a(☃, blc4, 4, 1, 8, bwf1);
/* 147 */     a(☃, blc4, 4, 2, 9, bwf1);
/* 148 */     a(☃, blc4, 4, 3, 10, bwf1);
/* 149 */     a(☃, blc4, 7, 1, 8, bwf1);
/* 150 */     a(☃, blc4, 7, 2, 9, bwf1);
/* 151 */     a(☃, blc4, 7, 3, 10, bwf1);
/* 152 */     a(☃, bwf1, 4, 1, 9, 4, 1, 9, false, random, i);
/* 153 */     a(☃, bwf1, 7, 1, 9, 7, 1, 9, false, random, i);
/* 154 */     a(☃, bwf1, 4, 1, 10, 7, 2, 10, false, random, i);
/*     */ 
/*     */     
/* 157 */     a(☃, bwf1, 5, 4, 5, 6, 4, 5, false, random, i);
/* 158 */     a(☃, blc1, 4, 4, 5, bwf1);
/* 159 */     a(☃, blc2, 7, 4, 5, bwf1);
/*     */     
/*     */     int j;
/* 162 */     for (j = 0; j < 4; j++) {
/* 163 */       a(☃, blc3, 5, 0 - j, 6 + j, bwf1);
/* 164 */       a(☃, blc3, 6, 0 - j, 6 + j, bwf1);
/* 165 */       b(☃, bwf1, 5, 0 - j, 7 + j, 6, 0 - j, 9 + j);
/*     */     } 
/*     */ 
/*     */     
/* 169 */     b(☃, bwf1, 1, -3, 12, 10, -1, 13);
/* 170 */     b(☃, bwf1, 1, -3, 1, 3, -1, 13);
/* 171 */     b(☃, bwf1, 1, -3, 1, 9, -1, 5);
/* 172 */     for (j = 1; j <= 13; j += 2) {
/* 173 */       a(☃, bwf1, 1, -3, j, 1, -2, j, false, random, i);
/*     */     }
/* 175 */     for (j = 2; j <= 12; j += 2) {
/* 176 */       a(☃, bwf1, 1, -1, j, 3, -1, j, false, random, i);
/*     */     }
/* 178 */     a(☃, bwf1, 2, -2, 1, 5, -2, 1, false, random, i);
/* 179 */     a(☃, bwf1, 7, -2, 1, 9, -2, 1, false, random, i);
/* 180 */     a(☃, bwf1, 6, -3, 1, 6, -3, 1, false, random, i);
/* 181 */     a(☃, bwf1, 6, -1, 1, 6, -1, 1, false, random, i);
/*     */ 
/*     */     
/* 184 */     a(☃, bct.en.p().a(bio.a, eq.f).a(bio.c, Boolean.valueOf(true)), 1, -3, 8, bwf1);
/* 185 */     a(☃, bct.en.p().a(bio.a, eq.e).a(bio.c, Boolean.valueOf(true)), 4, -3, 8, bwf1);
/* 186 */     a(☃, bct.eo.p().a(bin.p, Boolean.valueOf(true)).a(bin.r, Boolean.valueOf(true)).a(bin.b, Boolean.valueOf(true)), 2, -3, 8, bwf1);
/* 187 */     a(☃, bct.eo.p().a(bin.p, Boolean.valueOf(true)).a(bin.r, Boolean.valueOf(true)).a(bin.b, Boolean.valueOf(true)), 3, -3, 8, bwf1);
/* 188 */     blc blc5 = bct.cl.p().a(bgu.a, bmo.b).a(bgu.c, bmo.b);
/* 189 */     a(☃, bct.cl.p().a(bgu.c, bmo.b), 5, -3, 7, bwf1);
/* 190 */     a(☃, blc5, 5, -3, 6, bwf1);
/* 191 */     a(☃, blc5, 5, -3, 5, bwf1);
/* 192 */     a(☃, blc5, 5, -3, 4, bwf1);
/* 193 */     a(☃, blc5, 5, -3, 3, bwf1);
/* 194 */     a(☃, blc5, 5, -3, 2, bwf1);
/* 195 */     a(☃, bct.cl.p().a(bgu.a, bmo.b).a(bgu.o, bmo.b), 5, -3, 1, bwf1);
/* 196 */     a(☃, bct.cl.p().a(bgu.b, bmo.b), 4, -3, 1, bwf1);
/* 197 */     a(☃, bct.cd.p(), 3, -3, 1, bwf1);
/* 198 */     if (!this.g) {
/* 199 */       this.g = a(☃, bwf1, random, 3, -2, 1, eq.c, ccl.m);
/*     */     }
/* 201 */     a(☃, bct.dM.p().a(biq.o, Boolean.valueOf(true)), 3, -2, 2, bwf1);
/*     */ 
/*     */     
/* 204 */     a(☃, bct.en.p().a(bio.a, eq.c).a(bio.c, Boolean.valueOf(true)), 7, -3, 1, bwf1);
/* 205 */     a(☃, bct.en.p().a(bio.a, eq.d).a(bio.c, Boolean.valueOf(true)), 7, -3, 5, bwf1);
/* 206 */     a(☃, bct.eo.p().a(bin.o, Boolean.valueOf(true)).a(bin.q, Boolean.valueOf(true)).a(bin.b, Boolean.valueOf(true)), 7, -3, 2, bwf1);
/* 207 */     a(☃, bct.eo.p().a(bin.o, Boolean.valueOf(true)).a(bin.q, Boolean.valueOf(true)).a(bin.b, Boolean.valueOf(true)), 7, -3, 3, bwf1);
/* 208 */     a(☃, bct.eo.p().a(bin.o, Boolean.valueOf(true)).a(bin.q, Boolean.valueOf(true)).a(bin.b, Boolean.valueOf(true)), 7, -3, 4, bwf1);
/* 209 */     a(☃, bct.cl.p().a(bgu.b, bmo.b), 8, -3, 6, bwf1);
/* 210 */     a(☃, bct.cl.p().a(bgu.o, bmo.b).a(bgu.c, bmo.b), 9, -3, 6, bwf1);
/* 211 */     a(☃, bct.cl.p().a(bgu.a, bmo.b).a(bgu.c, bmo.a), 9, -3, 5, bwf1);
/* 212 */     a(☃, bct.cd.p(), 9, -3, 4, bwf1);
/* 213 */     a(☃, bct.cl.p().a(bgu.a, bmo.b), 9, -2, 4, bwf1);
/* 214 */     if (!this.h) {
/* 215 */       this.h = a(☃, bwf1, random, 9, -2, 3, eq.e, ccl.m);
/*     */     }
/* 217 */     a(☃, bct.dM.p().a(biq.c, Boolean.valueOf(true)), 8, -1, 3, bwf1);
/* 218 */     a(☃, bct.dM.p().a(biq.c, Boolean.valueOf(true)), 8, -2, 3, bwf1);
/* 219 */     if (!this.e) {
/* 220 */       this.e = a(☃, bwf1, random, 8, -3, 3, ccl.l);
/*     */     }
/* 222 */     a(☃, bct.cd.p(), 9, -3, 2, bwf1);
/* 223 */     a(☃, bct.cd.p(), 8, -3, 1, bwf1);
/* 224 */     a(☃, bct.cd.p(), 4, -3, 5, bwf1);
/* 225 */     a(☃, bct.cd.p(), 5, -2, 5, bwf1);
/* 226 */     a(☃, bct.cd.p(), 5, -1, 5, bwf1);
/* 227 */     a(☃, bct.cd.p(), 6, -3, 5, bwf1);
/* 228 */     a(☃, bct.cd.p(), 7, -2, 5, bwf1);
/* 229 */     a(☃, bct.cd.p(), 7, -1, 5, bwf1);
/* 230 */     a(☃, bct.cd.p(), 8, -3, 5, bwf1);
/* 231 */     a(☃, bwf1, 9, -1, 1, 9, -1, 5, false, random, i);
/*     */ 
/*     */     
/* 234 */     b(☃, bwf1, 8, -3, 8, 10, -1, 10);
/* 235 */     a(☃, bct.dB.p(), 8, -2, 11, bwf1);
/* 236 */     a(☃, bct.dB.p(), 9, -2, 11, bwf1);
/* 237 */     a(☃, bct.dB.p(), 10, -2, 11, bwf1);
/* 238 */     blc blc6 = bct.cD.p().a(bft.D, eq.c).a(bft.C, bly.b);
/* 239 */     a(☃, blc6, 8, -2, 12, bwf1);
/* 240 */     a(☃, blc6, 9, -2, 12, bwf1);
/* 241 */     a(☃, blc6, 10, -2, 12, bwf1);
/* 242 */     a(☃, bwf1, 8, -3, 8, 8, -3, 10, false, random, i);
/* 243 */     a(☃, bwf1, 10, -3, 8, 10, -3, 10, false, random, i);
/* 244 */     a(☃, bct.cd.p(), 10, -2, 9, bwf1);
/* 245 */     a(☃, bct.cl.p().a(bgu.a, bmo.b), 8, -2, 9, bwf1);
/* 246 */     a(☃, bct.cl.p().a(bgu.c, bmo.b), 8, -2, 10, bwf1);
/* 247 */     a(☃, bct.cl.p(), 10, -1, 9, bwf1);
/* 248 */     a(☃, bct.aP.p().a(bkv.a, eq.b), 9, -2, 8, bwf1);
/* 249 */     a(☃, bct.aP.p().a(bkv.a, eq.e), 10, -2, 8, bwf1);
/* 250 */     a(☃, bct.aP.p().a(bkv.a, eq.e), 10, -1, 8, bwf1);
/* 251 */     a(☃, bct.dl.p().a(bgz.D, eq.c), 10, -2, 10, bwf1);
/* 252 */     if (!this.f) {
/* 253 */       this.f = a(☃, bwf1, random, 9, -3, 10, ccl.l);
/*     */     }
/*     */     
/* 256 */     return true;
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends bxb.a {
/*     */     public void a(Random ☃, int i, int j, int k, boolean bool) {
/* 262 */       if (☃.nextFloat() < 0.4F) {
/* 263 */         this.a = bct.m.p();
/*     */       } else {
/* 265 */         this.a = bct.cd.p();
/*     */       } 
/*     */     }
/*     */     private a() {} }
/*     */   
/* 270 */   private static final a i = new a();
/*     */ }


/* Location:              F:\dw\server.jar!\bwo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */