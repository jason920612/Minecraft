/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.AbstractSet;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ public class xe<T>
/*     */   extends AbstractSet<T>
/*     */ {
/*  16 */   private static final Set<Class<?>> a = Sets.newHashSet();
/*     */   
/*  18 */   private final Map<Class<?>, List<T>> b = Maps.newHashMap();
/*  19 */   private final Set<Class<?>> c = Sets.newIdentityHashSet();
/*     */   private final Class<T> d;
/*  21 */   private final List<T> e = Lists.newArrayList();
/*     */   
/*     */   public xe(Class<T> ☃) {
/*  24 */     this.d = ☃;
/*  25 */     this.c.add(☃);
/*  26 */     this.b.put(☃, this.e);
/*     */     
/*  28 */     for (Class<?> clazz : (Iterable<Class<?>>)Lists.newArrayList(a)) {
/*  29 */       a(clazz);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(Class<?> ☃) {
/*  34 */     a.add(☃);
/*  35 */     for (T t : this.e) {
/*  36 */       if (☃.isAssignableFrom(t.getClass())) {
/*  37 */         a(t, ☃);
/*     */       }
/*     */     } 
/*     */     
/*  41 */     this.c.add(☃);
/*     */   }
/*     */   
/*     */   protected Class<?> b(Class<?> ☃) {
/*  45 */     if (this.d.isAssignableFrom(☃)) {
/*  46 */       if (!this.c.contains(☃)) {
/*  47 */         a(☃);
/*     */       }
/*     */       
/*  50 */       return ☃;
/*     */     } 
/*  52 */     throw new IllegalArgumentException("Don't know how to search for " + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(T ☃) {
/*  57 */     for (Class<?> clazz : this.c) {
/*  58 */       if (clazz.isAssignableFrom(☃.getClass())) {
/*  59 */         a(☃, clazz);
/*     */       }
/*     */     } 
/*     */     
/*  63 */     return true;
/*     */   }
/*     */   
/*     */   private void a(T ☃, Class<?> clazz) {
/*  67 */     List<T> list = this.b.get(clazz);
/*  68 */     if (list == null) {
/*  69 */       this.b.put(clazz, Lists.newArrayList(new Object[] { ☃ }));
/*     */     } else {
/*  71 */       list.add(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean remove(Object ☃) {
/*  78 */     T t = (T)☃;
/*  79 */     boolean bool = false;
/*     */     
/*  81 */     for (Class<?> clazz : this.c) {
/*  82 */       if (clazz.isAssignableFrom(t.getClass())) {
/*  83 */         List<T> list = this.b.get(clazz);
/*  84 */         if (list != null && list.remove(t)) {
/*  85 */           bool = true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  90 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object ☃) {
/*  95 */     return Iterators.contains(c(☃.getClass()).iterator(), ☃);
/*     */   }
/*     */   
/*     */   public <S> Iterable<S> c(Class<S> ☃) {
/*  99 */     return () -> {
/*     */         List<T> list = this.b.get(b(☃));
/*     */         if (list == null) {
/*     */           return Collections.emptyIterator();
/*     */         }
/*     */         Iterator<T> iterator = list.iterator();
/*     */         return (Iterator)Iterators.filter(iterator, ☃);
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<T> iterator() {
/* 111 */     if (this.e.isEmpty()) {
/* 112 */       return Collections.emptyIterator();
/*     */     }
/* 114 */     return (Iterator<T>)Iterators.unmodifiableIterator(this.e.iterator());
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 119 */     return this.e.size();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\xe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */