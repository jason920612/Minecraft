/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.IOException;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gb
/*    */   implements fq
/*    */ {
/*    */   private final fp b;
/*    */   
/*    */   public gb(fp ☃) {
/* 22 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(fr ☃) throws IOException {
/* 27 */     JsonObject jsonObject = new JsonObject();
/*    */     
/* 29 */     for (ata ata : fc.s) {
/* 30 */       pc pc = fc.s.b(ata);
/* 31 */       JsonObject jsonObject1 = new JsonObject();
/* 32 */       jsonObject1.addProperty("protocol_id", Integer.valueOf(ata.a(ata)));
/*    */       
/* 34 */       jsonObject.add(pc.toString(), (JsonElement)jsonObject1);
/*    */     } 
/*    */     
/* 37 */     Path path = this.b.b().resolve("reports/items.json");
/* 38 */     Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 39 */     try (BufferedWriter ☃ = Files.newBufferedWriter(path, StandardCharsets.UTF_8, new java.nio.file.OpenOption[0])) {
/* 40 */       String str = (new GsonBuilder()).setPrettyPrinting().create().toJson((JsonElement)jsonObject);
/* 41 */       bufferedWriter.write(str);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 47 */     return "Item List";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\gb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */