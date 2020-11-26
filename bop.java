/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.BitSet;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class bop
/*     */   extends bmz<bud>
/*     */ {
/*  35 */   private static final Logger f = LogManager.getLogger();
/*     */   
/*     */   private final bud g;
/*     */   private final ayu h;
/*  39 */   private final bow i = new bow();
/*     */   
/*     */   class a extends ayu {
/*     */     protected a(bop ☃, bxr<?> bxr1, ayu.d d1, ayu.b b1, float f1, float f2, float f3, float f4, int i, int j, @Nullable String str) {
/*  43 */       super((new ayu.a())
/*  44 */           .a(bxr1)
/*  45 */           .a(d1)
/*  46 */           .a(b1)
/*  47 */           .a(f1)
/*  48 */           .b(f2)
/*  49 */           .c(f3)
/*  50 */           .d(f4)
/*  51 */           .a(i)
/*  52 */           .b(j)
/*  53 */           .a(str));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public bop(axz ☃, ayw ayw1, bud bud1) {
/*  59 */     super(☃, ayw1);
/*  60 */     this.g = bud1;
/*  61 */     this.h = g();
/*     */   }
/*     */   
/*     */   private ayu g() {
/*  65 */     ayu ☃ = this.g.t();
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
/*  76 */     a a = new a(this, ☃.q(), ☃.c(), ☃.p(), ☃.h(), ☃.l(), ☃.m(), ☃.i(), ☃.n(), ☃.o(), ☃.s());
/*     */ 
/*     */     
/*  79 */     Map<String, Map<String, String>> map = this.g.u();
/*  80 */     for (String str : map.keySet()) {
/*  81 */       bpn[] arrayOfBpn = (bpn[])bud.u.get(str);
/*  82 */       if (arrayOfBpn == null) {
/*     */         continue;
/*     */       }
/*  85 */       for (bpn<?, ?> bpn : arrayOfBpn) {
/*  86 */         a.a(bud.t.get(bpn), bpn);
/*     */         
/*  88 */         bqo<?> bqo = bpn.a();
/*  89 */         if (bqo instanceof btl) {
/*  90 */           bqp bqp = ☃.b((btl)bqo);
/*  91 */           a.a((btl)bqo, (bqp != null) ? bqp : bud.v.get(bpn));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  96 */     boolean bool = ((!this.g.y() || ☃ == ayz.aa) && map.containsKey("decoration"));
/*     */     
/*  98 */     if (bool) {
/*  99 */       List<boq.b> list = Lists.newArrayList();
/* 100 */       list.add(boq.b.c);
/* 101 */       list.add(boq.b.d);
/*     */       
/* 103 */       for (boq.b b : boq.b.values()) {
/* 104 */         if (!list.contains(b)) {
/* 105 */           for (bpn<?, ?> bpn : ☃.a(b)) {
/* 106 */             a.a(b, bpn);
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 112 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmx ☃) {
/* 117 */     axm axm = ☃.d();
/* 118 */     int i = axm.a;
/* 119 */     int j = axm.b;
/* 120 */     ayu[] arrayOfAyu = this.c.b(i * 16, j * 16, 16, 16);
/* 121 */     ☃.a(arrayOfAyu);
/*     */     
/* 123 */     a(i, j, ☃);
/*     */     
/* 125 */     ☃.a(new bor.a[] { bor.a.a, bor.a.b });
/* 126 */     ☃.a(bnd.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ti ☃, boq.a a1) {
/* 131 */     int i = 8;
/*     */     
/* 133 */     int j = ☃.a();
/* 134 */     int k = ☃.b();
/*     */     
/* 136 */     BitSet bitSet = new BitSet(65536);
/* 137 */     boz boz = new boz();
/*     */     
/* 139 */     for (int m = j - 8; m <= j + 8; m++) {
/* 140 */       for (int n = k - 8; n <= k + 8; n++) {
/* 141 */         List<bwj<?>> list = this.h.a(boq.a.a);
/*     */         
/* 143 */         ListIterator<bwj<?>> listIterator = list.listIterator();
/* 144 */         while (listIterator.hasNext()) {
/* 145 */           int i1 = listIterator.nextIndex();
/* 146 */           bwj<?> bwj = listIterator.next();
/* 147 */           boz.c(☃.f().r_() + i1, m, n);
/* 148 */           if (bwj.a(☃, boz, m, n, bqp.e)) {
/* 149 */             bwj.a(☃, boz, m, n, j, k, bitSet, bqp.e);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bud f() {
/* 158 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public double[] a(int ☃, int i) {
/* 163 */     return new double[0];
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 168 */     bmx ☃ = this.a.b(0, 0);
/* 169 */     return ☃.a(bor.a.d, 8, 8);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ti ☃) {
/* 174 */     int i = ☃.a();
/* 175 */     int j = ☃.b();
/* 176 */     int k = i * 16;
/* 177 */     int m = j * 16;
/* 178 */     el el = new el(k, 0, m);
/*     */     
/* 180 */     boz boz = new boz();
/* 181 */     long l = boz.a(☃.r_(), k, m);
/* 182 */     for (boq.b b : boq.b.values()) {
/* 183 */       this.h.a(b, this, ☃, l, boz, el);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(ti ☃) {}
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, bmx bmx1) {
/* 193 */     blc[] arrayOfBlc = this.g.A();
/* 194 */     el.a a = new el.a();
/*     */     
/* 196 */     for (int j = 0; j < arrayOfBlc.length; j++) {
/* 197 */       blc blc = arrayOfBlc[j];
/* 198 */       if (blc != null)
/*     */       {
/*     */ 
/*     */         
/* 202 */         for (int k = 0; k < 16; k++) {
/* 203 */           for (int m = 0; m < 16; m++) {
/* 204 */             bmx1.a(a.c(k, j, m), blc, false);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<ayu.e> a(afc ☃, el el1) {
/* 212 */     ayu ayu1 = this.a.d(el1);
/* 213 */     return ayu1.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(axy ☃, boolean bool1, boolean bool2) {
/* 218 */     int i = 0;
/* 219 */     i += this.i.a(☃, bool1, bool2);
/* 220 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ayu ☃, btl<? extends bqp> btl1) {
/* 225 */     return this.h.a(btl1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bqp b(ayu ☃, btl<? extends bqp> btl1) {
/* 231 */     return this.h.b(btl1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(axy ☃, String str, el el1, int i, boolean bool) {
/* 237 */     if (!this.g.u().keySet().contains(str)) {
/* 238 */       return null;
/*     */     }
/* 240 */     return super.a(☃, str, el1, i, bool);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */