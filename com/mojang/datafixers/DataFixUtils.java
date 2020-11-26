/*    */ package com.mojang.datafixers;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DataFixUtils
/*    */ {
/*    */   public static int smallestEncompassingPowerOfTwo(int input) {
/* 16 */     int result = input - 1;
/* 17 */     result |= result >> 1;
/* 18 */     result |= result >> 2;
/* 19 */     result |= result >> 4;
/* 20 */     result |= result >> 8;
/* 21 */     result |= result >> 16;
/* 22 */     return result + 1;
/*    */   }
/*    */ 
/*    */   
/*    */   private static boolean isPowerOfTwo(int input) {
/* 27 */     return (input != 0 && (input & input - 1) == 0);
/*    */   }
/*    */ 
/*    */   
/* 31 */   private static final int[] MULTIPLY_DE_BRUIJN_BIT_POSITION = new int[] { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
/*    */ 
/*    */ 
/*    */   
/*    */   public static int ceillog2(int input) {
/* 36 */     input = isPowerOfTwo(input) ? input : smallestEncompassingPowerOfTwo(input);
/* 37 */     return MULTIPLY_DE_BRUIJN_BIT_POSITION[(int)(input * 125613361L >> 27L) & 0x1F];
/*    */   }
/*    */   
/*    */   public static <T> T make(Supplier<T> factory) {
/* 41 */     return factory.get();
/*    */   }
/*    */   
/*    */   public static <T> T make(T t, Consumer<T> consumer) {
/* 45 */     consumer.accept(t);
/* 46 */     return t;
/*    */   }
/*    */   
/*    */   public static <U> U orElse(Optional<? extends U> optional, U other) {
/* 50 */     if (optional.isPresent()) {
/* 51 */       return optional.get();
/*    */     }
/* 53 */     return other;
/*    */   }
/*    */   
/*    */   public static <U> U orElseGet(Optional<? extends U> optional, Supplier<? extends U> other) {
/* 57 */     if (optional.isPresent()) {
/* 58 */       return optional.get();
/*    */     }
/* 60 */     return other.get();
/*    */   }
/*    */   
/*    */   public static <U> Optional<U> or(Optional<? extends U> optional, Supplier<? extends Optional<? extends U>> other) {
/* 64 */     if (optional.isPresent()) {
/* 65 */       return optional.map(u -> u);
/*    */     }
/* 67 */     return ((Optional)other.get()).map(u -> u);
/*    */   }
/*    */   
/*    */   public static byte[] toArray(ByteBuffer input) {
/*    */     byte[] bytes;
/* 72 */     if (input.hasArray()) {
/* 73 */       bytes = input.array();
/*    */     } else {
/* 75 */       bytes = new byte[input.capacity()];
/* 76 */       input.get(bytes, 0, bytes.length);
/*    */     } 
/* 78 */     return bytes;
/*    */   }
/*    */   
/*    */   public static int makeKey(int version) {
/* 82 */     return makeKey(version, 0);
/*    */   }
/*    */   
/*    */   public static int makeKey(int version, int subVersion) {
/* 86 */     return version * 10 + subVersion;
/*    */   }
/*    */   
/*    */   public static int getVersion(int key) {
/* 90 */     return key / 10;
/*    */   }
/*    */   
/*    */   public static int getSubVersion(int key) {
/* 94 */     return key % 10;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\DataFixUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */