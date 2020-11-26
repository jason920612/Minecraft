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
/*     */ public class hc
/*     */   extends gx<hd>
/*     */ {
/*     */   private int[] f;
/*     */   
/*     */   hc() {}
/*     */   
/*     */   public hc(int[] ☃) {
/*  28 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public hc(List<Integer> ☃) {
/*  32 */     this(a(☃));
/*     */   }
/*     */   
/*     */   private static int[] a(List<Integer> ☃) {
/*  36 */     int[] arrayOfInt = new int[☃.size()];
/*  37 */     for (int i = 0; i < ☃.size(); i++) {
/*  38 */       Integer integer = ☃.get(i);
/*  39 */       arrayOfInt[i] = (integer == null) ? 0 : integer.intValue();
/*     */     } 
/*     */     
/*  42 */     return arrayOfInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  47 */     ☃.writeInt(this.f.length);
/*  48 */     for (int i : this.f) {
/*  49 */       ☃.writeInt(i);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  55 */     hh1.a(192L);
/*     */     
/*  57 */     int j = ☃.readInt();
/*  58 */     hh1.a((32 * j));
/*  59 */     this.f = new int[j];
/*  60 */     for (int k = 0; k < j; k++) {
/*  61 */       this.f[k] = ☃.readInt();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  67 */     return 11;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  72 */     StringBuilder ☃ = new StringBuilder("[I;");
/*  73 */     for (int i = 0; i < this.f.length; i++) {
/*  74 */       if (i != 0) {
/*  75 */         ☃.append(',');
/*     */       }
/*  77 */       ☃.append(this.f[i]);
/*     */     } 
/*  79 */     return ☃.append(']').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public hc c() {
/*  84 */     int[] ☃ = new int[this.f.length];
/*  85 */     System.arraycopy(this.f, 0, ☃, 0, this.f.length);
/*  86 */     return new hc(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  91 */     if (this == ☃) {
/*  92 */       return true;
/*     */     }
/*     */     
/*  95 */     return (☃ instanceof hc && Arrays.equals(this.f, ((hc)☃).f));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 100 */     return Arrays.hashCode(this.f);
/*     */   }
/*     */   
/*     */   public int[] d() {
/* 104 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/* 109 */     ij ij1 = (new iq("I")).a(e);
/* 110 */     ij ij2 = (new iq("[")).a(ij1).a(";");
/*     */     
/* 112 */     for (int j = 0; j < this.f.length; j++) {
/* 113 */       ij2.a(" ").a((new iq(String.valueOf(this.f[j]))).a(d));
/* 114 */       if (j != this.f.length - 1) {
/* 115 */         ij2.a(",");
/*     */       }
/*     */     } 
/*     */     
/* 119 */     ij2.a("]");
/*     */     
/* 121 */     return ij2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 126 */     return this.f.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public hd a(int ☃) {
/* 131 */     return new hd(this.f[☃]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ho ho1) {
/* 136 */     this.f[☃] = ((hl)ho1).e();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃) {
/* 141 */     this.f = ArrayUtils.remove(this.f, ☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */