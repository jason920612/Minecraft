/*    */ import com.mojang.brigadier.CommandDispatcher;
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
/*    */ 
/*    */ 
/*    */ public class sa
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 18 */     ☃.register(
/* 19 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("tellraw")
/* 20 */         .requires(☃ -> ☃.c(2)))
/* 21 */         .then(
/* 22 */           bv.<T>a("targets", cb.d())
/* 23 */           .then(
/* 24 */             bv.<T>a("message", by.a())
/* 25 */             .executes(☃ -> {
/*    */                 int i = 0;
/*    */                 for (tf tf : cb.f(☃, "targets")) {
/*    */                   tf.a(ik.a((bu)☃.getSource(), by.a(☃, "message"), tf));
/*    */                   i++;
/*    */                 } 
/*    */                 return i;
/*    */               }))));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */