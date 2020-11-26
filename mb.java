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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mb
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private byte b;
/*    */   private byte c;
/*    */   private int d;
/*    */   private byte e;
/*    */   
/*    */   public mb() {}
/*    */   
/*    */   public mb(int ☃, aek aek1) {
/* 28 */     this.a = ☃;
/* 29 */     this.b = (byte)(aej.a(aek1.a()) & 0xFF);
/* 30 */     this.c = (byte)(aek1.c() & 0xFF);
/* 31 */     if (aek1.b() > 32767) {
/* 32 */       this.d = 32767;
/*    */     } else {
/* 34 */       this.d = aek1.b();
/*    */     } 
/* 36 */     this.e = 0;
/*    */     
/* 38 */     if (aek1.d()) {
/* 39 */       this.e = (byte)(this.e | 0x1);
/*    */     }
/* 41 */     if (aek1.e()) {
/* 42 */       this.e = (byte)(this.e | 0x2);
/*    */     }
/* 44 */     if (aek1.f()) {
/* 45 */       this.e = (byte)(this.e | 0x4);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 51 */     this.a = ☃.g();
/* 52 */     this.b = ☃.readByte();
/* 53 */     this.c = ☃.readByte();
/* 54 */     this.d = ☃.g();
/* 55 */     this.e = ☃.readByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 60 */     ☃.d(this.a);
/* 61 */     ☃.writeByte(this.b);
/* 62 */     ☃.writeByte(this.c);
/* 63 */     ☃.d(this.d);
/* 64 */     ☃.writeByte(this.e);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 73 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\mb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */