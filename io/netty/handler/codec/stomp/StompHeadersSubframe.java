package io.netty.handler.codec.stomp;

public interface StompHeadersSubframe extends StompSubframe {
  StompCommand command();
  
  StompHeaders headers();
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\stomp\StompHeadersSubframe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */