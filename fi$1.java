/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements fk.a<fi>
/*    */ {
/*    */   public fi a(fl<fi> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 16 */     stringReader.expect(' ');
/* 17 */     float f1 = (float)stringReader.readDouble();
/* 18 */     stringReader.expect(' ');
/* 19 */     float f2 = (float)stringReader.readDouble();
/* 20 */     stringReader.expect(' ');
/* 21 */     float f3 = (float)stringReader.readDouble();
/* 22 */     stringReader.expect(' ');
/* 23 */     float f4 = (float)stringReader.readDouble();
/* 24 */     return new fi(f1, f2, f3, f4);
/*    */   }
/*    */ 
/*    */   
/*    */   public fi a(fl<fi> ☃, hy hy1) {
/* 29 */     return new fi(hy1.readFloat(), hy1.readFloat(), hy1.readFloat(), hy1.readFloat());
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fi$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */