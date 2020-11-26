/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cdr
/*    */ {
/*  9 */   private static final Map<pc, cds.a<?>> a = Maps.newHashMap();
/* 10 */   private static final Map<Class<? extends cds>, cds.a<?>> b = Maps.newHashMap();
/*    */   
/*    */   static {
/* 13 */     a(new cdt.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T extends cds> void a(cds.a<? extends T> ☃) {
/* 18 */     pc pc = ☃.a();
/* 19 */     Class<T> clazz = (Class)☃.b();
/* 20 */     if (a.containsKey(pc)) {
/* 21 */       throw new IllegalArgumentException("Can't re-register entity property name " + pc);
/*    */     }
/* 23 */     if (b.containsKey(clazz)) {
/* 24 */       throw new IllegalArgumentException("Can't re-register entity property class " + clazz.getName());
/*    */     }
/* 26 */     a.put(pc, ☃);
/* 27 */     b.put(clazz, ☃);
/*    */   }
/*    */   
/*    */   public static cds.a<?> a(pc ☃) {
/* 31 */     cds.a<?> a = a.get(☃);
/* 32 */     if (a == null) {
/* 33 */       throw new IllegalArgumentException("Unknown loot entity property '" + ☃ + "'");
/*    */     }
/* 35 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T extends cds> cds.a<T> a(T ☃) {
/* 40 */     cds.a<?> a = b.get(☃.getClass());
/* 41 */     if (a == null) {
/* 42 */       throw new IllegalArgumentException("Unknown loot entity property " + ☃);
/*    */     }
/* 44 */     return (cds.a)a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */