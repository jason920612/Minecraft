/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cdg
/*    */   extends ccy
/*    */ {
/* 19 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   public cdg(cdk[] ☃) {
/* 22 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ate ☃, Random random, ccr ccr1) {
/* 27 */     if (☃.a()) {
/* 28 */       return ☃;
/*    */     }
/* 30 */     avk avk = a(ccr1, ☃);
/* 31 */     if (avk != null) {
/* 32 */       ate ate1 = avk.d();
/*    */       
/* 34 */       if (!ate1.a()) {
/* 35 */         ate ate2 = ate1.i();
/* 36 */         ate2.e(☃.C());
/* 37 */         return ate2;
/*    */       } 
/*    */     } 
/*    */     
/* 41 */     a.warn("Couldn't smelt {} because there is no smelting recipe", ☃);
/* 42 */     return ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static avk a(ccr ☃, ate ate1) {
/* 47 */     for (avk avk : ☃.h().E().b()) {
/* 48 */       if (avk instanceof avt && ((avh)avk.e().get(0)).a(ate1)) {
/* 49 */         return avk;
/*    */       }
/*    */     } 
/*    */     
/* 53 */     return null;
/*    */   }
/*    */   
/*    */   public static class a extends ccy.a<cdg> {
/*    */     protected a() {
/* 58 */       super(new pc("furnace_smelt"), cdg.class);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, cdg cdg1, JsonSerializationContext jsonSerializationContext) {}
/*    */ 
/*    */     
/*    */     public cdg a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 67 */       return new cdg(arrayOfCdk);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */