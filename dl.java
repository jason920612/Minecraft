/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class dl
/*    */   implements Predicate<ate>
/*    */ {
/*    */   private static final Dynamic2CommandExceptionType a;
/*    */   private final ata b;
/*    */   @Nullable
/*    */   private final gy c;
/*    */   
/*    */   static {
/* 16 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new ir("arguments.item.overstacked", new Object[] { ☃, object1 }));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public dl(ata ☃, @Nullable gy gy1) {
/* 23 */     this.b = ☃;
/* 24 */     this.c = gy1;
/*    */   }
/*    */   
/*    */   public ata a() {
/* 28 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃) {
/* 38 */     return (☃.b() == this.b && hk.a(this.c, ☃.n(), true));
/*    */   }
/*    */   
/*    */   public ate a(int ☃, boolean bool) throws CommandSyntaxException {
/* 42 */     ate ate = new ate(this.b, ☃);
/* 43 */     if (this.c != null) {
/* 44 */       ate.c(this.c);
/*    */     }
/* 46 */     if (bool && ☃ > ate.c()) {
/* 47 */       throw a.create(fc.s.b(this.b), Integer.valueOf(ate.c()));
/*    */     }
/* 49 */     return ate;
/*    */   }
/*    */   
/*    */   public String c() {
/* 53 */     StringBuilder ☃ = new StringBuilder(fc.s.a(this.b));
/* 54 */     if (this.c != null) {
/* 55 */       ☃.append(this.c);
/*    */     }
/* 57 */     return ☃.toString();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\dl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */