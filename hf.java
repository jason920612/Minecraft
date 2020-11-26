/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
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
/*     */ public class hf
/*     */   extends gx<hg>
/*     */ {
/*     */   private long[] f;
/*     */   
/*     */   hf() {}
/*     */   
/*     */   public hf(long[] ☃) {
/*  29 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public hf(LongSet ☃) {
/*  33 */     this.f = ☃.toLongArray();
/*     */   }
/*     */   
/*     */   public hf(List<Long> ☃) {
/*  37 */     this(a(☃));
/*     */   }
/*     */   
/*     */   private static long[] a(List<Long> ☃) {
/*  41 */     long[] arrayOfLong = new long[☃.size()];
/*  42 */     for (int i = 0; i < ☃.size(); i++) {
/*  43 */       Long long_ = ☃.get(i);
/*  44 */       arrayOfLong[i] = (long_ == null) ? 0L : long_.longValue();
/*     */     } 
/*     */     
/*  47 */     return arrayOfLong;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  52 */     ☃.writeInt(this.f.length);
/*  53 */     for (long l : this.f) {
/*  54 */       ☃.writeLong(l);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  60 */     hh1.a(192L);
/*     */     
/*  62 */     int j = ☃.readInt();
/*  63 */     hh1.a((64 * j));
/*  64 */     this.f = new long[j];
/*  65 */     for (int k = 0; k < j; k++) {
/*  66 */       this.f[k] = ☃.readLong();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  72 */     return 12;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  77 */     StringBuilder ☃ = new StringBuilder("[L;");
/*  78 */     for (int i = 0; i < this.f.length; i++) {
/*  79 */       if (i != 0) {
/*  80 */         ☃.append(',');
/*     */       }
/*  82 */       ☃.append(this.f[i]).append('L');
/*     */     } 
/*  84 */     return ☃.append(']').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public hf c() {
/*  89 */     long[] ☃ = new long[this.f.length];
/*  90 */     System.arraycopy(this.f, 0, ☃, 0, this.f.length);
/*  91 */     return new hf(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  96 */     if (this == ☃) {
/*  97 */       return true;
/*     */     }
/*     */     
/* 100 */     return (☃ instanceof hf && Arrays.equals(this.f, ((hf)☃).f));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 105 */     return Arrays.hashCode(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/* 110 */     ij ij1 = (new iq("L")).a(e);
/* 111 */     ij ij2 = (new iq("[")).a(ij1).a(";");
/*     */     
/* 113 */     for (int j = 0; j < this.f.length; j++) {
/* 114 */       ij ij = (new iq(String.valueOf(this.f[j]))).a(d);
/* 115 */       ij2.a(" ").a(ij).a(ij1);
/* 116 */       if (j != this.f.length - 1) {
/* 117 */         ij2.a(",");
/*     */       }
/*     */     } 
/*     */     
/* 121 */     ij2.a("]");
/*     */     
/* 123 */     return ij2;
/*     */   }
/*     */   
/*     */   public long[] d() {
/* 127 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 132 */     return this.f.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public hg a(int ☃) {
/* 137 */     return new hg(this.f[☃]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ho ho1) {
/* 142 */     this.f[☃] = ((hl)ho1).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃) {
/* 147 */     this.f = ArrayUtils.remove(this.f, ☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */