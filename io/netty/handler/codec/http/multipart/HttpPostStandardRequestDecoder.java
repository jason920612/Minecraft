/*     */ package io.netty.handler.codec.http.multipart;
/*     */ 
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import io.netty.handler.codec.http.HttpConstants;
/*     */ import io.netty.handler.codec.http.HttpContent;
/*     */ import io.netty.handler.codec.http.HttpRequest;
/*     */ import io.netty.handler.codec.http.QueryStringDecoder;
/*     */ import io.netty.util.internal.ObjectUtil;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.TreeMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HttpPostStandardRequestDecoder
/*     */   implements InterfaceHttpPostRequestDecoder
/*     */ {
/*     */   private final HttpDataFactory factory;
/*     */   private final HttpRequest request;
/*     */   private final Charset charset;
/*     */   private boolean isLastChunk;
/*  71 */   private final List<InterfaceHttpData> bodyListHttpData = new ArrayList<InterfaceHttpData>();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   private final Map<String, List<InterfaceHttpData>> bodyMapHttpData = new TreeMap<String, List<InterfaceHttpData>>(CaseIgnoringComparator.INSTANCE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ByteBuf undecodedChunk;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int bodyListHttpDataRank;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  92 */   private HttpPostRequestDecoder.MultiPartStatus currentStatus = HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED;
/*     */ 
/*     */   
/*     */   private Attribute currentAttribute;
/*     */ 
/*     */   
/*     */   private boolean destroyed;
/*     */ 
/*     */   
/* 101 */   private int discardThreshold = 10485760;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HttpPostStandardRequestDecoder(HttpRequest request) {
/* 114 */     this(new DefaultHttpDataFactory(16384L), request, HttpConstants.DEFAULT_CHARSET);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HttpPostStandardRequestDecoder(HttpDataFactory factory, HttpRequest request) {
/* 130 */     this(factory, request, HttpConstants.DEFAULT_CHARSET);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HttpPostStandardRequestDecoder(HttpDataFactory factory, HttpRequest request, Charset charset) {
/* 148 */     this.request = (HttpRequest)ObjectUtil.checkNotNull(request, "request");
/* 149 */     this.charset = (Charset)ObjectUtil.checkNotNull(charset, "charset");
/* 150 */     this.factory = (HttpDataFactory)ObjectUtil.checkNotNull(factory, "factory");
/* 151 */     if (request instanceof HttpContent) {
/*     */ 
/*     */       
/* 154 */       offer((HttpContent)request);
/*     */     } else {
/* 156 */       this.undecodedChunk = Unpooled.buffer();
/* 157 */       parseBody();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void checkDestroyed() {
/* 162 */     if (this.destroyed) {
/* 163 */       throw new IllegalStateException(HttpPostStandardRequestDecoder.class.getSimpleName() + " was destroyed already");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isMultipart() {
/* 175 */     checkDestroyed();
/* 176 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDiscardThreshold(int discardThreshold) {
/* 186 */     this.discardThreshold = ObjectUtil.checkPositiveOrZero(discardThreshold, "discardThreshold");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDiscardThreshold() {
/* 194 */     return this.discardThreshold;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<InterfaceHttpData> getBodyHttpDatas() {
/* 209 */     checkDestroyed();
/*     */     
/* 211 */     if (!this.isLastChunk) {
/* 212 */       throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
/*     */     }
/* 214 */     return this.bodyListHttpData;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<InterfaceHttpData> getBodyHttpDatas(String name) {
/* 230 */     checkDestroyed();
/*     */     
/* 232 */     if (!this.isLastChunk) {
/* 233 */       throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
/*     */     }
/* 235 */     return this.bodyMapHttpData.get(name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InterfaceHttpData getBodyHttpData(String name) {
/* 252 */     checkDestroyed();
/*     */     
/* 254 */     if (!this.isLastChunk) {
/* 255 */       throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
/*     */     }
/* 257 */     List<InterfaceHttpData> list = this.bodyMapHttpData.get(name);
/* 258 */     if (list != null) {
/* 259 */       return list.get(0);
/*     */     }
/* 261 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HttpPostStandardRequestDecoder offer(HttpContent content) {
/* 275 */     checkDestroyed();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 280 */     ByteBuf buf = content.content();
/* 281 */     if (this.undecodedChunk == null) {
/* 282 */       this.undecodedChunk = buf.copy();
/*     */     } else {
/* 284 */       this.undecodedChunk.writeBytes(buf);
/*     */     } 
/* 286 */     if (content instanceof io.netty.handler.codec.http.LastHttpContent) {
/* 287 */       this.isLastChunk = true;
/*     */     }
/* 289 */     parseBody();
/* 290 */     if (this.undecodedChunk != null && this.undecodedChunk.writerIndex() > this.discardThreshold) {
/* 291 */       this.undecodedChunk.discardReadBytes();
/*     */     }
/* 293 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasNext() {
/* 308 */     checkDestroyed();
/*     */     
/* 310 */     if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.EPILOGUE)
/*     */     {
/* 312 */       if (this.bodyListHttpDataRank >= this.bodyListHttpData.size()) {
/* 313 */         throw new HttpPostRequestDecoder.EndOfDataDecoderException();
/*     */       }
/*     */     }
/* 316 */     return (!this.bodyListHttpData.isEmpty() && this.bodyListHttpDataRank < this.bodyListHttpData.size());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InterfaceHttpData next() {
/* 333 */     checkDestroyed();
/*     */     
/* 335 */     if (hasNext()) {
/* 336 */       return this.bodyListHttpData.get(this.bodyListHttpDataRank++);
/*     */     }
/* 338 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public InterfaceHttpData currentPartialHttpData() {
/* 343 */     return this.currentAttribute;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void parseBody() {
/* 354 */     if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE || this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.EPILOGUE) {
/* 355 */       if (this.isLastChunk) {
/* 356 */         this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.EPILOGUE;
/*     */       }
/*     */       return;
/*     */     } 
/* 360 */     parseBodyAttributes();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void addHttpData(InterfaceHttpData data) {
/* 367 */     if (data == null) {
/*     */       return;
/*     */     }
/* 370 */     List<InterfaceHttpData> datas = this.bodyMapHttpData.get(data.getName());
/* 371 */     if (datas == null) {
/* 372 */       datas = new ArrayList<InterfaceHttpData>(1);
/* 373 */       this.bodyMapHttpData.put(data.getName(), datas);
/*     */     } 
/* 375 */     datas.add(data);
/* 376 */     this.bodyListHttpData.add(data);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void parseBodyAttributesStandard() {
/* 388 */     int firstpos = this.undecodedChunk.readerIndex();
/* 389 */     int currentpos = firstpos;
/*     */ 
/*     */     
/* 392 */     if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED) {
/* 393 */       this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
/*     */     }
/* 395 */     boolean contRead = true;
/*     */     try {
/* 397 */       while (this.undecodedChunk.isReadable() && contRead) {
/* 398 */         char read = (char)this.undecodedChunk.readUnsignedByte();
/* 399 */         currentpos++;
/* 400 */         switch (this.currentStatus) {
/*     */           case DISPOSITION:
/* 402 */             if (read == '=') {
/* 403 */               this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.FIELD;
/* 404 */               int equalpos = currentpos - 1;
/* 405 */               String key = decodeAttribute(this.undecodedChunk.toString(firstpos, equalpos - firstpos, this.charset), this.charset);
/*     */               
/* 407 */               this.currentAttribute = this.factory.createAttribute(this.request, key);
/* 408 */               firstpos = currentpos; continue;
/* 409 */             }  if (read == '&') {
/* 410 */               this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
/* 411 */               int ampersandpos = currentpos - 1;
/* 412 */               String key = decodeAttribute(this.undecodedChunk
/* 413 */                   .toString(firstpos, ampersandpos - firstpos, this.charset), this.charset);
/* 414 */               this.currentAttribute = this.factory.createAttribute(this.request, key);
/* 415 */               this.currentAttribute.setValue("");
/* 416 */               addHttpData(this.currentAttribute);
/* 417 */               this.currentAttribute = null;
/* 418 */               firstpos = currentpos;
/* 419 */               contRead = true;
/*     */             } 
/*     */             continue;
/*     */           case FIELD:
/* 423 */             if (read == '&') {
/* 424 */               this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
/* 425 */               int ampersandpos = currentpos - 1;
/* 426 */               setFinalBuffer(this.undecodedChunk.copy(firstpos, ampersandpos - firstpos));
/* 427 */               firstpos = currentpos;
/* 428 */               contRead = true; continue;
/* 429 */             }  if (read == '\r') {
/* 430 */               if (this.undecodedChunk.isReadable()) {
/* 431 */                 read = (char)this.undecodedChunk.readUnsignedByte();
/* 432 */                 currentpos++;
/* 433 */                 if (read == '\n') {
/* 434 */                   this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE;
/* 435 */                   int ampersandpos = currentpos - 2;
/* 436 */                   setFinalBuffer(this.undecodedChunk.copy(firstpos, ampersandpos - firstpos));
/* 437 */                   firstpos = currentpos;
/* 438 */                   contRead = false;
/*     */                   continue;
/*     */                 } 
/* 441 */                 throw new HttpPostRequestDecoder.ErrorDataDecoderException("Bad end of line");
/*     */               } 
/*     */               
/* 444 */               currentpos--; continue;
/*     */             } 
/* 446 */             if (read == '\n') {
/* 447 */               this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE;
/* 448 */               int ampersandpos = currentpos - 1;
/* 449 */               setFinalBuffer(this.undecodedChunk.copy(firstpos, ampersandpos - firstpos));
/* 450 */               firstpos = currentpos;
/* 451 */               contRead = false;
/*     */             } 
/*     */             continue;
/*     */         } 
/*     */         
/* 456 */         contRead = false;
/*     */       } 
/*     */       
/* 459 */       if (this.isLastChunk && this.currentAttribute != null) {
/*     */         
/* 461 */         int ampersandpos = currentpos;
/* 462 */         if (ampersandpos > firstpos) {
/* 463 */           setFinalBuffer(this.undecodedChunk.copy(firstpos, ampersandpos - firstpos));
/* 464 */         } else if (!this.currentAttribute.isCompleted()) {
/* 465 */           setFinalBuffer(Unpooled.EMPTY_BUFFER);
/*     */         } 
/* 467 */         firstpos = currentpos;
/* 468 */         this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.EPILOGUE;
/* 469 */       } else if (contRead && this.currentAttribute != null && this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.FIELD) {
/*     */         
/* 471 */         this.currentAttribute.addContent(this.undecodedChunk.copy(firstpos, currentpos - firstpos), false);
/*     */         
/* 473 */         firstpos = currentpos;
/*     */       } 
/* 475 */       this.undecodedChunk.readerIndex(firstpos);
/* 476 */     } catch (ErrorDataDecoderException e) {
/*     */       
/* 478 */       this.undecodedChunk.readerIndex(firstpos);
/* 479 */       throw e;
/* 480 */     } catch (IOException e) {
/*     */       
/* 482 */       this.undecodedChunk.readerIndex(firstpos);
/* 483 */       throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void parseBodyAttributes() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   4: invokevirtual hasArray : ()Z
/*     */     //   7: ifne -> 15
/*     */     //   10: aload_0
/*     */     //   11: invokespecial parseBodyAttributesStandard : ()V
/*     */     //   14: return
/*     */     //   15: new io/netty/handler/codec/http/multipart/HttpPostBodyUtil$SeekAheadOptimize
/*     */     //   18: dup
/*     */     //   19: aload_0
/*     */     //   20: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   23: invokespecial <init> : (Lio/netty/buffer/ByteBuf;)V
/*     */     //   26: astore_1
/*     */     //   27: aload_0
/*     */     //   28: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   31: invokevirtual readerIndex : ()I
/*     */     //   34: istore_2
/*     */     //   35: iload_2
/*     */     //   36: istore_3
/*     */     //   37: aload_0
/*     */     //   38: getfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   41: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.NOTSTARTED : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   44: if_acmpne -> 54
/*     */     //   47: aload_0
/*     */     //   48: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.DISPOSITION : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   51: putfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   54: iconst_1
/*     */     //   55: istore #6
/*     */     //   57: aload_1
/*     */     //   58: getfield pos : I
/*     */     //   61: aload_1
/*     */     //   62: getfield limit : I
/*     */     //   65: if_icmpge -> 520
/*     */     //   68: aload_1
/*     */     //   69: getfield bytes : [B
/*     */     //   72: aload_1
/*     */     //   73: dup
/*     */     //   74: getfield pos : I
/*     */     //   77: dup_x1
/*     */     //   78: iconst_1
/*     */     //   79: iadd
/*     */     //   80: putfield pos : I
/*     */     //   83: baload
/*     */     //   84: sipush #255
/*     */     //   87: iand
/*     */     //   88: i2c
/*     */     //   89: istore #7
/*     */     //   91: iinc #3, 1
/*     */     //   94: getstatic io/netty/handler/codec/http/multipart/HttpPostStandardRequestDecoder$1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus : [I
/*     */     //   97: aload_0
/*     */     //   98: getfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   101: invokevirtual ordinal : ()I
/*     */     //   104: iaload
/*     */     //   105: lookupswitch default -> 506, 1 -> 132, 2 -> 295
/*     */     //   132: iload #7
/*     */     //   134: bipush #61
/*     */     //   136: if_icmpne -> 200
/*     */     //   139: aload_0
/*     */     //   140: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.FIELD : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   143: putfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   146: iload_3
/*     */     //   147: iconst_1
/*     */     //   148: isub
/*     */     //   149: istore #4
/*     */     //   151: aload_0
/*     */     //   152: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   155: iload_2
/*     */     //   156: iload #4
/*     */     //   158: iload_2
/*     */     //   159: isub
/*     */     //   160: aload_0
/*     */     //   161: getfield charset : Ljava/nio/charset/Charset;
/*     */     //   164: invokevirtual toString : (IILjava/nio/charset/Charset;)Ljava/lang/String;
/*     */     //   167: aload_0
/*     */     //   168: getfield charset : Ljava/nio/charset/Charset;
/*     */     //   171: invokestatic decodeAttribute : (Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
/*     */     //   174: astore #8
/*     */     //   176: aload_0
/*     */     //   177: aload_0
/*     */     //   178: getfield factory : Lio/netty/handler/codec/http/multipart/HttpDataFactory;
/*     */     //   181: aload_0
/*     */     //   182: getfield request : Lio/netty/handler/codec/http/HttpRequest;
/*     */     //   185: aload #8
/*     */     //   187: invokeinterface createAttribute : (Lio/netty/handler/codec/http/HttpRequest;Ljava/lang/String;)Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   192: putfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   195: iload_3
/*     */     //   196: istore_2
/*     */     //   197: goto -> 517
/*     */     //   200: iload #7
/*     */     //   202: bipush #38
/*     */     //   204: if_icmpne -> 517
/*     */     //   207: aload_0
/*     */     //   208: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.DISPOSITION : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   211: putfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   214: iload_3
/*     */     //   215: iconst_1
/*     */     //   216: isub
/*     */     //   217: istore #5
/*     */     //   219: aload_0
/*     */     //   220: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   223: iload_2
/*     */     //   224: iload #5
/*     */     //   226: iload_2
/*     */     //   227: isub
/*     */     //   228: aload_0
/*     */     //   229: getfield charset : Ljava/nio/charset/Charset;
/*     */     //   232: invokevirtual toString : (IILjava/nio/charset/Charset;)Ljava/lang/String;
/*     */     //   235: aload_0
/*     */     //   236: getfield charset : Ljava/nio/charset/Charset;
/*     */     //   239: invokestatic decodeAttribute : (Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
/*     */     //   242: astore #8
/*     */     //   244: aload_0
/*     */     //   245: aload_0
/*     */     //   246: getfield factory : Lio/netty/handler/codec/http/multipart/HttpDataFactory;
/*     */     //   249: aload_0
/*     */     //   250: getfield request : Lio/netty/handler/codec/http/HttpRequest;
/*     */     //   253: aload #8
/*     */     //   255: invokeinterface createAttribute : (Lio/netty/handler/codec/http/HttpRequest;Ljava/lang/String;)Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   260: putfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   263: aload_0
/*     */     //   264: getfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   267: ldc ''
/*     */     //   269: invokeinterface setValue : (Ljava/lang/String;)V
/*     */     //   274: aload_0
/*     */     //   275: aload_0
/*     */     //   276: getfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   279: invokevirtual addHttpData : (Lio/netty/handler/codec/http/multipart/InterfaceHttpData;)V
/*     */     //   282: aload_0
/*     */     //   283: aconst_null
/*     */     //   284: putfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   287: iload_3
/*     */     //   288: istore_2
/*     */     //   289: iconst_1
/*     */     //   290: istore #6
/*     */     //   292: goto -> 517
/*     */     //   295: iload #7
/*     */     //   297: bipush #38
/*     */     //   299: if_icmpne -> 338
/*     */     //   302: aload_0
/*     */     //   303: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.DISPOSITION : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   306: putfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   309: iload_3
/*     */     //   310: iconst_1
/*     */     //   311: isub
/*     */     //   312: istore #5
/*     */     //   314: aload_0
/*     */     //   315: aload_0
/*     */     //   316: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   319: iload_2
/*     */     //   320: iload #5
/*     */     //   322: iload_2
/*     */     //   323: isub
/*     */     //   324: invokevirtual copy : (II)Lio/netty/buffer/ByteBuf;
/*     */     //   327: invokespecial setFinalBuffer : (Lio/netty/buffer/ByteBuf;)V
/*     */     //   330: iload_3
/*     */     //   331: istore_2
/*     */     //   332: iconst_1
/*     */     //   333: istore #6
/*     */     //   335: goto -> 517
/*     */     //   338: iload #7
/*     */     //   340: bipush #13
/*     */     //   342: if_icmpne -> 458
/*     */     //   345: aload_1
/*     */     //   346: getfield pos : I
/*     */     //   349: aload_1
/*     */     //   350: getfield limit : I
/*     */     //   353: if_icmpge -> 445
/*     */     //   356: aload_1
/*     */     //   357: getfield bytes : [B
/*     */     //   360: aload_1
/*     */     //   361: dup
/*     */     //   362: getfield pos : I
/*     */     //   365: dup_x1
/*     */     //   366: iconst_1
/*     */     //   367: iadd
/*     */     //   368: putfield pos : I
/*     */     //   371: baload
/*     */     //   372: sipush #255
/*     */     //   375: iand
/*     */     //   376: i2c
/*     */     //   377: istore #7
/*     */     //   379: iinc #3, 1
/*     */     //   382: iload #7
/*     */     //   384: bipush #10
/*     */     //   386: if_icmpne -> 430
/*     */     //   389: aload_0
/*     */     //   390: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.PREEPILOGUE : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   393: putfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   396: iload_3
/*     */     //   397: iconst_2
/*     */     //   398: isub
/*     */     //   399: istore #5
/*     */     //   401: aload_1
/*     */     //   402: iconst_0
/*     */     //   403: invokevirtual setReadPosition : (I)V
/*     */     //   406: aload_0
/*     */     //   407: aload_0
/*     */     //   408: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   411: iload_2
/*     */     //   412: iload #5
/*     */     //   414: iload_2
/*     */     //   415: isub
/*     */     //   416: invokevirtual copy : (II)Lio/netty/buffer/ByteBuf;
/*     */     //   419: invokespecial setFinalBuffer : (Lio/netty/buffer/ByteBuf;)V
/*     */     //   422: iload_3
/*     */     //   423: istore_2
/*     */     //   424: iconst_0
/*     */     //   425: istore #6
/*     */     //   427: goto -> 520
/*     */     //   430: aload_1
/*     */     //   431: iconst_0
/*     */     //   432: invokevirtual setReadPosition : (I)V
/*     */     //   435: new io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$ErrorDataDecoderException
/*     */     //   438: dup
/*     */     //   439: ldc 'Bad end of line'
/*     */     //   441: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   444: athrow
/*     */     //   445: aload_1
/*     */     //   446: getfield limit : I
/*     */     //   449: ifle -> 517
/*     */     //   452: iinc #3, -1
/*     */     //   455: goto -> 517
/*     */     //   458: iload #7
/*     */     //   460: bipush #10
/*     */     //   462: if_icmpne -> 517
/*     */     //   465: aload_0
/*     */     //   466: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.PREEPILOGUE : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   469: putfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   472: iload_3
/*     */     //   473: iconst_1
/*     */     //   474: isub
/*     */     //   475: istore #5
/*     */     //   477: aload_1
/*     */     //   478: iconst_0
/*     */     //   479: invokevirtual setReadPosition : (I)V
/*     */     //   482: aload_0
/*     */     //   483: aload_0
/*     */     //   484: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   487: iload_2
/*     */     //   488: iload #5
/*     */     //   490: iload_2
/*     */     //   491: isub
/*     */     //   492: invokevirtual copy : (II)Lio/netty/buffer/ByteBuf;
/*     */     //   495: invokespecial setFinalBuffer : (Lio/netty/buffer/ByteBuf;)V
/*     */     //   498: iload_3
/*     */     //   499: istore_2
/*     */     //   500: iconst_0
/*     */     //   501: istore #6
/*     */     //   503: goto -> 520
/*     */     //   506: aload_1
/*     */     //   507: iconst_0
/*     */     //   508: invokevirtual setReadPosition : (I)V
/*     */     //   511: iconst_0
/*     */     //   512: istore #6
/*     */     //   514: goto -> 520
/*     */     //   517: goto -> 57
/*     */     //   520: aload_0
/*     */     //   521: getfield isLastChunk : Z
/*     */     //   524: ifeq -> 593
/*     */     //   527: aload_0
/*     */     //   528: getfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   531: ifnull -> 593
/*     */     //   534: iload_3
/*     */     //   535: istore #5
/*     */     //   537: iload #5
/*     */     //   539: iload_2
/*     */     //   540: if_icmple -> 562
/*     */     //   543: aload_0
/*     */     //   544: aload_0
/*     */     //   545: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   548: iload_2
/*     */     //   549: iload #5
/*     */     //   551: iload_2
/*     */     //   552: isub
/*     */     //   553: invokevirtual copy : (II)Lio/netty/buffer/ByteBuf;
/*     */     //   556: invokespecial setFinalBuffer : (Lio/netty/buffer/ByteBuf;)V
/*     */     //   559: goto -> 581
/*     */     //   562: aload_0
/*     */     //   563: getfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   566: invokeinterface isCompleted : ()Z
/*     */     //   571: ifne -> 581
/*     */     //   574: aload_0
/*     */     //   575: getstatic io/netty/buffer/Unpooled.EMPTY_BUFFER : Lio/netty/buffer/ByteBuf;
/*     */     //   578: invokespecial setFinalBuffer : (Lio/netty/buffer/ByteBuf;)V
/*     */     //   581: iload_3
/*     */     //   582: istore_2
/*     */     //   583: aload_0
/*     */     //   584: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.EPILOGUE : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   587: putfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   590: goto -> 638
/*     */     //   593: iload #6
/*     */     //   595: ifeq -> 638
/*     */     //   598: aload_0
/*     */     //   599: getfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   602: ifnull -> 638
/*     */     //   605: aload_0
/*     */     //   606: getfield currentStatus : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   609: getstatic io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus.FIELD : Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$MultiPartStatus;
/*     */     //   612: if_acmpne -> 638
/*     */     //   615: aload_0
/*     */     //   616: getfield currentAttribute : Lio/netty/handler/codec/http/multipart/Attribute;
/*     */     //   619: aload_0
/*     */     //   620: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   623: iload_2
/*     */     //   624: iload_3
/*     */     //   625: iload_2
/*     */     //   626: isub
/*     */     //   627: invokevirtual copy : (II)Lio/netty/buffer/ByteBuf;
/*     */     //   630: iconst_0
/*     */     //   631: invokeinterface addContent : (Lio/netty/buffer/ByteBuf;Z)V
/*     */     //   636: iload_3
/*     */     //   637: istore_2
/*     */     //   638: aload_0
/*     */     //   639: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   642: iload_2
/*     */     //   643: invokevirtual readerIndex : (I)Lio/netty/buffer/ByteBuf;
/*     */     //   646: pop
/*     */     //   647: goto -> 706
/*     */     //   650: astore #7
/*     */     //   652: aload_0
/*     */     //   653: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   656: iload_2
/*     */     //   657: invokevirtual readerIndex : (I)Lio/netty/buffer/ByteBuf;
/*     */     //   660: pop
/*     */     //   661: aload #7
/*     */     //   663: athrow
/*     */     //   664: astore #7
/*     */     //   666: aload_0
/*     */     //   667: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   670: iload_2
/*     */     //   671: invokevirtual readerIndex : (I)Lio/netty/buffer/ByteBuf;
/*     */     //   674: pop
/*     */     //   675: new io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$ErrorDataDecoderException
/*     */     //   678: dup
/*     */     //   679: aload #7
/*     */     //   681: invokespecial <init> : (Ljava/lang/Throwable;)V
/*     */     //   684: athrow
/*     */     //   685: astore #7
/*     */     //   687: aload_0
/*     */     //   688: getfield undecodedChunk : Lio/netty/buffer/ByteBuf;
/*     */     //   691: iload_2
/*     */     //   692: invokevirtual readerIndex : (I)Lio/netty/buffer/ByteBuf;
/*     */     //   695: pop
/*     */     //   696: new io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$ErrorDataDecoderException
/*     */     //   699: dup
/*     */     //   700: aload #7
/*     */     //   702: invokespecial <init> : (Ljava/lang/Throwable;)V
/*     */     //   705: athrow
/*     */     //   706: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #496	-> 0
/*     */     //   #497	-> 10
/*     */     //   #498	-> 14
/*     */     //   #500	-> 15
/*     */     //   #501	-> 27
/*     */     //   #502	-> 35
/*     */     //   #505	-> 37
/*     */     //   #506	-> 47
/*     */     //   #508	-> 54
/*     */     //   #510	-> 57
/*     */     //   #511	-> 68
/*     */     //   #512	-> 91
/*     */     //   #513	-> 94
/*     */     //   #515	-> 132
/*     */     //   #516	-> 139
/*     */     //   #517	-> 146
/*     */     //   #518	-> 151
/*     */     //   #520	-> 176
/*     */     //   #521	-> 195
/*     */     //   #522	-> 197
/*     */     //   #523	-> 207
/*     */     //   #524	-> 214
/*     */     //   #525	-> 219
/*     */     //   #526	-> 232
/*     */     //   #525	-> 239
/*     */     //   #527	-> 244
/*     */     //   #528	-> 263
/*     */     //   #529	-> 274
/*     */     //   #530	-> 282
/*     */     //   #531	-> 287
/*     */     //   #532	-> 289
/*     */     //   #533	-> 292
/*     */     //   #536	-> 295
/*     */     //   #537	-> 302
/*     */     //   #538	-> 309
/*     */     //   #539	-> 314
/*     */     //   #540	-> 330
/*     */     //   #541	-> 332
/*     */     //   #542	-> 338
/*     */     //   #543	-> 345
/*     */     //   #544	-> 356
/*     */     //   #545	-> 379
/*     */     //   #546	-> 382
/*     */     //   #547	-> 389
/*     */     //   #548	-> 396
/*     */     //   #549	-> 401
/*     */     //   #550	-> 406
/*     */     //   #551	-> 422
/*     */     //   #552	-> 424
/*     */     //   #553	-> 427
/*     */     //   #556	-> 430
/*     */     //   #557	-> 435
/*     */     //   #560	-> 445
/*     */     //   #561	-> 452
/*     */     //   #564	-> 458
/*     */     //   #565	-> 465
/*     */     //   #566	-> 472
/*     */     //   #567	-> 477
/*     */     //   #568	-> 482
/*     */     //   #569	-> 498
/*     */     //   #570	-> 500
/*     */     //   #571	-> 503
/*     */     //   #576	-> 506
/*     */     //   #577	-> 511
/*     */     //   #578	-> 514
/*     */     //   #580	-> 517
/*     */     //   #581	-> 520
/*     */     //   #583	-> 534
/*     */     //   #584	-> 537
/*     */     //   #585	-> 543
/*     */     //   #586	-> 562
/*     */     //   #587	-> 574
/*     */     //   #589	-> 581
/*     */     //   #590	-> 583
/*     */     //   #591	-> 593
/*     */     //   #593	-> 615
/*     */     //   #595	-> 636
/*     */     //   #597	-> 638
/*     */     //   #610	-> 647
/*     */     //   #598	-> 650
/*     */     //   #600	-> 652
/*     */     //   #601	-> 661
/*     */     //   #602	-> 664
/*     */     //   #604	-> 666
/*     */     //   #605	-> 675
/*     */     //   #606	-> 685
/*     */     //   #608	-> 687
/*     */     //   #609	-> 696
/*     */     //   #611	-> 706
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   176	21	8	key	Ljava/lang/String;
/*     */     //   151	49	4	equalpos	I
/*     */     //   244	48	8	key	Ljava/lang/String;
/*     */     //   219	76	5	ampersandpos	I
/*     */     //   314	24	5	ampersandpos	I
/*     */     //   401	29	5	ampersandpos	I
/*     */     //   477	29	5	ampersandpos	I
/*     */     //   91	426	7	read	C
/*     */     //   537	56	5	ampersandpos	I
/*     */     //   652	12	7	e	Lio/netty/handler/codec/http/multipart/HttpPostRequestDecoder$ErrorDataDecoderException;
/*     */     //   666	19	7	e	Ljava/io/IOException;
/*     */     //   687	19	7	e	Ljava/lang/IllegalArgumentException;
/*     */     //   0	707	0	this	Lio/netty/handler/codec/http/multipart/HttpPostStandardRequestDecoder;
/*     */     //   27	680	1	sao	Lio/netty/handler/codec/http/multipart/HttpPostBodyUtil$SeekAheadOptimize;
/*     */     //   35	672	2	firstpos	I
/*     */     //   37	670	3	currentpos	I
/*     */     //   57	650	6	contRead	Z
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   57	647	650	io/netty/handler/codec/http/multipart/HttpPostRequestDecoder$ErrorDataDecoderException
/*     */     //   57	647	664	java/io/IOException
/*     */     //   57	647	685	java/lang/IllegalArgumentException
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setFinalBuffer(ByteBuf buffer) throws IOException {
/* 614 */     this.currentAttribute.addContent(buffer, true);
/* 615 */     String value = decodeAttribute(this.currentAttribute.getByteBuf().toString(this.charset), this.charset);
/* 616 */     this.currentAttribute.setValue(value);
/* 617 */     addHttpData(this.currentAttribute);
/* 618 */     this.currentAttribute = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String decodeAttribute(String s, Charset charset) {
/*     */     try {
/* 628 */       return QueryStringDecoder.decodeComponent(s, charset);
/* 629 */     } catch (IllegalArgumentException e) {
/* 630 */       throw new HttpPostRequestDecoder.ErrorDataDecoderException("Bad string: '" + s + '\'', e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void destroy() {
/* 641 */     cleanFiles();
/*     */     
/* 643 */     this.destroyed = true;
/*     */     
/* 645 */     if (this.undecodedChunk != null && this.undecodedChunk.refCnt() > 0) {
/* 646 */       this.undecodedChunk.release();
/* 647 */       this.undecodedChunk = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cleanFiles() {
/* 656 */     checkDestroyed();
/*     */     
/* 658 */     this.factory.cleanRequestHttpData(this.request);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeHttpDataFromClean(InterfaceHttpData data) {
/* 666 */     checkDestroyed();
/*     */     
/* 668 */     this.factory.removeHttpDataFromClean(this.request, data);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\io\netty\handler\codec\http\multipart\HttpPostStandardRequestDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */