/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ public class bor
/*     */ {
/*     */   public enum b
/*     */   {
/*  26 */     a,
/*  27 */     b;
/*     */   }
/*     */   
/*     */   public enum a {
/*  31 */     a("WORLD_SURFACE_WG", bor.b.a, (String)new blm[] { bll.a(bct.a) }),
/*  32 */     b("OCEAN_FLOOR_WG", bor.b.a, (String)new blm[] { bll.a(bct.a), bls.a() }),
/*  33 */     c("LIGHT_BLOCKING", bor.b.b, (String)new blm[] { bll.a(bct.a), blr.a() }),
/*  34 */     d("MOTION_BLOCKING", bor.b.b, (String)new blm[] { bll.a(bct.a), blt.a() }),
/*  35 */     e("MOTION_BLOCKING_NO_LEAVES", bor.b.b, (String)new blm[] { bll.a(bct.a), blv.a(wv.A), blt.a() }),
/*  36 */     f("OCEAN_FLOOR", bor.b.b, (String)new blm[] { bll.a(bct.a), blu.a() }),
/*  37 */     g("WORLD_SURFACE", bor.b.b, (String)new blm[] { bll.a(bct.a) });
/*     */     private final blm<blc>[] h;
/*     */     private final String i;
/*     */     private final bor.b j;
/*     */     private static final Map<String, a> k;
/*     */     
/*     */     static {
/*  44 */       k = k.<Map<String, a>>a(Maps.newHashMap(), ☃ -> {
/*     */             for (a a1 : values())
/*     */               ☃.put(a1.i, a1); 
/*     */           });
/*     */     }
/*     */     
/*     */     a(String ☃, bor.b b1, blm<blc>... arrayOfBlm) {
/*  51 */       this.i = ☃;
/*  52 */       this.h = arrayOfBlm;
/*  53 */       this.j = b1;
/*     */     }
/*     */     
/*     */     public blm<blc>[] a() {
/*  57 */       return this.h;
/*     */     }
/*     */     
/*     */     public String b() {
/*  61 */       return this.i;
/*     */     }
/*     */     
/*     */     public bor.b c() {
/*  65 */       return this.j;
/*     */     }
/*     */     
/*     */     public static a a(String ☃) {
/*  69 */       return k.get(☃);
/*     */     }
/*     */   }
/*     */   
/*  73 */   private final xd a = new xd(9, 256);
/*     */   private final blm<blc> b;
/*     */   private final bmx c;
/*     */   
/*     */   public bor(bmx ☃, a a1) {
/*  78 */     this.b = blq.a(blq.b((blm<? super blc>[])a1.a()));
/*  79 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  83 */     int ☃ = this.c.b() + 16;
/*  84 */     try (el.b ☃ = el.b.r()) {
/*  85 */       for (int i = 0; i < 16; i++) {
/*  86 */         for (int j = 0; j < 16; j++) {
/*  87 */           a(i, j, a(b, i, j, this.b, ☃));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i, int j, @Nullable blc blc1) {
/*  94 */     int k = a(☃, j);
/*  95 */     if (i <= k - 2)
/*     */     {
/*  97 */       return false;
/*     */     }
/*     */     
/* 100 */     if (this.b.test(blc1, this.c, new el(☃, i, j))) {
/*     */       
/* 102 */       if (i >= k) {
/* 103 */         a(☃, j, i + 1);
/* 104 */         return true;
/*     */       }
/*     */     
/*     */     }
/* 108 */     else if (k - 1 == i) {
/* 109 */       a(☃, j, a(null, ☃, j, this.b, i));
/* 110 */       return true;
/*     */     } 
/*     */     
/* 113 */     return false;
/*     */   }
/*     */   
/*     */   private int a(@Nullable el.a ☃, int i, int j, blm<blc> blm1, int k) {
/* 117 */     if (☃ == null) {
/* 118 */       ☃ = new el.a();
/*     */     }
/* 120 */     for (int m = k - 1; m >= 0; m--) {
/* 121 */       ☃.c(i, m, j);
/* 122 */       blc blc = this.c.a_(☃);
/* 123 */       if (blm1.test(blc, this.c, ☃)) {
/* 124 */         return m + 1;
/*     */       }
/*     */     } 
/* 127 */     return 0;
/*     */   }
/*     */   
/*     */   public int a(int ☃, int i) {
/* 131 */     return a(b(☃, i));
/*     */   }
/*     */   
/*     */   private int a(int ☃) {
/* 135 */     return this.a.a(☃);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j) {
/* 139 */     this.a.a(b(☃, i), j);
/*     */   }
/*     */   
/*     */   public void a(long[] ☃) {
/* 143 */     System.arraycopy(☃, 0, this.a.a(), 0, ☃.length);
/*     */   }
/*     */   
/*     */   public long[] b() {
/* 147 */     return this.a.a();
/*     */   }
/*     */   
/*     */   private static int b(int ☃, int i) {
/* 151 */     return ☃ + i * 16;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */