/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jy
/*    */   implements iv<iy>
/*    */ {
/* 14 */   public static final pc a = new pc("minecraft:trader_list");
/* 15 */   public static final pc b = new pc("minecraft:brand");
/* 16 */   public static final pc c = new pc("minecraft:book_open");
/* 17 */   public static final pc d = new pc("minecraft:debug/path");
/* 18 */   public static final pc e = new pc("minecraft:debug/neighbors_update");
/* 19 */   public static final pc f = new pc("minecraft:debug/caves");
/* 20 */   public static final pc g = new pc("minecraft:debug/structures");
/* 21 */   public static final pc h = new pc("minecraft:debug/worldgen_attempt");
/*    */   
/*    */   private pc i;
/*    */   
/*    */   private hy j;
/*    */ 
/*    */   
/*    */   public jy() {}
/*    */   
/*    */   public jy(pc ☃, hy hy1) {
/* 31 */     this.i = ☃;
/* 32 */     this.j = hy1;
/*    */     
/* 34 */     if (hy1.writerIndex() > 1048576) {
/* 35 */       throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 41 */     this.i = ☃.l();
/* 42 */     int i = ☃.readableBytes();
/* 43 */     if (i < 0 || i > 1048576) {
/* 44 */       throw new IOException("Payload may not be larger than 1048576 bytes");
/*    */     }
/* 46 */     this.j = new hy(☃.readBytes(i));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 51 */     ☃.a(this.i);
/* 52 */     ☃.writeBytes(this.j.copy());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 57 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */