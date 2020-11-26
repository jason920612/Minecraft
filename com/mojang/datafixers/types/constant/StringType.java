/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class StringType
/*    */   extends Const.ConstType<String>
/*    */ {
/*    */   public <T> Pair<T, Optional<String>> read(DynamicOps<T> ops, T input) {
/* 14 */     return ops
/* 15 */       .getStringValue(input)
/* 16 */       .map(v -> Pair.of(ops.empty(), Optional.of(v)))
/* 17 */       .orElseGet(() -> Pair.of(input, Optional.empty()));
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, String value) {
/* 22 */     return (T)ops.createString(value);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 27 */     return "String";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\constant\StringType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */