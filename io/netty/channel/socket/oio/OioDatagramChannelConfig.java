package io.netty.channel.socket.oio;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.WriteBufferWaterMark;
import io.netty.channel.socket.DatagramChannelConfig;
import java.net.InetAddress;
import java.net.NetworkInterface;

public interface OioDatagramChannelConfig extends DatagramChannelConfig {
  OioDatagramChannelConfig setSoTimeout(int paramInt);
  
  int getSoTimeout();
  
  OioDatagramChannelConfig setSendBufferSize(int paramInt);
  
  OioDatagramChannelConfig setReceiveBufferSize(int paramInt);
  
  OioDatagramChannelConfig setTrafficClass(int paramInt);
  
  OioDatagramChannelConfig setReuseAddress(boolean paramBoolean);
  
  OioDatagramChannelConfig setBroadcast(boolean paramBoolean);
  
  OioDatagramChannelConfig setLoopbackModeDisabled(boolean paramBoolean);
  
  OioDatagramChannelConfig setTimeToLive(int paramInt);
  
  OioDatagramChannelConfig setInterface(InetAddress paramInetAddress);
  
  OioDatagramChannelConfig setNetworkInterface(NetworkInterface paramNetworkInterface);
  
  OioDatagramChannelConfig setMaxMessagesPerRead(int paramInt);
  
  OioDatagramChannelConfig setWriteSpinCount(int paramInt);
  
  OioDatagramChannelConfig setConnectTimeoutMillis(int paramInt);
  
  OioDatagramChannelConfig setAllocator(ByteBufAllocator paramByteBufAllocator);
  
  OioDatagramChannelConfig setRecvByteBufAllocator(RecvByteBufAllocator paramRecvByteBufAllocator);
  
  OioDatagramChannelConfig setAutoRead(boolean paramBoolean);
  
  OioDatagramChannelConfig setAutoClose(boolean paramBoolean);
  
  OioDatagramChannelConfig setMessageSizeEstimator(MessageSizeEstimator paramMessageSizeEstimator);
  
  OioDatagramChannelConfig setWriteBufferWaterMark(WriteBufferWaterMark paramWriteBufferWaterMark);
  
  OioDatagramChannelConfig setWriteBufferHighWaterMark(int paramInt);
  
  OioDatagramChannelConfig setWriteBufferLowWaterMark(int paramInt);
}


/* Location:              F:\dw\server.jar!\io\netty\channel\socket\oio\OioDatagramChannelConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */