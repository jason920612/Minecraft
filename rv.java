/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */ 
/*    */ 
/*    */ public class rv
/*    */ {
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 29 */     RequiredArgumentBuilder<bu, dr> requiredArgumentBuilder = (RequiredArgumentBuilder<bu, dr>)((RequiredArgumentBuilder)bv.<T>a("targets", cb.d()).executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), null, null))).then(
/* 30 */         bv.a("*")
/* 31 */         .then(
/* 32 */           bv.<T>a("sound", co.a())
/* 33 */           .suggests(eb.c)
/* 34 */           .executes(☃ -> a((bu)☃.getSource(), cb.f(☃, "targets"), null, co.c(☃, "sound")))));
/*    */ 
/*    */ 
/*    */     
/* 38 */     for (wk wk : wk.values()) {
/* 39 */       requiredArgumentBuilder.then((
/* 40 */           (LiteralArgumentBuilder)bv.a(wk.a())
/* 41 */           .executes(commandContext -> a((bu)commandContext.getSource(), cb.f(commandContext, "targets"), ☃, null)))
/* 42 */           .then(
/* 43 */             bv.<T>a("sound", co.a())
/* 44 */             .suggests(eb.c)
/* 45 */             .executes(commandContext -> a((bu)commandContext.getSource(), cb.f(commandContext, "targets"), ☃, co.c(commandContext, "sound")))));
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 50 */     ☃.register(
/* 51 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("stopsound")
/* 52 */         .requires(☃ -> ☃.c(2)))
/* 53 */         .then((ArgumentBuilder)requiredArgumentBuilder));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, Collection<tf> collection, @Nullable wk wk1, @Nullable pc pc1) {
/* 60 */     lu lu = new lu(pc1, wk1);
/* 61 */     for (tf tf : collection) {
/* 62 */       tf.a.a(lu);
/*    */     }
/*    */     
/* 65 */     if (wk1 != null) {
/* 66 */       if (pc1 != null) {
/* 67 */         ☃.a(new ir("commands.stopsound.success.source.sound", new Object[] { pc1, wk1.a() }), true);
/*    */       } else {
/* 69 */         ☃.a(new ir("commands.stopsound.success.source.any", new Object[] { wk1.a() }), true);
/*    */       }
/*    */     
/* 72 */     } else if (pc1 != null) {
/* 73 */       ☃.a(new ir("commands.stopsound.success.sourceless.sound", new Object[] { pc1 }), true);
/*    */     } else {
/* 75 */       ☃.a(new ir("commands.stopsound.success.sourceless.any", new Object[0]), true);
/*    */     } 
/*    */ 
/*    */     
/* 79 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */