/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
/*     */ import java.nio.file.FileSystem;
/*     */ import java.nio.file.FileSystems;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class uo
/*     */   implements ul
/*     */ {
/*     */   public static Path a;
/*  37 */   private static final Logger d = LogManager.getLogger();
/*     */   
/*     */   public static Class<?> b;
/*     */   public final Set<String> c;
/*     */   
/*     */   public uo(String... ☃) {
/*  43 */     this.c = (Set<String>)ImmutableSet.copyOf((Object[])☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream b(String ☃) throws IOException {
/*  48 */     if (☃.contains("/") || ☃.contains("\\")) {
/*  49 */       throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
/*     */     }
/*  51 */     if (a != null) {
/*  52 */       Path path = a.resolve(☃);
/*  53 */       if (Files.exists(path, new java.nio.file.LinkOption[0])) {
/*  54 */         return Files.newInputStream(path, new java.nio.file.OpenOption[0]);
/*     */       }
/*     */     } 
/*  57 */     return a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream a(um ☃, pc pc1) throws IOException {
/*  62 */     InputStream inputStream = c(☃, pc1);
/*  63 */     if (inputStream != null) {
/*  64 */       return inputStream;
/*     */     }
/*  66 */     throw new FileNotFoundException(pc1.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<pc> a(um ☃, String str, int i, Predicate<String> predicate) {
/*  71 */     Set<pc> set = Sets.newHashSet();
/*     */     
/*  73 */     if (a != null) {
/*     */       try {
/*  75 */         set.addAll(a(i, "minecraft", a.resolve(☃.a()).resolve("minecraft"), str, predicate));
/*  76 */       } catch (IOException iOException) {}
/*     */ 
/*     */ 
/*     */       
/*  80 */       if (☃ == um.a) {
/*  81 */         Enumeration<URL> enumeration = null;
/*     */         try {
/*  83 */           enumeration = b.getClassLoader().getResources(☃.a() + "/minecraft");
/*  84 */         } catch (IOException iOException) {}
/*     */         
/*  86 */         while (enumeration != null && enumeration.hasMoreElements()) {
/*     */           try {
/*  88 */             URI uRI = ((URL)enumeration.nextElement()).toURI();
/*  89 */             if ("file".equals(uRI.getScheme())) {
/*  90 */               set.addAll(a(i, "minecraft", Paths.get(uRI), str, predicate));
/*     */             }
/*  92 */           } catch (URISyntaxException|IOException uRISyntaxException) {}
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     try { URL uRL = uo.class.getResource("/" + ☃.a() + "/.mcassetsroot");
/* 101 */       if (uRL == null) {
/* 102 */         d.error("Couldn't find .mcassetsroot, cannot load vanilla resources");
/* 103 */         return set;
/*     */       } 
/* 105 */       URI uRI = uRL.toURI();
/* 106 */       if ("file".equals(uRI.getScheme())) {
/* 107 */         URL uRL1 = new URL(uRL.toString().substring(0, uRL.toString().length() - ".mcassetsroot".length()) + "minecraft");
/* 108 */         if (uRL1 == null) {
/* 109 */           return set;
/*     */         }
/* 111 */         Path path = Paths.get(uRL1.toURI());
/* 112 */         set.addAll(a(i, "minecraft", path, str, predicate));
/* 113 */       } else if ("jar".equals(uRI.getScheme())) {
/* 114 */         try (FileSystem ☃ = FileSystems.newFileSystem(uRI, Collections.emptyMap())) {
/* 115 */           Path path = fileSystem.getPath("/" + ☃.a() + "/minecraft", new String[0]);
/* 116 */           set.addAll(a(i, "minecraft", path, str, predicate));
/*     */         } 
/*     */       } else {
/* 119 */         d.error("Unsupported scheme {} trying to list vanilla resources (NYI?)", uRI);
/*     */       }  }
/* 121 */     catch (FileNotFoundException|java.nio.file.NoSuchFileException fileNotFoundException) {  }
/* 122 */     catch (URISyntaxException|IOException exception)
/* 123 */     { d.error("Couldn't get a list of all vanilla resources", exception); }
/*     */ 
/*     */     
/* 126 */     return set;
/*     */   }
/*     */   
/*     */   private Collection<pc> a(int ☃, String str1, Path path, String str2, Predicate<String> predicate) throws IOException {
/* 130 */     List<pc> list = Lists.newArrayList();
/* 131 */     for (Iterator<Path> iterator = Files.walk(path.resolve(str2), ☃, new java.nio.file.FileVisitOption[0]).iterator(); iterator.hasNext(); ) {
/* 132 */       Path path1 = iterator.next();
/*     */       
/* 134 */       if (!path1.endsWith(".mcmeta") && Files.isRegularFile(path1, new java.nio.file.LinkOption[0]) && predicate.test(path1.getFileName().toString())) {
/* 135 */         list.add(new pc(str1, path.relativize(path1).toString().replaceAll("\\\\", "/")));
/*     */       }
/*     */     } 
/* 138 */     return list;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected InputStream c(um ☃, pc pc1) {
/* 143 */     String str = "/" + ☃.a() + "/" + pc1.b() + "/" + pc1.a();
/*     */     
/* 145 */     if (a != null) {
/* 146 */       Path path = a.resolve(☃.a() + "/" + pc1.b() + "/" + pc1.a());
/* 147 */       if (Files.exists(path, new java.nio.file.LinkOption[0])) {
/*     */         try {
/* 149 */           return Files.newInputStream(path, new java.nio.file.OpenOption[0]);
/* 150 */         } catch (IOException iOException) {}
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 156 */       URL uRL = uo.class.getResource(str);
/* 157 */       if (uRL != null && uk.a(new File(uRL.getFile()), str)) {
/* 158 */         return uo.class.getResourceAsStream(str);
/*     */       }
/* 160 */     } catch (IOException iOException) {
/* 161 */       return uo.class.getResourceAsStream(str);
/*     */     } 
/*     */     
/* 164 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected InputStream a(String ☃) {
/* 169 */     return uo.class.getResourceAsStream("/" + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(um ☃, pc pc1) {
/* 174 */     InputStream inputStream = c(☃, pc1);
/* 175 */     boolean bool = (inputStream != null);
/* 176 */     IOUtils.closeQuietly(inputStream);
/* 177 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> a(um ☃) {
/* 182 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <T> T a(up<T> ☃) throws IOException {
/* 188 */     try (InputStream ☃ = b("pack.mcmeta")) {
/* 189 */       return (T)ui.a((up)☃, inputStream);
/* 190 */     } catch (RuntimeException|FileNotFoundException exception) {
/* 191 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 197 */     return "Default";
/*     */   }
/*     */   
/*     */   public void close() {}
/*     */ }


/* Location:              F:\dw\server.jar\\uo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */