/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afr
/*     */   implements afn
/*     */ {
/*     */   private final afq a;
/*     */   private final afm b;
/*  16 */   private final Map<Integer, Set<afo>> c = Maps.newHashMap();
/*  17 */   private final Map<String, Set<afo>> d = Maps.newHashMap();
/*  18 */   private final Map<UUID, afo> e = Maps.newHashMap();
/*     */   private double f;
/*     */   private boolean g = true;
/*     */   private double h;
/*     */   
/*     */   public afr(afq ☃, afm afm1) {
/*  24 */     this.a = ☃;
/*  25 */     this.b = afm1;
/*  26 */     this.f = afm1.b();
/*     */     
/*  28 */     for (int i = 0; i < 3; i++) {
/*  29 */       this.c.put(Integer.valueOf(i), Sets.newHashSet());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public afm a() {
/*  35 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public double b() {
/*  40 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃) {
/*  45 */     if (☃ == b()) {
/*     */       return;
/*     */     }
/*  48 */     this.f = ☃;
/*  49 */     f();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<afo> a(int ☃) {
/*  54 */     return this.c.get(Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<afo> c() {
/*  59 */     Set<afo> ☃ = Sets.newHashSet();
/*     */     
/*  61 */     for (int i = 0; i < 3; i++) {
/*  62 */       ☃.addAll(a(i));
/*     */     }
/*     */     
/*  65 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afo a(UUID ☃) {
/*  71 */     return this.e.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(afo ☃) {
/*  76 */     return (this.e.get(☃.a()) != null);
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
/*     */   public void b(afo ☃) {
/*  88 */     if (a(☃.a()) != null) {
/*  89 */       throw new IllegalArgumentException("Modifier is already applied on this attribute!");
/*     */     }
/*     */     
/*  92 */     Set<afo> set = this.d.get(☃.b());
/*     */     
/*  94 */     if (set == null) {
/*  95 */       set = Sets.newHashSet();
/*  96 */       this.d.put(☃.b(), set);
/*     */     } 
/*     */     
/*  99 */     ((Set<afo>)this.c.get(Integer.valueOf(☃.c()))).add(☃);
/* 100 */     set.add(☃);
/* 101 */     this.e.put(☃.a(), ☃);
/*     */     
/* 103 */     f();
/*     */   }
/*     */   
/*     */   protected void f() {
/* 107 */     this.g = true;
/* 108 */     this.a.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(afo ☃) {
/* 113 */     for (int i = 0; i < 3; i++) {
/* 114 */       Set<afo> set1 = this.c.get(Integer.valueOf(i));
/* 115 */       set1.remove(☃);
/*     */     } 
/*     */     
/* 118 */     Set<afo> set = this.d.get(☃.b());
/*     */     
/* 120 */     if (set != null) {
/* 121 */       set.remove(☃);
/*     */       
/* 123 */       if (set.isEmpty()) {
/* 124 */         this.d.remove(☃.b());
/*     */       }
/*     */     } 
/*     */     
/* 128 */     this.e.remove(☃.a());
/* 129 */     f();
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
/*     */   public void b(UUID ☃) {
/* 153 */     afo afo = a(☃);
/* 154 */     if (afo != null) {
/* 155 */       c(afo);
/*     */     }
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
/*     */   public double e() {
/* 175 */     if (this.g) {
/* 176 */       this.h = g();
/* 177 */       this.g = false;
/*     */     } 
/*     */     
/* 180 */     return this.h;
/*     */   }
/*     */   
/*     */   private double g() {
/* 184 */     double ☃ = b();
/*     */     
/* 186 */     for (afo afo : b(0)) {
/* 187 */       ☃ += afo.d();
/*     */     }
/*     */     
/* 190 */     double d1 = ☃;
/*     */     
/* 192 */     for (afo afo : b(1)) {
/* 193 */       d1 += ☃ * afo.d();
/*     */     }
/*     */     
/* 196 */     for (afo afo : b(2)) {
/* 197 */       d1 *= 1.0D + afo.d();
/*     */     }
/*     */     
/* 200 */     return this.b.a(d1);
/*     */   }
/*     */   
/*     */   private Collection<afo> b(int ☃) {
/* 204 */     Set<afo> set = Sets.newHashSet(a(☃));
/*     */     
/* 206 */     afm afm1 = this.b.d();
/* 207 */     while (afm1 != null) {
/* 208 */       afn afn1 = this.a.a(afm1);
/* 209 */       if (afn1 != null) {
/* 210 */         set.addAll(afn1.a(☃));
/*     */       }
/* 212 */       afm1 = afm1.d();
/*     */     } 
/*     */     
/* 215 */     return set;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\afr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */