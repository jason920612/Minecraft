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
/*     */ public class hd
/*     */   extends hl
/*     */ {
/*     */   private int f;
/*     */   
/*     */   hd() {}
/*     */   
/*     */   public hd(int ☃) {
/*  24 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  29 */     ☃.writeInt(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  34 */     hh1.a(96L);
/*  35 */     this.f = ☃.readInt();
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  40 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  45 */     return String.valueOf(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public hd c() {
/*  50 */     return new hd(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  55 */     if (this == ☃) {
/*  56 */       return true;
/*     */     }
/*     */     
/*  59 */     return (☃ instanceof hd && this.f == ((hd)☃).f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  64 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/*  69 */     return (new iq(String.valueOf(this.f))).a(d);
/*     */   }
/*     */ 
/*     */   
/*     */   public long d() {
/*  74 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/*  79 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public short f() {
/*  84 */     return (short)(this.f & 0xFFFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte g() {
/*  89 */     return (byte)(this.f & 0xFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public double h() {
/*  94 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public float i() {
/*  99 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number j() {
/* 104 */     return Integer.valueOf(this.f);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */