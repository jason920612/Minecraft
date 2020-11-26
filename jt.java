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
/*    */ public class jt
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   private ij c;
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public jt() {}
/*    */   
/*    */   public jt(int ☃, String str, ij ij1) {
/* 26 */     this(☃, str, ij1, 0);
/*    */   }
/*    */   
/*    */   public jt(int ☃, String str, ij ij1, int i) {
/* 30 */     this.a = ☃;
/* 31 */     this.b = str;
/* 32 */     this.c = ij1;
/* 33 */     this.d = i;
/*    */   }
/*    */   
/*    */   public jt(int ☃, String str, ij ij1, int i, int j) {
/* 37 */     this(☃, str, ij1, i);
/* 38 */     this.e = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 43 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 48 */     this.a = ☃.readUnsignedByte();
/* 49 */     this.b = ☃.e(32);
/* 50 */     this.c = ☃.f();
/* 51 */     this.d = ☃.readUnsignedByte();
/* 52 */     if (this.b.equals("EntityHorse")) {
/* 53 */       this.e = ☃.readInt();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 59 */     ☃.writeByte(this.a);
/* 60 */     ☃.a(this.b);
/* 61 */     ☃.a(this.c);
/* 62 */     ☃.writeByte(this.d);
/* 63 */     if (this.b.equals("EntityHorse"))
/* 64 */       ☃.writeInt(this.e); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */