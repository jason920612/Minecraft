/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */ public class gv
/*     */   extends gx<gw>
/*     */ {
/*     */   private byte[] f;
/*     */   
/*     */   gv() {}
/*     */   
/*     */   public gv(byte[] ☃) {
/*  28 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public gv(List<Byte> ☃) {
/*  32 */     this(a(☃));
/*     */   }
/*     */   
/*     */   private static byte[] a(List<Byte> ☃) {
/*  36 */     byte[] arrayOfByte = new byte[☃.size()];
/*  37 */     for (int i = 0; i < ☃.size(); i++) {
/*  38 */       Byte byte_ = ☃.get(i);
/*  39 */       arrayOfByte[i] = (byte_ == null) ? 0 : byte_.byteValue();
/*     */     } 
/*     */     
/*  42 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  47 */     ☃.writeInt(this.f.length);
/*  48 */     ☃.write(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  53 */     hh1.a(192L);
/*  54 */     int j = ☃.readInt();
/*  55 */     hh1.a((8 * j));
/*  56 */     this.f = new byte[j];
/*  57 */     ☃.readFully(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  62 */     return 7;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  67 */     StringBuilder ☃ = new StringBuilder("[B;");
/*  68 */     for (int i = 0; i < this.f.length; i++) {
/*  69 */       if (i != 0) {
/*  70 */         ☃.append(',');
/*     */       }
/*  72 */       ☃.append(this.f[i]).append('B');
/*     */     } 
/*  74 */     return ☃.append(']').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public ho b() {
/*  79 */     byte[] ☃ = new byte[this.f.length];
/*  80 */     System.arraycopy(this.f, 0, ☃, 0, this.f.length);
/*  81 */     return new gv(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  86 */     if (this == ☃) {
/*  87 */       return true;
/*     */     }
/*     */     
/*  90 */     return (☃ instanceof gv && Arrays.equals(this.f, ((gv)☃).f));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  95 */     return Arrays.hashCode(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/* 100 */     ij ij1 = (new iq("B")).a(e);
/* 101 */     ij ij2 = (new iq("[")).a(ij1).a(";");
/*     */     
/* 103 */     for (int j = 0; j < this.f.length; j++) {
/* 104 */       ij ij = (new iq(String.valueOf(this.f[j]))).a(d);
/*     */       
/* 106 */       ij2.a(" ").a(ij).a(ij1);
/*     */       
/* 108 */       if (j != this.f.length - 1) {
/* 109 */         ij2.a(",");
/*     */       }
/*     */     } 
/*     */     
/* 113 */     ij2.a("]");
/*     */     
/* 115 */     return ij2;
/*     */   }
/*     */   
/*     */   public byte[] c() {
/* 119 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 124 */     return this.f.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public gw a(int ☃) {
/* 129 */     return new gw(this.f[☃]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ho ho1) {
/* 134 */     this.f[☃] = ((hl)ho1).g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃) {
/* 139 */     this.f = ArrayUtils.remove(this.f, ☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */