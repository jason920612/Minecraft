/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutput;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.zip.GZIPInputStream;
/*     */ import java.util.zip.GZIPOutputStream;
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
/*     */ public class hi
/*     */ {
/*     */   public static gy a(InputStream ☃) throws IOException {
/*  25 */     DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(☃)));
/*     */     try {
/*  27 */       return a(dataInputStream, hh.a);
/*     */     } finally {
/*  29 */       dataInputStream.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(gy ☃, OutputStream outputStream) throws IOException {
/*  34 */     DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));
/*     */     try {
/*  36 */       a(☃, dataOutputStream);
/*     */     } finally {
/*  38 */       dataOutputStream.close();
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
/*     */   public static gy a(DataInputStream ☃) throws IOException {
/*  80 */     return a(☃, hh.a);
/*     */   }
/*     */   
/*     */   public static gy a(DataInput ☃, hh hh1) throws IOException {
/*  84 */     ho ho = a(☃, 0, hh1);
/*  85 */     if (ho instanceof gy) {
/*  86 */       return (gy)ho;
/*     */     }
/*  88 */     throw new IOException("Root tag must be a named compound tag");
/*     */   }
/*     */   
/*     */   public static void a(gy ☃, DataOutput dataOutput) throws IOException {
/*  92 */     a(☃, dataOutput);
/*     */   }
/*     */   
/*     */   private static void a(ho ☃, DataOutput dataOutput) throws IOException {
/*  96 */     dataOutput.writeByte(☃.a());
/*  97 */     if (☃.a() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 102 */     dataOutput.writeUTF("");
/*     */     
/* 104 */     ☃.a(dataOutput);
/*     */   }
/*     */   
/*     */   private static ho a(DataInput ☃, int i, hh hh1) throws IOException {
/* 108 */     byte b = ☃.readByte();
/* 109 */     if (b == 0) {
/* 110 */       return new ha();
/*     */     }
/*     */ 
/*     */     
/* 114 */     ☃.readUTF();
/*     */     
/* 116 */     ho ho = ho.a(b);
/*     */     
/*     */     try {
/* 119 */       ho.a(☃, i, hh1);
/* 120 */     } catch (IOException iOException) {
/* 121 */       b b1 = b.a(iOException, "Loading NBT data");
/* 122 */       c c = b1.a("NBT Tag");
/* 123 */       c.a("Tag type", Byte.valueOf(b));
/* 124 */       throw new h(b1);
/*     */     } 
/*     */     
/* 127 */     return ho;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */