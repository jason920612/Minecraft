/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.IOException;
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
/*    */ public class kc
/*    */   implements iv<iy>
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   private float d;
/*    */   private List<el> e;
/*    */   private float f;
/*    */   private float g;
/*    */   private float h;
/*    */   
/*    */   public kc() {}
/*    */   
/*    */   public kc(double ☃, double d1, double d2, float f, List<el> list, cee cee1) {
/* 28 */     this.a = ☃;
/* 29 */     this.b = d1;
/* 30 */     this.c = d2;
/* 31 */     this.d = f;
/* 32 */     this.e = Lists.newArrayList(list);
/*    */     
/* 34 */     if (cee1 != null) {
/* 35 */       this.f = (float)cee1.b;
/* 36 */       this.g = (float)cee1.c;
/* 37 */       this.h = (float)cee1.d;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 43 */     this.a = ☃.readFloat();
/* 44 */     this.b = ☃.readFloat();
/* 45 */     this.c = ☃.readFloat();
/* 46 */     this.d = ☃.readFloat();
/* 47 */     int i = ☃.readInt();
/*    */     
/* 49 */     this.e = Lists.newArrayListWithCapacity(i);
/*    */     
/* 51 */     int j = (int)this.a;
/* 52 */     int k = (int)this.b;
/* 53 */     int m = (int)this.c;
/* 54 */     for (int n = 0; n < i; n++) {
/* 55 */       int i1 = ☃.readByte() + j;
/* 56 */       int i2 = ☃.readByte() + k;
/* 57 */       int i3 = ☃.readByte() + m;
/* 58 */       this.e.add(new el(i1, i2, i3));
/*    */     } 
/*    */     
/* 61 */     this.f = ☃.readFloat();
/* 62 */     this.g = ☃.readFloat();
/* 63 */     this.h = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 68 */     ☃.writeFloat((float)this.a);
/* 69 */     ☃.writeFloat((float)this.b);
/* 70 */     ☃.writeFloat((float)this.c);
/* 71 */     ☃.writeFloat(this.d);
/* 72 */     ☃.writeInt(this.e.size());
/*    */     
/* 74 */     int i = (int)this.a;
/* 75 */     int j = (int)this.b;
/* 76 */     int k = (int)this.c;
/* 77 */     for (el el : this.e) {
/* 78 */       int m = el.o() - i;
/* 79 */       int n = el.p() - j;
/* 80 */       int i1 = el.q() - k;
/* 81 */       ☃.writeByte(m);
/* 82 */       ☃.writeByte(n);
/* 83 */       ☃.writeByte(i1);
/*    */     } 
/*    */     
/* 86 */     ☃.writeFloat(this.f);
/* 87 */     ☃.writeFloat(this.g);
/* 88 */     ☃.writeFloat(this.h);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 93 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */