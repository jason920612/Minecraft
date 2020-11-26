/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class bc
/*    */ {
/* 20 */   public static final bc a = new bc(null);
/*    */   
/*    */   @Nullable
/*    */   private final gy b;
/*    */   
/*    */   public bc(@Nullable gy ☃) {
/* 26 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public boolean a(ate ☃) {
/* 30 */     if (this == a) {
/* 31 */       return true;
/*    */     }
/* 33 */     return a(☃.n());
/*    */   }
/*    */   
/*    */   public boolean a(aer ☃) {
/* 37 */     if (this == a) {
/* 38 */       return true;
/*    */     }
/* 40 */     return a(b(☃));
/*    */   }
/*    */   
/*    */   public boolean a(@Nullable ho ☃) {
/* 44 */     if (☃ == null) {
/* 45 */       return (this == a);
/*    */     }
/*    */     
/* 48 */     if (this.b != null && !hk.a(this.b, ☃, true)) {
/* 49 */       return false;
/*    */     }
/*    */     
/* 52 */     return true;
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 56 */     if (this == a || this.b == null) {
/* 57 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 60 */     return (JsonElement)new JsonPrimitive(this.b.toString());
/*    */   }
/*    */   public static bc a(@Nullable JsonElement ☃) {
/*    */     gy gy1;
/* 64 */     if (☃ == null || ☃.isJsonNull()) {
/* 65 */       return a;
/*    */     }
/*    */     
/*    */     try {
/* 69 */       gy1 = hp.a(xj.a(☃, "nbt"));
/* 70 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 71 */       throw new JsonSyntaxException("Invalid nbt tag: " + commandSyntaxException.getMessage());
/*    */     } 
/* 73 */     return new bc(gy1);
/*    */   }
/*    */   
/*    */   public static gy b(aer ☃) {
/* 77 */     gy gy1 = ☃.e(new gy());
/* 78 */     if (☃ instanceof aog) {
/* 79 */       ate ate = ((aog)☃).bB.i();
/* 80 */       if (!ate.a()) {
/* 81 */         gy1.a("SelectedItem", ate.b(new gy()));
/*    */       }
/*    */     } 
/* 84 */     return gy1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */