/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wy<T>
/*    */   extends xa<T>
/*    */ {
/*    */   private final fc<T> a;
/*    */   
/*    */   public wy(fc<T> ☃, String str1, String str2) {
/* 15 */     super(☃::c, ☃::b, str1, false, str2);
/* 16 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public void a(hy ☃) {
/* 20 */     ☃.d(c().size());
/* 21 */     for (Map.Entry<pc, wz<T>> entry : c().entrySet()) {
/* 22 */       ☃.a(entry.getKey());
/* 23 */       ☃.d(((wz)entry.getValue()).a().size());
/* 24 */       for (T t : ((wz)entry.getValue()).a()) {
/* 25 */         ☃.d(this.a.a(t));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public void b(hy ☃) {
/* 31 */     int i = ☃.g();
/* 32 */     for (int j = 0; j < i; j++) {
/* 33 */       pc pc = ☃.l();
/* 34 */       int k = ☃.g();
/* 35 */       List<T> list = Lists.newArrayList();
/* 36 */       for (int m = 0; m < k; m++) {
/* 37 */         list.add(this.a.a(☃.g()));
/*    */       }
/* 39 */       c().put(pc, wz.a.<T>a().a(list).b(pc));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\wy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */