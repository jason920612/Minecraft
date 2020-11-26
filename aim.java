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
/*     */ public class aim
/*     */   extends agt
/*     */ {
/*  23 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final afb b;
/*     */   private final Predicate<afa> c;
/*     */   private final aio.a d;
/*     */   private afa e;
/*     */   private final Class<? extends afa> f;
/*     */   
/*     */   public aim(afb ☃, Class<? extends afa> clazz) {
/*  32 */     this.b = ☃;
/*  33 */     this.f = clazz;
/*     */     
/*  35 */     if (☃ instanceof afg) {
/*  36 */       a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
/*     */     }
/*     */     
/*  39 */     this.c = (☃ -> {
/*     */         double d = g();
/*     */ 
/*     */ 
/*     */         
/*     */         if (☃.aZ()) {
/*     */           d *= 0.800000011920929D;
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*     */         return ☃.bd() ? false : ((☃.g(this.b) > d) ? false : ais.a(this.b, ☃, false, true));
/*     */       });
/*     */ 
/*     */     
/*  54 */     this.d = new aio.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  59 */     double ☃ = g();
/*  60 */     List<afa> list = this.b.m.a(this.f, this.b.bD().c(☃, 4.0D, ☃), this.c);
/*  61 */     Collections.sort(list, this.d);
/*     */     
/*  63 */     if (list.isEmpty()) {
/*  64 */       return false;
/*     */     }
/*  66 */     this.e = list.get(0);
/*  67 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  73 */     afa ☃ = this.b.v();
/*  74 */     if (☃ == null) {
/*  75 */       return false;
/*     */     }
/*  77 */     if (!☃.aF()) {
/*  78 */       return false;
/*     */     }
/*     */     
/*  81 */     double d = g();
/*  82 */     if (this.b.h(☃) > d * d) {
/*  83 */       return false;
/*     */     }
/*  85 */     if (☃ instanceof tf && 
/*  86 */       ((tf)☃).c.d()) {
/*  87 */       return false;
/*     */     }
/*     */     
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  95 */     this.b.e(this.e);
/*  96 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 101 */     this.b.e((afa)null);
/* 102 */     super.c();
/*     */   }
/*     */   
/*     */   protected double g() {
/* 106 */     afn ☃ = this.b.a(ank.b);
/* 107 */     return (☃ == null) ? 16.0D : ☃.e();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aim.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */