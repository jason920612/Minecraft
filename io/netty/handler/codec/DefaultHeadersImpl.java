/*    */ package io.netty.handler.codec;
/*    */ 
/*    */ import io.netty.util.HashingStrategy;
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
/*    */ public final class DefaultHeadersImpl<K, V>
/*    */   extends DefaultHeaders<K, V, DefaultHeadersImpl<K, V>>
/*    */ {
/*    */   public DefaultHeadersImpl(HashingStrategy<K> nameHashingStrategy, ValueConverter<V> valueConverter, DefaultHeaders.NameValidator<K> nameValidator) {
/* 27 */     super(nameHashingStrategy, valueConverter, nameValidator);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\DefaultHeadersImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */