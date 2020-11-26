/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cbw
/*     */   extends cca
/*     */ {
/*  40 */   private static final Logger e = LogManager.getLogger();
/*     */   
/*     */   public cbw(Path ☃, Path path1, DataFixer dataFixer) {
/*  43 */     super(☃, path1, dataFixer);
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
/*     */   protected int c() {
/*  83 */     return 19133;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ccc a(String ☃, @Nullable MinecraftServer minecraftServer) {
/*  93 */     return new cbv(this.a.toFile(), ☃, minecraftServer, this.c);
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
/*     */   public boolean b(String ☃) {
/* 105 */     ccb ccb = c(☃);
/* 106 */     return (ccb != null && ccb.k() != c());
/*     */   }
/*     */   
/*     */   public boolean a(String ☃, xs xs1) {
/*     */     ayw ayw;
/* 111 */     xs1.a(0);
/*     */     
/* 113 */     List<File> list1 = Lists.newArrayList();
/* 114 */     List<File> list2 = Lists.newArrayList();
/* 115 */     List<File> list3 = Lists.newArrayList();
/* 116 */     File file1 = new File(this.a.toFile(), ☃);
/* 117 */     File file2 = bod.b.a(file1);
/* 118 */     File file3 = bod.c.a(file1);
/*     */     
/* 120 */     e.info("Scanning folders...");
/*     */ 
/*     */     
/* 123 */     a(file1, list1);
/*     */ 
/*     */     
/* 126 */     if (file2.exists()) {
/* 127 */       a(file2, list2);
/*     */     }
/* 129 */     if (file3.exists()) {
/* 130 */       a(file3, list3);
/*     */     }
/*     */     
/* 133 */     int i = list1.size() + list2.size() + list3.size();
/* 134 */     e.info("Total conversion count is {}", Integer.valueOf(i));
/*     */     
/* 136 */     ccb ccb = c(☃);
/*     */ 
/*     */     
/* 139 */     ayy<azu, azt> ayy = ayy.b;
/* 140 */     ayy<bav, bau> ayy1 = ayy.c;
/*     */     
/* 142 */     if (ccb != null && ccb.t() == ayg.c) {
/* 143 */       ayw = ayy.a(((azu)ayy.b()).a(ayz.c));
/*     */     } else {
/* 145 */       ayw = ayy1.a(((bav)ayy1.b()).a(ccb).a(bnb.a.b()));
/*     */     } 
/*     */ 
/*     */     
/* 149 */     a(new File(file1, "region"), list1, ayw, 0, i, xs1);
/*     */     
/* 151 */     a(new File(file2, "region"), list2, ayy.a(((azu)ayy.b()).a(ayz.j)), list1.size(), i, xs1);
/*     */     
/* 153 */     a(new File(file3, "region"), list3, ayy.a(((azu)ayy.b()).a(ayz.k)), list1.size() + list2.size(), i, xs1);
/*     */     
/* 155 */     ccb.d(19133);
/* 156 */     if (ccb.t() == ayg.i) {
/* 157 */       ccb.a(ayg.b);
/*     */     }
/*     */     
/* 160 */     i(☃);
/*     */     
/* 162 */     ccc ccc = a(☃, (MinecraftServer)null);
/* 163 */     ccc.a(ccb);
/*     */     
/* 165 */     return true;
/*     */   }
/*     */   
/*     */   private void i(String ☃) {
/* 169 */     File file1 = new File(this.a.toFile(), ☃);
/* 170 */     if (!file1.exists()) {
/* 171 */       e.warn("Unable to create level.dat_mcr backup");
/*     */       
/*     */       return;
/*     */     } 
/* 175 */     File file2 = new File(file1, "level.dat");
/* 176 */     if (!file2.exists()) {
/* 177 */       e.warn("Unable to create level.dat_mcr backup");
/*     */       
/*     */       return;
/*     */     } 
/* 181 */     File file3 = new File(file1, "level.dat_mcr");
/* 182 */     if (!file2.renameTo(file3)) {
/* 183 */       e.warn("Unable to create level.dat_mcr backup");
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(File ☃, Iterable<File> iterable, ayw ayw1, int i, int j, xs xs1) {
/* 188 */     for (File file : iterable) {
/* 189 */       a(☃, file, ayw1, i, j, xs1);
/*     */       
/* 191 */       i++;
/* 192 */       int k = (int)Math.round(100.0D * i / j);
/* 193 */       xs1.a(k);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(File ☃, File file1, ayw ayw1, int i, int j, xs xs1) {
/*     */     try {
/* 199 */       String str = file1.getName();
/*     */       
/* 201 */       bnz bnz1 = new bnz(file1);
/* 202 */       bnz bnz2 = new bnz(new File(☃, str.substring(0, str.length() - ".mcr".length()) + ".mca"));
/*     */       
/* 204 */       for (int k = 0; k < 32; k++) {
/* 205 */         int m; for (m = 0; m < 32; m++) {
/* 206 */           if (bnz1.d(k, m) && !bnz2.d(k, m)) {
/* 207 */             DataInputStream dataInputStream = bnz1.a(k, m);
/* 208 */             if (dataInputStream == null) {
/* 209 */               e.warn("Failed to fetch input stream");
/*     */             } else {
/*     */               
/* 212 */               gy gy1 = hi.a(dataInputStream);
/* 213 */               dataInputStream.close();
/*     */               
/* 215 */               gy gy2 = gy1.p("Level");
/* 216 */               bny.a a = bny.a(gy2);
/*     */               
/* 218 */               gy gy3 = new gy();
/* 219 */               gy gy4 = new gy();
/* 220 */               gy3.a("Level", gy4);
/* 221 */               bny.a(a, gy4, ayw1);
/*     */               
/* 223 */               DataOutputStream dataOutputStream = bnz2.c(k, m);
/* 224 */               hi.a(gy3, dataOutputStream);
/* 225 */               dataOutputStream.close();
/*     */             } 
/*     */           } 
/* 228 */         }  m = (int)Math.round(100.0D * (i * 1024) / (j * 1024));
/* 229 */         int n = (int)Math.round(100.0D * ((k + 1) * 32 + i * 1024) / (j * 1024));
/* 230 */         if (n > m) {
/* 231 */           xs1.a(n);
/*     */         }
/*     */       } 
/*     */       
/* 235 */       bnz1.c();
/* 236 */       bnz2.c();
/* 237 */     } catch (IOException iOException) {
/* 238 */       iOException.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(File ☃, Collection<File> collection) {
/* 243 */     File file = new File(☃, "region");
/* 244 */     File[] arrayOfFile = file.listFiles((☃, str) -> str.endsWith(".mcr"));
/*     */     
/* 246 */     if (arrayOfFile != null)
/* 247 */       Collections.addAll(collection, arrayOfFile); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */