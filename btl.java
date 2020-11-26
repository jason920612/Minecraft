/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class btl<C extends bqp>
/*     */   extends bqo<C>
/*     */ {
/*  45 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  47 */   public static final bxc a = new bxc()
/*     */     {
/*     */       public boolean b() {
/*  50 */         return false;
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   public boolean a(axz ☃, bmy<? extends bom> bmy1, Random random, el el1, C c) {
/*  56 */     if (!a(☃)) {
/*  57 */       return false;
/*     */     }
/*     */     
/*  60 */     int i = b();
/*     */     
/*  62 */     int j = el1.o() >> 4;
/*  63 */     int k = el1.q() >> 4;
/*  64 */     int m = j << 4;
/*  65 */     int n = k << 4;
/*  66 */     long l = axm.a(j, k);
/*     */     
/*  68 */     boolean bool = false;
/*  69 */     for (int i1 = j - i; i1 <= j + i; i1++) {
/*  70 */       for (int i2 = k - i; i2 <= k + i; i2++) {
/*  71 */         long l1 = axm.a(i1, i2);
/*  72 */         bxc bxc1 = a(☃, bmy1, (boz)random, l1);
/*     */         
/*  74 */         if (bxc1 != a && bxc1.c().a(m, n, m + 15, n + 15)) {
/*  75 */           ((LongSet)bmy1.b(this).computeIfAbsent(l, ☃ -> new LongOpenHashSet())).add(l1);
/*  76 */           ☃.H().a(j, k, true).a(a(), l1);
/*     */           
/*  78 */           bxc1.a(☃, random, new bwf(m, n, m + 15, n + 15), new axm(j, k));
/*  79 */           bxc1.b(new axm(j, k));
/*  80 */           bool = true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  89 */     return bool;
/*     */   }
/*     */   
/*     */   protected bxc a(axz ☃, el el1) {
/*  93 */     List<bxc> list = a(☃, el1.o() >> 4, el1.q() >> 4);
/*  94 */     for (bxc bxc1 : list) {
/*  95 */       if (bxc1.b() && 
/*  96 */         bxc1.c().b(el1)) {
/*  97 */         Iterator<bxb> iterator = bxc1.d().iterator();
/*  98 */         while (iterator.hasNext()) {
/*  99 */           bxb bxb = iterator.next();
/* 100 */           if (bxb.d().b(el1)) {
/* 101 */             return bxc1;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 107 */     return a;
/*     */   }
/*     */   
/*     */   public boolean b(axz ☃, el el1) {
/* 111 */     List<bxc> list = a(☃, el1.o() >> 4, el1.q() >> 4);
/* 112 */     for (bxc bxc1 : list) {
/* 113 */       if (bxc1.b() && 
/* 114 */         bxc1.c().b(el1)) {
/* 115 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 119 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(axz ☃, el el1) {
/* 126 */     return a(☃, el1).b();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public el a(axy ☃, bmy<? extends bom> bmy1, el el1, int i, boolean bool) {
/* 131 */     if (!bmy1.b().a(this)) {
/* 132 */       return null;
/*     */     }
/*     */     
/* 135 */     int j = el1.o() >> 4;
/* 136 */     int k = el1.q() >> 4;
/*     */     
/* 138 */     int m = 0;
/* 139 */     boz boz = new boz();
/* 140 */     while (m <= i) {
/* 141 */       for (int n = -m; n <= m; n++) {
/* 142 */         boolean bool1 = (n == -m || n == m);
/* 143 */         for (int i1 = -m; i1 <= m; i1++) {
/* 144 */           boolean bool2 = (i1 == -m || i1 == m);
/* 145 */           if (bool1 || bool2) {
/*     */ 
/*     */ 
/*     */             
/* 149 */             axm axm = a(bmy1, boz, j, k, n, i1);
/* 150 */             bxc bxc1 = a(☃, bmy1, boz, axm.a());
/*     */             
/* 152 */             if (bxc1 != a) {
/* 153 */               if (bool && bxc1.g()) {
/* 154 */                 bxc1.h();
/* 155 */                 return bxc1.a();
/* 156 */               }  if (!bool) {
/* 157 */                 return bxc1.a();
/*     */               }
/*     */             } 
/*     */             
/* 161 */             if (m == 0)
/*     */               break; 
/*     */           } 
/*     */         } 
/* 165 */         if (m == 0) {
/*     */           break;
/*     */         }
/*     */       } 
/* 169 */       m++;
/*     */     } 
/*     */     
/* 172 */     return null;
/*     */   }
/*     */   
/*     */   private List<bxc> a(axz ☃, int i, int j) {
/* 176 */     List<bxc> list = Lists.newArrayList();
/* 177 */     Long2ObjectMap<bxc> long2ObjectMap = ☃.H().f().a(this);
/* 178 */     Long2ObjectMap<LongSet> long2ObjectMap1 = ☃.H().f().b(this);
/*     */     
/* 180 */     long l = axm.a(i, j);
/*     */ 
/*     */     
/* 183 */     LongSet longSet = (LongSet)long2ObjectMap1.get(l);
/*     */ 
/*     */     
/* 186 */     if (longSet == null) {
/* 187 */       longSet = ☃.H().a(i, j, true).b(a());
/* 188 */       long2ObjectMap1.put(l, longSet);
/*     */     } 
/*     */     
/* 191 */     for (LongIterator<Long> longIterator = longSet.iterator(); longIterator.hasNext(); ) { Long long_ = longIterator.next();
/*     */       
/* 193 */       bxc bxc1 = (bxc)long2ObjectMap.get(long_);
/* 194 */       if (bxc1 != null) {
/* 195 */         list.add(bxc1);
/*     */         
/*     */         continue;
/*     */       } 
/*     */       
/* 200 */       axm axm = new axm(long_.longValue());
/* 201 */       bmx bmx = ☃.H().a(axm.a, axm.b, true);
/* 202 */       bxc1 = bmx.a(a());
/* 203 */       if (bxc1 != null) {
/* 204 */         long2ObjectMap.put(long_, bxc1);
/* 205 */         list.add(bxc1);
/*     */       }  }
/*     */ 
/*     */ 
/*     */     
/* 210 */     return list;
/*     */   }
/*     */   
/*     */   private bxc a(axz ☃, bmy<? extends bom> bmy1, boz boz1, long l) {
/* 214 */     if (!bmy1.b().a(this)) {
/* 215 */       return a;
/*     */     }
/*     */     
/* 218 */     Long2ObjectMap<bxc> long2ObjectMap = bmy1.a(this);
/*     */ 
/*     */     
/* 221 */     bxc bxc1 = (bxc)long2ObjectMap.get(l);
/* 222 */     if (bxc1 != null) {
/* 223 */       return bxc1;
/*     */     }
/*     */     
/* 226 */     axm axm = new axm(l);
/*     */     
/* 228 */     bmx bmx = ☃.H().a(axm.a, axm.b, false);
/* 229 */     if (bmx != null) {
/*     */       
/* 231 */       bxc1 = bmx.a(a());
/* 232 */       if (bxc1 != null) {
/* 233 */         long2ObjectMap.put(l, bxc1);
/* 234 */         return bxc1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 239 */     if (a(bmy1, boz1, axm.a, axm.b)) {
/* 240 */       bxc bxc2 = a(☃, bmy1, boz1, axm.a, axm.b);
/* 241 */       bxc1 = bxc2.b() ? bxc2 : a;
/*     */     } else {
/* 243 */       bxc1 = a;
/*     */     } 
/*     */     
/* 246 */     if (bxc1.b()) {
/* 247 */       ☃.H().a(axm.a, axm.b, true).a(a(), bxc1);
/*     */     }
/*     */     
/* 250 */     long2ObjectMap.put(l, bxc1);
/* 251 */     return bxc1;
/*     */   }
/*     */   
/*     */   protected axm a(bmy<?> ☃, Random random, int i, int j, int k, int m) {
/* 255 */     return new axm(i + k, j + m);
/*     */   }
/*     */   
/*     */   protected abstract boolean a(bmy<?> parambmy, Random paramRandom, int paramInt1, int paramInt2);
/*     */   
/*     */   protected abstract boolean a(axz paramaxz);
/*     */   
/*     */   protected abstract bxc a(axz paramaxz, bmy<?> parambmy, boz paramboz, int paramInt1, int paramInt2);
/*     */   
/*     */   protected abstract String a();
/*     */   
/*     */   public abstract int b();
/*     */ }


/* Location:              F:\dw\server.jar!\btl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */