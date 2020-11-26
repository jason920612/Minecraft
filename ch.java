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
/*    */ public class ch
/*    */   implements ArgumentType<gy>
/*    */ {
/* 16 */   private static final Collection<String> b = Arrays.asList(new String[] { "{}", "{foo=bar}" }); static {
/* 17 */     a = new DynamicCommandExceptionType(☃ -> new ir("argument.nbt.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static ch a() {
/* 23 */     return new ch();
/*    */   }
/*    */   
/*    */   public static <S> gy a(CommandContext<S> ☃, String str) {
/* 27 */     return (gy)☃.getArgument(str, gy.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public gy a(StringReader ☃) throws CommandSyntaxException {
/* 32 */     return (new hp(☃)).f();
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 37 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */