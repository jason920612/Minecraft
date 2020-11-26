/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.datafixers.util.Unit;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NilDrop
/*    */   extends Const.ConstType<Unit>
/*    */ {
/*    */   public <T> Pair<T, Optional<Unit>> read(DynamicOps<T> ops, T input) {
/* 15 */     return Pair.of(input, point(ops));
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, Unit value) {
/* 20 */     return rest;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 25 */     return "NilDrop";
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<Unit> point(DynamicOps<?> ops) {
/* 30 */     return Optional.of(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\constant\NilDrop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */