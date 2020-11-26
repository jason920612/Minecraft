/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class IntType
/*    */   extends Const.ConstType<Integer>
/*    */ {
/*    */   public <T> Pair<T, Optional<Integer>> read(DynamicOps<T> ops, T input) {
/* 14 */     return ops
/* 15 */       .getNumberValue(input)
/* 16 */       .map(v -> Pair.of(ops.empty(), Optional.of(Integer.valueOf(v.intValue()))))
/* 17 */       .orElseGet(() -> Pair.of(input, Optional.empty()));
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, Integer value) {
/* 22 */     return (T)ops.createInt(value.intValue());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 27 */     return "Int";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\constant\IntType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */