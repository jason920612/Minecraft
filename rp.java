/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.function.Predicate;
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
/*    */ 
/*    */ public class rp
/*    */ {
/* 29 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.setblock.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 32 */     ☃.register(
/* 33 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("setblock")
/* 34 */         .requires(☃ -> ☃.c(2)))
/* 35 */         .then(
/* 36 */           bv.<T>a("pos", cy.a())
/* 37 */           .then((
/* 38 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("block", cv.a())
/* 39 */             .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "pos"), cv.a(☃, "block"), b.a, null)))
/* 40 */             .then(
/* 41 */               bv.a("destroy")
/* 42 */               .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "pos"), cv.a(☃, "block"), b.d, null))))
/*    */             
/* 44 */             .then(
/* 45 */               bv.a("keep")
/* 46 */               .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "pos"), cv.a(☃, "block"), b.a, ()))))
/*    */             
/* 48 */             .then(
/* 49 */               bv.a("replace")
/* 50 */               .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "pos"), cv.a(☃, "block"), b.a, null))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, el el1, ct ct1, b b1, @Nullable Predicate<blh> predicate) throws CommandSyntaxException {
/*    */     boolean bool;
/* 58 */     td td = ☃.e();
/* 59 */     if (predicate != null && !predicate.test(new blh(td, el1, true))) {
/* 60 */       throw a.create();
/*    */     }
/*    */ 
/*    */     
/* 64 */     if (b1 == b.d) {
/* 65 */       td.a(el1, true);
/* 66 */       bool = !ct1.a().f();
/*    */     } else {
/* 68 */       bji bji = td.f(el1);
/* 69 */       if (bji instanceof ade) {
/* 70 */         ((ade)bji).m();
/*    */       }
/* 72 */       bool = true;
/*    */     } 
/* 74 */     if (bool && !ct1.a(td, el1, 2)) {
/* 75 */       throw a.create();
/*    */     }
/*    */     
/* 78 */     td.a(el1, ct1.a().c());
/* 79 */     ☃.a(new ir("commands.setblock.success", new Object[] { Integer.valueOf(el1.o()), Integer.valueOf(el1.p()), Integer.valueOf(el1.q()) }), true);
/* 80 */     return 1;
/*    */   } public static interface a {
/*    */     @Nullable
/*    */     ct filter(bwf param1bwf, el param1el, ct param1ct, td param1td); }
/* 84 */   public enum b { a,
/* 85 */     b,
/* 86 */     c,
/* 87 */     d; }
/*    */ 
/*    */ }


/* Location:              F:\dw\server.jar!\rp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */