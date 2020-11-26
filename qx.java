/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.List;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qx
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 19 */     ☃.register(
/* 20 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("list")
/* 21 */         .executes(☃ -> a((bu)☃.getSource())))
/* 22 */         .then(
/* 23 */           bv.a("uuids")
/* 24 */           .executes(☃ -> b((bu)☃.getSource()))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃) {
/* 30 */     return a(☃, aog::O);
/*    */   }
/*    */   
/*    */   private static int b(bu ☃) {
/* 34 */     return a(☃, aog::dC);
/*    */   }
/*    */   
/*    */   private static int a(bu ☃, Function<tf, ij> function) {
/* 38 */     vp vp = ☃.j().ac();
/* 39 */     List<tf> list = vp.v();
/* 40 */     ij ij = ik.b(list, function);
/* 41 */     ☃.a(new ir("commands.list.players", new Object[] { Integer.valueOf(list.size()), Integer.valueOf(vp.p()), ij }), false);
/* 42 */     return list.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */