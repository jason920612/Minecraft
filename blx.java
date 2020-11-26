/*    */ import com.google.common.base.MoreObjects;
/*    */ 
/*    */ public abstract class blx<T extends Comparable<T>>
/*    */   implements bmm<T>
/*    */ {
/*    */   private final Class<T> a;
/*    */   private final String b;
/*    */   private Integer c;
/*    */   
/*    */   protected blx(String ☃, Class<T> clazz) {
/* 11 */     this.a = clazz;
/* 12 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 17 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<T> b() {
/* 22 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 27 */     return MoreObjects.toStringHelper(this)
/* 28 */       .add("name", this.b)
/* 29 */       .add("clazz", this.a)
/* 30 */       .add("values", d())
/* 31 */       .toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 36 */     if (this == ☃) {
/* 37 */       return true;
/*    */     }
/*    */     
/* 40 */     if (☃ instanceof blx) {
/* 41 */       blx<?> blx1 = (blx)☃;
/*    */       
/* 43 */       return (this.a.equals(blx1.a) && this.b.equals(blx1.b));
/*    */     } 
/*    */     
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public final int hashCode() {
/* 51 */     if (this.c == null) {
/* 52 */       this.c = Integer.valueOf(c());
/*    */     }
/* 54 */     return this.c.intValue();
/*    */   }
/*    */   
/*    */   public int c() {
/* 58 */     return 31 * this.a.hashCode() + this.b.hashCode();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\blx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */