/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Locale;
/*    */ import java.util.UUID;
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
/*    */ public class sk
/*    */   implements si
/*    */ {
/* 27 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.data.entity.invalid", new Object[0]));
/*    */   
/* 29 */   public static final sj.a a = new sj.a()
/*    */     {
/*    */       public si a(CommandContext<bu> ☃) throws CommandSyntaxException {
/* 32 */         return new sk(cb.a(☃, "target"));
/*    */       }
/*    */ 
/*    */       
/*    */       public ArgumentBuilder<bu, ?> a(ArgumentBuilder<bu, ?> ☃, Function<ArgumentBuilder<bu, ?>, ArgumentBuilder<bu, ?>> function) {
/* 37 */         return ☃.then(bv.a("entity").then(function.apply((ArgumentBuilder<bu, ?>)bv.a("target", cb.a()))));
/*    */       }
/*    */     };
/*    */   
/*    */   private final aer c;
/*    */   
/*    */   public sk(aer ☃) {
/* 44 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(gy ☃) throws CommandSyntaxException {
/* 49 */     if (this.c instanceof aog) {
/* 50 */       throw b.create();
/*    */     }
/* 52 */     UUID uUID = this.c.bt();
/* 53 */     this.c.f(☃);
/* 54 */     this.c.a(uUID);
/*    */   }
/*    */ 
/*    */   
/*    */   public gy a() {
/* 59 */     return bc.b(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public ij b() {
/* 64 */     return new ir("commands.data.entity.modified", new Object[] { this.c.O() });
/*    */   }
/*    */ 
/*    */   
/*    */   public ij a(ho ☃) {
/* 69 */     return new ir("commands.data.entity.query", new Object[] { this.c.O(), ☃.k() });
/*    */   }
/*    */ 
/*    */   
/*    */   public ij a(ci.c ☃, double d, int i) {
/* 74 */     return new ir("commands.data.entity.get", new Object[] { ☃, this.c.O(), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }), Integer.valueOf(i) });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */