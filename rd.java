/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rd
/*    */ {
/* 30 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.particle.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 33 */     ☃.register(
/* 34 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("particle")
/* 35 */         .requires(☃ -> ☃.c(2)))
/* 36 */         .then((
/* 37 */           (RequiredArgumentBuilder)bv.<T>a("name", cm.a())
/* 38 */           .executes(☃ -> a((bu)☃.getSource(), cm.a(☃, "name"), ((bu)☃.getSource()).d(), cee.a, 0.0F, 0, false, ((bu)☃.getSource()).j().ac().v())))
/* 39 */           .then((
/* 40 */             (RequiredArgumentBuilder)bv.<T>a("pos", df.a())
/* 41 */             .executes(☃ -> a((bu)☃.getSource(), cm.a(☃, "name"), df.a(☃, "pos"), cee.a, 0.0F, 0, false, ((bu)☃.getSource()).j().ac().v())))
/* 42 */             .then(
/* 43 */               bv.<T>a("delta", df.a(false))
/* 44 */               .then(
/* 45 */                 bv.<T>a("speed", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/* 46 */                 .then((
/* 47 */                   (RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("count", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 48 */                   .executes(☃ -> a((bu)☃.getSource(), cm.a(☃, "name"), df.a(☃, "pos"), df.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), false, ((bu)☃.getSource()).j().ac().v())))
/* 49 */                   .then((
/* 50 */                     (LiteralArgumentBuilder)bv.a("force")
/* 51 */                     .executes(☃ -> a((bu)☃.getSource(), cm.a(☃, "name"), df.a(☃, "pos"), df.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), true, ((bu)☃.getSource()).j().ac().v())))
/* 52 */                     .then(
/* 53 */                       bv.<T>a("viewers", cb.d())
/* 54 */                       .executes(☃ -> a((bu)☃.getSource(), cm.a(☃, "name"), df.a(☃, "pos"), df.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), true, cb.f(☃, "viewers"))))))
/*    */ 
/*    */                   
/* 57 */                   .then((
/* 58 */                     (LiteralArgumentBuilder)bv.a("normal")
/* 59 */                     .executes(☃ -> a((bu)☃.getSource(), cm.a(☃, "name"), df.a(☃, "pos"), df.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), false, ((bu)☃.getSource()).j().ac().v())))
/* 60 */                     .then(
/* 61 */                       bv.<T>a("viewers", cb.d())
/* 62 */                       .executes(☃ -> a((bu)☃.getSource(), cm.a(☃, "name"), df.a(☃, "pos"), df.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), false, cb.f(☃, "viewers")))))))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, fk fk1, cee cee1, cee cee2, float f, int i, boolean bool, Collection<tf> collection) throws CommandSyntaxException {
/* 74 */     int j = 0;
/*    */     
/* 76 */     for (tf tf : collection) {
/* 77 */       if (☃.e().a(tf, fk1, bool, cee1.b, cee1.c, cee1.d, i, cee2.b, cee2.c, cee2.d, f)) {
/* 78 */         j++;
/*    */       }
/*    */     } 
/*    */     
/* 82 */     if (j == 0) {
/* 83 */       throw a.create();
/*    */     }
/*    */     
/* 86 */     ☃.a(new ir("commands.particle.success", new Object[] { fc.u.b(fk1.b()).toString() }), true);
/*    */     
/* 88 */     return j;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */