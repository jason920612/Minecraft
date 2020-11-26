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
/*    */ public class nk
/*    */   implements iv<me>
/*    */ {
/*    */   private el a;
/*    */   private String b;
/*    */   private boolean c;
/*    */   private boolean d;
/*    */   private boolean e;
/*    */   private bjm.a f;
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 37 */     this.a = ☃.e();
/* 38 */     this.b = ☃.e(32767);
/* 39 */     this.f = ☃.<bjm.a>a(bjm.a.class);
/* 40 */     int i = ☃.readByte();
/* 41 */     this.c = ((i & 0x1) != 0);
/* 42 */     this.d = ((i & 0x2) != 0);
/* 43 */     this.e = ((i & 0x4) != 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 48 */     ☃.a(this.a);
/* 49 */     ☃.a(this.b);
/* 50 */     ☃.a(this.f);
/* 51 */     int i = 0;
/* 52 */     if (this.c) {
/* 53 */       i |= 0x1;
/*    */     }
/* 55 */     if (this.d) {
/* 56 */       i |= 0x2;
/*    */     }
/* 58 */     if (this.e) {
/* 59 */       i |= 0x4;
/*    */     }
/* 61 */     ☃.writeByte(i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 66 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public el b() {
/* 70 */     return this.a;
/*    */   }
/*    */   
/*    */   public String c() {
/* 74 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 78 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 82 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 86 */     return this.e;
/*    */   }
/*    */   
/*    */   public bjm.a g() {
/* 90 */     return this.f;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\nk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */