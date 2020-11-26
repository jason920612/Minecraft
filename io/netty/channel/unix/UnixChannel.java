package io.netty.channel.unix;

import io.netty.channel.Channel;

public interface UnixChannel extends Channel {
  FileDescriptor fd();
}


/* Location:              F:\dw\server.jar!\io\netty\channe\\unix\UnixChannel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */