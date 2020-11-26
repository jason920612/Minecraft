/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import java.util.UUID;
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
/*    */ public class je
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private UUID b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   private byte f;
/*    */   private byte g;
/*    */   private ou h;
/*    */   private List<ou.a<?>> i;
/*    */   
/*    */   public je() {}
/*    */   
/*    */   public je(aog ☃) {
/* 30 */     this.a = ☃.Q();
/* 31 */     this.b = ☃.do().getId();
/* 32 */     this.c = ☃.q;
/* 33 */     this.d = ☃.r;
/* 34 */     this.e = ☃.s;
/* 35 */     this.f = (byte)(int)(☃.w * 256.0F / 360.0F);
/* 36 */     this.g = (byte)(int)(☃.x * 256.0F / 360.0F);
/*    */     
/* 38 */     this.h = ☃.T();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 43 */     this.a = ☃.g();
/* 44 */     this.b = ☃.i();
/* 45 */     this.c = ☃.readDouble();
/* 46 */     this.d = ☃.readDouble();
/* 47 */     this.e = ☃.readDouble();
/* 48 */     this.f = ☃.readByte();
/* 49 */     this.g = ☃.readByte();
/* 50 */     this.i = ou.b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 55 */     ☃.d(this.a);
/* 56 */     ☃.a(this.b);
/* 57 */     ☃.writeDouble(this.c);
/* 58 */     ☃.writeDouble(this.d);
/* 59 */     ☃.writeDouble(this.e);
/* 60 */     ☃.writeByte(this.f);
/* 61 */     ☃.writeByte(this.g);
/* 62 */     this.h.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 67 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\je.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */