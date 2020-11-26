/*      */ package it.unimi.dsi.fastutil.objects;
/*      */ 
/*      */ import it.unimi.dsi.fastutil.Hash;
/*      */ import it.unimi.dsi.fastutil.HashCommon;
/*      */ import it.unimi.dsi.fastutil.SafeMath;
/*      */ import it.unimi.dsi.fastutil.bytes.AbstractByteCollection;
/*      */ import it.unimi.dsi.fastutil.bytes.ByteCollection;
/*      */ import it.unimi.dsi.fastutil.bytes.ByteIterator;
/*      */ import java.io.IOException;
/*      */ import java.io.ObjectInputStream;
/*      */ import java.io.ObjectOutputStream;
/*      */ import java.io.Serializable;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.Map;
/*      */ import java.util.NoSuchElementException;
/*      */ import java.util.Objects;
/*      */ import java.util.Set;
/*      */ import java.util.function.BiFunction;
/*      */ import java.util.function.Consumer;
/*      */ import java.util.function.IntConsumer;
/*      */ import java.util.function.ToIntFunction;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Object2ByteOpenCustomHashMap<K>
/*      */   extends AbstractObject2ByteMap<K>
/*      */   implements Serializable, Cloneable, Hash
/*      */ {
/*      */   private static final long serialVersionUID = 0L;
/*      */   private static final boolean ASSERTS = false;
/*      */   protected transient K[] key;
/*      */   protected transient byte[] value;
/*      */   protected transient int mask;
/*      */   protected transient boolean containsNullKey;
/*      */   protected Hash.Strategy<K> strategy;
/*      */   protected transient int n;
/*      */   protected transient int maxFill;
/*      */   protected final transient int minN;
/*      */   protected int size;
/*      */   protected final float f;
/*      */   protected transient Object2ByteMap.FastEntrySet<K> entries;
/*      */   protected transient ObjectSet<K> keys;
/*      */   protected transient ByteCollection values;
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(int expected, float f, Hash.Strategy<K> strategy) {
/*  106 */     this.strategy = strategy;
/*  107 */     if (f <= 0.0F || f > 1.0F)
/*  108 */       throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than or equal to 1"); 
/*  109 */     if (expected < 0)
/*  110 */       throw new IllegalArgumentException("The expected number of elements must be nonnegative"); 
/*  111 */     this.f = f;
/*  112 */     this.minN = this.n = HashCommon.arraySize(expected, f);
/*  113 */     this.mask = this.n - 1;
/*  114 */     this.maxFill = HashCommon.maxFill(this.n, f);
/*  115 */     this.key = (K[])new Object[this.n + 1];
/*  116 */     this.value = new byte[this.n + 1];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(int expected, Hash.Strategy<K> strategy) {
/*  127 */     this(expected, 0.75F, strategy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(Hash.Strategy<K> strategy) {
/*  138 */     this(16, 0.75F, strategy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(Map<? extends K, ? extends Byte> m, float f, Hash.Strategy<K> strategy) {
/*  152 */     this(m.size(), f, strategy);
/*  153 */     putAll(m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(Map<? extends K, ? extends Byte> m, Hash.Strategy<K> strategy) {
/*  165 */     this(m, 0.75F, strategy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(Object2ByteMap<K> m, float f, Hash.Strategy<K> strategy) {
/*  178 */     this(m.size(), f, strategy);
/*  179 */     putAll(m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(Object2ByteMap<K> m, Hash.Strategy<K> strategy) {
/*  191 */     this(m, 0.75F, strategy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(K[] k, byte[] v, float f, Hash.Strategy<K> strategy) {
/*  208 */     this(k.length, f, strategy);
/*  209 */     if (k.length != v.length) {
/*  210 */       throw new IllegalArgumentException("The key array and the value array have different lengths (" + k.length + " and " + v.length + ")");
/*      */     }
/*  212 */     for (int i = 0; i < k.length; i++) {
/*  213 */       put(k[i], v[i]);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap(K[] k, byte[] v, Hash.Strategy<K> strategy) {
/*  229 */     this(k, v, 0.75F, strategy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Hash.Strategy<K> strategy() {
/*  237 */     return this.strategy;
/*      */   }
/*      */   private int realSize() {
/*  240 */     return this.containsNullKey ? (this.size - 1) : this.size;
/*      */   }
/*      */   private void ensureCapacity(int capacity) {
/*  243 */     int needed = HashCommon.arraySize(capacity, this.f);
/*  244 */     if (needed > this.n)
/*  245 */       rehash(needed); 
/*      */   }
/*      */   private void tryCapacity(long capacity) {
/*  248 */     int needed = (int)Math.min(1073741824L, 
/*  249 */         Math.max(2L, HashCommon.nextPowerOfTwo((long)Math.ceil(((float)capacity / this.f)))));
/*  250 */     if (needed > this.n)
/*  251 */       rehash(needed); 
/*      */   }
/*      */   private byte removeEntry(int pos) {
/*  254 */     byte oldValue = this.value[pos];
/*  255 */     this.size--;
/*  256 */     shiftKeys(pos);
/*  257 */     if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16)
/*  258 */       rehash(this.n / 2); 
/*  259 */     return oldValue;
/*      */   }
/*      */   private byte removeNullEntry() {
/*  262 */     this.containsNullKey = false;
/*  263 */     this.key[this.n] = null;
/*  264 */     byte oldValue = this.value[this.n];
/*  265 */     this.size--;
/*  266 */     if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16)
/*  267 */       rehash(this.n / 2); 
/*  268 */     return oldValue;
/*      */   }
/*      */   
/*      */   public void putAll(Map<? extends K, ? extends Byte> m) {
/*  272 */     if (this.f <= 0.5D) {
/*  273 */       ensureCapacity(m.size());
/*      */     } else {
/*  275 */       tryCapacity((size() + m.size()));
/*      */     } 
/*  277 */     super.putAll(m);
/*      */   }
/*      */   
/*      */   private int find(K k) {
/*  281 */     if (this.strategy.equals(k, null)) {
/*  282 */       return this.containsNullKey ? this.n : -(this.n + 1);
/*      */     }
/*  284 */     K[] key = this.key;
/*      */     K curr;
/*      */     int pos;
/*  287 */     if ((curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == null)
/*  288 */       return -(pos + 1); 
/*  289 */     if (this.strategy.equals(k, curr)) {
/*  290 */       return pos;
/*      */     }
/*      */     while (true) {
/*  293 */       if ((curr = key[pos = pos + 1 & this.mask]) == null)
/*  294 */         return -(pos + 1); 
/*  295 */       if (this.strategy.equals(k, curr))
/*  296 */         return pos; 
/*      */     } 
/*      */   }
/*      */   private void insert(int pos, K k, byte v) {
/*  300 */     if (pos == this.n)
/*  301 */       this.containsNullKey = true; 
/*  302 */     this.key[pos] = k;
/*  303 */     this.value[pos] = v;
/*  304 */     if (this.size++ >= this.maxFill) {
/*  305 */       rehash(HashCommon.arraySize(this.size + 1, this.f));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public byte put(K k, byte v) {
/*  311 */     int pos = find(k);
/*  312 */     if (pos < 0) {
/*  313 */       insert(-pos - 1, k, v);
/*  314 */       return this.defRetValue;
/*      */     } 
/*  316 */     byte oldValue = this.value[pos];
/*  317 */     this.value[pos] = v;
/*  318 */     return oldValue;
/*      */   }
/*      */   private byte addToValue(int pos, byte incr) {
/*  321 */     byte oldValue = this.value[pos];
/*  322 */     this.value[pos] = (byte)(oldValue + incr);
/*  323 */     return oldValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte addTo(K k, byte incr) {
/*      */     int pos;
/*  343 */     if (this.strategy.equals(k, null)) {
/*  344 */       if (this.containsNullKey)
/*  345 */         return addToValue(this.n, incr); 
/*  346 */       pos = this.n;
/*  347 */       this.containsNullKey = true;
/*      */     } else {
/*      */       
/*  350 */       K[] key = this.key;
/*      */       K curr;
/*  352 */       if ((curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) != null) {
/*  353 */         if (this.strategy.equals(curr, k))
/*  354 */           return addToValue(pos, incr); 
/*  355 */         while ((curr = key[pos = pos + 1 & this.mask]) != null) {
/*  356 */           if (this.strategy.equals(curr, k))
/*  357 */             return addToValue(pos, incr); 
/*      */         } 
/*      */       } 
/*  360 */     }  this.key[pos] = k;
/*  361 */     this.value[pos] = (byte)(this.defRetValue + incr);
/*  362 */     if (this.size++ >= this.maxFill) {
/*  363 */       rehash(HashCommon.arraySize(this.size + 1, this.f));
/*      */     }
/*      */     
/*  366 */     return this.defRetValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected final void shiftKeys(int pos) {
/*  379 */     K[] key = this.key; while (true) {
/*      */       K curr; int last;
/*  381 */       pos = (last = pos) + 1 & this.mask;
/*      */       while (true) {
/*  383 */         if ((curr = key[pos]) == null) {
/*  384 */           key[last] = null;
/*      */           return;
/*      */         } 
/*  387 */         int slot = HashCommon.mix(this.strategy.hashCode(curr)) & this.mask;
/*  388 */         if ((last <= pos) ? (last >= slot || slot > pos) : (last >= slot && slot > pos))
/*      */           break; 
/*  390 */         pos = pos + 1 & this.mask;
/*      */       } 
/*  392 */       key[last] = curr;
/*  393 */       this.value[last] = this.value[pos];
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public byte removeByte(Object k) {
/*  399 */     if (this.strategy.equals(k, null)) {
/*  400 */       if (this.containsNullKey)
/*  401 */         return removeNullEntry(); 
/*  402 */       return this.defRetValue;
/*      */     } 
/*      */     
/*  405 */     K[] key = this.key;
/*      */     K curr;
/*      */     int pos;
/*  408 */     if ((curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == null)
/*  409 */       return this.defRetValue; 
/*  410 */     if (this.strategy.equals(k, curr))
/*  411 */       return removeEntry(pos); 
/*      */     while (true) {
/*  413 */       if ((curr = key[pos = pos + 1 & this.mask]) == null)
/*  414 */         return this.defRetValue; 
/*  415 */       if (this.strategy.equals(k, curr)) {
/*  416 */         return removeEntry(pos);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public byte getByte(Object k) {
/*  422 */     if (this.strategy.equals(k, null)) {
/*  423 */       return this.containsNullKey ? this.value[this.n] : this.defRetValue;
/*      */     }
/*  425 */     K[] key = this.key;
/*      */     K curr;
/*      */     int pos;
/*  428 */     if ((curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == null)
/*  429 */       return this.defRetValue; 
/*  430 */     if (this.strategy.equals(k, curr)) {
/*  431 */       return this.value[pos];
/*      */     }
/*      */     while (true) {
/*  434 */       if ((curr = key[pos = pos + 1 & this.mask]) == null)
/*  435 */         return this.defRetValue; 
/*  436 */       if (this.strategy.equals(k, curr)) {
/*  437 */         return this.value[pos];
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean containsKey(Object k) {
/*  443 */     if (this.strategy.equals(k, null)) {
/*  444 */       return this.containsNullKey;
/*      */     }
/*  446 */     K[] key = this.key;
/*      */     K curr;
/*      */     int pos;
/*  449 */     if ((curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == null)
/*  450 */       return false; 
/*  451 */     if (this.strategy.equals(k, curr)) {
/*  452 */       return true;
/*      */     }
/*      */     while (true) {
/*  455 */       if ((curr = key[pos = pos + 1 & this.mask]) == null)
/*  456 */         return false; 
/*  457 */       if (this.strategy.equals(k, curr))
/*  458 */         return true; 
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean containsValue(byte v) {
/*  463 */     byte[] value = this.value;
/*  464 */     K[] key = this.key;
/*  465 */     if (this.containsNullKey && value[this.n] == v)
/*  466 */       return true; 
/*  467 */     for (int i = this.n; i-- != 0;) {
/*  468 */       if (key[i] != null && value[i] == v)
/*  469 */         return true; 
/*  470 */     }  return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public byte getOrDefault(Object k, byte defaultValue) {
/*  476 */     if (this.strategy.equals(k, null)) {
/*  477 */       return this.containsNullKey ? this.value[this.n] : defaultValue;
/*      */     }
/*  479 */     K[] key = this.key;
/*      */     K curr;
/*      */     int pos;
/*  482 */     if ((curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == null)
/*  483 */       return defaultValue; 
/*  484 */     if (this.strategy.equals(k, curr)) {
/*  485 */       return this.value[pos];
/*      */     }
/*      */     while (true) {
/*  488 */       if ((curr = key[pos = pos + 1 & this.mask]) == null)
/*  489 */         return defaultValue; 
/*  490 */       if (this.strategy.equals(k, curr)) {
/*  491 */         return this.value[pos];
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public byte putIfAbsent(K k, byte v) {
/*  497 */     int pos = find(k);
/*  498 */     if (pos >= 0)
/*  499 */       return this.value[pos]; 
/*  500 */     insert(-pos - 1, k, v);
/*  501 */     return this.defRetValue;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean remove(Object k, byte v) {
/*  507 */     if (this.strategy.equals(k, null)) {
/*  508 */       if (this.containsNullKey && v == this.value[this.n]) {
/*  509 */         removeNullEntry();
/*  510 */         return true;
/*      */       } 
/*  512 */       return false;
/*      */     } 
/*      */     
/*  515 */     K[] key = this.key;
/*      */     K curr;
/*      */     int pos;
/*  518 */     if ((curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == null)
/*  519 */       return false; 
/*  520 */     if (this.strategy.equals(k, curr) && v == this.value[pos]) {
/*  521 */       removeEntry(pos);
/*  522 */       return true;
/*      */     } 
/*      */     while (true) {
/*  525 */       if ((curr = key[pos = pos + 1 & this.mask]) == null)
/*  526 */         return false; 
/*  527 */       if (this.strategy.equals(k, curr) && v == this.value[pos]) {
/*  528 */         removeEntry(pos);
/*  529 */         return true;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean replace(K k, byte oldValue, byte v) {
/*  536 */     int pos = find(k);
/*  537 */     if (pos < 0 || oldValue != this.value[pos])
/*  538 */       return false; 
/*  539 */     this.value[pos] = v;
/*  540 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public byte replace(K k, byte v) {
/*  545 */     int pos = find(k);
/*  546 */     if (pos < 0)
/*  547 */       return this.defRetValue; 
/*  548 */     byte oldValue = this.value[pos];
/*  549 */     this.value[pos] = v;
/*  550 */     return oldValue;
/*      */   }
/*      */ 
/*      */   
/*      */   public byte computeByteIfAbsent(K k, ToIntFunction<? super K> mappingFunction) {
/*  555 */     Objects.requireNonNull(mappingFunction);
/*  556 */     int pos = find(k);
/*  557 */     if (pos >= 0)
/*  558 */       return this.value[pos]; 
/*  559 */     byte newValue = SafeMath.safeIntToByte(mappingFunction.applyAsInt(k));
/*  560 */     insert(-pos - 1, k, newValue);
/*  561 */     return newValue;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public byte computeByteIfPresent(K k, BiFunction<? super K, ? super Byte, ? extends Byte> remappingFunction) {
/*  567 */     Objects.requireNonNull(remappingFunction);
/*  568 */     int pos = find(k);
/*  569 */     if (pos < 0)
/*  570 */       return this.defRetValue; 
/*  571 */     Byte newValue = remappingFunction.apply(k, Byte.valueOf(this.value[pos]));
/*  572 */     if (newValue == null) {
/*  573 */       if (this.strategy.equals(k, null)) {
/*  574 */         removeNullEntry();
/*      */       } else {
/*  576 */         removeEntry(pos);
/*  577 */       }  return this.defRetValue;
/*      */     } 
/*  579 */     this.value[pos] = newValue.byteValue(); return newValue.byteValue();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public byte computeByte(K k, BiFunction<? super K, ? super Byte, ? extends Byte> remappingFunction) {
/*  585 */     Objects.requireNonNull(remappingFunction);
/*  586 */     int pos = find(k);
/*  587 */     Byte newValue = remappingFunction.apply(k, (pos >= 0) ? Byte.valueOf(this.value[pos]) : null);
/*  588 */     if (newValue == null) {
/*  589 */       if (pos >= 0)
/*  590 */         if (this.strategy.equals(k, null)) {
/*  591 */           removeNullEntry();
/*      */         } else {
/*  593 */           removeEntry(pos);
/*      */         }  
/*  595 */       return this.defRetValue;
/*      */     } 
/*  597 */     byte newVal = newValue.byteValue();
/*  598 */     if (pos < 0) {
/*  599 */       insert(-pos - 1, k, newVal);
/*  600 */       return newVal;
/*      */     } 
/*  602 */     this.value[pos] = newVal; return newVal;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public byte mergeByte(K k, byte v, BiFunction<? super Byte, ? super Byte, ? extends Byte> remappingFunction) {
/*  608 */     Objects.requireNonNull(remappingFunction);
/*  609 */     int pos = find(k);
/*  610 */     if (pos < 0) {
/*  611 */       insert(-pos - 1, k, v);
/*  612 */       return v;
/*      */     } 
/*  614 */     Byte newValue = remappingFunction.apply(Byte.valueOf(this.value[pos]), Byte.valueOf(v));
/*  615 */     if (newValue == null) {
/*  616 */       if (this.strategy.equals(k, null)) {
/*  617 */         removeNullEntry();
/*      */       } else {
/*  619 */         removeEntry(pos);
/*  620 */       }  return this.defRetValue;
/*      */     } 
/*  622 */     this.value[pos] = newValue.byteValue(); return newValue.byteValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void clear() {
/*  633 */     if (this.size == 0)
/*      */       return; 
/*  635 */     this.size = 0;
/*  636 */     this.containsNullKey = false;
/*  637 */     Arrays.fill((Object[])this.key, (Object)null);
/*      */   }
/*      */   
/*      */   public int size() {
/*  641 */     return this.size;
/*      */   }
/*      */   
/*      */   public boolean isEmpty() {
/*  645 */     return (this.size == 0);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   final class MapEntry
/*      */     implements Object2ByteMap.Entry<K>, Map.Entry<K, Byte>
/*      */   {
/*      */     int index;
/*      */ 
/*      */     
/*      */     MapEntry(int index) {
/*  657 */       this.index = index;
/*      */     }
/*      */     
/*      */     MapEntry() {}
/*      */     
/*      */     public K getKey() {
/*  663 */       return Object2ByteOpenCustomHashMap.this.key[this.index];
/*      */     }
/*      */     
/*      */     public byte getByteValue() {
/*  667 */       return Object2ByteOpenCustomHashMap.this.value[this.index];
/*      */     }
/*      */     
/*      */     public byte setValue(byte v) {
/*  671 */       byte oldValue = Object2ByteOpenCustomHashMap.this.value[this.index];
/*  672 */       Object2ByteOpenCustomHashMap.this.value[this.index] = v;
/*  673 */       return oldValue;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Byte getValue() {
/*  683 */       return Byte.valueOf(Object2ByteOpenCustomHashMap.this.value[this.index]);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Byte setValue(Byte v) {
/*  693 */       return Byte.valueOf(setValue(v.byteValue()));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object o) {
/*  698 */       if (!(o instanceof Map.Entry))
/*  699 */         return false; 
/*  700 */       Map.Entry<K, Byte> e = (Map.Entry<K, Byte>)o;
/*  701 */       return (Object2ByteOpenCustomHashMap.this.strategy.equals(Object2ByteOpenCustomHashMap.this.key[this.index], e.getKey()) && Object2ByteOpenCustomHashMap.this.value[this.index] == ((Byte)e.getValue()).byteValue());
/*      */     }
/*      */     
/*      */     public int hashCode() {
/*  705 */       return Object2ByteOpenCustomHashMap.this.strategy.hashCode(Object2ByteOpenCustomHashMap.this.key[this.index]) ^ Object2ByteOpenCustomHashMap.this.value[this.index];
/*      */     }
/*      */     
/*      */     public String toString() {
/*  709 */       return (new StringBuilder()).append(Object2ByteOpenCustomHashMap.this.key[this.index]).append("=>").append(Object2ByteOpenCustomHashMap.this.value[this.index]).toString();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class MapIterator
/*      */   {
/*  719 */     int pos = Object2ByteOpenCustomHashMap.this.n;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  726 */     int last = -1;
/*      */     
/*  728 */     int c = Object2ByteOpenCustomHashMap.this.size;
/*      */ 
/*      */ 
/*      */     
/*  732 */     boolean mustReturnNullKey = Object2ByteOpenCustomHashMap.this.containsNullKey;
/*      */ 
/*      */     
/*      */     ObjectArrayList<K> wrapped;
/*      */ 
/*      */     
/*      */     public boolean hasNext() {
/*  739 */       return (this.c != 0);
/*      */     }
/*      */     public int nextEntry() {
/*  742 */       if (!hasNext())
/*  743 */         throw new NoSuchElementException(); 
/*  744 */       this.c--;
/*  745 */       if (this.mustReturnNullKey) {
/*  746 */         this.mustReturnNullKey = false;
/*  747 */         return this.last = Object2ByteOpenCustomHashMap.this.n;
/*      */       } 
/*  749 */       K[] key = Object2ByteOpenCustomHashMap.this.key;
/*      */       while (true) {
/*  751 */         if (--this.pos < 0) {
/*      */           
/*  753 */           this.last = Integer.MIN_VALUE;
/*  754 */           K k = this.wrapped.get(-this.pos - 1);
/*  755 */           int p = HashCommon.mix(Object2ByteOpenCustomHashMap.this.strategy.hashCode(k)) & Object2ByteOpenCustomHashMap.this.mask;
/*  756 */           while (!Object2ByteOpenCustomHashMap.this.strategy.equals(k, key[p]))
/*  757 */             p = p + 1 & Object2ByteOpenCustomHashMap.this.mask; 
/*  758 */           return p;
/*      */         } 
/*  760 */         if (key[this.pos] != null) {
/*  761 */           return this.last = this.pos;
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private void shiftKeys(int pos) {
/*  775 */       K[] key = Object2ByteOpenCustomHashMap.this.key; while (true) {
/*      */         K curr; int last;
/*  777 */         pos = (last = pos) + 1 & Object2ByteOpenCustomHashMap.this.mask;
/*      */         while (true) {
/*  779 */           if ((curr = key[pos]) == null) {
/*  780 */             key[last] = null;
/*      */             return;
/*      */           } 
/*  783 */           int slot = HashCommon.mix(Object2ByteOpenCustomHashMap.this.strategy.hashCode(curr)) & Object2ByteOpenCustomHashMap.this.mask;
/*  784 */           if ((last <= pos) ? (last >= slot || slot > pos) : (last >= slot && slot > pos))
/*      */             break; 
/*  786 */           pos = pos + 1 & Object2ByteOpenCustomHashMap.this.mask;
/*      */         } 
/*  788 */         if (pos < last) {
/*  789 */           if (this.wrapped == null)
/*  790 */             this.wrapped = new ObjectArrayList<>(2); 
/*  791 */           this.wrapped.add(key[pos]);
/*      */         } 
/*  793 */         key[last] = curr;
/*  794 */         Object2ByteOpenCustomHashMap.this.value[last] = Object2ByteOpenCustomHashMap.this.value[pos];
/*      */       } 
/*      */     }
/*      */     public void remove() {
/*  798 */       if (this.last == -1)
/*  799 */         throw new IllegalStateException(); 
/*  800 */       if (this.last == Object2ByteOpenCustomHashMap.this.n) {
/*  801 */         Object2ByteOpenCustomHashMap.this.containsNullKey = false;
/*  802 */         Object2ByteOpenCustomHashMap.this.key[Object2ByteOpenCustomHashMap.this.n] = null;
/*  803 */       } else if (this.pos >= 0) {
/*  804 */         shiftKeys(this.last);
/*      */       } else {
/*      */         
/*  807 */         Object2ByteOpenCustomHashMap.this.removeByte(this.wrapped.set(-this.pos - 1, null));
/*  808 */         this.last = -1;
/*      */         return;
/*      */       } 
/*  811 */       Object2ByteOpenCustomHashMap.this.size--;
/*  812 */       this.last = -1;
/*      */     }
/*      */ 
/*      */     
/*      */     public int skip(int n) {
/*  817 */       int i = n;
/*  818 */       while (i-- != 0 && hasNext())
/*  819 */         nextEntry(); 
/*  820 */       return n - i - 1;
/*      */     }
/*      */     private MapIterator() {} }
/*      */   
/*      */   private class EntryIterator extends MapIterator implements ObjectIterator<Object2ByteMap.Entry<K>> { private Object2ByteOpenCustomHashMap<K>.MapEntry entry;
/*      */     
/*      */     public Object2ByteOpenCustomHashMap<K>.MapEntry next() {
/*  827 */       return this.entry = new Object2ByteOpenCustomHashMap.MapEntry(nextEntry());
/*      */     }
/*      */     private EntryIterator() {}
/*      */     public void remove() {
/*  831 */       super.remove();
/*  832 */       this.entry.index = -1;
/*      */     } }
/*      */   
/*      */   private class FastEntryIterator extends MapIterator implements ObjectIterator<Object2ByteMap.Entry<K>> { private FastEntryIterator() {
/*  836 */       this.entry = new Object2ByteOpenCustomHashMap.MapEntry();
/*      */     } private final Object2ByteOpenCustomHashMap<K>.MapEntry entry;
/*      */     public Object2ByteOpenCustomHashMap<K>.MapEntry next() {
/*  839 */       this.entry.index = nextEntry();
/*  840 */       return this.entry;
/*      */     } }
/*      */   
/*      */   private final class MapEntrySet extends AbstractObjectSet<Object2ByteMap.Entry<K>> implements Object2ByteMap.FastEntrySet<K> { private MapEntrySet() {}
/*      */     
/*      */     public ObjectIterator<Object2ByteMap.Entry<K>> iterator() {
/*  846 */       return new Object2ByteOpenCustomHashMap.EntryIterator();
/*      */     }
/*      */     
/*      */     public ObjectIterator<Object2ByteMap.Entry<K>> fastIterator() {
/*  850 */       return new Object2ByteOpenCustomHashMap.FastEntryIterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object o) {
/*  855 */       if (!(o instanceof Map.Entry))
/*  856 */         return false; 
/*  857 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/*  858 */       if (e.getValue() == null || !(e.getValue() instanceof Byte))
/*  859 */         return false; 
/*  860 */       K k = (K)e.getKey();
/*  861 */       byte v = ((Byte)e.getValue()).byteValue();
/*  862 */       if (Object2ByteOpenCustomHashMap.this.strategy.equals(k, null)) {
/*  863 */         return (Object2ByteOpenCustomHashMap.this.containsNullKey && Object2ByteOpenCustomHashMap.this.value[Object2ByteOpenCustomHashMap.this.n] == v);
/*      */       }
/*  865 */       K[] key = Object2ByteOpenCustomHashMap.this.key;
/*      */       K curr;
/*      */       int pos;
/*  868 */       if ((curr = key[pos = HashCommon.mix(Object2ByteOpenCustomHashMap.this.strategy.hashCode(k)) & Object2ByteOpenCustomHashMap.this.mask]) == null)
/*  869 */         return false; 
/*  870 */       if (Object2ByteOpenCustomHashMap.this.strategy.equals(k, curr)) {
/*  871 */         return (Object2ByteOpenCustomHashMap.this.value[pos] == v);
/*      */       }
/*      */       while (true) {
/*  874 */         if ((curr = key[pos = pos + 1 & Object2ByteOpenCustomHashMap.this.mask]) == null)
/*  875 */           return false; 
/*  876 */         if (Object2ByteOpenCustomHashMap.this.strategy.equals(k, curr)) {
/*  877 */           return (Object2ByteOpenCustomHashMap.this.value[pos] == v);
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/*      */     public boolean remove(Object o) {
/*  883 */       if (!(o instanceof Map.Entry))
/*  884 */         return false; 
/*  885 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/*  886 */       if (e.getValue() == null || !(e.getValue() instanceof Byte))
/*  887 */         return false; 
/*  888 */       K k = (K)e.getKey();
/*  889 */       byte v = ((Byte)e.getValue()).byteValue();
/*  890 */       if (Object2ByteOpenCustomHashMap.this.strategy.equals(k, null)) {
/*  891 */         if (Object2ByteOpenCustomHashMap.this.containsNullKey && Object2ByteOpenCustomHashMap.this.value[Object2ByteOpenCustomHashMap.this.n] == v) {
/*  892 */           Object2ByteOpenCustomHashMap.this.removeNullEntry();
/*  893 */           return true;
/*      */         } 
/*  895 */         return false;
/*      */       } 
/*      */       
/*  898 */       K[] key = Object2ByteOpenCustomHashMap.this.key;
/*      */       K curr;
/*      */       int pos;
/*  901 */       if ((curr = key[pos = HashCommon.mix(Object2ByteOpenCustomHashMap.this.strategy.hashCode(k)) & Object2ByteOpenCustomHashMap.this.mask]) == null)
/*  902 */         return false; 
/*  903 */       if (Object2ByteOpenCustomHashMap.this.strategy.equals(curr, k)) {
/*  904 */         if (Object2ByteOpenCustomHashMap.this.value[pos] == v) {
/*  905 */           Object2ByteOpenCustomHashMap.this.removeEntry(pos);
/*  906 */           return true;
/*      */         } 
/*  908 */         return false;
/*      */       } 
/*      */       while (true) {
/*  911 */         if ((curr = key[pos = pos + 1 & Object2ByteOpenCustomHashMap.this.mask]) == null)
/*  912 */           return false; 
/*  913 */         if (Object2ByteOpenCustomHashMap.this.strategy.equals(curr, k) && 
/*  914 */           Object2ByteOpenCustomHashMap.this.value[pos] == v) {
/*  915 */           Object2ByteOpenCustomHashMap.this.removeEntry(pos);
/*  916 */           return true;
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/*  923 */       return Object2ByteOpenCustomHashMap.this.size;
/*      */     }
/*      */     
/*      */     public void clear() {
/*  927 */       Object2ByteOpenCustomHashMap.this.clear();
/*      */     }
/*      */ 
/*      */     
/*      */     public void forEach(Consumer<? super Object2ByteMap.Entry<K>> consumer) {
/*  932 */       if (Object2ByteOpenCustomHashMap.this.containsNullKey)
/*  933 */         consumer.accept(new AbstractObject2ByteMap.BasicEntry<>(Object2ByteOpenCustomHashMap.this.key[Object2ByteOpenCustomHashMap.this.n], Object2ByteOpenCustomHashMap.this.value[Object2ByteOpenCustomHashMap.this.n])); 
/*  934 */       for (int pos = Object2ByteOpenCustomHashMap.this.n; pos-- != 0;) {
/*  935 */         if (Object2ByteOpenCustomHashMap.this.key[pos] != null)
/*  936 */           consumer.accept(new AbstractObject2ByteMap.BasicEntry<>(Object2ByteOpenCustomHashMap.this.key[pos], Object2ByteOpenCustomHashMap.this.value[pos])); 
/*      */       } 
/*      */     }
/*      */     
/*      */     public void fastForEach(Consumer<? super Object2ByteMap.Entry<K>> consumer) {
/*  941 */       AbstractObject2ByteMap.BasicEntry<K> entry = new AbstractObject2ByteMap.BasicEntry<>();
/*  942 */       if (Object2ByteOpenCustomHashMap.this.containsNullKey) {
/*  943 */         entry.key = Object2ByteOpenCustomHashMap.this.key[Object2ByteOpenCustomHashMap.this.n];
/*  944 */         entry.value = Object2ByteOpenCustomHashMap.this.value[Object2ByteOpenCustomHashMap.this.n];
/*  945 */         consumer.accept(entry);
/*      */       } 
/*  947 */       for (int pos = Object2ByteOpenCustomHashMap.this.n; pos-- != 0;) {
/*  948 */         if (Object2ByteOpenCustomHashMap.this.key[pos] != null) {
/*  949 */           entry.key = Object2ByteOpenCustomHashMap.this.key[pos];
/*  950 */           entry.value = Object2ByteOpenCustomHashMap.this.value[pos];
/*  951 */           consumer.accept(entry);
/*      */         } 
/*      */       } 
/*      */     } }
/*      */   
/*      */   public Object2ByteMap.FastEntrySet<K> object2ByteEntrySet() {
/*  957 */     if (this.entries == null)
/*  958 */       this.entries = new MapEntrySet(); 
/*  959 */     return this.entries;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final class KeyIterator
/*      */     extends MapIterator
/*      */     implements ObjectIterator<K>
/*      */   {
/*      */     public K next() {
/*  976 */       return Object2ByteOpenCustomHashMap.this.key[nextEntry()];
/*      */     } }
/*      */   
/*      */   private final class KeySet extends AbstractObjectSet<K> { private KeySet() {}
/*      */     
/*      */     public ObjectIterator<K> iterator() {
/*  982 */       return new Object2ByteOpenCustomHashMap.KeyIterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public void forEach(Consumer<? super K> consumer) {
/*  987 */       if (Object2ByteOpenCustomHashMap.this.containsNullKey)
/*  988 */         consumer.accept(Object2ByteOpenCustomHashMap.this.key[Object2ByteOpenCustomHashMap.this.n]); 
/*  989 */       for (int pos = Object2ByteOpenCustomHashMap.this.n; pos-- != 0; ) {
/*  990 */         K k = Object2ByteOpenCustomHashMap.this.key[pos];
/*  991 */         if (k != null)
/*  992 */           consumer.accept(k); 
/*      */       } 
/*      */     }
/*      */     
/*      */     public int size() {
/*  997 */       return Object2ByteOpenCustomHashMap.this.size;
/*      */     }
/*      */     
/*      */     public boolean contains(Object k) {
/* 1001 */       return Object2ByteOpenCustomHashMap.this.containsKey(k);
/*      */     }
/*      */     
/*      */     public boolean remove(Object k) {
/* 1005 */       int oldSize = Object2ByteOpenCustomHashMap.this.size;
/* 1006 */       Object2ByteOpenCustomHashMap.this.removeByte(k);
/* 1007 */       return (Object2ByteOpenCustomHashMap.this.size != oldSize);
/*      */     }
/*      */     
/*      */     public void clear() {
/* 1011 */       Object2ByteOpenCustomHashMap.this.clear();
/*      */     } }
/*      */ 
/*      */   
/*      */   public ObjectSet<K> keySet() {
/* 1016 */     if (this.keys == null)
/* 1017 */       this.keys = new KeySet(); 
/* 1018 */     return this.keys;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final class ValueIterator
/*      */     extends MapIterator
/*      */     implements ByteIterator
/*      */   {
/*      */     public byte nextByte() {
/* 1035 */       return Object2ByteOpenCustomHashMap.this.value[nextEntry()];
/*      */     }
/*      */   }
/*      */   
/*      */   public ByteCollection values() {
/* 1040 */     if (this.values == null)
/* 1041 */       this.values = (ByteCollection)new AbstractByteCollection()
/*      */         {
/*      */           public ByteIterator iterator() {
/* 1044 */             return new Object2ByteOpenCustomHashMap.ValueIterator();
/*      */           }
/*      */           
/*      */           public int size() {
/* 1048 */             return Object2ByteOpenCustomHashMap.this.size;
/*      */           }
/*      */           
/*      */           public boolean contains(byte v) {
/* 1052 */             return Object2ByteOpenCustomHashMap.this.containsValue(v);
/*      */           }
/*      */           
/*      */           public void clear() {
/* 1056 */             Object2ByteOpenCustomHashMap.this.clear();
/*      */           }
/*      */           
/*      */           public void forEach(IntConsumer consumer)
/*      */           {
/* 1061 */             if (Object2ByteOpenCustomHashMap.this.containsNullKey)
/* 1062 */               consumer.accept(Object2ByteOpenCustomHashMap.this.value[Object2ByteOpenCustomHashMap.this.n]); 
/* 1063 */             for (int pos = Object2ByteOpenCustomHashMap.this.n; pos-- != 0;) {
/* 1064 */               if (Object2ByteOpenCustomHashMap.this.key[pos] != null)
/* 1065 */                 consumer.accept(Object2ByteOpenCustomHashMap.this.value[pos]); 
/*      */             }  }
/*      */         }; 
/* 1068 */     return this.values;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean trim() {
/* 1085 */     int l = HashCommon.arraySize(this.size, this.f);
/* 1086 */     if (l >= this.n || this.size > HashCommon.maxFill(l, this.f))
/* 1087 */       return true; 
/*      */     try {
/* 1089 */       rehash(l);
/* 1090 */     } catch (OutOfMemoryError cantDoIt) {
/* 1091 */       return false;
/*      */     } 
/* 1093 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean trim(int n) {
/* 1117 */     int l = HashCommon.nextPowerOfTwo((int)Math.ceil((n / this.f)));
/* 1118 */     if (l >= n || this.size > HashCommon.maxFill(l, this.f))
/* 1119 */       return true; 
/*      */     try {
/* 1121 */       rehash(l);
/* 1122 */     } catch (OutOfMemoryError cantDoIt) {
/* 1123 */       return false;
/*      */     } 
/* 1125 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void rehash(int newN) {
/* 1141 */     K[] key = this.key;
/* 1142 */     byte[] value = this.value;
/* 1143 */     int mask = newN - 1;
/* 1144 */     K[] newKey = (K[])new Object[newN + 1];
/* 1145 */     byte[] newValue = new byte[newN + 1];
/* 1146 */     int i = this.n;
/* 1147 */     for (int j = realSize(); j-- != 0; ) {
/* 1148 */       while (key[--i] == null); int pos;
/* 1149 */       if (newKey[pos = HashCommon.mix(this.strategy.hashCode(key[i])) & mask] != null)
/* 1150 */         while (newKey[pos = pos + 1 & mask] != null); 
/* 1151 */       newKey[pos] = key[i];
/* 1152 */       newValue[pos] = value[i];
/*      */     } 
/* 1154 */     newValue[newN] = value[this.n];
/* 1155 */     this.n = newN;
/* 1156 */     this.mask = mask;
/* 1157 */     this.maxFill = HashCommon.maxFill(this.n, this.f);
/* 1158 */     this.key = newKey;
/* 1159 */     this.value = newValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object2ByteOpenCustomHashMap<K> clone() {
/*      */     Object2ByteOpenCustomHashMap<K> c;
/*      */     try {
/* 1176 */       c = (Object2ByteOpenCustomHashMap<K>)super.clone();
/* 1177 */     } catch (CloneNotSupportedException cantHappen) {
/* 1178 */       throw new InternalError();
/*      */     } 
/* 1180 */     c.keys = null;
/* 1181 */     c.values = null;
/* 1182 */     c.entries = null;
/* 1183 */     c.containsNullKey = this.containsNullKey;
/* 1184 */     c.key = (K[])this.key.clone();
/* 1185 */     c.value = (byte[])this.value.clone();
/* 1186 */     c.strategy = this.strategy;
/* 1187 */     return c;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 1200 */     int h = 0;
/* 1201 */     for (int j = realSize(), i = 0, t = 0; j-- != 0; ) {
/* 1202 */       while (this.key[i] == null)
/* 1203 */         i++; 
/* 1204 */       if (this != this.key[i])
/* 1205 */         t = this.strategy.hashCode(this.key[i]); 
/* 1206 */       t ^= this.value[i];
/* 1207 */       h += t;
/* 1208 */       i++;
/*      */     } 
/*      */     
/* 1211 */     if (this.containsNullKey)
/* 1212 */       h += this.value[this.n]; 
/* 1213 */     return h;
/*      */   }
/*      */   private void writeObject(ObjectOutputStream s) throws IOException {
/* 1216 */     K[] key = this.key;
/* 1217 */     byte[] value = this.value;
/* 1218 */     MapIterator i = new MapIterator();
/* 1219 */     s.defaultWriteObject();
/* 1220 */     for (int j = this.size; j-- != 0; ) {
/* 1221 */       int e = i.nextEntry();
/* 1222 */       s.writeObject(key[e]);
/* 1223 */       s.writeByte(value[e]);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
/* 1228 */     s.defaultReadObject();
/* 1229 */     this.n = HashCommon.arraySize(this.size, this.f);
/* 1230 */     this.maxFill = HashCommon.maxFill(this.n, this.f);
/* 1231 */     this.mask = this.n - 1;
/* 1232 */     K[] key = this.key = (K[])new Object[this.n + 1];
/* 1233 */     byte[] value = this.value = new byte[this.n + 1];
/*      */ 
/*      */     
/* 1236 */     for (int i = this.size; i-- != 0; ) {
/* 1237 */       int pos; K k = (K)s.readObject();
/* 1238 */       byte v = s.readByte();
/* 1239 */       if (this.strategy.equals(k, null)) {
/* 1240 */         pos = this.n;
/* 1241 */         this.containsNullKey = true;
/*      */       } else {
/* 1243 */         pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask;
/* 1244 */         while (key[pos] != null)
/* 1245 */           pos = pos + 1 & this.mask; 
/*      */       } 
/* 1247 */       key[pos] = k;
/* 1248 */       value[pos] = v;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void checkTable() {}
/*      */ }


/* Location:              F:\dw\server.jar!\i\\unimi\dsi\fastutil\objects\Object2ByteOpenCustomHashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */