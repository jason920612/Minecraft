/*    */ import java.util.Random;
/*    */ import javax.annotation.Nonnull;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ep<V>
/*    */   extends ey<V>
/*    */ {
/*    */   private final pc x;
/*    */   private V y;
/*    */   
/*    */   public ep(pc ☃) {
/* 16 */     this.x = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃, pc pc1, V v) {
/* 21 */     if (this.x.equals(pc1)) {
/* 22 */       this.y = v;
/*    */     }
/*    */     
/* 25 */     super.a(☃, pc1, v);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(@Nullable V ☃) {
/* 34 */     int i = super.a(☃);
/* 35 */     return (i == -1) ? super.a(this.y) : i;
/*    */   }
/*    */ 
/*    */   
/*    */   public pc b(V ☃) {
/* 40 */     pc pc1 = super.b(☃);
/* 41 */     return (pc1 == null) ? this.x : pc1;
/*    */   }
/*    */ 
/*    */   
/*    */   public V a(@Nullable pc ☃) {
/* 46 */     V v = b(☃);
/* 47 */     return (v == null) ? this.y : v;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public V a(int ☃) {
/* 53 */     V v = super.a(☃);
/* 54 */     return (v == null) ? this.y : v;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public V a(Random ☃) {
/* 60 */     V v = super.a(☃);
/* 61 */     return (v == null) ? this.y : v;
/*    */   }
/*    */ 
/*    */   
/*    */   public pc b() {
/* 66 */     return this.x;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */