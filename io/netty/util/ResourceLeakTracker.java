package io.netty.util;

public interface ResourceLeakTracker<T> {
  void record();
  
  void record(Object paramObject);
  
  boolean close(T paramT);
}


/* Location:              F:\dw\server.jar!\io\nett\\util\ResourceLeakTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */