/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import java.util.BitSet;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bmz<C extends bom>
/*     */   implements bmy<C>
/*     */ {
/*     */   protected final axz a;
/*     */   protected final long b;
/*     */   protected final ayw c;
/*  40 */   protected final Map<btl<? extends bqp>, Long2ObjectMap<bxc>> d = Maps.newHashMap();
/*  41 */   protected final Map<btl<? extends bqp>, Long2ObjectMap<LongSet>> e = Maps.newHashMap();
/*     */   
/*     */   public bmz(axz ☃, ayw ayw1) {
/*  44 */     this.a = ☃;
/*  45 */     this.b = ☃.r_();
/*  46 */     this.c = ayw1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ti ☃, boq.a a1) {
/*  51 */     boz boz = new boz(this.b);
/*  52 */     int i = 8;
/*     */     
/*  54 */     int j = ☃.a();
/*  55 */     int k = ☃.b();
/*     */     
/*  57 */     BitSet bitSet = ☃.b(j, k).a(a1);
/*  58 */     for (int m = j - 8; m <= j + 8; m++) {
/*  59 */       for (int n = k - 8; n <= k + 8; n++) {
/*  60 */         List<bwj<?>> list = ☃.H().f().b().a(new el(m * 16, 0, n * 16), null).a(a1);
/*     */         
/*  62 */         ListIterator<bwj<?>> listIterator = list.listIterator();
/*  63 */         while (listIterator.hasNext()) {
/*  64 */           int i1 = listIterator.nextIndex();
/*  65 */           bwj<?> bwj = listIterator.next();
/*  66 */           boz.c(☃.f().r_() + i1, m, n);
/*  67 */           if (bwj.a(☃, boz, m, n, bqp.e)) {
/*  68 */             bwj.a(☃, boz, m, n, j, k, bitSet, bqp.e);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(axy ☃, String str, el el1, int i, boolean bool) {
/*  78 */     btl<?> btl = bqo.aF.get(str.toLowerCase(Locale.ROOT));
/*  79 */     if (btl != null) {
/*  80 */       return btl.a(☃, this, el1, i, bool);
/*     */     }
/*     */     
/*  83 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(bmx ☃, Random random) {
/*  87 */     el.a a = new el.a();
/*  88 */     int i = ☃.d().d();
/*  89 */     int j = ☃.d().e();
/*     */     
/*  91 */     for (el el : el.a(i, 0, j, i + 16, 0, j + 16)) {
/*  92 */       for (int k = 4; k >= 0; k--) {
/*  93 */         if (k <= random.nextInt(5)) {
/*  94 */           ☃.a(a.c(el.o(), k, el.q()), bct.z.p(), false);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ti ☃) {
/* 102 */     bep.b = true;
/* 103 */     int i = ☃.a();
/* 104 */     int j = ☃.b();
/* 105 */     int k = i * 16;
/* 106 */     int m = j * 16;
/* 107 */     el el = new el(k, 0, m);
/* 108 */     ayu ayu = ☃.b(i + 1, j + 1).g()[0];
/*     */     
/* 110 */     boz boz = new boz();
/* 111 */     long l = boz.a(☃.r_(), k, m);
/* 112 */     for (boq.b b : boq.b.values()) {
/* 113 */       ayu.a(b, this, ☃, l, boz, el);
/*     */     }
/*     */     
/* 116 */     bep.b = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmx ☃, ayu[] arrayOfAyu, boz boz1, int i) {
/* 121 */     double d = 0.03125D;
/* 122 */     axm axm = ☃.d();
/* 123 */     int j = axm.d();
/* 124 */     int k = axm.e();
/* 125 */     double[] arrayOfDouble = a(axm.a, axm.b);
/*     */     
/* 127 */     for (int m = 0; m < 16; m++) {
/* 128 */       for (int n = 0; n < 16; n++) {
/* 129 */         int i1 = j + m;
/* 130 */         int i2 = k + n;
/* 131 */         int i3 = ☃.a(bor.a.a, m, n) + 1;
/*     */ 
/*     */         
/* 134 */         arrayOfAyu[n * 16 + m].a(boz1, ☃, i1, i2, i3, arrayOfDouble[n * 16 + m], a().r(), a().s(), i, this.a.r_());
/*     */       } 
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
/*     */   public boolean a(ayu ☃, btl<? extends bqp> btl1) {
/* 150 */     return ☃.a(btl1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bqp b(ayu ☃, btl<? extends bqp> btl1) {
/* 156 */     return ☃.b(btl1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ayw b() {
/* 161 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public long c() {
/* 166 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public Long2ObjectMap<bxc> a(btl<? extends bqp> ☃) {
/* 171 */     return this.d.computeIfAbsent(☃, ☃ -> Long2ObjectMaps.synchronize((Long2ObjectMap)new axq(8192, 10000)));
/*     */   }
/*     */ 
/*     */   
/*     */   public Long2ObjectMap<LongSet> b(btl<? extends bqp> ☃) {
/* 176 */     return this.e.computeIfAbsent(☃, ☃ -> Long2ObjectMaps.synchronize((Long2ObjectMap)new axq(8192, 10000)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/* 181 */     return 256;
/*     */   }
/*     */   
/*     */   public abstract C a();
/*     */   
/*     */   public abstract double[] a(int paramInt1, int paramInt2);
/*     */ }


/* Location:              F:\dw\server.jar!\bmz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */