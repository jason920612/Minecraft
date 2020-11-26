/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Collection;
/*    */ import java.util.Optional;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class bmj
/*    */   extends blx<Integer>
/*    */ {
/*    */   private final ImmutableSet<Integer> a;
/*    */   
/*    */   protected bmj(String ☃, int i, int j) {
/* 14 */     super(☃, Integer.class);
/* 15 */     if (i < 0) {
/* 16 */       throw new IllegalArgumentException("Min value of " + ☃ + " must be 0 or greater");
/*    */     }
/* 18 */     if (j <= i) {
/* 19 */       throw new IllegalArgumentException("Max value of " + ☃ + " must be greater than min (" + i + ")");
/*    */     }
/*    */ 
/*    */     
/* 23 */     Set<Integer> set = Sets.newHashSet();
/* 24 */     for (int k = i; k <= j; k++) {
/* 25 */       set.add(Integer.valueOf(k));
/*    */     }
/*    */     
/* 28 */     this.a = ImmutableSet.copyOf(set);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<Integer> d() {
/* 33 */     return (Collection<Integer>)this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 38 */     if (this == ☃) {
/* 39 */       return true;
/*    */     }
/*    */     
/* 42 */     if (☃ instanceof bmj && super.equals(☃)) {
/* 43 */       bmj bmj1 = (bmj)☃;
/*    */       
/* 45 */       return this.a.equals(bmj1.a);
/*    */     } 
/*    */     
/* 48 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 53 */     return 31 * super.c() + this.a.hashCode();
/*    */   }
/*    */   
/*    */   public static bmj a(String ☃, int i, int j) {
/* 57 */     return new bmj(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<Integer> b(String ☃) {
/*    */     try {
/* 63 */       Integer integer = Integer.valueOf(☃);
/*    */       
/* 65 */       return this.a.contains(integer) ? Optional.<Integer>of(integer) : Optional.<Integer>empty();
/* 66 */     } catch (NumberFormatException numberFormatException) {
/* 67 */       return Optional.empty();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(Integer ☃) {
/* 73 */     return ☃.toString();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bmj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */