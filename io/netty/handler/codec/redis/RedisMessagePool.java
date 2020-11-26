package io.netty.handler.codec.redis;

import io.netty.buffer.ByteBuf;

public interface RedisMessagePool {
  SimpleStringRedisMessage getSimpleString(String paramString);
  
  SimpleStringRedisMessage getSimpleString(ByteBuf paramByteBuf);
  
  ErrorRedisMessage getError(String paramString);
  
  ErrorRedisMessage getError(ByteBuf paramByteBuf);
  
  IntegerRedisMessage getInteger(long paramLong);
  
  IntegerRedisMessage getInteger(ByteBuf paramByteBuf);
  
  byte[] getByteBufOfInteger(long paramLong);
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\redis\RedisMessagePool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */