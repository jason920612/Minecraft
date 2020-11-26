/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */ final class null
/*    */   implements sj.a
/*    */ {
/*    */   public si a(CommandContext<bu> ☃) throws CommandSyntaxException {
/* 32 */     el el = cy.a(☃, "pos");
/* 33 */     bji bji = ((bu)☃.getSource()).e().f(el);
/* 34 */     if (bji == null) {
/* 35 */       throw sh.c().create();
/*    */     }
/* 37 */     return new sh(bji, el);
/*    */   }
/*    */ 
/*    */   
/*    */   public ArgumentBuilder<bu, ?> a(ArgumentBuilder<bu, ?> ☃, Function<ArgumentBuilder<bu, ?>, ArgumentBuilder<bu, ?>> function) {
/* 42 */     return ☃.then(bv.a("block").then(function.apply((ArgumentBuilder<bu, ?>)bv.a("pos", cy.a()))));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sh$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */