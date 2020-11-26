/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vr
/*    */   extends vs<GameProfile>
/*    */ {
/*    */   private final int a;
/*    */   private final boolean b;
/*    */   
/*    */   public vr(GameProfile ☃, int i, boolean bool) {
/* 14 */     super(☃);
/* 15 */     this.a = i;
/* 16 */     this.b = bool;
/*    */   }
/*    */   
/*    */   public vr(JsonObject ☃) {
/* 20 */     super(b(☃), ☃);
/* 21 */     this.a = ☃.has("level") ? ☃.get("level").getAsInt() : 0;
/* 22 */     this.b = (☃.has("bypassesPlayerLimit") && ☃.get("bypassesPlayerLimit").getAsBoolean());
/*    */   }
/*    */   
/*    */   public int a() {
/* 26 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 30 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃) {
/* 35 */     if (g() == null) {
/*    */       return;
/*    */     }
/* 38 */     ☃.addProperty("uuid", (g().getId() == null) ? "" : g().getId().toString());
/* 39 */     ☃.addProperty("name", g().getName());
/* 40 */     super.a(☃);
/* 41 */     ☃.addProperty("level", Integer.valueOf(this.a));
/* 42 */     ☃.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.b));
/*    */   }
/*    */   private static GameProfile b(JsonObject ☃) {
/*    */     UUID uUID;
/* 46 */     if (!☃.has("uuid") || !☃.has("name")) {
/* 47 */       return null;
/*    */     }
/* 49 */     String str = ☃.get("uuid").getAsString();
/*    */     
/*    */     try {
/* 52 */       uUID = UUID.fromString(str);
/* 53 */     } catch (Throwable throwable) {
/* 54 */       return null;
/*    */     } 
/* 56 */     return new GameProfile(uUID, ☃.get("name").getAsString());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */