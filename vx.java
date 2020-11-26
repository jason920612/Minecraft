/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ public class vx
/*    */   extends vs<GameProfile>
/*    */ {
/*    */   public vx(GameProfile ☃) {
/* 10 */     super(☃);
/*    */   }
/*    */   
/*    */   public vx(JsonObject ☃) {
/* 14 */     super(b(☃), ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃) {
/* 19 */     if (g() == null) {
/*    */       return;
/*    */     }
/* 22 */     ☃.addProperty("uuid", (g().getId() == null) ? "" : g().getId().toString());
/* 23 */     ☃.addProperty("name", g().getName());
/* 24 */     super.a(☃);
/*    */   }
/*    */   private static GameProfile b(JsonObject ☃) {
/*    */     UUID uUID;
/* 28 */     if (!☃.has("uuid") || !☃.has("name")) {
/* 29 */       return null;
/*    */     }
/* 31 */     String str = ☃.get("uuid").getAsString();
/*    */     
/*    */     try {
/* 34 */       uUID = UUID.fromString(str);
/* 35 */     } catch (Throwable throwable) {
/* 36 */       return null;
/*    */     } 
/* 38 */     return new GameProfile(uUID, ☃.get("name").getAsString());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */