package io.netty.channel.unix;

import io.netty.channel.socket.DuplexChannel;

public interface DomainSocketChannel extends UnixChannel, DuplexChannel {
  DomainSocketAddress remoteAddress();
  
  DomainSocketAddress localAddress();
  
  DomainSocketChannelConfig config();
}


/* Location:              F:\dw\server.jar!\io\netty\channe\\unix\DomainSocketChannel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */