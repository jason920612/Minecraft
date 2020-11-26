/*    */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*    */ import it.unimi.dsi.fastutil.longs.LongSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bwz
/*    */   extends cbo
/*    */ {
/* 11 */   private LongSet a = (LongSet)new LongOpenHashSet();
/* 12 */   private LongSet b = (LongSet)new LongOpenHashSet();
/*    */   
/*    */   public bwz(String ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(gy ☃) {
/* 20 */     this.a = (LongSet)new LongOpenHashSet(☃.o("All"));
/* 21 */     this.b = (LongSet)new LongOpenHashSet(☃.o("Remaining"));
/*    */   }
/*    */ 
/*    */   
/*    */   public gy b(gy ☃) {
/* 26 */     ☃.a("All", this.a.toLongArray());
/* 27 */     ☃.a("Remaining", this.b.toLongArray());
/* 28 */     return ☃;
/*    */   }
/*    */   
/*    */   public void a(long ☃) {
/* 32 */     this.a.add(☃);
/* 33 */     this.b.add(☃);
/*    */   }
/*    */   
/*    */   public boolean b(long ☃) {
/* 37 */     return this.a.contains(☃);
/*    */   }
/*    */   
/*    */   public boolean c(long ☃) {
/* 41 */     return this.b.contains(☃);
/*    */   }
/*    */   
/*    */   public void d(long ☃) {
/* 45 */     this.b.remove(☃);
/*    */   }
/*    */   
/*    */   public LongSet a() {
/* 49 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bwz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */