/*    */ import java.io.IOException;
/*    */ 
/*    */ public class kq
/*    */   implements iv<iy>
/*    */ {
/*    */   public a a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public ij e;
/*    */   
/*    */   public enum a
/*    */   {
/* 14 */     a,
/* 15 */     b,
/* 16 */     c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public kq() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public kq(adz ☃, a a1) {
/* 31 */     this(☃, a1, new iq(""));
/*    */   }
/*    */   
/*    */   public kq(adz ☃, a a1, ij ij1) {
/* 35 */     this.a = a1;
/*    */     
/* 37 */     afa afa = ☃.c();
/*    */     
/* 39 */     switch (null.a[a1.ordinal()]) {
/*    */       case 1:
/* 41 */         this.d = ☃.f();
/* 42 */         this.c = (afa == null) ? -1 : afa.Q();
/*    */         break;
/*    */       case 2:
/* 45 */         this.b = ☃.h().Q();
/* 46 */         this.c = (afa == null) ? -1 : afa.Q();
/* 47 */         this.e = ij1;
/*    */         break;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 54 */     this.a = ☃.<a>a(a.class);
/*    */     
/* 56 */     if (this.a == a.b) {
/* 57 */       this.d = ☃.g();
/* 58 */       this.c = ☃.readInt();
/* 59 */     } else if (this.a == a.c) {
/* 60 */       this.b = ☃.g();
/* 61 */       this.c = ☃.readInt();
/* 62 */       this.e = ☃.f();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 68 */     ☃.a(this.a);
/*    */     
/* 70 */     if (this.a == a.b) {
/* 71 */       ☃.d(this.d);
/* 72 */       ☃.writeInt(this.c);
/* 73 */     } else if (this.a == a.c) {
/* 74 */       ☃.d(this.b);
/* 75 */       ☃.writeInt(this.c);
/* 76 */       ☃.a(this.e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 82 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 87 */     return (this.a == a.c);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */