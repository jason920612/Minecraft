/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixTypes;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.InvalidPathException;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bxm
/*     */   implements vg
/*     */ {
/*  37 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  44 */   private final Map<pc, bxp> b = Maps.newHashMap();
/*     */   private final DataFixer c;
/*     */   private final MinecraftServer d;
/*     */   private final Path e;
/*     */   
/*     */   public bxm(MinecraftServer ☃, File file, DataFixer dataFixer) {
/*  50 */     this.d = ☃;
/*  51 */     this.c = dataFixer;
/*  52 */     this.e = file.toPath().resolve("generated").normalize();
/*  53 */     ☃.aD().a(this);
/*     */   }
/*     */   
/*     */   public bxp a(pc ☃) {
/*  57 */     bxp bxp = b(☃);
/*  58 */     if (bxp == null) {
/*  59 */       bxp = new bxp();
/*  60 */       this.b.put(☃, bxp);
/*     */     } 
/*  62 */     return bxp;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bxp b(pc ☃) {
/*  67 */     return this.b.computeIfAbsent(☃, ☃ -> {
/*     */           bxp bxp = f(☃);
/*     */           return (bxp != null) ? bxp : e(☃);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(vf ☃) {
/*  75 */     this.b.clear();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bxp e(pc ☃) {
/*  80 */     pc pc1 = new pc(☃.b(), "structures/" + ☃.a() + ".nbt");
/*  81 */     try (ve ☃ = this.d.aD().a(pc1)) {
/*  82 */       return a(ve.b());
/*  83 */     } catch (FileNotFoundException fileNotFoundException) {
/*  84 */       return null;
/*  85 */     } catch (Throwable throwable) {
/*  86 */       a.error("Couldn't load structure {}: {}", ☃, throwable.toString());
/*  87 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bxp f(pc ☃) {
/*  93 */     if (!this.e.toFile().isDirectory()) {
/*  94 */       return null;
/*     */     }
/*     */     
/*  97 */     Path path = b(☃, ".nbt");
/*     */     
/*  99 */     try (InputStream ☃ = new FileInputStream(path.toFile())) {
/* 100 */       return a(inputStream);
/* 101 */     } catch (FileNotFoundException fileNotFoundException) {
/* 102 */       return null;
/* 103 */     } catch (IOException iOException) {
/* 104 */       a.error("Couldn't load structure from {}", path, iOException);
/* 105 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private bxp a(InputStream ☃) throws IOException {
/* 110 */     gy gy = hi.a(☃);
/*     */ 
/*     */     
/* 113 */     if (!gy.c("DataVersion", 99)) {
/* 114 */       gy.b("DataVersion", 500);
/*     */     }
/*     */     
/* 117 */     bxp bxp = new bxp();
/* 118 */     bxp.b(hk.a(this.c, (DSL.TypeReference)DataFixTypes.STRUCTURE, gy, gy.h("DataVersion")));
/* 119 */     return bxp;
/*     */   }
/*     */   
/*     */   public boolean c(pc ☃) {
/* 123 */     bxp bxp = this.b.get(☃);
/* 124 */     if (bxp == null) {
/* 125 */       return false;
/*     */     }
/*     */     
/* 128 */     Path path1 = b(☃, ".nbt");
/*     */     
/* 130 */     Path path2 = path1.getParent();
/* 131 */     if (path2 == null) {
/* 132 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 136 */       Files.createDirectories(Files.exists(path2, new java.nio.file.LinkOption[0]) ? path2.toRealPath(new java.nio.file.LinkOption[0]) : path2, (FileAttribute<?>[])new FileAttribute[0]);
/* 137 */     } catch (IOException iOException) {
/* 138 */       a.error("Failed to create parent directory: {}", path2);
/* 139 */       return false;
/*     */     } 
/*     */     
/* 142 */     gy gy = bxp.a(new gy());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     try (OutputStream ☃ = new FileOutputStream(path1.toFile())) {
/* 151 */       hi.a(gy, outputStream);
/* 152 */     } catch (Throwable throwable) {
/* 153 */       return false;
/*     */     } 
/*     */     
/* 156 */     return true;
/*     */   }
/*     */   
/*     */   private Path a(pc ☃, String str) {
/*     */     try {
/* 161 */       Path path1 = this.e.resolve(☃.b());
/* 162 */       Path path2 = path1.resolve("structures");
/* 163 */       return k.a(path2, ☃.a(), str);
/* 164 */     } catch (InvalidPathException invalidPathException) {
/* 165 */       throw new i("Invalid resource path: " + ☃, invalidPathException);
/*     */     } 
/*     */   }
/*     */   
/*     */   private Path b(pc ☃, String str) {
/* 170 */     if (☃.a().contains("//")) {
/* 171 */       throw new i("Invalid resource path: " + ☃);
/*     */     }
/*     */     
/* 174 */     Path path = a(☃, str);
/*     */     
/* 176 */     if (!path.startsWith(this.e) || !k.a(path) || !k.b(path)) {
/* 177 */       throw new i("Invalid resource path: " + path);
/*     */     }
/*     */     
/* 180 */     return path;
/*     */   }
/*     */   
/*     */   public void d(pc ☃) {
/* 184 */     this.b.remove(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bxm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */