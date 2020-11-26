/*    */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*    */ import it.unimi.dsi.fastutil.shorts.ShortListIterator;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bns<T>
/*    */   implements ayo<T>
/*    */ {
/*    */   protected final Predicate<T> a;
/*    */   protected final Function<T, pc> b;
/*    */   protected final Function<pc, T> c;
/*    */   private final axm d;
/* 20 */   private final ShortList[] e = new ShortList[16];
/*    */   
/*    */   public bns(Predicate<T> ☃, Function<T, pc> function, Function<pc, T> function1, axm axm1) {
/* 23 */     this.a = ☃;
/* 24 */     this.b = function;
/* 25 */     this.c = function1;
/* 26 */     this.d = axm1;
/*    */   }
/*    */   
/*    */   public he a() {
/* 30 */     return bnv.a(this.e);
/*    */   }
/*    */   
/*    */   public void a(he ☃) {
/* 34 */     for (int i = 0; i < ☃.size(); i++) {
/* 35 */       he he1 = ☃.f(i);
/* 36 */       for (int j = 0; j < he1.size(); j++) {
/* 37 */         bnr.a(this.e, i).add(he1.g(j));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(ayo<T> ☃, Function<el, T> function) {
/* 43 */     for (int i = 0; i < this.e.length; i++) {
/* 44 */       if (this.e[i] != null) {
/* 45 */         for (ShortListIterator<Short> shortListIterator = this.e[i].iterator(); shortListIterator.hasNext(); ) { Short short_ = shortListIterator.next();
/* 46 */           el el = bnr.a(short_.shortValue(), i, this.d);
/* 47 */           ☃.a(el, function.apply(el), 0); }
/*    */         
/* 49 */         this.e[i].clear();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(el ☃, T t) {
/* 56 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(el ☃, T t, int i, ayq ayq1) {
/* 61 */     bnr.a(this.e, ☃.p() >> 4).add(bnr.i(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(el ☃, T t) {
/* 66 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */