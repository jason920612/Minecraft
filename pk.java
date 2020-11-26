/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.util.Properties;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pk
/*    */ {
/* 14 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final File b;
/*    */   private final boolean c;
/*    */   
/*    */   public pk(File ☃) {
/* 20 */     this.b = ☃;
/* 21 */     this.c = (j.b || a(☃));
/*    */   }
/*    */   
/*    */   private boolean a(File ☃) {
/* 25 */     FileInputStream fileInputStream = null;
/* 26 */     boolean bool = false;
/*    */     try {
/* 28 */       Properties properties = new Properties();
/* 29 */       fileInputStream = new FileInputStream(☃);
/* 30 */       properties.load(fileInputStream);
/* 31 */       bool = Boolean.parseBoolean(properties.getProperty("eula", "false"));
/* 32 */     } catch (Exception exception) {
/* 33 */       a.warn("Failed to load {}", ☃);
/* 34 */       b();
/*    */     } finally {
/* 36 */       IOUtils.closeQuietly(fileInputStream);
/*    */     } 
/* 38 */     return bool;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 42 */     return this.c;
/*    */   }
/*    */   
/*    */   public void b() {
/* 46 */     if (j.b) {
/*    */       return;
/*    */     }
/* 49 */     FileOutputStream ☃ = null;
/*    */     try {
/* 51 */       Properties properties = new Properties();
/* 52 */       ☃ = new FileOutputStream(this.b);
/* 53 */       properties.setProperty("eula", "false");
/* 54 */       properties.store(☃, "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula).");
/* 55 */     } catch (Exception exception) {
/* 56 */       a.warn("Failed to save {}", this.b, exception);
/*    */     } finally {
/* 58 */       IOUtils.closeQuietly(☃);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\pk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */