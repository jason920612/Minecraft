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
/*     */ public class bwk
/*     */   extends bwv
/*     */ {
/*     */   public static void ac_() {
/*  17 */     bwy.a((Class)bwk.class, "TeDP");
/*     */   }
/*     */   
/*  20 */   private final boolean[] e = new boolean[4];
/*     */ 
/*     */   
/*     */   public bwk() {}
/*     */ 
/*     */   
/*     */   public bwk(Random ☃, int i, int j) {
/*  27 */     super(☃, i, 64, j, 21, 15, 21);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/*  32 */     super.a(☃);
/*  33 */     ☃.a("hasPlacedChest0", this.e[0]);
/*  34 */     ☃.a("hasPlacedChest1", this.e[1]);
/*  35 */     ☃.a("hasPlacedChest2", this.e[2]);
/*  36 */     ☃.a("hasPlacedChest3", this.e[3]);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/*  41 */     super.a(☃, bxm1);
/*  42 */     this.e[0] = ☃.q("hasPlacedChest0");
/*  43 */     this.e[1] = ☃.q("hasPlacedChest1");
/*  44 */     this.e[2] = ☃.q("hasPlacedChest2");
/*  45 */     this.e[3] = ☃.q("hasPlacedChest3");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/*  51 */     a(☃, bwf1, 0, -4, 0, this.a - 1, 0, this.c - 1, bct.at.p(), bct.at.p(), false); int i;
/*  52 */     for (i = 1; i <= 9; i++) {
/*  53 */       a(☃, bwf1, i, i, i, this.a - 1 - i, i, this.c - 1 - i, bct.at.p(), bct.at.p(), false);
/*  54 */       a(☃, bwf1, i + 1, i, i + 1, this.a - 2 - i, i, this.c - 2 - i, bct.a.p(), bct.a.p(), false);
/*     */     } 
/*  56 */     for (i = 0; i < this.a; i++) {
/*  57 */       for (int k = 0; k < this.c; k++) {
/*  58 */         int m = -5;
/*  59 */         b(☃, bct.at.p(), i, -5, k, bwf1);
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     blc blc1 = bct.ek.p().a(bhx.a, eq.c);
/*  64 */     blc blc2 = bct.ek.p().a(bhx.a, eq.d);
/*  65 */     blc blc3 = bct.ek.p().a(bhx.a, eq.f);
/*  66 */     blc blc4 = bct.ek.p().a(bhx.a, eq.e);
/*     */ 
/*     */     
/*  69 */     a(☃, bwf1, 0, 0, 0, 4, 9, 4, bct.at.p(), bct.a.p(), false);
/*  70 */     a(☃, bwf1, 1, 10, 1, 3, 10, 3, bct.at.p(), bct.at.p(), false);
/*  71 */     a(☃, blc1, 2, 10, 0, bwf1);
/*  72 */     a(☃, blc2, 2, 10, 4, bwf1);
/*  73 */     a(☃, blc3, 0, 10, 2, bwf1);
/*  74 */     a(☃, blc4, 4, 10, 2, bwf1);
/*  75 */     a(☃, bwf1, this.a - 5, 0, 0, this.a - 1, 9, 4, bct.at.p(), bct.a.p(), false);
/*  76 */     a(☃, bwf1, this.a - 4, 10, 1, this.a - 2, 10, 3, bct.at.p(), bct.at.p(), false);
/*  77 */     a(☃, blc1, this.a - 3, 10, 0, bwf1);
/*  78 */     a(☃, blc2, this.a - 3, 10, 4, bwf1);
/*  79 */     a(☃, blc3, this.a - 5, 10, 2, bwf1);
/*  80 */     a(☃, blc4, this.a - 1, 10, 2, bwf1);
/*     */ 
/*     */     
/*  83 */     a(☃, bwf1, 8, 0, 0, 12, 4, 4, bct.at.p(), bct.a.p(), false);
/*  84 */     a(☃, bwf1, 9, 1, 0, 11, 3, 4, bct.a.p(), bct.a.p(), false);
/*  85 */     a(☃, bct.av.p(), 9, 1, 1, bwf1);
/*  86 */     a(☃, bct.av.p(), 9, 2, 1, bwf1);
/*  87 */     a(☃, bct.av.p(), 9, 3, 1, bwf1);
/*  88 */     a(☃, bct.av.p(), 10, 3, 1, bwf1);
/*  89 */     a(☃, bct.av.p(), 11, 3, 1, bwf1);
/*  90 */     a(☃, bct.av.p(), 11, 2, 1, bwf1);
/*  91 */     a(☃, bct.av.p(), 11, 1, 1, bwf1);
/*     */ 
/*     */     
/*  94 */     a(☃, bwf1, 4, 1, 1, 8, 3, 3, bct.at.p(), bct.a.p(), false);
/*  95 */     a(☃, bwf1, 4, 1, 2, 8, 2, 2, bct.a.p(), bct.a.p(), false);
/*  96 */     a(☃, bwf1, 12, 1, 1, 16, 3, 3, bct.at.p(), bct.a.p(), false);
/*  97 */     a(☃, bwf1, 12, 1, 2, 16, 2, 2, bct.a.p(), bct.a.p(), false);
/*     */ 
/*     */     
/* 100 */     a(☃, bwf1, 5, 4, 5, this.a - 6, 4, this.c - 6, bct.at.p(), bct.at.p(), false);
/* 101 */     a(☃, bwf1, 9, 4, 9, 11, 4, 11, bct.a.p(), bct.a.p(), false);
/* 102 */     a(☃, bwf1, 8, 1, 8, 8, 3, 8, bct.av.p(), bct.av.p(), false);
/* 103 */     a(☃, bwf1, 12, 1, 8, 12, 3, 8, bct.av.p(), bct.av.p(), false);
/* 104 */     a(☃, bwf1, 8, 1, 12, 8, 3, 12, bct.av.p(), bct.av.p(), false);
/* 105 */     a(☃, bwf1, 12, 1, 12, 12, 3, 12, bct.av.p(), bct.av.p(), false);
/*     */ 
/*     */     
/* 108 */     a(☃, bwf1, 1, 1, 5, 4, 4, 11, bct.at.p(), bct.at.p(), false);
/* 109 */     a(☃, bwf1, this.a - 5, 1, 5, this.a - 2, 4, 11, bct.at.p(), bct.at.p(), false);
/* 110 */     a(☃, bwf1, 6, 7, 9, 6, 7, 11, bct.at.p(), bct.at.p(), false);
/* 111 */     a(☃, bwf1, this.a - 7, 7, 9, this.a - 7, 7, 11, bct.at.p(), bct.at.p(), false);
/* 112 */     a(☃, bwf1, 5, 5, 9, 5, 7, 11, bct.av.p(), bct.av.p(), false);
/* 113 */     a(☃, bwf1, this.a - 6, 5, 9, this.a - 6, 7, 11, bct.av.p(), bct.av.p(), false);
/* 114 */     a(☃, bct.a.p(), 5, 5, 10, bwf1);
/* 115 */     a(☃, bct.a.p(), 5, 6, 10, bwf1);
/* 116 */     a(☃, bct.a.p(), 6, 6, 10, bwf1);
/* 117 */     a(☃, bct.a.p(), this.a - 6, 5, 10, bwf1);
/* 118 */     a(☃, bct.a.p(), this.a - 6, 6, 10, bwf1);
/* 119 */     a(☃, bct.a.p(), this.a - 7, 6, 10, bwf1);
/*     */ 
/*     */     
/* 122 */     a(☃, bwf1, 2, 4, 4, 2, 6, 4, bct.a.p(), bct.a.p(), false);
/* 123 */     a(☃, bwf1, this.a - 3, 4, 4, this.a - 3, 6, 4, bct.a.p(), bct.a.p(), false);
/* 124 */     a(☃, blc1, 2, 4, 5, bwf1);
/* 125 */     a(☃, blc1, 2, 3, 4, bwf1);
/* 126 */     a(☃, blc1, this.a - 3, 4, 5, bwf1);
/* 127 */     a(☃, blc1, this.a - 3, 3, 4, bwf1);
/* 128 */     a(☃, bwf1, 1, 1, 3, 2, 2, 3, bct.at.p(), bct.at.p(), false);
/* 129 */     a(☃, bwf1, this.a - 3, 1, 3, this.a - 2, 2, 3, bct.at.p(), bct.at.p(), false);
/* 130 */     a(☃, bct.at.p(), 1, 1, 2, bwf1);
/* 131 */     a(☃, bct.at.p(), this.a - 2, 1, 2, bwf1);
/* 132 */     a(☃, bct.bK.p(), 1, 2, 2, bwf1);
/* 133 */     a(☃, bct.bK.p(), this.a - 2, 2, 2, bwf1);
/* 134 */     a(☃, blc4, 2, 1, 2, bwf1);
/* 135 */     a(☃, blc3, this.a - 3, 1, 2, bwf1);
/*     */ 
/*     */     
/* 138 */     a(☃, bwf1, 4, 3, 5, 4, 3, 17, bct.at.p(), bct.at.p(), false);
/* 139 */     a(☃, bwf1, this.a - 5, 3, 5, this.a - 5, 3, 17, bct.at.p(), bct.at.p(), false);
/* 140 */     a(☃, bwf1, 3, 1, 5, 4, 2, 16, bct.a.p(), bct.a.p(), false);
/* 141 */     a(☃, bwf1, this.a - 6, 1, 5, this.a - 5, 2, 16, bct.a.p(), bct.a.p(), false); int j;
/* 142 */     for (j = 5; j <= 17; j += 2) {
/* 143 */       a(☃, bct.av.p(), 4, 1, j, bwf1);
/* 144 */       a(☃, bct.au.p(), 4, 2, j, bwf1);
/* 145 */       a(☃, bct.av.p(), this.a - 5, 1, j, bwf1);
/* 146 */       a(☃, bct.au.p(), this.a - 5, 2, j, bwf1);
/*     */     } 
/* 148 */     a(☃, bct.fF.p(), 10, 0, 7, bwf1);
/* 149 */     a(☃, bct.fF.p(), 10, 0, 8, bwf1);
/* 150 */     a(☃, bct.fF.p(), 9, 0, 9, bwf1);
/* 151 */     a(☃, bct.fF.p(), 11, 0, 9, bwf1);
/* 152 */     a(☃, bct.fF.p(), 8, 0, 10, bwf1);
/* 153 */     a(☃, bct.fF.p(), 12, 0, 10, bwf1);
/* 154 */     a(☃, bct.fF.p(), 7, 0, 10, bwf1);
/* 155 */     a(☃, bct.fF.p(), 13, 0, 10, bwf1);
/* 156 */     a(☃, bct.fF.p(), 9, 0, 11, bwf1);
/* 157 */     a(☃, bct.fF.p(), 11, 0, 11, bwf1);
/* 158 */     a(☃, bct.fF.p(), 10, 0, 12, bwf1);
/* 159 */     a(☃, bct.fF.p(), 10, 0, 13, bwf1);
/* 160 */     a(☃, bct.fP.p(), 10, 0, 10, bwf1);
/*     */ 
/*     */     
/* 163 */     for (j = 0; j <= this.a - 1; j += this.a - 1) {
/* 164 */       a(☃, bct.av.p(), j, 2, 1, bwf1);
/* 165 */       a(☃, bct.fF.p(), j, 2, 2, bwf1);
/* 166 */       a(☃, bct.av.p(), j, 2, 3, bwf1);
/* 167 */       a(☃, bct.av.p(), j, 3, 1, bwf1);
/* 168 */       a(☃, bct.fF.p(), j, 3, 2, bwf1);
/* 169 */       a(☃, bct.av.p(), j, 3, 3, bwf1);
/* 170 */       a(☃, bct.fF.p(), j, 4, 1, bwf1);
/* 171 */       a(☃, bct.au.p(), j, 4, 2, bwf1);
/* 172 */       a(☃, bct.fF.p(), j, 4, 3, bwf1);
/* 173 */       a(☃, bct.av.p(), j, 5, 1, bwf1);
/* 174 */       a(☃, bct.fF.p(), j, 5, 2, bwf1);
/* 175 */       a(☃, bct.av.p(), j, 5, 3, bwf1);
/* 176 */       a(☃, bct.fF.p(), j, 6, 1, bwf1);
/* 177 */       a(☃, bct.au.p(), j, 6, 2, bwf1);
/* 178 */       a(☃, bct.fF.p(), j, 6, 3, bwf1);
/* 179 */       a(☃, bct.fF.p(), j, 7, 1, bwf1);
/* 180 */       a(☃, bct.fF.p(), j, 7, 2, bwf1);
/* 181 */       a(☃, bct.fF.p(), j, 7, 3, bwf1);
/* 182 */       a(☃, bct.av.p(), j, 8, 1, bwf1);
/* 183 */       a(☃, bct.av.p(), j, 8, 2, bwf1);
/* 184 */       a(☃, bct.av.p(), j, 8, 3, bwf1);
/*     */     } 
/* 186 */     for (j = 2; j <= this.a - 3; j += this.a - 3 - 2) {
/* 187 */       a(☃, bct.av.p(), j - 1, 2, 0, bwf1);
/* 188 */       a(☃, bct.fF.p(), j, 2, 0, bwf1);
/* 189 */       a(☃, bct.av.p(), j + 1, 2, 0, bwf1);
/* 190 */       a(☃, bct.av.p(), j - 1, 3, 0, bwf1);
/* 191 */       a(☃, bct.fF.p(), j, 3, 0, bwf1);
/* 192 */       a(☃, bct.av.p(), j + 1, 3, 0, bwf1);
/* 193 */       a(☃, bct.fF.p(), j - 1, 4, 0, bwf1);
/* 194 */       a(☃, bct.au.p(), j, 4, 0, bwf1);
/* 195 */       a(☃, bct.fF.p(), j + 1, 4, 0, bwf1);
/* 196 */       a(☃, bct.av.p(), j - 1, 5, 0, bwf1);
/* 197 */       a(☃, bct.fF.p(), j, 5, 0, bwf1);
/* 198 */       a(☃, bct.av.p(), j + 1, 5, 0, bwf1);
/* 199 */       a(☃, bct.fF.p(), j - 1, 6, 0, bwf1);
/* 200 */       a(☃, bct.au.p(), j, 6, 0, bwf1);
/* 201 */       a(☃, bct.fF.p(), j + 1, 6, 0, bwf1);
/* 202 */       a(☃, bct.fF.p(), j - 1, 7, 0, bwf1);
/* 203 */       a(☃, bct.fF.p(), j, 7, 0, bwf1);
/* 204 */       a(☃, bct.fF.p(), j + 1, 7, 0, bwf1);
/* 205 */       a(☃, bct.av.p(), j - 1, 8, 0, bwf1);
/* 206 */       a(☃, bct.av.p(), j, 8, 0, bwf1);
/* 207 */       a(☃, bct.av.p(), j + 1, 8, 0, bwf1);
/*     */     } 
/* 209 */     a(☃, bwf1, 8, 4, 0, 12, 6, 0, bct.av.p(), bct.av.p(), false);
/* 210 */     a(☃, bct.a.p(), 8, 6, 0, bwf1);
/* 211 */     a(☃, bct.a.p(), 12, 6, 0, bwf1);
/* 212 */     a(☃, bct.fF.p(), 9, 5, 0, bwf1);
/* 213 */     a(☃, bct.au.p(), 10, 5, 0, bwf1);
/* 214 */     a(☃, bct.fF.p(), 11, 5, 0, bwf1);
/*     */ 
/*     */     
/* 217 */     a(☃, bwf1, 8, -14, 8, 12, -11, 12, bct.av.p(), bct.av.p(), false);
/* 218 */     a(☃, bwf1, 8, -10, 8, 12, -10, 12, bct.au.p(), bct.au.p(), false);
/* 219 */     a(☃, bwf1, 8, -9, 8, 12, -9, 12, bct.av.p(), bct.av.p(), false);
/* 220 */     a(☃, bwf1, 8, -8, 8, 12, -1, 12, bct.at.p(), bct.at.p(), false);
/* 221 */     a(☃, bwf1, 9, -11, 9, 11, -1, 11, bct.a.p(), bct.a.p(), false);
/* 222 */     a(☃, bct.cE.p(), 10, -11, 10, bwf1);
/* 223 */     a(☃, bwf1, 9, -13, 9, 11, -13, 11, bct.cb.p(), bct.a.p(), false);
/* 224 */     a(☃, bct.a.p(), 8, -11, 10, bwf1);
/* 225 */     a(☃, bct.a.p(), 8, -10, 10, bwf1);
/* 226 */     a(☃, bct.au.p(), 7, -10, 10, bwf1);
/* 227 */     a(☃, bct.av.p(), 7, -11, 10, bwf1);
/* 228 */     a(☃, bct.a.p(), 12, -11, 10, bwf1);
/* 229 */     a(☃, bct.a.p(), 12, -10, 10, bwf1);
/* 230 */     a(☃, bct.au.p(), 13, -10, 10, bwf1);
/* 231 */     a(☃, bct.av.p(), 13, -11, 10, bwf1);
/* 232 */     a(☃, bct.a.p(), 10, -11, 8, bwf1);
/* 233 */     a(☃, bct.a.p(), 10, -10, 8, bwf1);
/* 234 */     a(☃, bct.au.p(), 10, -10, 7, bwf1);
/* 235 */     a(☃, bct.av.p(), 10, -11, 7, bwf1);
/* 236 */     a(☃, bct.a.p(), 10, -11, 12, bwf1);
/* 237 */     a(☃, bct.a.p(), 10, -10, 12, bwf1);
/* 238 */     a(☃, bct.au.p(), 10, -10, 13, bwf1);
/* 239 */     a(☃, bct.av.p(), 10, -11, 13, bwf1);
/*     */ 
/*     */     
/* 242 */     for (eq eq : eq.c.a) {
/* 243 */       if (!this.e[eq.b()]) {
/* 244 */         int k = eq.g() * 2;
/* 245 */         int m = eq.i() * 2;
/* 246 */         this.e[eq.b()] = a(☃, bwf1, random, 10 + k, -11, 10 + m, ccl.k);
/*     */       } 
/*     */     } 
/*     */     
/* 250 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */