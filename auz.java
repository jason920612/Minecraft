/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class auz
/*     */   extends avd
/*     */ {
/*     */   public auz(pc ☃) {
/*  17 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  22 */     if (!(☃ instanceof aqc)) {
/*  23 */       return false;
/*     */     }
/*     */     
/*  26 */     ate ate = ate.a;
/*  27 */     List<ate> list = Lists.newArrayList();
/*     */     
/*  29 */     for (int i = 0; i < ☃.T_(); i++) {
/*  30 */       ate ate1 = ☃.a(i);
/*  31 */       if (!ate1.a())
/*     */       {
/*     */ 
/*     */         
/*  35 */         if (ate1.b() instanceof ase) {
/*  36 */           if (!ate.a()) {
/*  37 */             return false;
/*     */           }
/*  39 */           ate = ate1;
/*  40 */         } else if (ate1.b() instanceof asd) {
/*  41 */           list.add(ate1);
/*     */         } else {
/*  43 */           return false;
/*     */         } 
/*     */       }
/*     */     } 
/*  47 */     return (!ate.a() && !list.isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/*  52 */     ate ate = ate.a;
/*  53 */     int[] arrayOfInt = new int[3];
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     ase ase = null;
/*     */     int k;
/*  58 */     for (k = 0; k < ☃.T_(); k++) {
/*  59 */       ate ate1 = ☃.a(k);
/*  60 */       if (!ate1.a()) {
/*     */ 
/*     */ 
/*     */         
/*  64 */         ata ata = ate1.b();
/*  65 */         if (ata instanceof ase) {
/*  66 */           ase = (ase)ata;
/*     */           
/*  68 */           if (ate.a()) {
/*  69 */             ate = ate1.i();
/*  70 */             ate.e(1);
/*     */             
/*  72 */             if (ase.e(ate1)) {
/*  73 */               int i2 = ase.f(ate);
/*  74 */               float f3 = (i2 >> 16 & 0xFF) / 255.0F;
/*  75 */               float f4 = (i2 >> 8 & 0xFF) / 255.0F;
/*  76 */               float f5 = (i2 & 0xFF) / 255.0F;
/*     */               
/*  78 */               i = (int)(i + Math.max(f3, Math.max(f4, f5)) * 255.0F);
/*     */               
/*  80 */               arrayOfInt[0] = (int)(arrayOfInt[0] + f3 * 255.0F);
/*  81 */               arrayOfInt[1] = (int)(arrayOfInt[1] + f4 * 255.0F);
/*  82 */               arrayOfInt[2] = (int)(arrayOfInt[2] + f5 * 255.0F);
/*  83 */               j++;
/*     */             } 
/*     */           } else {
/*  86 */             return ate.a;
/*     */           } 
/*  88 */         } else if (ata instanceof asd) {
/*  89 */           float[] arrayOfFloat = ((asd)ata).d().d();
/*  90 */           int i2 = (int)(arrayOfFloat[0] * 255.0F);
/*  91 */           int i3 = (int)(arrayOfFloat[1] * 255.0F);
/*  92 */           int i4 = (int)(arrayOfFloat[2] * 255.0F);
/*     */           
/*  94 */           i += Math.max(i2, Math.max(i3, i4));
/*     */           
/*  96 */           arrayOfInt[0] = arrayOfInt[0] + i2;
/*  97 */           arrayOfInt[1] = arrayOfInt[1] + i3;
/*  98 */           arrayOfInt[2] = arrayOfInt[2] + i4;
/*  99 */           j++;
/*     */         } else {
/* 101 */           return ate.a;
/*     */         } 
/*     */       } 
/*     */     } 
/* 105 */     if (ase == null) {
/* 106 */       return ate.a;
/*     */     }
/*     */     
/* 109 */     k = arrayOfInt[0] / j;
/* 110 */     int m = arrayOfInt[1] / j;
/* 111 */     int n = arrayOfInt[2] / j;
/*     */     
/* 113 */     float f1 = i / j;
/* 114 */     float f2 = Math.max(k, Math.max(m, n));
/*     */     
/* 116 */     k = (int)(k * f1 / f2);
/* 117 */     m = (int)(m * f1 / f2);
/* 118 */     n = (int)(n * f1 / f2);
/*     */     
/* 120 */     int i1 = k;
/* 121 */     i1 = (i1 << 8) + m;
/* 122 */     i1 = (i1 << 8) + n;
/*     */     
/* 124 */     ase.a(ate, i1);
/* 125 */     return ate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/* 135 */     return avn.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\auz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */