/*    */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*    */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*    */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ec
/*    */ {
/*    */   public static void a() {
/* 18 */     dz.a(new pc("brigadier:bool"), BoolArgumentType.class, new ea<>(BoolArgumentType::bool));
/* 19 */     dz.a(new pc("brigadier:float"), FloatArgumentType.class, new ee());
/* 20 */     dz.a(new pc("brigadier:double"), DoubleArgumentType.class, new ed());
/* 21 */     dz.a(new pc("brigadier:integer"), IntegerArgumentType.class, new ef());
/* 22 */     dz.a(new pc("brigadier:string"), StringArgumentType.class, new eg());
/*    */   }
/*    */   
/*    */   public static byte a(boolean ☃, boolean bool1) {
/* 26 */     byte b = 0;
/* 27 */     if (☃) {
/* 28 */       b = (byte)(b | 0x1);
/*    */     }
/* 30 */     if (bool1) {
/* 31 */       b = (byte)(b | 0x2);
/*    */     }
/* 33 */     return b;
/*    */   }
/*    */   
/*    */   public static boolean a(byte ☃) {
/* 37 */     return ((☃ & 0x1) != 0);
/*    */   }
/*    */   
/*    */   public static boolean b(byte ☃) {
/* 41 */     return ((☃ & 0x2) != 0);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */