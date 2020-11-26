/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
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
/*    */ 
/*    */ 
/*    */ public class qv
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 21 */     ☃.register(
/* 22 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("kick")
/* 23 */         .requires(☃ -> ☃.c(3)))
/* 24 */         .then((
/* 25 */           (RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/* 26 */           .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), new ir("multiplayer.disconnect.kicked", new Object[0]))))
/* 27 */           .then(
/* 28 */             bv.<T>a("reason", cf.a())
/* 29 */             .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), cf.a(☃, "reason"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<tf> collection, ij ij1) {
/* 36 */     for (tf tf : collection) {
/* 37 */       tf.a.b(ij1);
/* 38 */       ☃.a(new ir("commands.kick.success", new Object[] { tf.O(), ij1 }), true);
/*    */     } 
/*    */     
/* 41 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */