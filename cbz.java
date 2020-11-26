/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixTypes;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
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
/*     */ public class cbz
/*     */   implements ccc, cci
/*     */ {
/*  30 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final File c;
/*     */   
/*     */   private final File d;
/*  35 */   private final long e = k.b();
/*     */   private final String f;
/*     */   private final bxm g;
/*     */   protected final DataFixer a;
/*     */   
/*     */   public cbz(File ☃, String str, @Nullable MinecraftServer minecraftServer, DataFixer dataFixer) {
/*  41 */     this.a = dataFixer;
/*  42 */     this.c = new File(☃, str);
/*  43 */     this.c.mkdirs();
/*  44 */     this.d = new File(this.c, "playerdata");
/*  45 */     this.f = str;
/*     */     
/*  47 */     if (minecraftServer != null) {
/*  48 */       this.d.mkdirs();
/*  49 */       this.g = new bxm(minecraftServer, this.c, dataFixer);
/*     */     } else {
/*  51 */       this.g = null;
/*     */     } 
/*     */     
/*  54 */     j();
/*     */   }
/*     */   
/*     */   private void j() {
/*     */     try {
/*  59 */       File ☃ = new File(this.c, "session.lock");
/*  60 */       DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(☃));
/*     */       try {
/*  62 */         dataOutputStream.writeLong(this.e);
/*     */       } finally {
/*  64 */         dataOutputStream.close();
/*     */       } 
/*  66 */     } catch (IOException ☃) {
/*  67 */       ☃.printStackTrace();
/*  68 */       throw new RuntimeException("Failed to check session lock, aborting");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public File b() {
/*  74 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() throws aya {
/*     */     try {
/*  80 */       File ☃ = new File(this.c, "session.lock");
/*  81 */       DataInputStream dataInputStream = new DataInputStream(new FileInputStream(☃));
/*     */       try {
/*  83 */         if (dataInputStream.readLong() != this.e) {
/*  84 */           throw new aya("The save is being accessed from another location, aborting");
/*     */         }
/*     */       } finally {
/*  87 */         dataInputStream.close();
/*     */       } 
/*  89 */     } catch (IOException ☃) {
/*  90 */       throw new aya("Failed to check session lock, aborting");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bnw a(boc ☃) {
/*  96 */     throw new RuntimeException("Old Chunk Storage is no longer supported.");
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccb d() {
/* 102 */     File ☃ = new File(this.c, "level.dat");
/* 103 */     if (☃.exists()) {
/* 104 */       ccb ccb = cca.a(☃, this.a);
/* 105 */       if (ccb != null) {
/* 106 */         return ccb;
/*     */       }
/*     */     } 
/* 109 */     ☃ = new File(this.c, "level.dat_old");
/* 110 */     if (☃.exists()) {
/* 111 */       return cca.a(☃, this.a);
/*     */     }
/* 113 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ccb ☃, @Nullable gy gy1) {
/* 118 */     gy gy2 = ☃.a(gy1);
/*     */     
/* 120 */     gy gy3 = new gy();
/* 121 */     gy3.a("Data", gy2);
/*     */     
/*     */     try {
/* 124 */       File file1 = new File(this.c, "level.dat_new");
/* 125 */       File file2 = new File(this.c, "level.dat_old");
/* 126 */       File file3 = new File(this.c, "level.dat");
/*     */       
/* 128 */       hi.a(gy3, new FileOutputStream(file1));
/*     */       
/* 130 */       if (file2.exists()) {
/* 131 */         file2.delete();
/*     */       }
/* 133 */       file3.renameTo(file2);
/* 134 */       if (file3.exists()) {
/* 135 */         file3.delete();
/*     */       }
/* 137 */       file1.renameTo(file3);
/* 138 */       if (file1.exists()) {
/* 139 */         file1.delete();
/*     */       }
/* 141 */     } catch (Exception exception) {
/* 142 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ccb ☃) {
/* 148 */     a(☃, (gy)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aog ☃) {
/*     */     try {
/* 154 */       gy gy = ☃.e(new gy());
/* 155 */       File file1 = new File(this.d, ☃.bu() + ".dat.tmp");
/* 156 */       File file2 = new File(this.d, ☃.bu() + ".dat");
/* 157 */       hi.a(gy, new FileOutputStream(file1));
/* 158 */       if (file2.exists()) {
/* 159 */         file2.delete();
/*     */       }
/* 161 */       file1.renameTo(file2);
/* 162 */     } catch (Exception exception) {
/* 163 */       b.warn("Failed to save player data for {}", ☃.N_().getString());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public gy b(aog ☃) {
/* 170 */     gy gy = null;
/*     */     try {
/* 172 */       File file = new File(this.d, ☃.bu() + ".dat");
/* 173 */       if (file.exists() && file.isFile()) {
/* 174 */         gy = hi.a(new FileInputStream(file));
/*     */       }
/* 176 */     } catch (Exception exception) {
/* 177 */       b.warn("Failed to load player data for {}", ☃.N_().getString());
/*     */     } 
/* 179 */     if (gy != null) {
/* 180 */       int i = gy.c("DataVersion", 3) ? gy.h("DataVersion") : -1;
/* 181 */       ☃.f(hk.a(this.a, (DSL.TypeReference)DataFixTypes.PLAYER, gy, i));
/*     */     } 
/* 183 */     return gy;
/*     */   }
/*     */ 
/*     */   
/*     */   public cci e() {
/* 188 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public String[] f() {
/* 193 */     String[] ☃ = this.d.list();
/* 194 */     if (☃ == null) {
/* 195 */       ☃ = new String[0];
/*     */     }
/*     */     
/* 198 */     for (int i = 0; i < ☃.length; i++) {
/* 199 */       if (☃[i].endsWith(".dat")) {
/* 200 */         ☃[i] = ☃[i].substring(0, ☃[i].length() - 4);
/*     */       }
/*     */     } 
/*     */     
/* 204 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */ 
/*     */   
/*     */   public File a(bod ☃, String str) {
/* 213 */     File file = new File(☃.a(this.c), "data");
/* 214 */     file.mkdirs();
/* 215 */     return new File(file, str + ".dat");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bxm h() {
/* 225 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public DataFixer i() {
/* 230 */     return this.a;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */