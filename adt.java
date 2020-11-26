/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adt
/*     */   implements ade, aqy
/*     */ {
/*     */   private final ij a;
/*     */   private final int b;
/*     */   private final ez<ate> c;
/*     */   private List<adg> d;
/*     */   private ij e;
/*     */   
/*     */   public adt(ij ☃, int i) {
/*  22 */     this.a = ☃;
/*  23 */     this.b = i;
/*  24 */     this.c = ez.a(i, ate.a);
/*     */   }
/*     */   
/*     */   public void a(adg ☃) {
/*  28 */     if (this.d == null) {
/*  29 */       this.d = Lists.newArrayList();
/*     */     }
/*  31 */     this.d.add(☃);
/*     */   }
/*     */   
/*     */   public void b(adg ☃) {
/*  35 */     this.d.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃) {
/*  40 */     if (☃ < 0 || ☃ >= this.c.size()) {
/*  41 */       return ate.a;
/*     */     }
/*  43 */     return this.c.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(int ☃, int i) {
/*  48 */     ate ate = adf.a(this.c, ☃, i);
/*  49 */     if (!ate.a()) {
/*  50 */       g();
/*     */     }
/*  52 */     return ate;
/*     */   }
/*     */   
/*     */   public ate a(ate ☃) {
/*  56 */     ate ate1 = ☃.i();
/*     */     
/*  58 */     for (int i = 0; i < this.b; i++) {
/*  59 */       ate ate2 = a(i);
/*  60 */       if (ate2.a()) {
/*  61 */         a(i, ate1);
/*  62 */         g();
/*  63 */         return ate.a;
/*     */       } 
/*  65 */       if (ate.c(ate2, ate1)) {
/*  66 */         int j = Math.min(f(), ate2.c());
/*  67 */         int k = Math.min(ate1.C(), j - ate2.C());
/*  68 */         if (k > 0) {
/*  69 */           ate2.f(k);
/*  70 */           ate1.g(k);
/*  71 */           if (ate1.a()) {
/*  72 */             g();
/*  73 */             return ate.a;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  78 */     if (ate1.C() != ☃.C()) {
/*  79 */       g();
/*     */     }
/*  81 */     return ate1;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(int ☃) {
/*  86 */     ate ate = this.c.get(☃);
/*  87 */     if (ate.a()) {
/*  88 */       return ate.a;
/*     */     }
/*  90 */     this.c.set(☃, ate.a);
/*  91 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ate ate1) {
/*  96 */     this.c.set(☃, ate1);
/*  97 */     if (!ate1.a() && ate1.C() > f()) {
/*  98 */       ate1.e(f());
/*     */     }
/* 100 */     g();
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/* 105 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/* 110 */     for (ate ☃ : this.c) {
/* 111 */       if (!☃.a()) {
/* 112 */         return false;
/*     */       }
/*     */     } 
/* 115 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/* 120 */     return (this.e != null) ? this.e : this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/* 126 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/* 131 */     return (this.e != null);
/*     */   }
/*     */   
/*     */   public void a(@Nullable ij ☃) {
/* 135 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 140 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {
/* 145 */     if (this.d != null) {
/* 146 */       for (int ☃ = 0; ☃ < this.d.size(); ☃++) {
/* 147 */         ((adg)this.d.get(☃)).a(this);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 154 */     return true;
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
/* 167 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(int ☃) {
/* 172 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int h() {
/* 181 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 186 */     this.c.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aoi ☃) {
/* 191 */     for (ate ate : this.c)
/* 192 */       ☃.b(ate); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\adt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */