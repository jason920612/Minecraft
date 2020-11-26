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
/*     */ public class bjs
/*     */   extends bji
/*     */   implements adl, pt
/*     */ {
/*     */   public int a;
/*     */   public float e;
/*     */   public float f;
/*     */   public float g;
/*     */   public float h;
/*     */   public float i;
/*     */   public float j;
/*     */   public float k;
/*     */   public float l;
/*     */   public float m;
/*  31 */   private static final Random n = new Random();
/*     */   private ij o;
/*     */   
/*     */   public bjs() {
/*  35 */     super(bjj.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  40 */     super.a(☃);
/*  41 */     if (O_()) {
/*  42 */       ☃.a("CustomName", ij.a.a(this.o));
/*     */     }
/*     */     
/*  45 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  50 */     super.b(☃);
/*  51 */     if (☃.c("CustomName", 8)) {
/*  52 */       this.o = ij.a.a(☃.l("CustomName"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/*  58 */     this.j = this.i;
/*  59 */     this.l = this.k;
/*     */     
/*  61 */     aog ☃ = this.c_.a((this.d_.o() + 0.5F), (this.d_.p() + 0.5F), (this.d_.q() + 0.5F), 3.0D, false);
/*  62 */     if (☃ != null) {
/*  63 */       double d1 = ☃.q - (this.d_.o() + 0.5F);
/*  64 */       double d2 = ☃.s - (this.d_.q() + 0.5F);
/*     */       
/*  66 */       this.m = (float)xq.c(d2, d1);
/*     */       
/*  68 */       this.i += 0.1F;
/*     */       
/*  70 */       if (this.i < 0.5F || n.nextInt(40) == 0) {
/*  71 */         float f = this.g;
/*     */         do {
/*  73 */           this.g += (n.nextInt(4) - n.nextInt(4));
/*  74 */         } while (f == this.g);
/*     */       } 
/*     */     } else {
/*  77 */       this.m += 0.02F;
/*  78 */       this.i -= 0.1F;
/*     */     } 
/*     */     
/*  81 */     while (this.k >= 3.1415927F) {
/*  82 */       this.k -= 6.2831855F;
/*     */     }
/*  84 */     while (this.k < -3.1415927F) {
/*  85 */       this.k += 6.2831855F;
/*     */     }
/*  87 */     while (this.m >= 3.1415927F) {
/*  88 */       this.m -= 6.2831855F;
/*     */     }
/*  90 */     while (this.m < -3.1415927F) {
/*  91 */       this.m += 6.2831855F;
/*     */     }
/*  93 */     float f1 = this.m - this.k;
/*  94 */     while (f1 >= 3.1415927F) {
/*  95 */       f1 -= 6.2831855F;
/*     */     }
/*  97 */     while (f1 < -3.1415927F) {
/*  98 */       f1 += 6.2831855F;
/*     */     }
/*     */     
/* 101 */     this.k += f1 * 0.4F;
/*     */     
/* 103 */     this.i = xq.a(this.i, 0.0F, 1.0F);
/*     */     
/* 105 */     this.a++;
/* 106 */     this.f = this.e;
/*     */     
/* 108 */     float f2 = (this.g - this.e) * 0.4F;
/* 109 */     float f3 = 0.2F;
/* 110 */     f2 = xq.a(f2, -0.2F, 0.2F);
/* 111 */     this.h += (f2 - this.h) * 0.9F;
/*     */     
/* 113 */     this.e += this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 118 */     if (this.o != null) {
/* 119 */       return this.o;
/*     */     }
/* 121 */     return new ir("container.enchant", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/* 126 */     return (this.o != null);
/*     */   }
/*     */   
/*     */   public void a(@Nullable ij ☃) {
/* 130 */     this.o = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/* 136 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 141 */     return new aqf(☃, this.c_, this.d_);
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 146 */     return "minecraft:enchanting_table";
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */