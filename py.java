/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.List;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
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
/*    */ public class py
/*    */ {
/* 28 */   public static final Pattern a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
/* 29 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.banip.invalid", new Object[0]));
/* 30 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.banip.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 33 */     ☃.register(
/* 34 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("ban-ip")
/* 35 */         .requires(☃ -> (☃.j().ac().i().b() && ☃.c(3))))
/* 36 */         .then((
/* 37 */           (RequiredArgumentBuilder)bv.<T>a("target", (ArgumentType<T>)StringArgumentType.word())
/* 38 */           .executes(☃ -> a((bu)☃.getSource(), StringArgumentType.getString(☃, "target"), null)))
/* 39 */           .then(
/* 40 */             bv.<T>a("reason", cf.a())
/* 41 */             .executes(☃ -> a((bu)☃.getSource(), StringArgumentType.getString(☃, "target"), cf.a(☃, "reason"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, String str, @Nullable ij ij1) throws CommandSyntaxException {
/* 48 */     Matcher matcher = a.matcher(str);
/* 49 */     if (matcher.matches()) {
/* 50 */       return b(☃, str, ij1);
/*    */     }
/* 52 */     tf tf = ☃.j().ac().a(str);
/* 53 */     if (tf != null) {
/* 54 */       return b(☃, tf.v(), ij1);
/*    */     }
/*    */     
/* 57 */     throw b.create();
/*    */   }
/*    */   
/*    */   private static int b(bu ☃, String str, @Nullable ij ij1) throws CommandSyntaxException {
/* 61 */     vm vm = ☃.j().ac().i();
/* 62 */     if (vm.a(str)) {
/* 63 */       throw c.create();
/*    */     }
/* 65 */     List<tf> list = ☃.j().ac().b(str);
/* 66 */     vn vn = new vn(str, null, ☃.c(), null, (ij1 == null) ? null : ij1.getString());
/* 67 */     vm.a(vn);
/*    */     
/* 69 */     ☃.a(new ir("commands.banip.success", new Object[] { str, vn.d() }), true);
/* 70 */     if (!list.isEmpty()) {
/* 71 */       ☃.a(new ir("commands.banip.info", new Object[] { Integer.valueOf(list.size()), dr.a((List)list) }), true);
/*    */     }
/*    */     
/* 74 */     for (tf tf : list) {
/* 75 */       tf.a.b(new ir("multiplayer.disconnect.ip_banned", new Object[0]));
/*    */     }
/*    */     
/* 78 */     return list.size();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\py.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */