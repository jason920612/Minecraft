/*    */ import java.io.IOException;
/*    */ import java.util.Objects;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lp
/*    */   implements iv<iy>
/*    */ {
/* 14 */   private String a = "";
/*    */   
/*    */   @Nullable
/*    */   private String b;
/*    */   
/*    */   private int c;
/*    */   
/*    */   private pr.a d;
/*    */   
/*    */   public lp(pr.a ☃, @Nullable String str1, String str2, int i) {
/* 24 */     if (☃ != pr.a.b && str1 == null) {
/* 25 */       throw new IllegalArgumentException("Need an objective name");
/*    */     }
/* 27 */     this.a = str2;
/* 28 */     this.b = str1;
/* 29 */     this.c = i;
/* 30 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 35 */     this.a = ☃.e(40);
/* 36 */     this.d = ☃.<pr.a>a(pr.a.class);
/* 37 */     String str = ☃.e(16);
/* 38 */     this.b = Objects.equals(str, "") ? null : str;
/*    */     
/* 40 */     if (this.d != pr.a.b) {
/* 41 */       this.c = ☃.g();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 47 */     ☃.a(this.a);
/* 48 */     ☃.a(this.d);
/* 49 */     ☃.a((this.b == null) ? "" : this.b);
/*    */     
/* 51 */     if (this.d != pr.a.b) {
/* 52 */       ☃.d(this.c);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 58 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public lp() {}
/*    */ }


/* Location:              F:\dw\server.jar!\lp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */