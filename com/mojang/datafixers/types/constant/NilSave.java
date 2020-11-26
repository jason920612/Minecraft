/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.types.DynamicOps;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NilSave
/*    */   extends Const.ConstType<Dynamic<?>>
/*    */ {
/*    */   public <T> Pair<T, Optional<Dynamic<?>>> read(DynamicOps<T> ops, T input) {
/* 15 */     return Pair.of(ops.empty(), Optional.of(new Dynamic(ops, input)));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public <T> T write(DynamicOps<T> ops, T rest, Dynamic<?> value) {
/* 21 */     return (T)ops.mergeInto(ops.mergeInto(ops.emptyMap(), rest), value.cast(ops));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 26 */     return "NilSave";
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<Dynamic<?>> point(DynamicOps<?> ops) {
/* 31 */     return Optional.of(capEmpty(ops));
/*    */   }
/*    */   
/*    */   private <T> Dynamic<T> capEmpty(DynamicOps<T> ops) {
/* 35 */     return new Dynamic(ops, ops.emptyMap());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\types\constant\NilSave.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */