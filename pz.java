/*    */ import com.google.common.collect.Iterables;
/*    */ import com.google.common.collect.Lists;
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
/*    */ public class pz
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 18 */     ☃.register(
/* 19 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("banlist")
/* 20 */         .requires(☃ -> ((☃.j().ac().h().b() || ☃.j().ac().i().b()) && ☃.c(3))))
/* 21 */         .executes(☃ -> {
/*    */             vp vp = ((bu)☃.getSource()).j().ac();
/*    */             
/*    */             return a((bu)☃.getSource(), Lists.newArrayList(Iterables.concat(vp.h().e(), vp.i().e())));
/* 25 */           })).then(
/* 26 */           bv.a("ips")
/* 27 */           .executes(☃ -> a((bu)☃.getSource(), (Collection)((bu)☃.getSource()).j().ac().i().e()))))
/*    */         
/* 29 */         .then(
/* 30 */           bv.a("players")
/* 31 */           .executes(☃ -> a((bu)☃.getSource(), (Collection)((bu)☃.getSource()).j().ac().h().e()))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<? extends vk<?>> collection) {
/* 37 */     if (collection.isEmpty()) {
/* 38 */       ☃.a(new ir("commands.banlist.none", new Object[0]), false);
/*    */     } else {
/* 40 */       ☃.a(new ir("commands.banlist.list", new Object[] { Integer.valueOf(collection.size()) }), false);
/* 41 */       for (vk<?> vk : collection) {
/* 42 */         ☃.a(new ir("commands.banlist.entry", new Object[] { vk.e(), vk.b(), vk.d() }), false);
/*    */       } 
/*    */     } 
/* 45 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\pz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */