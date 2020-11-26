/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ef
/*    */   implements dy<IntegerArgumentType>
/*    */ {
/*    */   public void a(IntegerArgumentType ☃, hy hy1) {
/* 15 */     boolean bool1 = (☃.getMinimum() != Integer.MIN_VALUE);
/* 16 */     boolean bool2 = (☃.getMaximum() != Integer.MAX_VALUE);
/* 17 */     hy1.writeByte(ec.a(bool1, bool2));
/* 18 */     if (bool1) {
/* 19 */       hy1.writeInt(☃.getMinimum());
/*    */     }
/* 21 */     if (bool2) {
/* 22 */       hy1.writeInt(☃.getMaximum());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public IntegerArgumentType a(hy ☃) {
/* 28 */     byte b = ☃.readByte();
/* 29 */     int i = ec.a(b) ? ☃.readInt() : Integer.MIN_VALUE;
/* 30 */     int j = ec.b(b) ? ☃.readInt() : Integer.MAX_VALUE;
/* 31 */     return IntegerArgumentType.integer(i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(IntegerArgumentType ☃, JsonObject jsonObject) {
/* 36 */     if (☃.getMinimum() != Integer.MIN_VALUE) {
/* 37 */       jsonObject.addProperty("min", Integer.valueOf(☃.getMinimum()));
/*    */     }
/* 39 */     if (☃.getMaximum() != Integer.MAX_VALUE)
/* 40 */       jsonObject.addProperty("max", Integer.valueOf(☃.getMaximum())); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */