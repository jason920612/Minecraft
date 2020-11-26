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
/*     */ 
/*     */ abstract class p
/*     */   extends bxb
/*     */ {
/* 223 */   protected a d = a.a;
/*     */ 
/*     */   
/*     */   public p() {}
/*     */ 
/*     */   
/*     */   protected p(int ☃) {
/* 230 */     super(☃);
/*     */   }
/*     */   
/*     */   public enum a {
/* 234 */     a, b, c, d;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 239 */     ☃.a("EntryDoor", this.d.name());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/* 244 */     this.d = a.valueOf(☃.l("EntryDoor"));
/*     */   }
/*     */   
/*     */   protected void a(axz ☃, Random random, bwf bwf1, a a1, int i, int j, int k) {
/* 248 */     switch (bwx.null.a[a1.ordinal()]) {
/*     */       case 1:
/* 250 */         a(☃, bwf1, i, j, k, i + 3 - 1, j + 3 - 1, k, m, m, false);
/*     */         break;
/*     */       case 2:
/* 253 */         a(☃, bct.dy.p(), i, j, k, bwf1);
/* 254 */         a(☃, bct.dy.p(), i, j + 1, k, bwf1);
/* 255 */         a(☃, bct.dy.p(), i, j + 2, k, bwf1);
/* 256 */         a(☃, bct.dy.p(), i + 1, j + 2, k, bwf1);
/* 257 */         a(☃, bct.dy.p(), i + 2, j + 2, k, bwf1);
/* 258 */         a(☃, bct.dy.p(), i + 2, j + 1, k, bwf1);
/* 259 */         a(☃, bct.dy.p(), i + 2, j, k, bwf1);
/* 260 */         a(☃, bct.ct.p(), i + 1, j, k, bwf1);
/* 261 */         a(☃, bct.ct.p().a(bed.p, bmg.a), i + 1, j + 1, k, bwf1);
/*     */         break;
/*     */       case 3:
/* 264 */         a(☃, bct.jI.p(), i + 1, j, k, bwf1);
/* 265 */         a(☃, bct.jI.p(), i + 1, j + 1, k, bwf1);
/* 266 */         a(☃, bct.dF.p().a(bfm.o, Boolean.valueOf(true)), i, j, k, bwf1);
/* 267 */         a(☃, bct.dF.p().a(bfm.o, Boolean.valueOf(true)), i, j + 1, k, bwf1);
/* 268 */         a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)).a(bfm.o, Boolean.valueOf(true)), i, j + 2, k, bwf1);
/* 269 */         a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)).a(bfm.o, Boolean.valueOf(true)), i + 1, j + 2, k, bwf1);
/* 270 */         a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)).a(bfm.o, Boolean.valueOf(true)), i + 2, j + 2, k, bwf1);
/* 271 */         a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)), i + 2, j + 1, k, bwf1);
/* 272 */         a(☃, bct.dF.p().a(bfm.b, Boolean.valueOf(true)), i + 2, j, k, bwf1);
/*     */         break;
/*     */       case 4:
/* 275 */         a(☃, bct.dy.p(), i, j, k, bwf1);
/* 276 */         a(☃, bct.dy.p(), i, j + 1, k, bwf1);
/* 277 */         a(☃, bct.dy.p(), i, j + 2, k, bwf1);
/* 278 */         a(☃, bct.dy.p(), i + 1, j + 2, k, bwf1);
/* 279 */         a(☃, bct.dy.p(), i + 2, j + 2, k, bwf1);
/* 280 */         a(☃, bct.dy.p(), i + 2, j + 1, k, bwf1);
/* 281 */         a(☃, bct.dy.p(), i + 2, j, k, bwf1);
/* 282 */         a(☃, bct.cF.p(), i + 1, j, k, bwf1);
/* 283 */         a(☃, bct.cF.p().a(bed.p, bmg.a), i + 1, j + 1, k, bwf1);
/* 284 */         a(☃, bct.cP.p().a(bdb.D, eq.c), i + 2, j + 1, k + 1, bwf1);
/* 285 */         a(☃, bct.cP.p().a(bdb.D, eq.d), i + 2, j + 1, k - 1, bwf1);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected a a(Random ☃) {
/* 291 */     int i = ☃.nextInt(5);
/* 292 */     switch (i)
/*     */     
/*     */     { 
/*     */       default:
/* 296 */         return a.a;
/*     */       case 2:
/* 298 */         return a.b;
/*     */       case 3:
/* 300 */         return a.c;
/*     */       case 4:
/* 302 */         break; }  return a.d;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected bxb a(bwx.m ☃, List<bxb> list, Random random, int i, int j) {
/* 308 */     eq eq = f();
/* 309 */     if (eq != null) {
/* 310 */       switch (bwx.null.b[eq.ordinal()]) {
/*     */         case 1:
/* 312 */           return bwx.a(☃, list, random, this.n.a + i, this.n.b + j, this.n.c - 1, eq, e());
/*     */         case 2:
/* 314 */           return bwx.a(☃, list, random, this.n.a + i, this.n.b + j, this.n.f + 1, eq, e());
/*     */         case 3:
/* 316 */           return bwx.a(☃, list, random, this.n.a - 1, this.n.b + j, this.n.c + i, eq, e());
/*     */         case 4:
/* 318 */           return bwx.a(☃, list, random, this.n.d + 1, this.n.b + j, this.n.c + i, eq, e());
/*     */       } 
/*     */     }
/* 321 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bxb b(bwx.m ☃, List<bxb> list, Random random, int i, int j) {
/* 326 */     eq eq = f();
/* 327 */     if (eq != null) {
/* 328 */       switch (bwx.null.b[eq.ordinal()]) {
/*     */         case 1:
/* 330 */           return bwx.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e());
/*     */         case 2:
/* 332 */           return bwx.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, eq.e, e());
/*     */         case 3:
/* 334 */           return bwx.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e());
/*     */         case 4:
/* 336 */           return bwx.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, eq.c, e());
/*     */       } 
/*     */     }
/* 339 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected bxb c(bwx.m ☃, List<bxb> list, Random random, int i, int j) {
/* 344 */     eq eq = f();
/* 345 */     if (eq != null) {
/* 346 */       switch (bwx.null.b[eq.ordinal()]) {
/*     */         case 1:
/* 348 */           return bwx.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e());
/*     */         case 2:
/* 350 */           return bwx.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, eq.f, e());
/*     */         case 3:
/* 352 */           return bwx.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e());
/*     */         case 4:
/* 354 */           return bwx.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, eq.d, e());
/*     */       } 
/*     */     }
/* 357 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(bwf ☃) {
/* 361 */     return (☃ != null && ☃.b > 10);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwx$p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */