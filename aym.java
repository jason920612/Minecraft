/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.TreeSet;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
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
/*     */ public class aym<T>
/*     */   implements ayo<T>
/*     */ {
/*     */   protected final Predicate<T> a;
/*     */   protected final Function<T, pc> b;
/*     */   protected final Function<pc, T> c;
/*  32 */   protected final Set<ayp<T>> d = Sets.newHashSet();
/*  33 */   protected final TreeSet<ayp<T>> e = new TreeSet<>();
/*     */   
/*     */   private final td f;
/*  36 */   private final List<ayp<T>> g = Lists.newArrayList();
/*     */   private final Consumer<ayp<T>> h;
/*     */   
/*     */   public aym(td ☃, Predicate<T> predicate, Function<T, pc> function, Function<pc, T> function1, Consumer<ayp<T>> consumer) {
/*  40 */     this.a = predicate;
/*  41 */     this.b = function;
/*  42 */     this.c = function1;
/*  43 */     this.f = ☃;
/*  44 */     this.h = consumer;
/*     */   }
/*     */   
/*     */   public void a() {
/*  48 */     int ☃ = this.e.size();
/*  49 */     if (☃ != this.d.size()) {
/*  50 */       throw new IllegalStateException("TickNextTick list out of synch");
/*     */     }
/*  52 */     if (☃ > 65536) {
/*  53 */       ☃ = 65536;
/*     */     }
/*     */     
/*  56 */     this.f.A.a("cleaning");
/*  57 */     for (int i = 0; i < ☃; i++) {
/*  58 */       ayp<T> ayp = this.e.first();
/*  59 */       if (ayp.b > this.f.V()) {
/*     */         break;
/*     */       }
/*     */       
/*  63 */       this.e.remove(ayp);
/*  64 */       this.d.remove(ayp);
/*  65 */       this.g.add(ayp);
/*     */     } 
/*  67 */     this.f.A.e();
/*     */     
/*  69 */     this.f.A.a("ticking");
/*  70 */     Iterator<ayp<T>> iterator = this.g.iterator();
/*  71 */     while (iterator.hasNext()) {
/*  72 */       ayp<T> ayp = iterator.next();
/*  73 */       iterator.remove();
/*     */       
/*  75 */       int j = 0;
/*     */       
/*  77 */       if (this.f.b(ayp.a.a(0, 0, 0), ayp.a.a(0, 0, 0))) {
/*     */         try {
/*  79 */           this.h.accept(ayp);
/*  80 */         } catch (Throwable throwable) {
/*  81 */           b b = b.a(throwable, "Exception while ticking");
/*  82 */           c c = b.a("Block being ticked");
/*  83 */           c.a(c, ayp.a, (blc)null);
/*  84 */           throw new h(b);
/*     */         }  continue;
/*     */       } 
/*  87 */       a(ayp.a, ayp.a(), 0);
/*     */     } 
/*     */     
/*  90 */     this.f.A.e();
/*     */     
/*  92 */     this.g.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(el ☃, T t) {
/*  97 */     return this.g.contains(new ayp<>(☃, t));
/*     */   }
/*     */   
/*     */   public List<ayp<T>> a(bnj ☃, boolean bool) {
/* 101 */     axm axm = ☃.d();
/* 102 */     int i = (axm.a << 4) - 2;
/* 103 */     int j = i + 16 + 2;
/* 104 */     int k = (axm.b << 4) - 2;
/* 105 */     int m = k + 16 + 2;
/*     */     
/* 107 */     return a(new bwf(i, 0, k, j, 256, m), bool);
/*     */   }
/*     */   
/*     */   public List<ayp<T>> a(bwf ☃, boolean bool) {
/* 111 */     List<ayp<T>> list = null;
/*     */     
/* 113 */     for (int i = 0; i < 2; i++) {
/*     */       Iterator<ayp<T>> iterator;
/* 115 */       if (i == 0) {
/* 116 */         iterator = this.e.iterator();
/*     */       } else {
/* 118 */         iterator = this.g.iterator();
/*     */       } 
/*     */       
/* 121 */       while (iterator.hasNext()) {
/* 122 */         ayp<T> ayp = iterator.next();
/* 123 */         el el = ayp.a;
/* 124 */         if (el.o() >= ☃.a && el.o() < ☃.d && el.q() >= ☃.c && el.q() < ☃.f) {
/* 125 */           if (bool) {
/* 126 */             if (i == 0) {
/* 127 */               this.d.remove(ayp);
/*     */             }
/* 129 */             iterator.remove();
/*     */           } 
/* 131 */           if (list == null) {
/* 132 */             list = Lists.newArrayList();
/*     */           }
/* 134 */           list.add(ayp);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 139 */     return (list == null) ? Collections.<ayp<T>>emptyList() : list;
/*     */   }
/*     */   
/*     */   public void a(bwf ☃, el el1) {
/* 143 */     List<ayp<T>> list = a(☃, false);
/* 144 */     for (ayp<T> ayp : list) {
/* 145 */       if (☃.b(ayp.a)) {
/* 146 */         el el2 = ayp.a.a(el1);
/* 147 */         b(el2, ayp.a(), (int)(ayp.b - this.f.g().e()), ayp.c);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public he a(bnj ☃) {
/* 153 */     List<ayp<T>> list = a(☃, false);
/* 154 */     long l = this.f.V();
/*     */     
/* 156 */     he he = new he();
/* 157 */     for (ayp<T> ayp : list) {
/* 158 */       gy gy = new gy();
/* 159 */       gy.a("i", ((pc)this.b.apply(ayp.a())).toString());
/* 160 */       gy.b("x", ayp.a.o());
/* 161 */       gy.b("y", ayp.a.p());
/* 162 */       gy.b("z", ayp.a.q());
/* 163 */       gy.b("t", (int)(ayp.b - l));
/* 164 */       gy.b("p", ayp.c.a());
/*     */       
/* 166 */       he.a(gy);
/*     */     } 
/*     */     
/* 169 */     return he;
/*     */   }
/*     */   
/*     */   public void a(he ☃) {
/* 173 */     for (int i = 0; i < ☃.size(); i++) {
/* 174 */       gy gy = ☃.e(i);
/*     */       
/* 176 */       T t = this.c.apply(new pc(gy.l("i")));
/* 177 */       if (t != null) {
/* 178 */         b(new el(gy.h("x"), gy.h("y"), gy.h("z")), t, gy.h("t"), ayq.a(gy.h("p")));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(el ☃, T t) {
/* 185 */     return this.d.contains(new ayp<>(☃, t));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(el ☃, T t, int i, ayq ayq1) {
/* 190 */     if (this.a.test(t)) {
/*     */       return;
/*     */     }
/*     */     
/* 194 */     if (this.f.D(☃)) {
/* 195 */       c(☃, t, i, ayq1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(el ☃, T t, int i, ayq ayq1) {
/* 200 */     if (!this.a.test(t)) {
/* 201 */       c(☃, t, i, ayq1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(el ☃, T t, int i, ayq ayq1) {
/* 206 */     ayp<T> ayp = new ayp<>(☃, t, i + this.f.V(), ayq1);
/* 207 */     if (!this.d.contains(ayp)) {
/* 208 */       this.d.add(ayp);
/* 209 */       this.e.add(ayp);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aym.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */