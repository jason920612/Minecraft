/*    */ import com.google.common.base.Joiner;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ap
/*    */ {
/* 16 */   public static final ap a = new ap();
/*    */   
/* 18 */   private static final Joiner b = Joiner.on(", ");
/*    */   
/*    */   @Nullable
/*    */   private final aev<?> c;
/*    */   
/*    */   public ap(aev<?> ☃) {
/* 24 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   private ap() {
/* 28 */     this.c = null;
/*    */   }
/*    */   
/*    */   public boolean a(aev<?> ☃) {
/* 32 */     return (this.c == null || this.c == ☃);
/*    */   }
/*    */   
/*    */   public static ap a(@Nullable JsonElement ☃) {
/* 36 */     if (☃ == null || ☃.isJsonNull()) {
/* 37 */       return a;
/*    */     }
/*    */     
/* 40 */     String str = xj.a(☃, "type");
/*    */     
/* 42 */     pc pc = new pc(str);
/* 43 */     aev<?> aev1 = fc.r.b(pc);
/* 44 */     if (aev1 == null) {
/* 45 */       throw new JsonSyntaxException("Unknown entity type '" + pc + "', valid types are: " + b.join(fc.r.c()));
/*    */     }
/*    */     
/* 48 */     return new ap(aev1);
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 52 */     if (this.c == null) {
/* 53 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 56 */     return (JsonElement)new JsonPrimitive(fc.r.b(this.c).toString());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */