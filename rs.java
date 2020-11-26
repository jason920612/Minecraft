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
/*    */ public class rs
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 17 */     ☃.register(
/* 18 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("setworldspawn")
/* 19 */         .requires(☃ -> ☃.c(2)))
/* 20 */         .executes(☃ -> a((bu)☃.getSource(), new el(((bu)☃.getSource()).d()))))
/* 21 */         .then(
/* 22 */           bv.<T>a("pos", cy.a())
/* 23 */           .executes(☃ -> a((bu)☃.getSource(), cy.b(☃, "pos")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, el el1) {
/* 29 */     ☃.e().v(el1);
/* 30 */     ☃.j().ac().a(new lq(el1));
/* 31 */     ☃.a(new ir("commands.setworldspawn.success", new Object[] { Integer.valueOf(el1.o()), Integer.valueOf(el1.p()), Integer.valueOf(el1.q()) }), true);
/* 32 */     return 1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */