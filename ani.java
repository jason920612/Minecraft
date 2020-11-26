/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ani
/*     */   extends anw
/*     */ {
/*  35 */   private static final UUID a = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
/*  36 */   private static final afo b = (new afo(a, "Attacking speed boost", 0.05D, 0)).a(false);
/*     */   
/*     */   private int bC;
/*     */   private int bD;
/*     */   private UUID bE;
/*     */   
/*     */   public ani(axy ☃) {
/*  43 */     super(aev.ab, ☃);
/*  44 */     this.aa = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable afa ☃) {
/*  49 */     super.a(☃);
/*  50 */     if (☃ != null) {
/*  51 */       this.bE = ☃.bt();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l() {
/*  57 */     this.by.a(2, new aii(this, 1.0D, false));
/*  58 */     this.by.a(7, new aih(this, 1.0D));
/*     */     
/*  60 */     this.bz.a(1, new b(this));
/*  61 */     this.bz.a(2, new a(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/*  66 */     super.bZ();
/*     */     
/*  68 */     a(c).a(0.0D);
/*  69 */     a(ank.d).a(0.23000000417232513D);
/*  70 */     a(ank.f).a(5.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean dC() {
/*  75 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/*  80 */     afn ☃ = a(ank.d);
/*  81 */     if (dF()) {
/*  82 */       if (!y_() && !☃.a(b)) {
/*  83 */         ☃.b(b);
/*     */       }
/*  85 */       this.bC--;
/*  86 */     } else if (☃.a(b)) {
/*  87 */       ☃.c(b);
/*     */     } 
/*     */     
/*  90 */     if (this.bD > 0 && 
/*  91 */       --this.bD == 0) {
/*  92 */       a(wj.lC, cD() * 2.0F, ((this.T.nextFloat() - this.T.nextFloat()) * 0.2F + 1.0F) * 1.8F);
/*     */     }
/*     */ 
/*     */     
/*  96 */     if (this.bC > 0 && 
/*  97 */       this.bE != null && cf() == null) {
/*  98 */       aog aog = this.m.b(this.bE);
/*  99 */       a(aog);
/* 100 */       this.aV = aog;
/* 101 */       this.aW = cg();
/*     */     } 
/*     */ 
/*     */     
/* 105 */     super.J();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, boolean bool) {
/* 110 */     return (☃.aj() != adi.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ayc ☃) {
/* 115 */     return (☃.a_(this, bD()) && ☃.c(this, bD()) && !☃.c(bD()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 120 */     super.b(☃);
/* 121 */     ☃.a("Anger", (short)this.bC);
/* 122 */     if (this.bE != null) {
/* 123 */       ☃.a("HurtBy", this.bE.toString());
/*     */     } else {
/* 125 */       ☃.a("HurtBy", "");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 131 */     super.a(☃);
/* 132 */     this.bC = ☃.g("Anger");
/* 133 */     String str = ☃.l("HurtBy");
/* 134 */     if (!str.isEmpty()) {
/* 135 */       this.bE = UUID.fromString(str);
/*     */       
/* 137 */       aog aog = this.m.b(this.bE);
/* 138 */       a(aog);
/* 139 */       if (aog != null) {
/* 140 */         this.aV = aog;
/* 141 */         this.aW = cg();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aea ☃, float f) {
/* 148 */     if (b(☃)) {
/* 149 */       return false;
/*     */     }
/* 151 */     aer aer = ☃.k();
/* 152 */     if (aer instanceof aog && !((aog)aer).u()) {
/* 153 */       a(aer);
/*     */     }
/* 155 */     return super.a(☃, f);
/*     */   }
/*     */   
/*     */   private void a(aer ☃) {
/* 159 */     this.bC = 400 + this.T.nextInt(400);
/* 160 */     this.bD = this.T.nextInt(40);
/* 161 */     if (☃ instanceof afa) {
/* 162 */       a((afa)☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean dF() {
/* 167 */     return (this.bC > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 172 */     return wj.lB;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 177 */     return wj.lE;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 182 */     return wj.lD;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 188 */     return ccl.au;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 193 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adj ☃) {
/* 198 */     a(aew.a, new ate(atf.F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected ate dB() {
/* 203 */     return ate.a;
/*     */   }
/*     */   
/*     */   static class b extends ail {
/*     */     public b(ani ☃) {
/* 208 */       super(☃, true, new Class[0]);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(afg ☃, afa afa1) {
/* 213 */       super.a(☃, afa1);
/*     */       
/* 215 */       if (☃ instanceof ani)
/* 216 */         ani.a((ani)☃, afa1); 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends aio<aog> {
/*     */     public a(ani ☃) {
/* 223 */       super(☃, aog.class, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 228 */       return (((ani)this.e).dF() && super.a());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(aog ☃) {
/* 234 */     return dF();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ani.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */