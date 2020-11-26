/*    */ import net.minecraft.server.MinecraftServer;
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
/*    */ public class wb
/*    */   implements bt
/*    */ {
/* 15 */   private final StringBuffer a = new StringBuffer();
/*    */   private final MinecraftServer b;
/*    */   
/*    */   public wb(MinecraftServer ☃) {
/* 19 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public void d() {
/* 23 */     this.a.setLength(0);
/*    */   }
/*    */   
/*    */   public String e() {
/* 27 */     return this.a.toString();
/*    */   }
/*    */   
/*    */   public bu f() {
/* 31 */     td ☃ = this.b.a(bod.a);
/* 32 */     return new bu(this, new cee(☃.n()), ced.a, ☃, 4, "Recon", new iq("Rcon"), this.b, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ij ☃) {
/* 37 */     this.a.append(☃.getString());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean B_() {
/* 52 */     return this.b.k();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\wb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */