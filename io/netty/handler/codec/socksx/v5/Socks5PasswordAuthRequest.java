package io.netty.handler.codec.socksx.v5;

public interface Socks5PasswordAuthRequest extends Socks5Message {
  String username();
  
  String password();
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\socksx\v5\Socks5PasswordAuthRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */