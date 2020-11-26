/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Spliterators;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.stream.Stream;
/*    */ import java.util.stream.StreamSupport;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xt<T>
/*    */ {
/* 16 */   private final List<T> a = Lists.newArrayList();
/*    */   private final Iterator<T> b;
/*    */   
/*    */   public xt(Stream<T> ☃) {
/* 20 */     this.b = ☃.iterator();
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<T> a() {
/* 25 */     return StreamSupport.stream(new Spliterators.AbstractSpliterator<T>(this, Long.MAX_VALUE, 0) {
/* 26 */           private int b = 0;
/*    */ 
/*    */           
/*    */           public boolean tryAdvance(Consumer<? super T> ☃) {
/*    */             T t;
/* 31 */             if (this.b >= xt.a(this.a).size()) {
/* 32 */               if (!xt.b(this.a).hasNext()) {
/* 33 */                 return false;
/*    */               }
/* 35 */               t = xt.b(this.a).next();
/* 36 */               xt.a(this.a).add(t);
/*    */             } else {
/* 38 */               t = xt.a(this.a).get(this.b);
/*    */             } 
/* 40 */             this.b++;
/* 41 */             ☃.accept(t);
/* 42 */             return true;
/*    */           }
/*    */         }false);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\xt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */