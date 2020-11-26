/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Collection;
/*    */ import javax.annotation.Nullable;
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
/*    */ 
/*    */ public class qa
/*    */ {
/* 27 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.ban.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 30 */     ☃.register(
/* 31 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("ban")
/* 32 */         .requires(☃ -> (☃.j().ac().h().b() && ☃.c(3))))
/* 33 */         .then((
/* 34 */           (RequiredArgumentBuilder)bv.<T>a("targets", cd.a())
/* 35 */           .executes(☃ -> a((bu)☃.getSource(), cd.a(☃, "targets"), null)))
/* 36 */           .then(
/* 37 */             bv.<T>a("reason", cf.a())
/* 38 */             .executes(☃ -> a((bu)☃.getSource(), cd.a(☃, "targets"), cf.a(☃, "reason"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<GameProfile> collection, @Nullable ij ij1) throws CommandSyntaxException {
/* 45 */     vu vu = ☃.j().ac().h();
/* 46 */     int i = 0;
/*    */     
/* 48 */     for (GameProfile gameProfile : collection) {
/* 49 */       if (!vu.a(gameProfile)) {
/* 50 */         vv vv = new vv(gameProfile, null, ☃.c(), null, (ij1 == null) ? null : ij1.getString());
/* 51 */         vu.a(vv);
/* 52 */         i++;
/* 53 */         ☃.a(new ir("commands.ban.success", new Object[] { ik.a(gameProfile), vv.d() }), true);
/*    */         
/* 55 */         tf tf = ☃.j().ac().a(gameProfile.getId());
/* 56 */         if (tf != null) {
/* 57 */           tf.a.b(new ir("multiplayer.disconnect.banned", new Object[0]));
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 62 */     if (i == 0) {
/* 63 */       throw a.create();
/*    */     }
/*    */     
/* 66 */     return i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */