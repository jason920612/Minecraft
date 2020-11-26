/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
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
/*     */ 
/*     */ 
/*     */ public class auc
/*     */   extends ata
/*     */ {
/*  30 */   private static final Map<aev<?>, auc> a = Maps.newIdentityHashMap();
/*     */   
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final aev<?> d;
/*     */   
/*     */   public auc(aev<?> ☃, int i, int j, ata.a a1) {
/*  37 */     super(a1);
/*  38 */     this.d = ☃;
/*  39 */     this.b = i;
/*  40 */     this.c = j;
/*     */     
/*  42 */     a.put(☃, this);
/*     */   }
/*     */   
/*     */   public adm a(aup ☃) {
/*     */     el el2;
/*  47 */     axy axy = ☃.k();
/*  48 */     if (axy.B) {
/*  49 */       return adm.a;
/*     */     }
/*     */     
/*  52 */     ate ate = ☃.i();
/*  53 */     el el1 = ☃.a();
/*  54 */     eq eq = ☃.l();
/*     */     
/*  56 */     blc blc = axy.a_(el1);
/*  57 */     bcs bcs = blc.c();
/*  58 */     if (bcs == bct.ci) {
/*  59 */       bji bji = axy.f(el1);
/*  60 */       if (bji instanceof bke) {
/*  61 */         axi axi = ((bke)bji).c();
/*  62 */         aev<?> aev2 = b(ate.n());
/*  63 */         if (aev2 != null) {
/*  64 */           axi.a(aev2);
/*  65 */           bji.g();
/*  66 */           axy.a(el1, blc, blc, 3);
/*     */         } 
/*  68 */         ate.g(1);
/*  69 */         return adm.a;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  74 */     if (blc.h(axy, el1).b()) {
/*  75 */       el2 = el1;
/*     */     } else {
/*  77 */       el2 = el1.a(eq);
/*     */     } 
/*     */     
/*  80 */     aev<?> aev1 = b(ate.n());
/*  81 */     if (aev1 == null || aev1.a(axy, ate, ☃.j(), el2, true, (!Objects.equals(el1, el2) && eq == eq.b)) != null) {
/*  82 */       ate.g(1);
/*     */     }
/*     */     
/*  85 */     return adm.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  90 */     ate ate = aog1.b(adk1);
/*  91 */     if (☃.B) {
/*  92 */       return new adn<>(adm.b, ate);
/*     */     }
/*     */     
/*  95 */     ceb ceb = a(☃, aog1, true);
/*  96 */     if (ceb == null || ceb.a != ceb.a.b) {
/*  97 */       return new adn<>(adm.b, ate);
/*     */     }
/*  99 */     el el = ceb.a();
/* 100 */     if (!(☃.a_(el).c() instanceof bfu)) {
/* 101 */       return new adn<>(adm.b, ate);
/*     */     }
/* 103 */     if (!☃.a(aog1, el) || !aog1.a(el, ceb.b, ate)) {
/* 104 */       return new adn<>(adm.c, ate);
/*     */     }
/* 106 */     aev<?> aev1 = b(ate.n());
/* 107 */     if (aev1 == null || aev1.a(☃, ate, aog1, el, false, false) == null) {
/* 108 */       return new adn<>(adm.b, ate);
/*     */     }
/* 110 */     if (!aog1.bV.d) {
/* 111 */       ate.g(1);
/*     */     }
/* 113 */     aog1.b(ws.c.b(this));
/* 114 */     return new adn<>(adm.a, ate);
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable gy ☃, aev<?> aev1) {
/* 118 */     return Objects.equals(b(☃), aev1);
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
/*     */   public static Iterable<auc> d() {
/* 130 */     return Iterables.unmodifiableIterable(a.values());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aev<?> b(@Nullable gy ☃) {
/* 135 */     if (☃ != null && 
/* 136 */       ☃.c("EntityTag", 10)) {
/* 137 */       gy gy1 = ☃.p("EntityTag");
/* 138 */       if (gy1.c("id", 8)) {
/* 139 */         return aev.a(gy1.l("id"));
/*     */       }
/*     */     } 
/*     */     
/* 143 */     return this.d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\auc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */