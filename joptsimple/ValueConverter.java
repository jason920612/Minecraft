package joptsimple;

public interface ValueConverter<V> {
  V convert(String paramString);
  
  Class<? extends V> valueType();
  
  String valuePattern();
}


/* Location:              F:\dw\server.jar!\joptsimple\ValueConverter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */