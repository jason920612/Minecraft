/*    */ import java.util.Comparator;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class cfb
/*    */ {
/*    */   static {
/*  7 */     a = ((☃, cfb1) -> (☃.b() > cfb1.b()) ? 1 : ((☃.b() < cfb1.b()) ? -1 : cfb1.e().compareToIgnoreCase(☃.e())));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Comparator<cfb> a;
/*    */   
/*    */   private final cfc b;
/*    */   
/*    */   @Nullable
/*    */   private final cez c;
/*    */   
/*    */   private final String d;
/*    */   
/*    */   private int e;
/*    */   
/*    */   private boolean f;
/*    */   private boolean g;
/*    */   
/*    */   public cfb(cfc ☃, cez cez1, String str) {
/* 26 */     this.b = ☃;
/* 27 */     this.c = cez1;
/* 28 */     this.d = str;
/* 29 */     this.f = true;
/* 30 */     this.g = true;
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 34 */     if (this.c.c().d()) {
/* 35 */       throw new IllegalStateException("Cannot modify read-only score");
/*    */     }
/* 37 */     c(b() + ☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/* 45 */     a(1);
/*    */   }
/*    */   
/*    */   public int b() {
/* 49 */     return this.e;
/*    */   }
/*    */   
/*    */   public void c() {
/* 53 */     c(0);
/*    */   }
/*    */   
/*    */   public void c(int ☃) {
/* 57 */     int i = this.e;
/* 58 */     this.e = ☃;
/* 59 */     if (i != ☃ || this.g) {
/* 60 */       this.g = false;
/* 61 */       f().a(this);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public cez d() {
/* 67 */     return this.c;
/*    */   }
/*    */   
/*    */   public String e() {
/* 71 */     return this.d;
/*    */   }
/*    */   
/*    */   public cfc f() {
/* 75 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 79 */     return this.f;
/*    */   }
/*    */   
/*    */   public void a(boolean ☃) {
/* 83 */     this.f = ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cfb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */