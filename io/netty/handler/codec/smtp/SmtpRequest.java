package io.netty.handler.codec.smtp;

import java.util.List;

public interface SmtpRequest {
  SmtpCommand command();
  
  List<CharSequence> parameters();
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\smtp\SmtpRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */