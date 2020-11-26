/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vc
/*     */   implements vf
/*     */ {
/*  22 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  24 */   protected final List<ul> a = Lists.newArrayList();
/*     */   private final um c;
/*     */   
/*     */   public vc(um ☃) {
/*  28 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ul ☃) {
/*  33 */     this.a.add(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ve a(pc ☃) throws IOException {
/*  43 */     d(☃);
/*     */     
/*  45 */     ul ul = null;
/*  46 */     pc pc1 = c(☃);
/*     */     
/*  48 */     for (int i = this.a.size() - 1; i >= 0; i--) {
/*  49 */       ul ul1 = this.a.get(i);
/*  50 */       if (ul == null && ul1.b(this.c, pc1)) {
/*  51 */         ul = ul1;
/*     */       }
/*     */       
/*  54 */       if (ul1.b(this.c, ☃)) {
/*  55 */         InputStream inputStream = null;
/*  56 */         if (ul != null) {
/*  57 */           inputStream = a(pc1, ul);
/*     */         }
/*  59 */         return new vi(ul1.a(), ☃, a(☃, ul1), inputStream);
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     throw new FileNotFoundException(☃.toString());
/*     */   }
/*     */   
/*     */   protected InputStream a(pc ☃, ul ul1) throws IOException {
/*  67 */     InputStream inputStream = ul1.a(this.c, ☃);
/*  68 */     return b.isDebugEnabled() ? new a(inputStream, ☃, ul1.a()) : inputStream;
/*     */   }
/*     */   
/*     */   private void d(pc ☃) throws IOException {
/*  72 */     if (☃.a().contains(".."))
/*  73 */       throw new IOException("Invalid relative path to resource: " + ☃); 
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends InputStream
/*     */   {
/*     */     private final InputStream a;
/*     */     private final String b;
/*     */     private boolean c;
/*     */     
/*     */     public a(InputStream ☃, pc pc1, String str) {
/*  84 */       this.a = ☃;
/*  85 */       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/*  86 */       (new Exception()).printStackTrace(new PrintStream(byteArrayOutputStream));
/*  87 */       this.b = "Leaked resource: '" + pc1 + "' loaded from pack: '" + str + "'\n" + byteArrayOutputStream;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/*  92 */       this.a.close();
/*     */       
/*  94 */       this.c = true;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void finalize() throws Throwable {
/*  99 */       if (!this.c) {
/* 100 */         vc.b().warn(this.b);
/*     */       }
/*     */       
/* 103 */       super.finalize();
/*     */     }
/*     */ 
/*     */     
/*     */     public int read() throws IOException {
/* 108 */       return this.a.read();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ve> b(pc ☃) throws IOException {
/* 114 */     d(☃);
/*     */     
/* 116 */     List<ve> list = Lists.newArrayList();
/* 117 */     pc pc1 = c(☃);
/*     */     
/* 119 */     for (ul ul : this.a) {
/* 120 */       if (ul.b(this.c, ☃)) {
/* 121 */         InputStream inputStream = ul.b(this.c, pc1) ? a(pc1, ul) : null;
/* 122 */         list.add(new vi(ul.a(), ☃, a(☃, ul), inputStream));
/*     */       } 
/*     */     } 
/*     */     
/* 126 */     if (list.isEmpty()) {
/* 127 */       throw new FileNotFoundException(☃.toString());
/*     */     }
/*     */     
/* 130 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<pc> a(String ☃, Predicate<String> predicate) {
/* 135 */     List<pc> list = Lists.newArrayList();
/*     */     
/* 137 */     for (ul ul : this.a) {
/* 138 */       list.addAll(ul.a(this.c, ☃, 2147483647, predicate));
/*     */     }
/*     */     
/* 141 */     Collections.sort(list);
/*     */     
/* 143 */     return list;
/*     */   }
/*     */   
/*     */   static pc c(pc ☃) {
/* 147 */     return new pc(☃.b(), ☃.a() + ".mcmeta");
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\vc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */