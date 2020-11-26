/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class yu
/*    */   extends aao {
/*    */   public yu(Schema ☃, boolean bool) {
/*  9 */     super(☃, bool, "Colorless shulker entity fix", aax.o, "minecraft:shulker");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 14 */     return ☃.update(DSL.remainderFinder(), ☃ -> (☃.getByte("Color") == 10) ? ☃.set("Color", ☃.createByte((byte)16)) : ☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */