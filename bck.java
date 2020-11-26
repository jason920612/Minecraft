/*     */ import java.util.Random;
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
/*     */ public class bck
/*     */   extends bcs
/*     */   implements bcz, bfv
/*     */ {
/*  25 */   public static final bmb b = bma.y;
/*  26 */   private static final cew a = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D);
/*     */   
/*     */   protected bck(bcs.c ☃) {
/*  29 */     super(☃);
/*  30 */     v(((blc)this.m.b()).a(b, Boolean.valueOf(true)));
/*     */   }
/*     */   
/*     */   protected void a(blc ☃, axz axz1, el el1) {
/*  34 */     if (!b_(☃, axz1, el1)) {
/*  35 */       axz1.J().a(el1, this, 60 + axz1.m().nextInt(40));
/*     */     }
/*     */   }
/*     */   
/*     */   protected static boolean b_(blc ☃, axk axk1, el el1) {
/*  40 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  41 */       return true;
/*     */     }
/*     */     
/*  44 */     for (eq eq : eq.values()) {
/*  45 */       if (axk1.b(el1.a(eq)).a(ww.a)) {
/*  46 */         return true;
/*     */       }
/*     */     } 
/*  49 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean X_() {
/*  54 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, Random random) {
/*  59 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public blc a(ark ☃) {
/*  65 */     byw byw = ☃.k().b(☃.a());
/*     */     
/*  67 */     return p().a(b, Boolean.valueOf((byw.a(ww.a) && byw.g() == 8)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  72 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public axl c() {
/*  82 */     return axl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/*  87 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/*  92 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  93 */       axz1.I().a(el1, byy.c, byy.c.a(axz1));
/*     */     }
/*     */     
/*  96 */     if (eq1 == eq.a && !a(☃, axz1, el1)) {
/*  97 */       return bct.a.p();
/*     */     }
/*  99 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, ayc ayc1, el el1) {
/* 104 */     return ayc1.a_(el1.b()).q();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 109 */     ☃.a((bmm<?>[])new bmm[] { b });
/*     */   }
/*     */ 
/*     */   
/*     */   public byw h(blc ☃) {
/* 114 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 115 */       return byy.c.a(false);
/*     */     }
/*     */     
/* 118 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public byv a(axz ☃, el el1, blc blc1) {
/* 123 */     if (((Boolean)blc1.c(b)).booleanValue()) {
/* 124 */       ☃.a(el1, blc1.a(b, Boolean.valueOf(false)), 3);
/* 125 */       return byy.c;
/*     */     } 
/* 127 */     return byy.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axk ☃, el el1, blc blc1, byv byv1) {
/* 132 */     return (!((Boolean)blc1.c(b)).booleanValue() && byv1 == byy.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, el el1, blc blc1, byw byw1) {
/* 137 */     if (!((Boolean)blc1.c(b)).booleanValue() && byw1.c() == byy.c) {
/* 138 */       if (!☃.e()) {
/* 139 */         ☃.a(el1, blc1.a(b, Boolean.valueOf(true)), 3);
/* 140 */         ☃.I().a(el1, byw1.c(), byw1.c().a(☃));
/*     */       } 
/* 142 */       return true;
/*     */     } 
/* 144 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */