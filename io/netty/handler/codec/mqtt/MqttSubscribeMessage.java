/*    */ package io.netty.handler.codec.mqtt;
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
/*    */ public final class MqttSubscribeMessage
/*    */   extends MqttMessage
/*    */ {
/*    */   public MqttSubscribeMessage(MqttFixedHeader mqttFixedHeader, MqttMessageIdVariableHeader variableHeader, MqttSubscribePayload payload) {
/* 29 */     super(mqttFixedHeader, variableHeader, payload);
/*    */   }
/*    */ 
/*    */   
/*    */   public MqttMessageIdVariableHeader variableHeader() {
/* 34 */     return (MqttMessageIdVariableHeader)super.variableHeader();
/*    */   }
/*    */ 
/*    */   
/*    */   public MqttSubscribePayload payload() {
/* 39 */     return (MqttSubscribePayload)super.payload();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\mqtt\MqttSubscribeMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */