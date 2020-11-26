/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.net.DatagramSocket;
/*     */ import java.net.ServerSocket;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class wd
/*     */   implements Runnable
/*     */ {
/*  16 */   private static final Logger h = LogManager.getLogger();
/*  17 */   private static final AtomicInteger i = new AtomicInteger(0);
/*     */   protected boolean a;
/*     */   protected pq b;
/*     */   protected final String c;
/*     */   protected Thread d;
/*  22 */   protected int e = 5;
/*  23 */   protected List<DatagramSocket> f = Lists.newArrayList();
/*  24 */   protected List<ServerSocket> g = Lists.newArrayList();
/*     */   
/*     */   protected wd(pq ☃, String str) {
/*  27 */     this.b = ☃;
/*  28 */     this.c = str;
/*  29 */     if (this.b.C()) {
/*  30 */       c("Debugging is enabled, performance maybe reduced!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void a() {
/*  38 */     this.d = new Thread(this, this.c + " #" + i.incrementAndGet());
/*  39 */     this.d.setUncaughtExceptionHandler(new f(h));
/*  40 */     this.d.start();
/*  41 */     this.a = true;
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
/*     */   public boolean c() {
/*  80 */     return this.a;
/*     */   }
/*     */   
/*     */   protected void a(String ☃) {
/*  84 */     this.b.g(☃);
/*     */   }
/*     */   
/*     */   protected void b(String ☃) {
/*  88 */     this.b.d(☃);
/*     */   }
/*     */   
/*     */   protected void c(String ☃) {
/*  92 */     this.b.e(☃);
/*     */   }
/*     */   
/*     */   protected void d(String ☃) {
/*  96 */     this.b.f(☃);
/*     */   }
/*     */   
/*     */   protected int d() {
/* 100 */     return this.b.y();
/*     */   }
/*     */   
/*     */   protected void a(DatagramSocket ☃) {
/* 104 */     a("registerSocket: " + ☃);
/* 105 */     this.f.add(☃);
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
/*     */   protected boolean a(DatagramSocket ☃, boolean bool) {
/* 118 */     a("closeSocket: " + ☃);
/* 119 */     if (null == ☃) {
/* 120 */       return false;
/*     */     }
/*     */     
/* 123 */     boolean bool1 = false;
/* 124 */     if (!☃.isClosed()) {
/* 125 */       ☃.close();
/* 126 */       bool1 = true;
/*     */     } 
/*     */     
/* 129 */     if (bool) {
/* 130 */       this.f.remove(☃);
/*     */     }
/*     */     
/* 133 */     return bool1;
/*     */   }
/*     */   
/*     */   protected boolean b(ServerSocket ☃) {
/* 137 */     return a(☃, true);
/*     */   }
/*     */   
/*     */   protected boolean a(ServerSocket ☃, boolean bool) {
/* 141 */     a("closeSocket: " + ☃);
/* 142 */     if (null == ☃) {
/* 143 */       return false;
/*     */     }
/*     */     
/* 146 */     boolean bool1 = false;
/*     */     try {
/* 148 */       if (!☃.isClosed()) {
/* 149 */         ☃.close();
/* 150 */         bool1 = true;
/*     */       } 
/* 152 */     } catch (IOException iOException) {
/* 153 */       c("IO: " + iOException.getMessage());
/*     */     } 
/*     */     
/* 156 */     if (bool) {
/* 157 */       this.g.remove(☃);
/*     */     }
/*     */     
/* 160 */     return bool1;
/*     */   }
/*     */   
/*     */   protected void e() {
/* 164 */     a(false);
/*     */   }
/*     */   
/*     */   protected void a(boolean ☃) {
/* 168 */     int i = 0;
/* 169 */     for (DatagramSocket datagramSocket : this.f) {
/* 170 */       if (a(datagramSocket, false)) {
/* 171 */         i++;
/*     */       }
/*     */     } 
/* 174 */     this.f.clear();
/*     */     
/* 176 */     for (ServerSocket serverSocket : this.g) {
/* 177 */       if (a(serverSocket, false)) {
/* 178 */         i++;
/*     */       }
/*     */     } 
/* 181 */     this.g.clear();
/*     */     
/* 183 */     if (☃ && 0 < i)
/* 184 */       c("Force closed " + i + " sockets"); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */