/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ayn
/*    */   extends xy.a
/*    */ {
/*    */   private final gy b;
/*    */   
/*    */   public ayn() {
/* 15 */     super(1);
/*    */     
/* 17 */     this.b = new gy();
/* 18 */     this.b.a("id", "minecraft:pig");
/*    */   }
/*    */   
/*    */   public ayn(gy ☃) {
/* 22 */     this(☃.c("Weight", 99) ? ☃.h("Weight") : 1, ☃.p("Entity"));
/*    */   }
/*    */   
/*    */   public ayn(int ☃, gy gy1) {
/* 26 */     super(☃);
/*    */     
/* 28 */     this.b = gy1;
/*    */   }
/*    */   
/*    */   public gy a() {
/* 32 */     gy ☃ = new gy();
/*    */     
/* 34 */     if (!this.b.c("id", 8)) {
/* 35 */       this.b.a("id", "minecraft:pig");
/* 36 */     } else if (!this.b.l("id").contains(":")) {
/* 37 */       this.b.a("id", (new pc(this.b.l("id"))).toString());
/*    */     } 
/* 39 */     ☃.a("Entity", this.b);
/* 40 */     ☃.b("Weight", this.a);
/*    */     
/* 42 */     return ☃;
/*    */   }
/*    */   
/*    */   public gy b() {
/* 46 */     return this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ayn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */