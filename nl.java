/*    */ import java.io.IOException;
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
/*    */ public class nl
/*    */   implements iv<me>
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   private boolean c;
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = ☃.g();
/* 31 */     this.b = ☃.e(32767);
/* 32 */     this.c = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 37 */     ☃.d(this.a);
/* 38 */     ☃.a(this.b);
/* 39 */     ☃.writeBoolean(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(me ☃) {
/* 44 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public axh a(axy ☃) {
/* 49 */     aer aer = ☃.a(this.a);
/* 50 */     if (aer instanceof apm) {
/* 51 */       return ((apm)aer).f();
/*    */     }
/* 53 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String b() {
/* 58 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 62 */     return this.c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\nl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */