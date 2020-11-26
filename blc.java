/*     */ import it.unimi.dsi.fastutil.objects.Object2ByteMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ByteOpenHashMap;
/*     */ import java.util.Random;
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
/*     */ public interface blc
/*     */   extends blf<blc>
/*     */ {
/*     */   public static final ThreadLocal<Object2ByteMap<blc>> a;
/*     */   public static final ThreadLocal<Object2ByteMap<blc>> b;
/*     */   public static final ThreadLocal<Object2ByteMap<blc>> c;
/*     */   
/*     */   static {
/*  34 */     a = ThreadLocal.withInitial(() -> {
/*     */           Object2ByteOpenHashMap<blc> ☃ = new Object2ByteOpenHashMap();
/*     */           ☃.defaultReturnValue(127);
/*     */           return (Object2ByteMap)☃;
/*     */         });
/*  39 */     b = ThreadLocal.withInitial(() -> {
/*     */           Object2ByteOpenHashMap<blc> ☃ = new Object2ByteOpenHashMap();
/*     */           ☃.defaultReturnValue(127);
/*     */           return (Object2ByteMap)☃;
/*     */         });
/*  44 */     c = ThreadLocal.withInitial(() -> {
/*     */           Object2ByteOpenHashMap<blc> ☃ = new Object2ByteOpenHashMap();
/*     */           ☃.defaultReturnValue(127);
/*     */           return (Object2ByteMap)☃;
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   default bza d() {
/*  53 */     return c().n(this);
/*     */   }
/*     */   
/*     */   default boolean a(aer ☃) {
/*  57 */     return c().a(this, ☃);
/*     */   }
/*     */   
/*     */   default boolean a(axk ☃, el el1) {
/*  61 */     bcs bcs = c();
/*  62 */     Object2ByteMap<blc> object2ByteMap = bcs.s() ? null : a.get();
/*     */     
/*  64 */     if (object2ByteMap != null) {
/*  65 */       byte b = object2ByteMap.getByte(this);
/*  66 */       if (b != object2ByteMap.defaultReturnValue()) {
/*  67 */         return (b != 0);
/*     */       }
/*     */     } 
/*     */     
/*  71 */     boolean bool = bcs.a_(this, ☃, el1);
/*     */     
/*  73 */     if (object2ByteMap != null) {
/*  74 */       object2ByteMap.put(this, (byte)(bool ? 1 : 0));
/*     */     }
/*     */     
/*  77 */     return bool;
/*     */   }
/*     */   
/*     */   default int b(axk ☃, el el1) {
/*  81 */     bcs bcs = c();
/*  82 */     Object2ByteMap<blc> object2ByteMap = bcs.s() ? null : b.get();
/*     */     
/*  84 */     if (object2ByteMap != null) {
/*  85 */       byte b = object2ByteMap.getByte(this);
/*  86 */       if (b != object2ByteMap.defaultReturnValue()) {
/*  87 */         return b;
/*     */       }
/*     */     } 
/*     */     
/*  91 */     int i = bcs.j(this, ☃, el1);
/*     */     
/*  93 */     if (object2ByteMap != null) {
/*  94 */       object2ByteMap.put(this, (byte)Math.min(i, ☃.K()));
/*     */     }
/*     */     
/*  97 */     return i;
/*     */   }
/*     */   
/*     */   default int e() {
/* 101 */     return c().m(this);
/*     */   }
/*     */   
/*     */   default boolean f() {
/* 105 */     return c().e(this);
/*     */   }
/*     */   
/*     */   default boolean c(axk ☃, el el1) {
/* 109 */     return c().k(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default bzb d(axk ☃, el el1) {
/* 113 */     return c().c(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default blc a(bhb ☃) {
/* 117 */     return c().a(this, ☃);
/*     */   }
/*     */   
/*     */   default blc a(bfz ☃) {
/* 121 */     return c().a(this, ☃);
/*     */   }
/*     */   
/*     */   default boolean g() {
/* 125 */     return c().a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default bgy i() {
/* 133 */     return c().c(this);
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
/*     */   default boolean k() {
/* 145 */     return c().o(this);
/*     */   }
/*     */   
/*     */   default boolean l() {
/* 149 */     return c().p(this);
/*     */   }
/*     */   
/*     */   default boolean m() {
/* 153 */     return c().i(this);
/*     */   }
/*     */   
/*     */   default int a(axk ☃, el el1, eq eq1) {
/* 157 */     return c().a(this, ☃, el1, eq1);
/*     */   }
/*     */   
/*     */   default boolean n() {
/* 161 */     return c().u(this);
/*     */   }
/*     */   
/*     */   default int a(axy ☃, el el1) {
/* 165 */     return c().a(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default float e(axk ☃, el el1) {
/* 169 */     return c().d(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default float a(aog ☃, axk axk1, el el1) {
/* 173 */     return c().a(this, ☃, axk1, el1);
/*     */   }
/*     */   
/*     */   default int b(axk ☃, el el1, eq eq1) {
/* 177 */     return c().b(this, ☃, el1, eq1);
/*     */   }
/*     */   
/*     */   default bzc o() {
/* 181 */     return c().j(this);
/*     */   }
/*     */   
/*     */   default boolean f(axk ☃, el el1) {
/* 185 */     bcs bcs = c();
/* 186 */     Object2ByteMap<blc> object2ByteMap = bcs.s() ? null : c.get();
/*     */     
/* 188 */     if (object2ByteMap != null) {
/* 189 */       byte b = object2ByteMap.getByte(this);
/* 190 */       if (b != object2ByteMap.defaultReturnValue()) {
/* 191 */         return (b != 0);
/*     */       }
/*     */     } 
/*     */     
/* 195 */     boolean bool = bcs.i(this, ☃, el1);
/*     */     
/* 197 */     if (object2ByteMap != null) {
/* 198 */       object2ByteMap.put(this, (byte)(bool ? 1 : 0));
/*     */     }
/*     */     
/* 201 */     return bool;
/*     */   }
/*     */   
/*     */   default boolean p() {
/* 205 */     return c().f(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default cew g(axk ☃, el el1) {
/* 213 */     return c().a(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default cew h(axk ☃, el el1) {
/* 217 */     return c().f(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default cew i(axk ☃, el el1) {
/* 221 */     return c().g(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default cew j(axk ☃, el el1) {
/* 225 */     return c().h(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default boolean q() {
/* 229 */     return c().r(this);
/*     */   }
/*     */   
/*     */   default cee k(axk ☃, el el1) {
/* 233 */     return c().l(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default boolean a(axy ☃, el el1, int i, int j) {
/* 237 */     return c().a(this, ☃, el1, i, j);
/*     */   }
/*     */   
/*     */   default void a(axy ☃, el el1, bcs bcs1, el el2) {
/* 241 */     c().a(this, ☃, el1, bcs1, el2);
/*     */   }
/*     */   
/*     */   default void a(axz ☃, el el1, int i) {
/* 245 */     c().a(this, ☃, el1, i);
/*     */   }
/*     */   
/*     */   default void b(axz ☃, el el1, int i) {
/* 249 */     c().b(this, ☃, el1, i);
/*     */   }
/*     */   
/*     */   default void a(axy ☃, el el1, blc blc1) {
/* 253 */     c().a(this, ☃, el1, blc1);
/*     */   }
/*     */   
/*     */   default void a(axy ☃, el el1, blc blc1, boolean bool) {
/* 257 */     c().a(this, ☃, el1, blc1, bool);
/*     */   }
/*     */   
/*     */   default void a(axy ☃, el el1, Random random) {
/* 261 */     c().a(this, ☃, el1, random);
/*     */   }
/*     */   
/*     */   default void b(axy ☃, el el1, Random random) {
/* 265 */     c().b(this, ☃, el1, random);
/*     */   }
/*     */   
/*     */   default void a(axy ☃, el el1, aer aer1) {
/* 269 */     c().a(this, ☃, el1, aer1);
/*     */   }
/*     */   
/*     */   default void a(axy ☃, el el1, int i) {
/* 273 */     a(☃, el1, 1.0F, i);
/*     */   }
/*     */   
/*     */   default void a(axy ☃, el el1, float f, int i) {
/* 277 */     c().a(this, ☃, el1, f, i);
/*     */   }
/*     */   
/*     */   default boolean a(axy ☃, el el1, aog aog1, adk adk1, eq eq1, float f1, float f2, float f3) {
/* 281 */     return c().a(this, ☃, el1, aog1, adk1, eq1, f1, f2, f3);
/*     */   }
/*     */   
/*     */   default void a(axy ☃, el el1, aog aog1) {
/* 285 */     c().a(this, ☃, el1, aog1);
/*     */   }
/*     */   
/*     */   default boolean r() {
/* 289 */     return c().q(this);
/*     */   }
/*     */   
/*     */   default blb c(axk ☃, el el1, eq eq1) {
/* 293 */     return c().a(☃, this, el1, eq1);
/*     */   }
/*     */   
/*     */   default blc a(eq ☃, blc blc1, axz axz1, el el1, el el2) {
/* 297 */     return c().a(this, ☃, blc1, axz1, el1, el2);
/*     */   }
/*     */   
/*     */   default boolean a(axk ☃, el el1, cbf cbf1) {
/* 301 */     return c().a(this, ☃, el1, cbf1);
/*     */   }
/*     */   
/*     */   default boolean a(ark ☃) {
/* 305 */     return c().a(this, ☃);
/*     */   }
/*     */   
/*     */   default boolean a(ayc ☃, el el1) {
/* 309 */     return c().a(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default boolean l(axk ☃, el el1) {
/* 313 */     return c().e(this, ☃, el1);
/*     */   }
/*     */   
/*     */   default boolean a(wz<bcs> ☃) {
/* 317 */     return c().a(☃);
/*     */   }
/*     */   
/*     */   default byw s() {
/* 321 */     return c().h(this);
/*     */   }
/*     */   
/*     */   default boolean t() {
/* 325 */     return c().s(this);
/*     */   }
/*     */   
/*     */   bcs c();
/*     */ }


/* Location:              F:\dw\server.jar!\blc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */