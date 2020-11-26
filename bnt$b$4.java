/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ enum null
/*     */ {
/*     */   private final ThreadLocal<List<ObjectSet<el>>> g;
/*     */   
/*     */   null(boolean ☃, bcs... arrayOfBcs) {
/* 255 */     this.g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));
/*     */   }
/*     */   
/*     */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 259 */     blc blc2 = ☃.a(eq1, axz1.a_(el2), axz1, el1, el2);
/* 260 */     if (☃ != blc2) {
/* 261 */       int i = ((Integer)blc2.c(bma.ab)).intValue();
/* 262 */       List<ObjectSet<el>> list = this.g.get();
/* 263 */       if (list.isEmpty()) {
/* 264 */         for (int j = 0; j < 7; j++) {
/* 265 */           list.add(new ObjectOpenHashSet());
/*     */         }
/*     */       }
/* 268 */       ((ObjectSet)list.get(i)).add(el1.h());
/*     */     } 
/* 270 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(axz ☃) {
/* 275 */     el.a a = new el.a();
/*     */     
/* 277 */     List<ObjectSet<el>> list = this.g.get();
/* 278 */     for (int i = 2; i < list.size(); i++) {
/* 279 */       int j = i - 1;
/* 280 */       ObjectSet<el> objectSet1 = list.get(j);
/* 281 */       ObjectSet<el> objectSet2 = list.get(i);
/*     */       
/* 283 */       for (ObjectIterator<el> objectIterator = objectSet1.iterator(); objectIterator.hasNext(); ) { el el = objectIterator.next();
/* 284 */         blc blc = ☃.a_(el);
/* 285 */         if (((Integer)blc.c(bma.ab)).intValue() < j) {
/*     */           continue;
/*     */         }
/*     */         
/* 289 */         ☃.a(el, blc.a(bma.ab, Integer.valueOf(j)), 18);
/*     */         
/* 291 */         if (i != 7) {
/* 292 */           for (eq eq : f) {
/* 293 */             a.g(el).c(eq);
/* 294 */             blc blc1 = ☃.a_(a);
/*     */             
/* 296 */             if (blc1.b(bma.ab) && ((Integer)blc.c(bma.ab)).intValue() > i) {
/* 297 */               objectSet2.add(a.h());
/*     */             }
/*     */           } 
/*     */         } }
/*     */     
/*     */     } 
/*     */     
/* 304 */     list.clear();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bnt$b$4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */