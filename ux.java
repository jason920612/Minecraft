/*    */ import com.google.common.base.Functions;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.Set;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ public class ux<T extends va>
/*    */ {
/* 18 */   private final Set<uy> a = Sets.newHashSet();
/* 19 */   private final Map<String, T> b = Maps.newLinkedHashMap();
/* 20 */   private final List<T> c = Lists.newLinkedList();
/*    */   private final va.b<T> d;
/*    */   
/*    */   public ux(va.b<T> ☃) {
/* 24 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public void a() {
/* 28 */     Set<String> ☃ = (Set<String>)this.c.stream().map(va::e).collect(Collectors.toCollection(java.util.LinkedHashSet::new));
/* 29 */     this.b.clear();
/* 30 */     this.c.clear();
/* 31 */     for (uy uy : this.a) {
/* 32 */       uy.a(this.b, this.d);
/*    */     }
/* 34 */     e();
/* 35 */     this.c.addAll((Collection<? extends T>)☃.stream().map(this.b::get).filter(Objects::nonNull).collect(Collectors.toCollection(java.util.LinkedHashSet::new)));
/* 36 */     for (va va : this.b.values()) {
/* 37 */       if (va.f() && !this.c.contains(va)) {
/* 38 */         va.h().a(this.c, (T)va, (Function<T, va>)Functions.identity(), false);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   private void e() {
/* 44 */     List<Map.Entry<String, T>> ☃ = Lists.newArrayList(this.b.entrySet());
/* 45 */     this.b.clear();
/* 46 */     ☃.stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(☃ -> (va)this.b.put((String)☃.getKey(), (T)☃.getValue()));
/*    */   }
/*    */   
/*    */   public void a(Collection<T> ☃) {
/* 50 */     this.c.clear();
/* 51 */     this.c.addAll(☃);
/* 52 */     for (va va : this.b.values()) {
/* 53 */       if (va.f() && !this.c.contains(va)) {
/* 54 */         va.h().a(this.c, (T)va, (Function<T, va>)Functions.identity(), false);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public Collection<T> b() {
/* 60 */     return this.b.values();
/*    */   }
/*    */   
/*    */   public Collection<T> c() {
/* 64 */     Collection<T> ☃ = Lists.newArrayList(this.b.values());
/* 65 */     ☃.removeAll(this.c);
/* 66 */     return ☃;
/*    */   }
/*    */   
/*    */   public Collection<T> d() {
/* 70 */     return this.c;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public T a(String ☃) {
/* 75 */     return this.b.get(☃);
/*    */   }
/*    */   
/*    */   public void a(uy ☃) {
/* 79 */     this.a.add(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar\\ux.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */