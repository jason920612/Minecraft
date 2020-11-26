/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ls
/*    */   implements iv<iy>
/*    */ {
/*    */   private a a;
/*    */   private ij b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public ls() {}
/*    */   
/*    */   public ls(a ☃, ij ij1) {
/* 22 */     this(☃, ij1, -1, -1, -1);
/*    */   }
/*    */   
/*    */   public ls(int ☃, int i, int j) {
/* 26 */     this(a.d, null, ☃, i, j);
/*    */   }
/*    */   
/*    */   public ls(a ☃, @Nullable ij ij1, int i, int j, int k) {
/* 30 */     this.a = ☃;
/* 31 */     this.b = ij1;
/* 32 */     this.c = i;
/* 33 */     this.d = j;
/* 34 */     this.e = k;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 39 */     this.a = ☃.<a>a(a.class);
/* 40 */     if (this.a == a.a || this.a == a.b || this.a == a.c) {
/* 41 */       this.b = ☃.f();
/*    */     }
/* 43 */     if (this.a == a.d) {
/* 44 */       this.c = ☃.readInt();
/* 45 */       this.d = ☃.readInt();
/* 46 */       this.e = ☃.readInt();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 52 */     ☃.a(this.a);
/* 53 */     if (this.a == a.a || this.a == a.b || this.a == a.c) {
/* 54 */       ☃.a(this.b);
/*    */     }
/* 56 */     if (this.a == a.d) {
/* 57 */       ☃.writeInt(this.c);
/* 58 */       ☃.writeInt(this.d);
/* 59 */       ☃.writeInt(this.e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 65 */     ☃.a(this);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public enum a
/*    */   {
/* 89 */     a,
/* 90 */     b,
/* 91 */     c,
/* 92 */     d,
/* 93 */     e,
/* 94 */     f;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ls.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */