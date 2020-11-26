/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonArray;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fz
/*    */   implements fq
/*    */ {
/*    */   private final fp b;
/*    */   
/*    */   public fz(fp ☃) {
/* 27 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(fr ☃) throws IOException {
/* 32 */     JsonObject jsonObject = new JsonObject();
/*    */     
/* 34 */     for (bcs bcs : fc.g) {
/* 35 */       pc pc = fc.g.b(bcs);
/* 36 */       JsonObject jsonObject1 = new JsonObject();
/* 37 */       ble<bcs, blc> ble = bcs.o();
/*    */       
/* 39 */       if (!ble.d().isEmpty()) {
/* 40 */         JsonObject jsonObject2 = new JsonObject();
/* 41 */         for (bmm<?> bmm : ble.d()) {
/* 42 */           JsonArray jsonArray1 = new JsonArray();
/* 43 */           for (Comparable<?> comparable : bmm.d()) {
/* 44 */             jsonArray1.add(k.a(bmm, comparable));
/*    */           }
/* 46 */           jsonObject2.add(bmm.a(), (JsonElement)jsonArray1);
/*    */         } 
/*    */         
/* 49 */         jsonObject1.add("properties", (JsonElement)jsonObject2);
/*    */       } 
/*    */       
/* 52 */       JsonArray jsonArray = new JsonArray();
/* 53 */       for (UnmodifiableIterator<blc> unmodifiableIterator = ble.a().iterator(); unmodifiableIterator.hasNext(); ) { blc blc = unmodifiableIterator.next();
/* 54 */         JsonObject jsonObject2 = new JsonObject();
/* 55 */         JsonObject jsonObject3 = new JsonObject();
/* 56 */         for (bmm<?> bmm : ble.d()) {
/* 57 */           jsonObject3.addProperty(bmm.a(), k.a(bmm, blc.c(bmm)));
/*    */         }
/* 59 */         if (jsonObject3.size() > 0) {
/* 60 */           jsonObject2.add("properties", (JsonElement)jsonObject3);
/*    */         }
/* 62 */         jsonObject2.addProperty("id", Integer.valueOf(bcs.l(blc)));
/* 63 */         if (blc == bcs.p()) {
/* 64 */           jsonObject2.addProperty("default", Boolean.valueOf(true));
/*    */         }
/* 66 */         jsonArray.add((JsonElement)jsonObject2); }
/*    */ 
/*    */       
/* 69 */       jsonObject1.add("states", (JsonElement)jsonArray);
/* 70 */       jsonObject.add(pc.toString(), (JsonElement)jsonObject1);
/*    */     } 
/*    */     
/* 73 */     Path path = this.b.b().resolve("reports/blocks.json");
/* 74 */     Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 75 */     try (BufferedWriter ☃ = Files.newBufferedWriter(path, StandardCharsets.UTF_8, new java.nio.file.OpenOption[0])) {
/* 76 */       String str = (new GsonBuilder()).setPrettyPrinting().create().toJson((JsonElement)jsonObject);
/* 77 */       bufferedWriter.write(str);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 83 */     return "Block List";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */