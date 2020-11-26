/*     */ import java.util.function.Predicate;
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
/*     */ public class bdf
/*     */   extends bfi
/*     */ {
/*  26 */   public static final bme a = bfi.D;
/*     */   private bli b;
/*     */   private bli c;
/*     */   private bli o;
/*     */   private bli p;
/*     */   private static final Predicate<blc> q;
/*     */   
/*     */   protected bdf(bcs.c ☃) {
/*  34 */     super(☃);
/*  35 */     v(((blc)this.m.b()).a(a, eq.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/*  40 */     if (blc1.c() == ☃.c()) {
/*     */       return;
/*     */     }
/*  43 */     a(axy1, el1);
/*     */   }
/*     */   
/*     */   public boolean a(ayc ☃, el el1) {
/*  47 */     return (d().a(☃, el1) != null || f().a(☃, el1) != null);
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1) {
/*  51 */     bli.b b = e().a(☃, el1);
/*  52 */     if (b != null) {
/*  53 */       for (int i = 0; i < e().b(); i++) {
/*  54 */         blh blh = b.a(0, i, 0);
/*  55 */         ☃.a(blh.d(), bct.a.p(), 2);
/*     */       } 
/*     */       
/*  58 */       akh akh = new akh(☃);
/*  59 */       el el2 = b.a(0, 2, 0).d();
/*  60 */       akh.b(el2.o() + 0.5D, el2.p() + 0.05D, el2.q() + 0.5D, 0.0F, 0.0F);
/*  61 */       ☃.a(akh);
/*     */       
/*  63 */       for (tf tf : ☃.<tf>a(tf.class, akh.bD().g(5.0D))) {
/*  64 */         p.n.a(tf, akh);
/*     */       }
/*     */       
/*  67 */       int j = bcs.l(bct.cS.p());
/*  68 */       ☃.b(2001, el2, j);
/*  69 */       ☃.b(2001, el2.a(), j);
/*     */       
/*  71 */       for (int k = 0; k < e().b(); k++) {
/*  72 */         blh blh = b.a(0, k, 0);
/*  73 */         ☃.a(blh.d(), bct.a);
/*     */       } 
/*     */     } else {
/*  76 */       b = g().a(☃, el1);
/*  77 */       if (b != null) {
/*  78 */         for (int i = 0; i < g().c(); i++) {
/*  79 */           for (int k = 0; k < g().b(); k++) {
/*  80 */             ☃.a(b.a(i, k, 0).d(), bct.a.p(), 2);
/*     */           }
/*     */         } 
/*     */         
/*  84 */         el el2 = b.a(1, 2, 0).d();
/*     */         
/*  86 */         ajw ajw = new ajw(☃);
/*  87 */         ajw.s(true);
/*  88 */         ajw.b(el2.o() + 0.5D, el2.p() + 0.05D, el2.q() + 0.5D, 0.0F, 0.0F);
/*  89 */         ☃.a(ajw);
/*     */         
/*  91 */         for (tf tf : ☃.<tf>a(tf.class, ajw.bD().g(5.0D))) {
/*  92 */           p.n.a(tf, ajw);
/*     */         }
/*     */         int j;
/*  95 */         for (j = 0; j < 120; j++) {
/*  96 */           ☃.a(fm.E, el2.o() + ☃.s.nextDouble(), el2.p() + ☃.s.nextDouble() * 3.9D, el2.q() + ☃.s.nextDouble(), 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */         
/*  99 */         for (j = 0; j < g().c(); j++) {
/* 100 */           for (int k = 0; k < g().b(); k++) {
/* 101 */             blh blh = b.a(j, k, 0);
/* 102 */             ☃.a(blh.d(), bct.a);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/* 111 */     return p().a(a, ☃.f().d());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 116 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */   static {
/* 119 */     q = (☃ -> (☃ != null && (☃.c() == bct.di || ☃.c() == bct.dj)));
/*     */   }
/*     */   protected bli d() {
/* 122 */     if (this.b == null) {
/* 123 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 130 */         .b = blj.a().a(new String[] { " ", "#", "#" }).a('#', blh.a(blp.a(bct.cS))).b();
/*     */     }
/*     */     
/* 133 */     return this.b;
/*     */   }
/*     */   
/*     */   protected bli e() {
/* 137 */     if (this.c == null) {
/* 138 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 146 */         .c = blj.a().a(new String[] { "^", "#", "#" }).a('^', blh.a(q)).a('#', blh.a(blp.a(bct.cS))).b();
/*     */     }
/*     */     
/* 149 */     return this.c;
/*     */   }
/*     */   
/*     */   protected bli f() {
/* 153 */     if (this.o == null) {
/* 154 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 162 */         .o = blj.a().a(new String[] { "~ ~", "###", "~#~" }).a('#', blh.a(blp.a(bct.bC))).a('~', blh.a(bln.a(bza.a))).b();
/*     */     }
/*     */     
/* 165 */     return this.o;
/*     */   }
/*     */   
/*     */   protected bli g() {
/* 169 */     if (this.p == null) {
/* 170 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 179 */         .p = blj.a().a(new String[] { "~^~", "###", "~#~" }).a('^', blh.a(q)).a('#', blh.a(blp.a(bct.bC))).a('~', blh.a(bln.a(bza.a))).b();
/*     */     }
/*     */     
/* 182 */     return this.p;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */