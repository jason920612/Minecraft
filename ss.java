/*    */ import java.util.Vector;
/*    */ import javax.swing.JList;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ public class ss
/*    */   extends JList<String>
/*    */   implements pt
/*    */ {
/*    */   private final MinecraftServer a;
/*    */   private int b;
/*    */   
/*    */   public ss(MinecraftServer ☃) {
/* 14 */     this.a = ☃;
/* 15 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void Y_() {
/* 20 */     if (this.b++ % 20 == 0) {
/* 21 */       Vector<String> ☃ = new Vector<>();
/* 22 */       for (int i = 0; i < this.a.ac().v().size(); i++) {
/* 23 */         ☃.add(((tf)this.a.ac().v().get(i)).do().getName());
/*    */       }
/* 25 */       setListData(☃);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ss.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */