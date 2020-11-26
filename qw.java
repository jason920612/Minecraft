/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */ public class qw
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 18 */     ☃.register(
/* 19 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("kill")
/* 20 */         .requires(☃ -> ☃.c(2)))
/* 21 */         .then(
/* 22 */           bv.<T>a("targets", cb.b())
/* 23 */           .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<? extends aer> collection) {
/* 29 */     for (aer aer : collection) {
/* 30 */       aer.S();
/*    */     }
/*    */     
/* 33 */     if (collection.size() == 1) {
/* 34 */       ☃.a(new ir("commands.kill.success.single", new Object[] { ((aer)collection.iterator().next()).O() }), true);
/*    */     } else {
/* 36 */       ☃.a(new ir("commands.kill.success.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 39 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */