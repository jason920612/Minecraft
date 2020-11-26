/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
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
/*     */ public class aio<T extends afa>
/*     */   extends ais
/*     */ {
/*     */   protected final Class<T> a;
/*     */   private final int i;
/*     */   protected final a b;
/*     */   protected final Predicate<? super T> c;
/*     */   protected T d;
/*     */   
/*     */   public aio(afg ☃, Class<T> clazz, boolean bool) {
/*  32 */     this(☃, clazz, bool, false);
/*     */   }
/*     */   
/*     */   public aio(afg ☃, Class<T> clazz, boolean bool1, boolean bool2) {
/*  36 */     this(☃, clazz, 10, bool1, bool2, (Predicate<? super T>)null);
/*     */   }
/*     */   
/*     */   public aio(afg ☃, Class<T> clazz, int i, boolean bool1, boolean bool2, @Nullable Predicate<? super T> predicate) {
/*  40 */     super(☃, bool1, bool2);
/*  41 */     this.a = clazz;
/*  42 */     this.i = i;
/*  43 */     this.b = new a(☃);
/*  44 */     a(1);
/*     */     
/*  46 */     this.c = (afa1 -> (afa1 == null) ? false : (
/*     */ 
/*     */ 
/*     */       
/*  50 */       (☃ != null && !☃.test(afa1)) ? false : (!aeu.f.test(afa1) ? false : a(afa1, false))));
/*     */   }
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
/*     */   public boolean a() {
/*  63 */     if (this.i > 0 && this.e.ce().nextInt(this.i) != 0) {
/*  64 */       return false;
/*     */     }
/*     */     
/*  67 */     if (this.a == aog.class || this.a == tf.class) {
/*  68 */       this.d = (T)this.e.m.a(this.e.q, this.e.r + this.e.bF(), this.e.s, i(), i(), new Function<aog, Double>(this)
/*     */           {
/*     */             @Nullable
/*     */             public Double a(@Nullable aog ☃) {
/*  72 */               ate ate = ☃.b(aew.f);
/*  73 */               if ((this.a.e instanceof ann && ate.b() == atf.dI) || (this.a.e instanceof anw && ate
/*  74 */                 .b() == atf.dM) || (this.a.e instanceof amt && ate
/*  75 */                 .b() == atf.dL))
/*     */               {
/*  77 */                 return Double.valueOf(0.5D);
/*     */               }
/*  79 */               return Double.valueOf(1.0D);
/*     */             }
/*     */           },  (Predicate)this.c);
/*  82 */       return (this.d != null);
/*     */     } 
/*  84 */     List<T> ☃ = (List)this.e.m.a((Class)this.a, a(i()), (Predicate)this.c);
/*     */     
/*  86 */     if (☃.isEmpty()) {
/*  87 */       return false;
/*     */     }
/*  89 */     Collections.sort(☃, this.b);
/*  90 */     this.d = ☃.get(0);
/*  91 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected cea a(double ☃) {
/*  97 */     return this.e.bD().c(☃, 4.0D, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 102 */     this.e.e((afa)this.d);
/* 103 */     super.c();
/*     */   }
/*     */   
/*     */   public static class a implements Comparator<aer> {
/*     */     private final aer a;
/*     */     
/*     */     public a(aer ☃) {
/* 110 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(aer ☃, aer aer1) {
/* 115 */       double d1 = this.a.h(☃);
/* 116 */       double d2 = this.a.h(aer1);
/* 117 */       if (d1 < d2) {
/* 118 */         return -1;
/*     */       }
/* 120 */       if (d1 > d2) {
/* 121 */         return 1;
/*     */       }
/* 123 */       return 0;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */