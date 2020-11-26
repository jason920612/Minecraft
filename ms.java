/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class ms
/*    */   implements iv<me>
/*    */ {
/*    */   private int a;
/*    */   private a b;
/*    */   private cee c;
/*    */   private adk d;
/*    */   
/*    */   public ms() {}
/*    */   
/*    */   public ms(aer ☃) {
/* 24 */     this.a = ☃.Q();
/* 25 */     this.b = a.b;
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
/*    */   public void a(hy ☃) throws IOException {
/* 43 */     this.a = ☃.g();
/* 44 */     this.b = ☃.<a>a(a.class);
/* 45 */     if (this.b == a.c) {
/* 46 */       this.c = new cee(☃.readFloat(), ☃.readFloat(), ☃.readFloat());
/*    */     }
/* 48 */     if (this.b == a.a || this.b == a.c) {
/* 49 */       this.d = ☃.<adk>a(adk.class);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 55 */     ☃.d(this.a);
/* 56 */     ☃.a(this.b);
/* 57 */     if (this.b == a.c) {
/* 58 */       ☃.writeFloat((float)this.c.b);
/* 59 */       ☃.writeFloat((float)this.c.c);
/* 60 */       ☃.writeFloat((float)this.c.d);
/*    */     } 
/* 62 */     if (this.b == a.a || this.b == a.c) {
/* 63 */       ☃.a(this.d);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 69 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public aer a(axy ☃) {
/* 74 */     return ☃.a(this.a);
/*    */   }
/*    */   
/*    */   public a b() {
/* 78 */     return this.b;
/*    */   }
/*    */   
/*    */   public adk c() {
/* 82 */     return this.d;
/*    */   }
/*    */   
/*    */   public cee d() {
/* 86 */     return this.c;
/*    */   }
/*    */   
/*    */   public enum a {
/* 90 */     a,
/* 91 */     b,
/* 92 */     c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ms.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */