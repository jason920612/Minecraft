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
/*     */ public class aqn
/*     */   implements ade
/*     */ {
/*     */   private final axd a;
/*  18 */   private final ez<ate> b = ez.a(3, ate.a);
/*     */   private final aog c;
/*     */   private axe d;
/*     */   private int e;
/*     */   
/*     */   public aqn(aog ☃, axd axd1) {
/*  24 */     this.c = ☃;
/*  25 */     this.a = axd1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/*  30 */     return this.b.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/*  35 */     for (ate ☃ : this.b) {
/*  36 */       if (!☃.a()) {
/*  37 */         return false;
/*     */       }
/*     */     } 
/*  40 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/*  45 */     return this.b.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/*  50 */     ate ate1 = this.b.get(☃);
/*  51 */     if (☃ == 2 && !ate1.a()) {
/*  52 */       return adf.a(this.b, ☃, ate1.C());
/*     */     }
/*     */     
/*  55 */     ate ate2 = adf.a(this.b, ☃, i);
/*  56 */     if (!ate2.a() && e(☃)) {
/*  57 */       i();
/*     */     }
/*  59 */     return ate2;
/*     */   }
/*     */   
/*     */   private boolean e(int ☃) {
/*  63 */     return (☃ == 0 || ☃ == 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/*  68 */     return adf.a(this.b, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/*  73 */     this.b.set(☃, ate1);
/*  74 */     if (!ate1.a() && ate1.C() > f()) {
/*  75 */       ate1.e(f());
/*     */     }
/*  77 */     if (e(☃)) {
/*  78 */       i();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/*  84 */     return new ir("mob.villager", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/*  89 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/*  95 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 100 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 105 */     return (this.a.M_() == ☃);
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
/* 118 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {
/* 123 */     i();
/*     */   }
/*     */   
/*     */   public void i() {
/* 127 */     this.d = null;
/*     */     
/* 129 */     ate ☃ = this.b.get(0);
/* 130 */     ate ate1 = this.b.get(1);
/*     */     
/* 132 */     if (☃.a()) {
/* 133 */       ☃ = ate1;
/* 134 */       ate1 = ate.a;
/*     */     } 
/*     */     
/* 137 */     if (☃.a()) {
/* 138 */       a(2, ate.a);
/*     */     } else {
/* 140 */       axf axf = this.a.b_(this.c);
/* 141 */       if (axf != null) {
/* 142 */         axe axe1 = axf.a(☃, ate1, this.e);
/* 143 */         if (axe1 != null && !axe1.h()) {
/* 144 */           this.d = axe1;
/* 145 */           a(2, axe1.d().i());
/* 146 */         } else if (!ate1.a()) {
/*     */           
/* 148 */           axe1 = axf.a(ate1, ☃, this.e);
/* 149 */           if (axe1 != null && !axe1.h()) {
/* 150 */             this.d = axe1;
/* 151 */             a(2, axe1.d().i());
/*     */           } else {
/* 153 */             a(2, ate.a);
/*     */           } 
/*     */         } else {
/* 156 */           a(2, ate.a);
/*     */         } 
/*     */       } 
/* 159 */       this.a.a(a(2));
/*     */     } 
/*     */   }
/*     */   
/*     */   public axe j() {
/* 164 */     return this.d;
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 168 */     this.e = ☃;
/* 169 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 174 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int h() {
/* 183 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 188 */     this.b.clear();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aqn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */