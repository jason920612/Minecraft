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
/*     */ public class aqc
/*     */   implements ade, aqy
/*     */ {
/*     */   private final ez<ate> a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final apv d;
/*     */   
/*     */   public aqc(apv ☃, int i, int j) {
/*  23 */     this.a = ez.a(i * j, ate.a);
/*  24 */     this.d = ☃;
/*  25 */     this.b = i;
/*  26 */     this.c = j;
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/*  31 */     return this.a.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/*  36 */     for (ate ☃ : this.a) {
/*  37 */       if (!☃.a()) {
/*  38 */         return false;
/*     */       }
/*     */     } 
/*  41 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/*  46 */     if (☃ >= T_()) {
/*  47 */       return ate.a;
/*     */     }
/*  49 */     return this.a.get(☃);
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
/*     */   public ij N_() {
/*  61 */     return new ir("container.crafting", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/*  66 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/*  72 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/*  77 */     return adf.a(this.a, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/*  82 */     ate ate = adf.a(this.a, ☃, i);
/*  83 */     if (!ate.a()) {
/*  84 */       this.d.a(this);
/*     */     }
/*  86 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/*  91 */     this.a.set(☃, ate1);
/*  92 */     this.d.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/*  97 */     return 64;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {}
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 106 */     return true;
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
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 124 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int h() {
/* 133 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 138 */     this.a.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public int n() {
/* 143 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public int U_() {
/* 148 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aoi ☃) {
/* 153 */     for (ate ate : this.a)
/* 154 */       ☃.a(ate); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aqc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */