/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.IOException;
/*     */ import java.net.DatagramPacket;
/*     */ import java.net.DatagramSocket;
/*     */ import java.net.InetAddress;
/*     */ import java.net.PortUnreachableException;
/*     */ import java.net.SocketAddress;
/*     */ import java.net.SocketException;
/*     */ import java.net.SocketTimeoutException;
/*     */ import java.net.UnknownHostException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ public class we
/*     */   extends wd
/*     */ {
/*     */   private long h;
/*     */   private int i;
/*     */   private final int j;
/*     */   private final int k;
/*     */   private final String l;
/*     */   private final String m;
/*     */   private DatagramSocket n;
/*  38 */   private final byte[] o = new byte[1460];
/*     */   
/*     */   private DatagramPacket p;
/*     */   
/*     */   private final Map<SocketAddress, String> q;
/*     */   private String r;
/*     */   private String s;
/*     */   private final Map<SocketAddress, a> t;
/*     */   private final long u;
/*     */   private final vz v;
/*     */   private long w;
/*     */   
/*     */   public we(pq ☃) {
/*  51 */     super(☃, "Query Listener");
/*     */     
/*  53 */     this.i = ☃.a("query.port", 0);
/*  54 */     this.s = ☃.e();
/*  55 */     this.j = ☃.e_();
/*  56 */     this.l = ☃.m();
/*  57 */     this.k = ☃.z();
/*  58 */     this.m = ☃.I();
/*     */ 
/*     */     
/*  61 */     this.w = 0L;
/*     */     
/*  63 */     this.r = "0.0.0.0";
/*     */ 
/*     */     
/*  66 */     if (this.s.isEmpty() || this.r.equals(this.s)) {
/*     */       
/*  68 */       this.s = "0.0.0.0";
/*     */       try {
/*  70 */         InetAddress inetAddress = InetAddress.getLocalHost();
/*  71 */         this.r = inetAddress.getHostAddress();
/*  72 */       } catch (UnknownHostException unknownHostException) {
/*  73 */         c("Unable to determine local host IP, please set server-ip in '" + ☃.d_() + "' : " + unknownHostException.getMessage());
/*     */       } 
/*     */     } else {
/*  76 */       this.r = this.s;
/*     */     } 
/*     */ 
/*     */     
/*  80 */     if (0 == this.i) {
/*     */       
/*  82 */       this.i = this.j;
/*  83 */       b("Setting default query port to " + this.i);
/*  84 */       ☃.a("query.port", Integer.valueOf(this.i));
/*  85 */       ☃.a("debug", Boolean.valueOf(false));
/*  86 */       ☃.c_();
/*     */     } 
/*     */     
/*  89 */     this.q = Maps.newHashMap();
/*  90 */     this.v = new vz(1460);
/*  91 */     this.t = Maps.newHashMap();
/*  92 */     this.u = (new Date()).getTime();
/*     */   }
/*     */   
/*     */   private void a(byte[] ☃, DatagramPacket datagramPacket) throws IOException {
/*  96 */     this.n.send(new DatagramPacket(☃, ☃.length, datagramPacket.getSocketAddress()));
/*     */   }
/*     */   private boolean a(DatagramPacket ☃) throws IOException {
/*     */     vz vz1;
/* 100 */     byte[] arrayOfByte = ☃.getData();
/* 101 */     int i = ☃.getLength();
/* 102 */     SocketAddress socketAddress = ☃.getSocketAddress();
/* 103 */     a("Packet len " + i + " [" + socketAddress + "]");
/* 104 */     if (3 > i || -2 != arrayOfByte[0] || -3 != arrayOfByte[1]) {
/*     */       
/* 106 */       a("Invalid packet [" + socketAddress + "]");
/* 107 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 111 */     a("Packet '" + wa.a(arrayOfByte[2]) + "' [" + socketAddress + "]");
/* 112 */     switch (arrayOfByte[2]) {
/*     */       
/*     */       case 9:
/* 115 */         d(☃);
/* 116 */         a("Challenge [" + socketAddress + "]");
/* 117 */         return true;
/*     */ 
/*     */       
/*     */       case 0:
/* 121 */         if (!c(☃).booleanValue()) {
/* 122 */           a("Invalid challenge [" + socketAddress + "]");
/* 123 */           return false;
/*     */         } 
/*     */         
/* 126 */         if (15 == i) {
/*     */           
/* 128 */           a(b(☃), ☃);
/* 129 */           a("Rules [" + socketAddress + "]");
/*     */           break;
/*     */         } 
/* 132 */         vz1 = new vz(1460);
/* 133 */         vz1.a(0);
/* 134 */         vz1.a(a(☃.getSocketAddress()));
/* 135 */         vz1.a(this.l);
/* 136 */         vz1.a("SMP");
/* 137 */         vz1.a(this.m);
/* 138 */         vz1.a(Integer.toString(d()));
/* 139 */         vz1.a(Integer.toString(this.k));
/* 140 */         vz1.a((short)this.j);
/* 141 */         vz1.a(this.r);
/*     */         
/* 143 */         a(vz1.a(), ☃);
/* 144 */         a("Status [" + socketAddress + "]");
/*     */         break;
/*     */     } 
/*     */     
/* 148 */     return true;
/*     */   }
/*     */   
/*     */   private byte[] b(DatagramPacket ☃) throws IOException {
/* 152 */     long l = k.b();
/* 153 */     if (l < this.w + 5000L) {
/*     */       
/* 155 */       byte[] arrayOfByte1 = this.v.a();
/* 156 */       byte[] arrayOfByte2 = a(☃.getSocketAddress());
/* 157 */       arrayOfByte1[1] = arrayOfByte2[0];
/* 158 */       arrayOfByte1[2] = arrayOfByte2[1];
/* 159 */       arrayOfByte1[3] = arrayOfByte2[2];
/* 160 */       arrayOfByte1[4] = arrayOfByte2[3];
/*     */       
/* 162 */       return arrayOfByte1;
/*     */     } 
/*     */     
/* 165 */     this.w = l;
/*     */     
/* 167 */     this.v.b();
/* 168 */     this.v.a(0);
/* 169 */     this.v.a(a(☃.getSocketAddress()));
/* 170 */     this.v.a("splitnum");
/* 171 */     this.v.a(128);
/* 172 */     this.v.a(0);
/*     */ 
/*     */     
/* 175 */     this.v.a("hostname");
/* 176 */     this.v.a(this.l);
/* 177 */     this.v.a("gametype");
/* 178 */     this.v.a("SMP");
/* 179 */     this.v.a("game_id");
/* 180 */     this.v.a("MINECRAFT");
/* 181 */     this.v.a("version");
/* 182 */     this.v.a(this.b.x());
/* 183 */     this.v.a("plugins");
/* 184 */     this.v.a(this.b.f_());
/* 185 */     this.v.a("map");
/* 186 */     this.v.a(this.m);
/* 187 */     this.v.a("numplayers");
/* 188 */     this.v.a("" + d());
/* 189 */     this.v.a("maxplayers");
/* 190 */     this.v.a("" + this.k);
/* 191 */     this.v.a("hostport");
/* 192 */     this.v.a("" + this.j);
/* 193 */     this.v.a("hostip");
/* 194 */     this.v.a(this.r);
/* 195 */     this.v.a(0);
/* 196 */     this.v.a(1);
/*     */ 
/*     */ 
/*     */     
/* 200 */     this.v.a("player_");
/* 201 */     this.v.a(0);
/*     */     
/* 203 */     String[] arrayOfString = this.b.A();
/* 204 */     for (String str : arrayOfString) {
/* 205 */       this.v.a(str);
/*     */     }
/* 207 */     this.v.a(0);
/*     */     
/* 209 */     return this.v.a();
/*     */   }
/*     */   
/*     */   private byte[] a(SocketAddress ☃) {
/* 213 */     return ((a)this.t.get(☃)).c();
/*     */   }
/*     */   
/*     */   private Boolean c(DatagramPacket ☃) {
/* 217 */     SocketAddress socketAddress = ☃.getSocketAddress();
/* 218 */     if (!this.t.containsKey(socketAddress))
/*     */     {
/* 220 */       return Boolean.valueOf(false);
/*     */     }
/*     */     
/* 223 */     byte[] arrayOfByte = ☃.getData();
/* 224 */     if (((a)this.t.get(socketAddress)).a() != wa.c(arrayOfByte, 7, ☃.getLength()))
/*     */     {
/* 226 */       return Boolean.valueOf(false);
/*     */     }
/*     */ 
/*     */     
/* 230 */     return Boolean.valueOf(true);
/*     */   }
/*     */   
/*     */   private void d(DatagramPacket ☃) throws IOException {
/* 234 */     a a = new a(this, ☃);
/* 235 */     this.t.put(☃.getSocketAddress(), a);
/*     */     
/* 237 */     a(a.b(), ☃);
/*     */   }
/*     */   
/*     */   private void f() {
/* 241 */     if (!this.a) {
/*     */       return;
/*     */     }
/*     */     
/* 245 */     long ☃ = k.b();
/* 246 */     if (☃ < this.h + 30000L) {
/*     */       return;
/*     */     }
/* 249 */     this.h = ☃;
/*     */     
/* 251 */     Iterator<Map.Entry<SocketAddress, a>> iterator = this.t.entrySet().iterator();
/* 252 */     while (iterator.hasNext()) {
/* 253 */       Map.Entry<SocketAddress, a> entry = iterator.next();
/* 254 */       if (((a)entry.getValue()).a(☃).booleanValue()) {
/* 255 */         iterator.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/* 262 */     b("Query running on " + this.s + ":" + this.i);
/* 263 */     this.h = k.b();
/* 264 */     this.p = new DatagramPacket(this.o, this.o.length);
/*     */     
/*     */     try {
/* 267 */       while (this.a) {
/*     */         try {
/* 269 */           this.n.receive(this.p);
/*     */ 
/*     */           
/* 272 */           f();
/*     */ 
/*     */           
/* 275 */           a(this.p);
/* 276 */         } catch (SocketTimeoutException ☃) {
/*     */           
/* 278 */           f();
/* 279 */         } catch (PortUnreachableException portUnreachableException) {
/*     */         
/* 281 */         } catch (IOException ☃) {
/*     */           
/* 283 */           a(☃);
/*     */         } 
/*     */       } 
/*     */     } finally {
/* 287 */       e();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 293 */     if (this.a) {
/*     */       return;
/*     */     }
/*     */     
/* 297 */     if (0 >= this.i || 65535 < this.i) {
/* 298 */       c("Invalid query port " + this.i + " found in '" + this.b.d_() + "' (queries disabled)");
/*     */       
/*     */       return;
/*     */     } 
/* 302 */     if (g()) {
/* 303 */       super.a();
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(Exception ☃) {
/* 308 */     if (!this.a) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 313 */     c("Unexpected exception, buggy JRE? (" + ☃ + ")");
/*     */ 
/*     */     
/* 316 */     if (!g()) {
/* 317 */       d("Failed to recover from buggy JRE, shutting down!");
/* 318 */       this.a = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean g() {
/*     */     try {
/* 324 */       this.n = new DatagramSocket(this.i, InetAddress.getByName(this.s));
/* 325 */       a(this.n);
/* 326 */       this.n.setSoTimeout(500);
/* 327 */       return true;
/* 328 */     } catch (SocketException ☃) {
/* 329 */       c("Unable to initialise query system on " + this.s + ":" + this.i + " (Socket): " + ☃.getMessage());
/* 330 */     } catch (UnknownHostException ☃) {
/* 331 */       c("Unable to initialise query system on " + this.s + ":" + this.i + " (Unknown Host): " + ☃.getMessage());
/* 332 */     } catch (Exception ☃) {
/* 333 */       c("Unable to initialise query system on " + this.s + ":" + this.i + " (E): " + ☃.getMessage());
/*     */     } 
/*     */     
/* 336 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   class a
/*     */   {
/* 347 */     private final long b = (new Date()).getTime(); private final int c; private final byte[] d; public a(we this$0, DatagramPacket ☃) {
/* 348 */       byte[] arrayOfByte = ☃.getData();
/* 349 */       this.d = new byte[4];
/* 350 */       this.d[0] = arrayOfByte[3];
/* 351 */       this.d[1] = arrayOfByte[4];
/* 352 */       this.d[2] = arrayOfByte[5];
/* 353 */       this.d[3] = arrayOfByte[6];
/* 354 */       this.f = new String(this.d, StandardCharsets.UTF_8);
/* 355 */       this.c = (new Random()).nextInt(16777216);
/* 356 */       this.e = String.format("\t%s%d\000", new Object[] { this.f, Integer.valueOf(this.c) }).getBytes(StandardCharsets.UTF_8);
/*     */     }
/*     */     private final byte[] e; private final String f;
/*     */     public Boolean a(long ☃) {
/* 360 */       return Boolean.valueOf((this.b < ☃));
/*     */     }
/*     */     
/*     */     public int a() {
/* 364 */       return this.c;
/*     */     }
/*     */     
/*     */     public byte[] b() {
/* 368 */       return this.e;
/*     */     }
/*     */     
/*     */     public byte[] c() {
/* 372 */       return this.d;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\we.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */