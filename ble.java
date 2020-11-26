/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.ImmutableSortedMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Pattern;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ble<O, S extends blf<S>>
/*     */ {
/*  22 */   private static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
/*     */   
/*     */   private final O b;
/*     */   
/*     */   private final ImmutableSortedMap<String, bmm<?>> c;
/*     */   private final ImmutableList<S> d;
/*     */   
/*     */   protected <A extends bla<O, S>> ble(O ☃, b<O, S, A> b1, Map<String, bmm<?>> map) {
/*  30 */     this.b = ☃;
/*  31 */     this.c = ImmutableSortedMap.copyOf(map);
/*     */ 
/*     */     
/*  34 */     Map<Map<bmm<?>, Comparable<?>>, A> map1 = Maps.newLinkedHashMap();
/*  35 */     List<A> list = Lists.newArrayList();
/*     */     
/*  37 */     Stream<List<Comparable<?>>> stream = Stream.of(Collections.emptyList());
/*  38 */     for (UnmodifiableIterator<bmm> unmodifiableIterator = this.c.values().iterator(); unmodifiableIterator.hasNext(); ) { bmm<?> bmm = unmodifiableIterator.next();
/*  39 */       stream = stream.flatMap(list -> ☃.d().stream().map(())); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  46 */     stream.forEach(list1 -> {
/*     */           Map<bmm<?>, Comparable<?>> map1 = ex.b((Iterable<bmm<?>>)this.c.values(), list1);
/*     */           
/*     */           A a = (A)☃.create(object, ImmutableMap.copyOf(map1));
/*     */           
/*     */           map.put(map1, a);
/*     */           list.add(a);
/*     */         });
/*  54 */     for (bla bla : list) {
/*  55 */       bla.a(map1);
/*     */     }
/*     */     
/*  58 */     this.d = ImmutableList.copyOf(list);
/*     */   }
/*     */   
/*     */   public ImmutableList<S> a() {
/*  62 */     return this.d;
/*     */   }
/*     */   
/*     */   public S b() {
/*  66 */     return (S)this.d.get(0);
/*     */   }
/*     */   
/*     */   public O c() {
/*  70 */     return this.b;
/*     */   }
/*     */   
/*     */   public Collection<bmm<?>> d() {
/*  74 */     return (Collection<bmm<?>>)this.c.values();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  79 */     return MoreObjects.toStringHelper(this)
/*  80 */       .add("block", this.b)
/*  81 */       .add("properties", this.c.values().stream().map(bmm::a).collect(Collectors.toList()))
/*  82 */       .toString();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bmm<?> a(String ☃) {
/*  87 */     return (bmm)this.c.get(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a<O, S extends blf<S>>
/*     */   {
/*     */     private final O a;
/*     */     
/*  96 */     private final Map<String, bmm<?>> b = Maps.newHashMap();
/*     */     
/*     */     public a(O ☃) {
/*  99 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public a<O, S> a(bmm<?>... ☃) {
/* 103 */       for (bmm<?> bmm1 : ☃) {
/* 104 */         a(bmm1);
/* 105 */         this.b.put(bmm1.a(), bmm1);
/*     */       } 
/* 107 */       return this;
/*     */     }
/*     */     
/*     */     private <T extends Comparable<T>> void a(bmm<T> ☃) {
/* 111 */       String str = ☃.a();
/* 112 */       if (!ble.e().matcher(str).matches()) {
/* 113 */         throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has invalidly named property: ").append(str).toString());
/*     */       }
/*     */       
/* 116 */       Collection<T> collection = ☃.d();
/* 117 */       if (collection.size() <= 1) {
/* 118 */         throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" attempted use property ").append(str).append(" with <= 1 possible values").toString());
/*     */       }
/*     */       
/* 121 */       for (Comparable comparable : collection) {
/* 122 */         String str1 = ☃.a((T)comparable);
/* 123 */         if (!ble.e().matcher(str1).matches()) {
/* 124 */           throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has property: ").append(str).append(" with invalidly named value: ").append(str1).toString());
/*     */         }
/*     */       } 
/*     */       
/* 128 */       if (this.b.containsKey(str)) {
/* 129 */         throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has duplicate property: ").append(str).toString());
/*     */       }
/*     */     }
/*     */     
/*     */     public <A extends bla<O, S>> ble<O, S> a(ble.b<O, S, A> ☃) {
/* 134 */       return new ble<>(this.a, ☃, this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface b<O, S extends blf<S>, A extends bla<O, S>> {
/*     */     A create(O param1O, ImmutableMap<bmm<?>, Comparable<?>> param1ImmutableMap);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ble.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */