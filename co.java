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
/*    */ 
/*    */ public class co
/*    */   implements ArgumentType<pc>
/*    */ {
/*    */   public static final DynamicCommandExceptionType a;
/* 18 */   private static final Collection<String> d = Arrays.asList(new String[] { "foo", "foo:bar", "012" }); static {
/* 19 */     a = new DynamicCommandExceptionType(☃ -> new ir("argument.id.unknown", new Object[] { ☃ }));
/* 20 */     b = new DynamicCommandExceptionType(☃ -> new ir("advancement.advancementNotFound", new Object[] { ☃ }));
/* 21 */     c = new DynamicCommandExceptionType(☃ -> new ir("recipe.notFound", new Object[] { ☃ }));
/*    */   }
/*    */   public static final DynamicCommandExceptionType b;
/*    */   public static final DynamicCommandExceptionType c;
/*    */   
/*    */   public static co a() {
/* 27 */     return new co();
/*    */   }
/*    */   
/*    */   public static l a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 31 */     pc pc = (pc)☃.getArgument(str, pc.class);
/* 32 */     l l = ((bu)☃.getSource()).j().aA().a(pc);
/* 33 */     if (l == null) {
/* 34 */       throw b.create(pc);
/*    */     }
/* 36 */     return l;
/*    */   }
/*    */   
/*    */   public static avk b(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 40 */     pc pc = (pc)☃.getArgument(str, pc.class);
/* 41 */     avk avk = ((bu)☃.getSource()).j().aK().a(pc);
/* 42 */     if (avk == null) {
/* 43 */       throw c.create(pc);
/*    */     }
/* 45 */     return avk;
/*    */   }
/*    */   
/*    */   public static pc c(CommandContext<bu> ☃, String str) {
/* 49 */     return (pc)☃.getArgument(str, pc.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public pc a(StringReader ☃) throws CommandSyntaxException {
/* 54 */     return pc.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 59 */     return d;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\co.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */