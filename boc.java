/*     */ import javax.annotation.Nullable;
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
/*     */ public abstract class boc
/*     */ {
/*  17 */   public static final float[] a = new float[] { 1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F };
/*     */   
/*     */   protected axy b;
/*     */   
/*     */   protected boolean c;
/*     */   protected boolean d;
/*     */   protected boolean e;
/*  24 */   protected final float[] f = new float[16];
/*     */   
/*  26 */   private final float[] g = new float[4];
/*     */   
/*     */   public final void a(axy ☃) {
/*  29 */     this.b = ☃;
/*  30 */     m();
/*  31 */     a();
/*     */   }
/*     */   
/*     */   protected void a() {
/*  35 */     float ☃ = 0.0F;
/*  36 */     for (int i = 0; i <= 15; i++) {
/*  37 */       float f = 1.0F - i / 15.0F;
/*  38 */       this.f[i] = (1.0F - f) / (f * 3.0F + 1.0F) * 1.0F + 0.0F;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(long ☃) {
/*  44 */     return (int)(☃ / 24000L % 8L + 8L) % 8;
/*     */   }
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
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el d() {
/*  76 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean f() {
/*  87 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  91 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  95 */     return this.d;
/*     */   }
/*     */   
/*     */   public float[] i() {
/*  99 */     return this.f;
/*     */   }
/*     */   
/*     */   public bmv j() {
/* 103 */     return new bmv();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(tf ☃) {}
/*     */ 
/*     */   
/*     */   public void b(tf ☃) {}
/*     */ 
/*     */   
/*     */   public void k() {}
/*     */ 
/*     */   
/*     */   public void l() {}
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 119 */     return !this.b.f(☃, i);
/*     */   }
/*     */   
/*     */   protected abstract void m();
/*     */   
/*     */   public abstract bmy<?> n();
/*     */   
/*     */   @Nullable
/*     */   public abstract el a(axm paramaxm, boolean paramBoolean);
/*     */   
/*     */   @Nullable
/*     */   public abstract el a(int paramInt1, int paramInt2, boolean paramBoolean);
/*     */   
/*     */   public abstract float a(long paramLong, float paramFloat);
/*     */   
/*     */   public abstract boolean o();
/*     */   
/*     */   public abstract boolean p();
/*     */   
/*     */   public abstract bod q();
/*     */ }


/* Location:              F:\dw\server.jar!\boc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */