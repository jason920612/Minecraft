/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class p
/*    */ {
/* 39 */   private static final Map<pc, s<?>> F = Maps.newHashMap();
/*    */   
/* 41 */   public static final as a = a(new as());
/* 42 */   public static final aw b = a(new aw(new pc("player_killed_entity")));
/* 43 */   public static final aw c = a(new aw(new pc("entity_killed_player")));
/* 44 */   public static final am d = a(new am());
/* 45 */   public static final at e = a(new at());
/* 46 */   public static final bg f = a(new bg());
/* 47 */   public static final bf g = a(new bf());
/* 48 */   public static final an h = a(new an());
/* 49 */   public static final ak i = a(new ak());
/* 50 */   public static final aq j = a(new aq());
/* 51 */   public static final aa k = a(new aa());
/* 52 */   public static final ad l = a(new ad());
/* 53 */   public static final bl m = a(new bl());
/* 54 */   public static final bh n = a(new bh());
/* 55 */   public static final z o = a(new z());
/* 56 */   public static final az p = a(new az(new pc("location")));
/* 57 */   public static final az q = a(new az(new pc("slept_in_bed")));
/* 58 */   public static final af r = a(new af());
/* 59 */   public static final bk s = a(new bk());
/* 60 */   public static final au t = a(new au());
/* 61 */   public static final ax u = a(new ax());
/* 62 */   public static final ab v = a(new ab());
/* 63 */   public static final bj w = a(new bj());
/* 64 */   public static final bi x = a(new bi());
/* 65 */   public static final be y = a(new be());
/* 66 */   public static final ae z = a(new ae());
/* 67 */   public static final aj A = a(new aj());
/* 68 */   public static final bm B = a(new bm());
/* 69 */   public static final bd C = a(new bd());
/* 70 */   public static final ar D = a(new ar());
/* 71 */   public static final ac E = a(new ac());
/*    */   
/*    */   private static <T extends s<?>> T a(T ☃) {
/* 74 */     if (F.containsKey(☃.a())) {
/* 75 */       throw new IllegalArgumentException("Duplicate criterion id " + ☃.a());
/*    */     }
/* 77 */     F.put(☃.a(), (s<?>)☃);
/* 78 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static <T extends t> s<T> a(pc ☃) {
/* 84 */     return (s<T>)F.get(☃);
/*    */   }
/*    */   
/*    */   public static Iterable<? extends s<?>> a() {
/* 88 */     return F.values();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */