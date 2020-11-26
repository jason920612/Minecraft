/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
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
/*     */ class a
/*     */   extends InputStream
/*     */ {
/*     */   private final InputStream a;
/*     */   private final String b;
/*     */   private boolean c;
/*     */   
/*     */   public a(InputStream ☃, pc pc1, String str) {
/*  84 */     this.a = ☃;
/*  85 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/*  86 */     (new Exception()).printStackTrace(new PrintStream(byteArrayOutputStream));
/*  87 */     this.b = "Leaked resource: '" + pc1 + "' loaded from pack: '" + str + "'\n" + byteArrayOutputStream;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/*  92 */     this.a.close();
/*     */     
/*  94 */     this.c = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/*  99 */     if (!this.c) {
/* 100 */       vc.b().warn(this.b);
/*     */     }
/*     */     
/* 103 */     super.finalize();
/*     */   }
/*     */ 
/*     */   
/*     */   public int read() throws IOException {
/* 108 */     return this.a.read();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\vc$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */