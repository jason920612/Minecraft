/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Locale;
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
/*    */ public class sh
/*    */   implements si
/*    */ {
/* 27 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.data.block.invalid", new Object[0]));
/*    */   
/* 29 */   public static final sj.a a = new sj.a()
/*    */     {
/*    */       public si a(CommandContext<bu> ☃) throws CommandSyntaxException {
/* 32 */         el el = cy.a(☃, "pos");
/* 33 */         bji bji = ((bu)☃.getSource()).e().f(el);
/* 34 */         if (bji == null) {
/* 35 */           throw sh.c().create();
/*    */         }
/* 37 */         return new sh(bji, el);
/*    */       }
/*    */ 
/*    */       
/*    */       public ArgumentBuilder<bu, ?> a(ArgumentBuilder<bu, ?> ☃, Function<ArgumentBuilder<bu, ?>, ArgumentBuilder<bu, ?>> function) {
/* 42 */         return ☃.then(bv.a("block").then(function.apply((ArgumentBuilder<bu, ?>)bv.a("pos", cy.a()))));
/*    */       }
/*    */     };
/*    */   
/*    */   private final bji c;
/*    */   private final el d;
/*    */   
/*    */   public sh(bji ☃, el el1) {
/* 50 */     this.c = ☃;
/* 51 */     this.d = el1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(gy ☃) {
/* 56 */     ☃.b("x", this.d.o());
/* 57 */     ☃.b("y", this.d.p());
/* 58 */     ☃.b("z", this.d.q());
/* 59 */     this.c.b(☃);
/* 60 */     this.c.g();
/* 61 */     blc blc = this.c.F().a_(this.d);
/* 62 */     this.c.F().a(this.d, blc, blc, 3);
/*    */   }
/*    */ 
/*    */   
/*    */   public gy a() {
/* 67 */     return this.c.a(new gy());
/*    */   }
/*    */ 
/*    */   
/*    */   public ij b() {
/* 72 */     return new ir("commands.data.block.modified", new Object[] { Integer.valueOf(this.d.o()), Integer.valueOf(this.d.p()), Integer.valueOf(this.d.q()) });
/*    */   }
/*    */ 
/*    */   
/*    */   public ij a(ho ☃) {
/* 77 */     return new ir("commands.data.block.query", new Object[] { Integer.valueOf(this.d.o()), Integer.valueOf(this.d.p()), Integer.valueOf(this.d.q()), ☃.k() });
/*    */   }
/*    */ 
/*    */   
/*    */   public ij a(ci.c ☃, double d, int i) {
/* 82 */     return new ir("commands.data.block.get", new Object[] { ☃, Integer.valueOf(this.d.o()), Integer.valueOf(this.d.p()), Integer.valueOf(this.d.q()), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }), Integer.valueOf(i) });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */