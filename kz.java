/*    */ import java.io.IOException;
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
/*    */ public class kz
/*    */   implements iv<iy>
/*    */ {
/*    */   private bod a;
/*    */   private adi b;
/*    */   private axv c;
/*    */   private ayg d;
/*    */   
/*    */   public kz() {}
/*    */   
/*    */   public kz(bod ☃, adi adi1, ayg ayg1, axv axv1) {
/* 24 */     this.a = ☃;
/* 25 */     this.b = adi1;
/* 26 */     this.c = axv1;
/* 27 */     this.d = ayg1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 32 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 37 */     this.a = bod.a(☃.readInt());
/* 38 */     this.b = adi.a(☃.readUnsignedByte());
/* 39 */     this.c = axv.a(☃.readUnsignedByte());
/* 40 */     this.d = ayg.a(☃.e(16));
/* 41 */     if (this.d == null) {
/* 42 */       this.d = ayg.b;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 48 */     ☃.writeInt(this.a.c());
/* 49 */     ☃.writeByte(this.b.a());
/* 50 */     ☃.writeByte(this.c.a());
/* 51 */     ☃.a(this.d.a());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */