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
/*    */ 
/*    */ 
/*    */ public class jo
/*    */   implements iv<iy>
/*    */ {
/*    */   private axm a;
/*    */   private a[] b;
/*    */   
/*    */   public jo() {}
/*    */   
/*    */   public jo(int ☃, short[] arrayOfShort, bnj bnj1) {
/* 22 */     this.a = new axm(bnj1.b, bnj1.c);
/*    */     
/* 24 */     this.b = new a[☃];
/* 25 */     for (int i = 0; i < this.b.length; i++) {
/* 26 */       this.b[i] = new a(this, arrayOfShort[i], bnj1);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 32 */     this.a = new axm(☃.readInt(), ☃.readInt());
/* 33 */     this.b = new a[☃.g()];
/*    */     
/* 35 */     for (int i = 0; i < this.b.length; i++) {
/* 36 */       this.b[i] = new a(this, ☃.readShort(), bcs.e.a(☃.g()));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 42 */     ☃.writeInt(this.a.a);
/* 43 */     ☃.writeInt(this.a.b);
/* 44 */     ☃.d(this.b.length);
/* 45 */     for (a a1 : this.b) {
/* 46 */       ☃.writeShort(a1.b());
/* 47 */       ☃.d(bcs.l(a1.c()));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 53 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public class a
/*    */   {
/*    */     private final short b;
/*    */     
/*    */     private final blc c;
/*    */ 
/*    */     
/*    */     public a(jo ☃, short s, blc blc1) {
/* 65 */       this.b = s;
/* 66 */       this.c = blc1;
/*    */     }
/*    */     
/*    */     public a(jo ☃, short s, bnj bnj1) {
/* 70 */       this.b = s;
/* 71 */       this.c = bnj1.a_(a());
/*    */     }
/*    */     
/*    */     public el a() {
/* 75 */       return new el(jo.a(this.a).a(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
/*    */     }
/*    */     
/*    */     public short b() {
/* 79 */       return this.b;
/*    */     }
/*    */     
/*    */     public blc c() {
/* 83 */       return this.c;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */