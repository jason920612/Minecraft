/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.Date;
/*    */ import java.util.Objects;
/*    */ import java.util.UUID;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vv
/*    */   extends vk<GameProfile>
/*    */ {
/*    */   public vv(GameProfile ☃) {
/* 15 */     this(☃, null, null, null, null);
/*    */   }
/*    */   
/*    */   public vv(GameProfile ☃, @Nullable Date date1, @Nullable String str1, @Nullable Date date2, @Nullable String str2) {
/* 19 */     super(☃, date2, str1, date2, str2);
/*    */   }
/*    */   
/*    */   public vv(JsonObject ☃) {
/* 23 */     super(b(☃), ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃) {
/* 28 */     if (g() == null) {
/*    */       return;
/*    */     }
/* 31 */     ☃.addProperty("uuid", (g().getId() == null) ? "" : g().getId().toString());
/* 32 */     ☃.addProperty("name", g().getName());
/* 33 */     super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ij e() {
/* 38 */     GameProfile ☃ = g();
/* 39 */     return new iq((☃.getName() != null) ? ☃.getName() : Objects.toString(☃.getId(), "(Unknown)"));
/*    */   }
/*    */   private static GameProfile b(JsonObject ☃) {
/*    */     UUID uUID;
/* 43 */     if (!☃.has("uuid") || !☃.has("name")) {
/* 44 */       return null;
/*    */     }
/* 46 */     String str = ☃.get("uuid").getAsString();
/*    */     
/*    */     try {
/* 49 */       uUID = UUID.fromString(str);
/* 50 */     } catch (Throwable throwable) {
/* 51 */       return null;
/*    */     } 
/* 53 */     return new GameProfile(uUID, ☃.get("name").getAsString());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */