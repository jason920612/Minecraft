/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Arrays;
/*     */ import java.util.EnumMap;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class akf
/*     */   extends ajq
/*     */ {
/*  57 */   private static final or<Byte> bC = ou.a((Class)akf.class, ot.a);
/*     */   
/*  59 */   private final aqc bD = new aqc(new apv(this)
/*     */       {
/*     */         public boolean a(aog ☃) {
/*  62 */           return false;
/*     */         }
/*     */       },  2, 1); private static final Map<asc, axx> bE; private static final Map<asc, float[]> bG;
/*     */   static {
/*  66 */     bE = k.<Map<asc, axx>>a(Maps.newEnumMap(asc.class), ☃ -> {
/*     */           ☃.put(asc.a, bct.aY);
/*     */           
/*     */           ☃.put(asc.b, bct.aZ);
/*     */           ☃.put(asc.c, bct.ba);
/*     */           ☃.put(asc.d, bct.bb);
/*     */           ☃.put(asc.e, bct.bc);
/*     */           ☃.put(asc.f, bct.bd);
/*     */           ☃.put(asc.g, bct.be);
/*     */           ☃.put(asc.h, bct.bf);
/*     */           ☃.put(asc.i, bct.bg);
/*     */           ☃.put(asc.j, bct.bh);
/*     */           ☃.put(asc.k, bct.bi);
/*     */           ☃.put(asc.l, bct.bj);
/*     */           ☃.put(asc.m, bct.bk);
/*     */           ☃.put(asc.n, bct.bl);
/*     */           ☃.put(asc.o, bct.bm);
/*     */           ☃.put(asc.p, bct.bn);
/*     */         });
/*  85 */     bG = Maps.newEnumMap((Map)Arrays.<asc>stream(asc.values()).collect(Collectors.toMap(☃ -> ☃, akf::c)));
/*     */   } private int bH; private agk bI;
/*     */   private static float[] c(asc ☃) {
/*  88 */     if (☃ == asc.a) {
/*  89 */       return new float[] { 0.9019608F, 0.9019608F, 0.9019608F };
/*     */     }
/*  91 */     float[] arrayOfFloat = ☃.d();
/*     */ 
/*     */     
/*  94 */     float f = 0.75F;
/*     */     
/*  96 */     return new float[] { arrayOfFloat[0] * 0.75F, arrayOfFloat[1] * 0.75F, arrayOfFloat[2] * 0.75F };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public akf(axy ☃) {
/* 107 */     super(aev.ag, ☃);
/* 108 */     a(0.9F, 1.3F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void n() {
/* 113 */     this.bI = new agk(this);
/* 114 */     this.by.a(0, new agm(this));
/* 115 */     this.by.a(1, new aho(this, 1.25D));
/* 116 */     this.by.a(2, new agi(this, 1.0D));
/* 117 */     this.by.a(3, new aic(this, 1.1D, avh.a(new axx[] { atf.S }, ), false));
/* 118 */     this.by.a(4, new ags(this, 1.1D));
/* 119 */     this.by.a(5, this.bI);
/* 120 */     this.by.a(6, new aih(this, 1.0D));
/* 121 */     this.by.a(7, new ahb(this, (Class)aog.class, 6.0F));
/* 122 */     this.by.a(8, new ahq(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void J() {
/* 127 */     this.bH = this.bI.g();
/* 128 */     super.J();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 133 */     if (this.m.B) {
/* 134 */       this.bH = Math.max(0, this.bH - 1);
/*     */     }
/* 136 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bZ() {
/* 141 */     super.bZ();
/*     */     
/* 143 */     a(ank.a).a(8.0D);
/* 144 */     a(ank.d).a(0.23000000417232513D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/* 149 */     super.x_();
/*     */ 
/*     */     
/* 152 */     this.ab.a(bC, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected pc G() {
/* 158 */     if (dz()) {
/* 159 */       return ccl.W;
/*     */     }
/* 161 */     switch (null.a[dy().ordinal()])
/*     */     
/*     */     { default:
/* 164 */         return ccl.X;
/*     */       case 2:
/* 166 */         return ccl.Y;
/*     */       case 3:
/* 168 */         return ccl.Z;
/*     */       case 4:
/* 170 */         return ccl.aa;
/*     */       case 5:
/* 172 */         return ccl.ab;
/*     */       case 6:
/* 174 */         return ccl.ac;
/*     */       case 7:
/* 176 */         return ccl.ad;
/*     */       case 8:
/* 178 */         return ccl.ae;
/*     */       case 9:
/* 180 */         return ccl.af;
/*     */       case 10:
/* 182 */         return ccl.ag;
/*     */       case 11:
/* 184 */         return ccl.ah;
/*     */       case 12:
/* 186 */         return ccl.ai;
/*     */       case 13:
/* 188 */         return ccl.aj;
/*     */       case 14:
/* 190 */         return ccl.ak;
/*     */       case 15:
/* 192 */         return ccl.al;
/*     */       case 16:
/* 194 */         break; }  return ccl.am;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃, adk adk1) {
/* 233 */     ate ate = ☃.b(adk1);
/* 234 */     if (ate.b() == atf.bR && !dz() && !y_()) {
/* 235 */       if (!this.m.B) {
/* 236 */         s(true);
/* 237 */         int i = 1 + this.T.nextInt(3);
/* 238 */         for (int j = 0; j < i; j++) {
/* 239 */           amm amm = a(bE.get(dy()), 1);
/* 240 */           if (amm != null) {
/* 241 */             amm.u += (this.T.nextFloat() * 0.05F);
/* 242 */             amm.t += ((this.T.nextFloat() - this.T.nextFloat()) * 0.1F);
/* 243 */             amm.v += ((this.T.nextFloat() - this.T.nextFloat()) * 0.1F);
/*     */           } 
/*     */         } 
/*     */       } 
/* 247 */       ate.a(1, ☃);
/* 248 */       a(wj.hY, 1.0F, 1.0F);
/*     */     } 
/*     */     
/* 251 */     return super.a(☃, adk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 256 */     super.b(☃);
/* 257 */     ☃.a("Sheared", dz());
/* 258 */     ☃.a("Color", (byte)dy().a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 263 */     super.a(☃);
/* 264 */     s(☃.q("Sheared"));
/* 265 */     b(asc.a(☃.f("Color")));
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi D() {
/* 270 */     return wj.hV;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi d(aea ☃) {
/* 275 */     return wj.hX;
/*     */   }
/*     */ 
/*     */   
/*     */   protected wi cs() {
/* 280 */     return wj.hW;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(el ☃, blc blc1) {
/* 285 */     a(wj.hZ, 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   public asc dy() {
/* 289 */     return asc.a(((Byte)this.ab.<Byte>a(bC)).byteValue() & 0xF);
/*     */   }
/*     */   
/*     */   public void b(asc ☃) {
/* 293 */     byte b = ((Byte)this.ab.<Byte>a(bC)).byteValue();
/* 294 */     this.ab.b(bC, Byte.valueOf((byte)(b & 0xF0 | ☃.a() & 0xF)));
/*     */   }
/*     */   
/*     */   public boolean dz() {
/* 298 */     return ((((Byte)this.ab.<Byte>a(bC)).byteValue() & 0x10) != 0);
/*     */   }
/*     */   
/*     */   public void s(boolean ☃) {
/* 302 */     byte b = ((Byte)this.ab.<Byte>a(bC)).byteValue();
/* 303 */     if (☃) {
/* 304 */       this.ab.b(bC, Byte.valueOf((byte)(b | 0x10)));
/*     */     } else {
/* 306 */       this.ab.b(bC, Byte.valueOf((byte)(b & 0xFFFFFFEF)));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static asc a(Random ☃) {
/* 311 */     int i = ☃.nextInt(100);
/* 312 */     if (i < 5) {
/* 313 */       return asc.p;
/*     */     }
/* 315 */     if (i < 10) {
/* 316 */       return asc.h;
/*     */     }
/* 318 */     if (i < 15) {
/* 319 */       return asc.i;
/*     */     }
/* 321 */     if (i < 18) {
/* 322 */       return asc.m;
/*     */     }
/* 324 */     if (☃.nextInt(500) == 0) {
/* 325 */       return asc.g;
/*     */     }
/* 327 */     return asc.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public akf b(aeo ☃) {
/* 332 */     akf akf1 = (akf)☃;
/* 333 */     akf akf2 = new akf(this.m);
/*     */     
/* 335 */     akf2.b(a(this, akf1));
/*     */     
/* 337 */     return akf2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void x() {
/* 342 */     s(false);
/* 343 */     if (y_())
/*     */     {
/* 345 */       a(60);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afj a(adj ☃, @Nullable afj afj1, @Nullable gy gy1) {
/* 352 */     afj1 = super.a(☃, afj1, gy1);
/*     */     
/* 354 */     b(a(this.m.s));
/* 355 */     return afj1;
/*     */   }
/*     */   
/*     */   private asc a(ajq ☃, ajq ajq1) {
/* 359 */     asc asc3, asc1 = ((akf)☃).dy();
/* 360 */     asc asc2 = ((akf)ajq1).dy();
/*     */     
/* 362 */     this.bD.a(0, new ate(asd.a(asc1)));
/* 363 */     this.bD.a(1, new ate(asd.a(asc2)));
/*     */     
/* 365 */     ate ate = ☃.m.E().a(this.bD, ((akf)☃).m);
/*     */ 
/*     */     
/* 368 */     ata ata = ate.b();
/* 369 */     if (ata instanceof asd) {
/* 370 */       asc3 = ((asd)ata).d();
/*     */     } else {
/* 372 */       asc3 = this.m.s.nextBoolean() ? asc1 : asc2;
/*     */     } 
/* 374 */     return asc3;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bF() {
/* 379 */     return 0.95F * this.I;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\akf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */