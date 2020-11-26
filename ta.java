/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*    */ import java.util.Map;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ta
/*    */   extends Long2ObjectOpenHashMap<bnj>
/*    */ {
/* 12 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   public ta(int ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bnj a(long ☃, bnj bnj1) {
/* 20 */     bnj bnj2 = (bnj)super.put(☃, bnj1);
/* 21 */     axm axm = new axm(☃);
/*    */     
/* 23 */     for (int i = axm.a - 1; i <= axm.a + 1; i++) {
/* 24 */       for (int j = axm.b - 1; j <= axm.b + 1; j++) {
/* 25 */         if (i != axm.a || j != axm.b) {
/*    */ 
/*    */ 
/*    */           
/* 29 */           long l = axm.a(i, j);
/* 30 */           bnj bnj3 = (bnj)get(l);
/* 31 */           if (bnj3 != null) {
/* 32 */             bnj1.H();
/* 33 */             bnj3.H();
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 38 */     return bnj2;
/*    */   }
/*    */ 
/*    */   
/*    */   public bnj a(Long ☃, bnj bnj1) {
/* 43 */     return a(☃.longValue(), bnj1);
/*    */   }
/*    */ 
/*    */   
/*    */   public bnj a(long ☃) {
/* 48 */     bnj bnj = (bnj)super.remove(☃);
/* 49 */     axm axm = new axm(☃);
/*    */     
/* 51 */     for (int i = axm.a - 1; i <= axm.a + 1; i++) {
/* 52 */       for (int j = axm.b - 1; j <= axm.b + 1; j++) {
/* 53 */         if (i != axm.a || j != axm.b) {
/*    */ 
/*    */ 
/*    */           
/* 57 */           bnj bnj1 = (bnj)get(axm.a(i, j));
/* 58 */           if (bnj1 != null) {
/* 59 */             bnj1.I();
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 64 */     return bnj;
/*    */   }
/*    */ 
/*    */   
/*    */   public bnj a(Object ☃) {
/* 69 */     return a(((Long)☃).longValue());
/*    */   }
/*    */ 
/*    */   
/*    */   public void putAll(Map<? extends Long, ? extends bnj> ☃) {
/* 74 */     throw new RuntimeException("Not yet implemented");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean remove(Object ☃, Object object1) {
/* 79 */     throw new RuntimeException("Not yet implemented");
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */