package io.netty.handler.codec.smtp;

import java.util.List;

public interface SmtpResponse {
  int code();
  
  List<CharSequence> details();
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\smtp\SmtpResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */