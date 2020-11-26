/*      */ package it.unimi.dsi.fastutil.chars;
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
/*      */ import java.util.function.IntConsumer;
/*      */ import java.util.function.IntFunction;
/*      */ import java.util.function.IntUnaryOperator;
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
/*      */ public class Char2CharOpenHashMap
/*      */   extends AbstractChar2CharMap
/*      */   implements Serializable, Cloneable, Hash
/*      */ {
/*      */   private static final long serialVersionUID = 0L;
/*      */   private static final boolean ASSERTS = false;
/*      */   protected transient char[] key;
/*      */   protected transient char[] value;
/*      */   protected transient int mask;
/*      */   protected transient boolean containsNullKey;
/*      */   protected transient int n;
/*      */   protected transient int maxFill;
/*      */   protected final transient int minN;
/*      */   protected int size;
/*      */   protected final float f;
/*      */   protected transient Char2CharMap.FastEntrySet entries;
/*      */   protected transient CharSet keys;
/*      */   protected transient CharCollection values;
/*      */   
/*      */   public Char2CharOpenHashMap(int expected, float f) {
/*   96 */     if (f <= 0.0F || f > 1.0F)
/*   97 */       throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than or equal to 1"); 
/*   98 */     if (expected < 0)
/*   99 */       throw new IllegalArgumentException("The expected number of elements must be nonnegative"); 
/*  100 */     this.f = f;
/*  101 */     this.minN = this.n = HashCommon.arraySize(expected, f);
/*  102 */     this.mask = this.n - 1;
/*  103 */     this.maxFill = HashCommon.maxFill(this.n, f);
/*  104 */     this.key = new char[this.n + 1];
/*  105 */     this.value = new char[this.n + 1];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2CharOpenHashMap(int expected) {
/*  114 */     this(expected, 0.75F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2CharOpenHashMap() {
/*  122 */     this(16, 0.75F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2CharOpenHashMap(Map<? extends Character, ? extends Character> m, float f) {
/*  133 */     this(m.size(), f);
/*  134 */     putAll(m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2CharOpenHashMap(Map<? extends Character, ? extends Character> m) {
/*  144 */     this(m, 0.75F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2CharOpenHashMap(Char2CharMap m, float f) {
/*  155 */     this(m.size(), f);
/*  156 */     putAll(m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2CharOpenHashMap(Char2CharMap m) {
/*  166 */     this(m, 0.75F);
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
/*      */   public Char2CharOpenHashMap(char[] k, char[] v, float f) {
/*  181 */     this(k.length, f);
/*  182 */     if (k.length != v.length) {
/*  183 */       throw new IllegalArgumentException("The key array and the value array have different lengths (" + k.length + " and " + v.length + ")");
/*      */     }
/*  185 */     for (int i = 0; i < k.length; i++) {
/*  186 */       put(k[i], v[i]);
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
/*      */   public Char2CharOpenHashMap(char[] k, char[] v) {
/*  200 */     this(k, v, 0.75F);
/*      */   }
/*      */   private int realSize() {
/*  203 */     return this.containsNullKey ? (this.size - 1) : this.size;
/*      */   }
/*      */   private void ensureCapacity(int capacity) {
/*  206 */     int needed = HashCommon.arraySize(capacity, this.f);
/*  207 */     if (needed > this.n)
/*  208 */       rehash(needed); 
/*      */   }
/*      */   private void tryCapacity(long capacity) {
/*  211 */     int needed = (int)Math.min(1073741824L, 
/*  212 */         Math.max(2L, HashCommon.nextPowerOfTwo((long)Math.ceil(((float)capacity / this.f)))));
/*  213 */     if (needed > this.n)
/*  214 */       rehash(needed); 
/*      */   }
/*      */   private char removeEntry(int pos) {
/*  217 */     char oldValue = this.value[pos];
/*  218 */     this.size--;
/*  219 */     shiftKeys(pos);
/*  220 */     if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16)
/*  221 */       rehash(this.n / 2); 
/*  222 */     return oldValue;
/*      */   }
/*      */   private char removeNullEntry() {
/*  225 */     this.containsNullKey = false;
/*  226 */     char oldValue = this.value[this.n];
/*  227 */     this.size--;
/*  228 */     if (this.n > this.minN && this.size < this.maxFill / 4 && this.n > 16)
/*  229 */       rehash(this.n / 2); 
/*  230 */     return oldValue;
/*      */   }
/*      */   
/*      */   public void putAll(Map<? extends Character, ? extends Character> m) {
/*  234 */     if (this.f <= 0.5D) {
/*  235 */       ensureCapacity(m.size());
/*      */     } else {
/*  237 */       tryCapacity((size() + m.size()));
/*      */     } 
/*  239 */     super.putAll(m);
/*      */   }
/*      */   
/*      */   private int find(char k) {
/*  243 */     if (k == '\000') {
/*  244 */       return this.containsNullKey ? this.n : -(this.n + 1);
/*      */     }
/*  246 */     char[] key = this.key;
/*      */     char curr;
/*      */     int pos;
/*  249 */     if ((curr = key[pos = HashCommon.mix(k) & this.mask]) == '\000')
/*  250 */       return -(pos + 1); 
/*  251 */     if (k == curr) {
/*  252 */       return pos;
/*      */     }
/*      */     while (true) {
/*  255 */       if ((curr = key[pos = pos + 1 & this.mask]) == '\000')
/*  256 */         return -(pos + 1); 
/*  257 */       if (k == curr)
/*  258 */         return pos; 
/*      */     } 
/*      */   }
/*      */   private void insert(int pos, char k, char v) {
/*  262 */     if (pos == this.n)
/*  263 */       this.containsNullKey = true; 
/*  264 */     this.key[pos] = k;
/*  265 */     this.value[pos] = v;
/*  266 */     if (this.size++ >= this.maxFill) {
/*  267 */       rehash(HashCommon.arraySize(this.size + 1, this.f));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public char put(char k, char v) {
/*  273 */     int pos = find(k);
/*  274 */     if (pos < 0) {
/*  275 */       insert(-pos - 1, k, v);
/*  276 */       return this.defRetValue;
/*      */     } 
/*  278 */     char oldValue = this.value[pos];
/*  279 */     this.value[pos] = v;
/*  280 */     return oldValue;
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
/*  293 */     char[] key = this.key; while (true) {
/*      */       char curr; int last;
/*  295 */       pos = (last = pos) + 1 & this.mask;
/*      */       while (true) {
/*  297 */         if ((curr = key[pos]) == '\000') {
/*  298 */           key[last] = Character.MIN_VALUE;
/*      */           return;
/*      */         } 
/*  301 */         int slot = HashCommon.mix(curr) & this.mask;
/*  302 */         if ((last <= pos) ? (last >= slot || slot > pos) : (last >= slot && slot > pos))
/*      */           break; 
/*  304 */         pos = pos + 1 & this.mask;
/*      */       } 
/*  306 */       key[last] = curr;
/*  307 */       this.value[last] = this.value[pos];
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public char remove(char k) {
/*  313 */     if (k == '\000') {
/*  314 */       if (this.containsNullKey)
/*  315 */         return removeNullEntry(); 
/*  316 */       return this.defRetValue;
/*      */     } 
/*      */     
/*  319 */     char[] key = this.key;
/*      */     char curr;
/*      */     int pos;
/*  322 */     if ((curr = key[pos = HashCommon.mix(k) & this.mask]) == '\000')
/*  323 */       return this.defRetValue; 
/*  324 */     if (k == curr)
/*  325 */       return removeEntry(pos); 
/*      */     while (true) {
/*  327 */       if ((curr = key[pos = pos + 1 & this.mask]) == '\000')
/*  328 */         return this.defRetValue; 
/*  329 */       if (k == curr) {
/*  330 */         return removeEntry(pos);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public char get(char k) {
/*  336 */     if (k == '\000') {
/*  337 */       return this.containsNullKey ? this.value[this.n] : this.defRetValue;
/*      */     }
/*  339 */     char[] key = this.key;
/*      */     char curr;
/*      */     int pos;
/*  342 */     if ((curr = key[pos = HashCommon.mix(k) & this.mask]) == '\000')
/*  343 */       return this.defRetValue; 
/*  344 */     if (k == curr) {
/*  345 */       return this.value[pos];
/*      */     }
/*      */     while (true) {
/*  348 */       if ((curr = key[pos = pos + 1 & this.mask]) == '\000')
/*  349 */         return this.defRetValue; 
/*  350 */       if (k == curr) {
/*  351 */         return this.value[pos];
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean containsKey(char k) {
/*  357 */     if (k == '\000') {
/*  358 */       return this.containsNullKey;
/*      */     }
/*  360 */     char[] key = this.key;
/*      */     char curr;
/*      */     int pos;
/*  363 */     if ((curr = key[pos = HashCommon.mix(k) & this.mask]) == '\000')
/*  364 */       return false; 
/*  365 */     if (k == curr) {
/*  366 */       return true;
/*      */     }
/*      */     while (true) {
/*  369 */       if ((curr = key[pos = pos + 1 & this.mask]) == '\000')
/*  370 */         return false; 
/*  371 */       if (k == curr)
/*  372 */         return true; 
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean containsValue(char v) {
/*  377 */     char[] value = this.value;
/*  378 */     char[] key = this.key;
/*  379 */     if (this.containsNullKey && value[this.n] == v)
/*  380 */       return true; 
/*  381 */     for (int i = this.n; i-- != 0;) {
/*  382 */       if (key[i] != '\000' && value[i] == v)
/*  383 */         return true; 
/*  384 */     }  return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public char getOrDefault(char k, char defaultValue) {
/*  390 */     if (k == '\000') {
/*  391 */       return this.containsNullKey ? this.value[this.n] : defaultValue;
/*      */     }
/*  393 */     char[] key = this.key;
/*      */     char curr;
/*      */     int pos;
/*  396 */     if ((curr = key[pos = HashCommon.mix(k) & this.mask]) == '\000')
/*  397 */       return defaultValue; 
/*  398 */     if (k == curr) {
/*  399 */       return this.value[pos];
/*      */     }
/*      */     while (true) {
/*  402 */       if ((curr = key[pos = pos + 1 & this.mask]) == '\000')
/*  403 */         return defaultValue; 
/*  404 */       if (k == curr) {
/*  405 */         return this.value[pos];
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public char putIfAbsent(char k, char v) {
/*  411 */     int pos = find(k);
/*  412 */     if (pos >= 0)
/*  413 */       return this.value[pos]; 
/*  414 */     insert(-pos - 1, k, v);
/*  415 */     return this.defRetValue;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean remove(char k, char v) {
/*  421 */     if (k == '\000') {
/*  422 */       if (this.containsNullKey && v == this.value[this.n]) {
/*  423 */         removeNullEntry();
/*  424 */         return true;
/*      */       } 
/*  426 */       return false;
/*      */     } 
/*      */     
/*  429 */     char[] key = this.key;
/*      */     char curr;
/*      */     int pos;
/*  432 */     if ((curr = key[pos = HashCommon.mix(k) & this.mask]) == '\000')
/*  433 */       return false; 
/*  434 */     if (k == curr && v == this.value[pos]) {
/*  435 */       removeEntry(pos);
/*  436 */       return true;
/*      */     } 
/*      */     while (true) {
/*  439 */       if ((curr = key[pos = pos + 1 & this.mask]) == '\000')
/*  440 */         return false; 
/*  441 */       if (k == curr && v == this.value[pos]) {
/*  442 */         removeEntry(pos);
/*  443 */         return true;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean replace(char k, char oldValue, char v) {
/*  450 */     int pos = find(k);
/*  451 */     if (pos < 0 || oldValue != this.value[pos])
/*  452 */       return false; 
/*  453 */     this.value[pos] = v;
/*  454 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public char replace(char k, char v) {
/*  459 */     int pos = find(k);
/*  460 */     if (pos < 0)
/*  461 */       return this.defRetValue; 
/*  462 */     char oldValue = this.value[pos];
/*  463 */     this.value[pos] = v;
/*  464 */     return oldValue;
/*      */   }
/*      */ 
/*      */   
/*      */   public char computeIfAbsent(char k, IntUnaryOperator mappingFunction) {
/*  469 */     Objects.requireNonNull(mappingFunction);
/*  470 */     int pos = find(k);
/*  471 */     if (pos >= 0)
/*  472 */       return this.value[pos]; 
/*  473 */     char newValue = SafeMath.safeIntToChar(mappingFunction.applyAsInt(k));
/*  474 */     insert(-pos - 1, k, newValue);
/*  475 */     return newValue;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public char computeIfAbsentNullable(char k, IntFunction<? extends Character> mappingFunction) {
/*  481 */     Objects.requireNonNull(mappingFunction);
/*  482 */     int pos = find(k);
/*  483 */     if (pos >= 0)
/*  484 */       return this.value[pos]; 
/*  485 */     Character newValue = mappingFunction.apply(k);
/*  486 */     if (newValue == null)
/*  487 */       return this.defRetValue; 
/*  488 */     char v = newValue.charValue();
/*  489 */     insert(-pos - 1, k, v);
/*  490 */     return v;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public char computeIfPresent(char k, BiFunction<? super Character, ? super Character, ? extends Character> remappingFunction) {
/*  496 */     Objects.requireNonNull(remappingFunction);
/*  497 */     int pos = find(k);
/*  498 */     if (pos < 0)
/*  499 */       return this.defRetValue; 
/*  500 */     Character newValue = remappingFunction.apply(Character.valueOf(k), Character.valueOf(this.value[pos]));
/*  501 */     if (newValue == null) {
/*  502 */       if (k == '\000') {
/*  503 */         removeNullEntry();
/*      */       } else {
/*  505 */         removeEntry(pos);
/*  506 */       }  return this.defRetValue;
/*      */     } 
/*  508 */     this.value[pos] = newValue.charValue(); return newValue.charValue();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public char compute(char k, BiFunction<? super Character, ? super Character, ? extends Character> remappingFunction) {
/*  514 */     Objects.requireNonNull(remappingFunction);
/*  515 */     int pos = find(k);
/*  516 */     Character newValue = remappingFunction.apply(Character.valueOf(k), 
/*  517 */         (pos >= 0) ? Character.valueOf(this.value[pos]) : null);
/*  518 */     if (newValue == null) {
/*  519 */       if (pos >= 0)
/*  520 */         if (k == '\000') {
/*  521 */           removeNullEntry();
/*      */         } else {
/*  523 */           removeEntry(pos);
/*      */         }  
/*  525 */       return this.defRetValue;
/*      */     } 
/*  527 */     char newVal = newValue.charValue();
/*  528 */     if (pos < 0) {
/*  529 */       insert(-pos - 1, k, newVal);
/*  530 */       return newVal;
/*      */     } 
/*  532 */     this.value[pos] = newVal; return newVal;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public char merge(char k, char v, BiFunction<? super Character, ? super Character, ? extends Character> remappingFunction) {
/*  538 */     Objects.requireNonNull(remappingFunction);
/*  539 */     int pos = find(k);
/*  540 */     if (pos < 0) {
/*  541 */       insert(-pos - 1, k, v);
/*  542 */       return v;
/*      */     } 
/*  544 */     Character newValue = remappingFunction.apply(Character.valueOf(this.value[pos]), Character.valueOf(v));
/*  545 */     if (newValue == null) {
/*  546 */       if (k == '\000') {
/*  547 */         removeNullEntry();
/*      */       } else {
/*  549 */         removeEntry(pos);
/*  550 */       }  return this.defRetValue;
/*      */     } 
/*  552 */     this.value[pos] = newValue.charValue(); return newValue.charValue();
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
/*  563 */     if (this.size == 0)
/*      */       return; 
/*  565 */     this.size = 0;
/*  566 */     this.containsNullKey = false;
/*  567 */     Arrays.fill(this.key, false);
/*      */   }
/*      */   
/*      */   public int size() {
/*  571 */     return this.size;
/*      */   }
/*      */   
/*      */   public boolean isEmpty() {
/*  575 */     return (this.size == 0);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   final class MapEntry
/*      */     implements Char2CharMap.Entry, Map.Entry<Character, Character>
/*      */   {
/*      */     int index;
/*      */ 
/*      */     
/*      */     MapEntry(int index) {
/*  587 */       this.index = index;
/*      */     }
/*      */     
/*      */     MapEntry() {}
/*      */     
/*      */     public char getCharKey() {
/*  593 */       return Char2CharOpenHashMap.this.key[this.index];
/*      */     }
/*      */     
/*      */     public char getCharValue() {
/*  597 */       return Char2CharOpenHashMap.this.value[this.index];
/*      */     }
/*      */     
/*      */     public char setValue(char v) {
/*  601 */       char oldValue = Char2CharOpenHashMap.this.value[this.index];
/*  602 */       Char2CharOpenHashMap.this.value[this.index] = v;
/*  603 */       return oldValue;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Character getKey() {
/*  613 */       return Character.valueOf(Char2CharOpenHashMap.this.key[this.index]);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Character getValue() {
/*  623 */       return Character.valueOf(Char2CharOpenHashMap.this.value[this.index]);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public Character setValue(Character v) {
/*  633 */       return Character.valueOf(setValue(v.charValue()));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object o) {
/*  638 */       if (!(o instanceof Map.Entry))
/*  639 */         return false; 
/*  640 */       Map.Entry<Character, Character> e = (Map.Entry<Character, Character>)o;
/*  641 */       return (Char2CharOpenHashMap.this.key[this.index] == ((Character)e.getKey()).charValue() && Char2CharOpenHashMap.this.value[this.index] == ((Character)e.getValue()).charValue());
/*      */     }
/*      */     
/*      */     public int hashCode() {
/*  645 */       return Char2CharOpenHashMap.this.key[this.index] ^ Char2CharOpenHashMap.this.value[this.index];
/*      */     }
/*      */     
/*      */     public String toString() {
/*  649 */       return Char2CharOpenHashMap.this.key[this.index] + "=>" + Char2CharOpenHashMap.this.value[this.index];
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class MapIterator
/*      */   {
/*  659 */     int pos = Char2CharOpenHashMap.this.n;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  666 */     int last = -1;
/*      */     
/*  668 */     int c = Char2CharOpenHashMap.this.size;
/*      */ 
/*      */ 
/*      */     
/*  672 */     boolean mustReturnNullKey = Char2CharOpenHashMap.this.containsNullKey;
/*      */ 
/*      */     
/*      */     CharArrayList wrapped;
/*      */ 
/*      */     
/*      */     public boolean hasNext() {
/*  679 */       return (this.c != 0);
/*      */     }
/*      */     public int nextEntry() {
/*  682 */       if (!hasNext())
/*  683 */         throw new NoSuchElementException(); 
/*  684 */       this.c--;
/*  685 */       if (this.mustReturnNullKey) {
/*  686 */         this.mustReturnNullKey = false;
/*  687 */         return this.last = Char2CharOpenHashMap.this.n;
/*      */       } 
/*  689 */       char[] key = Char2CharOpenHashMap.this.key;
/*      */       while (true) {
/*  691 */         if (--this.pos < 0) {
/*      */           
/*  693 */           this.last = Integer.MIN_VALUE;
/*  694 */           char k = this.wrapped.getChar(-this.pos - 1);
/*  695 */           int p = HashCommon.mix(k) & Char2CharOpenHashMap.this.mask;
/*  696 */           while (k != key[p])
/*  697 */             p = p + 1 & Char2CharOpenHashMap.this.mask; 
/*  698 */           return p;
/*      */         } 
/*  700 */         if (key[this.pos] != '\000') {
/*  701 */           return this.last = this.pos;
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
/*  715 */       char[] key = Char2CharOpenHashMap.this.key; while (true) {
/*      */         char curr; int last;
/*  717 */         pos = (last = pos) + 1 & Char2CharOpenHashMap.this.mask;
/*      */         while (true) {
/*  719 */           if ((curr = key[pos]) == '\000') {
/*  720 */             key[last] = Character.MIN_VALUE;
/*      */             return;
/*      */           } 
/*  723 */           int slot = HashCommon.mix(curr) & Char2CharOpenHashMap.this.mask;
/*  724 */           if ((last <= pos) ? (last >= slot || slot > pos) : (last >= slot && slot > pos))
/*      */             break; 
/*  726 */           pos = pos + 1 & Char2CharOpenHashMap.this.mask;
/*      */         } 
/*  728 */         if (pos < last) {
/*  729 */           if (this.wrapped == null)
/*  730 */             this.wrapped = new CharArrayList(2); 
/*  731 */           this.wrapped.add(key[pos]);
/*      */         } 
/*  733 */         key[last] = curr;
/*  734 */         Char2CharOpenHashMap.this.value[last] = Char2CharOpenHashMap.this.value[pos];
/*      */       } 
/*      */     }
/*      */     public void remove() {
/*  738 */       if (this.last == -1)
/*  739 */         throw new IllegalStateException(); 
/*  740 */       if (this.last == Char2CharOpenHashMap.this.n) {
/*  741 */         Char2CharOpenHashMap.this.containsNullKey = false;
/*  742 */       } else if (this.pos >= 0) {
/*  743 */         shiftKeys(this.last);
/*      */       } else {
/*      */         
/*  746 */         Char2CharOpenHashMap.this.remove(this.wrapped.getChar(-this.pos - 1));
/*  747 */         this.last = -1;
/*      */         return;
/*      */       } 
/*  750 */       Char2CharOpenHashMap.this.size--;
/*  751 */       this.last = -1;
/*      */     }
/*      */ 
/*      */     
/*      */     public int skip(int n) {
/*  756 */       int i = n;
/*  757 */       while (i-- != 0 && hasNext())
/*  758 */         nextEntry(); 
/*  759 */       return n - i - 1;
/*      */     }
/*      */     private MapIterator() {} }
/*      */   
/*      */   private class EntryIterator extends MapIterator implements ObjectIterator<Char2CharMap.Entry> { private Char2CharOpenHashMap.MapEntry entry;
/*      */     
/*      */     public Char2CharOpenHashMap.MapEntry next() {
/*  766 */       return this.entry = new Char2CharOpenHashMap.MapEntry(nextEntry());
/*      */     }
/*      */     private EntryIterator() {}
/*      */     public void remove() {
/*  770 */       super.remove();
/*  771 */       this.entry.index = -1;
/*      */     } }
/*      */   
/*      */   private class FastEntryIterator extends MapIterator implements ObjectIterator<Char2CharMap.Entry> { private FastEntryIterator() {
/*  775 */       this.entry = new Char2CharOpenHashMap.MapEntry();
/*      */     } private final Char2CharOpenHashMap.MapEntry entry;
/*      */     public Char2CharOpenHashMap.MapEntry next() {
/*  778 */       this.entry.index = nextEntry();
/*  779 */       return this.entry;
/*      */     } }
/*      */   
/*      */   private final class MapEntrySet extends AbstractObjectSet<Char2CharMap.Entry> implements Char2CharMap.FastEntrySet { private MapEntrySet() {}
/*      */     
/*      */     public ObjectIterator<Char2CharMap.Entry> iterator() {
/*  785 */       return new Char2CharOpenHashMap.EntryIterator();
/*      */     }
/*      */     
/*      */     public ObjectIterator<Char2CharMap.Entry> fastIterator() {
/*  789 */       return new Char2CharOpenHashMap.FastEntryIterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object o) {
/*  794 */       if (!(o instanceof Map.Entry))
/*  795 */         return false; 
/*  796 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/*  797 */       if (e.getKey() == null || !(e.getKey() instanceof Character))
/*  798 */         return false; 
/*  799 */       if (e.getValue() == null || !(e.getValue() instanceof Character))
/*  800 */         return false; 
/*  801 */       char k = ((Character)e.getKey()).charValue();
/*  802 */       char v = ((Character)e.getValue()).charValue();
/*  803 */       if (k == '\000') {
/*  804 */         return (Char2CharOpenHashMap.this.containsNullKey && Char2CharOpenHashMap.this.value[Char2CharOpenHashMap.this.n] == v);
/*      */       }
/*  806 */       char[] key = Char2CharOpenHashMap.this.key;
/*      */       char curr;
/*      */       int pos;
/*  809 */       if ((curr = key[pos = HashCommon.mix(k) & Char2CharOpenHashMap.this.mask]) == '\000')
/*  810 */         return false; 
/*  811 */       if (k == curr) {
/*  812 */         return (Char2CharOpenHashMap.this.value[pos] == v);
/*      */       }
/*      */       while (true) {
/*  815 */         if ((curr = key[pos = pos + 1 & Char2CharOpenHashMap.this.mask]) == '\000')
/*  816 */           return false; 
/*  817 */         if (k == curr) {
/*  818 */           return (Char2CharOpenHashMap.this.value[pos] == v);
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/*      */     public boolean remove(Object o) {
/*  824 */       if (!(o instanceof Map.Entry))
/*  825 */         return false; 
/*  826 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/*  827 */       if (e.getKey() == null || !(e.getKey() instanceof Character))
/*  828 */         return false; 
/*  829 */       if (e.getValue() == null || !(e.getValue() instanceof Character))
/*  830 */         return false; 
/*  831 */       char k = ((Character)e.getKey()).charValue();
/*  832 */       char v = ((Character)e.getValue()).charValue();
/*  833 */       if (k == '\000') {
/*  834 */         if (Char2CharOpenHashMap.this.containsNullKey && Char2CharOpenHashMap.this.value[Char2CharOpenHashMap.this.n] == v) {
/*  835 */           Char2CharOpenHashMap.this.removeNullEntry();
/*  836 */           return true;
/*      */         } 
/*  838 */         return false;
/*      */       } 
/*      */       
/*  841 */       char[] key = Char2CharOpenHashMap.this.key;
/*      */       char curr;
/*      */       int pos;
/*  844 */       if ((curr = key[pos = HashCommon.mix(k) & Char2CharOpenHashMap.this.mask]) == '\000')
/*  845 */         return false; 
/*  846 */       if (curr == k) {
/*  847 */         if (Char2CharOpenHashMap.this.value[pos] == v) {
/*  848 */           Char2CharOpenHashMap.this.removeEntry(pos);
/*  849 */           return true;
/*      */         } 
/*  851 */         return false;
/*      */       } 
/*      */       while (true) {
/*  854 */         if ((curr = key[pos = pos + 1 & Char2CharOpenHashMap.this.mask]) == '\000')
/*  855 */           return false; 
/*  856 */         if (curr == k && 
/*  857 */           Char2CharOpenHashMap.this.value[pos] == v) {
/*  858 */           Char2CharOpenHashMap.this.removeEntry(pos);
/*  859 */           return true;
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/*  866 */       return Char2CharOpenHashMap.this.size;
/*      */     }
/*      */     
/*      */     public void clear() {
/*  870 */       Char2CharOpenHashMap.this.clear();
/*      */     }
/*      */ 
/*      */     
/*      */     public void forEach(Consumer<? super Char2CharMap.Entry> consumer) {
/*  875 */       if (Char2CharOpenHashMap.this.containsNullKey)
/*  876 */         consumer.accept(new AbstractChar2CharMap.BasicEntry(Char2CharOpenHashMap.this.key[Char2CharOpenHashMap.this.n], Char2CharOpenHashMap.this.value[Char2CharOpenHashMap.this.n])); 
/*  877 */       for (int pos = Char2CharOpenHashMap.this.n; pos-- != 0;) {
/*  878 */         if (Char2CharOpenHashMap.this.key[pos] != '\000')
/*  879 */           consumer.accept(new AbstractChar2CharMap.BasicEntry(Char2CharOpenHashMap.this.key[pos], Char2CharOpenHashMap.this.value[pos])); 
/*      */       } 
/*      */     }
/*      */     
/*      */     public void fastForEach(Consumer<? super Char2CharMap.Entry> consumer) {
/*  884 */       AbstractChar2CharMap.BasicEntry entry = new AbstractChar2CharMap.BasicEntry();
/*  885 */       if (Char2CharOpenHashMap.this.containsNullKey) {
/*  886 */         entry.key = Char2CharOpenHashMap.this.key[Char2CharOpenHashMap.this.n];
/*  887 */         entry.value = Char2CharOpenHashMap.this.value[Char2CharOpenHashMap.this.n];
/*  888 */         consumer.accept(entry);
/*      */       } 
/*  890 */       for (int pos = Char2CharOpenHashMap.this.n; pos-- != 0;) {
/*  891 */         if (Char2CharOpenHashMap.this.key[pos] != '\000') {
/*  892 */           entry.key = Char2CharOpenHashMap.this.key[pos];
/*  893 */           entry.value = Char2CharOpenHashMap.this.value[pos];
/*  894 */           consumer.accept(entry);
/*      */         } 
/*      */       } 
/*      */     } }
/*      */   
/*      */   public Char2CharMap.FastEntrySet char2CharEntrySet() {
/*  900 */     if (this.entries == null)
/*  901 */       this.entries = new MapEntrySet(); 
/*  902 */     return this.entries;
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
/*      */     implements CharIterator
/*      */   {
/*      */     public char nextChar() {
/*  919 */       return Char2CharOpenHashMap.this.key[nextEntry()];
/*      */     } }
/*      */   
/*      */   private final class KeySet extends AbstractCharSet { private KeySet() {}
/*      */     
/*      */     public CharIterator iterator() {
/*  925 */       return new Char2CharOpenHashMap.KeyIterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public void forEach(IntConsumer consumer) {
/*  930 */       if (Char2CharOpenHashMap.this.containsNullKey)
/*  931 */         consumer.accept(Char2CharOpenHashMap.this.key[Char2CharOpenHashMap.this.n]); 
/*  932 */       for (int pos = Char2CharOpenHashMap.this.n; pos-- != 0; ) {
/*  933 */         char k = Char2CharOpenHashMap.this.key[pos];
/*  934 */         if (k != '\000')
/*  935 */           consumer.accept(k); 
/*      */       } 
/*      */     }
/*      */     
/*      */     public int size() {
/*  940 */       return Char2CharOpenHashMap.this.size;
/*      */     }
/*      */     
/*      */     public boolean contains(char k) {
/*  944 */       return Char2CharOpenHashMap.this.containsKey(k);
/*      */     }
/*      */     
/*      */     public boolean remove(char k) {
/*  948 */       int oldSize = Char2CharOpenHashMap.this.size;
/*  949 */       Char2CharOpenHashMap.this.remove(k);
/*  950 */       return (Char2CharOpenHashMap.this.size != oldSize);
/*      */     }
/*      */     
/*      */     public void clear() {
/*  954 */       Char2CharOpenHashMap.this.clear();
/*      */     } }
/*      */ 
/*      */   
/*      */   public CharSet keySet() {
/*  959 */     if (this.keys == null)
/*  960 */       this.keys = new KeySet(); 
/*  961 */     return this.keys;
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
/*      */     implements CharIterator
/*      */   {
/*      */     public char nextChar() {
/*  978 */       return Char2CharOpenHashMap.this.value[nextEntry()];
/*      */     }
/*      */   }
/*      */   
/*      */   public CharCollection values() {
/*  983 */     if (this.values == null)
/*  984 */       this.values = new AbstractCharCollection()
/*      */         {
/*      */           public CharIterator iterator() {
/*  987 */             return new Char2CharOpenHashMap.ValueIterator();
/*      */           }
/*      */           
/*      */           public int size() {
/*  991 */             return Char2CharOpenHashMap.this.size;
/*      */           }
/*      */           
/*      */           public boolean contains(char v) {
/*  995 */             return Char2CharOpenHashMap.this.containsValue(v);
/*      */           }
/*      */           
/*      */           public void clear() {
/*  999 */             Char2CharOpenHashMap.this.clear();
/*      */           }
/*      */           
/*      */           public void forEach(IntConsumer consumer)
/*      */           {
/* 1004 */             if (Char2CharOpenHashMap.this.containsNullKey)
/* 1005 */               consumer.accept(Char2CharOpenHashMap.this.value[Char2CharOpenHashMap.this.n]); 
/* 1006 */             for (int pos = Char2CharOpenHashMap.this.n; pos-- != 0;) {
/* 1007 */               if (Char2CharOpenHashMap.this.key[pos] != '\000')
/* 1008 */                 consumer.accept(Char2CharOpenHashMap.this.value[pos]); 
/*      */             }  }
/*      */         }; 
/* 1011 */     return this.values;
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
/* 1028 */     int l = HashCommon.arraySize(this.size, this.f);
/* 1029 */     if (l >= this.n || this.size > HashCommon.maxFill(l, this.f))
/* 1030 */       return true; 
/*      */     try {
/* 1032 */       rehash(l);
/* 1033 */     } catch (OutOfMemoryError cantDoIt) {
/* 1034 */       return false;
/*      */     } 
/* 1036 */     return true;
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
/* 1060 */     int l = HashCommon.nextPowerOfTwo((int)Math.ceil((n / this.f)));
/* 1061 */     if (l >= n || this.size > HashCommon.maxFill(l, this.f))
/* 1062 */       return true; 
/*      */     try {
/* 1064 */       rehash(l);
/* 1065 */     } catch (OutOfMemoryError cantDoIt) {
/* 1066 */       return false;
/*      */     } 
/* 1068 */     return true;
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
/* 1084 */     char[] key = this.key;
/* 1085 */     char[] value = this.value;
/* 1086 */     int mask = newN - 1;
/* 1087 */     char[] newKey = new char[newN + 1];
/* 1088 */     char[] newValue = new char[newN + 1];
/* 1089 */     int i = this.n;
/* 1090 */     for (int j = realSize(); j-- != 0; ) {
/* 1091 */       while (key[--i] == '\000'); int pos;
/* 1092 */       if (newKey[pos = HashCommon.mix(key[i]) & mask] != '\000')
/* 1093 */         while (newKey[pos = pos + 1 & mask] != '\000'); 
/* 1094 */       newKey[pos] = key[i];
/* 1095 */       newValue[pos] = value[i];
/*      */     } 
/* 1097 */     newValue[newN] = value[this.n];
/* 1098 */     this.n = newN;
/* 1099 */     this.mask = mask;
/* 1100 */     this.maxFill = HashCommon.maxFill(this.n, this.f);
/* 1101 */     this.key = newKey;
/* 1102 */     this.value = newValue;
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
/*      */   public Char2CharOpenHashMap clone() {
/*      */     Char2CharOpenHashMap c;
/*      */     try {
/* 1119 */       c = (Char2CharOpenHashMap)super.clone();
/* 1120 */     } catch (CloneNotSupportedException cantHappen) {
/* 1121 */       throw new InternalError();
/*      */     } 
/* 1123 */     c.keys = null;
/* 1124 */     c.values = null;
/* 1125 */     c.entries = null;
/* 1126 */     c.containsNullKey = this.containsNullKey;
/* 1127 */     c.key = (char[])this.key.clone();
/* 1128 */     c.value = (char[])this.value.clone();
/* 1129 */     return c;
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
/* 1142 */     int h = 0;
/* 1143 */     for (int j = realSize(), i = 0, t = 0; j-- != 0; ) {
/* 1144 */       while (this.key[i] == '\000')
/* 1145 */         i++; 
/* 1146 */       t = this.key[i];
/* 1147 */       t ^= this.value[i];
/* 1148 */       h += t;
/* 1149 */       i++;
/*      */     } 
/*      */     
/* 1152 */     if (this.containsNullKey)
/* 1153 */       h += this.value[this.n]; 
/* 1154 */     return h;
/*      */   }
/*      */   private void writeObject(ObjectOutputStream s) throws IOException {
/* 1157 */     char[] key = this.key;
/* 1158 */     char[] value = this.value;
/* 1159 */     MapIterator i = new MapIterator();
/* 1160 */     s.defaultWriteObject();
/* 1161 */     for (int j = this.size; j-- != 0; ) {
/* 1162 */       int e = i.nextEntry();
/* 1163 */       s.writeChar(key[e]);
/* 1164 */       s.writeChar(value[e]);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
/* 1169 */     s.defaultReadObject();
/* 1170 */     this.n = HashCommon.arraySize(this.size, this.f);
/* 1171 */     this.maxFill = HashCommon.maxFill(this.n, this.f);
/* 1172 */     this.mask = this.n - 1;
/* 1173 */     char[] key = this.key = new char[this.n + 1];
/* 1174 */     char[] value = this.value = new char[this.n + 1];
/*      */ 
/*      */     
/* 1177 */     for (int i = this.size; i-- != 0; ) {
/* 1178 */       int pos; char k = s.readChar();
/* 1179 */       char v = s.readChar();
/* 1180 */       if (k == '\000') {
/* 1181 */         pos = this.n;
/* 1182 */         this.containsNullKey = true;
/*      */       } else {
/* 1184 */         pos = HashCommon.mix(k) & this.mask;
/* 1185 */         while (key[pos] != '\000')
/* 1186 */           pos = pos + 1 & this.mask; 
/*      */       } 
/* 1188 */       key[pos] = k;
/* 1189 */       value[pos] = v;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void checkTable() {}
/*      */ }


/* Location:              F:\dw\server.jar!\i\\unimi\dsi\fastutil\chars\Char2CharOpenHashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */