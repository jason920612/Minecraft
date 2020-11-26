/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bce
/*     */   extends bep
/*     */ {
/*  30 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*  32 */   public static final bme a = bfi.D;
/*     */   
/*  34 */   private static final cew o = bcs.a(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D);
/*     */   
/*  36 */   private static final cew p = bcs.a(3.0D, 4.0D, 4.0D, 13.0D, 5.0D, 12.0D);
/*  37 */   private static final cew q = bcs.a(4.0D, 5.0D, 6.0D, 12.0D, 10.0D, 10.0D);
/*  38 */   private static final cew r = bcs.a(0.0D, 10.0D, 3.0D, 16.0D, 16.0D, 13.0D);
/*     */   
/*  40 */   private static final cew s = bcs.a(4.0D, 4.0D, 3.0D, 12.0D, 5.0D, 13.0D);
/*  41 */   private static final cew t = bcs.a(6.0D, 5.0D, 4.0D, 10.0D, 10.0D, 12.0D);
/*  42 */   private static final cew u = bcs.a(3.0D, 10.0D, 0.0D, 13.0D, 16.0D, 16.0D);
/*     */   
/*  44 */   private static final cew v = cet.a(o, cet.a(p, cet.a(q, r)));
/*  45 */   private static final cew w = cet.a(o, cet.a(s, cet.a(t, u)));
/*     */   
/*     */   public bce(bcs.c ☃) {
/*  48 */     super(☃);
/*  49 */     v(((blc)this.m.b()).a(a, eq.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃) {
/*  54 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public blb a(axk ☃, blc blc1, el el1, eq eq1) {
/*  59 */     return blb.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(ark ☃) {
/*  64 */     return p().a(a, ☃.f().e());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axy axy1, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/*  69 */     if (!axy1.B) {
/*  70 */       aog1.a(new a(axy1, el1));
/*     */     }
/*     */     
/*  73 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public cew a(blc ☃, axk axk1, el el1) {
/*  78 */     eq eq = (eq)☃.c(a);
/*  79 */     if (eq.k() == eq.a.a) {
/*  80 */       return v;
/*     */     }
/*  82 */     return w;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(aml ☃) {
/*  88 */     ☃.a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1, blc blc1, blc blc2) {
/*  93 */     ☃.b(1031, el1, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axy ☃, el el1) {
/*  98 */     ☃.b(1029, el1, 0);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static blc a_(blc ☃) {
/* 103 */     bcs bcs = ☃.c();
/* 104 */     if (bcs == bct.fn) {
/* 105 */       return bct.fo.p().a(a, ☃.c(a));
/*     */     }
/* 107 */     if (bcs == bct.fo) {
/* 108 */       return bct.fp.p().a(a, ☃.c(a));
/*     */     }
/* 110 */     return null;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements adl
/*     */   {
/*     */     private final axy a;
/*     */     private final el b;
/*     */     
/*     */     public a(axy ☃, el el1) {
/* 120 */       this.a = ☃;
/* 121 */       this.b = el1;
/*     */     }
/*     */ 
/*     */     
/*     */     public ij N_() {
/* 126 */       return new ir(bct.fn.m(), new Object[0]);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean O_() {
/* 131 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public ij e() {
/* 137 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public apv a(aof ☃, aog aog1) {
/* 142 */       return new apw(☃, this.a, this.b, aog1);
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 147 */       return "minecraft:anvil";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 153 */     return ☃.a(a, bhb1.a((eq)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 158 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(blc ☃, axk axk1, el el1, cbf cbf1) {
/* 163 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */