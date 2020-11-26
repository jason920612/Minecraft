/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.Iterator;
/*    */ import java.util.Objects;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gm
/*    */   implements fq
/*    */ {
/* 21 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   private final fp c;
/*    */   
/*    */   public gm(fp ☃) {
/* 26 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(fr ☃) throws IOException {
/* 31 */     Path path = this.c.b();
/*    */     
/* 33 */     for (Iterator<Path> iterator = this.c.a().iterator(); iterator.hasNext(); ) { Path path1 = iterator.next();
/* 34 */       Files.walk(path1, new java.nio.file.FileVisitOption[0]).filter(☃ -> ☃.toString().endsWith(".snbt")).forEach(path3 -> a(☃, path3, a(path1, path3), path2)); }
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String a() {
/* 42 */     return "SNBT -> NBT";
/*    */   }
/*    */   
/*    */   private String a(Path ☃, Path path1) {
/* 46 */     String str = ☃.relativize(path1).toString().replaceAll("\\\\", "/");
/* 47 */     return str.substring(0, str.length() - ".snbt".length());
/*    */   }
/*    */   
/*    */   private void a(fr ☃, Path path1, String str, Path path2) {
/*    */     try {
/* 52 */       Path path = path2.resolve(str + ".nbt");
/* 53 */       try (BufferedReader ☃ = Files.newBufferedReader(path1)) {
/* 54 */         String str1 = IOUtils.toString(bufferedReader);
/* 55 */         String str2 = a.hashUnencodedChars(str1).toString();
/*    */         
/* 57 */         if (!Objects.equals(☃.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/* 58 */           Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 59 */           try (OutputStream ☃ = Files.newOutputStream(path, new java.nio.file.OpenOption[0])) {
/* 60 */             hi.a(hp.a(str1), outputStream);
/*    */           } 
/*    */         } 
/* 63 */         ☃.a(path, str2);
/*    */       } 
/* 65 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 66 */       b.error("Couldn't convert {} from SNBT to NBT at {} as it's invalid SNBT", str, path1, commandSyntaxException);
/* 67 */     } catch (IOException iOException) {
/* 68 */       b.error("Couldn't convert {} from SNBT to NBT at {}", str, path1, iOException);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\gm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */