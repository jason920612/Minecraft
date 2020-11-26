/*    */ import com.google.gson.JsonParseException;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class by
/*    */   implements ArgumentType<ij>
/*    */ {
/* 17 */   private static final Collection<String> b = Arrays.asList(new String[] { "\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]" }); static {
/* 18 */     a = new DynamicCommandExceptionType(☃ -> new ir("argument.component.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static ij a(CommandContext<bu> ☃, String str) {
/* 24 */     return (ij)☃.getArgument(str, ij.class);
/*    */   }
/*    */   
/*    */   public static by a() {
/* 28 */     return new by();
/*    */   }
/*    */ 
/*    */   
/*    */   public ij a(StringReader ☃) throws CommandSyntaxException {
/*    */     try {
/* 34 */       ij ij = ij.a.a(☃);
/* 35 */       if (ij == null) {
/* 36 */         throw a.createWithContext(☃, "empty");
/*    */       }
/* 38 */       return ij;
/* 39 */     } catch (JsonParseException jsonParseException) {
/* 40 */       String str = (jsonParseException.getCause() != null) ? jsonParseException.getCause().getMessage() : jsonParseException.getMessage();
/* 41 */       throw a.createWithContext(☃, str);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 47 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\by.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */