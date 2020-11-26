/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dj
/*    */   implements ArgumentType<dj.a>
/*    */ {
/*    */   private static final DynamicCommandExceptionType b;
/*    */   private static final DynamicCommandExceptionType c;
/* 19 */   private static final Collection<String> a = Arrays.asList(new String[] { "foo", "foo:bar", "#foo" }); static {
/* 20 */     b = new DynamicCommandExceptionType(☃ -> new ir("arguments.function.tag.unknown", new Object[] { ☃ }));
/* 21 */     c = new DynamicCommandExceptionType(☃ -> new ir("arguments.function.unknown", new Object[] { ☃ }));
/*    */   }
/*    */   public static dj a() {
/* 24 */     return new dj();
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(StringReader ☃) throws CommandSyntaxException {
/* 29 */     if (☃.canRead() && ☃.peek() == '#') {
/* 30 */       ☃.skip();
/* 31 */       pc pc1 = pc.a(☃);
/* 32 */       return commandContext -> {
/*    */           wz<br> wz = ((bu)commandContext.getSource()).j().aB().g().a(☃);
/*    */           
/*    */           if (wz == null) {
/*    */             throw b.create(☃.toString());
/*    */           }
/*    */           return wz.a();
/*    */         };
/*    */     } 
/* 41 */     pc pc = pc.a(☃);
/* 42 */     return commandContext -> {
/*    */         br br = ((bu)commandContext.getSource()).j().aB().a(☃);
/*    */         if (br == null) {
/*    */           throw c.create(☃.toString());
/*    */         }
/*    */         return Collections.singleton(br);
/*    */       };
/*    */   }
/*    */   
/*    */   public static Collection<br> a(CommandContext<bu> ☃, String str) throws CommandSyntaxException {
/* 52 */     return ((a)☃.getArgument(str, a.class)).create(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 57 */     return a;
/*    */   }
/*    */   
/*    */   public static interface a {
/*    */     Collection<br> create(CommandContext<bu> param1CommandContext) throws CommandSyntaxException;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\dj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */