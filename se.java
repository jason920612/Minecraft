/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class se
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 18 */     ☃.register(
/* 19 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("weather")
/* 20 */         .requires(☃ -> ☃.c(2)))
/* 21 */         .then((
/* 22 */           (LiteralArgumentBuilder)bv.a("clear")
/* 23 */           .executes(☃ -> a((bu)☃.getSource(), 6000)))
/* 24 */           .then(
/* 25 */             bv.<T>a("duration", (ArgumentType<T>)IntegerArgumentType.integer(0, 1000000))
/* 26 */             .executes(☃ -> a((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "duration") * 20)))))
/*    */ 
/*    */         
/* 29 */         .then((
/* 30 */           (LiteralArgumentBuilder)bv.a("rain")
/* 31 */           .executes(☃ -> b((bu)☃.getSource(), 6000)))
/* 32 */           .then(
/* 33 */             bv.<T>a("duration", (ArgumentType<T>)IntegerArgumentType.integer(0, 1000000))
/* 34 */             .executes(☃ -> b((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "duration") * 20)))))
/*    */ 
/*    */         
/* 37 */         .then((
/* 38 */           (LiteralArgumentBuilder)bv.a("thunder")
/* 39 */           .executes(☃ -> c((bu)☃.getSource(), 6000)))
/* 40 */           .then(
/* 41 */             bv.<T>a("duration", (ArgumentType<T>)IntegerArgumentType.integer(0, 1000000))
/* 42 */             .executes(☃ -> c((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "duration") * 20)))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, int i) {
/* 49 */     ☃.e().g().g(i);
/* 50 */     ☃.e().g().f(0);
/* 51 */     ☃.e().g().e(0);
/* 52 */     ☃.e().g().b(false);
/* 53 */     ☃.e().g().a(false);
/* 54 */     ☃.a(new ir("commands.weather.set.clear", new Object[0]), true);
/* 55 */     return i;
/*    */   }
/*    */   
/*    */   private static int b(bu ☃, int i) {
/* 59 */     ☃.e().g().g(0);
/* 60 */     ☃.e().g().f(i);
/* 61 */     ☃.e().g().e(i);
/* 62 */     ☃.e().g().b(true);
/* 63 */     ☃.e().g().a(false);
/* 64 */     ☃.a(new ir("commands.weather.set.rain", new Object[0]), true);
/* 65 */     return i;
/*    */   }
/*    */   
/*    */   private static int c(bu ☃, int i) {
/* 69 */     ☃.e().g().g(0);
/* 70 */     ☃.e().g().f(i);
/* 71 */     ☃.e().g().e(i);
/* 72 */     ☃.e().g().b(true);
/* 73 */     ☃.e().g().a(true);
/* 74 */     ☃.a(new ir("commands.weather.set.thunder", new Object[0]), true);
/* 75 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\se.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */