/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lr
/*    */   implements iv<iy>
/*    */ {
/*    */   private long a;
/*    */   private long b;
/*    */   
/*    */   public lr() {}
/*    */   
/*    */   public lr(long ☃, long l1, boolean bool) {
/* 16 */     this.a = ☃;
/* 17 */     this.b = l1;
/*    */     
/* 19 */     if (!bool) {
/* 20 */       this.b = -this.b;
/* 21 */       if (this.b == 0L) {
/* 22 */         this.b = -1L;
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     this.a = ☃.readLong();
/* 30 */     this.b = ☃.readLong();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 35 */     ☃.writeLong(this.a);
/* 36 */     ☃.writeLong(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */