/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dc
/*    */   implements ArgumentType<da>
/*    */ {
/* 15 */   private static final Collection<String> b = Arrays.asList(new String[] { "0 0", "~ ~", "~-5 ~5" });
/* 16 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("argument.rotation.incomplete", new Object[0]));
/*    */   
/*    */   public static dc a() {
/* 19 */     return new dc();
/*    */   }
/*    */   
/*    */   public static da a(CommandContext<bu> ☃, String str) {
/* 23 */     return (da)☃.getArgument(str, da.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public da a(StringReader ☃) throws CommandSyntaxException {
/* 28 */     int i = ☃.getCursor();
/* 29 */     if (!☃.canRead()) {
/* 30 */       throw a.createWithContext(☃);
/*    */     }
/* 32 */     dg dg1 = dg.a(☃, false);
/* 33 */     if (!☃.canRead() || ☃.peek() != ' ') {
/* 34 */       ☃.setCursor(i);
/* 35 */       throw a.createWithContext(☃);
/*    */     } 
/* 37 */     ☃.skip();
/* 38 */     dg dg2 = dg.a(☃, false);
/* 39 */     return new dh(dg2, dg1, new dg(true, 0.0D));
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 44 */     return b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\dc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */