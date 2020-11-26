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
/*     */ public class arm
/*     */   extends asd
/*     */ {
/*     */   public arm(asc ☃, ata.a a1) {
/*  25 */     super(☃, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aup ☃) {
/*  30 */     axy axy = ☃.k();
/*  31 */     el el1 = ☃.a();
/*  32 */     el el2 = el1.a(☃.l());
/*     */ 
/*     */     
/*  35 */     if (a(☃.i(), axy, el1)) {
/*  36 */       if (!axy.B) {
/*  37 */         axy.b(2005, el1, 0);
/*     */       }
/*  39 */       return adm.a;
/*     */     } 
/*     */ 
/*     */     
/*  43 */     blc blc = axy.a_(el1);
/*  44 */     boolean bool = (blc.c(axy, el1, ☃.l()) == blb.a);
/*  45 */     if (bool && 
/*  46 */       a(☃.i(), axy, el2, ☃.l())) {
/*  47 */       if (!axy.B) {
/*  48 */         axy.b(2005, el2, 0);
/*     */       }
/*  50 */       return adm.a;
/*     */     } 
/*     */ 
/*     */     
/*  54 */     return adm.b;
/*     */   }
/*     */   
/*     */   public static boolean a(ate ☃, axy axy1, el el1) {
/*  58 */     blc blc = axy1.a_(el1);
/*     */     
/*  60 */     if (blc.c() instanceof bcv) {
/*  61 */       bcv bcv = (bcv)blc.c();
/*     */       
/*  63 */       if (bcv.a(axy1, el1, blc, axy1.B)) {
/*  64 */         if (!axy1.B) {
/*  65 */           if (bcv.a(axy1, axy1.s, el1, blc)) {
/*  66 */             bcv.b(axy1, axy1.s, el1, blc);
/*     */           }
/*  68 */           ☃.g(1);
/*     */         } 
/*  70 */         return true;
/*     */       } 
/*     */     } 
/*  73 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(ate ☃, axy axy1, el el1, @Nullable eq eq1) {
/*  77 */     if (axy1.a_(el1).c() == bct.A && axy1.b(el1).g() == 8) {
/*  78 */       if (!axy1.B) {
/*     */         int i;
/*  80 */         label46: for (i = 0; i < 128; i++) {
/*  81 */           el el2 = el1;
/*  82 */           ayu ayu = axy1.d(el2);
/*  83 */           blc blc = bct.aU.p();
/*     */           int j;
/*  85 */           for (j = 0; j < i / 16; j++) {
/*  86 */             el2 = el2.a(i.nextInt(3) - 1, (i.nextInt(3) - 1) * i.nextInt(3) / 2, i.nextInt(3) - 1);
/*  87 */             ayu = axy1.d(el2);
/*     */             
/*  89 */             if (axy1.a_(el2).k()) {
/*     */               continue label46;
/*     */             }
/*     */           } 
/*     */           
/*  94 */           if (ayu == ayz.T || ayu == ayz.W) {
/*  95 */             if (i == 0 && eq1 != null && eq1.k().c()) {
/*     */               
/*  97 */               blc = ((bcs)wv.J.a(axy1.s)).p().a(bcl.a, eq1);
/*  98 */             } else if (i.nextInt(4) == 0) {
/*  99 */               blc = ((bcs)wv.H.a(i)).p();
/*     */             } 
/*     */           }
/*     */           
/* 103 */           if (blc.c().a(wv.J)) {
/* 104 */             j = 0;
/* 105 */             while (!blc.a(axy1, el2) && j < 4) {
/* 106 */               blc = blc.a(bcl.a, eq.c.a.a(i));
/* 107 */               j++;
/*     */             } 
/*     */           } 
/*     */           
/* 111 */           if (blc.a(axy1, el2)) {
/*     */ 
/*     */ 
/*     */             
/* 115 */             blc blc1 = axy1.a_(el2);
/* 116 */             if (blc1.c() == bct.A && axy1.b(el2).g() == 8) {
/* 117 */               axy1.a(el2, blc, 3);
/*     */             
/*     */             }
/* 120 */             else if (blc1.c() == bct.aU && i.nextInt(10) == 0) {
/* 121 */               ((bcv)bct.aU).b(axy1, i, el2, blc1);
/*     */             } 
/*     */           } 
/*     */         } 
/* 125 */         ☃.g(1);
/*     */       } 
/* 127 */       return true;
/*     */     } 
/* 129 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\arm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */