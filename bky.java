/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class bky
/*     */ {
/*     */   private final axy a;
/*     */   private final el b;
/*     */   private final boolean c;
/*     */   private final el d;
/*     */   private final eq e;
/*  22 */   private final List<el> f = Lists.newArrayList();
/*  23 */   private final List<el> g = Lists.newArrayList();
/*     */   private final eq h;
/*     */   
/*     */   public bky(axy ☃, el el1, eq eq1, boolean bool) {
/*  27 */     this.a = ☃;
/*  28 */     this.b = el1;
/*  29 */     this.h = eq1;
/*  30 */     this.c = bool;
/*     */     
/*  32 */     if (bool) {
/*  33 */       this.e = eq1;
/*  34 */       this.d = el1.a(eq1);
/*     */     } else {
/*  36 */       this.e = eq1.d();
/*  37 */       this.d = el1.a(eq1, 2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  42 */     this.f.clear();
/*  43 */     this.g.clear();
/*     */     
/*  45 */     blc ☃ = this.a.a_(this.d);
/*     */     
/*  47 */     if (!bkv.a(☃, this.a, this.d, this.e, false, this.h)) {
/*  48 */       if (this.c && ☃.o() == bzc.b) {
/*  49 */         this.g.add(this.d);
/*  50 */         return true;
/*     */       } 
/*     */       
/*  53 */       return false;
/*     */     } 
/*     */ 
/*     */     
/*  57 */     if (!a(this.d, this.e))
/*     */     {
/*  59 */       return false;
/*     */     }
/*     */     
/*  62 */     for (int i = 0; i < this.f.size(); i++) {
/*  63 */       el el1 = this.f.get(i);
/*     */ 
/*     */       
/*  66 */       if (this.a.a_(el1).c() == bct.gt && 
/*  67 */         !a(el1))
/*     */       {
/*  69 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  74 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(el ☃, eq eq1) {
/*  78 */     blc blc = this.a.a_(☃);
/*  79 */     bcs bcs = blc.c();
/*  80 */     if (blc.f())
/*     */     {
/*  82 */       return true; } 
/*  83 */     if (!bkv.a(blc, this.a, ☃, this.e, false, eq1))
/*     */     {
/*  85 */       return true; } 
/*  86 */     if (☃.equals(this.b))
/*     */     {
/*  88 */       return true; } 
/*  89 */     if (this.f.contains(☃))
/*     */     {
/*  91 */       return true;
/*     */     }
/*     */     
/*  94 */     int i = 1;
/*  95 */     if (i + this.f.size() > 12)
/*     */     {
/*  97 */       return false;
/*     */     }
/*     */     
/* 100 */     while (bcs == bct.gt) {
/* 101 */       el el1 = ☃.a(this.e.d(), i);
/* 102 */       blc = this.a.a_(el1);
/* 103 */       bcs = blc.c();
/*     */       
/* 105 */       if (blc.f() || !bkv.a(blc, this.a, el1, this.e, false, this.e.d()) || el1.equals(this.b)) {
/*     */         break;
/*     */       }
/* 108 */       i++;
/* 109 */       if (i + this.f.size() > 12) {
/* 110 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 115 */     int j = 0;
/*     */     
/*     */     int k;
/* 118 */     for (k = i - 1; k >= 0; k--) {
/* 119 */       this.f.add(☃.a(this.e.d(), k));
/* 120 */       j++;
/*     */     } 
/*     */ 
/*     */     
/* 124 */     for (k = 1;; k++) {
/* 125 */       el el1 = ☃.a(this.e, k);
/*     */       
/* 127 */       int m = this.f.indexOf(el1);
/* 128 */       if (m > -1) {
/*     */         
/* 130 */         a(j, m);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 135 */         for (int n = 0; n <= m + j; n++) {
/* 136 */           el el2 = this.f.get(n);
/* 137 */           if (this.a.a_(el2).c() == bct.gt && 
/* 138 */             !a(el2)) {
/* 139 */             return false;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 144 */         return true;
/*     */       } 
/*     */       
/* 147 */       blc = this.a.a_(el1);
/*     */       
/* 149 */       if (blc.f())
/*     */       {
/* 151 */         return true;
/*     */       }
/*     */       
/* 154 */       if (!bkv.a(blc, this.a, el1, this.e, true, this.e) || el1.equals(this.b))
/*     */       {
/* 156 */         return false;
/*     */       }
/*     */       
/* 159 */       if (blc.o() == bzc.b) {
/* 160 */         this.g.add(el1);
/* 161 */         return true;
/*     */       } 
/*     */       
/* 164 */       if (this.f.size() >= 12) {
/* 165 */         return false;
/*     */       }
/*     */       
/* 168 */       this.f.add(el1);
/* 169 */       j++;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i) {
/* 174 */     List<el> list1 = Lists.newArrayList();
/* 175 */     List<el> list2 = Lists.newArrayList();
/* 176 */     List<el> list3 = Lists.newArrayList();
/*     */     
/* 178 */     list1.addAll(this.f.subList(0, i));
/* 179 */     list2.addAll(this.f.subList(this.f.size() - ☃, this.f.size()));
/* 180 */     list3.addAll(this.f.subList(i, this.f.size() - ☃));
/*     */     
/* 182 */     this.f.clear();
/* 183 */     this.f.addAll(list1);
/* 184 */     this.f.addAll(list2);
/* 185 */     this.f.addAll(list3);
/*     */   }
/*     */   
/*     */   private boolean a(el ☃) {
/* 189 */     for (eq eq1 : eq.values()) {
/* 190 */       if (eq1.k() != this.e.k() && 
/* 191 */         !a(☃.a(eq1), eq1)) {
/* 192 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 197 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<el> c() {
/* 205 */     return this.f;
/*     */   }
/*     */   
/*     */   public List<el> d() {
/* 209 */     return this.g;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bky.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */