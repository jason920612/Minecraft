/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fj
/*    */   implements fk
/*    */ {
/* 11 */   public static final fk.a<fj> a = new fk.a<fj>()
/*    */     {
/*    */       public fj a(fl<fj> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 14 */         stringReader.expect(' ');
/* 15 */         dm dm = (new dm(stringReader, false)).h();
/* 16 */         ate ate = (new dl(dm.b(), dm.c())).a(1, false);
/* 17 */         return new fj(☃, ate);
/*    */       }
/*    */ 
/*    */       
/*    */       public fj a(fl<fj> ☃, hy hy1) {
/* 22 */         return new fj(☃, hy1.k());
/*    */       }
/*    */     };
/*    */   
/*    */   private final fl<fj> b;
/*    */   private final ate c;
/*    */   
/*    */   public fj(fl<fj> ☃, ate ate1) {
/* 30 */     this.b = ☃;
/* 31 */     this.c = ate1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) {
/* 36 */     ☃.a(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 41 */     return b().d() + " " + (new dl(this.c.b(), this.c.n())).c();
/*    */   }
/*    */ 
/*    */   
/*    */   public fl<fj> b() {
/* 46 */     return this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */