/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class bkg
/*     */   extends bkh
/*     */   implements pt
/*     */ {
/*  36 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private long e;
/*     */   
/*     */   private int f;
/*     */   
/*     */   private el g;
/*     */   
/*     */   private boolean h;
/*     */ 
/*     */   
/*     */   public bkg() {
/*  49 */     super(bjj.u);
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  54 */     super.a(☃);
/*  55 */     ☃.a("Age", this.e);
/*  56 */     if (this.g != null) {
/*  57 */       ☃.a("ExitPortal", hk.a(this.g));
/*     */     }
/*  59 */     if (this.h) {
/*  60 */       ☃.a("ExactTeleport", this.h);
/*     */     }
/*     */     
/*  63 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  68 */     super.b(☃);
/*  69 */     this.e = ☃.i("Age");
/*  70 */     if (☃.c("ExitPortal", 10)) {
/*  71 */       this.g = hk.c(☃.p("ExitPortal"));
/*     */     }
/*  73 */     this.h = ☃.q("ExactTeleport");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void Y_() {
/*  83 */     boolean ☃ = c();
/*  84 */     boolean bool1 = d();
/*  85 */     this.e++;
/*     */     
/*  87 */     if (bool1) {
/*  88 */       this.f--;
/*  89 */     } else if (!this.c_.B) {
/*  90 */       List<aer> list = this.c_.a(aer.class, new cea(v()));
/*  91 */       if (!list.isEmpty()) {
/*  92 */         a(list.get(0));
/*     */       }
/*  94 */       if (this.e % 2400L == 0L) {
/*  95 */         f();
/*     */       }
/*     */     } 
/*     */     
/*  99 */     if (☃ != c() || bool1 != d()) {
/* 100 */       g();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 105 */     return (this.e < 200L);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 109 */     return (this.f > 0);
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
/*     */   @Nullable
/*     */   public ji Z_() {
/* 123 */     return new ji(this.d_, 8, aa_());
/*     */   }
/*     */ 
/*     */   
/*     */   public gy aa_() {
/* 128 */     return a(new gy());
/*     */   }
/*     */   
/*     */   public void f() {
/* 132 */     if (!this.c_.B) {
/* 133 */       this.f = 40;
/* 134 */       this.c_.a(v(), w().c(), 1, 0);
/* 135 */       g();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 141 */     if (☃ == 1) {
/* 142 */       this.f = 40;
/* 143 */       return true;
/*     */     } 
/*     */     
/* 146 */     return super.c(☃, i);
/*     */   }
/*     */   
/*     */   public void a(aer ☃) {
/* 150 */     if (this.c_.B || d()) {
/*     */       return;
/*     */     }
/* 153 */     this.f = 100;
/*     */     
/* 155 */     if (this.g == null && this.c_.t instanceof boi) {
/* 156 */       j();
/*     */     }
/*     */     
/* 159 */     if (this.g != null) {
/* 160 */       el el1 = this.h ? this.g : i();
/* 161 */       ☃.a(el1.o() + 0.5D, el1.p() + 0.5D, el1.q() + 0.5D);
/*     */     } 
/*     */     
/* 164 */     f();
/*     */   }
/*     */   
/*     */   private el i() {
/* 168 */     el ☃ = a(this.c_, this.g, 5, false);
/* 169 */     a.debug("Best exit position for portal at {} is {}", this.g, ☃);
/* 170 */     return ☃.a();
/*     */   }
/*     */   
/*     */   private void j() {
/* 174 */     cee ☃ = (new cee(v().o(), 0.0D, v().q())).a();
/* 175 */     cee cee1 = ☃.a(1024.0D);
/*     */     
/* 177 */     int i = 16;
/* 178 */     while (a(this.c_, cee1).b() > 0 && i-- > 0) {
/* 179 */       a.debug("Skipping backwards past nonempty chunk at {}", cee1);
/* 180 */       cee1 = cee1.e(☃.a(-16.0D));
/*     */     } 
/*     */     
/* 183 */     i = 16;
/* 184 */     while (a(this.c_, cee1).b() == 0 && i-- > 0) {
/* 185 */       a.debug("Skipping forward past empty chunk at {}", cee1);
/* 186 */       cee1 = cee1.e(☃.a(16.0D));
/*     */     } 
/* 188 */     a.debug("Found chunk at {}", cee1);
/*     */     
/* 190 */     bnj bnj = a(this.c_, cee1);
/*     */     
/* 192 */     this.g = a(bnj);
/*     */     
/* 194 */     if (this.g == null) {
/* 195 */       this.g = new el(cee1.b + 0.5D, 75.0D, cee1.d + 0.5D);
/* 196 */       a.debug("Failed to find suitable block, settling on {}", this.g);
/*     */       
/* 198 */       (new bqm()).a(this.c_, (bmy)this.c_.H().f(), new Random(this.g.g()), this.g, bqp.e);
/*     */     } else {
/* 200 */       a.debug("Found block at {}", this.g);
/*     */     } 
/*     */     
/* 203 */     this.g = a(this.c_, this.g, 16, true);
/* 204 */     a.debug("Creating portal at {}", this.g);
/*     */     
/* 206 */     this.g = this.g.b(10);
/* 207 */     c(this.g);
/* 208 */     g();
/*     */   }
/*     */   
/*     */   private static el a(axk ☃, el el1, int i, boolean bool) {
/* 212 */     el el2 = null;
/*     */     
/* 214 */     for (int j = -i; j <= i; j++) {
/* 215 */       for (int k = -i; k <= i; k++) {
/* 216 */         if (j != 0 || k != 0 || bool)
/*     */         {
/*     */ 
/*     */           
/* 220 */           for (int m = 255; m > ((el2 == null) ? 0 : el2.p()); m--) {
/* 221 */             el el3 = new el(el1.o() + j, m, el1.q() + k);
/* 222 */             blc blc = ☃.a_(el3);
/* 223 */             if (blc.k() && (bool || blc.c() != bct.z)) {
/* 224 */               el2 = el3;
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/* 231 */     return (el2 == null) ? el1 : el2;
/*     */   }
/*     */   
/*     */   private static bnj a(axy ☃, cee cee1) {
/* 235 */     return ☃.c(xq.c(cee1.b / 16.0D), xq.c(cee1.d / 16.0D));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static el a(bnj ☃) {
/* 240 */     el el1 = new el(☃.b * 16, 30, ☃.c * 16);
/* 241 */     int i = ☃.b() + 16 - 1;
/* 242 */     el el2 = new el(☃.b * 16 + 16 - 1, i, ☃.c * 16 + 16 - 1);
/* 243 */     el el3 = null;
/* 244 */     double d = 0.0D;
/*     */     
/* 246 */     for (el el4 : el.a(el1, el2)) {
/* 247 */       blc blc = ☃.a_(el4);
/*     */       
/* 249 */       if (blc.c() == bct.eg && !☃.a_(el4.b(1)).k() && !☃.a_(el4.b(2)).k()) {
/* 250 */         double d1 = el4.g(0.0D, 0.0D, 0.0D);
/* 251 */         if (el3 == null || d1 < d) {
/* 252 */           el3 = el4;
/* 253 */           d = d1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 258 */     return el3;
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(el ☃) {
/* 263 */     bqo.ax.a(this.c_, (bmy)this.c_.H().f(), new Random(), ☃, new bqk(false));
/* 264 */     bji bji = this.c_.f(☃);
/* 265 */     if (bji instanceof bkg) {
/* 266 */       bkg bkg1 = (bkg)bji;
/* 267 */       bkg1.g = new el(v());
/* 268 */       bkg1.g();
/*     */     } else {
/* 270 */       a.warn("Couldn't save exit portal at {}", ☃);
/*     */     } 
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
/*     */   public void b(el ☃) {
/* 288 */     this.h = true;
/* 289 */     this.g = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bkg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */