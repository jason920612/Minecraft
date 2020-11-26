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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends bwq.c
/*     */ {
/* 137 */   private final List<bwf> b = Lists.newLinkedList();
/*     */ 
/*     */   
/*     */   public d() {}
/*     */ 
/*     */   
/*     */   public d(int ☃, Random random, int i, int j, bru.b b1) {
/* 144 */     super(☃, b1);
/* 145 */     this.a = b1;
/*     */     
/* 147 */     this.n = new bwf(i, 50, j, i + 7 + random.nextInt(6), 54 + random.nextInt(6), j + 7 + random.nextInt(6));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bxb ☃, List<bxb> list, Random random) {
/* 152 */     int i = e();
/*     */ 
/*     */ 
/*     */     
/* 156 */     int k = this.n.d() - 3 - 1;
/* 157 */     if (k <= 0) {
/* 158 */       k = 1;
/*     */     }
/*     */ 
/*     */     
/* 162 */     int j = 0;
/* 163 */     while (j < this.n.c()) {
/* 164 */       j += random.nextInt(this.n.c());
/* 165 */       if (j + 3 > this.n.c()) {
/*     */         break;
/*     */       }
/* 168 */       bwq.c c1 = bwq.a(☃, list, random, this.n.a + j, this.n.b + random.nextInt(k) + 1, this.n.c - 1, eq.c, i);
/* 169 */       if (c1 != null) {
/* 170 */         bwf bwf = c1.d();
/* 171 */         this.b.add(new bwf(bwf.a, bwf.b, this.n.c, bwf.d, bwf.e, this.n.c + 1));
/*     */       } 
/* 173 */       j += 4;
/*     */     } 
/*     */     
/* 176 */     j = 0;
/* 177 */     while (j < this.n.c()) {
/* 178 */       j += random.nextInt(this.n.c());
/* 179 */       if (j + 3 > this.n.c()) {
/*     */         break;
/*     */       }
/* 182 */       bwq.c c1 = bwq.a(☃, list, random, this.n.a + j, this.n.b + random.nextInt(k) + 1, this.n.f + 1, eq.d, i);
/* 183 */       if (c1 != null) {
/* 184 */         bwf bwf = c1.d();
/* 185 */         this.b.add(new bwf(bwf.a, bwf.b, this.n.f - 1, bwf.d, bwf.e, this.n.f));
/*     */       } 
/* 187 */       j += 4;
/*     */     } 
/*     */     
/* 190 */     j = 0;
/* 191 */     while (j < this.n.e()) {
/* 192 */       j += random.nextInt(this.n.e());
/* 193 */       if (j + 3 > this.n.e()) {
/*     */         break;
/*     */       }
/* 196 */       bwq.c c1 = bwq.a(☃, list, random, this.n.a - 1, this.n.b + random.nextInt(k) + 1, this.n.c + j, eq.e, i);
/* 197 */       if (c1 != null) {
/* 198 */         bwf bwf = c1.d();
/* 199 */         this.b.add(new bwf(this.n.a, bwf.b, bwf.c, this.n.a + 1, bwf.e, bwf.f));
/*     */       } 
/* 201 */       j += 4;
/*     */     } 
/*     */     
/* 204 */     j = 0;
/* 205 */     while (j < this.n.e()) {
/* 206 */       j += random.nextInt(this.n.e());
/* 207 */       if (j + 3 > this.n.e()) {
/*     */         break;
/*     */       }
/* 210 */       bxb bxb1 = bwq.a(☃, list, random, this.n.d + 1, this.n.b + random.nextInt(k) + 1, this.n.c + j, eq.f, i);
/* 211 */       if (bxb1 != null) {
/* 212 */         bwf bwf = bxb1.d();
/* 213 */         this.b.add(new bwf(this.n.d - 1, bwf.b, bwf.c, this.n.d, bwf.e, bwf.f));
/*     */       } 
/* 215 */       j += 4;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 221 */     if (a(☃, bwf1)) {
/* 222 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 226 */     a(☃, bwf1, this.n.a, this.n.b, this.n.c, this.n.d, this.n.b, this.n.f, bct.j.p(), m, true);
/*     */ 
/*     */     
/* 229 */     a(☃, bwf1, this.n.a, this.n.b + 1, this.n.c, this.n.d, Math.min(this.n.b + 3, this.n.e), this.n.f, m, m, false);
/* 230 */     for (bwf bwf2 : this.b) {
/* 231 */       a(☃, bwf1, bwf2.a, bwf2.e - 2, bwf2.c, bwf2.d, bwf2.e, bwf2.f, m, m, false);
/*     */     }
/* 233 */     a(☃, bwf1, this.n.a, this.n.b + 4, this.n.c, this.n.d, this.n.e, this.n.f, m, false);
/*     */     
/* 235 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 240 */     super.a(☃, i, j);
/* 241 */     for (bwf bwf : this.b) {
/* 242 */       bwf.a(☃, i, j);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 248 */     super.a(☃);
/* 249 */     he he = new he();
/* 250 */     for (bwf bwf : this.b) {
/* 251 */       he.a(bwf.g());
/*     */     }
/* 253 */     ☃.a("Entrances", he);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃, bxm bxm1) {
/* 258 */     super.a(☃, bxm1);
/* 259 */     he he = ☃.d("Entrances", 11);
/* 260 */     for (int i = 0; i < he.size(); i++)
/* 261 */       this.b.add(new bwf(he.i(i))); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwq$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */