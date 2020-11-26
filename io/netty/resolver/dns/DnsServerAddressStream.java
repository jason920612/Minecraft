package io.netty.resolver.dns;

import java.net.InetSocketAddress;

public interface DnsServerAddressStream {
  InetSocketAddress next();
  
  int size();
  
  DnsServerAddressStream duplicate();
}


/* Location:              F:\dw\server.jar!\io\netty\resolver\dns\DnsServerAddressStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */