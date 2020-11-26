/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class atb
/*    */ {
/* 10 */   private final Map<ata, a> a = Maps.newHashMap();
/*    */   private int b;
/*    */   
/*    */   public boolean a(ata ☃) {
/* 14 */     return (a(☃, 0.0F) > 0.0F);
/*    */   }
/*    */   
/*    */   public float a(ata ☃, float f) {
/* 18 */     a a = this.a.get(☃);
/*    */     
/* 20 */     if (a != null) {
/* 21 */       float f1 = (a.a(a) - a.b(a));
/* 22 */       float f2 = a.a(a) - this.b + f;
/* 23 */       return xq.a(f2 / f1, 0.0F, 1.0F);
/*    */     } 
/*    */     
/* 26 */     return 0.0F;
/*    */   }
/*    */   
/*    */   public void a() {
/* 30 */     this.b++;
/*    */     
/* 32 */     if (!this.a.isEmpty()) {
/* 33 */       for (Iterator<Map.Entry<ata, a>> ☃ = this.a.entrySet().iterator(); ☃.hasNext(); ) {
/* 34 */         Map.Entry<ata, a> entry = ☃.next();
/* 35 */         if (a.a((a)entry.getValue()) <= this.b) {
/* 36 */           ☃.remove();
/* 37 */           c(entry.getKey());
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(ata ☃, int i) {
/* 44 */     this.a.put(☃, new a(this.b, this.b + i));
/* 45 */     b(☃, i);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void b(ata ☃, int i) {}
/*    */ 
/*    */   
/*    */   protected void c(ata ☃) {}
/*    */ 
/*    */   
/*    */   class a
/*    */   {
/*    */     private final int b;
/*    */     
/*    */     private final int c;
/*    */ 
/*    */     
/*    */     private a(atb this$0, int ☃, int i) {
/* 64 */       this.b = ☃;
/* 65 */       this.c = i;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\atb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */