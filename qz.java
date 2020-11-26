/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*    */ import java.util.Collection;
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
/*    */ public class qz
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 22 */     LiteralCommandNode<bu> literalCommandNode = ☃.register(
/* 23 */         (LiteralArgumentBuilder)bv.a("msg")
/* 24 */         .then(
/* 25 */           bv.<T>a("targets", cb.d())
/* 26 */           .then(
/* 27 */             bv.<T>a("message", cf.a())
/* 28 */             .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), cf.a(☃, "message"))))));
/*    */ 
/*    */ 
/*    */     
/* 32 */     ☃.register((LiteralArgumentBuilder)bv.a("tell").redirect((CommandNode)literalCommandNode));
/* 33 */     ☃.register((LiteralArgumentBuilder)bv.a("w").redirect((CommandNode)literalCommandNode));
/*    */   }
/*    */   
/*    */   private static int a(bu ☃, Collection<tf> collection, ij ij1) {
/* 37 */     for (tf tf : collection) {
/* 38 */       tf.a((new ir("commands.message.display.incoming", new Object[] { ☃.b(), ij1.h() })).a(new a[] { a.h, a.u }));
/* 39 */       ☃.a((new ir("commands.message.display.outgoing", new Object[] { tf.O(), ij1.h() })).a(new a[] { a.h, a.u }), false);
/*    */     } 
/*    */     
/* 42 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */