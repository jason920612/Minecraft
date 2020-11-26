/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class bdz
/*     */   extends bco
/*     */ {
/*  30 */   public static final bmh<bmn> c = bma.S;
/*  31 */   public static final bmb o = bma.t;
/*     */   
/*     */   public bdz(bcs.c ☃) {
/*  34 */     super(true, ☃);
/*  35 */     v(((blc)this.m.b()).a(o, Boolean.valueOf(false)).a(c, bmn.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ayc ☃) {
/*  40 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(blc ☃) {
/*  45 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, aer aer1) {
/*  50 */     if (axy1.B) {
/*     */       return;
/*     */     }
/*     */     
/*  54 */     if (((Boolean)☃.c(o)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/*  58 */     a(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, Random random) {
/*  63 */     if (axy1.B || !((Boolean)☃.c(o)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/*  67 */     a(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axk axk1, el el1, eq eq1) {
/*  72 */     return ((Boolean)☃.c(o)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(blc ☃, axk axk1, el el1, eq eq1) {
/*  77 */     if (!((Boolean)☃.c(o)).booleanValue()) {
/*  78 */       return 0;
/*     */     }
/*  80 */     return (eq1 == eq.b) ? 15 : 0;
/*     */   }
/*     */   
/*     */   private void a(axy ☃, el el1, blc blc1) {
/*  84 */     boolean bool1 = ((Boolean)blc1.c(o)).booleanValue();
/*  85 */     boolean bool2 = false;
/*     */     
/*  87 */     List<aph> list = a(☃, el1, aph.class, (Predicate<aer>)null);
/*  88 */     if (!list.isEmpty()) {
/*  89 */       bool2 = true;
/*     */     }
/*     */     
/*  92 */     if (bool2 && !bool1) {
/*  93 */       ☃.a(el1, blc1.a(o, Boolean.valueOf(true)), 3);
/*  94 */       b(☃, el1, blc1, true);
/*  95 */       ☃.b(el1, this);
/*  96 */       ☃.b(el1.b(), this);
/*  97 */       ☃.a(el1, el1);
/*     */     } 
/*     */     
/* 100 */     if (!bool2 && bool1) {
/* 101 */       ☃.a(el1, blc1.a(o, Boolean.valueOf(false)), 3);
/* 102 */       b(☃, el1, blc1, false);
/* 103 */       ☃.b(el1, this);
/* 104 */       ☃.b(el1.b(), this);
/* 105 */       ☃.a(el1, el1);
/*     */     } 
/*     */     
/* 108 */     if (bool2) {
/* 109 */       ☃.J().a(el1, this, a(☃));
/*     */     }
/*     */     
/* 112 */     ☃.c(el1, this);
/*     */   }
/*     */   
/*     */   protected void b(axy ☃, el el1, blc blc1, boolean bool) {
/* 116 */     bgs bgs = new bgs(☃, el1, blc1);
/* 117 */     List<el> list = bgs.a();
/*     */     
/* 119 */     for (el el2 : list) {
/* 120 */       blc blc2 = ☃.a_(el2);
/* 121 */       blc2.a(☃, el2, blc2.c(), el1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(blc ☃, axy axy1, el el1, blc blc1) {
/* 127 */     if (blc1.c() == ☃.c()) {
/*     */       return;
/*     */     }
/* 130 */     super.a(☃, axy1, el1, blc1);
/* 131 */     a(axy1, el1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmm<bmn> e() {
/* 136 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(blc ☃) {
/* 141 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(blc ☃, axy axy1, el el1) {
/* 146 */     if (((Boolean)☃.c(o)).booleanValue()) {
/* 147 */       List<apm> list = a(axy1, el1, apm.class, (Predicate<aer>)null);
/* 148 */       if (!list.isEmpty()) {
/* 149 */         return ((apm)list.get(0)).f().i();
/*     */       }
/*     */       
/* 152 */       List<aph> list1 = a(axy1, el1, aph.class, aeu.d);
/* 153 */       if (!list1.isEmpty()) {
/* 154 */         return apv.b((ade)list1.get(0));
/*     */       }
/*     */     } 
/*     */     
/* 158 */     return 0;
/*     */   }
/*     */   
/*     */   protected <T extends aph> List<T> a(axy ☃, el el1, Class<T> clazz, @Nullable Predicate<aer> predicate) {
/* 162 */     return (List)☃.a((Class)clazz, a(el1), predicate);
/*     */   }
/*     */   
/*     */   private cea a(el ☃) {
/* 166 */     float f = 0.2F;
/*     */     
/* 168 */     return new cea((☃.o() + 0.2F), ☃.p(), (☃.q() + 0.2F), ((☃.o() + 1) - 0.2F), ((☃.p() + 1) - 0.2F), ((☃.q() + 1) - 0.2F));
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 173 */     switch (null.b[bhb1.ordinal()]) {
/*     */       case 1:
/* 175 */         switch (null.a[((bmn)☃.c(c)).ordinal()]) {
/*     */           case 1:
/* 177 */             return ☃.a(c, bmn.d);
/*     */           case 2:
/* 179 */             return ☃.a(c, bmn.c);
/*     */           case 3:
/* 181 */             return ☃.a(c, bmn.f);
/*     */           case 4:
/* 183 */             return ☃.a(c, bmn.e);
/*     */           case 5:
/* 185 */             return ☃.a(c, bmn.i);
/*     */           case 6:
/* 187 */             return ☃.a(c, bmn.j);
/*     */           case 7:
/* 189 */             return ☃.a(c, bmn.g);
/*     */           case 8:
/* 191 */             return ☃.a(c, bmn.h);
/*     */         } 
/*     */       case 2:
/* 194 */         switch (null.a[((bmn)☃.c(c)).ordinal()]) {
/*     */           case 9:
/* 196 */             return ☃.a(c, bmn.b);
/*     */           case 10:
/* 198 */             return ☃.a(c, bmn.a);
/*     */           case 1:
/* 200 */             return ☃.a(c, bmn.e);
/*     */           case 2:
/* 202 */             return ☃.a(c, bmn.f);
/*     */           case 3:
/* 204 */             return ☃.a(c, bmn.d);
/*     */           case 4:
/* 206 */             return ☃.a(c, bmn.c);
/*     */           case 5:
/* 208 */             return ☃.a(c, bmn.j);
/*     */           case 6:
/* 210 */             return ☃.a(c, bmn.g);
/*     */           case 7:
/* 212 */             return ☃.a(c, bmn.h);
/*     */           case 8:
/* 214 */             return ☃.a(c, bmn.i);
/*     */         } 
/*     */       case 3:
/* 217 */         switch (null.a[((bmn)☃.c(c)).ordinal()]) {
/*     */           case 9:
/* 219 */             return ☃.a(c, bmn.b);
/*     */           case 10:
/* 221 */             return ☃.a(c, bmn.a);
/*     */           case 1:
/* 223 */             return ☃.a(c, bmn.f);
/*     */           case 2:
/* 225 */             return ☃.a(c, bmn.e);
/*     */           case 3:
/* 227 */             return ☃.a(c, bmn.c);
/*     */           case 4:
/* 229 */             return ☃.a(c, bmn.d);
/*     */           case 5:
/* 231 */             return ☃.a(c, bmn.h);
/*     */           case 6:
/* 233 */             return ☃.a(c, bmn.i);
/*     */           case 7:
/* 235 */             return ☃.a(c, bmn.j);
/*     */           case 8:
/* 237 */             return ☃.a(c, bmn.g);
/*     */         }  break;
/*     */     } 
/* 240 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 246 */     bmn bmn = (bmn)☃.c(c);
/* 247 */     switch (null.c[bfz1.ordinal()]) {
/*     */       case 1:
/* 249 */         switch (null.a[bmn.ordinal()]) {
/*     */           case 3:
/* 251 */             return ☃.a(c, bmn.f);
/*     */           case 4:
/* 253 */             return ☃.a(c, bmn.e);
/*     */           case 5:
/* 255 */             return ☃.a(c, bmn.j);
/*     */           case 6:
/* 257 */             return ☃.a(c, bmn.i);
/*     */           case 7:
/* 259 */             return ☃.a(c, bmn.h);
/*     */           case 8:
/* 261 */             return ☃.a(c, bmn.g);
/*     */         } 
/*     */         
/*     */         break;
/*     */       
/*     */       case 2:
/* 267 */         switch (null.a[bmn.ordinal()]) {
/*     */           case 1:
/* 269 */             return ☃.a(c, bmn.d);
/*     */           case 2:
/* 271 */             return ☃.a(c, bmn.c);
/*     */           case 5:
/* 273 */             return ☃.a(c, bmn.h);
/*     */           case 6:
/* 275 */             return ☃.a(c, bmn.g);
/*     */           case 7:
/* 277 */             return ☃.a(c, bmn.j);
/*     */           case 8:
/* 279 */             return ☃.a(c, bmn.i);
/*     */         } 
/*     */ 
/*     */         
/*     */         break;
/*     */     } 
/*     */ 
/*     */     
/* 287 */     return super.a(☃, bfz1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 292 */     ☃.a((bmm<?>[])new bmm[] { c, o });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bdz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */