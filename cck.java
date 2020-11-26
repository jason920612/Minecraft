/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.io.IOException;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cck
/*    */ {
/*    */   private final Map<bod, cby> a;
/*    */   @Nullable
/*    */   private final ccc b;
/*    */   
/*    */   public cck(@Nullable ccc ☃) {
/* 19 */     this.b = ☃;
/* 20 */     ImmutableMap.Builder<bod, cby> builder = ImmutableMap.builder();
/* 21 */     for (bod bod : bod.b()) {
/* 22 */       cby cby = new cby(bod, ☃);
/* 23 */       builder.put(bod, cby);
/* 24 */       cby.a();
/*    */     } 
/* 26 */     this.a = (Map<bod, cby>)builder.build();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public <T extends cbo> T a(bod ☃, Function<String, T> function, String str) {
/* 31 */     return ((cby)this.a.get(☃)).a(function, str);
/*    */   }
/*    */   
/*    */   public void a(bod ☃, String str, cbo cbo1) {
/* 35 */     ((cby)this.a.get(☃)).a(str, cbo1);
/*    */   }
/*    */   
/*    */   public void a() {
/* 39 */     this.a.values().forEach(cby::b);
/*    */   }
/*    */   
/*    */   public int a(bod ☃, String str) {
/* 43 */     return ((cby)this.a.get(☃)).a(str);
/*    */   }
/*    */   
/*    */   public gy a(String ☃, int i) throws IOException {
/* 47 */     return cby.a(this.b, bod.a, ☃, i);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */