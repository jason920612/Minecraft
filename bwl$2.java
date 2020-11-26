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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class null
/*     */   implements bwl.b
/*     */ {
/*     */   public void a() {}
/*     */   
/*     */   public boolean a(bxm ☃, int i, bwl.a a1, el el1, List<bxb> list, Random random) {
/* 211 */     bhb bhb = a1.b.c();
/* 212 */     bwl.a a2 = a1;
/* 213 */     a2 = bwl.a(list, bwl.a(☃, a2, new el(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", bhb, true));
/* 214 */     a2 = bwl.a(list, bwl.a(☃, a2, new el(0, 7, 0), "tower_piece", bhb, true));
/*     */     
/* 216 */     bwl.a a3 = (random.nextInt(3) == 0) ? a2 : null;
/*     */     
/* 218 */     int j = 1 + random.nextInt(3);
/* 219 */     for (int k = 0; k < j; k++) {
/* 220 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(0, 4, 0), "tower_piece", bhb, true));
/* 221 */       if (k < j - 1 && random.nextBoolean()) {
/* 222 */         a3 = a2;
/*     */       }
/*     */     } 
/*     */     
/* 226 */     if (a3 != null) {
/* 227 */       for (xx<bhb, el> xx : (Iterable<xx<bhb, el>>)bwl.e()) {
/* 228 */         if (random.nextBoolean()) {
/*     */           
/* 230 */           bwl.a a4 = bwl.a(list, bwl.a(☃, a3, xx.b(), "bridge_end", bhb.a(xx.a()), true));
/* 231 */           bwl.a(☃, bwl.f(), i + 1, a4, null, list, random);
/*     */         } 
/*     */       } 
/*     */       
/* 235 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 4, -1), "tower_top", bhb, true));
/*     */     }
/* 237 */     else if (i == 7) {
/* 238 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 4, -1), "tower_top", bhb, true));
/*     */     } else {
/* 240 */       return bwl.a(☃, bwl.g(), i + 1, a2, null, list, random);
/*     */     } 
/*     */     
/* 243 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwl$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */