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
/*     */ public class hg
/*     */   extends hl
/*     */ {
/*     */   private long f;
/*     */   
/*     */   hg() {}
/*     */   
/*     */   public hg(long ☃) {
/*  24 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  29 */     ☃.writeLong(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  34 */     hh1.a(128L);
/*  35 */     this.f = ☃.readLong();
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  40 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  45 */     return this.f + "L";
/*     */   }
/*     */ 
/*     */   
/*     */   public hg c() {
/*  50 */     return new hg(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  55 */     if (this == ☃) {
/*  56 */       return true;
/*     */     }
/*     */     
/*  59 */     return (☃ instanceof hg && this.f == ((hg)☃).f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  64 */     return (int)(this.f ^ this.f >>> 32L);
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/*  69 */     ij ij = (new iq("L")).a(e);
/*  70 */     return (new iq(String.valueOf(this.f))).a(ij).a(d);
/*     */   }
/*     */ 
/*     */   
/*     */   public long d() {
/*  75 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/*  80 */     return (int)(this.f & 0xFFFFFFFFFFFFFFFFL);
/*     */   }
/*     */ 
/*     */   
/*     */   public short f() {
/*  85 */     return (short)(int)(this.f & 0xFFFFL);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte g() {
/*  90 */     return (byte)(int)(this.f & 0xFFL);
/*     */   }
/*     */ 
/*     */   
/*     */   public double h() {
/*  95 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public float i() {
/* 100 */     return (float)this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number j() {
/* 105 */     return Long.valueOf(this.f);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */