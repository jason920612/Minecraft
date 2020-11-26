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
/*    */ public class sb
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 17 */     ☃.register(
/* 18 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("time")
/* 19 */         .requires(☃ -> ☃.c(2)))
/* 20 */         .then((
/* 21 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("set")
/* 22 */           .then(
/* 23 */             bv.a("day")
/* 24 */             .executes(☃ -> a((bu)☃.getSource(), 1000))))
/* 25 */           .then(
/* 26 */             bv.a("noon")
/* 27 */             .executes(☃ -> a((bu)☃.getSource(), 6000))))
/* 28 */           .then(
/* 29 */             bv.a("night")
/* 30 */             .executes(☃ -> a((bu)☃.getSource(), 13000))))
/* 31 */           .then(
/* 32 */             bv.a("midnight")
/* 33 */             .executes(☃ -> a((bu)☃.getSource(), 18000))))
/* 34 */           .then(
/* 35 */             bv.<T>a("time", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 36 */             .executes(☃ -> a((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "time"))))))
/*    */ 
/*    */         
/* 39 */         .then(
/* 40 */           bv.a("add")
/* 41 */           .then(
/* 42 */             bv.<T>a("time", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 43 */             .executes(☃ -> b((bu)☃.getSource(), IntegerArgumentType.getInteger(☃, "time"))))))
/*    */ 
/*    */         
/* 46 */         .then((
/* 47 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("query")
/* 48 */           .then(
/* 49 */             bv.a("daytime")
/* 50 */             .executes(☃ -> c((bu)☃.getSource(), a(((bu)☃.getSource()).e())))))
/*    */           
/* 52 */           .then(
/* 53 */             bv.a("gametime")
/* 54 */             .executes(☃ -> c((bu)☃.getSource(), (int)(((bu)☃.getSource()).e().V() % 2147483647L)))))
/*    */           
/* 56 */           .then(
/* 57 */             bv.a("day")
/* 58 */             .executes(☃ -> c((bu)☃.getSource(), (int)(((bu)☃.getSource()).e().W() / 24000L % 2147483647L))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(td ☃) {
/* 65 */     return (int)(☃.W() % 24000L);
/*    */   }
/*    */   
/*    */   private static int c(bu ☃, int i) {
/* 69 */     ☃.a(new ir("commands.time.query", new Object[] { Integer.valueOf(i) }), false);
/* 70 */     return i;
/*    */   }
/*    */   
/*    */   public static int a(bu ☃, int i) {
/* 74 */     for (td td : ☃.j().w()) {
/* 75 */       td.b(i);
/*    */     }
/* 77 */     ☃.a(new ir("commands.time.set", new Object[] { Integer.valueOf(i) }), true);
/* 78 */     return a(☃.e());
/*    */   }
/*    */   
/*    */   public static int b(bu ☃, int i) {
/* 82 */     for (td td : ☃.j().w()) {
/* 83 */       td.b(td.W() + i);
/*    */     }
/* 85 */     int j = a(☃.e());
/* 86 */     ☃.a(new ir("commands.time.set", new Object[] { Integer.valueOf(j) }), true);
/* 87 */     return j;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */