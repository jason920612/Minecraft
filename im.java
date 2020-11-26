/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class im
/*    */   extends ig
/*    */ {
/*    */   public static Function<String, Supplier<String>> b = ☃ -> ();
/*    */   private final String c;
/*    */   private Supplier<String> d;
/*    */   
/*    */   public im(String ☃) {
/* 13 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String d() {
/* 18 */     if (this.d == null) {
/* 19 */       this.d = b.apply(this.c);
/*    */     }
/* 21 */     return this.d.get();
/*    */   }
/*    */ 
/*    */   
/*    */   public im i() {
/* 26 */     return new im(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 31 */     if (this == ☃) {
/* 32 */       return true;
/*    */     }
/*    */     
/* 35 */     if (☃ instanceof im) {
/* 36 */       im im1 = (im)☃;
/* 37 */       return (this.c.equals(im1.c) && super.equals(☃));
/*    */     } 
/*    */     
/* 40 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 45 */     return "KeybindComponent{keybind='" + this.c + '\'' + ", siblings=" + this.a + ", style=" + 
/*    */ 
/*    */       
/* 48 */       b() + '}';
/*    */   }
/*    */ 
/*    */   
/*    */   public String j() {
/* 53 */     return this.c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\im.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */