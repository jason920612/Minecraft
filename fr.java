/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.IOException;
/*     */ import java.io.Writer;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class fr
/*     */ {
/*  20 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final Path b;
/*     */   
/*     */   private final Path c;
/*     */   
/*     */   private int d;
/*  27 */   private final Map<Path, String> e = Maps.newHashMap();
/*  28 */   private final Map<Path, String> f = Maps.newHashMap();
/*     */   
/*     */   public fr(Path ☃, String str) throws IOException {
/*  31 */     this.b = ☃;
/*     */     
/*  33 */     Path path = ☃.resolve(".cache");
/*  34 */     Files.createDirectories(path, (FileAttribute<?>[])new FileAttribute[0]);
/*  35 */     this.c = path.resolve(str);
/*     */     
/*  37 */     c().forEach(☃ -> (String)this.e.put(☃, ""));
/*     */     
/*  39 */     if (Files.isReadable(this.c))
/*  40 */       IOUtils.readLines(Files.newInputStream(this.c, new java.nio.file.OpenOption[0]), Charsets.UTF_8).forEach(str -> {
/*     */             int i = str.indexOf(' ');
/*     */             this.e.put(☃.resolve(str.substring(i + 1)), str.substring(0, i));
/*     */           }); 
/*     */   }
/*     */   
/*     */   public void a() throws IOException {
/*     */     Writer ☃;
/*  48 */     b();
/*     */ 
/*     */     
/*     */     try {
/*  52 */       ☃ = Files.newBufferedWriter(this.c, new java.nio.file.OpenOption[0]);
/*  53 */     } catch (IOException iOException) {
/*  54 */       a.warn("Unable write cachefile {}: {}", this.c, iOException.toString());
/*     */       
/*     */       return;
/*     */     } 
/*  58 */     IOUtils.writeLines((Collection)this.f
/*  59 */         .entrySet().stream().map(☃ -> (String)☃.getValue() + ' ' + this.b.relativize((Path)☃.getKey())).collect(Collectors.toList()), 
/*  60 */         System.lineSeparator(), ☃);
/*     */ 
/*     */ 
/*     */     
/*  64 */     ☃.close();
/*     */     
/*  66 */     a.debug("Caching: cache hits: {}, created: {} removed: {}", 
/*  67 */         Integer.valueOf(this.d), 
/*  68 */         Integer.valueOf(this.f.size() - this.d), 
/*  69 */         Integer.valueOf(this.e.size()));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public String a(Path ☃) {
/*  75 */     return this.e.get(☃);
/*     */   }
/*     */   
/*     */   public void a(Path ☃, String str) {
/*  79 */     this.f.put(☃, str);
/*  80 */     if (Objects.equals(this.e.remove(☃), str)) {
/*  81 */       this.d++;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean b(Path ☃) {
/*  86 */     return this.e.containsKey(☃);
/*     */   }
/*     */   
/*     */   private void b() throws IOException {
/*  90 */     c().forEach(☃ -> {
/*     */           if (b(☃)) {
/*     */             try {
/*     */               Files.delete(☃);
/*  94 */             } catch (IOException iOException) {
/*     */               a.debug("Unable to delete: {} ({})", ☃, iOException.toString());
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private Stream<Path> c() throws IOException {
/* 102 */     return Files.walk(this.b, new java.nio.file.FileVisitOption[0]).filter(☃ -> (!Objects.equals(this.c, ☃) && !Files.isDirectory(☃, new java.nio.file.LinkOption[0])));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\fr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */