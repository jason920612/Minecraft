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
/*     */ public class akq
/*     */   extends ako
/*     */ {
/*  33 */   private static final UUID bM = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
/*     */   
/*  35 */   private static final or<Integer> bN = ou.a((Class)akq.class, ot.b);
/*  36 */   private static final or<Integer> bO = ou.a((Class)akq.class, ot.b);
/*     */ 
/*     */   
/*  39 */   private static final String[] bP = new String[] { "textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   private static final String[] bQ = new String[] { "hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb" };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  53 */   private static final String[] bR = new String[] { null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   private static final String[] bS = new String[] { "", "wo_", "wmo", "wdo", "bdo" };
/*     */ 
/*     */   
/*     */   private String bT;
/*     */   
/*  65 */   private final String[] bU = new String[3];
/*     */   
/*     */   public akq(axy ☃) {
/*  68 */     super(aev.D, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  73 */     super.x_();
/*     */     
/*  75 */     this.ab.a(bN, Integer.valueOf(0));
/*  76 */     this.ab.a(bO, Integer.valueOf(akr.a.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  81 */     super.b(☃);
/*     */     
/*  83 */     ☃.b("Variant", dy());
/*     */     
/*  85 */     if (!this.bH.a(1).a()) {
/*  86 */       ☃.a("ArmorItem", this.bH.a(1).b(new gy()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/*  92 */     super.a(☃);
/*     */     
/*  94 */     s(☃.h("Variant"));
/*     */     
/*  96 */     if (☃.c("ArmorItem", 10)) {
/*  97 */       ate ate = ate.a(☃.p("ArmorItem"));
/*  98 */       if (!ate.a() && akr.b(ate.b())) {
/*  99 */         this.bH.a(1, ate);
/*     */       }
/*     */     } 
/*     */     
/* 103 */     dS();
/*     */   }
/*     */   
/*     */   public void s(int ☃) {
/* 107 */     this.ab.b(bN, Integer.valueOf(☃));
/* 108 */     eg();
/*     */   }
/*     */   
/*     */   public int dy() {
/* 112 */     return ((Integer)this.ab.<Integer>a(bN)).intValue();
/*     */   }
/*     */   
/*     */   private void eg() {
/* 116 */     this.bT = null;
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
/*     */   protected void dS() {
/* 149 */     super.dS();
/*     */     
/* 151 */     h(this.bH.a(1));
/*     */   }
/*     */   
/*     */   public void h(ate ☃) {
/* 155 */     akr akr = akr.a(☃);
/* 156 */     this.ab.b(bO, Integer.valueOf(akr.a()));
/* 157 */     eg();
/*     */     
/* 159 */     if (!this.m.B) {
/* 160 */       a(ank.h).b(bM);
/* 161 */       int i = akr.c();
/* 162 */       if (i != 0) {
/* 163 */         a(ank.h).b((new afo(bM, "Horse armor bonus", i, 0)).a(false));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public akr dH() {
/* 169 */     return akr.a(((Integer)this.ab.<Integer>a(bO)).intValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ade ☃) {
/* 174 */     akr akr1 = dH();
/*     */     
/* 176 */     super.a(☃);
/*     */     
/* 178 */     akr akr2 = dH();
/* 179 */     if (this.U > 20 && akr1 != akr2 && akr2 != akr.a) {
/* 180 */       a(wj.dN, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bhr ☃) {
/* 186 */     super.a(☃);
/* 187 */     if (this.T.nextInt(10) == 0) {
/* 188 */       a(wj.dO, ☃.a() * 0.6F, ☃.b());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 194 */     super.bZ();
/*     */     
/* 196 */     a(ank.a).a(ec());
/* 197 */     a(ank.d).a(ee());
/* 198 */     a(bC).a(ed());
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/* 203 */     super.R_();
/*     */ 
/*     */     
/* 206 */     if (this.m.B && this.ab.a()) {
/* 207 */       this.ab.e();
/* 208 */       eg();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 214 */     super.D();
/* 215 */     return wj.dL;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 220 */     super.cs();
/* 221 */     return wj.dP;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 226 */     super.d(☃);
/* 227 */     return wj.dS;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi dB() {
/* 232 */     super.dB();
/* 233 */     return wj.dM;
/*     */   }
/*     */ 
/*     */   
/*     */   protected pc G() {
/* 238 */     return ccl.N;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 243 */     ate ate = ☃.b(adk1);
/* 244 */     boolean bool = !ate.a();
/* 245 */     if (bool && ate.b() instanceof auc) {
/* 246 */       return super.a(☃, adk1);
/*     */     }
/*     */     
/* 249 */     if (!y_()) {
/* 250 */       if (dJ() && ☃.aZ()) {
/* 251 */         c(☃);
/* 252 */         return true;
/*     */       } 
/*     */       
/* 255 */       if (aX()) {
/* 256 */         return super.a(☃, adk1);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 261 */     if (bool) {
/* 262 */       if (b(☃, ate)) {
/* 263 */         if (!☃.bV.d) {
/* 264 */           ate.g(1);
/*     */         }
/* 266 */         return true;
/*     */       } 
/*     */       
/* 269 */       if (ate.a(☃, this, adk1)) {
/* 270 */         return true;
/*     */       }
/*     */       
/* 273 */       if (!dJ()) {
/* 274 */         dZ();
/* 275 */         return true;
/*     */       } 
/*     */       
/* 278 */       boolean bool1 = (akr.a(ate) != akr.a);
/* 279 */       boolean bool2 = (!y_() && !dV() && ate.b() == atf.aA);
/* 280 */       if (bool1 || bool2) {
/* 281 */         c(☃);
/* 282 */         return true;
/*     */       } 
/*     */     } 
/* 285 */     if (y_()) {
/* 286 */       return super.a(☃, adk1);
/*     */     }
/*     */     
/* 289 */     g(☃);
/*     */     
/* 291 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ajq ☃) {
/* 296 */     if (☃ == this) {
/* 297 */       return false;
/*     */     }
/*     */     
/* 300 */     if (☃ instanceof akp || ☃ instanceof akq) {
/* 301 */       return (eb() && ((ako)☃).eb());
/*     */     }
/*     */     
/* 304 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public aeo a(aeo ☃) {
/*     */     ako ako1;
/* 310 */     if (☃ instanceof akp) {
/* 311 */       ako1 = new akt(this.m);
/*     */     } else {
/* 313 */       int i; akq akq1 = (akq)☃;
/*     */       
/* 315 */       ako1 = new akq(this.m);
/*     */       
/* 317 */       int j = this.T.nextInt(9);
/* 318 */       if (j < 4) {
/* 319 */         i = dy() & 0xFF;
/* 320 */       } else if (j < 8) {
/* 321 */         i = akq1.dy() & 0xFF;
/*     */       } else {
/* 323 */         i = this.T.nextInt(7);
/*     */       } 
/*     */       
/* 326 */       int k = this.T.nextInt(5);
/* 327 */       if (k < 2) {
/* 328 */         i |= dy() & 0xFF00;
/* 329 */       } else if (k < 4) {
/* 330 */         i |= akq1.dy() & 0xFF00;
/*     */       } else {
/* 332 */         i |= this.T.nextInt(5) << 8 & 0xFF00;
/*     */       } 
/* 334 */       ((akq)ako1).s(i);
/*     */     } 
/*     */     
/* 337 */     a(☃, ako1);
/*     */     
/* 339 */     return ako1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ef() {
/* 344 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean g(ate ☃) {
/* 349 */     return akr.b(☃.b());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/*     */     int i;
/* 355 */     afj1 = super.a(☃, afj1, gy1);
/*     */ 
/*     */     
/* 358 */     if (afj1 instanceof a) {
/* 359 */       i = ((a)afj1).a;
/*     */     } else {
/* 361 */       i = this.T.nextInt(7);
/* 362 */       afj1 = new a(i);
/*     */     } 
/* 364 */     s(i | this.T.nextInt(5) << 8);
/*     */     
/* 366 */     return afj1;
/*     */   }
/*     */   
/*     */   public static class a implements afj {
/*     */     public int a;
/*     */     
/*     */     public a(int ☃) {
/* 373 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */