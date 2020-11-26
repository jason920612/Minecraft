/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends bxc
/*     */ {
/*  92 */   private final Set<axm> e = Sets.newHashSet();
/*     */   
/*     */   private boolean f;
/*     */ 
/*     */   
/*     */   public a() {}
/*     */   
/*     */   public a(axz ☃, boz boz1, int i, int j, ayu ayu1) {
/* 100 */     super(i, j, ayu1, boz1, ☃.r_());
/* 101 */     b(☃, boz1, i, j);
/*     */   }
/*     */   
/*     */   private void b(axk ☃, Random random, int i, int j) {
/* 105 */     int k = i * 16 - 29;
/* 106 */     int m = j * 16 - 29;
/* 107 */     eq eq = eq.c.a.a(random);
/*     */     
/* 109 */     this.a.add(new bws.h(random, k, m, eq));
/* 110 */     a(☃);
/*     */     
/* 112 */     this.f = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axz ☃, Random random, bwf bwf1, axm axm1) {
/* 117 */     if (!this.f) {
/* 118 */       this.a.clear();
/* 119 */       b(☃, random, e(), f());
/*     */     } 
/* 121 */     super.a(☃, random, bwf1, axm1);
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
/*     */   public void b(axm ☃) {
/* 134 */     super.b(☃);
/*     */     
/* 136 */     this.e.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 141 */     super.a(☃);
/*     */     
/* 143 */     he he = new he();
/* 144 */     for (axm axm : this.e) {
/* 145 */       gy gy1 = new gy();
/* 146 */       gy1.b("X", axm.a);
/* 147 */       gy1.b("Z", axm.b);
/* 148 */       he.a(gy1);
/*     */     } 
/* 150 */     ☃.a("Processed", he);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 155 */     super.b(☃);
/*     */     
/* 157 */     if (☃.c("Processed", 9)) {
/* 158 */       he he = ☃.d("Processed", 10);
/* 159 */       for (int i = 0; i < he.size(); i++) {
/* 160 */         gy gy1 = he.e(i);
/* 161 */         this.e.add(new axm(gy1.h("X"), gy1.h("Z")));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bsb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */