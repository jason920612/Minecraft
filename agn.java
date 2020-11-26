/*     */ import java.util.List;
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
/*     */ public class agn
/*     */   extends agt
/*     */ {
/*     */   private int a;
/*     */   private final afg b;
/*     */   private afa c;
/*     */   private agf d;
/*     */   
/*     */   public agn(afg ☃) {
/*  26 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  31 */     List<apj> ☃ = this.b.m.a(apj.class, this.b.bD().g(5.0D));
/*  32 */     boolean bool = false;
/*  33 */     for (apj apj : ☃) {
/*  34 */       if (apj.bO() != null && (
/*  35 */         xq.e(((afa)apj.bO()).bh) > 0.0F || xq.e(((afa)apj.bO()).bj) > 0.0F)) {
/*  36 */         bool = true;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     
/*  42 */     return ((this.c != null && (xq.e(this.c.bh) > 0.0F || xq.e(this.c.bj) > 0.0F)) || bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f() {
/*  47 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  52 */     return (this.c != null && this.c.aW() && (xq.e(this.c.bh) > 0.0F || xq.e(this.c.bj) > 0.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  57 */     List<apj> ☃ = this.b.m.a(apj.class, this.b.bD().g(5.0D));
/*  58 */     for (apj apj : ☃) {
/*  59 */       if (apj.bO() != null && apj.bO() instanceof afa) {
/*  60 */         this.c = (afa)apj.bO();
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  65 */     this.a = 0;
/*  66 */     this.d = agf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  71 */     this.c = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  76 */     boolean ☃ = (xq.e(this.c.bh) > 0.0F || xq.e(this.c.bj) > 0.0F);
/*  77 */     float f = (this.d == agf.b) ? (☃ ? 0.17999999F : 0.0F) : 0.135F;
/*     */     
/*  79 */     this.b.a(this.b.bh, this.b.bi, this.b.bj, f);
/*  80 */     this.b.a(afe.a, this.b.t, this.b.u, this.b.v);
/*     */     
/*  82 */     if (--this.a > 0) {
/*     */       return;
/*     */     }
/*  85 */     this.a = 10;
/*     */     
/*  87 */     if (this.d == agf.a) {
/*  88 */       el el = (new el(this.c)).a(this.c.bA().d());
/*  89 */       el = el.a(0, -1, 0);
/*  90 */       this.b.t().a(el.o(), el.p(), el.q(), 1.0D);
/*     */       
/*  92 */       if (this.b.g(this.c) < 4.0F) {
/*  93 */         this.a = 0;
/*  94 */         this.d = agf.b;
/*     */       } 
/*  96 */     } else if (this.d == agf.b) {
/*     */       
/*  98 */       eq eq = this.c.bB();
/*  99 */       el el = (new el(this.c)).a(eq, 10);
/*     */ 
/*     */       
/* 102 */       this.b.t().a(el.o(), (el.p() - 1), el.q(), 1.0D);
/*     */       
/* 104 */       if (this.b.g(this.c) > 12.0F) {
/* 105 */         this.a = 0;
/* 106 */         this.d = agf.a;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */