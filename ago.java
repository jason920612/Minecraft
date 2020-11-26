/*    */ import java.util.List;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ago
/*    */   extends agt
/*    */ {
/*    */   private final ajp a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public ago(ajp ☃) {
/* 16 */     this.a = ☃;
/* 17 */     this.c = a(☃);
/*    */   }
/*    */   
/*    */   protected int a(ajp ☃) {
/* 21 */     return 200 + ☃.ce().nextInt(200) % 20;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 26 */     if (this.a.dE()) {
/* 27 */       return false;
/*    */     }
/*    */     
/* 30 */     if (this.a.dB()) {
/* 31 */       return true;
/*    */     }
/*    */     
/* 34 */     if (this.c > 0) {
/* 35 */       this.c--;
/* 36 */       return false;
/*    */     } 
/*    */     
/* 39 */     this.c = a(this.a);
/*    */     
/* 41 */     Predicate<ajp> ☃ = ☃ -> (☃.dD() || !☃.dB());
/* 42 */     List<ajp> list = (List)this.a.m.a(this.a.getClass(), this.a.bD().c(8.0D, 8.0D, 8.0D), ☃);
/*    */     
/* 44 */     ajp ajp1 = list.stream().filter(ajp::dD).findAny().orElse(this.a);
/*    */     
/* 46 */     ajp1.a(list.stream().filter(☃ -> !☃.dB()));
/*    */     
/* 48 */     return this.a.dB();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 53 */     return (this.a.dB() && this.a.dF());
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 58 */     this.b = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 63 */     this.a.dC();
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 68 */     if (--this.b > 0) {
/*    */       return;
/*    */     }
/* 71 */     this.b = 10;
/*    */     
/* 73 */     this.a.dG();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ago.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */