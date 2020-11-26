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
/*    */ public class mj
/*    */   implements iv<me>
/*    */ {
/*    */   private String a;
/*    */   private int b;
/*    */   private aog.b c;
/*    */   private boolean d;
/*    */   private int e;
/*    */   private aez f;
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 35 */     this.a = ☃.e(16);
/* 36 */     this.b = ☃.readByte();
/*    */     
/* 38 */     this.c = ☃.<aog.b>a(aog.b.class);
/* 39 */     this.d = ☃.readBoolean();
/*    */     
/* 41 */     this.e = ☃.readUnsignedByte();
/* 42 */     this.f = ☃.<aez>a(aez.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 47 */     ☃.a(this.a);
/* 48 */     ☃.writeByte(this.b);
/* 49 */     ☃.a(this.c);
/* 50 */     ☃.writeBoolean(this.d);
/* 51 */     ☃.writeByte(this.e);
/* 52 */     ☃.a(this.f);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 57 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public String b() {
/* 61 */     return this.a;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public aog.b d() {
/* 69 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 73 */     return this.d;
/*    */   }
/*    */   
/*    */   public int f() {
/* 77 */     return this.e;
/*    */   }
/*    */   
/*    */   public aez g() {
/* 81 */     return this.f;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\mj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */