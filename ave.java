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
/*    */ public class ave
/*    */   extends avd
/*    */ {
/* 14 */   private static final avh a = avh.a(new axx[] { atf.aR });
/* 15 */   private static final avh b = avh.a(new axx[] { atf.L });
/* 16 */   private static final avh c = avh.a(new axx[] { atf.dS });
/*    */   
/*    */   public ave(pc ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ade ☃, axy axy1) {
/* 24 */     if (!(☃ instanceof aqc)) {
/* 25 */       return false;
/*    */     }
/*    */     
/* 28 */     boolean bool = false;
/* 29 */     int i = 0;
/*    */     
/* 31 */     for (int j = 0; j < ☃.T_(); j++) {
/* 32 */       ate ate = ☃.a(j);
/* 33 */       if (!ate.a())
/*    */       {
/*    */ 
/*    */         
/* 37 */         if (a.a(ate)) {
/* 38 */           if (bool) {
/* 39 */             return false;
/*    */           }
/* 41 */           bool = true;
/* 42 */         } else if (b.a(ate)) {
/* 43 */           i++;
/* 44 */           if (i > 3) {
/* 45 */             return false;
/*    */           }
/* 47 */         } else if (!c.a(ate)) {
/* 48 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 52 */     return (bool && i >= 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ade ☃) {
/* 57 */     ate ate = new ate(atf.dR, 3);
/* 58 */     gy gy = ate.a("Fireworks");
/* 59 */     he he = new he();
/*    */     
/* 61 */     int i = 0;
/*    */     
/* 63 */     for (int j = 0; j < ☃.T_(); j++) {
/* 64 */       ate ate1 = ☃.a(j);
/* 65 */       if (!ate1.a())
/*    */       {
/*    */ 
/*    */         
/* 69 */         if (b.a(ate1)) {
/* 70 */           i++;
/* 71 */         } else if (c.a(ate1)) {
/* 72 */           gy gy1 = ate1.b("Explosion");
/* 73 */           if (gy1 != null) {
/* 74 */             he.a(gy1);
/*    */           }
/*    */         } 
/*    */       }
/*    */     } 
/* 79 */     gy.a("Flight", (byte)i);
/* 80 */     if (!he.isEmpty()) {
/* 81 */       gy.a("Explosions", he);
/*    */     }
/*    */     
/* 84 */     return ate;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ate d() {
/* 94 */     return new ate(atf.dR);
/*    */   }
/*    */ 
/*    */   
/*    */   public avm<?> a() {
/* 99 */     return avn.g;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ave.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */