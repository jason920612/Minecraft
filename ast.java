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
/*    */ 
/*    */ 
/*    */ public class ast
/*    */   extends ata
/*    */ {
/*    */   public ast(ata.a ☃) {
/* 17 */     super(☃);
/*    */     
/* 19 */     a(new pc("cast"), (☃, axy1, afa1) -> {
/*    */           if (afa1 == null) {
/*    */             return 0.0F;
/*    */           }
/*    */           
/*    */           boolean bool1 = (afa1.cB() == ☃);
/*    */           
/*    */           boolean bool2 = (afa1.cC() == ☃);
/*    */           
/*    */           if (afa1.cB().b() instanceof ast) {
/*    */             bool2 = false;
/*    */           }
/* 31 */           return ((bool1 || bool2) && afa1 instanceof aog && ((aog)afa1).cb != null) ? 1.0F : 0.0F;
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/* 38 */     ate ate = aog1.b(adk1);
/* 39 */     if (aog1.cb != null) {
/* 40 */       int i = aog1.cb.b(ate);
/* 41 */       ate.a(i, aog1);
/* 42 */       aog1.a(adk1);
/* 43 */       ☃.a((aog)null, aog1.q, aog1.r, aog1.s, wj.V, wk.g, 1.0F, 0.4F / (i.nextFloat() * 0.4F + 0.8F));
/*    */     } else {
/* 45 */       ☃.a((aog)null, aog1.q, aog1.r, aog1.s, wj.X, wk.g, 0.5F, 0.4F / (i.nextFloat() * 0.4F + 0.8F));
/* 46 */       if (!☃.B) {
/* 47 */         amg amg = new amg(☃, aog1);
/*    */         
/* 49 */         int i = awg.c(ate);
/* 50 */         if (i > 0) {
/* 51 */           amg.a(i);
/*    */         }
/* 53 */         int j = awg.b(ate);
/* 54 */         if (j > 0) {
/* 55 */           amg.b(j);
/*    */         }
/*    */         
/* 58 */         ☃.a(amg);
/*    */       } 
/* 60 */       aog1.a(adk1);
/* 61 */       aog1.b(ws.c.b(this));
/*    */     } 
/* 63 */     return new adn<>(adm.a, ate);
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 68 */     return 1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ast.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */