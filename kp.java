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
/*     */ public class kp
/*     */   implements iv<iy>
/*     */ {
/*     */   private boolean a;
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private float e;
/*     */   private float f;
/*     */   
/*     */   public kp() {}
/*     */   
/*     */   public kp(aoe ☃) {
/*  28 */     a(☃.a);
/*  29 */     b(☃.b);
/*  30 */     c(☃.c);
/*  31 */     d(☃.d);
/*  32 */     a(☃.a());
/*  33 */     b(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  38 */     byte b = ☃.readByte();
/*     */     
/*  40 */     a(((b & 0x1) > 0));
/*  41 */     b(((b & 0x2) > 0));
/*  42 */     c(((b & 0x4) > 0));
/*  43 */     d(((b & 0x8) > 0));
/*  44 */     a(☃.readFloat());
/*  45 */     b(☃.readFloat());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  50 */     byte b = 0;
/*     */     
/*  52 */     if (b()) {
/*  53 */       b = (byte)(b | 0x1);
/*     */     }
/*  55 */     if (c()) {
/*  56 */       b = (byte)(b | 0x2);
/*     */     }
/*  58 */     if (d()) {
/*  59 */       b = (byte)(b | 0x4);
/*     */     }
/*  61 */     if (e()) {
/*  62 */       b = (byte)(b | 0x8);
/*     */     }
/*     */     
/*  65 */     ☃.writeByte(b);
/*  66 */     ☃.writeFloat(this.e);
/*  67 */     ☃.writeFloat(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/*  72 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  76 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  80 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  84 */     return this.b;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/*  88 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  92 */     return this.c;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/*  96 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 100 */     return this.d;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 104 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/* 112 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float ☃) {
/* 120 */     this.f = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\kp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */