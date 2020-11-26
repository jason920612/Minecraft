/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class mu
/*     */   implements iv<me>
/*     */ {
/*     */   protected double a;
/*     */   protected double b;
/*     */   protected double c;
/*     */   protected float d;
/*     */   protected float e;
/*     */   protected boolean f;
/*     */   protected boolean g;
/*     */   protected boolean h;
/*     */   
/*     */   public static class b
/*     */     extends mu
/*     */   {
/*     */     public void a(hy ☃) throws IOException {
/*  38 */       this.a = ☃.readDouble();
/*  39 */       this.b = ☃.readDouble();
/*  40 */       this.c = ☃.readDouble();
/*  41 */       this.d = ☃.readFloat();
/*  42 */       this.e = ☃.readFloat();
/*  43 */       super.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(hy ☃) throws IOException {
/*  48 */       ☃.writeDouble(this.a);
/*  49 */       ☃.writeDouble(this.b);
/*  50 */       ☃.writeDouble(this.c);
/*  51 */       ☃.writeFloat(this.d);
/*  52 */       ☃.writeFloat(this.e);
/*  53 */       super.b(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends mu
/*     */   {
/*     */     public void a(hy ☃) throws IOException {
/*  73 */       this.a = ☃.readDouble();
/*  74 */       this.b = ☃.readDouble();
/*  75 */       this.c = ☃.readDouble();
/*  76 */       super.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(hy ☃) throws IOException {
/*  81 */       ☃.writeDouble(this.a);
/*  82 */       ☃.writeDouble(this.b);
/*  83 */       ☃.writeDouble(this.c);
/*  84 */       super.b(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class c
/*     */     extends mu
/*     */   {
/*     */     public void a(hy ☃) throws IOException {
/* 103 */       this.d = ☃.readFloat();
/* 104 */       this.e = ☃.readFloat();
/* 105 */       super.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(hy ☃) throws IOException {
/* 110 */       ☃.writeFloat(this.d);
/* 111 */       ☃.writeFloat(this.e);
/* 112 */       super.b(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(me ☃) {
/* 126 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/* 131 */     this.f = (☃.readUnsignedByte() != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/* 136 */     ☃.writeByte(this.f ? 1 : 0);
/*     */   }
/*     */   
/*     */   public double a(double ☃) {
/* 140 */     return this.g ? this.a : ☃;
/*     */   }
/*     */   
/*     */   public double b(double ☃) {
/* 144 */     return this.g ? this.b : ☃;
/*     */   }
/*     */   
/*     */   public double c(double ☃) {
/* 148 */     return this.g ? this.c : ☃;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 152 */     return this.h ? this.d : ☃;
/*     */   }
/*     */   
/*     */   public float b(float ☃) {
/* 156 */     return this.h ? this.e : ☃;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 160 */     return this.f;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\mu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */