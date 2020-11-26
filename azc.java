/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class azc
/*    */   extends ayw
/*    */ {
/*    */   private final ayu[] c;
/*    */   private final int d;
/*    */   
/*    */   public azc(azd ☃) {
/* 19 */     this.c = ☃.a();
/* 20 */     this.d = ☃.b() + 4;
/*    */   }
/*    */ 
/*    */   
/*    */   public ayu a(el ☃, @Nullable ayu ayu1) {
/* 25 */     return this.c[Math.abs(((☃.o() >> this.d) + (☃.q() >> this.d)) % this.c.length)];
/*    */   }
/*    */ 
/*    */   
/*    */   public ayu[] a(int ☃, int i, int j, int k) {
/* 30 */     return b(☃, i, j, k);
/*    */   }
/*    */ 
/*    */   
/*    */   public ayu[] a(int ☃, int i, int j, int k, boolean bool) {
/* 35 */     ayu[] arrayOfAyu = new ayu[j * k];
/*    */     
/* 37 */     for (int m = 0; m < k; m++) {
/* 38 */       for (int n = 0; n < j; n++) {
/* 39 */         int i1 = Math.abs(((☃ + m >> this.d) + (i + n >> this.d)) % this.c.length);
/* 40 */         ayu ayu1 = this.c[i1];
/* 41 */         arrayOfAyu[m * j + n] = ayu1;
/*    */       } 
/*    */     } 
/* 44 */     return arrayOfAyu;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public el a(int ☃, int i, int j, List<ayu> list, Random random) {
/* 50 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(btl<?> ☃) {
/* 55 */     return ((Boolean)this.a.computeIfAbsent(☃, ☃ -> { for (ayu ayu1 : this.c) { if (ayu1.a(☃)) return Boolean.valueOf(true);  }  return Boolean.valueOf(false); })).booleanValue();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Set<blc> b() {
/* 67 */     if (this.b.isEmpty()) {
/* 68 */       for (ayu ☃ : this.c) {
/* 69 */         this.b.add(☃.r().a());
/*    */       }
/*    */     }
/* 72 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Set<ayu> a(int ☃, int i, int j) {
/* 82 */     return Sets.newHashSet((Object[])this.c);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\azc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */