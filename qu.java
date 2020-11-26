/*    */ import com.google.common.collect.Iterables;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.ParseResults;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qu
/*    */ {
/* 20 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.help.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 23 */     ☃.register(
/* 24 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("help")
/* 25 */         .executes(commandContext -> {
/*    */             Map<CommandNode<bu>, String> map = ☃.getSmartUsage((CommandNode)☃.getRoot(), commandContext.getSource());
/*    */             
/*    */             for (String str : map.values()) {
/*    */               ((bu)commandContext.getSource()).a(new iq("/" + str), false);
/*    */             }
/*    */             return map.size();
/* 32 */           })).then(
/* 33 */           bv.<T>a("command", (ArgumentType<T>)StringArgumentType.greedyString())
/* 34 */           .executes(commandContext -> {
/*    */               ParseResults<bu> parseResults = ☃.parse(StringArgumentType.getString(commandContext, "command"), commandContext.getSource());
/*    */               if (parseResults.getContext().getNodes().isEmpty())
/*    */                 throw a.create(); 
/*    */               Map<CommandNode<bu>, String> map = ☃.getSmartUsage((CommandNode)Iterables.getLast(parseResults.getContext().getNodes().keySet()), commandContext.getSource());
/*    */               for (String str : map.values())
/*    */                 ((bu)commandContext.getSource()).a(new iq("/" + parseResults.getReader().getString() + " " + str), false); 
/*    */               return map.size();
/*    */             })));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */