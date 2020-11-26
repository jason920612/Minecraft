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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */   implements cn<ba.d>
/*    */ {
/* 18 */   private static final Collection<String> a = Arrays.asList(new String[] { "0..5", "0", "-5", "-100..", "..100" });
/*    */   
/*    */   public static ba.d a(CommandContext<bu> ☃, String str) {
/* 21 */     return (ba.d)☃.getArgument(str, ba.d.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public ba.d a(StringReader ☃) throws CommandSyntaxException {
/* 26 */     return ba.d.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 31 */     return a;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends cn.c<b> {
/*    */     public cn.b a(hy ☃) {
/* 37 */       return new cn.b();
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cn$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */