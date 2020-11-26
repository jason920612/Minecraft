/*     */ import java.util.List;
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
/*     */ public class amv
/*     */   extends anc
/*     */ {
/*     */   public amv(axy ☃) {
/*  23 */     super(aev.p, ☃);
/*     */     
/*  25 */     a(this.H * 2.35F, this.I * 2.35F);
/*  26 */     di();
/*     */ 
/*     */     
/*  29 */     if (this.bE != null) {
/*  30 */       this.bE.b(400);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  36 */     super.bZ();
/*  37 */     a(ank.d).a(0.30000001192092896D);
/*  38 */     a(ank.f).a(8.0D);
/*  39 */     a(ank.a).a(80.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/*  45 */     return ccl.E;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l() {
/*  50 */     return 60;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected wi D() {
/*  60 */     return aq() ? wj.bD : wj.bE;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/*  65 */     return aq() ? wj.bJ : wj.bK;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/*  70 */     return aq() ? wj.bG : wj.bH;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dA() {
/*  75 */     return wj.bI;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/*  80 */     super.J();
/*     */ 
/*     */     
/*  83 */     int ☃ = 1200;
/*  84 */     if ((this.U + Q()) % 1200 == 0) {
/*  85 */       aej aej = aem.d;
/*     */       
/*  87 */       List<tf> list = this.m.b(tf.class, ☃ -> (h(☃) < 2500.0D && ☃.c.c()));
/*     */       
/*  89 */       int i = 2;
/*  90 */       int j = 6000;
/*  91 */       int k = 1200;
/*     */       
/*  93 */       for (tf tf : list) {
/*  94 */         if (!tf.a(aej) || tf.b(aej).c() < 2 || tf.b(aej).b() < 1200) {
/*  95 */           tf.a.a(new ke(10, 0.0F));
/*  96 */           tf.c(new aek(aej, 6000, 2));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 102 */     if (!dw())
/* 103 */       a(new el(this), 16); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\amv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */