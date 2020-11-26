/*    */ public class iq
/*    */   extends ig
/*    */ {
/*    */   private final String b;
/*    */   
/*    */   public iq(String ☃) {
/*  7 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public String i() {
/* 11 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public String d() {
/* 16 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public iq j() {
/* 21 */     return new iq(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 26 */     if (this == ☃) {
/* 27 */       return true;
/*    */     }
/*    */     
/* 30 */     if (☃ instanceof iq) {
/* 31 */       iq iq1 = (iq)☃;
/* 32 */       return (this.b.equals(iq1.i()) && super.equals(☃));
/*    */     } 
/*    */     
/* 35 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 40 */     return "TextComponent{text='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + 
/*    */ 
/*    */       
/* 43 */       b() + '}';
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\iq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */