/*     */ package it.unimi.dsi.fastutil.objects;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractObject2ReferenceMap<K, V>
/*     */   extends AbstractObject2ReferenceFunction<K, V>
/*     */   implements Object2ReferenceMap<K, V>, Serializable
/*     */ {
/*     */   private static final long serialVersionUID = -4940583368468432370L;
/*     */   
/*     */   public boolean containsValue(Object v) {
/*  48 */     return values().contains(v);
/*     */   }
/*     */   
/*     */   public boolean containsKey(Object k) {
/*  52 */     ObjectIterator<Object2ReferenceMap.Entry<K, V>> i = object2ReferenceEntrySet().iterator();
/*  53 */     while (i.hasNext()) {
/*  54 */       if (((Object2ReferenceMap.Entry)i.next()).getKey() == k)
/*  55 */         return true; 
/*  56 */     }  return false;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*  60 */     return (size() == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class BasicEntry<K, V>
/*     */     implements Object2ReferenceMap.Entry<K, V>
/*     */   {
/*     */     protected K key;
/*     */     
/*     */     protected V value;
/*     */ 
/*     */     
/*     */     public BasicEntry() {}
/*     */ 
/*     */     
/*     */     public BasicEntry(K key, V value) {
/*  77 */       this.key = key;
/*  78 */       this.value = value;
/*     */     }
/*     */     
/*     */     public K getKey() {
/*  82 */       return this.key;
/*     */     }
/*     */     
/*     */     public V getValue() {
/*  86 */       return this.value;
/*     */     }
/*     */     
/*     */     public V setValue(V value) {
/*  90 */       throw new UnsupportedOperationException();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/*  95 */       if (!(o instanceof Map.Entry))
/*  96 */         return false; 
/*  97 */       if (o instanceof Object2ReferenceMap.Entry) {
/*  98 */         Object2ReferenceMap.Entry<K, V> entry = (Object2ReferenceMap.Entry<K, V>)o;
/*  99 */         return (Objects.equals(this.key, entry.getKey()) && this.value == entry.getValue());
/*     */       } 
/* 101 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/* 102 */       Object key = e.getKey();
/* 103 */       Object value = e.getValue();
/* 104 */       return (Objects.equals(this.key, key) && this.value == value);
/*     */     }
/*     */     
/*     */     public int hashCode() {
/* 108 */       return ((this.key == null) ? 0 : this.key.hashCode()) ^ ((this.value == null) ? 0 : System.identityHashCode(this.value));
/*     */     }
/*     */     
/*     */     public String toString() {
/* 112 */       return (new StringBuilder()).append(this.key).append("->").append(this.value).toString();
/*     */     }
/*     */   }
/*     */   
/*     */   public static abstract class BasicEntrySet<K, V>
/*     */     extends AbstractObjectSet<Object2ReferenceMap.Entry<K, V>>
/*     */   {
/*     */     protected final Object2ReferenceMap<K, V> map;
/*     */     
/*     */     public BasicEntrySet(Object2ReferenceMap<K, V> map) {
/* 122 */       this.map = map;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean contains(Object o) {
/* 127 */       if (!(o instanceof Map.Entry))
/* 128 */         return false; 
/* 129 */       if (o instanceof Object2ReferenceMap.Entry) {
/* 130 */         Object2ReferenceMap.Entry<K, V> entry = (Object2ReferenceMap.Entry<K, V>)o;
/* 131 */         K k1 = entry.getKey();
/* 132 */         return (this.map.containsKey(k1) && this.map.get(k1) == entry.getValue());
/*     */       } 
/* 134 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/* 135 */       Object k = e.getKey();
/* 136 */       Object value = e.getValue();
/* 137 */       return (this.map.containsKey(k) && this.map.get(k) == value);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean remove(Object o) {
/* 142 */       if (!(o instanceof Map.Entry))
/* 143 */         return false; 
/* 144 */       if (o instanceof Object2ReferenceMap.Entry) {
/* 145 */         Object2ReferenceMap.Entry<K, V> entry = (Object2ReferenceMap.Entry<K, V>)o;
/* 146 */         return this.map.remove(entry.getKey(), entry.getValue());
/*     */       } 
/* 148 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/* 149 */       Object k = e.getKey();
/* 150 */       Object v = e.getValue();
/* 151 */       return this.map.remove(k, v);
/*     */     }
/*     */     
/*     */     public int size() {
/* 155 */       return this.map.size();
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectSet<K> keySet() {
/* 174 */     return new AbstractObjectSet<K>()
/*     */       {
/*     */         public boolean contains(Object k) {
/* 177 */           return AbstractObject2ReferenceMap.this.containsKey(k);
/*     */         }
/*     */         
/*     */         public int size() {
/* 181 */           return AbstractObject2ReferenceMap.this.size();
/*     */         }
/*     */         
/*     */         public void clear() {
/* 185 */           AbstractObject2ReferenceMap.this.clear();
/*     */         }
/*     */         
/*     */         public ObjectIterator<K> iterator() {
/* 189 */           return new ObjectIterator<K>()
/*     */             {
/* 191 */               private final ObjectIterator<Object2ReferenceMap.Entry<K, V>> i = Object2ReferenceMaps.fastIterator(AbstractObject2ReferenceMap.this);
/*     */               
/*     */               public K next() {
/* 194 */                 return (K)((Object2ReferenceMap.Entry)this.i.next()).getKey();
/*     */               }
/*     */               
/*     */               public boolean hasNext() {
/* 198 */                 return this.i.hasNext();
/*     */               }
/*     */               
/*     */               public void remove() {
/* 202 */                 this.i.remove();
/*     */               }
/*     */             };
/*     */         }
/*     */       };
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReferenceCollection<V> values() {
/* 224 */     return new AbstractReferenceCollection<V>()
/*     */       {
/*     */         public boolean contains(Object k) {
/* 227 */           return AbstractObject2ReferenceMap.this.containsValue(k);
/*     */         }
/*     */         
/*     */         public int size() {
/* 231 */           return AbstractObject2ReferenceMap.this.size();
/*     */         }
/*     */         
/*     */         public void clear() {
/* 235 */           AbstractObject2ReferenceMap.this.clear();
/*     */         }
/*     */         
/*     */         public ObjectIterator<V> iterator() {
/* 239 */           return new ObjectIterator<V>()
/*     */             {
/* 241 */               private final ObjectIterator<Object2ReferenceMap.Entry<K, V>> i = Object2ReferenceMaps.fastIterator(AbstractObject2ReferenceMap.this);
/*     */               
/*     */               public V next() {
/* 244 */                 return (V)((Object2ReferenceMap.Entry)this.i.next()).getValue();
/*     */               }
/*     */               
/*     */               public boolean hasNext() {
/* 248 */                 return this.i.hasNext();
/*     */               }
/*     */             };
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void putAll(Map<? extends K, ? extends V> m) {
/* 258 */     if (m instanceof Object2ReferenceMap) {
/*     */       
/* 260 */       ObjectIterator<Object2ReferenceMap.Entry<K, V>> i = Object2ReferenceMaps.fastIterator((Object2ReferenceMap)m);
/* 261 */       while (i.hasNext()) {
/* 262 */         Object2ReferenceMap.Entry<? extends K, ? extends V> e = i.next();
/* 263 */         put(e.getKey(), e.getValue());
/*     */       } 
/*     */     } else {
/* 266 */       int n = m.size();
/* 267 */       Iterator<? extends Map.Entry<? extends K, ? extends V>> i = m.entrySet().iterator();
/*     */       
/* 269 */       while (n-- != 0) {
/* 270 */         Map.Entry<? extends K, ? extends V> e = i.next();
/* 271 */         put(e.getKey(), e.getValue());
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
/*     */   public int hashCode() {
/* 284 */     int h = 0, n = size();
/* 285 */     ObjectIterator<Object2ReferenceMap.Entry<K, V>> i = Object2ReferenceMaps.fastIterator(this);
/* 286 */     while (n-- != 0)
/* 287 */       h += ((Object2ReferenceMap.Entry)i.next()).hashCode(); 
/* 288 */     return h;
/*     */   }
/*     */   
/*     */   public boolean equals(Object o) {
/* 292 */     if (o == this)
/* 293 */       return true; 
/* 294 */     if (!(o instanceof Map))
/* 295 */       return false; 
/* 296 */     Map<?, ?> m = (Map<?, ?>)o;
/* 297 */     if (m.size() != size())
/* 298 */       return false; 
/* 299 */     return object2ReferenceEntrySet().containsAll(m.entrySet());
/*     */   }
/*     */   
/*     */   public String toString() {
/* 303 */     StringBuilder s = new StringBuilder();
/* 304 */     ObjectIterator<Object2ReferenceMap.Entry<K, V>> i = Object2ReferenceMaps.fastIterator(this);
/* 305 */     int n = size();
/*     */     
/* 307 */     boolean first = true;
/* 308 */     s.append("{");
/* 309 */     while (n-- != 0) {
/* 310 */       if (first) {
/* 311 */         first = false;
/*     */       } else {
/* 313 */         s.append(", ");
/* 314 */       }  Object2ReferenceMap.Entry<K, V> e = i.next();
/* 315 */       if (this == e.getKey()) {
/* 316 */         s.append("(this map)");
/*     */       } else {
/* 318 */         s.append(String.valueOf(e.getKey()));
/* 319 */       }  s.append("=>");
/* 320 */       if (this == e.getValue()) {
/* 321 */         s.append("(this map)"); continue;
/*     */       } 
/* 323 */       s.append(String.valueOf(e.getValue()));
/*     */     } 
/* 325 */     s.append("}");
/* 326 */     return s.toString();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\i\\unimi\dsi\fastutil\objects\AbstractObject2ReferenceMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */