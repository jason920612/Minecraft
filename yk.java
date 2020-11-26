/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class yk
/*    */   extends aao
/*    */ {
/*    */   public yk(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "BlockEntityKeepPacked", aax.j, "DUMMY");
/*    */   }
/*    */   
/*    */   private static Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     return ☃.set("keepPacked", ☃.createBoolean(true));
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 19 */     return ☃.update(DSL.remainderFinder(), yk::a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */