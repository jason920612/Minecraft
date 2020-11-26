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
/*    */ public class a
/*    */   extends kl
/*    */ {
/*    */   public a() {}
/*    */   
/*    */   public a(int ☃, long l1, long l2, long l3, boolean bool) {
/* 73 */     super(☃);
/*    */ 
/*    */     
/* 76 */     this.b = (int)l1;
/* 77 */     this.c = (int)l2;
/* 78 */     this.d = (int)l3;
/* 79 */     this.g = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 84 */     super.a(☃);
/* 85 */     this.b = ☃.readShort();
/* 86 */     this.c = ☃.readShort();
/* 87 */     this.d = ☃.readShort();
/* 88 */     this.g = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 93 */     super.b(☃);
/* 94 */     ☃.writeShort(this.b);
/* 95 */     ☃.writeShort(this.c);
/* 96 */     ☃.writeShort(this.d);
/* 97 */     ☃.writeBoolean(this.g);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kl$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */