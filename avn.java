/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avn
/*    */ {
/* 14 */   private static final Map<String, avm<?>> q = Maps.newHashMap();
/*    */   
/* 16 */   public static final avm<avp> a = a(new avp.a());
/* 17 */   public static final avm<avq> b = a(new avq.a());
/* 18 */   public static final a<auz> c = a(new a<>("crafting_special_armordye", auz::new));
/* 19 */   public static final a<avc> d = a(new a<>("crafting_special_bookcloning", avc::new));
/* 20 */   public static final a<avi> e = a(new a<>("crafting_special_mapcloning", avi::new));
/* 21 */   public static final a<avj> f = a(new a<>("crafting_special_mapextending", avj::new));
/* 22 */   public static final a<ave> g = a(new a<>("crafting_special_firework_rocket", ave::new));
/* 23 */   public static final a<avg> h = a(new a<>("crafting_special_firework_star", avg::new));
/* 24 */   public static final a<avf> i = a(new a<>("crafting_special_firework_star_fade", avf::new));
/* 25 */   public static final a<avo> j = a(new a<>("crafting_special_repairitem", avo::new));
/* 26 */   public static final a<avu> k = a(new a<>("crafting_special_tippedarrow", avu::new));
/* 27 */   public static final a<avb> l = a(new a<>("crafting_special_bannerduplicate", avb::new));
/* 28 */   public static final a<ava> m = a(new a<>("crafting_special_banneraddpattern", ava::new));
/* 29 */   public static final a<avr> n = a(new a<>("crafting_special_shielddecoration", avr::new));
/* 30 */   public static final a<avs> o = a(new a<>("crafting_special_shulkerboxcoloring", avs::new));
/*    */   
/* 32 */   public static final avm<avt> p = a(new avt.a());
/*    */   
/*    */   public static <S extends avm<T>, T extends avk> S a(S ☃) {
/* 35 */     if (q.containsKey(☃.a())) {
/* 36 */       throw new IllegalArgumentException("Duplicate recipe serializer " + ☃.a());
/*    */     }
/*    */     
/* 39 */     q.put(☃.a(), (avm<?>)☃);
/* 40 */     return ☃;
/*    */   }
/*    */   
/*    */   public static avk a(pc ☃, JsonObject jsonObject) {
/* 44 */     String str = xj.h(jsonObject, "type");
/* 45 */     avm<?> avm1 = q.get(str);
/* 46 */     if (avm1 == null) {
/* 47 */       throw new JsonSyntaxException("Invalid or unsupported recipe type '" + str + "'");
/*    */     }
/* 49 */     return (avk)avm1.a(☃, jsonObject);
/*    */   }
/*    */   
/*    */   public static avk a(hy ☃) {
/* 53 */     pc pc = ☃.l();
/* 54 */     String str = ☃.e(32767);
/* 55 */     avm<?> avm1 = q.get(str);
/* 56 */     if (avm1 == null) {
/* 57 */       throw new IllegalArgumentException("Unknown recipe serializer " + str);
/*    */     }
/* 59 */     return (avk)avm1.a(pc, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T extends avk> void a(T ☃, hy hy1) {
/* 64 */     hy1.a(☃.b());
/* 65 */     hy1.a(☃.a().a());
/* 66 */     avm<T> avm1 = (avm)☃.a();
/* 67 */     avm1.a(hy1, ☃);
/*    */   }
/*    */   
/*    */   public static final class a<T extends avk> implements avm<T> {
/*    */     private final String a;
/*    */     private final Function<pc, T> b;
/*    */     
/*    */     public a(String ☃, Function<pc, T> function) {
/* 75 */       this.a = ☃;
/* 76 */       this.b = function;
/*    */     }
/*    */ 
/*    */     
/*    */     public T a(pc ☃, JsonObject jsonObject) {
/* 81 */       return this.b.apply(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public T a(pc ☃, hy hy1) {
/* 86 */       return this.b.apply(☃);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public void a(hy ☃, T t) {}
/*    */ 
/*    */     
/*    */     public String a() {
/* 95 */       return this.a;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\avn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */