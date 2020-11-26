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
/*     */ public class mz
/*     */   implements iv<me>
/*     */ {
/*     */   private boolean a;
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private float e;
/*     */   private float f;
/*     */   
/*     */   public mz() {}
/*     */   
/*     */   public mz(aoe ☃) {
/*  26 */     a(☃.a);
/*  27 */     b(☃.b);
/*  28 */     c(☃.c);
/*  29 */     d(☃.d);
/*  30 */     a(☃.a());
/*  31 */     b(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  36 */     byte b = ☃.readByte();
/*     */     
/*  38 */     a(((b & 0x1) > 0));
/*  39 */     b(((b & 0x2) > 0));
/*  40 */     c(((b & 0x4) > 0));
/*  41 */     d(((b & 0x8) > 0));
/*  42 */     a(☃.readFloat());
/*  43 */     b(☃.readFloat());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  48 */     byte b = 0;
/*     */     
/*  50 */     if (b()) {
/*  51 */       b = (byte)(b | 0x1);
/*     */     }
/*  53 */     if (c()) {
/*  54 */       b = (byte)(b | 0x2);
/*     */     }
/*  56 */     if (d()) {
/*  57 */       b = (byte)(b | 0x4);
/*     */     }
/*  59 */     if (e()) {
/*  60 */       b = (byte)(b | 0x8);
/*     */     }
/*     */     
/*  63 */     ☃.writeByte(b);
/*  64 */     ☃.writeFloat(this.e);
/*  65 */     ☃.writeFloat(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(me ☃) {
/*  70 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  74 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  78 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  82 */     return this.b;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/*  86 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  90 */     return this.c;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/*  94 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  98 */     return this.d;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 102 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/* 110 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float ☃) {
/* 118 */     this.f = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\mz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */