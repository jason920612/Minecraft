/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cn<T extends ba<?>>
/*    */   extends ArgumentType<T>
/*    */ {
/*    */   public static class b
/*    */     implements cn<ba.d>
/*    */   {
/* 18 */     private static final Collection<String> a = Arrays.asList(new String[] { "0..5", "0", "-5", "-100..", "..100" });
/*    */     
/*    */     public static ba.d a(CommandContext<bu> ☃, String str) {
/* 21 */       return (ba.d)☃.getArgument(str, ba.d.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public ba.d a(StringReader ☃) throws CommandSyntaxException {
/* 26 */       return ba.d.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public Collection<String> getExamples() {
/* 31 */       return a;
/*    */     }
/*    */     
/*    */     public static class a
/*    */       extends cn.c<b> {
/*    */       public cn.b a(hy ☃) {
/* 37 */         return new cn.b();
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static class a implements cn<ba.c> {
/* 43 */     private static final Collection<String> a = Arrays.asList(new String[] { "0..5.2", "0", "-5.4", "-100.76..", "..100" });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public ba.c a(StringReader ☃) throws CommandSyntaxException {
/* 51 */       return ba.c.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public Collection<String> getExamples() {
/* 56 */       return a;
/*    */     }
/*    */     
/*    */     public static class a
/*    */       extends cn.c<a> {
/*    */       public cn.a a(hy ☃) {
/* 62 */         return new cn.a();
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   static b a() {
/* 68 */     return new b();
/*    */   }
/*    */   
/*    */   public static abstract class c<T extends cn<?>> implements dy<T> {
/*    */     public void a(T ☃, hy hy1) {}
/*    */     
/*    */     public void a(T ☃, JsonObject jsonObject) {}
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */