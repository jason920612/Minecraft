/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ui
/*    */   implements ul
/*    */ {
/* 20 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   protected final File a;
/*    */   
/*    */   public ui(File ☃) {
/* 25 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   private static String c(um ☃, pc pc1) {
/* 29 */     return String.format("%s/%s/%s", new Object[] { ☃.a(), pc1.b(), pc1.a() });
/*    */   }
/*    */   
/*    */   protected static String a(File ☃, File file1) {
/* 33 */     return ☃.toURI().relativize(file1.toURI()).getPath();
/*    */   }
/*    */ 
/*    */   
/*    */   public InputStream a(um ☃, pc pc1) throws IOException {
/* 38 */     return a(c(☃, pc1));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(um ☃, pc pc1) {
/* 43 */     return c(c(☃, pc1));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract InputStream a(String paramString) throws IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract boolean c(String paramString);
/*    */ 
/*    */ 
/*    */   
/*    */   protected void d(String ☃) {
/* 59 */     b.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", ☃, this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public <T> T a(up<T> ☃) throws IOException {
/* 65 */     return a(☃, a("pack.mcmeta"));
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static <T> T a(up<T> ☃, InputStream inputStream) {
/*    */     JsonObject jsonObject;
/* 71 */     try (BufferedReader ☃ = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
/* 72 */       jsonObject = xj.a(bufferedReader);
/* 73 */     } catch (IOException|JsonParseException exception) {
/* 74 */       b.error("Couldn't load {} metadata", ☃.a(), exception);
/* 75 */       return null;
/*    */     } 
/*    */     
/* 78 */     if (!jsonObject.has(☃.a())) {
/* 79 */       return null;
/*    */     }
/*    */     try {
/* 82 */       return ☃.a(xj.t(jsonObject, ☃.a()));
/* 83 */     } catch (JsonParseException jsonParseException) {
/* 84 */       b.error("Couldn't load {} metadata", ☃.a(), jsonParseException);
/* 85 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 91 */     return this.a.getName();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar\\ui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */