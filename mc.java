/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.IOException;
/*    */ import java.util.Collection;
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
/*    */ public class mc
/*    */   implements iv<iy>
/*    */ {
/*    */   private List<avk> a;
/*    */   
/*    */   public mc() {}
/*    */   
/*    */   public mc(Collection<avk> ☃) {
/* 22 */     this.a = Lists.newArrayList(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 27 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 32 */     this.a = Lists.newArrayList();
/* 33 */     int i = ☃.g();
/* 34 */     for (int j = 0; j < i; j++) {
/* 35 */       this.a.add(avn.a(☃));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 41 */     ☃.d(this.a.size());
/* 42 */     for (avk avk : this.a)
/* 43 */       avn.a(avk, ☃); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\mc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */