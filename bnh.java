/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnh<T>
/*    */   implements bno<T>
/*    */ {
/*    */   private final eu<T> a;
/*    */   private final xg<T> b;
/*    */   private final bnp<T> c;
/*    */   private final Function<gy, T> d;
/*    */   private final Function<T, gy> e;
/*    */   private final int f;
/*    */   
/*    */   public bnh(eu<T> ☃, int i, bnp<T> bnp1, Function<gy, T> function, Function<T, gy> function1) {
/* 21 */     this.a = ☃;
/* 22 */     this.f = i;
/* 23 */     this.c = bnp1;
/* 24 */     this.d = function;
/* 25 */     this.e = function1;
/* 26 */     this.b = new xg<>(1 << i);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(T ☃) {
/* 31 */     int i = this.b.a(☃);
/* 32 */     if (i == -1) {
/* 33 */       i = this.b.c(☃);
/*    */       
/* 35 */       if (i >= 1 << this.f) {
/* 36 */         i = this.c.onResize(this.f + 1, ☃);
/*    */       }
/*    */     } 
/* 39 */     return i;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public T a(int ☃) {
/* 45 */     return this.b.a(☃);
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
/*    */   public void b(hy ☃) {
/* 59 */     int i = b();
/* 60 */     ☃.d(i);
/*    */     
/* 62 */     for (int j = 0; j < i; j++) {
/* 63 */       ☃.d(this.a.a(this.b.a(j)));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 69 */     int ☃ = hy.a(b());
/*    */     
/* 71 */     for (int i = 0; i < b(); i++) {
/* 72 */       ☃ += hy.a(this.a.a(this.b.a(i)));
/*    */     }
/*    */     
/* 75 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 80 */     return this.b.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(he ☃) {
/* 85 */     this.b.a();
/* 86 */     for (int i = 0; i < ☃.size(); i++) {
/* 87 */       this.b.c(this.d.apply(☃.e(i)));
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(he ☃) {
/* 92 */     for (int i = 0; i < b(); i++)
/* 93 */       ☃.a(this.e.apply(this.b.a(i))); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bnh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */