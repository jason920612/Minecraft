/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import java.util.Set;
/*    */ import java.util.function.Consumer;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fs
/*    */   implements fq
/*    */ {
/* 26 */   private static final Logger b = LogManager.getLogger();
/* 27 */   private static final Gson c = (new GsonBuilder()).setPrettyPrinting().create();
/*    */   
/*    */   private final fp d;
/* 30 */   private final List<Consumer<Consumer<l>>> e = (List<Consumer<Consumer<l>>>)ImmutableList.of(new fx(), new fu(), new ft(), new fv(), new fw());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public fs(fp ☃) {
/* 39 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(fr ☃) throws IOException {
/* 44 */     Path path = this.d.b();
/* 45 */     Set<pc> set = Sets.newHashSet();
/* 46 */     Consumer<l> consumer = l1 -> {
/*    */         if (!☃.add(l1.h())) {
/*    */           throw new IllegalStateException("Duplicate advancement " + l1.h());
/*    */         }
/*    */         
/*    */         a(fr1, l1.a().b(), path.resolve("data/" + l1.h().b() + "/advancements/" + l1.h().a() + ".json"));
/*    */       };
/* 53 */     for (Consumer<Consumer<l>> consumer1 : this.e) {
/* 54 */       consumer1.accept(consumer);
/*    */     }
/*    */   }
/*    */   
/*    */   private void a(fr ☃, JsonObject jsonObject, Path path) {
/*    */     try {
/* 60 */       String str1 = c.toJson((JsonElement)jsonObject);
/* 61 */       String str2 = a.hashUnencodedChars(str1).toString();
/*    */       
/* 63 */       if (!Objects.equals(☃.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/* 64 */         Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 65 */         try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/* 66 */           bufferedWriter.write(str1);
/*    */         } 
/*    */       } 
/* 69 */       ☃.a(path, str2);
/* 70 */     } catch (IOException iOException) {
/* 71 */       b.error("Couldn't save advancement {}", path, iOException);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 77 */     return "Advancements";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */