/*    */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*    */ import it.unimi.dsi.fastutil.longs.LongSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axt
/*    */   extends cbo
/*    */ {
/* 11 */   private LongSet a = (LongSet)new LongOpenHashSet();
/*    */   
/*    */   public axt(String ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(gy ☃) {
/* 19 */     this.a = (LongSet)new LongOpenHashSet(☃.o("Forced"));
/*    */   }
/*    */ 
/*    */   
/*    */   public gy b(gy ☃) {
/* 24 */     ☃.a("Forced", this.a.toLongArray());
/* 25 */     return ☃;
/*    */   }
/*    */   
/*    */   public LongSet a() {
/* 29 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\axt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */