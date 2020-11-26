/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fd
/*    */ {
/*    */   protected final float a;
/*    */   protected final float b;
/*    */   protected final float c;
/*    */   
/*    */   public fd(float ☃, float f1, float f2) {
/* 13 */     this.a = (Float.isInfinite(☃) || Float.isNaN(☃)) ? 0.0F : (☃ % 360.0F);
/* 14 */     this.b = (Float.isInfinite(f1) || Float.isNaN(f1)) ? 0.0F : (f1 % 360.0F);
/* 15 */     this.c = (Float.isInfinite(f2) || Float.isNaN(f2)) ? 0.0F : (f2 % 360.0F);
/*    */   }
/*    */   
/*    */   public fd(he ☃) {
/* 19 */     this(☃.l(0), ☃.l(1), ☃.l(2));
/*    */   }
/*    */   
/*    */   public he a() {
/* 23 */     he ☃ = new he();
/* 24 */     ☃.a(new hb(this.a));
/* 25 */     ☃.a(new hb(this.b));
/* 26 */     ☃.a(new hb(this.c));
/* 27 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 32 */     if (!(☃ instanceof fd)) {
/* 33 */       return false;
/*    */     }
/* 35 */     fd fd1 = (fd)☃;
/* 36 */     return (this.a == fd1.a && this.b == fd1.b && this.c == fd1.c);
/*    */   }
/*    */   
/*    */   public float b() {
/* 40 */     return this.a;
/*    */   }
/*    */   
/*    */   public float c() {
/* 44 */     return this.b;
/*    */   }
/*    */   
/*    */   public float d() {
/* 48 */     return this.c;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */