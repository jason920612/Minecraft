/*     */ import java.util.List;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class boo
/*     */   extends bmz<bon>
/*     */ {
/*     */   private static final List<blc> h;
/*     */   
/*     */   static {
/*  28 */     h = (List<blc>)StreamSupport.stream(fc.g.spliterator(), false).flatMap(☃ -> ☃.o().a().stream()).collect(Collectors.toList());
/*  29 */   } private static final int i = xq.f(xq.c(h.size()));
/*  30 */   private static final int j = xq.f(h.size() / i);
/*     */   
/*  32 */   protected static final blc f = bct.a.p();
/*  33 */   protected static final blc g = bct.fU.p();
/*     */   
/*     */   private final bon k;
/*     */   
/*     */   public boo(axz ☃, ayw ayw1, bon bon1) {
/*  38 */     super(☃, ayw1);
/*  39 */     this.k = bon1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmx ☃) {
/*  44 */     axm axm = ☃.d();
/*  45 */     int i = axm.a;
/*  46 */     int j = axm.b;
/*  47 */     ayu[] arrayOfAyu = this.c.b(i * 16, j * 16, 16, 16);
/*  48 */     ☃.a(arrayOfAyu);
/*  49 */     ☃.a(new bor.a[] { bor.a.a, bor.a.b });
/*  50 */     ☃.a(bnd.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ti ☃, boq.a a1) {}
/*     */ 
/*     */   
/*     */   public bon f() {
/*  59 */     return this.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public double[] a(int ☃, int i) {
/*  64 */     return new double[0];
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/*  69 */     return this.a.k() + 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ti ☃) {
/*  74 */     el.a a = new el.a();
/*     */     
/*  76 */     int i = ☃.a();
/*  77 */     int j = ☃.b();
/*     */     
/*  79 */     for (int k = 0; k < 16; k++) {
/*  80 */       for (int m = 0; m < 16; m++) {
/*  81 */         int n = (i << 4) + k;
/*  82 */         int i1 = (j << 4) + m;
/*  83 */         ☃.a(a.c(n, 60, i1), g, 2);
/*  84 */         blc blc1 = b(n, i1);
/*  85 */         if (blc1 != null) {
/*  86 */           ☃.a(a.c(n, 70, i1), blc1, 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(ti ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static blc b(int ☃, int i) {
/* 101 */     blc blc1 = f;
/*     */     
/* 103 */     if (☃ > 0 && i > 0 && ☃ % 2 != 0 && i % 2 != 0) {
/* 104 */       ☃ /= 2;
/* 105 */       i /= 2;
/*     */       
/* 107 */       if (☃ <= i && i <= j) {
/* 108 */         int j = xq.a(☃ * i + i);
/* 109 */         if (j < h.size()) {
/* 110 */           blc1 = h.get(j);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 115 */     return blc1;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ayu.e> a(afc ☃, el el1) {
/* 120 */     ayu ayu = this.a.d(el1);
/* 121 */     return ayu.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(axy ☃, boolean bool1, boolean bool2) {
/* 126 */     return 0;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\boo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */