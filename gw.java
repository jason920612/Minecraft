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
/*     */ public class gw
/*     */   extends hl
/*     */ {
/*     */   private byte f;
/*     */   
/*     */   gw() {}
/*     */   
/*     */   public gw(byte ☃) {
/*  24 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  29 */     ☃.writeByte(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  34 */     hh1.a(72L);
/*  35 */     this.f = ☃.readByte();
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  40 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  45 */     return this.f + "b";
/*     */   }
/*     */ 
/*     */   
/*     */   public gw c() {
/*  50 */     return new gw(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  55 */     if (this == ☃) {
/*  56 */       return true;
/*     */     }
/*     */     
/*  59 */     return (☃ instanceof gw && this.f == ((gw)☃).f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  64 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/*  69 */     ij ij = (new iq("b")).a(e);
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
/*  80 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public short f() {
/*  85 */     return (short)this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte g() {
/*  90 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public double h() {
/*  95 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public float i() {
/* 100 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number j() {
/* 105 */     return Byte.valueOf(this.f);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */