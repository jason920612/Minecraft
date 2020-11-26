/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajb
/*    */ {
/*    */   private final afb a;
/* 11 */   private final List<aer> b = Lists.newArrayList();
/* 12 */   private final List<aer> c = Lists.newArrayList();
/*    */   
/*    */   public ajb(afb ☃) {
/* 15 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public void a() {
/* 19 */     this.b.clear();
/* 20 */     this.c.clear();
/*    */   }
/*    */   
/*    */   public boolean a(aer ☃) {
/* 24 */     if (this.b.contains(☃)) {
/* 25 */       return true;
/*    */     }
/* 27 */     if (this.c.contains(☃)) {
/* 28 */       return false;
/*    */     }
/*    */     
/* 31 */     this.a.m.A.a("canSee");
/* 32 */     boolean bool = this.a.D(☃);
/* 33 */     this.a.m.A.e();
/* 34 */     if (bool) {
/* 35 */       this.b.add(☃);
/*    */     } else {
/* 37 */       this.c.add(☃);
/*    */     } 
/* 39 */     return bool;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ajb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */