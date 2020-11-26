/*     */ import com.google.common.collect.BiMap;
/*     */ import com.google.common.collect.HashBiMap;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ey<V>
/*     */   implements fc<V>
/*     */ {
/*  19 */   protected static final Logger a = LogManager.getLogger();
/*     */   
/*  21 */   protected final xg<V> b = new xg<>(256);
/*  22 */   protected final BiMap<pc, V> c = (BiMap<pc, V>)HashBiMap.create();
/*     */   
/*     */   protected Object[] d;
/*     */   
/*     */   private int x;
/*     */ 
/*     */   
/*     */   public void a(int ☃, pc pc1, V v) {
/*  30 */     this.b.a(v, ☃);
/*  31 */     Validate.notNull(pc1);
/*  32 */     Validate.notNull(v);
/*     */     
/*  34 */     this.d = null;
/*     */     
/*  36 */     if (this.c.containsKey(pc1)) {
/*  37 */       a.debug("Adding duplicate key '{}' to registry", pc1);
/*     */     }
/*  39 */     this.c.put(pc1, v);
/*  40 */     if (this.x <= ☃) {
/*  41 */       this.x = ☃ + 1;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pc ☃, V v) {
/*  47 */     a(this.x, ☃, v);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public pc b(V ☃) {
/*  53 */     return (pc)this.c.inverse().get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public V a(@Nullable pc ☃) {
/*  58 */     throw new UnsupportedOperationException("No default value");
/*     */   }
/*     */ 
/*     */   
/*     */   public pc b() {
/*  63 */     throw new UnsupportedOperationException("No default key");
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(@Nullable V ☃) {
/*  68 */     return this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public V a(int ☃) {
/*  74 */     return this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<V> iterator() {
/*  79 */     return this.b.iterator();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public V b(@Nullable pc ☃) {
/*  85 */     return (V)this.c.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<pc> c() {
/*  90 */     return Collections.unmodifiableSet(this.c.keySet());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  95 */     return this.c.isEmpty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public V a(Random ☃) {
/* 102 */     if (this.d == null) {
/* 103 */       Collection<?> collection = this.c.values();
/* 104 */       if (collection.isEmpty()) {
/* 105 */         return null;
/*     */       }
/* 107 */       this.d = collection.toArray(new Object[collection.size()]);
/*     */     } 
/* 109 */     return (V)this.d[☃.nextInt(this.d.length)];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(pc ☃) {
/* 114 */     return this.c.containsKey(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */