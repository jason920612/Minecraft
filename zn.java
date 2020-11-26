/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class zn
/*    */   extends aao
/*    */ {
/*    */   public zn(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "EntityShulkerColorFix", aax.o, "minecraft:shulker");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     if (!☃.get("Color").map(Dynamic::getNumberValue).isPresent()) {
/* 15 */       return ☃.set("Color", ☃.createByte((byte)10));
/*    */     }
/* 17 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 22 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */