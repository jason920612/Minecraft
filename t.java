/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface t
/*    */ {
/*    */   pc a();
/*    */   
/*    */   default JsonElement b() {
/* 11 */     return (JsonElement)JsonNull.INSTANCE;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */