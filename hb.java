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
/*     */ public class hb
/*     */   extends hl
/*     */ {
/*     */   private float f;
/*     */   
/*     */   hb() {}
/*     */   
/*     */   public hb(float ☃) {
/*  25 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  30 */     ☃.writeFloat(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  35 */     hh1.a(96L);
/*  36 */     this.f = ☃.readFloat();
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  41 */     return 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  46 */     return this.f + "f";
/*     */   }
/*     */ 
/*     */   
/*     */   public hb c() {
/*  51 */     return new hb(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  56 */     if (this == ☃) {
/*  57 */       return true;
/*     */     }
/*     */     
/*  60 */     return (☃ instanceof hb && this.f == ((hb)☃).f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  65 */     return Float.floatToIntBits(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/*  70 */     ij ij = (new iq("f")).a(e);
/*  71 */     return (new iq(String.valueOf(this.f))).a(ij).a(d);
/*     */   }
/*     */ 
/*     */   
/*     */   public long d() {
/*  76 */     return (long)this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/*  81 */     return xq.d(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public short f() {
/*  86 */     return (short)(xq.d(this.f) & 0xFFFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte g() {
/*  91 */     return (byte)(xq.d(this.f) & 0xFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public double h() {
/*  96 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public float i() {
/* 101 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number j() {
/* 106 */     return Float.valueOf(this.f);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */