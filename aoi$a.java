/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntCollection;
/*     */ import it.unimi.dsi.fastutil.ints.IntIterator;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*     */ import java.util.BitSet;
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
/*     */ class a
/*     */ {
/*     */   private final avk b;
/* 102 */   private final List<avh> c = Lists.newArrayList();
/*     */   private final int d;
/*     */   private final int[] e;
/*     */   private final int f;
/*     */   private final BitSet g;
/* 107 */   private final IntList h = (IntList)new IntArrayList();
/*     */   
/*     */   public a(aoi paramaoi, avk ☃) {
/* 110 */     this.b = ☃;
/* 111 */     this.c.addAll(☃.e());
/* 112 */     this.c.removeIf(avh::d);
/*     */     
/* 114 */     this.d = this.c.size();
/* 115 */     this.e = a();
/* 116 */     this.f = this.e.length;
/*     */ 
/*     */     
/* 119 */     this.g = new BitSet(this.d + this.f + this.d + this.d * this.f);
/* 120 */     for (int i = 0; i < this.c.size(); i++) {
/* 121 */       IntList intList = ((avh)this.c.get(i)).b();
/* 122 */       for (int j = 0; j < this.f; j++) {
/* 123 */         if (intList.contains(this.e[j])) {
/* 124 */           this.g.set(d(true, j, i));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, @Nullable IntList intList) {
/* 131 */     if (☃ <= 0) {
/* 132 */       return true;
/*     */     }
/*     */     
/* 135 */     int i = 0;
/* 136 */     while (a(☃)) {
/* 137 */       this.a.a(this.e[this.h.getInt(0)], ☃);
/*     */       
/* 139 */       int m = this.h.size() - 1;
/* 140 */       c(this.h.getInt(m));
/*     */       
/* 142 */       for (int n = 0; n < m; n++) {
/* 143 */         c(((n & 0x1) == 0), this.h.get(n).intValue(), this.h.get(n + 1).intValue());
/*     */       }
/*     */       
/* 146 */       this.h.clear();
/* 147 */       this.g.clear(0, this.d + this.f);
/*     */       
/* 149 */       i++;
/*     */     } 
/*     */     
/* 152 */     boolean bool1 = (i == this.d);
/* 153 */     boolean bool2 = (bool1 && intList != null);
/* 154 */     if (bool2) {
/* 155 */       intList.clear();
/*     */     }
/*     */ 
/*     */     
/* 159 */     this.g.clear(0, this.d + this.f + this.d);
/*     */     
/* 161 */     int j = 0;
/* 162 */     List<avh> list = this.b.e();
/* 163 */     for (int k = 0; k < list.size(); k++) {
/* 164 */       if (bool2 && ((avh)list.get(k)).d()) {
/* 165 */         intList.add(0);
/*     */       } else {
/* 167 */         for (int m = 0; m < this.f; m++) {
/* 168 */           if (b(false, j, m)) {
/* 169 */             c(true, m, j);
/* 170 */             aoi.a(this.a, this.e[m], ☃);
/*     */             
/* 172 */             if (bool2) {
/* 173 */               intList.add(this.e[m]);
/*     */             }
/*     */           } 
/*     */         } 
/* 177 */         j++;
/*     */       } 
/*     */     } 
/*     */     
/* 181 */     return bool1;
/*     */   }
/*     */   
/*     */   private int[] a() {
/* 185 */     IntAVLTreeSet intAVLTreeSet = new IntAVLTreeSet();
/* 186 */     for (avh avh : this.c) {
/* 187 */       intAVLTreeSet.addAll((IntCollection)avh.b());
/*     */     }
/*     */     
/* 190 */     IntIterator ☃ = intAVLTreeSet.iterator();
/* 191 */     while (☃.hasNext()) {
/* 192 */       if (!this.a.a(☃.nextInt())) {
/* 193 */         ☃.remove();
/*     */       }
/*     */     } 
/* 196 */     return intAVLTreeSet.toIntArray();
/*     */   }
/*     */   
/*     */   private boolean a(int ☃) {
/* 200 */     int i = this.f;
/* 201 */     for (int j = 0; j < i; j++) {
/* 202 */       if (this.a.a.get(this.e[j]) >= ☃) {
/* 203 */         a(false, j);
/*     */         
/* 205 */         while (!this.h.isEmpty()) {
/* 206 */           int k = this.h.size();
/* 207 */           boolean bool = ((k & 0x1) == 1);
/*     */           
/* 209 */           int m = this.h.getInt(k - 1);
/* 210 */           if (!bool && !b(m)) {
/*     */             break;
/*     */           }
/*     */           
/* 214 */           int n = bool ? this.d : i; int i1;
/* 215 */           for (i1 = 0; i1 < n; i1++) {
/* 216 */             if (!b(bool, i1) && a(bool, m, i1) && b(bool, m, i1)) {
/* 217 */               a(bool, i1);
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/* 222 */           i1 = this.h.size();
/* 223 */           if (i1 == k) {
/* 224 */             this.h.removeInt(i1 - 1);
/*     */           }
/*     */         } 
/* 227 */         if (!this.h.isEmpty()) {
/* 228 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 233 */     return false;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃) {
/* 237 */     return this.g.get(d(☃));
/*     */   }
/*     */   
/*     */   private void c(int ☃) {
/* 241 */     this.g.set(d(☃));
/*     */   }
/*     */   
/*     */   private int d(int ☃) {
/* 245 */     return this.d + this.f + ☃;
/*     */   }
/*     */   
/*     */   private boolean a(boolean ☃, int i, int j) {
/* 249 */     return this.g.get(d(☃, i, j));
/*     */   }
/*     */   
/*     */   private boolean b(boolean ☃, int i, int j) {
/* 253 */     return (☃ != this.g.get(1 + d(☃, i, j)));
/*     */   }
/*     */   
/*     */   private void c(boolean ☃, int i, int j) {
/* 257 */     this.g.flip(1 + d(☃, i, j));
/*     */   }
/*     */   
/*     */   private int d(boolean ☃, int i, int j) {
/* 261 */     int k = ☃ ? (i * this.d + j) : (j * this.d + i);
/* 262 */     return this.d + this.f + this.d + 2 * k;
/*     */   }
/*     */   
/*     */   private void a(boolean ☃, int i) {
/* 266 */     this.g.set(c(☃, i));
/* 267 */     this.h.add(i);
/*     */   }
/*     */   
/*     */   private boolean b(boolean ☃, int i) {
/* 271 */     return this.g.get(c(☃, i));
/*     */   }
/*     */   
/*     */   private int c(boolean ☃, int i) {
/* 275 */     return (☃ ? 0 : this.d) + i;
/*     */   }
/*     */   
/*     */   public int b(int ☃, @Nullable IntList intList) {
/* 279 */     int k, i = 0;
/* 280 */     int j = Math.min(☃, b()) + 1;
/*     */ 
/*     */     
/*     */     while (true) {
/* 284 */       k = (i + j) / 2;
/*     */       
/* 286 */       if (a(k, (IntList)null)) {
/* 287 */         if (j - i <= 1) {
/*     */           break;
/*     */         }
/* 290 */         i = k; continue;
/*     */       } 
/* 292 */       j = k;
/*     */     } 
/*     */ 
/*     */     
/* 296 */     if (k > 0) {
/* 297 */       a(k, intList);
/*     */     }
/*     */     
/* 300 */     return k;
/*     */   }
/*     */   
/*     */   private int b() {
/* 304 */     int ☃ = Integer.MAX_VALUE;
/* 305 */     for (avh avh : this.c) {
/* 306 */       int i = 0;
/* 307 */       for (IntListIterator<Integer> intListIterator = avh.b().iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 308 */         i = Math.max(i, this.a.a.get(j)); }
/*     */       
/* 310 */       if (☃ > 0) {
/* 311 */         ☃ = Math.min(☃, i);
/*     */       }
/*     */     } 
/* 314 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aoi$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */