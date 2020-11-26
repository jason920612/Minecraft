/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class zs
/*    */   extends aao
/*    */ {
/*    */   public zs(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "EntityWolfColorFix", aax.o, "minecraft:wolf");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     return ☃.update("CollarColor", ☃ -> ☃.createByte((byte)(15 - ☃.getNumberValue(Integer.valueOf(0)).intValue())));
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 19 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */