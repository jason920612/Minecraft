package org.apache.logging.log4j.spi;

public interface CleanableThreadContextMap extends ThreadContextMap2 {
  void removeAll(Iterable<String> paramIterable);
}


/* Location:              F:\dw\server.jar!\org\apache\logging\log4j\spi\CleanableThreadContextMap.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */