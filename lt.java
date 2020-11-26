/*    */ import java.io.IOException;
/*    */ import org.apache.commons.lang3.Validate;
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
/*    */ public class lt
/*    */   implements iv<iy>
/*    */ {
/*    */   private wi a;
/*    */   private wk b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   private float f;
/*    */   private float g;
/*    */   
/*    */   public lt() {}
/*    */   
/*    */   public lt(wi ☃, wk wk1, double d1, double d2, double d3, float f1, float f2) {
/* 28 */     Validate.notNull(☃, "sound", new Object[0]);
/* 29 */     this.a = ☃;
/* 30 */     this.b = wk1;
/* 31 */     this.c = (int)(d1 * 8.0D);
/* 32 */     this.d = (int)(d2 * 8.0D);
/* 33 */     this.e = (int)(d3 * 8.0D);
/* 34 */     this.f = f1;
/* 35 */     this.g = f2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 40 */     this.a = fc.v.a(☃.g());
/* 41 */     this.b = ☃.<wk>a(wk.class);
/* 42 */     this.c = ☃.readInt();
/* 43 */     this.d = ☃.readInt();
/* 44 */     this.e = ☃.readInt();
/* 45 */     this.f = ☃.readFloat();
/* 46 */     this.g = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 51 */     ☃.d(fc.v.a(this.a));
/* 52 */     ☃.a(this.b);
/* 53 */     ☃.writeInt(this.c);
/* 54 */     ☃.writeInt(this.d);
/* 55 */     ☃.writeInt(this.e);
/* 56 */     ☃.writeFloat(this.f);
/* 57 */     ☃.writeFloat(this.g);
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
/* 90 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */