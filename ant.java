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
/*     */ public class ant
/*     */   extends amp
/*     */ {
/*     */   private boolean b;
/*     */   private static final Predicate<aer> c;
/*     */   
/*     */   public ant(axy ☃) {
/*  41 */     super(aev.aD, ☃);
/*     */     
/*  43 */     a(0.6F, 1.95F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  48 */     super.n();
/*     */     
/*  50 */     this.by.a(0, new agm(this));
/*  51 */     this.by.a(4, new ahe(this, 1.0D, false));
/*  52 */     this.by.a(8, new ahr(this, 0.6D));
/*  53 */     this.by.a(9, new ahb(this, (Class)aog.class, 3.0F, 1.0F));
/*  54 */     this.by.a(10, new ahb(this, (Class)afb.class, 8.0F));
/*     */     
/*  56 */     this.bz.a(1, new ail(this, true, new Class[] { ant.class }));
/*  57 */     this.bz.a(2, new aio<>(this, aog.class, true));
/*  58 */     this.bz.a(3, new aio<>(this, aob.class, true));
/*  59 */     this.bz.a(3, new aio<>(this, ajw.class, true));
/*  60 */     this.bz.a(4, new a(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  65 */     super.bZ();
/*     */     
/*  67 */     a(ank.d).a(0.3499999940395355D);
/*  68 */     a(ank.b).a(12.0D);
/*  69 */     a(ank.a).a(24.0D);
/*  70 */     a(ank.f).a(5.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  75 */     super.x_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected pc G() {
/*  80 */     return ccl.aC;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/*  88 */     a(1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  93 */     super.b(☃);
/*     */     
/*  95 */     if (this.b) {
/*  96 */       ☃.a("Johnny", true);
/*     */     }
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
/*     */   public void a(gy ☃) {
/* 110 */     super.a(☃);
/*     */     
/* 112 */     if (☃.c("Johnny", 99)) {
/* 113 */       this.b = ☃.q("Johnny");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 120 */     afj afj2 = super.a(☃, afj1, gy1);
/*     */     
/* 122 */     a(☃);
/* 123 */     b(☃);
/*     */     
/* 125 */     return afj2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adj ☃) {
/* 130 */     a(aew.a, new ate(atf.d));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 135 */     super.J();
/*     */     
/* 137 */     a((v() != null));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(aer ☃) {
/* 142 */     if (super.r(☃)) {
/* 143 */       return true;
/*     */     }
/* 145 */     if (☃ instanceof afa && ((afa)☃).cA() == afd.d)
/*     */     {
/* 147 */       return (be() == null && ☃.be() == null);
/*     */     }
/* 149 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(@Nullable ij ☃) {
/* 154 */     super.b(☃);
/* 155 */     if (!this.b && ☃ != null && ☃.getString().equals("Johnny")) {
/* 156 */       this.b = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 162 */     return wj.kx;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 167 */     return wj.ky;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 172 */     return wj.kz;
/*     */   }
/*     */   
/*     */   static class a extends aio<afa> {
/*     */     public a(ant ☃) {
/* 177 */       super(☃, afa.class, 0, true, true, ant.dA());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 182 */       return (ant.a((ant)this.e) && super.a());
/*     */     } }
/*     */   
/*     */   static {
/* 186 */     c = (☃ -> (☃ instanceof afa && ((afa)☃).df()));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */