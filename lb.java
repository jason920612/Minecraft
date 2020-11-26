/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lb
/*    */   implements iv<iy>
/*    */ {
/*    */   @Nullable
/*    */   private pc a;
/*    */   
/*    */   public lb() {}
/*    */   
/*    */   public lb(@Nullable pc ☃) {
/* 19 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 24 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     if (☃.readBoolean()) {
/* 30 */       this.a = ☃.l();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 36 */     ☃.writeBoolean((this.a != null));
/* 37 */     if (this.a != null)
/* 38 */       ☃.a(this.a); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */