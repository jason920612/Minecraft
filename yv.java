/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class yv
/*    */   extends aao
/*    */ {
/*    */   public yv(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "EntityArmorStandSilentFix", aax.o, "ArmorStand");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     if (☃.getBoolean("Silent") && !☃.getBoolean("Marker")) {
/* 15 */       return ☃.remove("Silent");
/*    */     }
/* 17 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 22 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */