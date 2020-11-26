/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class yl
/*    */   extends aao {
/*    */   public yl(Schema ☃, boolean bool) {
/*  9 */     super(☃, bool, "BlockEntityShulkerBoxColorFix", aax.j, "minecraft:shulker_box");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 14 */     return ☃.update(DSL.remainderFinder(), ☃ -> ☃.remove("Color"));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */