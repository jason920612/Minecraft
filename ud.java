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
/*    */ public class ud
/*    */   implements nv
/*    */ {
/*    */   private final MinecraftServer a;
/*    */   private final hw b;
/*    */   
/*    */   public ud(MinecraftServer ☃, hw hw1) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = hw1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nu ☃) {
/* 24 */     switch (null.a[☃.b().ordinal()]) {
/*    */       case 1:
/* 26 */         this.b.a(hx.d);
/*    */         
/* 28 */         if (☃.c() > 404) {
/* 29 */           ij ij = new ir("multiplayer.disconnect.outdated_server", new Object[] { "1.13.2" });
/* 30 */           this.b.a(new oc(ij));
/* 31 */           this.b.a(ij);
/* 32 */         } else if (☃.c() < 404) {
/* 33 */           ij ij = new ir("multiplayer.disconnect.outdated_client", new Object[] { "1.13.2" });
/* 34 */           this.b.a(new oc(ij));
/* 35 */           this.b.a(ij);
/*    */         } else {
/* 37 */           this.b.a(new ue(this.a, this.b));
/*    */         } 
/*    */         return;
/*    */       case 2:
/* 41 */         this.b.a(hx.c);
/* 42 */         this.b.a(new uf(this.a, this.b));
/*    */         return;
/*    */     } 
/* 45 */     throw new UnsupportedOperationException("Invalid intention " + ☃.b());
/*    */   }
/*    */   
/*    */   public void a(ij ☃) {}
/*    */ }


/* Location:              F:\dw\server.jar\\ud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */