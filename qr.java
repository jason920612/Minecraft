/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qr
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 24 */     LiteralArgumentBuilder<bu> literalArgumentBuilder = (LiteralArgumentBuilder<bu>)bv.a("gamemode").requires(☃ -> ☃.c(2));
/*    */     
/* 26 */     for (axv axv : axv.values()) {
/* 27 */       if (axv != axv.a) {
/* 28 */         literalArgumentBuilder.then((
/* 29 */             (LiteralArgumentBuilder)bv.a(axv.b())
/* 30 */             .executes(commandContext -> a(commandContext, Collections.singleton(((bu)commandContext.getSource()).h()), ☃)))
/* 31 */             .then(
/* 32 */               bv.<T>a("target", cb.d())
/* 33 */               .executes(commandContext -> a(commandContext, cb.f(commandContext, "target"), ☃))));
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 39 */     ☃.register(literalArgumentBuilder);
/*    */   }
/*    */   
/*    */   private static void a(bu ☃, tf tf1, axv axv1) {
/* 43 */     ij ij = new ir("gameMode." + axv1.b(), new Object[0]);
/* 44 */     if (☃.f() == tf1) {
/* 45 */       ☃.a(new ir("commands.gamemode.success.self", new Object[] { ij }), true);
/*    */     } else {
/* 47 */       if (☃.e().X().b("sendCommandFeedback")) {
/* 48 */         tf1.a(new ir("gameMode.changed", new Object[] { ij }));
/*    */       }
/*    */       
/* 51 */       ☃.a(new ir("commands.gamemode.success.other", new Object[] { tf1.O(), ij }), true);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static int a(CommandContext<bu> ☃, Collection<tf> collection, axv axv1) {
/* 56 */     int i = 0;
/* 57 */     for (tf tf : collection) {
/* 58 */       if (tf.c.b() != axv1) {
/* 59 */         tf.a(axv1);
/* 60 */         a((bu)☃.getSource(), tf, axv1);
/* 61 */         i++;
/*    */       } 
/*    */     } 
/* 64 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */