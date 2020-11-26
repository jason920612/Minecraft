/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private boolean e;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   public a(axz ☃, bmy<?> bmy1, boz boz1, int i, int j, ayu ayu1) {
/*  86 */     super(i, j, ayu1, boz1, ☃.r_());
/*  87 */     btu btu = (btu)bmy1.b(ayu1, (btl)bqo.e);
/*     */     
/*  89 */     List<bxh.e> list = bxh.a(boz1, btu.a);
/*     */     
/*  91 */     bxh.k k = new bxh.k(0, boz1, (i << 4) + 2, (j << 4) + 2, list, btu);
/*  92 */     this.a.add(k);
/*  93 */     k.a(k, this.a, boz1);
/*     */     
/*  95 */     List<bxb> list1 = k.e;
/*  96 */     List<bxb> list2 = k.d;
/*  97 */     while (!list1.isEmpty() || !list2.isEmpty()) {
/*     */       
/*  99 */       if (list1.isEmpty()) {
/* 100 */         int i1 = boz1.nextInt(list2.size());
/* 101 */         bxb bxb1 = list2.remove(i1);
/* 102 */         bxb1.a(k, this.a, boz1); continue;
/*     */       } 
/* 104 */       int n = boz1.nextInt(list1.size());
/* 105 */       bxb bxb = list1.remove(n);
/* 106 */       bxb.a(k, this.a, boz1);
/*     */     } 
/*     */ 
/*     */     
/* 110 */     a(☃);
/*     */     
/* 112 */     int m = 0;
/* 113 */     for (bxb bxb : this.a) {
/* 114 */       if (!(bxb instanceof bxh.p)) {
/* 115 */         m++;
/*     */       }
/*     */     } 
/* 118 */     this.e = (m > 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 123 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 128 */     super.a(☃);
/*     */     
/* 130 */     ☃.a("Valid", this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 135 */     super.b(☃);
/* 136 */     this.e = ☃.q("Valid");
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\btv$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */