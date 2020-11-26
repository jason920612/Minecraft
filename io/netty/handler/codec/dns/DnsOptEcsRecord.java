package io.netty.handler.codec.dns;

public interface DnsOptEcsRecord extends DnsOptPseudoRecord {
  int sourcePrefixLength();
  
  int scopePrefixLength();
  
  byte[] address();
}


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\dns\DnsOptEcsRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */