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
/*     */ public class agv
/*     */   extends ahh
/*     */ {
/*     */   private final aob f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private int i;
/*     */   
/*     */   public agv(aob ☃, double d) {
/*  28 */     super(☃, d, 16);
/*  29 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  34 */     if (this.b <= 0) {
/*  35 */       if (!this.f.m.X().b("mobGriefing")) {
/*  36 */         return false;
/*     */       }
/*     */ 
/*     */       
/*  40 */       this.i = -1;
/*  41 */       this.g = this.f.dH();
/*  42 */       this.h = this.f.dG();
/*     */     } 
/*     */     
/*  45 */     return super.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  50 */     return (this.i >= 0 && super.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  55 */     super.e();
/*     */     
/*  57 */     this.f.p().a(this.d.o() + 0.5D, (this.d.p() + 1), this.d.q() + 0.5D, 10.0F, this.f.K());
/*     */     
/*  59 */     if (k()) {
/*  60 */       axz ☃ = this.f.m;
/*  61 */       el el = this.d.a();
/*     */       
/*  63 */       blc blc = ☃.a_(el);
/*  64 */       bcs bcs = blc.c();
/*     */       
/*  66 */       if (this.i == 0 && bcs instanceof bdv && ((bdv)bcs).w(blc)) {
/*  67 */         ☃.a(el, true);
/*  68 */       } else if (this.i == 1 && blc.f()) {
/*     */ 
/*     */         
/*  71 */         adt adt = this.f.dD();
/*  72 */         for (int i = 0; i < adt.T_(); i++) {
/*  73 */           ate ate = adt.a(i);
/*  74 */           boolean bool = false;
/*  75 */           if (!ate.a()) {
/*  76 */             if (ate.b() == atf.R) {
/*  77 */               ☃.a(el, bct.cp.p(), 3);
/*  78 */               bool = true;
/*  79 */             } else if (ate.b() == atf.dD) {
/*  80 */               ☃.a(el, bct.eU.p(), 3);
/*  81 */               bool = true;
/*  82 */             } else if (ate.b() == atf.dC) {
/*  83 */               ☃.a(el, bct.eT.p(), 3);
/*  84 */               bool = true;
/*  85 */             } else if (ate.b() == atf.eO) {
/*  86 */               ☃.a(el, bct.ie.p(), 3);
/*  87 */               bool = true;
/*     */             } 
/*     */           }
/*  90 */           if (bool) {
/*  91 */             ate.g(1);
/*  92 */             if (ate.a()) {
/*  93 */               adt.a(i, ate.a);
/*     */             }
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*  99 */       this.i = -1;
/*     */       
/* 101 */       this.b = 10;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(ayc ☃, el el1) {
/* 107 */     bcs bcs = ☃.a_(el1).c();
/*     */     
/* 109 */     if (bcs == bct.cq) {
/* 110 */       el1 = el1.a();
/* 111 */       blc blc = ☃.a_(el1);
/* 112 */       bcs = blc.c();
/*     */       
/* 114 */       if (bcs instanceof bdv && ((bdv)bcs).w(blc) && this.h && (this.i == 0 || this.i < 0)) {
/* 115 */         this.i = 0;
/* 116 */         return true;
/* 117 */       }  if (blc.f() && this.g && (this.i == 1 || this.i < 0)) {
/* 118 */         this.i = 1;
/* 119 */         return true;
/*     */       } 
/*     */     } 
/* 122 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */