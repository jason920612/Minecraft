/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.text.DecimalFormat;
/*    */ import java.text.DecimalFormatSymbols;
/*    */ import java.util.Locale;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.Timer;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ public class st extends JComponent {
/*    */   private static final DecimalFormat a;
/*    */   
/*    */   static {
/* 16 */     a = k.<DecimalFormat>a(new DecimalFormat("########0.000"), ☃ -> ☃.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
/*    */   }
/* 18 */   private final int[] b = new int[256];
/*    */   private int c;
/* 20 */   private final String[] d = new String[11];
/*    */   private final MinecraftServer e;
/*    */   
/*    */   public st(MinecraftServer ☃) {
/* 24 */     this.e = ☃;
/* 25 */     setPreferredSize(new Dimension(456, 246));
/* 26 */     setMinimumSize(new Dimension(456, 246));
/* 27 */     setMaximumSize(new Dimension(456, 246));
/* 28 */     (new Timer(500, ☃ -> a())).start();
/* 29 */     setBackground(Color.BLACK);
/*    */   }
/*    */   
/*    */   private void a() {
/* 33 */     long ☃ = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
/* 34 */     this.d[0] = "Memory use: " + (☃ / 1024L / 1024L) + " mb (" + (Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()) + "% free)";
/* 35 */     this.d[1] = "Avg tick: " + a.format(a(this.e.d) * 1.0E-6D) + " ms";
/* 36 */     this.b[this.c++ & 0xFF] = (int)(☃ * 100L / Runtime.getRuntime().maxMemory());
/* 37 */     repaint();
/*    */   }
/*    */   
/*    */   private double a(long[] ☃) {
/* 41 */     long l = 0L;
/* 42 */     for (long l1 : ☃) {
/* 43 */       l += l1;
/*    */     }
/* 45 */     return l / ☃.length;
/*    */   }
/*    */ 
/*    */   
/*    */   public void paint(Graphics ☃) {
/* 50 */     ☃.setColor(new Color(16777215));
/* 51 */     ☃.fillRect(0, 0, 456, 246);
/*    */     int i;
/* 53 */     for (i = 0; i < 256; i++) {
/* 54 */       int j = this.b[i + this.c & 0xFF];
/* 55 */       ☃.setColor(new Color(j + 28 << 16));
/* 56 */       ☃.fillRect(i, 100 - j, 1, j);
/*    */     } 
/* 58 */     ☃.setColor(Color.BLACK);
/* 59 */     for (i = 0; i < this.d.length; i++) {
/* 60 */       String str = this.d[i];
/* 61 */       if (str != null)
/* 62 */         ☃.drawString(str, 32, 116 + i * 16); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\st.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */