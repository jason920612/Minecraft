/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DoubleType
/*    */   extends Const.ConstType<Double>
/*    */ {
/*    */   public <T> Pair<T, Optional<Double>> read(DynamicOps<T> ops, T input) {
/* 14 */     return ops
/* 15 */       .getNumberValue(input)
/* 16 */       .map(v -> Pair.of(ops.empty(), Optional.of(Double.valueOf(v.doubleValue()))))
/* 17 */       .orElseGet(() -> Pair.of(input, Optional.empty()));
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, Double value) {
/* 22 */     return (T)ops.createDouble(value.doubleValue());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 27 */     return "Double";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\constant\DoubleType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */