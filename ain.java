/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class ain
/*     */   extends agt
/*     */ {
/*  26 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final afb b;
/*     */   private final Predicate<aer> c;
/*     */   private final aio.a d;
/*     */   private afa e;
/*     */   
/*     */   public ain(afb ☃) {
/*  34 */     this.b = ☃;
/*     */     
/*  36 */     if (☃ instanceof afg) {
/*  37 */       a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
/*     */     }
/*     */     
/*  40 */     this.c = (☃ -> {
/*     */         if (!(☃ instanceof aog)) {
/*     */           return false;
/*     */         }
/*     */         
/*     */         if (((aog)☃).bV.a) {
/*     */           return false;
/*     */         }
/*     */         
/*     */         double d = g();
/*     */         
/*     */         if (☃.aZ()) {
/*     */           d *= 0.800000011920929D;
/*     */         }
/*     */         
/*     */         if (☃.bd()) {
/*     */           float f = ((aog)☃).dk();
/*     */           
/*     */           if (f < 0.1F) {
/*     */             f = 0.1F;
/*     */           }
/*     */           d *= (0.7F * f);
/*     */         } 
/*     */         return (☃.g(this.b) > d) ? false : ais.a(this.b, (afa)☃, false, true);
/*     */       });
/*  65 */     this.d = new aio.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  70 */     double ☃ = g();
/*  71 */     List<aog> list = (List)this.b.m.a((Class)aog.class, this.b.bD().c(☃, 4.0D, ☃), this.c);
/*  72 */     Collections.sort(list, this.d);
/*     */     
/*  74 */     if (list.isEmpty()) {
/*  75 */       return false;
/*     */     }
/*  77 */     this.e = list.get(0);
/*  78 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  84 */     afa ☃ = this.b.v();
/*  85 */     if (☃ == null) {
/*  86 */       return false;
/*     */     }
/*  88 */     if (!☃.aF()) {
/*  89 */       return false;
/*     */     }
/*  91 */     if (☃ instanceof aog && ((aog)☃).bV.a) {
/*  92 */       return false;
/*     */     }
/*     */     
/*  95 */     cfe cfe1 = this.b.be();
/*  96 */     cfe cfe2 = ☃.be();
/*  97 */     if (cfe1 != null && cfe2 == cfe1) {
/*  98 */       return false;
/*     */     }
/*     */     
/* 101 */     double d = g();
/* 102 */     if (this.b.h(☃) > d * d) {
/* 103 */       return false;
/*     */     }
/* 105 */     if (☃ instanceof tf && 
/* 106 */       ((tf)☃).c.d()) {
/* 107 */       return false;
/*     */     }
/*     */     
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 115 */     this.b.e(this.e);
/* 116 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 121 */     this.b.e((afa)null);
/* 122 */     super.c();
/*     */   }
/*     */   
/*     */   protected double g() {
/* 126 */     afn ☃ = this.b.a(ank.b);
/* 127 */     return (☃ == null) ? 16.0D : ☃.e();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */