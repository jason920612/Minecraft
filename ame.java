/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
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
/*     */ public class ame
/*     */   extends ama
/*     */ {
/*     */   public amd d;
/*     */   
/*     */   public ame(axy ☃) {
/*  25 */     super(aev.X, ☃);
/*     */   }
/*     */   
/*     */   public ame(axy ☃, el el1, eq eq1) {
/*  29 */     super(aev.X, ☃, el1);
/*     */     
/*  31 */     List<amd> list = Lists.newArrayList();
/*  32 */     int i = 0;
/*  33 */     for (amd amd1 : fc.i) {
/*  34 */       this.d = amd1;
/*  35 */       a(eq1);
/*     */       
/*  37 */       if (i()) {
/*  38 */         list.add(amd1);
/*  39 */         int j = amd1.b() * amd1.c();
/*  40 */         if (j > i) {
/*  41 */           i = j;
/*     */         }
/*     */       } 
/*     */     } 
/*  45 */     if (!list.isEmpty()) {
/*     */       
/*  47 */       Iterator<amd> iterator = list.iterator();
/*  48 */       while (iterator.hasNext()) {
/*  49 */         amd amd1 = iterator.next();
/*  50 */         if (amd1.b() * amd1.c() < i) {
/*  51 */           iterator.remove();
/*     */         }
/*     */       } 
/*  54 */       this.d = list.get(this.T.nextInt(list.size()));
/*     */     } 
/*  56 */     a(eq1);
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
/*     */   public void b(gy ☃) {
/*  68 */     ☃.a("Motive", fc.i.b(this.d).toString());
/*  69 */     super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/*  74 */     this.d = fc.i.a(pc.a(☃.l("Motive")));
/*  75 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/*  80 */     return this.d.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public int l() {
/*  85 */     return this.d.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable aer ☃) {
/*  90 */     if (!this.m.X().b("doEntityDrops")) {
/*     */       return;
/*     */     }
/*     */     
/*  94 */     a(wj.fN, 1.0F, 1.0F);
/*     */     
/*  96 */     if (☃ instanceof aog) {
/*  97 */       aog aog = (aog)☃;
/*     */       
/*  99 */       if (aog.bV.d) {
/*     */         return;
/*     */       }
/*     */     } 
/*     */     
/* 104 */     a(atf.as);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 109 */     a(wj.fO, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(double ☃, double d1, double d2, float f1, float f2) {
/* 114 */     b(☃, d1, d2);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */