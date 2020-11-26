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
/*    */ public class kj
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private boolean b;
/*    */   private axv c;
/*    */   private bod d;
/*    */   private adi e;
/*    */   private int f;
/*    */   private ayg g;
/*    */   private boolean h;
/*    */   
/*    */   public kj() {}
/*    */   
/*    */   public kj(int ☃, axv axv1, boolean bool1, bod bod1, adi adi1, int i, ayg ayg1, boolean bool2) {
/* 31 */     this.a = ☃;
/* 32 */     this.d = bod1;
/* 33 */     this.e = adi1;
/* 34 */     this.c = axv1;
/* 35 */     this.f = i;
/* 36 */     this.b = bool1;
/* 37 */     this.g = ayg1;
/* 38 */     this.h = bool2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 43 */     this.a = ☃.readInt();
/*    */     
/* 45 */     int i = ☃.readUnsignedByte();
/* 46 */     this.b = ((i & 0x8) == 8);
/* 47 */     i &= 0xFFFFFFF7;
/* 48 */     this.c = axv.a(i);
/*    */     
/* 50 */     this.d = bod.a(☃.readInt());
/* 51 */     this.e = adi.a(☃.readUnsignedByte());
/* 52 */     this.f = ☃.readUnsignedByte();
/* 53 */     this.g = ayg.a(☃.e(16));
/* 54 */     if (this.g == null) {
/* 55 */       this.g = ayg.b;
/*    */     }
/* 57 */     this.h = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 62 */     ☃.writeInt(this.a);
/* 63 */     int i = this.c.a();
/* 64 */     if (this.b) {
/* 65 */       i |= 0x8;
/*    */     }
/* 67 */     ☃.writeByte(i);
/* 68 */     ☃.writeInt(this.d.c());
/* 69 */     ☃.writeByte(this.e.a());
/* 70 */     ☃.writeByte(this.f);
/* 71 */     ☃.a(this.g.a());
/* 72 */     ☃.writeBoolean(this.h);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 77 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */