/*   */ import java.io.File;
/*   */ import java.io.FileNotFoundException;
/*   */ 
/*   */ public class un
/*   */   extends FileNotFoundException
/*   */ {
/*   */   public un(File ☃, String str) {
/* 8 */     super(String.format("'%s' in ResourcePack '%s'", new Object[] { str, ☃ }));
/*   */   }
/*   */ }


/* Location:              F:\dw\server.jar\\un.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */