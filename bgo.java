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
/*     */ public class bgo
/*     */   extends bco
/*     */ {
/*  14 */   public static final bmh<bmn> c = bma.S;
/*  15 */   public static final bmb o = bma.t;
/*     */   
/*     */   protected bgo(bcs.c ☃) {
/*  18 */     super(true, ☃);
/*  19 */     v(((blc)this.m.b()).a(c, bmn.a).a(o, Boolean.valueOf(false)));
/*     */   }
/*     */   
/*     */   protected boolean a(axy ☃, el el1, blc blc1, boolean bool, int i) {
/*  23 */     if (i >= 8) {
/*  24 */       return false;
/*     */     }
/*     */     
/*  27 */     int j = el1.o();
/*  28 */     int k = el1.p();
/*  29 */     int m = el1.q();
/*     */     
/*  31 */     boolean bool1 = true;
/*  32 */     bmn bmn = (bmn)blc1.c(c);
/*  33 */     switch (null.a[bmn.ordinal()]) {
/*     */       case 1:
/*  35 */         if (bool) {
/*  36 */           m++; break;
/*     */         } 
/*  38 */         m--;
/*     */         break;
/*     */       
/*     */       case 2:
/*  42 */         if (bool) {
/*  43 */           j--; break;
/*     */         } 
/*  45 */         j++;
/*     */         break;
/*     */       
/*     */       case 3:
/*  49 */         if (bool) {
/*  50 */           j--;
/*     */         } else {
/*  52 */           j++;
/*  53 */           k++;
/*  54 */           bool1 = false;
/*     */         } 
/*  56 */         bmn = bmn.b;
/*     */         break;
/*     */       case 4:
/*  59 */         if (bool) {
/*  60 */           j--;
/*  61 */           k++;
/*  62 */           bool1 = false;
/*     */         } else {
/*  64 */           j++;
/*     */         } 
/*  66 */         bmn = bmn.b;
/*     */         break;
/*     */       case 5:
/*  69 */         if (bool) {
/*  70 */           m++;
/*     */         } else {
/*  72 */           m--;
/*  73 */           k++;
/*  74 */           bool1 = false;
/*     */         } 
/*  76 */         bmn = bmn.a;
/*     */         break;
/*     */       case 6:
/*  79 */         if (bool) {
/*  80 */           m++;
/*  81 */           k++;
/*  82 */           bool1 = false;
/*     */         } else {
/*  84 */           m--;
/*     */         } 
/*  86 */         bmn = bmn.a;
/*     */         break;
/*     */     } 
/*     */     
/*  90 */     if (a(☃, new el(j, k, m), bool, i, bmn)) {
/*  91 */       return true;
/*     */     }
/*  93 */     if (bool1 && a(☃, new el(j, k - 1, m), bool, i, bmn)) {
/*  94 */       return true;
/*     */     }
/*  96 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(axy ☃, el el1, boolean bool, int i, bmn bmn1) {
/* 100 */     blc blc = ☃.a_(el1);
/*     */     
/* 102 */     if (blc.c() != this) {
/* 103 */       return false;
/*     */     }
/*     */     
/* 106 */     bmn bmn2 = (bmn)blc.c(c);
/* 107 */     if (bmn1 == bmn.b && (bmn2 == bmn.a || bmn2 == bmn.e || bmn2 == bmn.f)) {
/* 108 */       return false;
/*     */     }
/* 110 */     if (bmn1 == bmn.a && (bmn2 == bmn.b || bmn2 == bmn.c || bmn2 == bmn.d)) {
/* 111 */       return false;
/*     */     }
/*     */     
/* 114 */     if (((Boolean)blc.c(o)).booleanValue()) {
/* 115 */       if (☃.t(el1)) {
/* 116 */         return true;
/*     */       }
/* 118 */       return a(☃, el1, blc, bool, i + 1);
/*     */     } 
/*     */     
/* 121 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(blc ☃, axy axy1, el el1, bcs bcs1) {
/* 126 */     boolean bool1 = ((Boolean)☃.c(o)).booleanValue();
/* 127 */     boolean bool2 = (axy1.t(el1) || a(axy1, el1, ☃, true, 0) || a(axy1, el1, ☃, false, 0));
/*     */     
/* 129 */     if (bool2 != bool1) {
/* 130 */       axy1.a(el1, ☃.a(o, Boolean.valueOf(bool2)), 3);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 135 */       axy1.b(el1.b(), this);
/* 136 */       if (((bmn)☃.c(c)).c()) {
/* 137 */         axy1.b(el1.a(), this);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bmm<bmn> e() {
/* 144 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bhb bhb1) {
/* 149 */     switch (null.b[bhb1.ordinal()]) {
/*     */       case 1:
/* 151 */         switch (null.a[((bmn)☃.c(c)).ordinal()]) {
/*     */           case 3:
/* 153 */             return ☃.a(c, bmn.d);
/*     */           case 4:
/* 155 */             return ☃.a(c, bmn.c);
/*     */           case 5:
/* 157 */             return ☃.a(c, bmn.f);
/*     */           case 6:
/* 159 */             return ☃.a(c, bmn.e);
/*     */           case 7:
/* 161 */             return ☃.a(c, bmn.i);
/*     */           case 8:
/* 163 */             return ☃.a(c, bmn.j);
/*     */           case 9:
/* 165 */             return ☃.a(c, bmn.g);
/*     */           case 10:
/* 167 */             return ☃.a(c, bmn.h);
/*     */         } 
/*     */       case 2:
/* 170 */         switch (null.a[((bmn)☃.c(c)).ordinal()]) {
/*     */           case 1:
/* 172 */             return ☃.a(c, bmn.b);
/*     */           case 2:
/* 174 */             return ☃.a(c, bmn.a);
/*     */           case 3:
/* 176 */             return ☃.a(c, bmn.e);
/*     */           case 4:
/* 178 */             return ☃.a(c, bmn.f);
/*     */           case 5:
/* 180 */             return ☃.a(c, bmn.d);
/*     */           case 6:
/* 182 */             return ☃.a(c, bmn.c);
/*     */           case 7:
/* 184 */             return ☃.a(c, bmn.j);
/*     */           case 8:
/* 186 */             return ☃.a(c, bmn.g);
/*     */           case 9:
/* 188 */             return ☃.a(c, bmn.h);
/*     */           case 10:
/* 190 */             return ☃.a(c, bmn.i);
/*     */         } 
/*     */       case 3:
/* 193 */         switch (null.a[((bmn)☃.c(c)).ordinal()]) {
/*     */           case 1:
/* 195 */             return ☃.a(c, bmn.b);
/*     */           case 2:
/* 197 */             return ☃.a(c, bmn.a);
/*     */           case 3:
/* 199 */             return ☃.a(c, bmn.f);
/*     */           case 4:
/* 201 */             return ☃.a(c, bmn.e);
/*     */           case 5:
/* 203 */             return ☃.a(c, bmn.c);
/*     */           case 6:
/* 205 */             return ☃.a(c, bmn.d);
/*     */           case 7:
/* 207 */             return ☃.a(c, bmn.h);
/*     */           case 8:
/* 209 */             return ☃.a(c, bmn.i);
/*     */           case 9:
/* 211 */             return ☃.a(c, bmn.j);
/*     */           case 10:
/* 213 */             return ☃.a(c, bmn.g);
/*     */         }  break;
/*     */     } 
/* 216 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public blc a(blc ☃, bfz bfz1) {
/* 222 */     bmn bmn = (bmn)☃.c(c);
/* 223 */     switch (null.c[bfz1.ordinal()]) {
/*     */       case 1:
/* 225 */         switch (null.a[bmn.ordinal()]) {
/*     */           case 5:
/* 227 */             return ☃.a(c, bmn.f);
/*     */           case 6:
/* 229 */             return ☃.a(c, bmn.e);
/*     */           case 7:
/* 231 */             return ☃.a(c, bmn.j);
/*     */           case 8:
/* 233 */             return ☃.a(c, bmn.i);
/*     */           case 9:
/* 235 */             return ☃.a(c, bmn.h);
/*     */           case 10:
/* 237 */             return ☃.a(c, bmn.g);
/*     */         } 
/*     */         
/*     */         break;
/*     */       
/*     */       case 2:
/* 243 */         switch (null.a[bmn.ordinal()]) {
/*     */           case 3:
/* 245 */             return ☃.a(c, bmn.d);
/*     */           case 4:
/* 247 */             return ☃.a(c, bmn.c);
/*     */           case 7:
/* 249 */             return ☃.a(c, bmn.h);
/*     */           case 8:
/* 251 */             return ☃.a(c, bmn.g);
/*     */           case 9:
/* 253 */             return ☃.a(c, bmn.j);
/*     */           case 10:
/* 255 */             return ☃.a(c, bmn.i);
/*     */         } 
/*     */ 
/*     */         
/*     */         break;
/*     */     } 
/*     */ 
/*     */     
/* 263 */     return super.a(☃, bfz1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<bcs, blc> ☃) {
/* 268 */     ☃.a((bmm<?>[])new bmm[] { c, o });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bgo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */