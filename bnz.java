/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.util.List;
/*     */ import java.util.zip.DeflaterOutputStream;
/*     */ import java.util.zip.GZIPInputStream;
/*     */ import java.util.zip.InflaterInputStream;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class bnz
/*     */ {
/*  87 */   private static final byte[] a = new byte[4096];
/*     */   
/*     */   private final File b;
/*     */   private RandomAccessFile c;
/*     */   private final int[] d;
/*     */   private final int[] e;
/*     */   private List<Boolean> f;
/*     */   private int g;
/*     */   private long h;
/*     */   
/*     */   public bnz(File ☃) {
/*  98 */     this.d = new int[1024];
/*  99 */     this.e = new int[1024];
/*     */     
/* 101 */     this.b = ☃;
/*     */     
/* 103 */     this.g = 0;
/*     */     
/*     */     try {
/* 106 */       if (☃.exists()) {
/* 107 */         this.h = ☃.lastModified();
/*     */       }
/*     */       
/* 110 */       this.c = new RandomAccessFile(☃, "rw");
/*     */       
/* 112 */       if (this.c.length() < 4096L) {
/*     */         
/* 114 */         this.c.write(a);
/*     */         
/* 116 */         this.c.write(a);
/*     */         
/* 118 */         this.g += 8192;
/*     */       } 
/*     */       
/* 121 */       if ((this.c.length() & 0xFFFL) != 0L)
/*     */       {
/* 123 */         for (int k = 0; k < (this.c.length() & 0xFFFL); k++) {
/* 124 */           this.c.write(0);
/*     */         }
/*     */       }
/*     */ 
/*     */       
/* 129 */       int i = (int)this.c.length() / 4096;
/* 130 */       this.f = Lists.newArrayListWithCapacity(i);
/*     */       int j;
/* 132 */       for (j = 0; j < i; j++) {
/* 133 */         this.f.add(Boolean.valueOf(true));
/*     */       }
/*     */       
/* 136 */       this.f.set(0, Boolean.valueOf(false));
/* 137 */       this.f.set(1, Boolean.valueOf(false));
/*     */       
/* 139 */       this.c.seek(0L);
/* 140 */       for (j = 0; j < 1024; j++) {
/* 141 */         int k = this.c.readInt();
/* 142 */         this.d[j] = k;
/* 143 */         if (k != 0 && (k >> 8) + (k & 0xFF) <= this.f.size()) {
/* 144 */           for (int m = 0; m < (k & 0xFF); m++) {
/* 145 */             this.f.set((k >> 8) + m, Boolean.valueOf(false));
/*     */           }
/*     */         }
/*     */       } 
/* 149 */       for (j = 0; j < 1024; j++) {
/* 150 */         int k = this.c.readInt();
/* 151 */         this.e[j] = k;
/*     */       } 
/* 153 */     } catch (IOException iOException) {
/* 154 */       iOException.printStackTrace();
/*     */     } 
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
/*     */   @Nullable
/*     */   public synchronized DataInputStream a(int ☃, int i) {
/* 176 */     if (e(☃, i)) {
/* 177 */       return null;
/*     */     }
/*     */     
/*     */     try {
/* 181 */       int j = f(☃, i);
/* 182 */       if (j == 0) {
/* 183 */         return null;
/*     */       }
/*     */       
/* 186 */       int k = j >> 8;
/* 187 */       int m = j & 0xFF;
/*     */       
/* 189 */       if (k + m > this.f.size()) {
/* 190 */         return null;
/*     */       }
/*     */       
/* 193 */       this.c.seek((k * 4096));
/* 194 */       int n = this.c.readInt();
/*     */       
/* 196 */       if (n > 4096 * m)
/* 197 */         return null; 
/* 198 */       if (n <= 0) {
/* 199 */         return null;
/*     */       }
/*     */       
/* 202 */       byte b = this.c.readByte();
/* 203 */       if (b == 1) {
/* 204 */         byte[] arrayOfByte = new byte[n - 1];
/* 205 */         this.c.read(arrayOfByte);
/* 206 */         return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arrayOfByte))));
/* 207 */       }  if (b == 2) {
/* 208 */         byte[] arrayOfByte = new byte[n - 1];
/* 209 */         this.c.read(arrayOfByte);
/* 210 */         return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(arrayOfByte))));
/*     */       } 
/*     */       
/* 213 */       return null;
/* 214 */     } catch (IOException iOException) {
/* 215 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(int ☃, int i) {
/* 220 */     if (e(☃, i)) {
/* 221 */       return false;
/*     */     }
/*     */     
/* 224 */     int j = f(☃, i);
/* 225 */     if (j == 0) {
/* 226 */       return false;
/*     */     }
/*     */     
/* 229 */     int k = j >> 8;
/* 230 */     int m = j & 0xFF;
/*     */     
/* 232 */     if (k + m > this.f.size()) {
/* 233 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 237 */       this.c.seek((k * 4096));
/* 238 */       int n = this.c.readInt();
/*     */       
/* 240 */       if (n > 4096 * m) {
/* 241 */         return false;
/*     */       }
/*     */       
/* 244 */       if (n <= 0) {
/* 245 */         return false;
/*     */       }
/* 247 */     } catch (IOException iOException) {
/* 248 */       return false;
/*     */     } 
/*     */     
/* 251 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public DataOutputStream c(int ☃, int i) {
/* 256 */     if (e(☃, i)) {
/* 257 */       return null;
/*     */     }
/*     */     
/* 260 */     return new DataOutputStream(new BufferedOutputStream(new DeflaterOutputStream(new a(this, ☃, i))));
/*     */   }
/*     */ 
/*     */   
/*     */   class a
/*     */     extends ByteArrayOutputStream
/*     */   {
/*     */     private final int b;
/*     */     
/*     */     private final int c;
/*     */     
/*     */     public a(bnz ☃, int i, int j) {
/* 272 */       super(8096);
/* 273 */       this.b = i;
/* 274 */       this.c = j;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() {
/* 279 */       this.a.a(this.b, this.c, this.buf, this.count);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected synchronized void a(int ☃, int i, byte[] arrayOfByte, int j) {
/*     */     try {
/* 286 */       int k = f(☃, i);
/* 287 */       int m = k >> 8;
/* 288 */       int n = k & 0xFF;
/* 289 */       int i1 = (j + 5) / 4096 + 1;
/*     */ 
/*     */       
/* 292 */       if (i1 >= 256) {
/*     */         return;
/*     */       }
/*     */       
/* 296 */       if (m != 0 && n == i1) {
/*     */         
/* 298 */         a(m, arrayOfByte, j);
/*     */       } else {
/*     */         int i2;
/*     */ 
/*     */         
/* 303 */         for (i2 = 0; i2 < n; i2++) {
/* 304 */           this.f.set(m + i2, Boolean.valueOf(true));
/*     */         }
/*     */ 
/*     */         
/* 308 */         i2 = this.f.indexOf(Boolean.valueOf(true));
/* 309 */         int i3 = 0;
/* 310 */         if (i2 != -1) {
/* 311 */           for (int i4 = i2; i4 < this.f.size(); i4++) {
/* 312 */             if (i3 != 0) {
/* 313 */               if (((Boolean)this.f.get(i4)).booleanValue()) {
/* 314 */                 i3++;
/*     */               } else {
/* 316 */                 i3 = 0;
/*     */               } 
/* 318 */             } else if (((Boolean)this.f.get(i4)).booleanValue()) {
/* 319 */               i2 = i4;
/* 320 */               i3 = 1;
/*     */             } 
/* 322 */             if (i3 >= i1) {
/*     */               break;
/*     */             }
/*     */           } 
/*     */         }
/*     */         
/* 328 */         if (i3 >= i1) {
/*     */           
/* 330 */           m = i2;
/* 331 */           a(☃, i, m << 8 | i1);
/* 332 */           for (int i4 = 0; i4 < i1; i4++) {
/* 333 */             this.f.set(m + i4, Boolean.valueOf(false));
/*     */           }
/* 335 */           a(m, arrayOfByte, j);
/*     */         } else {
/*     */           
/* 338 */           this.c.seek(this.c.length());
/* 339 */           m = this.f.size();
/* 340 */           for (int i4 = 0; i4 < i1; i4++) {
/* 341 */             this.c.write(a);
/* 342 */             this.f.add(Boolean.valueOf(false));
/*     */           } 
/* 344 */           this.g += 4096 * i1;
/*     */           
/* 346 */           a(m, arrayOfByte, j);
/* 347 */           a(☃, i, m << 8 | i1);
/*     */         } 
/*     */       } 
/* 350 */       b(☃, i, (int)(k.d() / 1000L));
/* 351 */     } catch (IOException iOException) {
/* 352 */       iOException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(int ☃, byte[] arrayOfByte, int i) throws IOException {
/* 358 */     this.c.seek((☃ * 4096));
/* 359 */     this.c.writeInt(i + 1);
/* 360 */     this.c.writeByte(2);
/* 361 */     this.c.write(arrayOfByte, 0, i);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean e(int ☃, int i) {
/* 366 */     return (☃ < 0 || ☃ >= 32 || i < 0 || i >= 32);
/*     */   }
/*     */   
/*     */   private int f(int ☃, int i) {
/* 370 */     return this.d[☃ + i * 32];
/*     */   }
/*     */   
/*     */   public boolean d(int ☃, int i) {
/* 374 */     return (f(☃, i) != 0);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j) throws IOException {
/* 378 */     this.d[☃ + i * 32] = j;
/* 379 */     this.c.seek(((☃ + i * 32) * 4));
/* 380 */     this.c.writeInt(j);
/*     */   }
/*     */   
/*     */   private void b(int ☃, int i, int j) throws IOException {
/* 384 */     this.e[☃ + i * 32] = j;
/* 385 */     this.c.seek((4096 + (☃ + i * 32) * 4));
/* 386 */     this.c.writeInt(j);
/*     */   }
/*     */   
/*     */   public void c() throws IOException {
/* 390 */     if (this.c != null)
/* 391 */       this.c.close(); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bnz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */