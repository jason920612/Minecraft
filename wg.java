/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketAddress;
/*     */ import java.net.SocketTimeoutException;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wg
/*     */   extends wd
/*     */ {
/*     */   private int h;
/*     */   private final int i;
/*     */   private String j;
/*     */   private ServerSocket k;
/*     */   private final String l;
/*     */   private Map<SocketAddress, wf> m;
/*     */   
/*     */   public wg(pq ☃) {
/*  24 */     super(☃, "RCON Listener");
/*  25 */     this.h = ☃.a("rcon.port", 0);
/*  26 */     this.l = ☃.a("rcon.password", "");
/*  27 */     this.j = ☃.e();
/*  28 */     this.i = ☃.e_();
/*  29 */     if (0 == this.h) {
/*     */       
/*  31 */       this.h = this.i + 10;
/*  32 */       b("Setting default rcon port to " + this.h);
/*  33 */       ☃.a("rcon.port", Integer.valueOf(this.h));
/*  34 */       if (this.l.isEmpty()) {
/*  35 */         ☃.a("rcon.password", "");
/*     */       }
/*  37 */       ☃.c_();
/*     */     } 
/*     */     
/*  40 */     if (this.j.isEmpty()) {
/*  41 */       this.j = "0.0.0.0";
/*     */     }
/*     */     
/*  44 */     f();
/*  45 */     this.k = null;
/*     */   }
/*     */   
/*     */   private void f() {
/*  49 */     this.m = Maps.newHashMap();
/*     */   }
/*     */   
/*     */   private void g() {
/*  53 */     Iterator<Map.Entry<SocketAddress, wf>> ☃ = this.m.entrySet().iterator();
/*  54 */     while (☃.hasNext()) {
/*  55 */       Map.Entry<SocketAddress, wf> entry = ☃.next();
/*  56 */       if (!((wf)entry.getValue()).c()) {
/*  57 */         ☃.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*  64 */     b("RCON running on " + this.j + ":" + this.h);
/*     */     try {
/*  66 */       while (this.a) {
/*     */         
/*     */         try {
/*  69 */           Socket ☃ = this.k.accept();
/*  70 */           ☃.setSoTimeout(500);
/*  71 */           wf wf = new wf(this.b, ☃);
/*  72 */           wf.a();
/*  73 */           this.m.put(☃.getRemoteSocketAddress(), wf);
/*     */ 
/*     */           
/*  76 */           g();
/*  77 */         } catch (SocketTimeoutException ☃) {
/*     */           
/*  79 */           g();
/*  80 */         } catch (IOException ☃) {
/*  81 */           if (this.a) {
/*  82 */             b("IO: " + ☃.getMessage());
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } finally {
/*  87 */       b(this.k);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  93 */     if (this.l.isEmpty()) {
/*  94 */       c("No rcon password set in '" + this.b.d_() + "', rcon disabled!");
/*     */       
/*     */       return;
/*     */     } 
/*  98 */     if (0 >= this.h || 65535 < this.h) {
/*  99 */       c("Invalid rcon port " + this.h + " found in '" + this.b.d_() + "', rcon disabled!");
/*     */       
/*     */       return;
/*     */     } 
/* 103 */     if (this.a) {
/*     */       return;
/*     */     }
/*     */     
/*     */     try {
/* 108 */       this.k = new ServerSocket(this.h, 0, InetAddress.getByName(this.j));
/* 109 */       this.k.setSoTimeout(500);
/* 110 */       super.a();
/* 111 */     } catch (IOException ☃) {
/* 112 */       c("Unable to initialise rcon on " + this.j + ":" + this.h + " : " + ☃.getMessage());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */