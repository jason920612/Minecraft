package io.netty.util;

public interface AttributeMap {
  <T> Attribute<T> attr(AttributeKey<T> paramAttributeKey);
  
  <T> boolean hasAttr(AttributeKey<T> paramAttributeKey);
}


/* Location:              F:\dw\server.jar!\io\nett\\util\AttributeMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */