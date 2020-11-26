/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class yz
/*    */   extends abb
/*    */ {
/*    */   public yz(Schema ☃, boolean bool) {
/* 11 */     super("EntityElderGuardianSplitFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Dynamic<?>> a(String ☃, Dynamic<?> dynamic) {
/* 16 */     return Pair.of((Objects.equals(☃, "Guardian") && dynamic.getBoolean("Elder")) ? "ElderGuardian" : ☃, dynamic);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */