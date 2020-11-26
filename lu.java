/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lu
/*    */   implements iv<iy>
/*    */ {
/*    */   private pc a;
/*    */   private wk b;
/*    */   
/*    */   public lu() {}
/*    */   
/*    */   public lu(@Nullable pc ☃, @Nullable wk wk1) {
/* 23 */     this.a = ☃;
/* 24 */     this.b = wk1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     int i = ☃.readByte();
/* 30 */     if ((i & 0x1) > 0) {
/* 31 */       this.b = ☃.<wk>a(wk.class);
/*    */     }
/* 33 */     if ((i & 0x2) > 0) {
/* 34 */       this.a = ☃.l();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 40 */     if (this.b != null) {
/* 41 */       if (this.a != null) {
/* 42 */         ☃.writeByte(3);
/* 43 */         ☃.a(this.b);
/* 44 */         ☃.a(this.a);
/*    */       } else {
/* 46 */         ☃.writeByte(1);
/* 47 */         ☃.a(this.b);
/*    */       }
/*    */     
/* 50 */     } else if (this.a != null) {
/* 51 */       ☃.writeByte(2);
/* 52 */       ☃.a(this.a);
/*    */     } else {
/* 54 */       ☃.writeByte(0);
/*    */     } 
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 71 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */