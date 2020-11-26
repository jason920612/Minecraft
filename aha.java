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
/*     */ public class aha
/*     */   extends agt
/*     */ {
/*     */   public aks a;
/*     */   private double b;
/*     */   private int c;
/*     */   
/*     */   public aha(aks ☃, double d) {
/*  20 */     this.a = ☃;
/*  21 */     this.b = d;
/*  22 */     a(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  27 */     if (this.a.dm() || this.a.em()) {
/*  28 */       return false;
/*     */     }
/*     */     
/*  31 */     List<aks> ☃ = (List)this.a.m.a(this.a.getClass(), this.a.bD().c(9.0D, 4.0D, 9.0D));
/*  32 */     aks aks1 = null;
/*  33 */     double d = Double.MAX_VALUE;
/*  34 */     for (aks aks2 : ☃) {
/*     */       
/*  36 */       if (!aks2.em() || aks2.el()) {
/*     */         continue;
/*     */       }
/*     */       
/*  40 */       double d1 = this.a.h(aks2);
/*  41 */       if (d1 > d) {
/*     */         continue;
/*     */       }
/*     */       
/*  45 */       d = d1;
/*  46 */       aks1 = aks2;
/*     */     } 
/*     */     
/*  49 */     if (aks1 == null)
/*     */     {
/*  51 */       for (aks aks2 : ☃) {
/*  52 */         if (!aks2.dm()) {
/*     */           continue;
/*     */         }
/*     */         
/*  56 */         if (aks2.el()) {
/*     */           continue;
/*     */         }
/*     */         
/*  60 */         double d1 = this.a.h(aks2);
/*  61 */         if (d1 > d) {
/*     */           continue;
/*     */         }
/*     */         
/*  65 */         d = d1;
/*  66 */         aks1 = aks2;
/*     */       } 
/*     */     }
/*     */     
/*  70 */     if (aks1 == null) {
/*  71 */       return false;
/*     */     }
/*  73 */     if (d < 4.0D) {
/*  74 */       return false;
/*     */     }
/*     */     
/*  77 */     if (!aks1.dm() && !a(aks1, 1)) {
/*  78 */       return false;
/*     */     }
/*     */     
/*  81 */     this.a.a(aks1);
/*     */     
/*  83 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  88 */     if (!this.a.em() || !this.a.en().aF() || !a(this.a, 0)) {
/*  89 */       return false;
/*     */     }
/*     */     
/*  92 */     double ☃ = this.a.h(this.a.en());
/*  93 */     if (☃ > 676.0D) {
/*  94 */       if (this.b <= 3.0D) {
/*  95 */         this.b *= 1.2D;
/*  96 */         this.c = 40;
/*  97 */         return true;
/*     */       } 
/*     */       
/* 100 */       if (this.c == 0) {
/* 101 */         return false;
/*     */       }
/*     */     } 
/* 104 */     if (this.c > 0) {
/* 105 */       this.c--;
/*     */     }
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 112 */     this.a.ek();
/* 113 */     this.b = 2.1D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 118 */     if (!this.a.em()) {
/*     */       return;
/*     */     }
/*     */     
/* 122 */     aks ☃ = this.a.en();
/* 123 */     double d = this.a.g(☃);
/*     */     
/* 125 */     float f = 2.0F;
/* 126 */     cee cee = (new cee(☃.q - this.a.q, ☃.r - this.a.r, ☃.s - this.a.s)).a().a(Math.max(d - 2.0D, 0.0D));
/* 127 */     this.a.t().a(this.a.q + cee.b, this.a.r + cee.c, this.a.s + cee.d, this.b);
/*     */   }
/*     */   
/*     */   private boolean a(aks ☃, int i) {
/* 131 */     if (i > 8) {
/* 132 */       return false;
/*     */     }
/*     */     
/* 135 */     if (☃.em()) {
/* 136 */       if (☃.en().dm()) {
/* 137 */         return true;
/*     */       }
/* 139 */       return a(☃.en(), ++i);
/*     */     } 
/* 141 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */