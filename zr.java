/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class zr
/*    */   extends abc
/*    */ {
/*    */   public zr(Schema ☃, boolean bool) {
/*  9 */     super("EntityTippedArrowFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected String a(String ☃) {
/* 14 */     return Objects.equals(☃, "TippedArrow") ? "Arrow" : ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */