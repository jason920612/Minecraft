/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.ProfileLookupCallback;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import net.minecraft.server.MinecraftServer;
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
/*    */ 
/*    */ final class null
/*    */   implements ProfileLookupCallback
/*    */ {
/*    */   null(MinecraftServer paramMinecraftServer, Map paramMap, vu paramvu) {}
/*    */   
/*    */   public void onProfileLookupSucceeded(GameProfile ☃) {
/* 80 */     this.a.ar().a(☃);
/* 81 */     String[] arrayOfString = (String[])this.b.get(☃.getName().toLowerCase(Locale.ROOT));
/* 82 */     if (arrayOfString == null) {
/* 83 */       vo.a().warn("Could not convert user banlist entry for {}", ☃.getName());
/* 84 */       throw new vo.a("Profile not in the conversionlist", null);
/*    */     } 
/*    */     
/* 87 */     Date date1 = (arrayOfString.length > 1) ? vo.a(arrayOfString[1], (Date)null) : null;
/* 88 */     String str1 = (arrayOfString.length > 2) ? arrayOfString[2] : null;
/* 89 */     Date date2 = (arrayOfString.length > 3) ? vo.a(arrayOfString[3], (Date)null) : null;
/* 90 */     String str2 = (arrayOfString.length > 4) ? arrayOfString[4] : null;
/* 91 */     this.c.a(new vv(☃, date1, str1, date2, str2));
/*    */   }
/*    */ 
/*    */   
/*    */   public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 96 */     vo.a().warn("Could not lookup user banlist entry for {}", ☃.getName(), exception);
/* 97 */     if (!(exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException))
/* 98 */       throw new vo.a("Could not request user " + ☃.getName() + " from backend systems", exception, null); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\vo$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */