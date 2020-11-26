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
/*     */ public abstract class bka
/*     */   extends bjz
/*     */   implements ads
/*     */ {
/*     */   protected pc g;
/*     */   protected long h;
/*     */   protected ij i;
/*     */   
/*     */   protected bka(bjj<?> ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */   
/*     */   public static void a(axk ☃, Random random, el el1, pc pc1) {
/*  31 */     bji bji = ☃.f(el1);
/*  32 */     if (bji instanceof bka) {
/*  33 */       ((bka)bji).a(pc1, random.nextLong());
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean d(gy ☃) {
/*  38 */     if (☃.c("LootTable", 8)) {
/*  39 */       this.g = new pc(☃.l("LootTable"));
/*  40 */       this.h = ☃.i("LootTableSeed");
/*  41 */       return true;
/*     */     } 
/*  43 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean e(gy ☃) {
/*  47 */     if (this.g == null) {
/*  48 */       return false;
/*     */     }
/*     */     
/*  51 */     ☃.a("LootTable", this.g.toString());
/*  52 */     if (this.h != 0L) {
/*  53 */       ☃.a("LootTableSeed", this.h);
/*     */     }
/*  55 */     return true;
/*     */   }
/*     */   
/*     */   public void d(@Nullable aog ☃) {
/*  59 */     if (this.g != null && this.c_.z() != null) {
/*  60 */       Random random; ccq ccq = this.c_.z().aN().a(this.g);
/*  61 */       this.g = null;
/*     */       
/*  63 */       if (this.h == 0L) {
/*  64 */         random = new Random();
/*     */       } else {
/*  66 */         random = new Random(this.h);
/*     */       } 
/*  68 */       ccr.a a = new ccr.a((td)this.c_);
/*  69 */       a.a(this.d_);
/*  70 */       if (☃ != null) {
/*  71 */         a.a(☃.dJ());
/*     */       }
/*  73 */       ccq.a(this, random, a.a());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public pc Q_() {
/*  79 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(pc ☃, long l) {
/*  88 */     this.g = ☃;
/*  89 */     this.h = l;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/*  94 */     return (this.i != null);
/*     */   }
/*     */   
/*     */   public void a(@Nullable ij ☃) {
/*  98 */     this.i = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/* 104 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/* 109 */     d((aog)null);
/* 110 */     return q().get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/* 115 */     d((aog)null);
/*     */     
/* 117 */     ate ate = adf.a(q(), ☃, i);
/* 118 */     if (!ate.a()) {
/* 119 */       g();
/*     */     }
/* 121 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/* 126 */     d((aog)null);
/*     */     
/* 128 */     return adf.a(q(), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, @Nullable ate ate1) {
/* 133 */     d((aog)null);
/* 134 */     q().set(☃, ate1);
/* 135 */     if (ate1.C() > f()) {
/* 136 */       ate1.e(f());
/*     */     }
/* 138 */     g();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 143 */     if (this.c_.f(this.d_) != this) {
/* 144 */       return false;
/*     */     }
/* 146 */     if (☃.d(this.d_.o() + 0.5D, this.d_.p() + 0.5D, this.d_.q() + 0.5D) > 64.0D) {
/* 147 */       return false;
/*     */     }
/* 149 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(aog ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, ate ate1) {
/* 162 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 167 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int h() {
/* 176 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 181 */     q().clear();
/*     */   }
/*     */   
/*     */   protected abstract ez<ate> q();
/*     */   
/*     */   protected abstract void a(ez<ate> paramez);
/*     */ }


/* Location:              F:\dw\server.jar!\bka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */