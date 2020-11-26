/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.Properties;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ps
/*     */ {
/*  13 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  15 */   private final Properties b = new Properties();
/*     */   private final File c;
/*     */   
/*     */   public ps(File ☃) {
/*  19 */     this.c = ☃;
/*     */     
/*  21 */     if (☃.exists()) {
/*  22 */       FileInputStream fileInputStream = null;
/*     */       try {
/*  24 */         fileInputStream = new FileInputStream(☃);
/*  25 */         this.b.load(fileInputStream);
/*  26 */       } catch (Exception exception) {
/*  27 */         a.warn("Failed to load {}", ☃, exception);
/*  28 */         a();
/*     */       } finally {
/*  30 */         if (fileInputStream != null) {
/*     */           try {
/*  32 */             fileInputStream.close();
/*  33 */           } catch (IOException iOException) {}
/*     */         }
/*     */       } 
/*     */     } else {
/*     */       
/*  38 */       a.warn("{} does not exist", ☃);
/*  39 */       a();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/*  44 */     a.info("Generating new properties file");
/*  45 */     b();
/*     */   }
/*     */   
/*     */   public void b() {
/*  49 */     FileOutputStream ☃ = null;
/*     */     try {
/*  51 */       ☃ = new FileOutputStream(this.c);
/*  52 */       this.b.store(☃, "Minecraft server properties");
/*  53 */     } catch (Exception exception) {
/*  54 */       a.warn("Failed to save {}", this.c, exception);
/*  55 */       a();
/*     */     } finally {
/*  57 */       if (☃ != null) {
/*     */         try {
/*  59 */           ☃.close();
/*  60 */         } catch (IOException iOException) {}
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public File c() {
/*  67 */     return this.c;
/*     */   }
/*     */   
/*     */   public String a(String ☃, String str1) {
/*  71 */     if (!this.b.containsKey(☃)) {
/*  72 */       this.b.setProperty(☃, str1);
/*  73 */       b();
/*  74 */       b();
/*     */     } 
/*  76 */     return this.b.getProperty(☃, str1);
/*     */   }
/*     */   
/*     */   public int a(String ☃, int i) {
/*     */     try {
/*  81 */       return Integer.parseInt(a(☃, "" + i));
/*  82 */     } catch (Exception exception) {
/*  83 */       this.b.setProperty(☃, "" + i);
/*  84 */       b();
/*  85 */       return i;
/*     */     } 
/*     */   }
/*     */   
/*     */   public long a(String ☃, long l) {
/*     */     try {
/*  91 */       return Long.parseLong(a(☃, "" + l));
/*  92 */     } catch (Exception exception) {
/*  93 */       this.b.setProperty(☃, "" + l);
/*  94 */       b();
/*  95 */       return l;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(String ☃, boolean bool) {
/*     */     try {
/* 101 */       return Boolean.parseBoolean(a(☃, "" + bool));
/* 102 */     } catch (Exception exception) {
/* 103 */       this.b.setProperty(☃, "" + bool);
/* 104 */       b();
/* 105 */       return bool;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃, Object object) {
/* 110 */     this.b.setProperty(☃, "" + object);
/*     */   }
/*     */   
/*     */   public boolean a(String ☃) {
/* 114 */     return this.b.containsKey(☃);
/*     */   }
/*     */   
/*     */   public void b(String ☃) {
/* 118 */     this.b.remove(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */