/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnl<T>
/*    */   implements bno<T>
/*    */ {
/*    */   private final eu<T> a;
/*    */   private final T[] b;
/*    */   private final bnp<T> c;
/*    */   private final Function<gy, T> d;
/*    */   private final int e;
/*    */   private int f;
/*    */   
/*    */   public bnl(eu<T> ☃, int i, bnp<T> bnp1, Function<gy, T> function) {
/* 21 */     this.a = ☃;
/* 22 */     this.b = (T[])new Object[1 << i];
/* 23 */     this.e = i;
/* 24 */     this.c = bnp1;
/* 25 */     this.d = function;
/*    */   }
/*    */   
/*    */   public int a(T ☃) {
/*    */     int i;
/* 30 */     for (i = 0; i < this.f; i++) {
/* 31 */       if (this.b[i] == ☃) {
/* 32 */         return i;
/*    */       }
/*    */     } 
/*    */     
/* 36 */     i = this.f;
/* 37 */     if (i < this.b.length) {
/* 38 */       this.b[i] = ☃;
/* 39 */       this.f++;
/* 40 */       return i;
/*    */     } 
/*    */     
/* 43 */     return this.c.onResize(this.e + 1, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public T a(int ☃) {
/* 49 */     if (☃ >= 0 && ☃ < this.f) {
/* 50 */       return this.b[☃];
/*    */     }
/* 52 */     return null;
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
/*    */   public void b(hy ☃) {
/* 65 */     ☃.d(this.f);
/* 66 */     for (int i = 0; i < this.f; i++) {
/* 67 */       ☃.d(this.a.a(this.b[i]));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 73 */     int ☃ = hy.a(b());
/*    */     
/* 75 */     for (int i = 0; i < b(); i++) {
/* 76 */       ☃ += hy.a(this.a.a(this.b[i]));
/*    */     }
/*    */     
/* 79 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 84 */     return this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(he ☃) {
/* 89 */     for (int i = 0; i < ☃.size(); i++) {
/* 90 */       this.b[i] = this.d.apply(☃.e(i));
/*    */     }
/* 92 */     this.f = ☃.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bnl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */