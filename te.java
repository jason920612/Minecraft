/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class te
/*     */   implements ayb
/*     */ {
/*     */   private final MinecraftServer a;
/*     */   private final td b;
/*     */   
/*     */   public te(MinecraftServer ☃, td td1) {
/*  24 */     this.a = ☃;
/*  25 */     this.b = td1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fk ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fk ☃, boolean bool1, boolean bool2, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aer ☃) {
/*  42 */     this.b.A().a(☃);
/*     */     
/*  44 */     if (☃ instanceof tf) {
/*  45 */       this.b.t.a((tf)☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aer ☃) {
/*  51 */     this.b.A().b(☃);
/*  52 */     this.b.l_().a(☃);
/*     */     
/*  54 */     if (☃ instanceof tf) {
/*  55 */       this.b.t.b((tf)☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable aog ☃, wi wi1, wk wk1, double d1, double d2, double d3, float f1, float f2) {
/*  61 */     this.a.ac().a(☃, d1, d2, d3, (f1 > 1.0F) ? (16.0F * f1) : 16.0D, this.b.t.q(), new lt(wi1, wk1, d1, d2, d3, f1, f2));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, int k, int m, int n) {}
/*     */ 
/*     */   
/*     */   public void a(axk ☃, el el1, blc blc1, blc blc2, int i) {
/*  70 */     this.b.B().a(el1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(el ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(wi ☃, el el1) {}
/*     */ 
/*     */   
/*     */   public void a(aog ☃, int i, el el1, int j) {
/*  83 */     this.a.ac().a(☃, el1.o(), el1.p(), el1.q(), 64.0D, this.b.t.q(), new kh(i, el1, j, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, el el1, int i) {
/*  88 */     this.a.ac().a(new kh(☃, el1, i, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, el el1, int i) {
/*  93 */     for (tf tf : this.a.ac().v()) {
/*  94 */       if (tf == null || tf.m != this.b || tf.Q() == ☃) {
/*     */         continue;
/*     */       }
/*  97 */       double d1 = el1.o() - tf.q;
/*  98 */       double d2 = el1.p() - tf.r;
/*  99 */       double d3 = el1.q() - tf.s;
/*     */       
/* 101 */       if (d1 * d1 + d2 * d2 + d3 * d3 < 1024.0D)
/* 102 */         tf.a.a(new jh(☃, el1, i)); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\te.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */