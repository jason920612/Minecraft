/*      */ import io.netty.buffer.ByteBuf;
/*      */ import io.netty.buffer.ByteBufAllocator;
/*      */ import io.netty.buffer.ByteBufInputStream;
/*      */ import io.netty.buffer.ByteBufOutputStream;
/*      */ import io.netty.handler.codec.DecoderException;
/*      */ import io.netty.handler.codec.EncoderException;
/*      */ import io.netty.util.ByteProcessor;
/*      */ import io.netty.util.ReferenceCounted;
/*      */ import java.io.DataInput;
/*      */ import java.io.DataOutput;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.ByteOrder;
/*      */ import java.nio.channels.FileChannel;
/*      */ import java.nio.channels.GatheringByteChannel;
/*      */ import java.nio.channels.ScatteringByteChannel;
/*      */ import java.nio.charset.Charset;
/*      */ import java.nio.charset.StandardCharsets;
/*      */ import java.util.Date;
/*      */ import java.util.UUID;
/*      */ import javax.annotation.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class hy
/*      */   extends ByteBuf
/*      */ {
/*      */   private final ByteBuf a;
/*      */   
/*      */   public hy(ByteBuf ☃) {
/*   46 */     this.a = ☃;
/*      */   }
/*      */   
/*      */   public static int a(int ☃) {
/*   50 */     for (int i = 1; i < 5; i++) {
/*   51 */       if ((☃ & -1 << i * 7) == 0) {
/*   52 */         return i;
/*      */       }
/*      */     } 
/*   55 */     return 5;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public hy a(byte[] ☃) {
/*   68 */     d(☃.length);
/*   69 */     writeBytes(☃);
/*      */     
/*   71 */     return this;
/*      */   }
/*      */   
/*      */   public byte[] a() {
/*   75 */     return b(readableBytes());
/*      */   }
/*      */   
/*      */   public byte[] b(int ☃) {
/*   79 */     int i = g();
/*   80 */     if (i > ☃) {
/*   81 */       throw new DecoderException("ByteArray with size " + i + " is bigger than allowed " + ☃);
/*      */     }
/*   83 */     byte[] arrayOfByte = new byte[i];
/*   84 */     readBytes(arrayOfByte);
/*      */     
/*   86 */     return arrayOfByte;
/*      */   }
/*      */   
/*      */   public hy a(int[] ☃) {
/*   90 */     d(☃.length);
/*      */     
/*   92 */     for (int i : ☃) {
/*   93 */       d(i);
/*      */     }
/*      */     
/*   96 */     return this;
/*      */   }
/*      */   
/*      */   public int[] b() {
/*  100 */     return c(readableBytes());
/*      */   }
/*      */   
/*      */   public int[] c(int ☃) {
/*  104 */     int i = g();
/*  105 */     if (i > ☃) {
/*  106 */       throw new DecoderException("VarIntArray with size " + i + " is bigger than allowed " + ☃);
/*      */     }
/*  108 */     int[] arrayOfInt = new int[i];
/*      */     
/*  110 */     for (int j = 0; j < arrayOfInt.length; j++) {
/*  111 */       arrayOfInt[j] = g();
/*      */     }
/*      */     
/*  114 */     return arrayOfInt;
/*      */   }
/*      */   
/*      */   public hy a(long[] ☃) {
/*  118 */     d(☃.length);
/*      */     
/*  120 */     for (long l : ☃) {
/*  121 */       writeLong(l);
/*      */     }
/*      */     
/*  124 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public el e() {
/*  164 */     return el.a(readLong());
/*      */   }
/*      */   
/*      */   public hy a(el ☃) {
/*  168 */     writeLong(☃.g());
/*  169 */     return this;
/*      */   }
/*      */   
/*      */   public ij f() {
/*  173 */     return ij.a.a(e(262144));
/*      */   }
/*      */   
/*      */   public hy a(ij ☃) {
/*  177 */     return a(ij.a.a(☃), 262144);
/*      */   }
/*      */   
/*      */   public <T extends Enum<T>> T a(Class<T> ☃) {
/*  181 */     return (T)((Enum[])☃.getEnumConstants())[g()];
/*      */   }
/*      */   
/*      */   public hy a(Enum<?> ☃) {
/*  185 */     return d(☃.ordinal());
/*      */   }
/*      */   public int g() {
/*      */     byte b;
/*  189 */     int ☃ = 0;
/*  190 */     int i = 0;
/*      */     
/*      */     do {
/*  193 */       b = readByte();
/*      */       
/*  195 */       ☃ |= (b & Byte.MAX_VALUE) << i++ * 7;
/*      */       
/*  197 */       if (i > 5) {
/*  198 */         throw new RuntimeException("VarInt too big");
/*      */       }
/*      */     }
/*  201 */     while ((b & 0x80) == 128);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  206 */     return ☃;
/*      */   }
/*      */   public long h() {
/*      */     byte b;
/*  210 */     long ☃ = 0L;
/*  211 */     int i = 0;
/*      */     
/*      */     do {
/*  214 */       b = readByte();
/*      */       
/*  216 */       ☃ |= (b & Byte.MAX_VALUE) << i++ * 7;
/*      */       
/*  218 */       if (i > 10) {
/*  219 */         throw new RuntimeException("VarLong too big");
/*      */       }
/*      */     }
/*  222 */     while ((b & 0x80) == 128);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  227 */     return ☃;
/*      */   }
/*      */   
/*      */   public hy a(UUID ☃) {
/*  231 */     writeLong(☃.getMostSignificantBits());
/*  232 */     writeLong(☃.getLeastSignificantBits());
/*      */     
/*  234 */     return this;
/*      */   }
/*      */   
/*      */   public UUID i() {
/*  238 */     return new UUID(readLong(), readLong());
/*      */   }
/*      */   
/*      */   public hy d(int ☃) {
/*      */     while (true) {
/*  243 */       if ((☃ & 0xFFFFFF80) == 0) {
/*  244 */         writeByte(☃);
/*  245 */         return this;
/*      */       } 
/*      */       
/*  248 */       writeByte(☃ & 0x7F | 0x80);
/*  249 */       ☃ >>>= 7;
/*      */     } 
/*      */   }
/*      */   
/*      */   public hy b(long ☃) {
/*      */     while (true) {
/*  255 */       if ((☃ & 0xFFFFFFFFFFFFFF80L) == 0L) {
/*  256 */         writeByte((int)☃);
/*  257 */         return this;
/*      */       } 
/*      */       
/*  260 */       writeByte((int)(☃ & 0x7FL) | 0x80);
/*  261 */       ☃ >>>= 7L;
/*      */     } 
/*      */   }
/*      */   
/*      */   public hy a(@Nullable gy ☃) {
/*  266 */     if (☃ == null) {
/*  267 */       writeByte(0);
/*      */     } else {
/*      */       try {
/*  270 */         hi.a(☃, (DataOutput)new ByteBufOutputStream(this));
/*  271 */       } catch (IOException iOException) {
/*  272 */         throw new EncoderException(iOException);
/*      */       } 
/*      */     } 
/*      */     
/*  276 */     return this;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public gy j() {
/*  281 */     int ☃ = readerIndex();
/*  282 */     byte b = readByte();
/*      */     
/*  284 */     if (b == 0) {
/*  285 */       return null;
/*      */     }
/*  287 */     readerIndex(☃);
/*      */     try {
/*  289 */       return hi.a((DataInput)new ByteBufInputStream(this), new hh(2097152L));
/*  290 */     } catch (IOException iOException) {
/*  291 */       throw new EncoderException(iOException);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public hy a(ate ☃) {
/*  297 */     if (☃.a()) {
/*  298 */       writeBoolean(false);
/*      */     } else {
/*  300 */       writeBoolean(true);
/*  301 */       ata ata = ☃.b();
/*  302 */       d(ata.a(ata));
/*  303 */       writeByte(☃.C());
/*      */       
/*  305 */       gy gy = null;
/*  306 */       if (ata.k() || ata.n()) {
/*  307 */         gy = ☃.n();
/*      */       }
/*  309 */       a(gy);
/*      */     } 
/*      */     
/*  312 */     return this;
/*      */   }
/*      */   
/*      */   public ate k() {
/*  316 */     if (!readBoolean()) {
/*  317 */       return ate.a;
/*      */     }
/*      */     
/*  320 */     int ☃ = g();
/*  321 */     int i = readByte();
/*      */     
/*  323 */     ate ate = new ate(ata.b(☃), i);
/*  324 */     ate.c(j());
/*      */     
/*  326 */     return ate;
/*      */   }
/*      */   
/*      */   public String e(int ☃) {
/*  330 */     int i = g();
/*  331 */     if (i > ☃ * 4) {
/*  332 */       throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + i + " > " + (☃ * 4) + ")");
/*      */     }
/*  334 */     if (i < 0) {
/*  335 */       throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
/*      */     }
/*      */     
/*  338 */     String str = toString(readerIndex(), i, StandardCharsets.UTF_8);
/*  339 */     readerIndex(readerIndex() + i);
/*  340 */     if (str.length() > ☃) {
/*  341 */       throw new DecoderException("The received string length is longer than maximum allowed (" + i + " > " + ☃ + ")");
/*      */     }
/*      */     
/*  344 */     return str;
/*      */   }
/*      */   
/*      */   public hy a(String ☃) {
/*  348 */     return a(☃, 32767);
/*      */   }
/*      */   
/*      */   public hy a(String ☃, int i) {
/*  352 */     byte[] arrayOfByte = ☃.getBytes(StandardCharsets.UTF_8);
/*  353 */     if (arrayOfByte.length > i) {
/*  354 */       throw new EncoderException("String too big (was " + arrayOfByte.length + " bytes encoded, max " + i + ")");
/*      */     }
/*  356 */     d(arrayOfByte.length);
/*  357 */     writeBytes(arrayOfByte);
/*  358 */     return this;
/*      */   }
/*      */   
/*      */   public pc l() {
/*  362 */     return new pc(e(32767));
/*      */   }
/*      */   
/*      */   public hy a(pc ☃) {
/*  366 */     a(☃.toString());
/*  367 */     return this;
/*      */   }
/*      */   
/*      */   public Date m() {
/*  371 */     return new Date(readLong());
/*      */   }
/*      */   
/*      */   public hy a(Date ☃) {
/*  375 */     writeLong(☃.getTime());
/*  376 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public int capacity() {
/*  381 */     return this.a.capacity();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf capacity(int ☃) {
/*  386 */     return this.a.capacity(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int maxCapacity() {
/*  391 */     return this.a.maxCapacity();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBufAllocator alloc() {
/*  396 */     return this.a.alloc();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteOrder order() {
/*  401 */     return this.a.order();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf order(ByteOrder ☃) {
/*  406 */     return this.a.order(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf unwrap() {
/*  411 */     return this.a.unwrap();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isDirect() {
/*  416 */     return this.a.isDirect();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isReadOnly() {
/*  421 */     return this.a.isReadOnly();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf asReadOnly() {
/*  426 */     return this.a.asReadOnly();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readerIndex() {
/*  431 */     return this.a.readerIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readerIndex(int ☃) {
/*  436 */     return this.a.readerIndex(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writerIndex() {
/*  441 */     return this.a.writerIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writerIndex(int ☃) {
/*  446 */     return this.a.writerIndex(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setIndex(int ☃, int i) {
/*  451 */     return this.a.setIndex(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int readableBytes() {
/*  456 */     return this.a.readableBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public int writableBytes() {
/*  461 */     return this.a.writableBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public int maxWritableBytes() {
/*  466 */     return this.a.maxWritableBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isReadable() {
/*  471 */     return this.a.isReadable();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isReadable(int ☃) {
/*  476 */     return this.a.isReadable(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isWritable() {
/*  481 */     return this.a.isWritable();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isWritable(int ☃) {
/*  486 */     return this.a.isWritable(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf clear() {
/*  491 */     return this.a.clear();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf markReaderIndex() {
/*  496 */     return this.a.markReaderIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf resetReaderIndex() {
/*  501 */     return this.a.resetReaderIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf markWriterIndex() {
/*  506 */     return this.a.markWriterIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf resetWriterIndex() {
/*  511 */     return this.a.resetWriterIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf discardReadBytes() {
/*  516 */     return this.a.discardReadBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf discardSomeReadBytes() {
/*  521 */     return this.a.discardSomeReadBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf ensureWritable(int ☃) {
/*  526 */     return this.a.ensureWritable(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int ensureWritable(int ☃, boolean bool) {
/*  531 */     return this.a.ensureWritable(☃, bool);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getBoolean(int ☃) {
/*  536 */     return this.a.getBoolean(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public byte getByte(int ☃) {
/*  541 */     return this.a.getByte(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public short getUnsignedByte(int ☃) {
/*  546 */     return this.a.getUnsignedByte(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public short getShort(int ☃) {
/*  551 */     return this.a.getShort(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public short getShortLE(int ☃) {
/*  556 */     return this.a.getShortLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getUnsignedShort(int ☃) {
/*  561 */     return this.a.getUnsignedShort(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getUnsignedShortLE(int ☃) {
/*  566 */     return this.a.getUnsignedShortLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getMedium(int ☃) {
/*  571 */     return this.a.getMedium(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getMediumLE(int ☃) {
/*  576 */     return this.a.getMediumLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getUnsignedMedium(int ☃) {
/*  581 */     return this.a.getUnsignedMedium(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getUnsignedMediumLE(int ☃) {
/*  586 */     return this.a.getUnsignedMediumLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getInt(int ☃) {
/*  591 */     return this.a.getInt(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getIntLE(int ☃) {
/*  596 */     return this.a.getIntLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public long getUnsignedInt(int ☃) {
/*  601 */     return this.a.getUnsignedInt(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public long getUnsignedIntLE(int ☃) {
/*  606 */     return this.a.getUnsignedIntLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public long getLong(int ☃) {
/*  611 */     return this.a.getLong(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public long getLongLE(int ☃) {
/*  616 */     return this.a.getLongLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public char getChar(int ☃) {
/*  621 */     return this.a.getChar(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public float getFloat(int ☃) {
/*  626 */     return this.a.getFloat(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public double getDouble(int ☃) {
/*  631 */     return this.a.getDouble(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, ByteBuf byteBuf) {
/*  636 */     return this.a.getBytes(☃, byteBuf);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, ByteBuf byteBuf, int i) {
/*  641 */     return this.a.getBytes(☃, byteBuf, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, ByteBuf byteBuf, int i, int j) {
/*  646 */     return this.a.getBytes(☃, byteBuf, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, byte[] arrayOfByte) {
/*  651 */     return this.a.getBytes(☃, arrayOfByte);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, byte[] arrayOfByte, int i, int j) {
/*  656 */     return this.a.getBytes(☃, arrayOfByte, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, ByteBuffer byteBuffer) {
/*  661 */     return this.a.getBytes(☃, byteBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, OutputStream outputStream, int i) throws IOException {
/*  666 */     return this.a.getBytes(☃, outputStream, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getBytes(int ☃, GatheringByteChannel gatheringByteChannel, int i) throws IOException {
/*  671 */     return this.a.getBytes(☃, gatheringByteChannel, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getBytes(int ☃, FileChannel fileChannel, long l, int i) throws IOException {
/*  676 */     return this.a.getBytes(☃, fileChannel, l, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public CharSequence getCharSequence(int ☃, int i, Charset charset) {
/*  681 */     return this.a.getCharSequence(☃, i, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBoolean(int ☃, boolean bool) {
/*  686 */     return this.a.setBoolean(☃, bool);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setByte(int ☃, int i) {
/*  691 */     return this.a.setByte(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setShort(int ☃, int i) {
/*  696 */     return this.a.setShort(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setShortLE(int ☃, int i) {
/*  701 */     return this.a.setShortLE(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setMedium(int ☃, int i) {
/*  706 */     return this.a.setMedium(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setMediumLE(int ☃, int i) {
/*  711 */     return this.a.setMediumLE(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setInt(int ☃, int i) {
/*  716 */     return this.a.setInt(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setIntLE(int ☃, int i) {
/*  721 */     return this.a.setIntLE(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setLong(int ☃, long l) {
/*  726 */     return this.a.setLong(☃, l);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setLongLE(int ☃, long l) {
/*  731 */     return this.a.setLongLE(☃, l);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setChar(int ☃, int i) {
/*  736 */     return this.a.setChar(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setFloat(int ☃, float f) {
/*  741 */     return this.a.setFloat(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setDouble(int ☃, double d) {
/*  746 */     return this.a.setDouble(☃, d);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, ByteBuf byteBuf) {
/*  751 */     return this.a.setBytes(☃, byteBuf);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, ByteBuf byteBuf, int i) {
/*  756 */     return this.a.setBytes(☃, byteBuf, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, ByteBuf byteBuf, int i, int j) {
/*  761 */     return this.a.setBytes(☃, byteBuf, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, byte[] arrayOfByte) {
/*  766 */     return this.a.setBytes(☃, arrayOfByte);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, byte[] arrayOfByte, int i, int j) {
/*  771 */     return this.a.setBytes(☃, arrayOfByte, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, ByteBuffer byteBuffer) {
/*  776 */     return this.a.setBytes(☃, byteBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public int setBytes(int ☃, InputStream inputStream, int i) throws IOException {
/*  781 */     return this.a.setBytes(☃, inputStream, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int setBytes(int ☃, ScatteringByteChannel scatteringByteChannel, int i) throws IOException {
/*  786 */     return this.a.setBytes(☃, scatteringByteChannel, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int setBytes(int ☃, FileChannel fileChannel, long l, int i) throws IOException {
/*  791 */     return this.a.setBytes(☃, fileChannel, l, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setZero(int ☃, int i) {
/*  796 */     return this.a.setZero(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int setCharSequence(int ☃, CharSequence charSequence, Charset charset) {
/*  801 */     return this.a.setCharSequence(☃, charSequence, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean readBoolean() {
/*  806 */     return this.a.readBoolean();
/*      */   }
/*      */ 
/*      */   
/*      */   public byte readByte() {
/*  811 */     return this.a.readByte();
/*      */   }
/*      */ 
/*      */   
/*      */   public short readUnsignedByte() {
/*  816 */     return this.a.readUnsignedByte();
/*      */   }
/*      */ 
/*      */   
/*      */   public short readShort() {
/*  821 */     return this.a.readShort();
/*      */   }
/*      */ 
/*      */   
/*      */   public short readShortLE() {
/*  826 */     return this.a.readShortLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readUnsignedShort() {
/*  831 */     return this.a.readUnsignedShort();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readUnsignedShortLE() {
/*  836 */     return this.a.readUnsignedShortLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readMedium() {
/*  841 */     return this.a.readMedium();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readMediumLE() {
/*  846 */     return this.a.readMediumLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readUnsignedMedium() {
/*  851 */     return this.a.readUnsignedMedium();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readUnsignedMediumLE() {
/*  856 */     return this.a.readUnsignedMediumLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readInt() {
/*  861 */     return this.a.readInt();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readIntLE() {
/*  866 */     return this.a.readIntLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public long readUnsignedInt() {
/*  871 */     return this.a.readUnsignedInt();
/*      */   }
/*      */ 
/*      */   
/*      */   public long readUnsignedIntLE() {
/*  876 */     return this.a.readUnsignedIntLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public long readLong() {
/*  881 */     return this.a.readLong();
/*      */   }
/*      */ 
/*      */   
/*      */   public long readLongLE() {
/*  886 */     return this.a.readLongLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public char readChar() {
/*  891 */     return this.a.readChar();
/*      */   }
/*      */ 
/*      */   
/*      */   public float readFloat() {
/*  896 */     return this.a.readFloat();
/*      */   }
/*      */ 
/*      */   
/*      */   public double readDouble() {
/*  901 */     return this.a.readDouble();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(int ☃) {
/*  906 */     return this.a.readBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readSlice(int ☃) {
/*  911 */     return this.a.readSlice(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readRetainedSlice(int ☃) {
/*  916 */     return this.a.readRetainedSlice(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(ByteBuf ☃) {
/*  921 */     return this.a.readBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(ByteBuf ☃, int i) {
/*  926 */     return this.a.readBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(ByteBuf ☃, int i, int j) {
/*  931 */     return this.a.readBytes(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(byte[] ☃) {
/*  936 */     return this.a.readBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(byte[] ☃, int i, int j) {
/*  941 */     return this.a.readBytes(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(ByteBuffer ☃) {
/*  946 */     return this.a.readBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(OutputStream ☃, int i) throws IOException {
/*  951 */     return this.a.readBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int readBytes(GatheringByteChannel ☃, int i) throws IOException {
/*  956 */     return this.a.readBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public CharSequence readCharSequence(int ☃, Charset charset) {
/*  961 */     return this.a.readCharSequence(☃, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public int readBytes(FileChannel ☃, long l, int i) throws IOException {
/*  966 */     return this.a.readBytes(☃, l, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf skipBytes(int ☃) {
/*  971 */     return this.a.skipBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBoolean(boolean ☃) {
/*  976 */     return this.a.writeBoolean(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeByte(int ☃) {
/*  981 */     return this.a.writeByte(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeShort(int ☃) {
/*  986 */     return this.a.writeShort(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeShortLE(int ☃) {
/*  991 */     return this.a.writeShortLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeMedium(int ☃) {
/*  996 */     return this.a.writeMedium(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeMediumLE(int ☃) {
/* 1001 */     return this.a.writeMediumLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeInt(int ☃) {
/* 1006 */     return this.a.writeInt(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeIntLE(int ☃) {
/* 1011 */     return this.a.writeIntLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeLong(long ☃) {
/* 1016 */     return this.a.writeLong(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeLongLE(long ☃) {
/* 1021 */     return this.a.writeLongLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeChar(int ☃) {
/* 1026 */     return this.a.writeChar(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeFloat(float ☃) {
/* 1031 */     return this.a.writeFloat(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeDouble(double ☃) {
/* 1036 */     return this.a.writeDouble(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(ByteBuf ☃) {
/* 1041 */     return this.a.writeBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(ByteBuf ☃, int i) {
/* 1046 */     return this.a.writeBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(ByteBuf ☃, int i, int j) {
/* 1051 */     return this.a.writeBytes(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(byte[] ☃) {
/* 1056 */     return this.a.writeBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(byte[] ☃, int i, int j) {
/* 1061 */     return this.a.writeBytes(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(ByteBuffer ☃) {
/* 1066 */     return this.a.writeBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writeBytes(InputStream ☃, int i) throws IOException {
/* 1071 */     return this.a.writeBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writeBytes(ScatteringByteChannel ☃, int i) throws IOException {
/* 1076 */     return this.a.writeBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writeBytes(FileChannel ☃, long l, int i) throws IOException {
/* 1081 */     return this.a.writeBytes(☃, l, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeZero(int ☃) {
/* 1086 */     return this.a.writeZero(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writeCharSequence(CharSequence ☃, Charset charset) {
/* 1091 */     return this.a.writeCharSequence(☃, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public int indexOf(int ☃, int i, byte b) {
/* 1096 */     return this.a.indexOf(☃, i, b);
/*      */   }
/*      */ 
/*      */   
/*      */   public int bytesBefore(byte ☃) {
/* 1101 */     return this.a.bytesBefore(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int bytesBefore(int ☃, byte b) {
/* 1106 */     return this.a.bytesBefore(☃, b);
/*      */   }
/*      */ 
/*      */   
/*      */   public int bytesBefore(int ☃, int i, byte b) {
/* 1111 */     return this.a.bytesBefore(☃, i, b);
/*      */   }
/*      */ 
/*      */   
/*      */   public int forEachByte(ByteProcessor ☃) {
/* 1116 */     return this.a.forEachByte(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int forEachByte(int ☃, int i, ByteProcessor byteProcessor) {
/* 1121 */     return this.a.forEachByte(☃, i, byteProcessor);
/*      */   }
/*      */ 
/*      */   
/*      */   public int forEachByteDesc(ByteProcessor ☃) {
/* 1126 */     return this.a.forEachByteDesc(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int forEachByteDesc(int ☃, int i, ByteProcessor byteProcessor) {
/* 1131 */     return this.a.forEachByteDesc(☃, i, byteProcessor);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf copy() {
/* 1136 */     return this.a.copy();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf copy(int ☃, int i) {
/* 1141 */     return this.a.copy(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf slice() {
/* 1146 */     return this.a.slice();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retainedSlice() {
/* 1151 */     return this.a.retainedSlice();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf slice(int ☃, int i) {
/* 1156 */     return this.a.slice(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retainedSlice(int ☃, int i) {
/* 1161 */     return this.a.retainedSlice(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf duplicate() {
/* 1166 */     return this.a.duplicate();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retainedDuplicate() {
/* 1171 */     return this.a.retainedDuplicate();
/*      */   }
/*      */ 
/*      */   
/*      */   public int nioBufferCount() {
/* 1176 */     return this.a.nioBufferCount();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer nioBuffer() {
/* 1181 */     return this.a.nioBuffer();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer nioBuffer(int ☃, int i) {
/* 1186 */     return this.a.nioBuffer(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer internalNioBuffer(int ☃, int i) {
/* 1191 */     return this.a.internalNioBuffer(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer[] nioBuffers() {
/* 1196 */     return this.a.nioBuffers();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer[] nioBuffers(int ☃, int i) {
/* 1201 */     return this.a.nioBuffers(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean hasArray() {
/* 1206 */     return this.a.hasArray();
/*      */   }
/*      */ 
/*      */   
/*      */   public byte[] array() {
/* 1211 */     return this.a.array();
/*      */   }
/*      */ 
/*      */   
/*      */   public int arrayOffset() {
/* 1216 */     return this.a.arrayOffset();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean hasMemoryAddress() {
/* 1221 */     return this.a.hasMemoryAddress();
/*      */   }
/*      */ 
/*      */   
/*      */   public long memoryAddress() {
/* 1226 */     return this.a.memoryAddress();
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString(Charset ☃) {
/* 1231 */     return this.a.toString(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString(int ☃, int i, Charset charset) {
/* 1236 */     return this.a.toString(☃, i, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 1241 */     return this.a.hashCode();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean equals(Object ☃) {
/* 1246 */     return this.a.equals(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int compareTo(ByteBuf ☃) {
/* 1251 */     return this.a.compareTo(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 1256 */     return this.a.toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retain(int ☃) {
/* 1261 */     return this.a.retain(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retain() {
/* 1266 */     return this.a.retain();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf touch() {
/* 1271 */     return this.a.touch();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf touch(Object ☃) {
/* 1276 */     return this.a.touch(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int refCnt() {
/* 1281 */     return this.a.refCnt();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean release() {
/* 1286 */     return this.a.release();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean release(int ☃) {
/* 1291 */     return this.a.release(☃);
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\hy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */