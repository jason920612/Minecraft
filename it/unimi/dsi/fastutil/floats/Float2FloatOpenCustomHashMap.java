/*      */ package it.unimi.dsi.fastutil.floats;
/*      */ 
/*      */ import it.unimi.dsi.fastutil.Hash;
/*      */ import it.unimi.dsi.fastutil.HashCommon;
/*      */ import it.unimi.dsi.fastutil.SafeMath;
/*      */ import it.unimi.dsi.fastutil.objects.AbstractObjectSet;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectSet;
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
/*      */ import java.util.function.DoubleConsumer;
/*      */ import java.util.function.DoubleFunction;
/*      */ import java.util.function.DoubleUnaryOperator;
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
/*      */ public class Float2FloatOpenCustomHashMap
/*      */   extends AbstractFloat2FloatMap
/*      */   implements Serializable, Cloneable, Hash
/*      */ {
/*      */   private static final long serialVersionUID = 0L;
/*      */   private static final boolean ASSERTS = false;
/*      */   protected transient float[] key;
/*      */   protected transient float[] value;
/*      */   protected transient int mask;
/*      */   protected transient boolean containsNullKey;
/*      */   protected FloatHash.Strategy strategy;
/*      */   protected transient int n;
/*      */   protected transient int maxFill;
/*      */   protected final transient int minN;
/*      */   protected int size;
/*      */   protected final float f;
/*      */   protected transient Float2FloatMap.FastEntrySet entries;
/*      */   protected transient FloatSet keys;
/*      */   protected transient FloatCollection values;
/*      */   
/*      */   public Float2FloatOpenCustomHashMap(int expected, float f, FloatHash.Strategy strategy) {
/*  107 */     this.strategy = strategy;
/*  108 */     if (f <= 0.0F || f > 1.0F)
/*  109 */       throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than or equal to 1"); 
/*  110 */     if (expected < 0)
/*  111 */       throw new IllegalArgumentException("The expected number of elements must be nonnegative"); 
/*  112 */     this.f = f;
/*  113 */     this.minN = this.n = HashCommon.arraySize(expected, f);
/*  114 */     this.mask = this.n - 1;
/*  115 */     this.maxFill = HashCommon.maxFill(this.n, f);
/*  116 */     this.key = new float[this.n + 1];
/*  117 */     this.value = new float[this.n + 1];
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
/*      */   public Float2FloatOpenCustomHashMap(int expected, FloatHash.Strategy strategy) {
/*  129 */     this(expected, 0.75F, strategy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Float2FloatOpenCustomHashMap(FloatHash.Strategy strategy) {
/*  140 */     this(16, 0.75F, strategy);
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
/*      */   public Float2FloatOpenCustomHashMap(Map<? extends Float, ? extends Float> m, float f, FloatHash.Strategy strategy) {
/*  154 */     this(m.size(), f, strategy);
/*  155 */     putAll(m);
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
/*      */   public Float2FloatOpenCustomHashMap(Map<? extends Float, ? extends Float> m, FloatHash.Strategy strategy) {
/*  168 */     this(m, 0.75F, strategy);
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
/*      */   public Float2FloatOpenCustomHashMap(Float2FloatMap m, float f, FloatHash.Strategy strategy) {
/*  182 */     this(m.size(), f, strategy);
/*  183 */     putAll(m);
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
/*      */   public Float2FloatOpenCustomHashMap(Float2FloatMap m, FloatHash.Strategy strategy) {
/*  196 */     this(m, 0.75F, strategy);
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
/*      */   public Float2FloatOpenCustomHashMap(float[] k, float[] v, float f, FloatHash.Strategy strategy) {
/*  214 */     this(k.length, f, strategy);
/*  215 */     if (k.length != v.length) {
/*  216 */       throw new IllegalArgumentException("The key array and the value array have different lengths (" + k.length + " and " + v.length + ")");
/*      */     }
/*  218 */     for (int i = 0; i < k.length; i++) {
/*  219 */       put(k[i], v[i]);
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
/*      */   
/*      */   public Float2FloatOpenCustomHashMap(float[] k, float[] v, FloatHash.Strategy strategy) {
/*  236 */     this(k, v, 0.75F, strategy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FloatHash.Strategy strategy() {
/*  244 */     return this.strategy;
/*      */   }
/*      */   private int realSize() {
/*  247 */     return this.containsNullKey ? (this.size - 1) : this.size;
/*      */   }
/*      */   private void ensureCapacity(int capacity) {
/*  250 */     int needed = HashCommon.arraySize(capacity, this.f);
/*  251 */     if (needed > this.n)
/*  252 */       rehash(needed); 
/*      */   }
/*      */   private void tryCapacity(long capacity) {
/*  255 */     int needed = (int)Math.min(1073741824L, 
/*  256 */         Math.max(2L, HashCommon.nextPowerOfTwo((long)Math.ceil(((float)capacity / this.f)))));
/*  257 */     if (needed > this.n)
/*  258 */       rehash(needed); 
/*      */   }
/*      */   private float removeEntry(int pos) {
/*  261 */     float oldValue = this.value[pos];
/*  262 */     this.size--;
/*  263 */     shiftKeys(pos);
/*  264 */     if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16)
/*  265 */       rehash(this.n / 2); 
/*  266 */     return oldValue;
/*      */   }
/*      */   private float removeNullEntry() {
/*  269 */     this.containsNullKey = false;
/*  270 */     float oldValue = this.value[this.n];
/*  271 */     this.size--;
/*  272 */     if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16)
/*  273 */       rehash(this.n / 2); 
/*  274 */     return oldValue;
/*      */   }
/*      */   
/*      */   public void putAll(Map<? extends Float, ? extends Float> m) {
/*  278 */     if (this.f <= 0.5D) {
/*  279 */       ensureCapacity(m.size());
/*      */     } else {
/*  281 */       tryCapacity((size() + m.size()));
/*      */     } 
/*  283 */     super.putAll(m);
/*      */   }
/*      */   
/*      */   private int find(float k) {
/*  287 */     if (this.strategy.equals(k, 0.0F)) {
/*  288 */       return this.containsNullKey ? this.n : -(this.n + 1);
/*      */     }
/*  290 */     float[] key = this.key;
/*      */     float curr;
/*      */     int pos;
/*  293 */     if (Float.floatToIntBits(
/*  294 */         curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == 0)
/*  295 */       return -(pos + 1); 
/*  296 */     if (this.strategy.equals(k, curr)) {
/*  297 */       return pos;
/*      */     }
/*      */     while (true) {
/*  300 */       if (Float.floatToIntBits(curr = key[pos = pos + 1 & this.mask]) == 0)
/*  301 */         return -(pos + 1); 
/*  302 */       if (this.strategy.equals(k, curr))
/*  303 */         return pos; 
/*      */     } 
/*      */   }
/*      */   private void insert(int pos, float k, float v) {
/*  307 */     if (pos == this.n)
/*  308 */       this.containsNullKey = true; 
/*  309 */     this.key[pos] = k;
/*  310 */     this.value[pos] = v;
/*  311 */     if (this.size++ >= this.maxFill) {
/*  312 */       rehash(HashCommon.arraySize(this.size + 1, this.f));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public float put(float k, float v) {
/*  318 */     int pos = find(k);
/*  319 */     if (pos < 0) {
/*  320 */       insert(-pos - 1, k, v);
/*  321 */       return this.defRetValue;
/*      */     } 
/*  323 */     float oldValue = this.value[pos];
/*  324 */     this.value[pos] = v;
/*  325 */     return oldValue;
/*      */   }
/*      */   private float addToValue(int pos, float incr) {
/*  328 */     float oldValue = this.value[pos];
/*  329 */     this.value[pos] = oldValue + incr;
/*  330 */     return oldValue;
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
/*      */   public float addTo(float k, float incr) {
/*      */     int pos;
/*  350 */     if (this.strategy.equals(k, 0.0F)) {
/*  351 */       if (this.containsNullKey)
/*  352 */         return addToValue(this.n, incr); 
/*  353 */       pos = this.n;
/*  354 */       this.containsNullKey = true;
/*      */     } else {
/*      */       
/*  357 */       float[] key = this.key;
/*      */       float curr;
/*  359 */       if (Float.floatToIntBits(
/*  360 */           curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) != 0) {
/*  361 */         if (this.strategy.equals(curr, k))
/*  362 */           return addToValue(pos, incr); 
/*  363 */         while (Float.floatToIntBits(curr = key[pos = pos + 1 & this.mask]) != 0) {
/*  364 */           if (this.strategy.equals(curr, k))
/*  365 */             return addToValue(pos, incr); 
/*      */         } 
/*      */       } 
/*  368 */     }  this.key[pos] = k;
/*  369 */     this.value[pos] = this.defRetValue + incr;
/*  370 */     if (this.size++ >= this.maxFill) {
/*  371 */       rehash(HashCommon.arraySize(this.size + 1, this.f));
/*      */     }
/*      */     
/*  374 */     return this.defRetValue;
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
/*  387 */     float[] key = this.key; while (true) {
/*      */       float curr; int last;
/*  389 */       pos = (last = pos) + 1 & this.mask;
/*      */       while (true) {
/*  391 */         if (Float.floatToIntBits(curr = key[pos]) == 0) {
/*  392 */           key[last] = 0.0F;
/*      */           return;
/*      */         } 
/*  395 */         int slot = HashCommon.mix(this.strategy.hashCode(curr)) & this.mask;
/*  396 */         if ((last <= pos) ? (last >= slot || slot > pos) : (last >= slot && slot > pos))
/*      */           break; 
/*  398 */         pos = pos + 1 & this.mask;
/*      */       } 
/*  400 */       key[last] = curr;
/*  401 */       this.value[last] = this.value[pos];
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public float remove(float k) {
/*  407 */     if (this.strategy.equals(k, 0.0F)) {
/*  408 */       if (this.containsNullKey)
/*  409 */         return removeNullEntry(); 
/*  410 */       return this.defRetValue;
/*      */     } 
/*      */     
/*  413 */     float[] key = this.key;
/*      */     float curr;
/*      */     int pos;
/*  416 */     if (Float.floatToIntBits(
/*  417 */         curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == 0)
/*  418 */       return this.defRetValue; 
/*  419 */     if (this.strategy.equals(k, curr))
/*  420 */       return removeEntry(pos); 
/*      */     while (true) {
/*  422 */       if (Float.floatToIntBits(curr = key[pos = pos + 1 & this.mask]) == 0)
/*  423 */         return this.defRetValue; 
/*  424 */       if (this.strategy.equals(k, curr)) {
/*  425 */         return removeEntry(pos);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public float get(float k) {
/*  431 */     if (this.strategy.equals(k, 0.0F)) {
/*  432 */       return this.containsNullKey ? this.value[this.n] : this.defRetValue;
/*      */     }
/*  434 */     float[] key = this.key;
/*      */     float curr;
/*      */     int pos;
/*  437 */     if (Float.floatToIntBits(
/*  438 */         curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == 0)
/*  439 */       return this.defRetValue; 
/*  440 */     if (this.strategy.equals(k, curr)) {
/*  441 */       return this.value[pos];
/*      */     }
/*      */     while (true) {
/*  444 */       if (Float.floatToIntBits(curr = key[pos = pos + 1 & this.mask]) == 0)
/*  445 */         return this.defRetValue; 
/*  446 */       if (this.strategy.equals(k, curr)) {
/*  447 */         return this.value[pos];
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean containsKey(float k) {
/*  453 */     if (this.strategy.equals(k, 0.0F)) {
/*  454 */       return this.containsNullKey;
/*      */     }
/*  456 */     float[] key = this.key;
/*      */     float curr;
/*      */     int pos;
/*  459 */     if (Float.floatToIntBits(
/*  460 */         curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == 0)
/*  461 */       return false; 
/*  462 */     if (this.strategy.equals(k, curr)) {
/*  463 */       return true;
/*      */     }
/*      */     while (true) {
/*  466 */       if (Float.floatToIntBits(curr = key[pos = pos + 1 & this.mask]) == 0)
/*  467 */         return false; 
/*  468 */       if (this.strategy.equals(k, curr))
/*  469 */         return true; 
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean containsValue(float v) {
/*  474 */     float[] value = this.value;
/*  475 */     float[] key = this.key;
/*  476 */     if (this.containsNullKey && Float.floatToIntBits(value[this.n]) == Float.floatToIntBits(v))
/*  477 */       return true; 
/*  478 */     for (int i = this.n; i-- != 0;) {
/*  479 */       if (Float.floatToIntBits(key[i]) != 0 && Float.floatToIntBits(value[i]) == Float.floatToIntBits(v))
/*  480 */         return true; 
/*  481 */     }  return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public float getOrDefault(float k, float defaultValue) {
/*  487 */     if (this.strategy.equals(k, 0.0F)) {
/*  488 */       return this.containsNullKey ? this.value[this.n] : defaultValue;
/*      */     }
/*  490 */     float[] key = this.key;
/*      */     float curr;
/*      */     int pos;
/*  493 */     if (Float.floatToIntBits(
/*  494 */         curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == 0)
/*  495 */       return defaultValue; 
/*  496 */     if (this.strategy.equals(k, curr)) {
/*  497 */       return this.value[pos];
/*      */     }
/*      */     while (true) {
/*  500 */       if (Float.floatToIntBits(curr = key[pos = pos + 1 & this.mask]) == 0)
/*  501 */         return defaultValue; 
/*  502 */       if (this.strategy.equals(k, curr)) {
/*  503 */         return this.value[pos];
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public float putIfAbsent(float k, float v) {
/*  509 */     int pos = find(k);
/*  510 */     if (pos >= 0)
/*  511 */       return this.value[pos]; 
/*  512 */     insert(-pos - 1, k, v);
/*  513 */     return this.defRetValue;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean remove(float k, float v) {
/*  519 */     if (this.strategy.equals(k, 0.0F)) {
/*  520 */       if (this.containsNullKey && Float.floatToIntBits(v) == Float.floatToIntBits(this.value[this.n])) {
/*  521 */         removeNullEntry();
/*  522 */         return true;
/*      */       } 
/*  524 */       return false;
/*      */     } 
/*      */     
/*  527 */     float[] key = this.key;
/*      */     float curr;
/*      */     int pos;
/*  530 */     if (Float.floatToIntBits(
/*  531 */         curr = key[pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask]) == 0)
/*  532 */       return false; 
/*  533 */     if (this.strategy.equals(k, curr) && Float.floatToIntBits(v) == Float.floatToIntBits(this.value[pos])) {
/*  534 */       removeEntry(pos);
/*  535 */       return true;
/*      */     } 
/*      */     while (true) {
/*  538 */       if (Float.floatToIntBits(curr = key[pos = pos + 1 & this.mask]) == 0)
/*  539 */         return false; 
/*  540 */       if (this.strategy.equals(k, curr) && Float.floatToIntBits(v) == Float.floatToIntBits(this.value[pos])) {
/*  541 */         removeEntry(pos);
/*  542 */         return true;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean replace(float k, float oldValue, float v) {
/*  549 */     int pos = find(k);
/*  550 */     if (pos < 0 || Float.floatToIntBits(oldValue) != Float.floatToIntBits(this.value[pos]))
/*  551 */       return false; 
/*  552 */     this.value[pos] = v;
/*  553 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public float replace(float k, float v) {
/*  558 */     int pos = find(k);
/*  559 */     if (pos < 0)
/*  560 */       return this.defRetValue; 
/*  561 */     float oldValue = this.value[pos];
/*  562 */     this.value[pos] = v;
/*  563 */     return oldValue;
/*      */   }
/*      */ 
/*      */   
/*      */   public float computeIfAbsent(float k, DoubleUnaryOperator mappingFunction) {
/*  568 */     Objects.requireNonNull(mappingFunction);
/*  569 */     int pos = find(k);
/*  570 */     if (pos >= 0)
/*  571 */       return this.value[pos]; 
/*  572 */     float newValue = SafeMath.safeDoubleToFloat(mappingFunction.applyAsDouble(k));
/*  573 */     insert(-pos - 1, k, newValue);
/*  574 */     return newValue;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public float computeIfAbsentNullable(float k, DoubleFunction<? extends Float> mappingFunction) {
/*  580 */     Objects.requireNonNull(mappingFunction);
/*  581 */     int pos = find(k);
/*  582 */     if (pos >= 0)
/*  583 */       return this.value[pos]; 
/*  584 */     Float newValue = mappingFunction.apply(k);
/*  585 */     if (newValue == null)
/*  586 */       return this.defRetValue; 
/*  587 */     float v = newValue.floatValue();
/*  588 */     insert(-pos - 1, k, v);
/*  589 */     return v;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public float computeIfPresent(float k, BiFunction<? super Float, ? super Float, ? extends Float> remappingFunction) {
/*  595 */     Objects.requireNonNull(remappingFunction);
/*  596 */     int pos = find(k);
/*  597 */     if (pos < 0)
/*  598 */       return this.defRetValue; 
/*  599 */     Float newValue = remappingFunction.apply(Float.valueOf(k), Float.valueOf(this.value[pos]));
/*  600 */     if (newValue == null) {
/*  601 */       if (this.strategy.equals(k, 0.0F)) {
/*  602 */         removeNullEntry();
/*      */       } else {
/*  604 */         removeEntry(pos);
/*  605 */       }  return this.defRetValue;
/*      */     } 
/*  607 */     this.value[pos] = newValue.floatValue(); return newValue.floatValue();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public float compute(float k, BiFunction<? super Float, ? super Float, ? extends Float> remappingFunction) {
/*  613 */     Objects.requireNonNull(remappingFunction);
/*  614 */     int pos = find(k);
/*  615 */     Float newValue = remappingFunction.apply(Float.valueOf(k), (pos >= 0) ? Float.valueOf(this.value[pos]) : null);
/*  616 */     if (newValue == null) {
/*  617 */       if (pos >= 0)
/*  618 */         if (this.strategy.equals(k, 0.0F)) {
/*  619 */           removeNullEntry();
/*      */         } else {
/*  621 */           removeEntry(pos);
/*      */         }  
/*  623 */       return this.defRetValue;
/*      */     } 
/*  625 */     float newVal = newValue.floatValue();
/*  626 */     if (pos < 0) {
/*  627 */       insert(-pos - 1, k, newVal);
/*  628 */       return newVal;
/*      */     } 
/*  630 */     this.value[pos] = newVal; return newVal;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public float merge(float k, float v, BiFunction<? super Float, ? super Float, ? extends Float> remappingFunction) {
/*  636 */     Objects.requireNonNull(remappingFunction);
/*  637 */     int pos = find(k);
/*  638 */     if (pos < 0) {
/*  639 */       insert(-pos - 1, k, v);
/*  640 */       return v;
/*      */     } 
/*  642 */     Float newValue = remappingFunction.apply(Float.valueOf(this.value[pos]), Float.valueOf(v));
/*  643 */     if (newValue == null) {
/*  644 */       if (this.strategy.equals(k, 0.0F)) {
/*  645 */         removeNullEntry();
/*      */       } else {
/*  647 */         removeEntry(pos);
/*  648 */       }  return this.defRetValue;
/*      */     } 
/*  650 */     this.value[pos] = newValue.floatValue(); return newValue.floatValue();
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
/*  661 */     if (this.size == 0)
/*      */       return; 
/*  663 */     this.size = 0;
/*  664 */     this.containsNullKey = false;
/*  665 */     Arrays.fill(this.key, 0.0F);
/*      */   }
/*      */   
/*      */   public int size() {
/*  669 */     return this.size;
/*      */   }
/*      */   
/*      */   public boolean isEmpty() {
/*  673 */     return (this.size == 0);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   final class MapEntry
/*      */     implements Float2FloatMap.Entry, Map.Entry<Float, Float>
/*      */   {
/*      */     int index;
/*      */ 
/*      */     
/*      */     MapEntry(int index) {
/*  685 */       this.index = index;
/*      */     }
/*      */     
/*      */     MapEntry() {}
/*      */     
/*      */     public float getFloatKey() {
/*  691 */       return Float2FloatOpenCustomHashMap.this.key[this.index];
/*      */     }
/*      */     
/*      */     public float getFloatValue() {
/*  695 */       return Float2FloatOpenCustomHashMap.this.value[this.index];
/*      */     }
/*      */     
/*      */     public float setValue(float v) {
/*  699 */       float oldValue = Float2FloatOpenCustomHashMap.this.value[this.index];
/*  700 */       Float2FloatOpenCustomHashMap.this.value[this.index] = v;
/*  701 */       return oldValue;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Float getKey() {
/*  711 */       return Float.valueOf(Float2FloatOpenCustomHashMap.this.key[this.index]);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Float getValue() {
/*  721 */       return Float.valueOf(Float2FloatOpenCustomHashMap.this.value[this.index]);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Float setValue(Float v) {
/*  731 */       return Float.valueOf(setValue(v.floatValue()));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object o) {
/*  736 */       if (!(o instanceof Map.Entry))
/*  737 */         return false; 
/*  738 */       Map.Entry<Float, Float> e = (Map.Entry<Float, Float>)o;
/*  739 */       return (Float2FloatOpenCustomHashMap.this.strategy.equals(Float2FloatOpenCustomHashMap.this.key[this.index], ((Float)e.getKey()).floatValue()) && 
/*  740 */         Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.value[this.index]) == Float.floatToIntBits(((Float)e.getValue()).floatValue()));
/*      */     }
/*      */     
/*      */     public int hashCode() {
/*  744 */       return Float2FloatOpenCustomHashMap.this.strategy.hashCode(Float2FloatOpenCustomHashMap.this.key[this.index]) ^ HashCommon.float2int(Float2FloatOpenCustomHashMap.this.value[this.index]);
/*      */     }
/*      */     
/*      */     public String toString() {
/*  748 */       return Float2FloatOpenCustomHashMap.this.key[this.index] + "=>" + Float2FloatOpenCustomHashMap.this.value[this.index];
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class MapIterator
/*      */   {
/*  758 */     int pos = Float2FloatOpenCustomHashMap.this.n;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  765 */     int last = -1;
/*      */     
/*  767 */     int c = Float2FloatOpenCustomHashMap.this.size;
/*      */ 
/*      */ 
/*      */     
/*  771 */     boolean mustReturnNullKey = Float2FloatOpenCustomHashMap.this.containsNullKey;
/*      */ 
/*      */     
/*      */     FloatArrayList wrapped;
/*      */ 
/*      */     
/*      */     public boolean hasNext() {
/*  778 */       return (this.c != 0);
/*      */     }
/*      */     public int nextEntry() {
/*  781 */       if (!hasNext())
/*  782 */         throw new NoSuchElementException(); 
/*  783 */       this.c--;
/*  784 */       if (this.mustReturnNullKey) {
/*  785 */         this.mustReturnNullKey = false;
/*  786 */         return this.last = Float2FloatOpenCustomHashMap.this.n;
/*      */       } 
/*  788 */       float[] key = Float2FloatOpenCustomHashMap.this.key;
/*      */       while (true) {
/*  790 */         if (--this.pos < 0) {
/*      */           
/*  792 */           this.last = Integer.MIN_VALUE;
/*  793 */           float k = this.wrapped.getFloat(-this.pos - 1);
/*  794 */           int p = HashCommon.mix(Float2FloatOpenCustomHashMap.this.strategy.hashCode(k)) & Float2FloatOpenCustomHashMap.this.mask;
/*  795 */           while (!Float2FloatOpenCustomHashMap.this.strategy.equals(k, key[p]))
/*  796 */             p = p + 1 & Float2FloatOpenCustomHashMap.this.mask; 
/*  797 */           return p;
/*      */         } 
/*  799 */         if (Float.floatToIntBits(key[this.pos]) != 0) {
/*  800 */           return this.last = this.pos;
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
/*  814 */       float[] key = Float2FloatOpenCustomHashMap.this.key; while (true) {
/*      */         float curr; int last;
/*  816 */         pos = (last = pos) + 1 & Float2FloatOpenCustomHashMap.this.mask;
/*      */         while (true) {
/*  818 */           if (Float.floatToIntBits(curr = key[pos]) == 0) {
/*  819 */             key[last] = 0.0F;
/*      */             return;
/*      */           } 
/*  822 */           int slot = HashCommon.mix(Float2FloatOpenCustomHashMap.this.strategy.hashCode(curr)) & Float2FloatOpenCustomHashMap.this.mask;
/*  823 */           if ((last <= pos) ? (last >= slot || slot > pos) : (last >= slot && slot > pos))
/*      */             break; 
/*  825 */           pos = pos + 1 & Float2FloatOpenCustomHashMap.this.mask;
/*      */         } 
/*  827 */         if (pos < last) {
/*  828 */           if (this.wrapped == null)
/*  829 */             this.wrapped = new FloatArrayList(2); 
/*  830 */           this.wrapped.add(key[pos]);
/*      */         } 
/*  832 */         key[last] = curr;
/*  833 */         Float2FloatOpenCustomHashMap.this.value[last] = Float2FloatOpenCustomHashMap.this.value[pos];
/*      */       } 
/*      */     }
/*      */     public void remove() {
/*  837 */       if (this.last == -1)
/*  838 */         throw new IllegalStateException(); 
/*  839 */       if (this.last == Float2FloatOpenCustomHashMap.this.n) {
/*  840 */         Float2FloatOpenCustomHashMap.this.containsNullKey = false;
/*  841 */       } else if (this.pos >= 0) {
/*  842 */         shiftKeys(this.last);
/*      */       } else {
/*      */         
/*  845 */         Float2FloatOpenCustomHashMap.this.remove(this.wrapped.getFloat(-this.pos - 1));
/*  846 */         this.last = -1;
/*      */         return;
/*      */       } 
/*  849 */       Float2FloatOpenCustomHashMap.this.size--;
/*  850 */       this.last = -1;
/*      */     }
/*      */ 
/*      */     
/*      */     public int skip(int n) {
/*  855 */       int i = n;
/*  856 */       while (i-- != 0 && hasNext())
/*  857 */         nextEntry(); 
/*  858 */       return n - i - 1;
/*      */     }
/*      */     private MapIterator() {} }
/*      */   
/*      */   private class EntryIterator extends MapIterator implements ObjectIterator<Float2FloatMap.Entry> { private Float2FloatOpenCustomHashMap.MapEntry entry;
/*      */     
/*      */     public Float2FloatOpenCustomHashMap.MapEntry next() {
/*  865 */       return this.entry = new Float2FloatOpenCustomHashMap.MapEntry(nextEntry());
/*      */     }
/*      */     private EntryIterator() {}
/*      */     public void remove() {
/*  869 */       super.remove();
/*  870 */       this.entry.index = -1;
/*      */     } }
/*      */   
/*      */   private class FastEntryIterator extends MapIterator implements ObjectIterator<Float2FloatMap.Entry> { private FastEntryIterator() {
/*  874 */       this.entry = new Float2FloatOpenCustomHashMap.MapEntry();
/*      */     } private final Float2FloatOpenCustomHashMap.MapEntry entry;
/*      */     public Float2FloatOpenCustomHashMap.MapEntry next() {
/*  877 */       this.entry.index = nextEntry();
/*  878 */       return this.entry;
/*      */     } }
/*      */   
/*      */   private final class MapEntrySet extends AbstractObjectSet<Float2FloatMap.Entry> implements Float2FloatMap.FastEntrySet { private MapEntrySet() {}
/*      */     
/*      */     public ObjectIterator<Float2FloatMap.Entry> iterator() {
/*  884 */       return new Float2FloatOpenCustomHashMap.EntryIterator();
/*      */     }
/*      */     
/*      */     public ObjectIterator<Float2FloatMap.Entry> fastIterator() {
/*  888 */       return new Float2FloatOpenCustomHashMap.FastEntryIterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object o) {
/*  893 */       if (!(o instanceof Map.Entry))
/*  894 */         return false; 
/*  895 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/*  896 */       if (e.getKey() == null || !(e.getKey() instanceof Float))
/*  897 */         return false; 
/*  898 */       if (e.getValue() == null || !(e.getValue() instanceof Float))
/*  899 */         return false; 
/*  900 */       float k = ((Float)e.getKey()).floatValue();
/*  901 */       float v = ((Float)e.getValue()).floatValue();
/*  902 */       if (Float2FloatOpenCustomHashMap.this.strategy.equals(k, 0.0F)) {
/*  903 */         return (Float2FloatOpenCustomHashMap.this.containsNullKey && 
/*  904 */           Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.value[Float2FloatOpenCustomHashMap.this.n]) == Float.floatToIntBits(v));
/*      */       }
/*  906 */       float[] key = Float2FloatOpenCustomHashMap.this.key;
/*      */       float curr;
/*      */       int pos;
/*  909 */       if (Float.floatToIntBits(
/*  910 */           curr = key[pos = HashCommon.mix(Float2FloatOpenCustomHashMap.this.strategy.hashCode(k)) & Float2FloatOpenCustomHashMap.this.mask]) == 0)
/*  911 */         return false; 
/*  912 */       if (Float2FloatOpenCustomHashMap.this.strategy.equals(k, curr)) {
/*  913 */         return (Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.value[pos]) == Float.floatToIntBits(v));
/*      */       }
/*      */       while (true) {
/*  916 */         if (Float.floatToIntBits(curr = key[pos = pos + 1 & Float2FloatOpenCustomHashMap.this.mask]) == 0)
/*  917 */           return false; 
/*  918 */         if (Float2FloatOpenCustomHashMap.this.strategy.equals(k, curr)) {
/*  919 */           return (Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.value[pos]) == Float.floatToIntBits(v));
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/*      */     public boolean remove(Object o) {
/*  925 */       if (!(o instanceof Map.Entry))
/*  926 */         return false; 
/*  927 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/*  928 */       if (e.getKey() == null || !(e.getKey() instanceof Float))
/*  929 */         return false; 
/*  930 */       if (e.getValue() == null || !(e.getValue() instanceof Float))
/*  931 */         return false; 
/*  932 */       float k = ((Float)e.getKey()).floatValue();
/*  933 */       float v = ((Float)e.getValue()).floatValue();
/*  934 */       if (Float2FloatOpenCustomHashMap.this.strategy.equals(k, 0.0F)) {
/*  935 */         if (Float2FloatOpenCustomHashMap.this.containsNullKey && Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.value[Float2FloatOpenCustomHashMap.this.n]) == Float.floatToIntBits(v)) {
/*  936 */           Float2FloatOpenCustomHashMap.this.removeNullEntry();
/*  937 */           return true;
/*      */         } 
/*  939 */         return false;
/*      */       } 
/*      */       
/*  942 */       float[] key = Float2FloatOpenCustomHashMap.this.key;
/*      */       float curr;
/*      */       int pos;
/*  945 */       if (Float.floatToIntBits(
/*  946 */           curr = key[pos = HashCommon.mix(Float2FloatOpenCustomHashMap.this.strategy.hashCode(k)) & Float2FloatOpenCustomHashMap.this.mask]) == 0)
/*  947 */         return false; 
/*  948 */       if (Float2FloatOpenCustomHashMap.this.strategy.equals(curr, k)) {
/*  949 */         if (Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.value[pos]) == Float.floatToIntBits(v)) {
/*  950 */           Float2FloatOpenCustomHashMap.this.removeEntry(pos);
/*  951 */           return true;
/*      */         } 
/*  953 */         return false;
/*      */       } 
/*      */       while (true) {
/*  956 */         if (Float.floatToIntBits(curr = key[pos = pos + 1 & Float2FloatOpenCustomHashMap.this.mask]) == 0)
/*  957 */           return false; 
/*  958 */         if (Float2FloatOpenCustomHashMap.this.strategy.equals(curr, k) && 
/*  959 */           Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.value[pos]) == Float.floatToIntBits(v)) {
/*  960 */           Float2FloatOpenCustomHashMap.this.removeEntry(pos);
/*  961 */           return true;
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/*  968 */       return Float2FloatOpenCustomHashMap.this.size;
/*      */     }
/*      */     
/*      */     public void clear() {
/*  972 */       Float2FloatOpenCustomHashMap.this.clear();
/*      */     }
/*      */ 
/*      */     
/*      */     public void forEach(Consumer<? super Float2FloatMap.Entry> consumer) {
/*  977 */       if (Float2FloatOpenCustomHashMap.this.containsNullKey)
/*  978 */         consumer.accept(new AbstractFloat2FloatMap.BasicEntry(Float2FloatOpenCustomHashMap.this.key[Float2FloatOpenCustomHashMap.this.n], Float2FloatOpenCustomHashMap.this.value[Float2FloatOpenCustomHashMap.this.n])); 
/*  979 */       for (int pos = Float2FloatOpenCustomHashMap.this.n; pos-- != 0;) {
/*  980 */         if (Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.key[pos]) != 0)
/*  981 */           consumer.accept(new AbstractFloat2FloatMap.BasicEntry(Float2FloatOpenCustomHashMap.this.key[pos], Float2FloatOpenCustomHashMap.this.value[pos])); 
/*      */       } 
/*      */     }
/*      */     
/*      */     public void fastForEach(Consumer<? super Float2FloatMap.Entry> consumer) {
/*  986 */       AbstractFloat2FloatMap.BasicEntry entry = new AbstractFloat2FloatMap.BasicEntry();
/*  987 */       if (Float2FloatOpenCustomHashMap.this.containsNullKey) {
/*  988 */         entry.key = Float2FloatOpenCustomHashMap.this.key[Float2FloatOpenCustomHashMap.this.n];
/*  989 */         entry.value = Float2FloatOpenCustomHashMap.this.value[Float2FloatOpenCustomHashMap.this.n];
/*  990 */         consumer.accept(entry);
/*      */       } 
/*  992 */       for (int pos = Float2FloatOpenCustomHashMap.this.n; pos-- != 0;) {
/*  993 */         if (Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.key[pos]) != 0) {
/*  994 */           entry.key = Float2FloatOpenCustomHashMap.this.key[pos];
/*  995 */           entry.value = Float2FloatOpenCustomHashMap.this.value[pos];
/*  996 */           consumer.accept(entry);
/*      */         } 
/*      */       } 
/*      */     } }
/*      */   
/*      */   public Float2FloatMap.FastEntrySet float2FloatEntrySet() {
/* 1002 */     if (this.entries == null)
/* 1003 */       this.entries = new MapEntrySet(); 
/* 1004 */     return this.entries;
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
/*      */     implements FloatIterator
/*      */   {
/*      */     public float nextFloat() {
/* 1021 */       return Float2FloatOpenCustomHashMap.this.key[nextEntry()];
/*      */     } }
/*      */   
/*      */   private final class KeySet extends AbstractFloatSet { private KeySet() {}
/*      */     
/*      */     public FloatIterator iterator() {
/* 1027 */       return new Float2FloatOpenCustomHashMap.KeyIterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public void forEach(DoubleConsumer consumer) {
/* 1032 */       if (Float2FloatOpenCustomHashMap.this.containsNullKey)
/* 1033 */         consumer.accept(Float2FloatOpenCustomHashMap.this.key[Float2FloatOpenCustomHashMap.this.n]); 
/* 1034 */       for (int pos = Float2FloatOpenCustomHashMap.this.n; pos-- != 0; ) {
/* 1035 */         float k = Float2FloatOpenCustomHashMap.this.key[pos];
/* 1036 */         if (Float.floatToIntBits(k) != 0)
/* 1037 */           consumer.accept(k); 
/*      */       } 
/*      */     }
/*      */     
/*      */     public int size() {
/* 1042 */       return Float2FloatOpenCustomHashMap.this.size;
/*      */     }
/*      */     
/*      */     public boolean contains(float k) {
/* 1046 */       return Float2FloatOpenCustomHashMap.this.containsKey(k);
/*      */     }
/*      */     
/*      */     public boolean remove(float k) {
/* 1050 */       int oldSize = Float2FloatOpenCustomHashMap.this.size;
/* 1051 */       Float2FloatOpenCustomHashMap.this.remove(k);
/* 1052 */       return (Float2FloatOpenCustomHashMap.this.size != oldSize);
/*      */     }
/*      */     
/*      */     public void clear() {
/* 1056 */       Float2FloatOpenCustomHashMap.this.clear();
/*      */     } }
/*      */ 
/*      */   
/*      */   public FloatSet keySet() {
/* 1061 */     if (this.keys == null)
/* 1062 */       this.keys = new KeySet(); 
/* 1063 */     return this.keys;
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
/*      */     implements FloatIterator
/*      */   {
/*      */     public float nextFloat() {
/* 1080 */       return Float2FloatOpenCustomHashMap.this.value[nextEntry()];
/*      */     }
/*      */   }
/*      */   
/*      */   public FloatCollection values() {
/* 1085 */     if (this.values == null)
/* 1086 */       this.values = new AbstractFloatCollection()
/*      */         {
/*      */           public FloatIterator iterator() {
/* 1089 */             return new Float2FloatOpenCustomHashMap.ValueIterator();
/*      */           }
/*      */           
/*      */           public int size() {
/* 1093 */             return Float2FloatOpenCustomHashMap.this.size;
/*      */           }
/*      */           
/*      */           public boolean contains(float v) {
/* 1097 */             return Float2FloatOpenCustomHashMap.this.containsValue(v);
/*      */           }
/*      */           
/*      */           public void clear() {
/* 1101 */             Float2FloatOpenCustomHashMap.this.clear();
/*      */           }
/*      */           
/*      */           public void forEach(DoubleConsumer consumer)
/*      */           {
/* 1106 */             if (Float2FloatOpenCustomHashMap.this.containsNullKey)
/* 1107 */               consumer.accept(Float2FloatOpenCustomHashMap.this.value[Float2FloatOpenCustomHashMap.this.n]); 
/* 1108 */             for (int pos = Float2FloatOpenCustomHashMap.this.n; pos-- != 0;) {
/* 1109 */               if (Float.floatToIntBits(Float2FloatOpenCustomHashMap.this.key[pos]) != 0)
/* 1110 */                 consumer.accept(Float2FloatOpenCustomHashMap.this.value[pos]); 
/*      */             }  }
/*      */         }; 
/* 1113 */     return this.values;
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
/* 1130 */     int l = HashCommon.arraySize(this.size, this.f);
/* 1131 */     if (l >= this.n || this.size > HashCommon.maxFill(l, this.f))
/* 1132 */       return true; 
/*      */     try {
/* 1134 */       rehash(l);
/* 1135 */     } catch (OutOfMemoryError cantDoIt) {
/* 1136 */       return false;
/*      */     } 
/* 1138 */     return true;
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
/* 1162 */     int l = HashCommon.nextPowerOfTwo((int)Math.ceil((n / this.f)));
/* 1163 */     if (l >= n || this.size > HashCommon.maxFill(l, this.f))
/* 1164 */       return true; 
/*      */     try {
/* 1166 */       rehash(l);
/* 1167 */     } catch (OutOfMemoryError cantDoIt) {
/* 1168 */       return false;
/*      */     } 
/* 1170 */     return true;
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
/* 1186 */     float[] key = this.key;
/* 1187 */     float[] value = this.value;
/* 1188 */     int mask = newN - 1;
/* 1189 */     float[] newKey = new float[newN + 1];
/* 1190 */     float[] newValue = new float[newN + 1];
/* 1191 */     int i = this.n;
/* 1192 */     for (int j = realSize(); j-- != 0; ) {
/* 1193 */       while (Float.floatToIntBits(key[--i]) == 0); int pos;
/* 1194 */       if (Float.floatToIntBits(newKey[
/* 1195 */             pos = HashCommon.mix(this.strategy.hashCode(key[i])) & mask]) != 0)
/* 1196 */         while (Float.floatToIntBits(newKey[pos = pos + 1 & mask]) != 0); 
/* 1197 */       newKey[pos] = key[i];
/* 1198 */       newValue[pos] = value[i];
/*      */     } 
/* 1200 */     newValue[newN] = value[this.n];
/* 1201 */     this.n = newN;
/* 1202 */     this.mask = mask;
/* 1203 */     this.maxFill = HashCommon.maxFill(this.n, this.f);
/* 1204 */     this.key = newKey;
/* 1205 */     this.value = newValue;
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
/*      */   public Float2FloatOpenCustomHashMap clone() {
/*      */     Float2FloatOpenCustomHashMap c;
/*      */     try {
/* 1222 */       c = (Float2FloatOpenCustomHashMap)super.clone();
/* 1223 */     } catch (CloneNotSupportedException cantHappen) {
/* 1224 */       throw new InternalError();
/*      */     } 
/* 1226 */     c.keys = null;
/* 1227 */     c.values = null;
/* 1228 */     c.entries = null;
/* 1229 */     c.containsNullKey = this.containsNullKey;
/* 1230 */     c.key = (float[])this.key.clone();
/* 1231 */     c.value = (float[])this.value.clone();
/* 1232 */     c.strategy = this.strategy;
/* 1233 */     return c;
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
/* 1246 */     int h = 0;
/* 1247 */     for (int j = realSize(), i = 0, t = 0; j-- != 0; ) {
/* 1248 */       while (Float.floatToIntBits(this.key[i]) == 0)
/* 1249 */         i++; 
/* 1250 */       t = this.strategy.hashCode(this.key[i]);
/* 1251 */       t ^= HashCommon.float2int(this.value[i]);
/* 1252 */       h += t;
/* 1253 */       i++;
/*      */     } 
/*      */     
/* 1256 */     if (this.containsNullKey)
/* 1257 */       h += HashCommon.float2int(this.value[this.n]); 
/* 1258 */     return h;
/*      */   }
/*      */   private void writeObject(ObjectOutputStream s) throws IOException {
/* 1261 */     float[] key = this.key;
/* 1262 */     float[] value = this.value;
/* 1263 */     MapIterator i = new MapIterator();
/* 1264 */     s.defaultWriteObject();
/* 1265 */     for (int j = this.size; j-- != 0; ) {
/* 1266 */       int e = i.nextEntry();
/* 1267 */       s.writeFloat(key[e]);
/* 1268 */       s.writeFloat(value[e]);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
/* 1273 */     s.defaultReadObject();
/* 1274 */     this.n = HashCommon.arraySize(this.size, this.f);
/* 1275 */     this.maxFill = HashCommon.maxFill(this.n, this.f);
/* 1276 */     this.mask = this.n - 1;
/* 1277 */     float[] key = this.key = new float[this.n + 1];
/* 1278 */     float[] value = this.value = new float[this.n + 1];
/*      */ 
/*      */     
/* 1281 */     for (int i = this.size; i-- != 0; ) {
/* 1282 */       int pos; float k = s.readFloat();
/* 1283 */       float v = s.readFloat();
/* 1284 */       if (this.strategy.equals(k, 0.0F)) {
/* 1285 */         pos = this.n;
/* 1286 */         this.containsNullKey = true;
/*      */       } else {
/* 1288 */         pos = HashCommon.mix(this.strategy.hashCode(k)) & this.mask;
/* 1289 */         while (Float.floatToIntBits(key[pos]) != 0)
/* 1290 */           pos = pos + 1 & this.mask; 
/*      */       } 
/* 1292 */       key[pos] = k;
/* 1293 */       value[pos] = v;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void checkTable() {}
/*      */ }


/* Location:              F:\dw\server.jar!\i\\unimi\dsi\fastutil\floats\Float2FloatOpenCustomHashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */