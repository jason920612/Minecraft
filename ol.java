/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ol
/*    */   implements iv<oj>
/*    */ {
/* 15 */   private static final Gson a = (new GsonBuilder())
/* 16 */     .registerTypeAdapter(om.c.class, new om.c.a())
/* 17 */     .registerTypeAdapter(om.a.class, new om.a.a())
/* 18 */     .registerTypeAdapter(om.class, new om.b())
/* 19 */     .registerTypeHierarchyAdapter(ij.class, new ij.a())
/* 20 */     .registerTypeHierarchyAdapter(ip.class, new ip.a())
/* 21 */     .registerTypeAdapterFactory(new xp())
/* 22 */     .create();
/*    */   
/*    */   private om b;
/*    */ 
/*    */   
/*    */   public ol() {}
/*    */ 
/*    */   
/*    */   public ol(om ☃) {
/* 31 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 36 */     this.b = xj.<om>a(a, ☃.e(32767), om.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 41 */     ☃.a(a.toJson(this.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(oj ☃) {
/* 46 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */