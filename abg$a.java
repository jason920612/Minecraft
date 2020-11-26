/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import java.util.Objects;
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
/*     */ public final class a
/*     */   extends aak.b
/*     */ {
/*     */   @Nullable
/*     */   private IntSet f;
/*     */   
/*     */   public a(Typed<?> ☃, Schema schema) {
/* 116 */     super(☃, schema);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a() {
/* 121 */     this.f = (IntSet)new IntOpenHashSet();
/*     */     
/* 123 */     for (int ☃ = 0; ☃ < this.c.size(); ☃++) {
/* 124 */       Dynamic<?> dynamic = this.c.get(☃);
/* 125 */       String str = dynamic.getString("Name");
/* 126 */       if (Objects.equals(str, "minecraft:trapped_chest")) {
/* 127 */         this.f.add(☃);
/*     */       }
/*     */     } 
/*     */     
/* 131 */     return this.f.isEmpty();
/*     */   }
/*     */   
/*     */   public boolean a(int ☃) {
/* 135 */     return this.f.contains(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\abg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */