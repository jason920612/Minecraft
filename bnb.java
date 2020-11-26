/*    */ import java.util.function.Supplier;
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
/*    */ public class bnb<C extends bom, T extends bmy<C>>
/*    */   implements bna<C, T>
/*    */ {
/* 22 */   public static final bnb<bou, bov> a = a("surface", bov::new, bou::new, true);
/* 23 */   public static final bnb<bos, bot> b = a("caves", bot::new, bos::new, true);
/* 24 */   public static final bnb<box, boy> c = a("floating_islands", boy::new, box::new, true);
/* 25 */   public static final bnb<bon, boo> d = a("debug", boo::new, bon::new, false);
/* 26 */   public static final bnb<bud, bop> e = a("flat", bop::new, bud::new, false);
/*    */   
/*    */   private final pc f;
/*    */   
/*    */   private final bna<C, T> g;
/*    */   
/*    */   private final boolean h;
/*    */   private final Supplier<C> i;
/*    */   
/*    */   public static void a() {}
/*    */   
/*    */   public bnb(bna<C, T> ☃, boolean bool, Supplier<C> supplier, pc pc1) {
/* 38 */     this.g = ☃;
/* 39 */     this.h = bool;
/* 40 */     this.i = supplier;
/* 41 */     this.f = pc1;
/*    */   }
/*    */   
/*    */   public static <C extends bom, T extends bmy<C>> bnb<C, T> a(String ☃, bna<C, T> bna1, Supplier<C> supplier, boolean bool) {
/* 45 */     pc pc1 = new pc(☃);
/* 46 */     bnb<C, T> bnb1 = new bnb<>(bna1, bool, supplier, pc1);
/* 47 */     fc.p.a(pc1, bnb1);
/* 48 */     return bnb1;
/*    */   }
/*    */ 
/*    */   
/*    */   public T create(axy ☃, ayw ayw1, C c) {
/* 53 */     return this.g.create(☃, ayw1, c);
/*    */   }
/*    */   
/*    */   public C b() {
/* 57 */     return this.i.get();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public pc d() {
/* 65 */     return this.f;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bnb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */