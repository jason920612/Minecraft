/*    */ import java.io.IOException;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class kk
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private byte b;
/*    */   private boolean c;
/*    */   private cbq[] d;
/*    */   private int e;
/*    */   private int f;
/*    */   private int g;
/*    */   private int h;
/*    */   private byte[] i;
/*    */   
/*    */   public kk() {}
/*    */   
/*    */   public kk(int ☃, byte b, boolean bool, Collection<cbq> collection, byte[] arrayOfByte, int i, int j, int k, int m) {
/* 28 */     this.a = ☃;
/* 29 */     this.b = b;
/* 30 */     this.c = bool;
/* 31 */     this.d = collection.<cbq>toArray(new cbq[collection.size()]);
/* 32 */     this.e = i;
/* 33 */     this.f = j;
/* 34 */     this.g = k;
/* 35 */     this.h = m;
/*    */     
/* 37 */     this.i = new byte[k * m];
/* 38 */     for (int n = 0; n < k; n++) {
/* 39 */       for (int i1 = 0; i1 < m; i1++) {
/* 40 */         this.i[n + i1 * k] = arrayOfByte[i + n + (j + i1) * 128];
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 47 */     this.a = ☃.g();
/* 48 */     this.b = ☃.readByte();
/* 49 */     this.c = ☃.readBoolean();
/* 50 */     this.d = new cbq[☃.g()];
/* 51 */     for (int i = 0; i < this.d.length; i++) {
/* 52 */       cbq.a a = ☃.<cbq.a>a(cbq.a.class);
/* 53 */       this.d[i] = new cbq(a, ☃.readByte(), ☃.readByte(), (byte)(☃.readByte() & 0xF), ☃.readBoolean() ? ☃.f() : null);
/*    */     } 
/* 55 */     this.g = ☃.readUnsignedByte();
/* 56 */     if (this.g > 0) {
/* 57 */       this.h = ☃.readUnsignedByte();
/* 58 */       this.e = ☃.readUnsignedByte();
/* 59 */       this.f = ☃.readUnsignedByte();
/* 60 */       this.i = ☃.a();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 66 */     ☃.d(this.a);
/* 67 */     ☃.writeByte(this.b);
/* 68 */     ☃.writeBoolean(this.c);
/* 69 */     ☃.d(this.d.length);
/* 70 */     for (cbq cbq1 : this.d) {
/* 71 */       ☃.a(cbq1.b());
/* 72 */       ☃.writeByte(cbq1.c());
/* 73 */       ☃.writeByte(cbq1.d());
/* 74 */       ☃.writeByte(cbq1.e() & 0xF);
/* 75 */       if (cbq1.g() != null) {
/* 76 */         ☃.writeBoolean(true);
/* 77 */         ☃.a(cbq1.g());
/*    */       } else {
/* 79 */         ☃.writeBoolean(false);
/*    */       } 
/*    */     } 
/* 82 */     ☃.writeByte(this.g);
/* 83 */     if (this.g > 0) {
/* 84 */       ☃.writeByte(this.h);
/* 85 */       ☃.writeByte(this.e);
/* 86 */       ☃.writeByte(this.f);
/* 87 */       ☃.a(this.i);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 93 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */