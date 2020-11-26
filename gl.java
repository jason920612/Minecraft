/*    */ import java.io.BufferedWriter;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.Iterator;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gl
/*    */   implements fq
/*    */ {
/* 18 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   private final fp c;
/*    */   
/*    */   public gl(fp ☃) {
/* 23 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(fr ☃) throws IOException {
/* 28 */     Path path = this.c.b();
/*    */     
/* 30 */     for (Iterator<Path> iterator = this.c.a().iterator(); iterator.hasNext(); ) { Path path1 = iterator.next();
/* 31 */       Files.walk(path1, new java.nio.file.FileVisitOption[0]).filter(☃ -> ☃.toString().endsWith(".nbt")).forEach(path2 -> a(path2, a(☃, path2), path1)); }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 37 */     return "NBT to SNBT";
/*    */   }
/*    */   
/*    */   private String a(Path ☃, Path path1) {
/* 41 */     String str = ☃.relativize(path1).toString().replaceAll("\\\\", "/");
/* 42 */     return str.substring(0, str.length() - ".nbt".length());
/*    */   }
/*    */   
/*    */   private void a(Path ☃, String str, Path path1) {
/*    */     try {
/* 47 */       gy gy = hi.a(Files.newInputStream(☃, new java.nio.file.OpenOption[0]));
/* 48 */       ij ij = gy.a("    ", 0);
/* 49 */       String str1 = ij.getString();
/* 50 */       Path path = path1.resolve(str + ".snbt");
/* 51 */       Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 52 */       try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/* 53 */         bufferedWriter.write(str1);
/*    */       } 
/* 55 */       b.info("Converted {} from NBT to SNBT", str);
/* 56 */     } catch (IOException iOException) {
/* 57 */       b.error("Couldn't convert {} from NBT to SNBT at {}", str, ☃, iOException);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\gl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */