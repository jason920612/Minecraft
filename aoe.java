/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aoe
/*    */ {
/*    */   public boolean a;
/*    */   public boolean b;
/*    */   public boolean c;
/*    */   public boolean d;
/*    */   public boolean e = true;
/* 12 */   private double f = 0.05000000074505806D;
/* 13 */   private float g = 0.1F;
/*    */   
/*    */   public void a(gy ☃) {
/* 16 */     gy gy1 = new gy();
/*    */     
/* 18 */     gy1.a("invulnerable", this.a);
/* 19 */     gy1.a("flying", this.b);
/* 20 */     gy1.a("mayfly", this.c);
/* 21 */     gy1.a("instabuild", this.d);
/* 22 */     gy1.a("mayBuild", this.e);
/* 23 */     gy1.a("flySpeed", (float)this.f);
/* 24 */     gy1.a("walkSpeed", this.g);
/* 25 */     ☃.a("abilities", gy1);
/*    */   }
/*    */   
/*    */   public void b(gy ☃) {
/* 29 */     if (☃.c("abilities", 10)) {
/* 30 */       gy gy1 = ☃.p("abilities");
/*    */       
/* 32 */       this.a = gy1.q("invulnerable");
/* 33 */       this.b = gy1.q("flying");
/* 34 */       this.c = gy1.q("mayfly");
/* 35 */       this.d = gy1.q("instabuild");
/*    */       
/* 37 */       if (gy1.c("flySpeed", 99)) {
/* 38 */         this.f = gy1.j("flySpeed");
/* 39 */         this.g = gy1.j("walkSpeed");
/*    */       } 
/* 41 */       if (gy1.c("mayBuild", 1)) {
/* 42 */         this.e = gy1.q("mayBuild");
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public float a() {
/* 49 */     return (float)this.f;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float b() {
/* 57 */     return this.g;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\aoe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */