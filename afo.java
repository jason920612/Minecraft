/*    */ import io.netty.util.internal.ThreadLocalRandom;
/*    */ import java.util.Random;
/*    */ import java.util.UUID;
/*    */ import java.util.function.Supplier;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afo
/*    */ {
/*    */   private final double a;
/*    */   private final int b;
/*    */   private final Supplier<String> c;
/*    */   private final UUID d;
/*    */   private boolean e = true;
/*    */   
/*    */   public afo(String ☃, double d, int i) {
/* 23 */     this(xq.a((Random)ThreadLocalRandom.current()), () -> ☃, d, i);
/*    */   }
/*    */   
/*    */   public afo(UUID ☃, String str, double d, int i) {
/* 27 */     this(☃, () -> ☃, d, i);
/*    */   }
/*    */   
/*    */   public afo(UUID ☃, Supplier<String> supplier, double d, int i) {
/* 31 */     this.d = ☃;
/* 32 */     this.c = supplier;
/* 33 */     this.a = d;
/* 34 */     this.b = i;
/*    */     
/* 36 */     Validate.inclusiveBetween(0L, 2L, i, "Invalid operation");
/*    */   }
/*    */   
/*    */   public UUID a() {
/* 40 */     return this.d;
/*    */   }
/*    */   
/*    */   public String b() {
/* 44 */     return this.c.get();
/*    */   }
/*    */   
/*    */   public int c() {
/* 48 */     return this.b;
/*    */   }
/*    */   
/*    */   public double d() {
/* 52 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 56 */     return this.e;
/*    */   }
/*    */   
/*    */   public afo a(boolean ☃) {
/* 60 */     this.e = ☃;
/* 61 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 66 */     if (this == ☃) {
/* 67 */       return true;
/*    */     }
/* 69 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 70 */       return false;
/*    */     }
/*    */     
/* 73 */     afo afo1 = (afo)☃;
/*    */     
/* 75 */     if ((this.d != null) ? !this.d.equals(afo1.d) : (afo1.d != null)) {
/* 76 */       return false;
/*    */     }
/*    */     
/* 79 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 84 */     return (this.d != null) ? this.d.hashCode() : 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 89 */     return "AttributeModifier{amount=" + this.a + ", operation=" + this.b + ", name='" + (String)this.c
/*    */ 
/*    */       
/* 92 */       .get() + '\'' + ", id=" + this.d + ", serialize=" + this.e + '}';
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\afo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */