/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class yf
/*    */   extends aao {
/*    */   public yf(Schema ☃, boolean bool) {
/* 11 */     super(☃, bool, "BlockEntityBannerColorFix", aax.j, "minecraft:banner");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 15 */     ☃ = ☃.update("Base", ☃ -> ☃.createInt(15 - ☃.getNumberValue(Integer.valueOf(0)).intValue()));
/*    */     
/* 17 */     ☃ = ☃.update("Patterns", ☃ -> (Dynamic)DataFixUtils.orElse(☃.getStream().map(()).map(☃::createList), ☃));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 28 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */