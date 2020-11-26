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
/*    */ public class jz
/*    */   implements iv<iy>
/*    */ {
/*    */   private pc a;
/*    */   private wk b;
/*    */   private int c;
/* 17 */   private int d = Integer.MAX_VALUE;
/*    */   
/*    */   private int e;
/*    */   
/*    */   private float f;
/*    */   
/*    */   private float g;
/*    */ 
/*    */   
/*    */   public jz(pc ☃, wk wk1, cee cee1, float f1, float f2) {
/* 27 */     this.a = ☃;
/* 28 */     this.b = wk1;
/* 29 */     this.c = (int)(cee1.b * 8.0D);
/* 30 */     this.d = (int)(cee1.c * 8.0D);
/* 31 */     this.e = (int)(cee1.d * 8.0D);
/* 32 */     this.f = f1;
/* 33 */     this.g = f2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 38 */     this.a = ☃.l();
/* 39 */     this.b = ☃.<wk>a(wk.class);
/* 40 */     this.c = ☃.readInt();
/* 41 */     this.d = ☃.readInt();
/* 42 */     this.e = ☃.readInt();
/* 43 */     this.f = ☃.readFloat();
/* 44 */     this.g = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 49 */     ☃.a(this.a);
/* 50 */     ☃.a(this.b);
/* 51 */     ☃.writeInt(this.c);
/* 52 */     ☃.writeInt(this.d);
/* 53 */     ☃.writeInt(this.e);
/* 54 */     ☃.writeFloat(this.f);
/* 55 */     ☃.writeFloat(this.g);
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
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 88 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public jz() {}
/*    */ }


/* Location:              F:\dw\server.jar!\jz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */