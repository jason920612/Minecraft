/*    */ import javax.annotation.Nullable;
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
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/*    */   public final aog a;
/*    */   private boolean d = true;
/*    */   private int e;
/*    */   private int f;
/* 38 */   private int g = 127;
/* 39 */   private int h = 127;
/*    */   private int i;
/*    */   public int b;
/*    */   
/*    */   public a(cbs ☃, aog aog1) {
/* 44 */     this.a = aog1;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public iv<?> a(ate ☃) {
/* 49 */     if (this.d) {
/* 50 */       this.d = false;
/* 51 */       return new kk(atj.e(☃), this.c.f, this.c.d, this.c.i.values(), this.c.g, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
/* 52 */     }  if (this.i++ % 5 == 0) {
/* 53 */       return new kk(atj.e(☃), this.c.f, this.c.d, this.c.i.values(), this.c.g, 0, 0, 0, 0);
/*    */     }
/*    */     
/* 56 */     return null;
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i) {
/* 60 */     if (this.d) {
/* 61 */       this.e = Math.min(this.e, ☃);
/* 62 */       this.f = Math.min(this.f, i);
/* 63 */       this.g = Math.max(this.g, ☃);
/* 64 */       this.h = Math.max(this.h, i);
/*    */     } else {
/* 66 */       this.d = true;
/* 67 */       this.e = ☃;
/* 68 */       this.f = i;
/* 69 */       this.g = ☃;
/* 70 */       this.h = i;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cbs$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */