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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nc
/*    */   implements iv<me>
/*    */ {
/*    */   private float a;
/*    */   private float b;
/*    */   private boolean c;
/*    */   private boolean d;
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 29 */     this.a = ☃.readFloat();
/* 30 */     this.b = ☃.readFloat();
/*    */     
/* 32 */     byte b = ☃.readByte();
/* 33 */     this.c = ((b & 0x1) > 0);
/* 34 */     this.d = ((b & 0x2) > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 39 */     ☃.writeFloat(this.a);
/* 40 */     ☃.writeFloat(this.b);
/*    */     
/* 42 */     byte b = 0;
/* 43 */     if (this.c) {
/* 44 */       b = (byte)(b | 0x1);
/*    */     }
/* 46 */     if (this.d) {
/* 47 */       b = (byte)(b | 0x2);
/*    */     }
/* 49 */     ☃.writeByte(b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 54 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public float b() {
/* 58 */     return this.a;
/*    */   }
/*    */   
/*    */   public float c() {
/* 62 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 66 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 70 */     return this.d;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\nc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */