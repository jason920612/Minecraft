/*    */ import java.io.IOException;
/*    */ 
/*    */ public class nd implements iv<me> {
/*    */   private a a;
/*    */   private pc b;
/*    */   private boolean c;
/*    */   private boolean d;
/*    */   private boolean e;
/*    */   private boolean f;
/*    */   
/*    */   public enum a {
/* 12 */     a, b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public nd() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public nd(avk ☃) {
/* 28 */     this.a = a.a;
/* 29 */     this.b = ☃.b();
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
/*    */   public void a(hy ☃) throws IOException {
/* 42 */     this.a = ☃.<a>a(a.class);
/* 43 */     if (this.a == a.a) {
/* 44 */       this.b = ☃.l();
/* 45 */     } else if (this.a == a.b) {
/* 46 */       this.c = ☃.readBoolean();
/* 47 */       this.d = ☃.readBoolean();
/* 48 */       this.e = ☃.readBoolean();
/* 49 */       this.f = ☃.readBoolean();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 55 */     ☃.a(this.a);
/*    */     
/* 57 */     if (this.a == a.a) {
/* 58 */       ☃.a(this.b);
/* 59 */     } else if (this.a == a.b) {
/* 60 */       ☃.writeBoolean(this.c);
/* 61 */       ☃.writeBoolean(this.d);
/* 62 */       ☃.writeBoolean(this.e);
/* 63 */       ☃.writeBoolean(this.f);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 69 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public a b() {
/* 73 */     return this.a;
/*    */   }
/*    */   
/*    */   public pc c() {
/* 77 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 81 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 85 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 89 */     return this.e;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 93 */     return this.f;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\nd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */