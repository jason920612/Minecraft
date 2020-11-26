/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dd
/*    */   implements ArgumentType<EnumSet<eq.a>>
/*    */ {
/* 17 */   private static final Collection<String> a = Arrays.asList(new String[] { "xyz", "x" });
/* 18 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("arguments.swizzle.invalid", new Object[0]));
/*    */   
/*    */   public static dd a() {
/* 21 */     return new dd();
/*    */   }
/*    */ 
/*    */   
/*    */   public static EnumSet<eq.a> a(CommandContext<bu> ☃, String str) {
/* 26 */     return (EnumSet<eq.a>)☃.getArgument(str, EnumSet.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public EnumSet<eq.a> a(StringReader ☃) throws CommandSyntaxException {
/* 31 */     EnumSet<eq.a> enumSet = EnumSet.noneOf(eq.a.class);
/*    */     
/* 33 */     while (☃.canRead() && ☃.peek() != ' ') {
/* 34 */       eq.a a; char c = ☃.read();
/*    */ 
/*    */       
/* 37 */       switch (c) {
/*    */         case 'x':
/* 39 */           a = eq.a.a;
/*    */           break;
/*    */         case 'y':
/* 42 */           a = eq.a.b;
/*    */           break;
/*    */         case 'z':
/* 45 */           a = eq.a.c;
/*    */           break;
/*    */         default:
/* 48 */           throw b.create();
/*    */       } 
/*    */       
/* 51 */       if (enumSet.contains(a)) {
/* 52 */         throw b.create();
/*    */       }
/* 54 */       enumSet.add(a);
/*    */     } 
/*    */     
/* 57 */     return enumSet;
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 62 */     return a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\dd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */