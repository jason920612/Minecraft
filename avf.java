/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
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
/*    */ public class avf
/*    */   extends avd
/*    */ {
/* 17 */   private static final avh a = avh.a(new axx[] { atf.dS });
/*    */   
/*    */   public avf(pc ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ade ☃, axy axy1) {
/* 25 */     if (!(☃ instanceof aqc)) {
/* 26 */       return false;
/*    */     }
/*    */     
/* 29 */     boolean bool1 = false;
/* 30 */     boolean bool2 = false;
/*    */     
/* 32 */     for (int i = 0; i < ☃.T_(); i++) {
/* 33 */       ate ate = ☃.a(i);
/* 34 */       if (!ate.a())
/*    */       {
/*    */ 
/*    */         
/* 38 */         if (ate.b() instanceof asd) {
/* 39 */           bool1 = true;
/* 40 */         } else if (a.a(ate)) {
/* 41 */           if (bool2) {
/* 42 */             return false;
/*    */           }
/* 44 */           bool2 = true;
/*    */         } else {
/* 46 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 50 */     return (bool2 && bool1);
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ade ☃) {
/* 55 */     List<Integer> list = Lists.newArrayList();
/* 56 */     ate ate = null;
/*    */     
/* 58 */     for (int i = 0; i < ☃.T_(); i++) {
/* 59 */       ate ate1 = ☃.a(i);
/*    */       
/* 61 */       ata ata = ate1.b();
/* 62 */       if (ata instanceof asd) {
/* 63 */         list.add(Integer.valueOf(((asd)ata).d().f()));
/* 64 */       } else if (a.a(ate1)) {
/* 65 */         ate = ate1.i();
/* 66 */         ate.e(1);
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 71 */     if (ate == null || list.isEmpty()) {
/* 72 */       return ate.a;
/*    */     }
/*    */     
/* 75 */     ate.a("Explosion").b("FadeColors", list);
/*    */     
/* 77 */     return ate;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public avm<?> a() {
/* 87 */     return avn.i;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\avf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */