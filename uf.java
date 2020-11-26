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
/*    */ public class uf
/*    */   implements on
/*    */ {
/* 14 */   private static final ij a = new ir("multiplayer.status.request_handled", new Object[0]);
/*    */   
/*    */   private final MinecraftServer b;
/*    */   private final hw c;
/*    */   private boolean d;
/*    */   
/*    */   public uf(MinecraftServer ☃, hw hw1) {
/* 21 */     this.b = ☃;
/* 22 */     this.c = hw1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(ij ☃) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(op ☃) {
/* 37 */     if (this.d) {
/* 38 */       this.c.a(a);
/*    */       return;
/*    */     } 
/* 41 */     this.d = true;
/* 42 */     this.c.a(new ol(this.b.as()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(oo ☃) {
/* 47 */     this.c.a(new ok(☃.b()));
/* 48 */     this.c.a(a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar\\uf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */