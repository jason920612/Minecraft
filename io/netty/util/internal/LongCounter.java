package io.netty.util.internal;

public interface LongCounter {
  void add(long paramLong);
  
  void increment();
  
  void decrement();
  
  long value();
}


/* Location:              F:\dw\server.jar!\io\nett\\util\internal\LongCounter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */