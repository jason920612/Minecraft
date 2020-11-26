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
/*     */ public abstract class ary
/*     */ {
/*  13 */   public static final ary[] a = new ary[12];
/*  14 */   public static final ary b = (new ary(0, "buildingBlocks")
/*     */     {
/*     */ 
/*     */ 
/*     */     
/*  19 */     }).b("building_blocks");
/*  20 */   public static final ary c = new ary(1, "decorations")
/*     */     {
/*     */     
/*     */     };
/*     */ 
/*     */   
/*  26 */   public static final ary d = new ary(2, "redstone")
/*     */     {
/*     */     
/*     */     };
/*     */ 
/*     */   
/*  32 */   public static final ary e = new ary(3, "transportation")
/*     */     {
/*     */     
/*     */     };
/*     */ 
/*     */   
/*  38 */   public static final ary f = new ary(6, "misc")
/*     */     {
/*     */     
/*     */     };
/*     */ 
/*     */   
/*  44 */   public static final ary g = (new ary(5, "search")
/*     */     {
/*     */ 
/*     */ 
/*     */     
/*  49 */     }).a("item_search.png");
/*     */   
/*  51 */   public static final ary h = new ary(7, "food")
/*     */     {
/*     */     
/*     */     };
/*     */ 
/*     */   
/*  57 */   public static final ary i = (new ary(8, "tools")
/*     */     {
/*     */ 
/*     */ 
/*     */     
/*  62 */     }).a(new awf[] { awf.a, awf.h, awf.i, awf.k });
/*  63 */   public static final ary j = (new ary(9, "combat")
/*     */     {
/*     */ 
/*     */ 
/*     */     
/*  68 */     }).a(new awf[] { awf.a, awf.b, awf.c, awf.f, awf.d, awf.e, awf.l, awf.g, awf.m, awf.k, 
/*  69 */         awf.j }); public static final ary k = new ary(10, "brewing")
/*     */     {
/*     */     
/*     */     };
/*     */ 
/*     */   
/*  75 */   public static final ary l = f;
/*  76 */   public static final ary m = new ary(4, "hotbar")
/*     */     {
/*     */     
/*     */     };
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
/*  92 */   public static final ary n = (new ary(11, "inventory")
/*     */     {
/*     */ 
/*     */ 
/*     */     
/*  97 */     }).a("inventory.png").k().i();
/*     */   
/*     */   private final int o;
/*     */   private final String p;
/*     */   private String q;
/* 102 */   private String r = "items.png";
/*     */   private boolean s = true;
/*     */   private boolean t = true;
/* 105 */   private awf[] u = new awf[0];
/*     */   private ate v;
/*     */   
/*     */   public ary(int ☃, String str) {
/* 109 */     this.o = ☃;
/* 110 */     this.p = str;
/*     */     
/* 112 */     this.v = ate.a;
/*     */     
/* 114 */     a[☃] = this;
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
/*     */   public String c() {
/* 126 */     return (this.q == null) ? this.p : this.q;
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
/*     */   public ary a(String ☃) {
/* 147 */     this.r = ☃;
/* 148 */     return this;
/*     */   }
/*     */   
/*     */   public ary b(String ☃) {
/* 152 */     this.q = ☃;
/* 153 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ary i() {
/* 161 */     this.t = false;
/* 162 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ary k() {
/* 170 */     this.s = false;
/* 171 */     return this;
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
/*     */   public awf[] o() {
/* 187 */     return this.u;
/*     */   }
/*     */   
/*     */   public ary a(awf... ☃) {
/* 191 */     this.u = ☃;
/* 192 */     return this;
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable awf ☃) {
/* 196 */     if (☃ != null) {
/* 197 */       for (awf awf1 : this.u) {
/* 198 */         if (awf1 == ☃) {
/* 199 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 204 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */