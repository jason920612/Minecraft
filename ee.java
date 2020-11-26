/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ee
/*    */   implements dy<FloatArgumentType>
/*    */ {
/*    */   public void a(FloatArgumentType ☃, hy hy1) {
/* 15 */     boolean bool1 = (☃.getMinimum() != -3.4028235E38F);
/* 16 */     boolean bool2 = (☃.getMaximum() != Float.MAX_VALUE);
/* 17 */     hy1.writeByte(ec.a(bool1, bool2));
/* 18 */     if (bool1) {
/* 19 */       hy1.writeFloat(☃.getMinimum());
/*    */     }
/* 21 */     if (bool2) {
/* 22 */       hy1.writeFloat(☃.getMaximum());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public FloatArgumentType a(hy ☃) {
/* 28 */     byte b = ☃.readByte();
/* 29 */     float f1 = ec.a(b) ? ☃.readFloat() : -3.4028235E38F;
/* 30 */     float f2 = ec.b(b) ? ☃.readFloat() : Float.MAX_VALUE;
/* 31 */     return FloatArgumentType.floatArg(f1, f2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(FloatArgumentType ☃, JsonObject jsonObject) {
/* 36 */     if (☃.getMinimum() != -3.4028235E38F) {
/* 37 */       jsonObject.addProperty("min", Float.valueOf(☃.getMinimum()));
/*    */     }
/* 39 */     if (☃.getMaximum() != Float.MAX_VALUE)
/* 40 */       jsonObject.addProperty("max", Float.valueOf(☃.getMaximum())); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */