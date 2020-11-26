/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixTypes;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cca
/*     */   implements cce
/*     */ {
/*  27 */   private static final Logger e = LogManager.getLogger();
/*     */   
/*     */   protected final Path a;
/*     */   protected final Path b;
/*     */   protected final DataFixer c;
/*     */   
/*     */   public cca(Path ☃, Path path1, DataFixer dataFixer) {
/*  34 */     this.c = dataFixer;
/*     */     try {
/*  36 */       Files.createDirectories(Files.exists(☃, new java.nio.file.LinkOption[0]) ? ☃.toRealPath(new java.nio.file.LinkOption[0]) : ☃, (FileAttribute<?>[])new FileAttribute[0]);
/*  37 */     } catch (IOException iOException) {
/*  38 */       throw new RuntimeException(iOException);
/*     */     } 
/*  40 */     this.a = ☃;
/*  41 */     this.b = path1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccb c(String ☃) {
/*  72 */     File file1 = new File(this.a.toFile(), ☃);
/*  73 */     if (!file1.exists()) {
/*  74 */       return null;
/*     */     }
/*     */     
/*  77 */     File file2 = new File(file1, "level.dat");
/*  78 */     if (file2.exists()) {
/*  79 */       ccb ccb = a(file2, this.c);
/*  80 */       if (ccb != null) {
/*  81 */         return ccb;
/*     */       }
/*     */     } 
/*     */     
/*  85 */     file2 = new File(file1, "level.dat_old");
/*  86 */     if (file2.exists()) {
/*  87 */       return a(file2, this.c);
/*     */     }
/*  89 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ccb a(File ☃, DataFixer dataFixer) {
/*     */     try {
/*  95 */       gy gy1 = hi.a(new FileInputStream(☃));
/*  96 */       gy gy2 = gy1.p("Data");
/*  97 */       gy gy3 = gy2.c("Player", 10) ? gy2.p("Player") : null;
/*  98 */       gy2.r("Player");
/*  99 */       int i = gy2.c("DataVersion", 99) ? gy2.h("DataVersion") : -1;
/* 100 */       return new ccb(hk.a(dataFixer, (DSL.TypeReference)DataFixTypes.LEVEL, gy2, i), dataFixer, i, gy3);
/* 101 */     } catch (Exception exception) {
/* 102 */       e.error("Exception reading {}", ☃, exception);
/*     */       
/* 104 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ccc a(String ☃, @Nullable MinecraftServer minecraftServer) {
/* 197 */     return new cbz(this.a.toFile(), ☃, minecraftServer, this.c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(String ☃) {
/* 207 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(String ☃, xs xs1) {
/* 212 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public File b(String ☃, String str1) {
/* 222 */     return this.a.resolve(☃).resolve(str1).toFile();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */