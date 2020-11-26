/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class asp
/*     */   extends ata
/*     */ {
/*     */   public asp(ata.a ☃) {
/*  36 */     super(☃);
/*     */   }
/*     */   
/*     */   public enum a { private static final a[] f;
/*  40 */     a(0, "small_ball"),
/*  41 */     b(1, "large_ball"),
/*  42 */     c(2, "star"),
/*  43 */     d(3, "creeper"),
/*  44 */     e(4, "burst");
/*     */     
/*     */     static {
/*  47 */       f = (a[])Arrays.<a>stream(values()).sorted(Comparator.comparingInt(☃ -> ☃.g)).toArray(☃ -> new a[☃]);
/*     */     }
/*     */     private final int g;
/*     */     private final String h;
/*     */     
/*     */     a(int ☃, String str1) {
/*  53 */       this.g = ☃;
/*  54 */       this.h = str1;
/*     */     }
/*     */     
/*     */     public int a() {
/*  58 */       return this.g;
/*     */     } }
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
/*     */   public adm a(aup ☃) {
/*  75 */     axy axy = ☃.k();
/*  76 */     if (!axy.B) {
/*     */ 
/*     */       
/*  79 */       el el = ☃.a();
/*  80 */       ate ate = ☃.i();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  86 */       aoq aoq = new aoq(axy, (el.o() + ☃.m()), (el.p() + ☃.n()), (el.q() + ☃.o()), ate);
/*     */ 
/*     */       
/*  89 */       axy.a(aoq);
/*     */       
/*  91 */       ate.g(1);
/*     */     } 
/*  93 */     return adm.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  98 */     if (aog1.dc()) {
/*  99 */       ate ate = aog1.b(adk1);
/* 100 */       if (!☃.B) {
/* 101 */         aoq aoq = new aoq(☃, ate, aog1);
/* 102 */         ☃.a(aoq);
/* 103 */         if (!aog1.bV.d) {
/* 104 */           ate.g(1);
/*     */         }
/*     */       } 
/*     */       
/* 108 */       return new adn<>(adm.a, aog1.b(adk1));
/*     */     } 
/* 110 */     return new adn<>(adm.b, aog1.b(adk1));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\asp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */