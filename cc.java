/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cc
/*    */   implements ArgumentType<pc>
/*    */ {
/* 18 */   private static final Collection<String> b = Arrays.asList(new String[] { "minecraft:pig", "cow" }); static {
/* 19 */     a = new DynamicCommandExceptionType(☃ -> new ir("entity.notFound", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static cc a() {
/* 25 */     return new cc();
/*    */   }
/*    */   
/*    */   public static pc a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 29 */     return a((pc)☃.getArgument(str, pc.class));
/*    */   }
/*    */   
/*    */   private static final pc a(pc ☃) throws CommandSyntaxException {
/* 33 */     aev<?> aev = fc.r.b(☃);
/*    */     
/* 35 */     if (aev == null || !aev.b()) {
/* 36 */       throw a.create(☃);
/*    */     }
/* 38 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public pc a(StringReader ☃) throws CommandSyntaxException {
/* 43 */     return a(pc.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 48 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */