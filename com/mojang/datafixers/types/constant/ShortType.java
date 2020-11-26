/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ShortType
/*    */   extends Const.ConstType<Short>
/*    */ {
/*    */   public <T> Pair<T, Optional<Short>> read(DynamicOps<T> ops, T input) {
/* 14 */     return ops
/* 15 */       .getNumberValue(input)
/* 16 */       .map(v -> Pair.of(ops.empty(), Optional.of(Short.valueOf(v.shortValue()))))
/* 17 */       .orElseGet(() -> Pair.of(input, Optional.empty()));
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, Short value) {
/* 22 */     return (T)ops.createShort(value.shortValue());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 27 */     return "Short";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\constant\ShortType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */