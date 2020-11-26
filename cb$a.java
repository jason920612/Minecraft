/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   implements dy<cb>
/*     */ {
/*     */   public void a(cb ☃, hy hy1) {
/* 147 */     byte b = 0;
/* 148 */     if (cb.a(☃)) {
/* 149 */       b = (byte)(b | 0x1);
/*     */     }
/* 151 */     if (cb.b(☃)) {
/* 152 */       b = (byte)(b | 0x2);
/*     */     }
/* 154 */     hy1.writeByte(b);
/*     */   }
/*     */ 
/*     */   
/*     */   public cb a(hy ☃) {
/* 159 */     byte b = ☃.readByte();
/* 160 */     return new cb(((b & 0x1) != 0), ((b & 0x2) != 0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cb ☃, JsonObject jsonObject) {
/* 165 */     jsonObject.addProperty("amount", cb.a(☃) ? "single" : "multiple");
/* 166 */     jsonObject.addProperty("type", cb.b(☃) ? "players" : "entities");
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */