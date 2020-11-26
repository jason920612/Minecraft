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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class apo
/*     */   extends api
/*     */   implements bjv
/*     */ {
/*     */   private boolean d = true;
/*  26 */   private int e = -1;
/*  27 */   private final el f = el.a;
/*     */   
/*     */   public apo(axy ☃) {
/*  30 */     super(aev.R, ☃);
/*     */   }
/*     */   
/*     */   public apo(axy ☃, double d1, double d2, double d3) {
/*  34 */     super(aev.R, d1, d2, d3, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public aph.a v() {
/*  39 */     return aph.a.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public blc z() {
/*  44 */     return bct.fx.p();
/*     */   }
/*     */ 
/*     */   
/*     */   public int B() {
/*  49 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/*  54 */     return 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(aog ☃, adk adk1) {
/*  59 */     if (!this.m.B) {
/*  60 */       ☃.a(this);
/*     */     }
/*     */     
/*  63 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {
/*  68 */     boolean bool1 = !bool;
/*     */     
/*  70 */     if (bool1 != D()) {
/*  71 */       o(bool1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean D() {
/*  76 */     return this.d;
/*     */   }
/*     */   
/*     */   public void o(boolean ☃) {
/*  80 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public axy F() {
/*  85 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public double G() {
/*  90 */     return this.q;
/*     */   }
/*     */ 
/*     */   
/*     */   public double H() {
/*  95 */     return this.r + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double I() {
/* 100 */     return this.s;
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 105 */     super.R_();
/*     */     
/* 107 */     if (!this.m.B && aF() && D()) {
/* 108 */       el ☃ = new el(this);
/* 109 */       if (☃.equals(this.f)) {
/* 110 */         this.e--;
/*     */       } else {
/* 112 */         m(0);
/*     */       } 
/*     */       
/* 115 */       if (!K()) {
/* 116 */         m(0);
/*     */         
/* 118 */         if (J()) {
/* 119 */           m(4);
/* 120 */           g();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean J() {
/* 127 */     if (bjw.a(this)) {
/* 128 */       return true;
/*     */     }
/*     */     
/* 131 */     List<amm> ☃ = (List)this.m.a((Class)amm.class, bD().c(0.25D, 0.0D, 0.25D), aeu.a);
/*     */     
/* 133 */     if (!☃.isEmpty()) {
/* 134 */       bjw.a(this, ☃.get(0));
/*     */     }
/*     */     
/* 137 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/* 142 */     super.a(☃);
/*     */     
/* 144 */     if (this.m.X().b("doEntityDrops")) {
/* 145 */       a(bct.fx);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(gy ☃) {
/* 151 */     super.b(☃);
/* 152 */     ☃.b("TransferCooldown", this.e);
/* 153 */     ☃.a("Enabled", this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gy ☃) {
/* 158 */     super.a(☃);
/* 159 */     this.e = ☃.h("TransferCooldown");
/* 160 */     this.d = ☃.e("Enabled") ? ☃.q("Enabled") : true;
/*     */   }
/*     */   
/*     */   public void m(int ☃) {
/* 164 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public boolean K() {
/* 168 */     return (this.e > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 173 */     return "minecraft:hopper";
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 178 */     return new aqj(☃, this, aog1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\apo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */