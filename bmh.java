/*    */ import com.google.common.base.Predicates;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bmh<T extends Enum<T> & xv>
/*    */   extends blx<T>
/*    */ {
/*    */   private final ImmutableSet<T> a;
/* 18 */   private final Map<String, T> b = Maps.newHashMap();
/*    */   
/*    */   protected bmh(String ☃, Class<T> clazz, Collection<T> collection) {
/* 21 */     super(☃, clazz);
/* 22 */     this.a = ImmutableSet.copyOf(collection);
/*    */     
/* 24 */     for (Enum enum_ : collection) {
/* 25 */       String str = ((xv)enum_).m();
/* 26 */       if (this.b.containsKey(str)) {
/* 27 */         throw new IllegalArgumentException("Multiple values have the same name '" + str + "'");
/*    */       }
/* 29 */       this.b.put(str, (T)enum_);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<T> d() {
/* 35 */     return (Collection<T>)this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<T> b(String ☃) {
/* 40 */     return Optional.ofNullable(this.b.get(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(T ☃) {
/* 45 */     return ((xv)☃).m();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 50 */     if (this == ☃) {
/* 51 */       return true;
/*    */     }
/*    */     
/* 54 */     if (☃ instanceof bmh && super.equals(☃)) {
/* 55 */       bmh<?> bmh1 = (bmh)☃;
/* 56 */       return (this.a.equals(bmh1.a) && this.b.equals(bmh1.b));
/*    */     } 
/*    */     
/* 59 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 64 */     int ☃ = super.c();
/* 65 */     ☃ = 31 * ☃ + this.a.hashCode();
/* 66 */     ☃ = 31 * ☃ + this.b.hashCode();
/* 67 */     return ☃;
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & xv> bmh<T> a(String ☃, Class<T> clazz) {
/* 71 */     return a(☃, clazz, (Predicate<T>)Predicates.alwaysTrue());
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & xv> bmh<T> a(String ☃, Class<T> clazz, Predicate<T> predicate) {
/* 75 */     return a(☃, clazz, (Collection<T>)Arrays.<T>stream(clazz.getEnumConstants()).filter(predicate).collect(Collectors.toList()));
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & xv> bmh<T> a(String ☃, Class<T> clazz, T... arrayOfT) {
/* 79 */     return a(☃, clazz, Lists.newArrayList((Object[])arrayOfT));
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & xv> bmh<T> a(String ☃, Class<T> clazz, Collection<T> collection) {
/* 83 */     return new bmh<>(☃, clazz, collection);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bmh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */