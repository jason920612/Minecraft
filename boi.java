/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ public class boi
/*     */   extends boc
/*     */ {
/*  21 */   public static final el g = new el(100, 50, 0);
/*     */   
/*     */   private boh h;
/*     */   
/*     */   public void m() {
/*  26 */     gy ☃ = this.b.g().a(bod.c);
/*  27 */     this.h = (this.b instanceof td) ? new boh((td)this.b, ☃.p("DragonFight")) : null;
/*  28 */     this.e = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmy<?> n() {
/*  33 */     box ☃ = bnb.c.b();
/*  34 */     ☃.a(bct.eg.p());
/*  35 */     ☃.b(bct.a.p());
/*  36 */     ☃.a(d());
/*  37 */     return bnb.c.create(this.b, ayy.d.a(((bbu)ayy.d.b()).a(this.b.r_())), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(long ☃, float f) {
/*  42 */     return 0.0F;
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
/*     */   
/*     */   public boolean p() {
/*  74 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean o() {
/*  79 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(axm ☃, boolean bool) {
/*  90 */     Random random = new Random(this.b.r_());
/*  91 */     el el1 = new el(☃.d() + random.nextInt(15), 0, ☃.g() + random.nextInt(15));
/*  92 */     return this.b.i(el1).d().c() ? el1 : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public el d() {
/*  97 */     return g;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(int ☃, int i, boolean bool) {
/* 103 */     return a(new axm(☃ >> 4, i >> 4), bool);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bod q() {
/* 114 */     return bod.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 119 */     gy ☃ = new gy();
/* 120 */     if (this.h != null) {
/* 121 */       ☃.a("DragonFight", this.h.a());
/*     */     }
/* 123 */     this.b.g().a(bod.c, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 128 */     if (this.h != null) {
/* 129 */       this.h.b();
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public boh r() {
/* 135 */     return this.h;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\boi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */