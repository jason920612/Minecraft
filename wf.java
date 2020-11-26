/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketTimeoutException;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wf
/*     */   extends wd
/*     */ {
/*  16 */   private static final Logger h = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private boolean i;
/*     */ 
/*     */   
/*     */   private Socket j;
/*     */   
/*  24 */   private final byte[] k = new byte[1460];
/*     */   private final String l;
/*     */   
/*     */   wf(pq ☃, Socket socket) {
/*  28 */     super(☃, "RCON Client");
/*  29 */     this.j = socket;
/*     */     
/*     */     try {
/*  32 */       this.j.setSoTimeout(0);
/*  33 */     } catch (Exception exception) {
/*  34 */       this.a = false;
/*     */     } 
/*     */     
/*  37 */     this.l = ☃.a("rcon.password", "");
/*  38 */     b("Rcon connection from: " + socket.getInetAddress());
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     
/*  44 */     try { while (this.a) {
/*  45 */         String str; BufferedInputStream ☃ = new BufferedInputStream(this.j.getInputStream());
/*  46 */         int i = ☃.read(this.k, 0, 1460);
/*     */         
/*  48 */         if (10 > i) {
/*     */           return;
/*     */         }
/*     */         
/*  52 */         int j = 0;
/*  53 */         int k = wa.b(this.k, 0, i);
/*  54 */         if (k != i - 4) {
/*     */           return;
/*     */         }
/*     */         
/*  58 */         j += 4;
/*  59 */         int m = wa.b(this.k, j, i);
/*  60 */         j += 4;
/*     */         
/*  62 */         int n = wa.a(this.k, j);
/*  63 */         j += 4;
/*  64 */         switch (n) {
/*     */           case 3:
/*  66 */             str = wa.a(this.k, j, i);
/*  67 */             j += str.length();
/*  68 */             if (!str.isEmpty() && str.equals(this.l)) {
/*  69 */               this.i = true;
/*  70 */               a(m, 2, ""); continue;
/*     */             } 
/*  72 */             this.i = false;
/*  73 */             f();
/*     */             continue;
/*     */           
/*     */           case 2:
/*  77 */             if (this.i) {
/*  78 */               String str1 = wa.a(this.k, j, i);
/*     */               try {
/*  80 */                 a(m, this.b.a_(str1));
/*  81 */               } catch (Exception exception) {
/*  82 */                 a(m, "Error executing: " + str1 + " (" + exception.getMessage() + ")");
/*     */               }  continue;
/*     */             } 
/*  85 */             f();
/*     */             continue;
/*     */         } 
/*     */         
/*  89 */         a(m, String.format("Unknown request %s", new Object[] { Integer.toHexString(n) }));
/*     */       }
/*     */        }
/*  92 */     catch (SocketTimeoutException socketTimeoutException) {  }
/*  93 */     catch (IOException iOException) {  }
/*  94 */     catch (Exception ☃)
/*  95 */     { h.error("Exception whilst parsing RCON input", ☃); }
/*     */     finally
/*  97 */     { g(); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int ☃, int i, String str) throws IOException {
/* 104 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1248);
/* 105 */     DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
/* 106 */     byte[] arrayOfByte = str.getBytes("UTF-8");
/* 107 */     dataOutputStream.writeInt(Integer.reverseBytes(arrayOfByte.length + 10));
/* 108 */     dataOutputStream.writeInt(Integer.reverseBytes(☃));
/* 109 */     dataOutputStream.writeInt(Integer.reverseBytes(i));
/* 110 */     dataOutputStream.write(arrayOfByte);
/* 111 */     dataOutputStream.write(0);
/* 112 */     dataOutputStream.write(0);
/* 113 */     this.j.getOutputStream().write(byteArrayOutputStream.toByteArray());
/*     */   }
/*     */   
/*     */   private void f() throws IOException {
/* 117 */     a(-1, 2, "");
/*     */   }
/*     */   
/*     */   private void a(int ☃, String str) throws IOException {
/* 121 */     int i = str.length();
/*     */     
/*     */     do {
/* 124 */       int j = (4096 <= i) ? 4096 : i;
/* 125 */       a(☃, 0, str.substring(0, j));
/* 126 */       str = str.substring(j);
/* 127 */       i = str.length();
/* 128 */     } while (0 != i);
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
/*     */   private void g() {
/* 141 */     if (null == this.j) {
/*     */       return;
/*     */     }
/*     */     
/*     */     try {
/* 146 */       this.j.close();
/* 147 */     } catch (IOException ☃) {
/* 148 */       c("IO: " + ☃.getMessage());
/*     */     } 
/* 150 */     this.j = null;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */