/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ public class bgw
/*     */   extends bik
/*     */ {
/*  25 */   public static final bmb a = bma.o;
/*     */ 
/*     */   
/*  28 */   private static final Map<axk, List<a>> b = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected bgw(bcs.c ☃) {
/*  35 */     super(☃);
/*  36 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/*  41 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/*  46 */     for (eq eq : eq.values()) {
/*  47 */       axy1.b(el1.a(eq), this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1, boolean bool) {
/*  53 */     if (bool) {
/*     */       return;
/*     */     }
/*     */     
/*  57 */     for (eq eq : eq.values()) {
/*  58 */       axy1.b(el1.a(eq), this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/*  64 */     if (((Boolean)☃.c(a)).booleanValue() && eq.b != eq1) {
/*  65 */       return 15;
/*     */     }
/*     */     
/*  68 */     return 0;
/*     */   }
/*     */   
/*     */   protected boolean a(axy ☃, el el1, blc blc1) {
/*  72 */     return ☃.b(el1.b(), eq.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  77 */     a(☃, axy1, el1, random, a(axy1, el1, ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(blc ☃, axy axy1, el el1, Random random, boolean bool) {
/*  82 */     List<a> list = b.get(axy1);
/*  83 */     while (list != null && !list.isEmpty() && axy1.V() - a.a(list.get(0)) > 60L) {
/*  84 */       list.remove(0);
/*     */     }
/*     */     
/*  87 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  88 */       if (bool) {
/*  89 */         axy1.a(el1, ☃.a(a, Boolean.valueOf(false)), 3);
/*     */         
/*  91 */         if (a(axy1, el1, true)) {
/*  92 */           axy1.a((aog)null, el1, wj.hL, wk.e, 0.5F, 2.6F + (axy1.s.nextFloat() - axy1.s.nextFloat()) * 0.8F);
/*  93 */           for (int i = 0; i < 5; i++) {
/*  94 */             double d1 = el1.o() + random.nextDouble() * 0.6D + 0.2D;
/*  95 */             double d2 = el1.p() + random.nextDouble() * 0.6D + 0.2D;
/*  96 */             double d3 = el1.q() + random.nextDouble() * 0.6D + 0.2D;
/*     */             
/*  98 */             axy1.a(fm.M, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */           } 
/*     */           
/* 101 */           axy1.J().a(el1, axy1.a_(el1).c(), 160);
/*     */         }
/*     */       
/*     */       } 
/* 105 */     } else if (!bool && !a(axy1, el1, false)) {
/* 106 */       axy1.a(el1, ☃.a(a, Boolean.valueOf(true)), 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, bcs bcs1, el el2) {
/* 113 */     if (((Boolean)☃.c(a)).booleanValue() == a(axy1, el1, ☃) && !axy1.J().b(el1, this)) {
/* 114 */       axy1.J().a(el1, this, a(axy1));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/* 120 */     if (eq1 == eq.a) {
/* 121 */       return ☃.a(axk1, el1, eq1);
/*     */     }
/* 123 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/* 128 */     return true;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int m(blc ☃) {
/* 146 */     return ((Boolean)☃.c(a)).booleanValue() ? super.m(☃) : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 151 */     ☃.a((bmm<?>[])new bmm[] { a });
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final el a;
/*     */     private final long b;
/*     */     
/*     */     public a(el ☃, long l) {
/* 159 */       this.a = ☃;
/* 160 */       this.b = l;
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean a(axy ☃, el el1, boolean bool) {
/* 165 */     List<a> list = b.get(☃);
/* 166 */     if (list == null) {
/* 167 */       list = Lists.newArrayList();
/* 168 */       b.put(☃, list);
/*     */     } 
/*     */     
/* 171 */     if (bool) {
/* 172 */       list.add(new a(el1.h(), ☃.V()));
/*     */     }
/*     */     
/* 175 */     int i = 0;
/* 176 */     for (int j = 0; j < list.size(); j++) {
/* 177 */       a a = list.get(j);
/*     */       
/* 179 */       i++;
/* 180 */       if (a.b(a).equals(el1) && i >= 8) {
/* 181 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 185 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bgw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */