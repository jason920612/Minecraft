/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
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
/*     */ public class gz
/*     */   extends hl
/*     */ {
/*     */   private double f;
/*     */   
/*     */   gz() {}
/*     */   
/*     */   public gz(double ☃) {
/*  25 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  30 */     ☃.writeDouble(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  35 */     hh1.a(128L);
/*  36 */     this.f = ☃.readDouble();
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  41 */     return 6;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  46 */     return this.f + "d";
/*     */   }
/*     */ 
/*     */   
/*     */   public gz c() {
/*  51 */     return new gz(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  56 */     if (this == ☃) {
/*  57 */       return true;
/*     */     }
/*     */     
/*  60 */     return (☃ instanceof gz && this.f == ((gz)☃).f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  65 */     long ☃ = Double.doubleToLongBits(this.f);
/*  66 */     return (int)(☃ ^ ☃ >>> 32L);
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/*  71 */     ij ij = (new iq("d")).a(e);
/*  72 */     return (new iq(String.valueOf(this.f))).a(ij).a(d);
/*     */   }
/*     */ 
/*     */   
/*     */   public long d() {
/*  77 */     return (long)Math.floor(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/*  82 */     return xq.c(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public short f() {
/*  87 */     return (short)(xq.c(this.f) & 0xFFFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte g() {
/*  92 */     return (byte)(xq.c(this.f) & 0xFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public double h() {
/*  97 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public float i() {
/* 102 */     return (float)this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number j() {
/* 107 */     return Double.valueOf(this.f);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */