package io.netty.channel.pool;

public interface ChannelPoolMap<K, P extends ChannelPool> {
  P get(K paramK);
  
  boolean contains(K paramK);
}


/* Location:              F:\dw\server.jar!\io\netty\channel\pool\ChannelPoolMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */