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
/*    */ public class ro
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 17 */     ☃.register(
/* 18 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("seed")
/* 19 */         .requires(☃ -> (☃.j().H() || ☃.c(2))))
/* 20 */         .executes(☃ -> {
/*    */             long l = ((bu)☃.getSource()).e().r_();
/*    */             ij ij = ik.a((new iq(String.valueOf(l))).a(()));
/*    */             ((bu)☃.getSource()).a(new ir("commands.seed.success", new Object[] { ij }), false);
/*    */             return (int)l;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ro.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */