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
/*     */ public class alj
/*     */   extends alf
/*     */ {
/*     */   private cbe b;
/*     */   private cee c;
/*     */   private boolean d;
/*     */   
/*     */   public alj(ald ☃) {
/*  22 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public alt<alj> i() {
/*  27 */     return alt.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  32 */     double ☃ = (this.c == null) ? 0.0D : this.c.c(this.a.q, this.a.r, this.a.s);
/*  33 */     if (☃ < 100.0D || ☃ > 22500.0D || this.a.B || this.a.C) {
/*  34 */       j();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  40 */     this.b = null;
/*  41 */     this.c = null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cee g() {
/*  47 */     return this.c;
/*     */   }
/*     */   
/*     */   private void j() {
/*  51 */     if (this.b != null && this.b.b()) {
/*  52 */       el ☃ = this.a.m.a(bor.a.e, new el(bqn.a));
/*     */ 
/*     */ 
/*     */       
/*  56 */       int i = (this.a.ds() == null) ? 0 : this.a.ds().c();
/*     */       
/*  58 */       if (this.a.ce().nextInt(i + 3) == 0) {
/*  59 */         this.a.dr().a(alt.c);
/*     */         return;
/*     */       } 
/*  62 */       double d = 64.0D;
/*  63 */       aog aog = this.a.m.a(☃, d, d);
/*  64 */       if (aog != null) {
/*  65 */         d = aog.d(☃) / 512.0D;
/*     */       }
/*  67 */       if (aog != null && (this.a.ce().nextInt(xq.a((int)d) + 2) == 0 || this.a.ce().nextInt(i + 2) == 0)) {
/*     */         
/*  69 */         a(aog);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/*  75 */     if (this.b == null || this.b.b()) {
/*  76 */       int ☃ = this.a.l();
/*  77 */       int i = ☃;
/*     */       
/*  79 */       if (this.a.ce().nextInt(8) == 0) {
/*  80 */         this.d = !this.d;
/*  81 */         i += 6;
/*     */       } 
/*     */       
/*  84 */       if (this.d) {
/*  85 */         i++;
/*     */       } else {
/*  87 */         i--;
/*     */       } 
/*     */       
/*  90 */       if (this.a.ds() == null || this.a.ds().c() < 0) {
/*     */         
/*  92 */         i -= 12;
/*  93 */         i &= 0x7;
/*  94 */         i += 12;
/*     */       } else {
/*     */         
/*  97 */         i %= 12;
/*  98 */         if (i < 0) {
/*  99 */           i += 12;
/*     */         }
/*     */       } 
/*     */       
/* 103 */       this.b = this.a.a(☃, i, (cbc)null);
/* 104 */       if (this.b != null) {
/* 105 */         this.b.a();
/*     */       }
/*     */     } 
/*     */     
/* 109 */     k();
/*     */   }
/*     */   
/*     */   private void a(aog ☃) {
/* 113 */     this.a.dr().a(alt.b);
/* 114 */     ((alr)this.a.dr().<alr>b(alt.b)).a(☃);
/*     */   }
/*     */   
/*     */   private void k() {
/* 118 */     if (this.b != null && !this.b.b()) {
/* 119 */       double d3; cee ☃ = this.b.f();
/*     */       
/* 121 */       this.b.a();
/* 122 */       double d1 = ☃.b;
/* 123 */       double d2 = ☃.d;
/*     */ 
/*     */       
/*     */       do {
/* 127 */         d3 = ☃.c + (this.a.ce().nextFloat() * 20.0F);
/* 128 */       } while (d3 < ☃.c);
/*     */       
/* 130 */       this.c = new cee(d1, d3, d2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(alc ☃, el el1, aea aea1, @Nullable aog aog1) {
/* 136 */     if (aog1 != null && !aog1.bV.a)
/* 137 */       a(aog1); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\alj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */