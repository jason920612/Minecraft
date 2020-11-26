/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class zf
/*    */   extends aao
/*    */ {
/*    */   public zf(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "EntityItemFrameDirectionFix", aax.o, "minecraft:item_frame");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     return ☃.set("Facing", ☃.createByte(a(☃.getByte("Facing"))));
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 19 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */   
/*    */   private static byte a(byte ☃) {
/* 23 */     switch (☃)
/*    */     
/*    */     { default:
/* 26 */         return 2;
/*    */       case 0:
/* 28 */         return 3;
/*    */       case 1:
/* 30 */         return 4;
/*    */       case 3:
/* 32 */         break; }  return 5;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */