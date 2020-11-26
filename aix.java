/*     */ import com.google.common.collect.Lists;
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
/*     */ 
/*     */ public class aix
/*     */   implements ayb
/*     */ {
/*  24 */   private final List<aiw> a = Lists.newArrayList();
/*     */ 
/*     */   
/*     */   public void a(axk ☃, el el1, blc blc1, blc blc2, int i) {
/*  28 */     if (!a(☃, el1, blc1, blc2)) {
/*     */       return;
/*     */     }
/*     */     
/*  32 */     for (int j = 0, k = this.a.size(); j < k; j++) {
/*  33 */       aiw aiw = this.a.get(j);
/*  34 */       if (aiw != null)
/*     */       {
/*     */ 
/*     */         
/*  38 */         if (!aiw.k()) {
/*     */ 
/*     */ 
/*     */           
/*  42 */           cbe cbe = aiw.m();
/*  43 */           if (cbe != null && !cbe.b() && cbe.d() != 0) {
/*     */ 
/*     */ 
/*     */             
/*  47 */             cbc cbc = aiw.c.c();
/*  48 */             double d = el1.f((cbc.a + aiw.a.q) / 2.0D, (cbc.b + aiw.a.r) / 2.0D, (cbc.c + aiw.a.s) / 2.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  53 */             int m = (cbe.d() - cbe.e()) * (cbe.d() - cbe.e());
/*     */             
/*  55 */             if (d < m)
/*  56 */               aiw.l(); 
/*     */           } 
/*     */         }  } 
/*     */     } 
/*     */   }
/*     */   protected boolean a(axk ☃, el el1, blc blc1, blc blc2) {
/*  62 */     cew cew1 = blc1.h(☃, el1);
/*  63 */     cew cew2 = blc2.h(☃, el1);
/*  64 */     return cet.c(cew1, cew2, cei.NOT_SAME);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(el ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, int k, int m, int n) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(@Nullable aog ☃, wi wi1, wk wk1, double d1, double d2, double d3, float f1, float f2) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fk ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fk ☃, boolean bool1, boolean bool2, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aer ☃) {
/*  93 */     if (☃ instanceof afb) {
/*  94 */       this.a.add(((afb)☃).t());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aer ☃) {
/* 100 */     if (☃ instanceof afb)
/* 101 */       this.a.remove(((afb)☃).t()); 
/*     */   }
/*     */   
/*     */   public void a(wi ☃, el el1) {}
/*     */   
/*     */   public void a(int ☃, el el1, int i) {}
/*     */   
/*     */   public void a(aog ☃, int i, el el1, int j) {}
/*     */   
/*     */   public void b(int ☃, el el1, int i) {}
/*     */ }


/* Location:              F:\dw\server.jar!\aix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */