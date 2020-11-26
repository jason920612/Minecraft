/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class azt
/*    */   extends ayw
/*    */ {
/*    */   private final ayu c;
/*    */   
/*    */   public azt(azu ☃) {
/* 18 */     this.c = ☃.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public ayu a(el ☃, @Nullable ayu ayu1) {
/* 23 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public ayu[] a(int ☃, int i, int j, int k) {
/* 28 */     return b(☃, i, j, k);
/*    */   }
/*    */ 
/*    */   
/*    */   public ayu[] a(int ☃, int i, int j, int k, boolean bool) {
/* 33 */     ayu[] arrayOfAyu = new ayu[j * k];
/* 34 */     Arrays.fill((Object[])arrayOfAyu, 0, j * k, this.c);
/* 35 */     return arrayOfAyu;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public el a(int ☃, int i, int j, List<ayu> list, Random random) {
/* 41 */     if (list.contains(this.c)) {
/* 42 */       return new el(☃ - j + random.nextInt(j * 2 + 1), 0, i - j + random.nextInt(j * 2 + 1));
/*    */     }
/*    */     
/* 45 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(btl<?> ☃) {
/* 50 */     return ((Boolean)this.a.computeIfAbsent(☃, this.c::a)).booleanValue();
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<blc> b() {
/* 55 */     if (this.b.isEmpty()) {
/* 56 */       this.b.add(this.c.r().a());
/*    */     }
/* 58 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Set<ayu> a(int ☃, int i, int j) {
/* 68 */     return Sets.newHashSet((Object[])new ayu[] { this.c });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\azt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */