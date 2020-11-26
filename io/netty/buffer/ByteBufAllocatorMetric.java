package io.netty.buffer;

public interface ByteBufAllocatorMetric {
  long usedHeapMemory();
  
  long usedDirectMemory();
}


/* Location:              F:\dw\server.jar!\io\netty\buffer\ByteBufAllocatorMetric.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */