package io.netty.handler.codec.http2;

public interface Http2StreamFrame extends Http2Frame {
  Http2StreamFrame stream(Http2FrameStream paramHttp2FrameStream);
  
  Http2FrameStream stream();
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\http2\Http2StreamFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */