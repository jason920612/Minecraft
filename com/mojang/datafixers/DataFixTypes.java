/*    */ package com.mojang.datafixers;
/*    */ 
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ 
/*    */ public enum DataFixTypes
/*    */   implements DSL.TypeReference
/*    */ {
/*  9 */   LEVEL("level"),
/* 10 */   PLAYER("player"),
/* 11 */   CHUNK("chunk"),
/* 12 */   HOTBAR("hotbar"),
/* 13 */   OPTIONS("options"),
/* 14 */   STRUCTURE("structure"),
/* 15 */   STATS("stats"),
/* 16 */   SAVED_DATA("saved_data"),
/* 17 */   ADVANCEMENTS("advancements");
/*    */   
/*    */   private final String name;
/*    */ 
/*    */   
/*    */   DataFixTypes(String name) {
/* 23 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeTemplate in(Schema schema) {
/* 28 */     return schema.id(this.name);
/*    */   }
/*    */ 
/*    */   
/*    */   public String typeName() {
/* 33 */     return this.name;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\DataFixTypes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */