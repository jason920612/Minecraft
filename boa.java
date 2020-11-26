/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class boa
/*     */ {
/*  43 */   private static final Map<File, bnz> a = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized bnz a(File ☃, int i, int j) {
/*  49 */     File file1 = new File(☃, "region");
/*  50 */     File file2 = new File(file1, "r." + (i >> 5) + "." + (j >> 5) + ".mca");
/*     */     
/*  52 */     bnz bnz1 = a.get(file2);
/*  53 */     if (bnz1 != null) {
/*  54 */       return bnz1;
/*     */     }
/*     */     
/*  57 */     if (!file1.exists()) {
/*  58 */       file1.mkdirs();
/*     */     }
/*     */     
/*  61 */     if (a.size() >= 256) {
/*  62 */       a();
/*     */     }
/*     */     
/*  65 */     bnz bnz2 = new bnz(file2);
/*  66 */     a.put(file2, bnz2);
/*  67 */     return bnz2;
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
/*     */   public static synchronized void a() {
/*  93 */     for (bnz ☃ : a.values()) {
/*     */       try {
/*  95 */         if (☃ != null) {
/*  96 */           ☃.c();
/*     */         }
/*  98 */       } catch (IOException iOException) {
/*  99 */         iOException.printStackTrace();
/*     */       } 
/*     */     } 
/* 102 */     a.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static DataInputStream d(File ☃, int i, int j) {
/* 112 */     bnz bnz = a(☃, i, j);
/* 113 */     return bnz.a(i & 0x1F, j & 0x1F);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static DataOutputStream e(File ☃, int i, int j) {
/* 118 */     bnz bnz = a(☃, i, j);
/* 119 */     return bnz.c(i & 0x1F, j & 0x1F);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\boa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */