/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.google.common.base.Function;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public final class NamespacedStringType extends Const.ConstType<String> {
/*    */   public static Function<String, String> ENSURE_NAMESPACE;
/*    */   
/*    */   static {
/* 13 */     ENSURE_NAMESPACE = (s -> s);
/*    */   }
/*    */   
/*    */   public <T> Pair<T, Optional<String>> read(DynamicOps<T> ops, T input) {
/* 17 */     return ops
/* 18 */       .getStringValue(input)
/* 19 */       .map(v -> Pair.of(ops.empty(), Optional.of(ENSURE_NAMESPACE.apply(v))))
/* 20 */       .orElseGet(() -> Pair.of(input, Optional.empty()));
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, String value) {
/* 25 */     return (T)ops.createString(value);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return "NamespacedString";
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\constant\NamespacedStringType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */