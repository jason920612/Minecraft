/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lc
/*     */   implements iv<iy>
/*     */ {
/*     */   private a a;
/*     */   private int b;
/*     */   private double c;
/*     */   private double d;
/*     */   private double e;
/*     */   private double f;
/*     */   private long g;
/*     */   private int h;
/*     */   private int i;
/*     */   
/*     */   public lc() {}
/*     */   
/*     */   public lc(bmv ☃, a a1) {
/*  25 */     this.a = a1;
/*  26 */     this.c = ☃.f();
/*  27 */     this.d = ☃.g();
/*  28 */     this.f = ☃.h();
/*  29 */     this.e = ☃.j();
/*  30 */     this.g = ☃.i();
/*  31 */     this.b = ☃.l();
/*  32 */     this.i = ☃.q();
/*  33 */     this.h = ☃.p();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  38 */     this.a = ☃.<a>a(a.class);
/*     */     
/*  40 */     switch (null.a[this.a.ordinal()]) {
/*     */       case 1:
/*  42 */         this.e = ☃.readDouble();
/*     */         break;
/*     */       case 2:
/*  45 */         this.f = ☃.readDouble();
/*  46 */         this.e = ☃.readDouble();
/*  47 */         this.g = ☃.h();
/*     */         break;
/*     */       case 3:
/*  50 */         this.c = ☃.readDouble();
/*  51 */         this.d = ☃.readDouble();
/*     */         break;
/*     */       case 4:
/*  54 */         this.i = ☃.g();
/*     */         break;
/*     */       case 5:
/*  57 */         this.h = ☃.g();
/*     */         break;
/*     */       case 6:
/*  60 */         this.c = ☃.readDouble();
/*  61 */         this.d = ☃.readDouble();
/*  62 */         this.f = ☃.readDouble();
/*  63 */         this.e = ☃.readDouble();
/*  64 */         this.g = ☃.h();
/*  65 */         this.b = ☃.g();
/*  66 */         this.i = ☃.g();
/*  67 */         this.h = ☃.g();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  74 */     ☃.a(this.a);
/*     */     
/*  76 */     switch (null.a[this.a.ordinal()]) {
/*     */       case 1:
/*  78 */         ☃.writeDouble(this.e);
/*     */         break;
/*     */       case 2:
/*  81 */         ☃.writeDouble(this.f);
/*  82 */         ☃.writeDouble(this.e);
/*  83 */         ☃.b(this.g);
/*     */         break;
/*     */       case 3:
/*  86 */         ☃.writeDouble(this.c);
/*  87 */         ☃.writeDouble(this.d);
/*     */         break;
/*     */       case 5:
/*  90 */         ☃.d(this.h);
/*     */         break;
/*     */       case 4:
/*  93 */         ☃.d(this.i);
/*     */         break;
/*     */       case 6:
/*  96 */         ☃.writeDouble(this.c);
/*  97 */         ☃.writeDouble(this.d);
/*  98 */         ☃.writeDouble(this.f);
/*  99 */         ☃.writeDouble(this.e);
/* 100 */         ☃.b(this.g);
/* 101 */         ☃.d(this.b);
/* 102 */         ☃.d(this.i);
/* 103 */         ☃.d(this.h);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/* 110 */     ☃.a(this);
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
/*     */   public enum a
/*     */   {
/* 147 */     a,
/* 148 */     b,
/* 149 */     c,
/* 150 */     d,
/* 151 */     e,
/* 152 */     f;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\lc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */