/*    */ import com.google.common.collect.Lists;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface aqs
/*    */ {
/*    */   void a(@Nullable avk paramavk);
/*    */   
/*    */   @Nullable
/*    */   avk i();
/*    */   
/*    */   default void d(aog ☃) {
/* 19 */     avk avk = i();
/* 20 */     if (avk != null && !avk.c()) {
/* 21 */       ☃.a(Lists.newArrayList((Object[])new avk[] { avk }));
/* 22 */       a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default boolean a(axy ☃, tf tf1, @Nullable avk avk1) {
/* 27 */     if (avk1 != null && (
/* 28 */       avk1.c() || !☃.X().b("doLimitedCrafting") || tf1.B().b(avk1))) {
/* 29 */       a(avk1);
/* 30 */       return true;
/*    */     } 
/*    */ 
/*    */     
/* 34 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aqs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */