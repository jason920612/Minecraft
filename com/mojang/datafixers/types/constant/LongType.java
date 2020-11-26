/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class LongType
/*    */   extends Const.ConstType<Long>
/*    */ {
/*    */   public <T> Pair<T, Optional<Long>> read(DynamicOps<T> ops, T input) {
/* 14 */     return ops
/* 15 */       .getNumberValue(input)
/* 16 */       .map(v -> Pair.of(ops.empty(), Optional.of(Long.valueOf(v.longValue()))))
/* 17 */       .orElseGet(() -> Pair.of(input, Optional.empty()));
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, Long value) {
/* 22 */     return (T)ops.createLong(value.longValue());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 27 */     return "Long";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\constant\LongType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */