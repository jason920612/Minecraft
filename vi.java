/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.concurrent.Executors;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class vi
/*     */   implements ve
/*     */ {
/*  23 */   private static final Logger b = LogManager.getLogger();
/*  24 */   public static final Executor a = Executors.newSingleThreadExecutor((new ThreadFactoryBuilder()).setDaemon(true).setNameFormat("Resource IO {0}").setUncaughtExceptionHandler(new e(b)).build());
/*     */   
/*     */   private final String c;
/*     */   
/*     */   private final pc d;
/*     */   
/*     */   private final InputStream e;
/*     */   private final InputStream f;
/*     */   
/*     */   public vi(String ☃, pc pc1, InputStream inputStream1, @Nullable InputStream inputStream2) {
/*  34 */     this.c = ☃;
/*  35 */     this.d = pc1;
/*  36 */     this.e = inputStream1;
/*  37 */     this.f = inputStream2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InputStream b() {
/*  47 */     return this.e;
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
/*     */   public String d() {
/*  86 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  91 */     if (this == ☃) {
/*  92 */       return true;
/*     */     }
/*  94 */     if (!(☃ instanceof vi)) {
/*  95 */       return false;
/*     */     }
/*     */     
/*  98 */     vi vi1 = (vi)☃;
/*     */     
/* 100 */     if ((this.d != null) ? !this.d.equals(vi1.d) : (vi1.d != null)) {
/* 101 */       return false;
/*     */     }
/* 103 */     if ((this.c != null) ? !this.c.equals(vi1.c) : (vi1.c != null)) {
/* 104 */       return false;
/*     */     }
/*     */     
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 112 */     int ☃ = (this.c != null) ? this.c.hashCode() : 0;
/* 113 */     ☃ = 31 * ☃ + ((this.d != null) ? this.d.hashCode() : 0);
/* 114 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 119 */     this.e.close();
/* 120 */     if (this.f != null)
/* 121 */       this.f.close(); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\vi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */