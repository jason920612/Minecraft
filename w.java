/*    */ import java.util.Collection;
/*    */ 
/*    */ public interface w
/*    */ {
/*    */   static {
/*  6 */     AND = (☃ -> {
/*    */         String[][] arrayOfString = new String[☃.size()][];
/*    */         int i = 0;
/*    */         for (String str : ☃) {
/*    */           (new String[1])[0] = str;
/*    */           arrayOfString[i++] = new String[1];
/*    */         } 
/*    */         return arrayOfString;
/*    */       });
/* 15 */     OR = (☃ -> new String[][] { (String[])☃.toArray((Object[])new String[0]) });
/*    */   }
/*    */   
/*    */   public static final w AND;
/*    */   public static final w OR;
/*    */   
/*    */   String[][] createRequirements(Collection<String> paramCollection);
/*    */ }


/* Location:              F:\dw\server.jar!\w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */