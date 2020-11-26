/*    */ import java.text.DecimalFormat;
/*    */ import java.text.DecimalFormatSymbols;
/*    */ import java.text.NumberFormat;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public interface wq
/*    */ {
/*    */   public static final DecimalFormat DECIMAL_FORMAT;
/*    */   
/*    */   static {
/* 11 */     DECIMAL_FORMAT = k.<DecimalFormat>a(new DecimalFormat("########0.00"), ☃ -> ☃.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
/*    */   }
/* 13 */   public static final wq DEFAULT = NumberFormat.getIntegerInstance(Locale.US)::format; static {
/* 14 */     DIVIDE_BY_TEN = (☃ -> DECIMAL_FORMAT.format(☃ * 0.1D));
/* 15 */     DISTANCE = (☃ -> {
/*    */         double d1 = ☃ / 100.0D;
/*    */ 
/*    */         
/*    */         double d2 = d1 / 1000.0D;
/*    */ 
/*    */         
/*    */         return (d2 > 0.5D) ? (DECIMAL_FORMAT.format(d2) + " km") : ((d1 > 0.5D) ? (DECIMAL_FORMAT.format(d1) + " m") : (☃ + " cm"));
/*    */       });
/*    */ 
/*    */     
/* 26 */     TIME = (☃ -> {
/*    */         double d1 = ☃ / 20.0D;
/*    */         double d2 = d1 / 60.0D;
/*    */         double d3 = d2 / 60.0D;
/*    */         double d4 = d3 / 24.0D;
/*    */         double d5 = d4 / 365.0D;
/*    */         return (d5 > 0.5D) ? (DECIMAL_FORMAT.format(d5) + " y") : ((d4 > 0.5D) ? (DECIMAL_FORMAT.format(d4) + " d") : ((d3 > 0.5D) ? (DECIMAL_FORMAT.format(d3) + " h") : ((d2 > 0.5D) ? (DECIMAL_FORMAT.format(d2) + " m") : (d1 + " s"))));
/*    */       });
/*    */   }
/*    */   
/*    */   public static final wq DIVIDE_BY_TEN;
/*    */   public static final wq DISTANCE;
/*    */   public static final wq TIME;
/*    */ }


/* Location:              F:\dw\server.jar!\wq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */