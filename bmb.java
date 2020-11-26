/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.Collection;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ public class bmb
/*    */   extends blx<Boolean>
/*    */ {
/*    */   private final ImmutableSet<Boolean> a;
/*    */   
/*    */   protected bmb(String ☃) {
/* 12 */     super(☃, Boolean.class);
/* 13 */     this.a = ImmutableSet.of(Boolean.valueOf(true), Boolean.valueOf(false));
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<Boolean> d() {
/* 18 */     return (Collection<Boolean>)this.a;
/*    */   }
/*    */   
/*    */   public static bmb a(String ☃) {
/* 22 */     return new bmb(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<Boolean> b(String ☃) {
/* 27 */     if ("true".equals(☃) || "false".equals(☃)) {
/* 28 */       return Optional.of(Boolean.valueOf(☃));
/*    */     }
/*    */     
/* 31 */     return Optional.empty();
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(Boolean ☃) {
/* 36 */     return ☃.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 41 */     if (this == ☃) {
/* 42 */       return true;
/*    */     }
/*    */     
/* 45 */     if (☃ instanceof bmb && super.equals(☃)) {
/* 46 */       bmb bmb1 = (bmb)☃;
/*    */       
/* 48 */       return this.a.equals(bmb1.a);
/*    */     } 
/*    */     
/* 51 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 56 */     return 31 * super.c() + this.a.hashCode();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bmb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */