/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.LongStream;
/*     */ import javax.annotation.Nullable;
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
/*     */ public abstract class b
/*     */ {
/* 193 */   final Type<Pair<String, Dynamic<?>>> a = DSL.named(aax.l.typeName(), DSL.remainderType());
/* 194 */   protected final OpticFinder<List<Pair<String, Dynamic<?>>>> b = DSL.fieldFinder("Palette", (Type)DSL.list(this.a));
/*     */   
/*     */   protected final List<Dynamic<?>> c;
/*     */   protected final int d;
/*     */   @Nullable
/*     */   protected xd e;
/*     */   
/*     */   public b(Typed<?> ☃, Schema schema) {
/* 202 */     if (!Objects.equals(schema.getType(aax.l), this.a)) {
/* 203 */       throw new IllegalStateException("Block state type is not what was expected.");
/*     */     }
/*     */     
/* 206 */     Optional<List<Pair<String, Dynamic<?>>>> optional = ☃.getOptional(this.b);
/*     */     
/* 208 */     this.c = (List<Dynamic<?>>)optional.map(☃ -> (List)☃.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse(ImmutableList.of());
/*     */     
/* 210 */     Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/* 211 */     this.d = dynamic.getInt("Y");
/*     */     
/* 213 */     a(dynamic);
/*     */   }
/*     */   
/*     */   protected void a(Dynamic<?> ☃) {
/* 217 */     if (a()) {
/* 218 */       this.e = null;
/*     */     } else {
/* 220 */       long[] arrayOfLong = ((LongStream)☃.get("BlockStates").flatMap(Dynamic::getLongStream).get()).toArray();
/* 221 */       int i = Math.max(4, DataFixUtils.ceillog2(this.c.size()));
/* 222 */       this.e = new xd(i, 4096, arrayOfLong);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Typed<?> a(Typed<?> ☃) {
/* 227 */     if (b()) {
/* 228 */       return ☃;
/*     */     }
/* 230 */     return ☃
/* 231 */       .update(DSL.remainderFinder(), ☃ -> ☃.set("BlockStates", ☃.createLongList(Arrays.stream(this.e.a()))))
/* 232 */       .set(this.b, this.c.stream().map(☃ -> Pair.of(aax.l.typeName(), ☃)).collect(Collectors.toList()));
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 236 */     return (this.e == null);
/*     */   }
/*     */   
/*     */   public int c(int ☃) {
/* 240 */     return this.e.a(☃);
/*     */   }
/*     */   
/*     */   protected int a(String ☃, boolean bool, int i) {
/* 244 */     return aak.a().get(☃).intValue() << 5 | (bool ? 16 : 0) | i;
/*     */   }
/*     */   
/*     */   int c() {
/* 248 */     return this.d;
/*     */   }
/*     */   
/*     */   protected abstract boolean a();
/*     */ }


/* Location:              F:\dw\server.jar!\aak$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */