/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class gr<T>
/*    */   implements fq
/*    */ {
/* 25 */   private static final Logger e = LogManager.getLogger();
/* 26 */   private static final Gson f = (new GsonBuilder()).setPrettyPrinting().create();
/*    */   
/*    */   protected final fp b;
/*    */   
/*    */   protected final fc<T> c;
/* 31 */   protected final Map<wz<T>, wz.a<T>> d = Maps.newLinkedHashMap();
/*    */   
/*    */   protected gr(fp ☃, fc<T> fc1) {
/* 34 */     this.b = ☃;
/* 35 */     this.c = fc1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(fr ☃) throws IOException {
/* 42 */     this.d.clear();
/* 43 */     b();
/*    */     
/* 45 */     xa<T> xa = new xa<>(☃ -> false, ☃ -> null, "", false, "generated");
/* 46 */     for (Map.Entry<wz<T>, wz.a<T>> entry : this.d.entrySet()) {
/* 47 */       pc pc = ((wz)entry.getKey()).c();
/* 48 */       if (!((wz.a)entry.getValue()).a(xa::a)) {
/* 49 */         throw new UnsupportedOperationException("Unsupported referencing of tags!");
/*    */       }
/* 51 */       wz<T> wz = ((wz.a<T>)entry.getValue()).b(pc);
/* 52 */       JsonObject jsonObject = wz.a(this.c::b);
/* 53 */       Path path = a(pc);
/* 54 */       xa.a(wz);
/* 55 */       a(xa);
/*    */       
/*    */       try {
/* 58 */         String str1 = f.toJson((JsonElement)jsonObject);
/* 59 */         String str2 = a.hashUnencodedChars(str1).toString();
/*    */         
/* 61 */         if (!Objects.equals(☃.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/* 62 */           Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 63 */           try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/* 64 */             bufferedWriter.write(str1);
/*    */           } 
/*    */         } 
/* 67 */         ☃.a(path, str2);
/* 68 */       } catch (IOException iOException) {
/* 69 */         e.error("Couldn't save tags to {}", path, iOException);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected wz.a<T> a(wz<T> ☃) {
/* 79 */     return this.d.computeIfAbsent(☃, ☃ -> wz.a.a());
/*    */   }
/*    */   
/*    */   protected abstract void b();
/*    */   
/*    */   protected abstract void a(xa<T> paramxa);
/*    */   
/*    */   protected abstract Path a(pc parampc);
/*    */ }


/* Location:              F:\dw\server.jar!\gr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */