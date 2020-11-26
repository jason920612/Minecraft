package io.netty.handler.codec.http.multipart;

import io.netty.handler.codec.http.HttpContent;
import java.util.List;

public interface InterfaceHttpPostRequestDecoder {
  boolean isMultipart();
  
  void setDiscardThreshold(int paramInt);
  
  int getDiscardThreshold();
  
  List<InterfaceHttpData> getBodyHttpDatas();
  
  List<InterfaceHttpData> getBodyHttpDatas(String paramString);
  
  InterfaceHttpData getBodyHttpData(String paramString);
  
  InterfaceHttpPostRequestDecoder offer(HttpContent paramHttpContent);
  
  boolean hasNext();
  
  InterfaceHttpData next();
  
  InterfaceHttpData currentPartialHttpData();
  
  void destroy();
  
  void cleanFiles();
  
  void removeHttpDataFromClean(InterfaceHttpData paramInterfaceHttpData);
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\http\multipart\InterfaceHttpPostRequestDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */