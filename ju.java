/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ju
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private List<ate> b;
/*    */   
/*    */   public ju() {}
/*    */   
/*    */   public ju(int ☃, ez<ate> ez1) {
/* 21 */     this.a = ☃;
/* 22 */     this.b = ez.a(ez1.size(), ate.a);
/* 23 */     for (int i = 0; i < this.b.size(); i++) {
/* 24 */       this.b.set(i, ((ate)ez1.get(i)).i());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = ☃.readUnsignedByte();
/* 31 */     int i = ☃.readShort();
/* 32 */     this.b = ez.a(i, ate.a);
/* 33 */     for (int j = 0; j < i; j++) {
/* 34 */       this.b.set(j, ☃.k());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 40 */     ☃.writeByte(this.a);
/* 41 */     ☃.writeShort(this.b.size());
/* 42 */     for (ate ate : this.b) {
/* 43 */       ☃.a(ate);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 49 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */