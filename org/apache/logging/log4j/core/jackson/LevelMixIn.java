/*    */ package org.apache.logging.log4j.core.jackson;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonCreator;
/*    */ import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ import com.fasterxml.jackson.annotation.JsonValue;
/*    */ import org.apache.logging.log4j.Level;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @JsonIgnoreProperties({"name", "declaringClass", "standardLevel"})
/*    */ abstract class LevelMixIn
/*    */ {
/*    */   @JsonCreator
/*    */   public static Level getLevel(@JsonProperty("name") String name) {
/* 39 */     return null;
/*    */   }
/*    */   
/*    */   @JsonValue
/*    */   public abstract String name();
/*    */ }


/* Location:              F:\dw\server.jar!\org\apache\logging\log4j\core\jackson\LevelMixIn.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */