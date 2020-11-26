/*    */ import java.util.Spliterators;
/*    */ import java.util.function.Consumer;
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
/*    */ class null
/*    */   extends Spliterators.AbstractSpliterator<T>
/*    */ {
/*    */   private int b;
/*    */   
/*    */   null(xt ☃, long l, int i) {
/* 25 */     super(l, i);
/* 26 */     this.b = 0;
/*    */   }
/*    */   
/*    */   public boolean tryAdvance(Consumer<? super T> ☃) {
/*    */     T t;
/* 31 */     if (this.b >= xt.a(this.a).size()) {
/* 32 */       if (!xt.b(this.a).hasNext()) {
/* 33 */         return false;
/*    */       }
/* 35 */       t = xt.b(this.a).next();
/* 36 */       xt.a(this.a).add(t);
/*    */     } else {
/* 38 */       t = xt.a(this.a).get(this.b);
/*    */     } 
/* 40 */     this.b++;
/* 41 */     ☃.accept(t);
/* 42 */     return true;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\xt$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */