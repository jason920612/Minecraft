/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ 
/*    */ 
/*    */ public class atg
/*    */   extends ata
/*    */ {
/* 22 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   public atg(ata.a ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/* 30 */     ate ate = aog1.b(adk1);
/* 31 */     gy gy = ate.n();
/*    */     
/* 33 */     if (!aog1.bV.d) {
/* 34 */       aog1.a(adk1, ate.a);
/*    */     }
/*    */     
/* 37 */     if (gy == null || !gy.c("Recipes", 9)) {
/* 38 */       a.error("Tag not valid: {}", gy);
/* 39 */       return new adn<>(adm.c, ate);
/*    */     } 
/*    */     
/* 42 */     if (!☃.B) {
/* 43 */       he he = gy.d("Recipes", 8);
/* 44 */       List<avk> list = Lists.newArrayList();
/* 45 */       for (int i = 0; i < he.size(); i++) {
/* 46 */         String str = he.m(i);
/* 47 */         avk avk = ☃.z().aK().a(new pc(str));
/* 48 */         if (avk != null) {
/* 49 */           list.add(avk);
/*    */         } else {
/* 51 */           a.error("Invalid recipe: {}", str);
/* 52 */           return new adn<>(adm.c, ate);
/*    */         } 
/*    */       } 
/*    */       
/* 56 */       aog1.a(list);
/* 57 */       aog1.b(ws.c.b(this));
/*    */     } 
/*    */     
/* 60 */     return new adn<>(adm.a, ate);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\atg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */