/*    */ package com.mojang.authlib.minecraft;
/*    */ 
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.io.FilenameUtils;
/*    */ import org.apache.commons.lang3.builder.ToStringBuilder;
/*    */ 
/*    */ public class MinecraftProfileTexture
/*    */ {
/*    */   public enum Type {
/* 11 */     SKIN,
/* 12 */     CAPE,
/* 13 */     ELYTRA;
/*    */   }
/*    */ 
/*    */   
/* 17 */   public static final int PROFILE_TEXTURE_COUNT = (Type.values()).length;
/*    */   
/*    */   private final String url;
/*    */   private final Map<String, String> metadata;
/*    */   
/*    */   public MinecraftProfileTexture(String url, Map<String, String> metadata) {
/* 23 */     this.url = url;
/* 24 */     this.metadata = metadata;
/*    */   }
/*    */   
/*    */   public String getUrl() {
/* 28 */     return this.url;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public String getMetadata(String key) {
/* 33 */     if (this.metadata == null) {
/* 34 */       return null;
/*    */     }
/* 36 */     return this.metadata.get(key);
/*    */   }
/*    */   
/*    */   public String getHash() {
/* 40 */     return FilenameUtils.getBaseName(this.url);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     return (new ToStringBuilder(this)).append("url", this.url).append("hash", getHash()).toString();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\authlib\minecraft\MinecraftProfileTexture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */