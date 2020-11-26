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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends bxe
/*     */ {
/*     */   private bwt.b d;
/*     */   private float e;
/*     */   private pc f;
/*     */   private bhb g;
/*     */   private boolean h;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   public a(bxm ☃, pc pc1, el el1, bhb bhb1, float f, bwt.b b1, boolean bool) {
/* 198 */     super(0);
/*     */     
/* 200 */     this.f = pc1;
/* 201 */     this.c = el1;
/* 202 */     this.g = bhb1;
/* 203 */     this.e = f;
/* 204 */     this.d = b1;
/* 205 */     this.h = bool;
/*     */     
/* 207 */     a(☃);
/*     */   }
/*     */   
/*     */   private void a(bxm ☃) {
/* 211 */     bxp bxp = ☃.a(this.f);
/* 212 */     bxn bxn = (new bxn()).a(this.g).a(bfz.a).a(bct.a);
/* 213 */     a(bxp, this.c, bxn);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 218 */     super.a(☃);
/* 219 */     ☃.a("Template", this.f.toString());
/* 220 */     ☃.a("Rot", this.g.name());
/* 221 */     ☃.a("Integrity", this.e);
/* 222 */     ☃.a("BiomeType", this.d.toString());
/* 223 */     ☃.a("IsLarge", this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/* 228 */     super.a(☃, bxm1);
/* 229 */     this.f = new pc(☃.l("Template"));
/* 230 */     this.g = bhb.valueOf(☃.l("Rot"));
/* 231 */     this.e = ☃.j("Integrity");
/* 232 */     this.d = bwt.b.valueOf(☃.l("BiomeType"));
/* 233 */     this.h = ☃.q("IsLarge");
/* 234 */     a(bxm1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, el el1, axz axz1, Random random, bwf bwf1) {
/* 239 */     if ("chest".equals(☃)) {
/* 240 */       axz1.a(el1, bct.ck.p().a(bdh.c, Boolean.valueOf(axz1.b(el1).a(ww.a))), 2);
/*     */       
/* 242 */       bji bji = axz1.f(el1);
/* 243 */       if (bji instanceof bjl) {
/* 244 */         ((bjl)bji).a(this.h ? ccl.q : ccl.p, random.nextLong());
/*     */       }
/*     */     }
/* 247 */     else if ("drowned".equals(☃)) {
/* 248 */       amu amu = new amu(axz1.f());
/* 249 */       amu.di();
/* 250 */       amu.a(el1, 0.0F, 0.0F);
/* 251 */       amu.a(axz1.h(el1), (afj)null, (gy)null);
/* 252 */       axz1.a(amu);
/* 253 */       if (el1.p() > axz1.k()) {
/* 254 */         axz1.a(el1, bct.a.p(), 2);
/*     */       } else {
/* 256 */         axz1.a(el1, bct.A.p(), 2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 263 */     this.b.a(this.e);
/* 264 */     int i = ☃.a(bor.a.b, this.c.o(), this.c.q());
/* 265 */     this.c = new el(this.c.o(), i, this.c.q());
/* 266 */     el el = bxp.a(new el(this.a.a().o() - 1, 0, this.a.a().q() - 1), bfz.a, this.g, new el(0, 0, 0)).a(this.c);
/* 267 */     this.c = new el(this.c.o(), a(this.c, ☃, el), this.c.q());
/*     */     
/* 269 */     return super.a(☃, random, bwf1, axm1);
/*     */   }
/*     */   
/*     */   private int a(el ☃, axk axk1, el el1) {
/* 273 */     int i = ☃.p();
/* 274 */     int j = 512;
/* 275 */     int k = i - 1;
/* 276 */     int m = 0;
/* 277 */     for (el el2 : el.a(☃, el1)) {
/* 278 */       int i1 = el2.o();
/* 279 */       int i2 = el2.q();
/* 280 */       int i3 = ☃.p() - 1;
/* 281 */       el.a a1 = new el.a(i1, i3, i2);
/* 282 */       blc blc = axk1.a_(a1);
/* 283 */       byw byw = axk1.b(a1);
/* 284 */       while ((blc.f() || byw.a(ww.a) || blc.c().a(wv.E)) && i3 > 1) {
/* 285 */         i3--;
/* 286 */         a1.c(i1, i3, i2);
/* 287 */         blc = axk1.a_(a1);
/* 288 */         byw = axk1.b(a1);
/*     */       } 
/*     */       
/* 291 */       j = Math.min(j, i3);
/* 292 */       if (i3 < k - 2) {
/* 293 */         m++;
/*     */       }
/*     */     } 
/*     */     
/* 297 */     int n = Math.abs(☃.o() - el1.o());
/* 298 */     if (k - j > 2 && m > n - 2) {
/* 299 */       i = j + 1;
/*     */     }
/*     */     
/* 302 */     return i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */