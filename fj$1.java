/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements fk.a<fj>
/*    */ {
/*    */   public fj a(fl<fj> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 14 */     stringReader.expect(' ');
/* 15 */     dm dm = (new dm(stringReader, false)).h();
/* 16 */     ate ate = (new dl(dm.b(), dm.c())).a(1, false);
/* 17 */     return new fj(☃, ate);
/*    */   }
/*    */ 
/*    */   
/*    */   public fj a(fl<fj> ☃, hy hy1) {
/* 22 */     return new fj(☃, hy1.k());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fj$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */