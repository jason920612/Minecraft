package io.netty.handler.codec.socksx.v5;

public interface Socks5CommandRequest extends Socks5Message {
  Socks5CommandType type();
  
  Socks5AddressType dstAddrType();
  
  String dstAddr();
  
  int dstPort();
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\socksx\v5\Socks5CommandRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */