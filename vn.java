/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Date;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vn
/*    */   extends vk<String>
/*    */ {
/*    */   public vn(String ☃) {
/* 12 */     this(☃, null, null, null, null);
/*    */   }
/*    */   
/*    */   public vn(String ☃, @Nullable Date date1, @Nullable String str1, @Nullable Date date2, @Nullable String str2) {
/* 16 */     super(☃, date1, str1, date2, str2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ij e() {
/* 21 */     return new iq(g());
/*    */   }
/*    */   
/*    */   public vn(JsonObject ☃) {
/* 25 */     super(b(☃), ☃);
/*    */   }
/*    */   
/*    */   private static String b(JsonObject ☃) {
/* 29 */     return ☃.has("ip") ? ☃.get("ip").getAsString() : null;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃) {
/* 34 */     if (g() == null) {
/*    */       return;
/*    */     }
/* 37 */     ☃.addProperty("ip", g());
/* 38 */     super.a(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */