/*   */ import com.google.common.hash.HashFunction;
/*   */ import com.google.common.hash.Hashing;
/*   */ import java.io.IOException;
/*   */ 
/*   */ 
/*   */ 
/*   */ public interface fq
/*   */ {
/* 9 */   public static final HashFunction a = Hashing.sha1();
/*   */   
/*   */   void a(fr paramfr) throws IOException;
/*   */   
/*   */   String a();
/*   */ }


/* Location:              F:\dw\server.jar!\fq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */