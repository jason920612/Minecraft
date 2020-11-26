/*     */ import java.util.List;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ajp
/*     */   extends ajn
/*     */ {
/*     */   private ajp a;
/*  16 */   private int b = 1;
/*     */   
/*     */   public ajp(aev<?> ☃, axy axy1) {
/*  19 */     super(☃, axy1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/*  24 */     super.n();
/*     */     
/*  26 */     this.by.a(5, new ago(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public int dg() {
/*  31 */     return dA();
/*     */   }
/*     */   
/*     */   public int dA() {
/*  35 */     return super.dg();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean dy() {
/*  40 */     return !dB();
/*     */   }
/*     */   
/*     */   public boolean dB() {
/*  44 */     return (this.a != null && this.a.aF());
/*     */   }
/*     */   
/*     */   public ajp a(ajp ☃) {
/*  48 */     this.a = ☃;
/*  49 */     ☃.dH();
/*     */     
/*  51 */     return ☃;
/*     */   }
/*     */   
/*     */   public void dC() {
/*  55 */     this.a.dI();
/*  56 */     this.a = null;
/*     */   }
/*     */   
/*     */   private void dH() {
/*  60 */     this.b++;
/*     */   }
/*     */   
/*     */   private void dI() {
/*  64 */     this.b--;
/*     */   }
/*     */   
/*     */   public boolean dD() {
/*  68 */     return (dE() && this.b < dA());
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  73 */     super.R_();
/*     */ 
/*     */     
/*  76 */     if (dE() && this.m.s.nextInt(200) == 1) {
/*  77 */       List<ajn> ☃ = (List)this.m.a(getClass(), bD().c(8.0D, 8.0D, 8.0D));
/*  78 */       if (☃.size() <= 1) {
/*  79 */         this.b = 1;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean dE() {
/*  85 */     return (this.b > 1);
/*     */   }
/*     */   
/*     */   public boolean dF() {
/*  89 */     return (h(this.a) <= 121.0D);
/*     */   }
/*     */   
/*     */   public void dG() {
/*  93 */     if (dB()) {
/*  94 */       t().a(this.a, 1.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(Stream<ajp> ☃) {
/*  99 */     ☃.limit((dA() - this.b)).filter(☃ -> (☃ != this)).forEach(☃ -> ☃.a(this));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 105 */     super.a(☃, afj1, gy1);
/*     */     
/* 107 */     if (afj1 == null) {
/* 108 */       afj1 = new a(this);
/*     */     } else {
/* 110 */       a(((a)afj1).a);
/*     */     } 
/*     */     
/* 113 */     return afj1;
/*     */   }
/*     */   
/*     */   public static class a implements afj {
/*     */     public final ajp a;
/*     */     
/*     */     public a(ajp ☃) {
/* 120 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */