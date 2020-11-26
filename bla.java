/*     */ import com.google.common.collect.ArrayTable;
/*     */ import com.google.common.collect.HashBasedTable;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Table;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ public abstract class bla<O, S>
/*     */   implements blf<S>
/*     */ {
/*  19 */   private static final Function<Map.Entry<bmm<?>, Comparable<?>>, String> b = new Function<Map.Entry<bmm<?>, Comparable<?>>, String>()
/*     */     {
/*     */       public String a(@Nullable Map.Entry<bmm<?>, Comparable<?>> ☃) {
/*  22 */         if (☃ == null) {
/*  23 */           return "<NULL>";
/*     */         }
/*     */         
/*  26 */         bmm<?> bmm = ☃.getKey();
/*  27 */         return bmm.a() + "=" + a(bmm, ☃.getValue());
/*     */       }
/*     */ 
/*     */       
/*     */       private <T extends Comparable<T>> String a(bmm<T> ☃, Comparable<?> comparable) {
/*  32 */         return ☃.a((T)comparable);
/*     */       }
/*     */     };
/*     */   
/*     */   protected final O e_;
/*     */   private final ImmutableMap<bmm<?>, Comparable<?>> c;
/*     */   private final int d;
/*     */   private Table<bmm<?>, Comparable<?>, S> e;
/*     */   
/*     */   protected bla(O ☃, ImmutableMap<bmm<?>, Comparable<?>> immutableMap) {
/*  42 */     this.e_ = ☃;
/*  43 */     this.c = immutableMap;
/*  44 */     this.d = immutableMap.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends Comparable<T>> S a(bmm<T> ☃) {
/*  49 */     return a(☃, a(☃.d(), c(☃)));
/*     */   }
/*     */   
/*     */   protected static <T> T a(Collection<T> ☃, T t) {
/*  53 */     Iterator<T> iterator = ☃.iterator();
/*     */     
/*  55 */     while (iterator.hasNext()) {
/*  56 */       if (iterator.next().equals(t)) {
/*  57 */         if (iterator.hasNext()) {
/*  58 */           return iterator.next();
/*     */         }
/*  60 */         return ☃.iterator().next();
/*     */       } 
/*     */     } 
/*     */     
/*  64 */     return iterator.next();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  69 */     StringBuilder ☃ = new StringBuilder();
/*  70 */     ☃.append(this.e_);
/*     */     
/*  72 */     if (!b().isEmpty()) {
/*  73 */       ☃.append('[');
/*  74 */       ☃.append(b().entrySet().stream().<CharSequence>map((Function)b).collect(Collectors.joining(",")));
/*  75 */       ☃.append(']');
/*     */     } 
/*     */     
/*  78 */     return ☃.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<bmm<?>> a() {
/*  83 */     return Collections.unmodifiableCollection((Collection<? extends bmm<?>>)this.c.keySet());
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends Comparable<T>> boolean b(bmm<T> ☃) {
/*  88 */     return this.c.containsKey(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends Comparable<T>> T c(bmm<T> ☃) {
/*  93 */     Comparable<?> comparable = (Comparable)this.c.get(☃);
/*  94 */     if (comparable == null) {
/*  95 */       throw new IllegalArgumentException("Cannot get property " + ☃ + " as it does not exist in " + this.e_);
/*     */     }
/*     */     
/*  98 */     return (T)☃.b().cast(comparable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <T extends Comparable<T>, V extends T> S a(bmm<T> ☃, V v) {
/* 104 */     Comparable<?> comparable = (Comparable)this.c.get(☃);
/* 105 */     if (comparable == null) {
/* 106 */       throw new IllegalArgumentException("Cannot set property " + ☃ + " as it does not exist in " + this.e_);
/*     */     }
/* 108 */     if (comparable == v) {
/* 109 */       return (S)this;
/*     */     }
/*     */     
/* 112 */     S s = (S)this.e.get(☃, v);
/* 113 */     if (s == null) {
/* 114 */       throw new IllegalArgumentException("Cannot set property " + ☃ + " to " + v + " on " + this.e_ + ", it is not an allowed value");
/*     */     }
/*     */     
/* 117 */     return s;
/*     */   }
/*     */   
/*     */   public void a(Map<Map<bmm<?>, Comparable<?>>, S> ☃) {
/* 121 */     if (this.e != null) {
/* 122 */       throw new IllegalStateException();
/*     */     }
/*     */     
/* 125 */     HashBasedTable hashBasedTable = HashBasedTable.create();
/* 126 */     for (UnmodifiableIterator<Map.Entry<bmm<?>, Comparable<?>>> unmodifiableIterator = this.c.entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<bmm<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 127 */       bmm<?> bmm = entry.getKey();
/* 128 */       for (Comparable<?> comparable : bmm.d()) {
/* 129 */         if (comparable != entry.getValue()) {
/* 130 */           hashBasedTable.put(bmm, comparable, ☃.get(b(bmm, comparable)));
/*     */         }
/*     */       }  }
/*     */ 
/*     */     
/* 135 */     this.e = hashBasedTable.isEmpty() ? (Table<bmm<?>, Comparable<?>, S>)hashBasedTable : (Table<bmm<?>, Comparable<?>, S>)ArrayTable.create((Table)hashBasedTable);
/*     */   }
/*     */   
/*     */   private Map<bmm<?>, Comparable<?>> b(bmm<?> ☃, Comparable<?> comparable) {
/* 139 */     Map<bmm<?>, Comparable<?>> map = Maps.newHashMap((Map)this.c);
/* 140 */     map.put(☃, comparable);
/* 141 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public ImmutableMap<bmm<?>, Comparable<?>> b() {
/* 146 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 152 */     return (this == ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 157 */     return this.d;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bla.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */