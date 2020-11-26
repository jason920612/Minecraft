/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ayy<C extends ayx, T extends ayw>
/*    */ {
/* 10 */   public static final ayy<azd, azc> a = a("checkerboard", azc::new, azd::new);
/* 11 */   public static final ayy<azu, azt> b = a("fixed", azt::new, azu::new);
/* 12 */   public static final ayy<bav, bau> c = a("vanilla_layered", bau::new, bav::new);
/* 13 */   public static final ayy<bbu, bbt> d = a("the_end", bbt::new, bbu::new);
/*    */   
/*    */   private final pc e;
/*    */   
/*    */   private final Function<C, T> f;
/*    */   
/*    */   private final Supplier<C> g;
/*    */   
/*    */   public static void a() {}
/*    */   
/*    */   public ayy(Function<C, T> ☃, Supplier<C> supplier, pc pc1) {
/* 24 */     this.f = ☃;
/* 25 */     this.g = supplier;
/* 26 */     this.e = pc1;
/*    */   }
/*    */   
/*    */   public static <C extends ayx, T extends ayw> ayy<C, T> a(String ☃, Function<C, T> function, Supplier<C> supplier) {
/* 30 */     pc pc1 = new pc(☃);
/* 31 */     ayy<C, T> ayy1 = new ayy<>(function, supplier, pc1);
/* 32 */     fc.n.a(pc1, ayy1);
/* 33 */     return ayy1;
/*    */   }
/*    */ 
/*    */   
/*    */   public T a(C ☃) {
/* 38 */     return this.f.apply(☃);
/*    */   }
/*    */   
/*    */   public C b() {
/* 42 */     return this.g.get();
/*    */   }
/*    */   
/*    */   public pc c() {
/* 46 */     return this.e;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ayy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */