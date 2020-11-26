/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
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
/*     */ public class jc
/*     */   implements iv<iy>
/*     */ {
/*     */   private int a;
/*     */   private UUID b;
/*     */   private int c;
/*     */   private double d;
/*     */   private double e;
/*     */   private double f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private byte j;
/*     */   private byte k;
/*     */   private byte l;
/*     */   private ou m;
/*     */   private List<ou.a<?>> n;
/*     */   
/*     */   public jc() {}
/*     */   
/*     */   public jc(afa ☃) {
/*  37 */     this.a = ☃.Q();
/*  38 */     this.b = ☃.bt();
/*     */     
/*  40 */     this.c = fc.r.a(☃.P());
/*  41 */     this.d = ☃.q;
/*  42 */     this.e = ☃.r;
/*  43 */     this.f = ☃.s;
/*  44 */     this.j = (byte)(int)(☃.w * 256.0F / 360.0F);
/*  45 */     this.k = (byte)(int)(☃.x * 256.0F / 360.0F);
/*  46 */     this.l = (byte)(int)(☃.aS * 256.0F / 360.0F);
/*     */ 
/*     */     
/*  49 */     double d1 = 3.9D;
/*  50 */     double d2 = ☃.t;
/*  51 */     double d3 = ☃.u;
/*  52 */     double d4 = ☃.v;
/*  53 */     if (d2 < -3.9D) {
/*  54 */       d2 = -3.9D;
/*     */     }
/*  56 */     if (d3 < -3.9D) {
/*  57 */       d3 = -3.9D;
/*     */     }
/*  59 */     if (d4 < -3.9D) {
/*  60 */       d4 = -3.9D;
/*     */     }
/*  62 */     if (d2 > 3.9D) {
/*  63 */       d2 = 3.9D;
/*     */     }
/*  65 */     if (d3 > 3.9D) {
/*  66 */       d3 = 3.9D;
/*     */     }
/*  68 */     if (d4 > 3.9D) {
/*  69 */       d4 = 3.9D;
/*     */     }
/*  71 */     this.g = (int)(d2 * 8000.0D);
/*  72 */     this.h = (int)(d3 * 8000.0D);
/*  73 */     this.i = (int)(d4 * 8000.0D);
/*     */     
/*  75 */     this.m = ☃.T();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  80 */     this.a = ☃.g();
/*  81 */     this.b = ☃.i();
/*  82 */     this.c = ☃.g();
/*  83 */     this.d = ☃.readDouble();
/*  84 */     this.e = ☃.readDouble();
/*  85 */     this.f = ☃.readDouble();
/*  86 */     this.j = ☃.readByte();
/*  87 */     this.k = ☃.readByte();
/*  88 */     this.l = ☃.readByte();
/*  89 */     this.g = ☃.readShort();
/*  90 */     this.h = ☃.readShort();
/*  91 */     this.i = ☃.readShort();
/*  92 */     this.n = ou.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  97 */     ☃.d(this.a);
/*  98 */     ☃.a(this.b);
/*  99 */     ☃.d(this.c);
/* 100 */     ☃.writeDouble(this.d);
/* 101 */     ☃.writeDouble(this.e);
/* 102 */     ☃.writeDouble(this.f);
/* 103 */     ☃.writeByte(this.j);
/* 104 */     ☃.writeByte(this.k);
/* 105 */     ☃.writeByte(this.l);
/* 106 */     ☃.writeShort(this.g);
/* 107 */     ☃.writeShort(this.h);
/* 108 */     ☃.writeShort(this.i);
/* 109 */     this.m.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/* 114 */     ☃.a(this);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\jc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */