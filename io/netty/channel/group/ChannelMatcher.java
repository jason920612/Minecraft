package io.netty.channel.group;

import io.netty.channel.Channel;

public interface ChannelMatcher {
  boolean matches(Channel paramChannel);
}


/* Location:              F:\dw\server.jar!\io\netty\channel\group\ChannelMatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */