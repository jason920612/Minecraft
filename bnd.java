/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.function.BiConsumer;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum bnd
/*     */   implements acx<axm, bnd>
/*     */ {
/*     */   private static final Map<String, bnd> k;
/*     */   private final String l;
/*     */   @Nullable
/*     */   private final tq m;
/*     */   private final int n;
/*     */   private final a o;
/*     */   private final boolean p;
/*     */   
/*  23 */   a("empty", null, -1, false, a.a),
/*  24 */   b("base", new to(), 0, false, a.a),
/*  25 */   c("carved", new tp(), 0, false, a.a),
/*  26 */   d("liquid_carved", new tv(), 1, false, a.a),
/*  27 */   e("decorated", new tr(), 1, true, a.a)
/*     */   {
/*     */     public void a(axm ☃, BiConsumer<axm, bnd> biConsumer) {
/*  30 */       int i = ☃.a;
/*  31 */       int j = ☃.b;
/*  32 */       bnd bnd1 = e();
/*     */       
/*  34 */       int k = 8; int m;
/*  35 */       for (m = i - 8; m <= i + 8; m++) {
/*  36 */         if (m < i - 1 || m > i + 1)
/*     */         {
/*     */ 
/*     */           
/*  40 */           for (int n = j - 8; n <= j + 8; n++) {
/*  41 */             if (n < j - 1 || n > j + 1) {
/*     */ 
/*     */ 
/*     */               
/*  45 */               axm axm1 = new axm(m, n);
/*  46 */               biConsumer.accept(axm1, a);
/*     */             } 
/*     */           }  } 
/*     */       } 
/*  50 */       for (m = i - 1; m <= i + 1; m++) {
/*  51 */         for (int n = j - 1; n <= j + 1; n++) {
/*  52 */           axm axm1 = new axm(m, n);
/*  53 */           biConsumer.accept(axm1, bnd1);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   },
/*  58 */   f("lighted", new tu(), 1, true, a.a),
/*  59 */   g("mobs_spawned", new tw(), 0, true, a.a),
/*  60 */   h("finalized", new tt(), 0, true, a.a),
/*  61 */   i("fullchunk", new ts(), 0, true, a.b),
/*  62 */   j("postprocessed", new ts(), 0, true, a.b);
/*     */   
/*     */   public enum a {
/*  65 */     a,
/*  66 */     b; }
/*     */   
/*     */   static {
/*  69 */     k = k.<Map<String, bnd>>a(Maps.newHashMap(), ☃ -> {
/*     */           for (bnd bnd1 : values()) {
/*     */             ☃.put(bnd1.b(), bnd1);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   bnd(String ☃, @Nullable tq tq1, int i, boolean bool, a a1) {
/*  83 */     this.l = ☃;
/*  84 */     this.m = tq1;
/*  85 */     this.n = i;
/*  86 */     this.o = a1;
/*  87 */     this.p = bool;
/*     */   }
/*     */   
/*     */   public String b() {
/*  91 */     return this.l;
/*     */   }
/*     */   
/*     */   public bnr a(axy ☃, bmy<?> bmy1, Map<axm, bnr> map, int i, int j) {
/*  95 */     return this.m.a(this, ☃, bmy1, map, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axm ☃, BiConsumer<axm, bnd> biConsumer) {
/* 100 */     int i = ☃.a;
/* 101 */     int j = ☃.b;
/* 102 */     bnd bnd1 = e();
/* 103 */     for (int k = i - this.n; k <= i + this.n; k++) {
/* 104 */       for (int m = j - this.n; m <= j + this.n; m++) {
/* 105 */         biConsumer.accept(new axm(k, m), bnd1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int c() {
/* 111 */     return this.n;
/*     */   }
/*     */   
/*     */   public a d() {
/* 115 */     return this.o;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static bnd a(String ☃) {
/* 120 */     return k.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bnd e() {
/* 126 */     if (ordinal() == 0) {
/* 127 */       return null;
/*     */     }
/* 129 */     return values()[ordinal() - 1];
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 133 */     return this.p;
/*     */   }
/*     */   
/*     */   public boolean a(bnd ☃) {
/* 137 */     return (ordinal() >= ☃.ordinal());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bnd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */