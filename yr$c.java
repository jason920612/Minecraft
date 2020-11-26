/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.Arrays;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
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
/*     */ 
/*     */ class c
/*     */ {
/* 367 */   private final xg<Dynamic<?>> b = new xg<>(32);
/*     */   
/*     */   private Dynamic<?> c;
/*     */   private final Dynamic<?> d;
/*     */   private final boolean e;
/* 372 */   private final Int2ObjectMap<IntList> f = (Int2ObjectMap<IntList>)new Int2ObjectLinkedOpenHashMap();
/*     */   
/* 374 */   private final IntList g = (IntList)new IntArrayList();
/*     */   public int a;
/* 376 */   private final Set<Dynamic<?>> h = Sets.newIdentityHashSet();
/* 377 */   private final int[] i = new int[4096];
/*     */   
/*     */   public c(Dynamic<?> ☃) {
/* 380 */     this.c = ☃.emptyList();
/* 381 */     this.d = ☃;
/* 382 */     this.a = ☃.getInt("Y");
/* 383 */     this.e = ☃.get("Blocks").isPresent();
/*     */   }
/*     */   
/*     */   public Dynamic<?> a(int ☃) {
/* 387 */     if (☃ < 0 || ☃ > 4095) {
/* 388 */       return yr.a();
/*     */     }
/*     */     
/* 391 */     Dynamic<?> dynamic = this.b.a(this.i[☃]);
/* 392 */     return (dynamic == null) ? yr.a() : dynamic;
/*     */   }
/*     */   
/*     */   public void a(int ☃, Dynamic<?> dynamic) {
/* 396 */     if (this.h.add(dynamic)) {
/* 397 */       this.c = this.c.merge("%%FILTER_ME%%".equals(yr.a(dynamic)) ? yr.a() : dynamic);
/*     */     }
/* 399 */     this.i[☃] = yr.a(this.b, dynamic);
/*     */   }
/*     */   
/*     */   public int b(int ☃) {
/* 403 */     if (!this.e) {
/* 404 */       return ☃;
/*     */     }
/* 406 */     ByteBuffer byteBuffer = this.d.get("Blocks").flatMap(Dynamic::getByteBuffer).get();
/* 407 */     yr.a a1 = this.d.get("Data").flatMap(Dynamic::getByteBuffer).map(☃ -> new yr.a(DataFixUtils.toArray(☃))).orElseGet(a::new);
/* 408 */     yr.a a2 = this.d.get("Add").flatMap(Dynamic::getByteBuffer).map(☃ -> new yr.a(DataFixUtils.toArray(☃))).orElseGet(a::new);
/*     */     
/* 410 */     this.h.add(yr.a());
/* 411 */     yr.a(this.b, yr.a());
/* 412 */     this.c = this.c.merge(yr.a());
/*     */     
/* 414 */     for (int i = 0; i < 4096; i++) {
/* 415 */       int j = i & 0xF;
/* 416 */       int k = i >> 8 & 0xF;
/* 417 */       int m = i >> 4 & 0xF;
/* 418 */       int n = a2.a(j, k, m) << 12 | (byteBuffer.get(i) & 0xFF) << 4 | a1.a(j, k, m);
/*     */       
/* 420 */       if (yr.b().get(n >> 4)) {
/* 421 */         a(n >> 4, i);
/*     */       }
/* 423 */       if (yr.c().get(n >> 4)) {
/*     */         
/* 425 */         int i1 = yr.a((j == 0), (j == 15), (m == 0), (m == 15));
/* 426 */         if (i1 == 0) {
/*     */           
/* 428 */           this.g.add(i);
/*     */         } else {
/* 430 */           ☃ |= i1;
/*     */         } 
/*     */       } 
/*     */       
/* 434 */       a(i, yp.b(n));
/*     */     } 
/*     */     
/* 437 */     return ☃;
/*     */   }
/*     */   private void a(int ☃, int i) {
/*     */     IntArrayList intArrayList;
/* 441 */     IntList intList = (IntList)this.f.get(☃);
/* 442 */     if (intList == null) {
/* 443 */       intArrayList = new IntArrayList();
/* 444 */       this.f.put(☃, intArrayList);
/*     */     } 
/* 446 */     intArrayList.add(i);
/*     */   }
/*     */   
/*     */   public Dynamic<?> a() {
/* 450 */     Dynamic<?> ☃ = this.d;
/* 451 */     if (!this.e) {
/* 452 */       return ☃;
/*     */     }
/* 454 */     ☃ = ☃.set("Palette", this.c);
/*     */     
/* 456 */     int i = Math.max(4, DataFixUtils.ceillog2(this.h.size()));
/* 457 */     xd xd = new xd(i, 4096);
/* 458 */     for (int j = 0; j < this.i.length; j++) {
/* 459 */       xd.a(j, this.i[j]);
/*     */     }
/*     */     
/* 462 */     ☃ = ☃.set("BlockStates", ☃.createLongList(Arrays.stream(xd.a())));
/*     */     
/* 464 */     ☃ = ☃.remove("Blocks");
/* 465 */     ☃ = ☃.remove("Data");
/* 466 */     ☃ = ☃.remove("Add");
/*     */     
/* 468 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\yr$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */