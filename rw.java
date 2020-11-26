/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rw
/*    */ {
/* 30 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.summon.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 33 */     ☃.register(
/* 34 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("summon")
/* 35 */         .requires(☃ -> ☃.c(2)))
/* 36 */         .then((
/* 37 */           (RequiredArgumentBuilder)bv.<T>a("entity", cc.a())
/* 38 */           .suggests(eb.d)
/* 39 */           .executes(☃ -> a((bu)☃.getSource(), cc.a(☃, "entity"), ((bu)☃.getSource()).d(), new gy(), true)))
/* 40 */           .then((
/* 41 */             (RequiredArgumentBuilder)bv.<T>a("pos", df.a())
/* 42 */             .executes(☃ -> a((bu)☃.getSource(), cc.a(☃, "entity"), df.a(☃, "pos"), new gy(), true)))
/* 43 */             .then(
/* 44 */               bv.<T>a("nbt", ch.a())
/* 45 */               .executes(☃ -> a((bu)☃.getSource(), cc.a(☃, "entity"), df.a(☃, "pos"), ch.a(☃, "nbt"), false))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, pc pc1, cee cee1, gy gy1, boolean bool) throws CommandSyntaxException {
/* 53 */     gy gy2 = gy1.f();
/* 54 */     gy2.a("id", pc1.toString());
/*    */ 
/*    */     
/* 57 */     if (aev.a(aev.aN).equals(pc1)) {
/* 58 */       aer aer1 = new amj(☃.e(), cee1.b, cee1.c, cee1.d, false);
/* 59 */       ☃.e().d(aer1);
/* 60 */       ☃.a(new ir("commands.summon.success", new Object[] { aer1.O() }), true);
/* 61 */       return 1;
/*    */     } 
/*    */     
/* 64 */     aer aer = bnv.a(gy2, ☃.e(), cee1.b, cee1.c, cee1.d, true);
/* 65 */     if (aer == null) {
/* 66 */       throw a.create();
/*    */     }
/*    */     
/* 69 */     aer.b(cee1.b, cee1.c, cee1.d, aer.w, aer.x);
/*    */     
/* 71 */     if (bool && aer instanceof afb) {
/* 72 */       ((afb)aer).a(☃.e().h(new el(aer)), (afj)null, (gy)null);
/*    */     }
/*    */     
/* 75 */     ☃.a(new ir("commands.summon.success", new Object[] { aer.O() }), true);
/* 76 */     return 1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\rw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */