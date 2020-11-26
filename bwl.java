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
/*     */ public class bwl
/*     */ {
/*  28 */   private static final bxn a = (new bxn()).a(true);
/*  29 */   private static final bxn b = (new bxn()).a(true).a(bct.a);
/*     */   
/*     */   public static void a() {
/*  32 */     bwy.a((Class)a.class, "ECP");
/*     */   }
/*     */   
/*     */   private static a b(bxm ☃, a a1, el el1, String str, bhb bhb1, boolean bool) {
/*  36 */     a a2 = new a(☃, str, a1.c, bhb1, bool);
/*  37 */     el el2 = a1.a.a(a1.b, el1, a2.b, el.a);
/*  38 */     a2.a(el2.o(), el2.p(), el2.q());
/*     */     
/*  40 */     return a2;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends bxe
/*     */   {
/*     */     private String d;
/*     */     private bhb e;
/*     */     private boolean f;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     public a(bxm ☃, String str, el el1, bhb bhb1, boolean bool) {
/*  53 */       super(0);
/*     */       
/*  55 */       this.d = str;
/*  56 */       this.c = el1;
/*  57 */       this.e = bhb1;
/*  58 */       this.f = bool;
/*     */       
/*  60 */       a(☃);
/*     */     }
/*     */     
/*     */     private void a(bxm ☃) {
/*  64 */       bxp bxp = ☃.a(new pc("end_city/" + this.d));
/*  65 */       bxn bxn = (this.f ? bwl.b() : bwl.c()).a().a(this.e);
/*     */       
/*  67 */       a(bxp, this.c, bxn);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃) {
/*  72 */       super.a(☃);
/*     */       
/*  74 */       ☃.a("Template", this.d);
/*  75 */       ☃.a("Rot", this.e.name());
/*  76 */       ☃.a("OW", this.f);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(gy ☃, bxm bxm1) {
/*  81 */       super.a(☃, bxm1);
/*     */       
/*  83 */       this.d = ☃.l("Template");
/*  84 */       this.e = bhb.valueOf(☃.l("Rot"));
/*  85 */       this.f = ☃.q("OW");
/*     */       
/*  87 */       a(bxm1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(String ☃, el el1, axz axz1, Random random, bwf bwf1) {
/*  92 */       if (☃.startsWith("Chest")) {
/*  93 */         el el2 = el1.b();
/*     */         
/*  95 */         if (bwf1.b(el2)) {
/*  96 */           bka.a(axz1, random, el2, ccl.c);
/*     */         }
/*  98 */       } else if (☃.startsWith("Sentry")) {
/*  99 */         anl anl = new anl(axz1.f());
/* 100 */         anl.b(el1.o() + 0.5D, el1.p() + 0.5D, el1.q() + 0.5D);
/* 101 */         anl.g(el1);
/* 102 */         axz1.a(anl);
/* 103 */       } else if (☃.startsWith("Elytra")) {
/* 104 */         amb amb = new amb(axz1.f(), el1, this.e.a(eq.d));
/* 105 */         amb.b(new ate(atf.eL));
/* 106 */         axz1.a(amb);
/*     */       } 
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
/*     */   public static void a(bxm ☃, el el1, bhb bhb1, List<bxb> list, Random random) {
/* 120 */     h.a();
/* 121 */     c.a();
/* 122 */     f.a();
/* 123 */     e.a();
/*     */     
/* 125 */     a a = b(list, new a(☃, "base_floor", el1, bhb1, true));
/* 126 */     a = b(list, b(☃, a, new el(-1, 0, -1), "second_floor_1", bhb1, false));
/* 127 */     a = b(list, b(☃, a, new el(-1, 4, -1), "third_floor_1", bhb1, false));
/* 128 */     a = b(list, b(☃, a, new el(-1, 8, -1), "third_roof", bhb1, true));
/*     */     
/* 130 */     b(☃, e, 1, a, null, list, random);
/*     */   }
/*     */   
/*     */   private static a b(List<bxb> ☃, a a1) {
/* 134 */     ☃.add(a1);
/* 135 */     return a1;
/*     */   }
/*     */   
/*     */   private static boolean b(bxm ☃, b b1, int i, a a1, el el1, List<bxb> list, Random random) {
/* 139 */     if (i > 8) {
/* 140 */       return false;
/*     */     }
/*     */     
/* 143 */     List<bxb> list1 = Lists.newArrayList();
/* 144 */     if (b1.a(☃, i, a1, el1, list1, random)) {
/*     */       
/* 146 */       boolean bool = false;
/* 147 */       int j = random.nextInt();
/* 148 */       for (bxb bxb1 : list1) {
/* 149 */         bxb1.o = j;
/* 150 */         bxb bxb2 = bxb.a(list, bxb1.d());
/* 151 */         if (bxb2 != null && bxb2.o != a1.o) {
/* 152 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 156 */       if (!bool) {
/* 157 */         list.addAll(list1);
/* 158 */         return true;
/*     */       } 
/*     */     } 
/* 161 */     return false;
/*     */   }
/*     */   
/* 164 */   private static final b c = new b()
/*     */     {
/*     */       public void a() {}
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean a(bxm ☃, int i, bwl.a a1, el el1, List<bxb> list, Random random) {
/* 171 */         if (i > 8) {
/* 172 */           return false;
/*     */         }
/*     */         
/* 175 */         bhb bhb = a1.b.c();
/* 176 */         bwl.a a2 = bwl.a(list, bwl.a(☃, a1, el1, "base_floor", bhb, true));
/*     */         
/* 178 */         int j = random.nextInt(3);
/* 179 */         if (j == 0) {
/* 180 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 4, -1), "base_roof", bhb, true));
/* 181 */         } else if (j == 1) {
/* 182 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 0, -1), "second_floor_2", bhb, false));
/* 183 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 8, -1), "second_roof", bhb, false));
/*     */           
/* 185 */           bwl.a(☃, bwl.d(), i + 1, a2, null, list, random);
/* 186 */         } else if (j == 2) {
/* 187 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 0, -1), "second_floor_2", bhb, false));
/* 188 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 4, -1), "third_floor_2", bhb, false));
/* 189 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 8, -1), "third_roof", bhb, true));
/*     */           
/* 191 */           bwl.a(☃, bwl.d(), i + 1, a2, null, list, random);
/*     */         } 
/* 193 */         return true;
/*     */       }
/*     */     };
/*     */   
/* 197 */   private static final List<xx<bhb, el>> d = Lists.newArrayList((Object[])new xx[] { new xx<>(bhb.a, new el(1, -1, 0)), new xx<>(bhb.b, new el(6, -1, 1)), new xx<>(bhb.d, new el(0, -1, 5)), new xx<>(bhb.c, new el(5, -1, 6)) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 204 */   private static final b e = new b()
/*     */     {
/*     */       public void a() {}
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean a(bxm ☃, int i, bwl.a a1, el el1, List<bxb> list, Random random) {
/* 211 */         bhb bhb = a1.b.c();
/* 212 */         bwl.a a2 = a1;
/* 213 */         a2 = bwl.a(list, bwl.a(☃, a2, new el(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", bhb, true));
/* 214 */         a2 = bwl.a(list, bwl.a(☃, a2, new el(0, 7, 0), "tower_piece", bhb, true));
/*     */         
/* 216 */         bwl.a a3 = (random.nextInt(3) == 0) ? a2 : null;
/*     */         
/* 218 */         int j = 1 + random.nextInt(3);
/* 219 */         for (int k = 0; k < j; k++) {
/* 220 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(0, 4, 0), "tower_piece", bhb, true));
/* 221 */           if (k < j - 1 && random.nextBoolean()) {
/* 222 */             a3 = a2;
/*     */           }
/*     */         } 
/*     */         
/* 226 */         if (a3 != null) {
/* 227 */           for (xx<bhb, el> xx : (Iterable<xx<bhb, el>>)bwl.e()) {
/* 228 */             if (random.nextBoolean()) {
/*     */               
/* 230 */               bwl.a a4 = bwl.a(list, bwl.a(☃, a3, xx.b(), "bridge_end", bhb.a(xx.a()), true));
/* 231 */               bwl.a(☃, bwl.f(), i + 1, a4, null, list, random);
/*     */             } 
/*     */           } 
/*     */           
/* 235 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 4, -1), "tower_top", bhb, true));
/*     */         }
/* 237 */         else if (i == 7) {
/* 238 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 4, -1), "tower_top", bhb, true));
/*     */         } else {
/* 240 */           return bwl.a(☃, bwl.g(), i + 1, a2, null, list, random);
/*     */         } 
/*     */         
/* 243 */         return true;
/*     */       }
/*     */     };
/*     */   
/* 247 */   private static final b f = new b()
/*     */     {
/*     */       public boolean a;
/*     */       
/*     */       public void a() {
/* 252 */         this.a = false;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean a(bxm ☃, int i, bwl.a a1, el el1, List<bxb> list, Random random) {
/* 257 */         bhb bhb = a1.b.c();
/* 258 */         int j = random.nextInt(4) + 1;
/*     */         
/* 260 */         bwl.a a2 = bwl.a(list, bwl.a(☃, a1, new el(0, 0, -4), "bridge_piece", bhb, true));
/* 261 */         a2.o = -1;
/* 262 */         int k = 0;
/* 263 */         for (int m = 0; m < j; m++) {
/* 264 */           if (random.nextBoolean()) {
/* 265 */             a2 = bwl.a(list, bwl.a(☃, a2, new el(0, k, -4), "bridge_piece", bhb, true));
/* 266 */             k = 0;
/*     */           } else {
/* 268 */             if (random.nextBoolean()) {
/* 269 */               a2 = bwl.a(list, bwl.a(☃, a2, new el(0, k, -4), "bridge_steep_stairs", bhb, true));
/*     */             } else {
/* 271 */               a2 = bwl.a(list, bwl.a(☃, a2, new el(0, k, -8), "bridge_gentle_stairs", bhb, true));
/*     */             } 
/* 273 */             k = 4;
/*     */           } 
/*     */         } 
/*     */         
/* 277 */         if (this.a || random.nextInt(10 - i) != 0) {
/* 278 */           if (!bwl.a(☃, bwl.h(), i + 1, a2, new el(-3, k + 1, -11), list, random)) {
/* 279 */             return false;
/*     */           }
/*     */         } else {
/*     */           
/* 283 */           bwl.a(list, bwl.a(☃, a2, new el(-8 + random.nextInt(8), k, -70 + random.nextInt(10)), "ship", bhb, true));
/* 284 */           this.a = true;
/*     */         } 
/*     */ 
/*     */         
/* 288 */         a2 = bwl.a(list, bwl.a(☃, a2, new el(4, k, 0), "bridge_end", bhb.a(bhb.c), true));
/* 289 */         a2.o = -1;
/*     */         
/* 291 */         return true;
/*     */       }
/*     */     };
/*     */   
/* 295 */   private static final List<xx<bhb, el>> g = Lists.newArrayList((Object[])new xx[] { new xx<>(bhb.a, new el(4, -1, 0)), new xx<>(bhb.b, new el(12, -1, 4)), new xx<>(bhb.d, new el(0, -1, 8)), new xx<>(bhb.c, new el(8, -1, 12)) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 302 */   private static final b h = new b()
/*     */     {
/*     */       public void a() {}
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean a(bxm ☃, int i, bwl.a a1, el el1, List<bxb> list, Random random) {
/* 310 */         bhb bhb = a1.b.c();
/*     */         
/* 312 */         bwl.a a2 = bwl.a(list, bwl.a(☃, a1, new el(-3, 4, -3), "fat_tower_base", bhb, true));
/* 313 */         a2 = bwl.a(list, bwl.a(☃, a2, new el(0, 4, 0), "fat_tower_middle", bhb, true));
/* 314 */         for (int j = 0; j < 2 && 
/* 315 */           random.nextInt(3) != 0; j++) {
/*     */ 
/*     */           
/* 318 */           a2 = bwl.a(list, bwl.a(☃, a2, new el(0, 8, 0), "fat_tower_middle", bhb, true));
/*     */           
/* 320 */           for (xx<bhb, el> xx : (Iterable<xx<bhb, el>>)bwl.i()) {
/* 321 */             if (random.nextBoolean()) {
/*     */               
/* 323 */               bwl.a a3 = bwl.a(list, bwl.a(☃, a2, xx.b(), "bridge_end", bhb.a(xx.a()), true));
/* 324 */               bwl.a(☃, bwl.f(), i + 1, a3, null, list, random);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 329 */         a2 = bwl.a(list, bwl.a(☃, a2, new el(-2, 8, -2), "fat_tower_top", bhb, true));
/* 330 */         return true;
/*     */       }
/*     */     };
/*     */   
/*     */   static interface b {
/*     */     void a();
/*     */     
/*     */     boolean a(bxm param1bxm, int param1Int, bwl.a param1a, el param1el, List<bxb> param1List, Random param1Random);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */