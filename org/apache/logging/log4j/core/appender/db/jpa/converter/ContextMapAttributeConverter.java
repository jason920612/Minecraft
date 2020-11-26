/*    */ package org.apache.logging.log4j.core.appender.db.jpa.converter;
/*    */ 
/*    */ import java.util.Map;
/*    */ import javax.persistence.AttributeConverter;
/*    */ import javax.persistence.Converter;
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
/*    */ @Converter(autoApply = false)
/*    */ public class ContextMapAttributeConverter
/*    */   implements AttributeConverter<Map<String, String>, String>
/*    */ {
/*    */   public String convertToDatabaseColumn(Map<String, String> contextMap) {
/* 35 */     if (contextMap == null) {
/* 36 */       return null;
/*    */     }
/*    */     
/* 39 */     return contextMap.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, String> convertToEntityAttribute(String s) {
/* 44 */     throw new UnsupportedOperationException("Log events can only be persisted, not extracted.");
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\org\apache\logging\log4j\core\appender\db\jpa\converter\ContextMapAttributeConverter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */