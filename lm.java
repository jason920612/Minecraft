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
/*    */ public class lm
/*    */   implements iv<iy>
/*    */ {
/*    */   private String a;
/*    */   private ij b;
/*    */   private cff.a c;
/*    */   private int d;
/*    */   
/*    */   public lm() {}
/*    */   
/*    */   public lm(cez ☃, int i) {
/* 25 */     this.a = ☃.b();
/* 26 */     this.b = ☃.d();
/* 27 */     this.c = ☃.f();
/* 28 */     this.d = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 33 */     this.a = ☃.e(16);
/* 34 */     this.d = ☃.readByte();
/*    */     
/* 36 */     if (this.d == 0 || this.d == 2) {
/* 37 */       this.b = ☃.f();
/* 38 */       this.c = ☃.<cff.a>a(cff.a.class);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 44 */     ☃.a(this.a);
/* 45 */     ☃.writeByte(this.d);
/*    */     
/* 47 */     if (this.d == 0 || this.d == 2) {
/* 48 */       ☃.a(this.b);
/* 49 */       ☃.a(this.c);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 55 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */