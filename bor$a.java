/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/* 31 */   a("WORLD_SURFACE_WG", bor.b.a, (blm<blc>[])new blm[] { bll.a(bct.a) }),
/* 32 */   b("OCEAN_FLOOR_WG", bor.b.a, (blm<blc>[])new blm[] { bll.a(bct.a), bls.a() }),
/* 33 */   c("LIGHT_BLOCKING", bor.b.b, (blm<blc>[])new blm[] { bll.a(bct.a), blr.a() }),
/* 34 */   d("MOTION_BLOCKING", bor.b.b, (blm<blc>[])new blm[] { bll.a(bct.a), blt.a() }),
/* 35 */   e("MOTION_BLOCKING_NO_LEAVES", bor.b.b, (blm<blc>[])new blm[] { bll.a(bct.a), blv.a(wv.A), blt.a() }),
/* 36 */   f("OCEAN_FLOOR", bor.b.b, (blm<blc>[])new blm[] { bll.a(bct.a), blu.a() }),
/* 37 */   g("WORLD_SURFACE", bor.b.b, (blm<blc>[])new blm[] { bll.a(bct.a) });
/*    */   private final blm<blc>[] h;
/*    */   private final String i;
/*    */   private final bor.b j;
/*    */   private static final Map<String, a> k;
/*    */   
/*    */   static {
/* 44 */     k = k.<Map<String, a>>a(Maps.newHashMap(), ☃ -> {
/*    */           for (a a1 : values())
/*    */             ☃.put(a1.i, a1); 
/*    */         });
/*    */   }
/*    */   
/*    */   a(String ☃, bor.b b1, blm<blc>... arrayOfBlm) {
/* 51 */     this.i = ☃;
/* 52 */     this.h = arrayOfBlm;
/* 53 */     this.j = b1;
/*    */   }
/*    */   
/*    */   public blm<blc>[] a() {
/* 57 */     return this.h;
/*    */   }
/*    */   
/*    */   public String b() {
/* 61 */     return this.i;
/*    */   }
/*    */   
/*    */   public bor.b c() {
/* 65 */     return this.j;
/*    */   }
/*    */   
/*    */   public static a a(String ☃) {
/* 69 */     return k.get(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bor$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */