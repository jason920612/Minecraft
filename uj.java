/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipFile;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class uj
/*     */   extends ui
/*     */ {
/*  23 */   public static final Splitter b = Splitter.on('/').omitEmptyStrings().limit(3);
/*     */   private ZipFile c;
/*     */   
/*     */   public uj(File ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */   
/*     */   private ZipFile b() throws IOException {
/*  31 */     if (this.c == null) {
/*  32 */       this.c = new ZipFile(this.a);
/*     */     }
/*     */     
/*  35 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected InputStream a(String ☃) throws IOException {
/*  40 */     ZipFile zipFile = b();
/*  41 */     ZipEntry zipEntry = zipFile.getEntry(☃);
/*     */     
/*  43 */     if (zipEntry == null) {
/*  44 */       throw new un(this.a, ☃);
/*     */     }
/*     */     
/*  47 */     return zipFile.getInputStream(zipEntry);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(String ☃) {
/*     */     try {
/*  53 */       return (b().getEntry(☃) != null);
/*  54 */     } catch (IOException iOException) {
/*  55 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> a(um ☃) {
/*     */     ZipFile zipFile;
/*     */     try {
/*  63 */       zipFile = b();
/*  64 */     } catch (IOException iOException) {
/*  65 */       return Collections.emptySet();
/*     */     } 
/*     */     
/*  68 */     Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
/*     */     
/*  70 */     Set<String> set = Sets.newHashSet();
/*     */     
/*  72 */     while (enumeration.hasMoreElements()) {
/*  73 */       ZipEntry zipEntry = enumeration.nextElement();
/*     */       
/*  75 */       String str = zipEntry.getName();
/*  76 */       if (str.startsWith(☃.a() + "/")) {
/*  77 */         List<String> list = Lists.newArrayList(b.split(str));
/*  78 */         if (list.size() > 1) {
/*  79 */           String str1 = list.get(1);
/*  80 */           if (str1.equals(str1.toLowerCase(Locale.ROOT))) {
/*  81 */             set.add(str1); continue;
/*     */           } 
/*  83 */           d(str1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  89 */     return set;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/*  95 */     close();
/*  96 */     super.finalize();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 101 */     if (this.c != null) {
/* 102 */       IOUtils.closeQuietly(this.c);
/* 103 */       this.c = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<pc> a(um ☃, String str, int i, Predicate<String> predicate) {
/*     */     ZipFile zipFile;
/*     */     try {
/* 111 */       zipFile = b();
/* 112 */     } catch (IOException iOException) {
/* 113 */       return Collections.emptySet();
/*     */     } 
/* 115 */     Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
/* 116 */     List<pc> list = Lists.newArrayList();
/* 117 */     String str1 = ☃.a() + "/";
/*     */     
/* 119 */     while (enumeration.hasMoreElements()) {
/* 120 */       ZipEntry zipEntry = enumeration.nextElement();
/* 121 */       if (zipEntry.isDirectory() || !zipEntry.getName().startsWith(str1)) {
/*     */         continue;
/*     */       }
/*     */       
/* 125 */       String str2 = zipEntry.getName().substring(str1.length());
/* 126 */       if (str2.endsWith(".mcmeta")) {
/*     */         continue;
/*     */       }
/*     */       
/* 130 */       int j = str2.indexOf('/');
/* 131 */       if (j < 0) {
/*     */         continue;
/*     */       }
/* 134 */       String str3 = str2.substring(j + 1);
/* 135 */       if (str3.startsWith(str + "/")) {
/* 136 */         String[] arrayOfString = str3.substring(str.length() + 2).split("/");
/* 137 */         if (arrayOfString.length >= i + 1 && predicate.test(str3)) {
/* 138 */           String str4 = str2.substring(0, j);
/* 139 */           list.add(new pc(str4, str3));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 144 */     return list;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar\\uj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */