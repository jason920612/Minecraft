/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
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
/*    */ public class rr
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 22 */     ☃.register(
/* 23 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("spawnpoint")
/* 24 */         .requires(☃ -> ☃.c(2)))
/* 25 */         .executes(☃ -> a((bu)☃.getSource(), Collections.singleton(((bu)☃.getSource()).h()), new el(((bu)☃.getSource()).d()))))
/* 26 */         .then((
/* 27 */           (RequiredArgumentBuilder)bv.<T>a("targets", cb.d())
/* 28 */           .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), new el(((bu)☃.getSource()).d()))))
/* 29 */           .then(
/* 30 */             bv.<T>a("pos", cy.a())
/* 31 */             .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), cy.b(☃, "pos"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<tf> collection, el el1) {
/* 38 */     for (tf tf : collection) {
/* 39 */       tf.b(el1, true);
/*    */     }
/*    */     
/* 42 */     if (collection.size() == 1) {
/* 43 */       ☃.a(new ir("commands.spawnpoint.success.single", new Object[] { Integer.valueOf(el1.o()), Integer.valueOf(el1.p()), Integer.valueOf(el1.q()), ((tf)collection.iterator().next()).O() }), true);
/*    */     } else {
/* 45 */       ☃.a(new ir("commands.spawnpoint.success.multiple", new Object[] { Integer.valueOf(el1.o()), Integer.valueOf(el1.p()), Integer.valueOf(el1.q()), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 48 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */