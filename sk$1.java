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
/* 32 */     return new sk(cb.a(☃, "target"));
/*    */   }
/*    */ 
/*    */   
/*    */   public ArgumentBuilder<bu, ?> a(ArgumentBuilder<bu, ?> ☃, Function<ArgumentBuilder<bu, ?>, ArgumentBuilder<bu, ?>> function) {
/* 37 */     return ☃.then(bv.a("entity").then(function.apply((ArgumentBuilder<bu, ?>)bv.a("target", cb.a()))));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sk$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */