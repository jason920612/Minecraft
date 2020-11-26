/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ly
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private byte e;
/*    */   private byte f;
/*    */   private boolean g;
/*    */   
/*    */   public ly() {}
/*    */   
/*    */   public ly(aer ☃) {
/* 22 */     this.a = ☃.Q();
/* 23 */     this.b = ☃.q;
/* 24 */     this.c = ☃.r;
/* 25 */     this.d = ☃.s;
/* 26 */     this.e = (byte)(int)(☃.w * 256.0F / 360.0F);
/* 27 */     this.f = (byte)(int)(☃.x * 256.0F / 360.0F);
/* 28 */     this.g = ☃.A;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 33 */     this.a = ☃.g();
/* 34 */     this.b = ☃.readDouble();
/* 35 */     this.c = ☃.readDouble();
/* 36 */     this.d = ☃.readDouble();
/* 37 */     this.e = ☃.readByte();
/* 38 */     this.f = ☃.readByte();
/* 39 */     this.g = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 44 */     ☃.d(this.a);
/* 45 */     ☃.writeDouble(this.b);
/* 46 */     ☃.writeDouble(this.c);
/* 47 */     ☃.writeDouble(this.d);
/* 48 */     ☃.writeByte(this.e);
/* 49 */     ☃.writeByte(this.f);
/* 50 */     ☃.writeBoolean(this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 55 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */