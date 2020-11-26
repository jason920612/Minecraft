/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rk
/*    */ {
/* 13 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.save.alreadyOff", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 16 */     ☃.register(
/* 17 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("save-off")
/* 18 */         .requires(☃ -> ☃.c(4)))
/* 19 */         .executes(☃ -> {
/*    */             bu bu = (bu)☃.getSource();
/*    */             boolean bool = false;
/*    */             for (td td : bu.j().w()) {
/*    */               if (td != null && !td.b) {
/*    */                 td.b = true;
/*    */                 bool = true;
/*    */               } 
/*    */             } 
/*    */             if (!bool)
/*    */               throw a.create(); 
/*    */             bu.a(new ir("commands.save.disabled", new Object[0]), true);
/*    */             return 1;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */