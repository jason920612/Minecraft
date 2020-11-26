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
/*     */ final class null
/*     */   implements bwl.b
/*     */ {
/*     */   public void a() {}
/*     */   
/*     */   public boolean a(bxm ☃, int i, bwl.a a1, el el1, List<bxb> list, Random random) {
/* 171 */     if (i > 8) {
/* 172 */       return false;
/*     */     }
/*     */     
/* 175 */     bhb bhb = a1.b.c();
/* 176 */     bwl.a a2 = bwl.a(list, bwl.a(☃, a1, el1, "base_floor", bhb, true));
/*     */     
/* 178 */     int j = random.nextInt(3);
/* 179 */     if (j == 0) {
/* 180 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 4, -1), "base_roof", bhb, true));
/* 181 */     } else if (j == 1) {
/* 182 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 0, -1), "second_floor_2", bhb, false));
/* 183 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 8, -1), "second_roof", bhb, false));
/*     */       
/* 185 */       bwl.a(☃, bwl.d(), i + 1, a2, null, list, random);
/* 186 */     } else if (j == 2) {
/* 187 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 0, -1), "second_floor_2", bhb, false));
/* 188 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 4, -1), "third_floor_2", bhb, false));
/* 189 */       a2 = bwl.a(list, bwl.a(☃, a2, new el(-1, 8, -1), "third_roof", bhb, true));
/*     */       
/* 191 */       bwl.a(☃, bwl.d(), i + 1, a2, null, list, random);
/*     */     } 
/* 193 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwl$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */