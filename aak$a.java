/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
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
/*     */ public final class a
/*     */   extends aak.b
/*     */ {
/*     */   @Nullable
/*     */   private IntSet f;
/*     */   @Nullable
/*     */   private IntSet g;
/*     */   @Nullable
/*     */   private Int2IntMap h;
/*     */   
/*     */   public a(Typed<?> ☃, Schema schema) {
/* 265 */     super(☃, schema);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a() {
/* 270 */     this.f = (IntSet)new IntOpenHashSet();
/* 271 */     this.g = (IntSet)new IntOpenHashSet();
/* 272 */     this.h = (Int2IntMap)new Int2IntOpenHashMap();
/*     */     
/* 274 */     for (int ☃ = 0; ☃ < this.c.size(); ☃++) {
/* 275 */       Dynamic<?> dynamic = this.c.get(☃);
/* 276 */       String str = dynamic.getString("Name");
/* 277 */       if (aak.a().containsKey(str)) {
/* 278 */         boolean bool = Objects.equals(dynamic.get("Properties").flatMap(☃ -> ☃.get("decayable")).flatMap(Dynamic::getStringValue).orElse(""), "false");
/* 279 */         this.f.add(☃);
/* 280 */         this.h.put(a(str, bool, 7), ☃);
/* 281 */         this.c.set(☃, a(dynamic, str, bool, 7));
/*     */       } 
/* 283 */       if (aak.b().contains(str)) {
/* 284 */         this.g.add(☃);
/*     */       }
/*     */     } 
/*     */     
/* 288 */     return (this.f.isEmpty() && this.g.isEmpty());
/*     */   }
/*     */   
/*     */   private Dynamic<?> a(Dynamic<?> ☃, String str, boolean bool, int i) {
/* 292 */     Dynamic<?> dynamic1 = ☃.emptyMap();
/* 293 */     dynamic1 = dynamic1.set("persistent", dynamic1.createString(bool ? "true" : "false"));
/* 294 */     dynamic1 = dynamic1.set("distance", dynamic1.createString(Integer.toString(i)));
/*     */     
/* 296 */     Dynamic<?> dynamic2 = ☃.emptyMap();
/* 297 */     dynamic2 = dynamic2.set("Properties", dynamic1);
/* 298 */     dynamic2 = dynamic2.set("Name", dynamic2.createString(str));
/* 299 */     return dynamic2;
/*     */   }
/*     */   
/*     */   public boolean a(int ☃) {
/* 303 */     return this.g.contains(☃);
/*     */   }
/*     */   
/*     */   public boolean b(int ☃) {
/* 307 */     return this.f.contains(☃);
/*     */   }
/*     */   
/*     */   private int d(int ☃) {
/* 311 */     if (a(☃)) {
/* 312 */       return 0;
/*     */     }
/* 314 */     return Integer.parseInt(((Dynamic)this.c.get(☃)).get("Properties").flatMap(☃ -> ☃.get("distance")).flatMap(Dynamic::getStringValue).orElse(""));
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j) {
/* 318 */     Dynamic<?> dynamic = this.c.get(i);
/* 319 */     String str = dynamic.getString("Name");
/* 320 */     boolean bool = Objects.equals(dynamic.get("Properties").flatMap(☃ -> ☃.get("persistent")).flatMap(Dynamic::getStringValue).orElse(""), "true");
/* 321 */     int k = a(str, bool, j);
/*     */     
/* 323 */     if (!this.h.containsKey(k)) {
/* 324 */       int n = this.c.size();
/* 325 */       this.f.add(n);
/* 326 */       this.h.put(k, n);
/* 327 */       this.c.add(a(dynamic, str, bool, j));
/*     */     } 
/*     */     
/* 330 */     int m = this.h.get(k);
/* 331 */     if (1 << this.e.c() <= m) {
/* 332 */       xd xd = new xd(this.e.c() + 1, 4096);
/* 333 */       for (int n = 0; n < 4096; n++) {
/* 334 */         xd.a(n, this.e.a(n));
/*     */       }
/* 336 */       this.e = xd;
/*     */     } 
/* 338 */     this.e.a(☃, m);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aak$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */