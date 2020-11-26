/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aji
/*     */   extends cbo
/*     */ {
/*     */   private axy a;
/*  26 */   private final List<el> b = Lists.newArrayList();
/*  27 */   private final List<ajf> c = Lists.newArrayList();
/*  28 */   private final List<ajg> d = Lists.newArrayList();
/*     */   private int e;
/*     */   
/*     */   public aji(String ☃) {
/*  32 */     super(☃);
/*     */   }
/*     */   
/*     */   public aji(axy ☃) {
/*  36 */     super(a(☃.t));
/*  37 */     this.a = ☃;
/*  38 */     c();
/*     */   }
/*     */   
/*     */   public void a(axy ☃) {
/*  42 */     this.a = ☃;
/*     */     
/*  44 */     for (ajg ajg : this.d) {
/*  45 */       ajg.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(el ☃) {
/*  50 */     if (this.b.size() > 64) {
/*     */       return;
/*     */     }
/*  53 */     if (!d(☃)) {
/*  54 */       this.b.add(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/*  59 */     this.e++;
/*  60 */     for (ajg ☃ : this.d) {
/*  61 */       ☃.a(this.e);
/*     */     }
/*  63 */     f();
/*  64 */     g();
/*  65 */     h();
/*     */     
/*  67 */     if (this.e % 400 == 0) {
/*  68 */       c();
/*     */     }
/*     */   }
/*     */   
/*     */   private void f() {
/*  73 */     for (Iterator<ajg> ☃ = this.d.iterator(); ☃.hasNext(); ) {
/*  74 */       ajg ajg = ☃.next();
/*  75 */       if (ajg.g()) {
/*  76 */         ☃.remove();
/*  77 */         c();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<ajg> b() {
/*  83 */     return this.d;
/*     */   }
/*     */   
/*     */   public ajg a(el ☃, int i) {
/*  87 */     ajg ajg = null;
/*  88 */     double d = 3.4028234663852886E38D;
/*  89 */     for (ajg ajg1 : this.d) {
/*  90 */       double d1 = ajg1.a().n(☃);
/*  91 */       if (d1 >= d) {
/*     */         continue;
/*     */       }
/*     */       
/*  95 */       float f = (i + ajg1.b());
/*  96 */       if (d1 > (f * f)) {
/*     */         continue;
/*     */       }
/*     */       
/* 100 */       ajg = ajg1;
/* 101 */       d = d1;
/*     */     } 
/* 103 */     return ajg;
/*     */   }
/*     */   
/*     */   private void g() {
/* 107 */     if (this.b.isEmpty()) {
/*     */       return;
/*     */     }
/* 110 */     b(this.b.remove(0));
/*     */   }
/*     */ 
/*     */   
/*     */   private void h() {
/* 115 */     for (int ☃ = 0; ☃ < this.c.size(); ☃++) {
/* 116 */       ajf ajf = this.c.get(☃);
/* 117 */       ajg ajg = a(ajf.d(), 32);
/* 118 */       if (ajg == null) {
/*     */         
/* 120 */         ajg = new ajg(this.a);
/* 121 */         this.d.add(ajg);
/* 122 */         c();
/*     */       } 
/* 124 */       ajg.a(ajf);
/*     */     } 
/*     */     
/* 127 */     this.c.clear();
/*     */   }
/*     */   
/*     */   private void b(el ☃) {
/* 131 */     int i = 16;
/* 132 */     int j = 4;
/* 133 */     int k = 16;
/*     */ 
/*     */     
/* 136 */     el.a a = new el.a();
/* 137 */     for (int m = -16; m < 16; m++) {
/* 138 */       for (int n = -4; n < 4; n++) {
/* 139 */         for (int i1 = -16; i1 < 16; i1++) {
/* 140 */           a.g(☃).d(m, n, i1);
/* 141 */           blc blc = this.a.a_(a);
/* 142 */           if (a(blc)) {
/* 143 */             ajf ajf = c(a);
/* 144 */             if (ajf == null) {
/* 145 */               a(blc, a);
/*     */             } else {
/* 147 */               ajf.a(this.e);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ajf c(el ☃) {
/* 157 */     for (ajf ajf : this.c) {
/* 158 */       if (ajf.d().o() == ☃.o() && ajf.d().q() == ☃.q() && Math.abs(ajf.d().p() - ☃.p()) <= 1) {
/* 159 */         return ajf;
/*     */       }
/*     */     } 
/* 162 */     for (ajg ajg : this.d) {
/* 163 */       ajf ajf = ajg.e(☃);
/* 164 */       if (ajf != null) {
/* 165 */         return ajf;
/*     */       }
/*     */     } 
/* 168 */     return null;
/*     */   }
/*     */   
/*     */   private void a(blc ☃, el el1) {
/* 172 */     eq eq1 = (eq)☃.c(bed.a);
/* 173 */     eq eq2 = eq1.d();
/*     */     
/* 175 */     int i = a(el1, eq1, 5);
/* 176 */     int j = a(el1, eq2, i + 1);
/*     */     
/* 178 */     if (i != j) {
/* 179 */       this.c.add(new ajf(el1, (i < j) ? eq1 : eq2, this.e));
/*     */     }
/*     */   }
/*     */   
/*     */   private int a(el ☃, eq eq1, int i) {
/* 184 */     int j = 0;
/* 185 */     for (int k = 1; k <= 5; k++) {
/* 186 */       if (this.a.e(☃.a(eq1, k)))
/*     */       {
/* 188 */         if (++j >= i) {
/* 189 */           return j;
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 194 */     return j;
/*     */   }
/*     */   
/*     */   private boolean d(el ☃) {
/* 198 */     for (el el1 : this.b) {
/* 199 */       if (el1.equals(☃)) {
/* 200 */         return true;
/*     */       }
/*     */     } 
/* 203 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(blc ☃) {
/* 207 */     return (☃.c() instanceof bed && ☃.d() == bza.w);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 212 */     this.e = ☃.h("Tick");
/* 213 */     he he = ☃.d("Villages", 10);
/* 214 */     for (int i = 0; i < he.size(); i++) {
/* 215 */       gy gy1 = he.e(i);
/* 216 */       ajg ajg = new ajg();
/* 217 */       ajg.a(gy1);
/* 218 */       this.d.add(ajg);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public gy b(gy ☃) {
/* 224 */     ☃.b("Tick", this.e);
/* 225 */     he he = new he();
/* 226 */     for (ajg ajg : this.d) {
/* 227 */       gy gy1 = new gy();
/* 228 */       ajg.b(gy1);
/* 229 */       he.a(gy1);
/*     */     } 
/* 231 */     ☃.a("Villages", he);
/*     */     
/* 233 */     return ☃;
/*     */   }
/*     */   
/*     */   public static String a(boc ☃) {
/* 237 */     return "villages" + ☃.q().d();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */