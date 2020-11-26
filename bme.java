/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bme
/*    */   extends bmh<eq>
/*    */ {
/*    */   protected bme(String ☃, Collection<eq> collection) {
/* 14 */     super(☃, eq.class, collection);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static bme a(String ☃, Predicate<eq> predicate) {
/* 22 */     return a(☃, (Collection<eq>)Arrays.<eq>stream(eq.values()).filter(predicate).collect(Collectors.toList()));
/*    */   }
/*    */   
/*    */   public static bme a(String ☃, eq... arrayOfEq) {
/* 26 */     return a(☃, Lists.newArrayList((Object[])arrayOfEq));
/*    */   }
/*    */   
/*    */   public static bme a(String ☃, Collection<eq> collection) {
/* 30 */     return new bme(☃, collection);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */