/*     */ import java.util.Collection;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ public class arz
/*     */   extends ata
/*     */ {
/*     */   public arz(ata.a ☃) {
/*  26 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1) {
/*  36 */     if (!axy1.B) {
/*  37 */       a(aog1, ☃, axy1, el1, false, aog1.b(adk.a));
/*     */     }
/*     */     
/*  40 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aup ☃) {
/*  45 */     aog aog = ☃.j();
/*  46 */     axy axy = ☃.k();
/*     */     
/*  48 */     if (!axy.B && aog != null) {
/*  49 */       el el = ☃.a();
/*  50 */       a(aog, axy.a_(el), axy, el, true, ☃.i());
/*     */     } 
/*     */     
/*  53 */     return adm.a;
/*     */   }
/*     */   
/*     */   private void a(aog ☃, blc blc1, axz axz1, el el1, boolean bool, ate ate1) {
/*  57 */     if (!☃.dK()) {
/*     */       return;
/*     */     }
/*     */     
/*  61 */     bcs bcs = blc1.c();
/*  62 */     ble<bcs, blc> ble = bcs.o();
/*  63 */     Collection<bmm<?>> collection = ble.d();
/*     */     
/*  65 */     String str1 = fc.g.b(bcs).toString();
/*  66 */     if (collection.isEmpty()) {
/*  67 */       a(☃, new ir(a() + ".empty", new Object[] { str1 }));
/*     */       
/*     */       return;
/*     */     } 
/*  71 */     gy gy = ate1.a("DebugProperty");
/*  72 */     String str2 = gy.l(str1);
/*     */     
/*  74 */     bmm<?> bmm = ble.a(str2);
/*  75 */     if (bool) {
/*  76 */       if (bmm == null) {
/*  77 */         bmm = collection.iterator().next();
/*     */       }
/*     */       
/*  80 */       blc blc2 = a(blc1, bmm, ☃.aZ());
/*  81 */       axz1.a(el1, blc2, 18);
/*  82 */       a(☃, new ir(a() + ".update", new Object[] { bmm.a(), a(blc2, bmm) }));
/*     */     } else {
/*  84 */       bmm = a((Iterable)collection, bmm, ☃.aZ());
/*     */       
/*  86 */       String str = bmm.a();
/*  87 */       gy.a(str1, str);
/*  88 */       a(☃, new ir(a() + ".select", new Object[] { str, a(blc1, bmm) }));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> blc a(blc ☃, bmm<T> bmm1, boolean bool) {
/*  93 */     return ☃.a(bmm1, a(bmm1.d(), ☃.c(bmm1), bool));
/*     */   }
/*     */   
/*     */   private static <T> T a(Iterable<T> ☃, @Nullable T t, boolean bool) {
/*  97 */     return bool ? k.<T>b(☃, t) : k.<T>a(☃, t);
/*     */   }
/*     */   
/*     */   private static void a(aog ☃, ij ij1) {
/* 101 */     ((tf)☃).a(ij1, ih.c);
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> String a(blc ☃, bmm<T> bmm1) {
/* 105 */     return bmm1.a((T)☃.c(bmm1));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\arz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */