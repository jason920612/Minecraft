/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.security.Key;
/*     */ import java.security.KeyFactory;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.PublicKey;
/*     */ import java.security.spec.EncodedKeySpec;
/*     */ import java.security.spec.InvalidKeySpecException;
/*     */ import java.security.spec.X509EncodedKeySpec;
/*     */ import javax.crypto.BadPaddingException;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.IllegalBlockSizeException;
/*     */ import javax.crypto.NoSuchPaddingException;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ import javax.crypto.spec.SecretKeySpec;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class xh
/*     */ {
/*  30 */   private static final Logger a = LogManager.getLogger();
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
/*     */   public static KeyPair b() {
/*     */     try {
/*  51 */       KeyPairGenerator ☃ = KeyPairGenerator.getInstance("RSA");
/*  52 */       ☃.initialize(1024);
/*     */       
/*  54 */       return ☃.generateKeyPair();
/*  55 */     } catch (NoSuchAlgorithmException ☃) {
/*  56 */       ☃.printStackTrace();
/*     */       
/*  58 */       a.error("Key pair generation failed!");
/*  59 */       return null;
/*     */     } 
/*     */   }
/*     */   public static byte[] a(String ☃, PublicKey publicKey, SecretKey secretKey) {
/*     */     try {
/*  64 */       return a("SHA-1", new byte[][] { ☃
/*     */             
/*  66 */             .getBytes("ISO_8859_1"), secretKey
/*  67 */             .getEncoded(), publicKey
/*  68 */             .getEncoded() });
/*     */     }
/*  70 */     catch (UnsupportedEncodingException unsupportedEncodingException) {
/*  71 */       unsupportedEncodingException.printStackTrace();
/*     */ 
/*     */       
/*  74 */       return null;
/*     */     } 
/*     */   }
/*     */   private static byte[] a(String ☃, byte[]... arrayOfByte) {
/*     */     try {
/*  79 */       MessageDigest messageDigest = MessageDigest.getInstance(☃);
/*  80 */       for (byte[] arrayOfByte1 : arrayOfByte) {
/*  81 */         messageDigest.update(arrayOfByte1);
/*     */       }
/*  83 */       return messageDigest.digest();
/*  84 */     } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
/*  85 */       noSuchAlgorithmException.printStackTrace();
/*     */ 
/*     */       
/*  88 */       return null;
/*     */     } 
/*     */   }
/*     */   public static PublicKey a(byte[] ☃) {
/*     */     
/*  93 */     try { EncodedKeySpec encodedKeySpec = new X509EncodedKeySpec(☃);
/*  94 */       KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*  95 */       return keyFactory.generatePublic(encodedKeySpec); }
/*  96 */     catch (NoSuchAlgorithmException noSuchAlgorithmException) {  }
/*  97 */     catch (InvalidKeySpecException invalidKeySpecException) {}
/*     */     
/*  99 */     a.error("Public key reconstitute failed!");
/* 100 */     return null;
/*     */   }
/*     */   
/*     */   public static SecretKey a(PrivateKey ☃, byte[] arrayOfByte) {
/* 104 */     return new SecretKeySpec(b(☃, arrayOfByte), "AES");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static byte[] b(Key ☃, byte[] arrayOfByte) {
/* 112 */     return a(2, ☃, arrayOfByte);
/*     */   }
/*     */   
/*     */   private static byte[] a(int ☃, Key key, byte[] arrayOfByte) {
/*     */     try {
/* 117 */       return a(☃, key.getAlgorithm(), key).doFinal(arrayOfByte);
/* 118 */     } catch (IllegalBlockSizeException illegalBlockSizeException) {
/* 119 */       illegalBlockSizeException.printStackTrace();
/* 120 */     } catch (BadPaddingException badPaddingException) {
/* 121 */       badPaddingException.printStackTrace();
/*     */     } 
/* 123 */     a.error("Cipher data failed!");
/* 124 */     return null;
/*     */   }
/*     */   
/*     */   private static Cipher a(int ☃, String str, Key key) {
/*     */     try {
/* 129 */       Cipher cipher = Cipher.getInstance(str);
/* 130 */       cipher.init(☃, key);
/* 131 */       return cipher;
/* 132 */     } catch (InvalidKeyException invalidKeyException) {
/* 133 */       invalidKeyException.printStackTrace();
/* 134 */     } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
/* 135 */       noSuchAlgorithmException.printStackTrace();
/* 136 */     } catch (NoSuchPaddingException noSuchPaddingException) {
/* 137 */       noSuchPaddingException.printStackTrace();
/*     */     } 
/* 139 */     a.error("Cipher creation failed!");
/* 140 */     return null;
/*     */   }
/*     */   
/*     */   public static Cipher a(int ☃, Key key) {
/*     */     try {
/* 145 */       Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
/* 146 */       cipher.init(☃, key, new IvParameterSpec(key.getEncoded()));
/* 147 */       return cipher;
/* 148 */     } catch (GeneralSecurityException generalSecurityException) {
/* 149 */       throw new RuntimeException(generalSecurityException);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\xh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */