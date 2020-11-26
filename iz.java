/*     */ import java.io.IOException;
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
/*     */ public class iz
/*     */   implements iv<iy>
/*     */ {
/*     */   private int a;
/*     */   private UUID b;
/*     */   private double c;
/*     */   private double d;
/*     */   private double e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private int k;
/*     */   private int l;
/*     */   
/*     */   public iz() {}
/*     */   
/*     */   public iz(aer ☃, int i) {
/*  61 */     this(☃, i, 0);
/*     */   }
/*     */   
/*     */   public iz(aer ☃, int i, int j) {
/*  65 */     this.a = ☃.Q();
/*  66 */     this.b = ☃.bt();
/*  67 */     this.c = ☃.q;
/*  68 */     this.d = ☃.r;
/*  69 */     this.e = ☃.s;
/*  70 */     this.i = xq.d(☃.x * 256.0F / 360.0F);
/*  71 */     this.j = xq.d(☃.w * 256.0F / 360.0F);
/*  72 */     this.k = i;
/*  73 */     this.l = j;
/*     */     
/*  75 */     double d = 3.9D;
/*  76 */     this.f = (int)(xq.a(☃.t, -3.9D, 3.9D) * 8000.0D);
/*  77 */     this.g = (int)(xq.a(☃.u, -3.9D, 3.9D) * 8000.0D);
/*  78 */     this.h = (int)(xq.a(☃.v, -3.9D, 3.9D) * 8000.0D);
/*     */   }
/*     */   
/*     */   public iz(aer ☃, int i, int j, el el1) {
/*  82 */     this(☃, i, j);
/*  83 */     this.c = el1.o();
/*  84 */     this.d = el1.p();
/*  85 */     this.e = el1.q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  90 */     this.a = ☃.g();
/*  91 */     this.b = ☃.i();
/*  92 */     this.k = ☃.readByte();
/*  93 */     this.c = ☃.readDouble();
/*  94 */     this.d = ☃.readDouble();
/*  95 */     this.e = ☃.readDouble();
/*  96 */     this.i = ☃.readByte();
/*  97 */     this.j = ☃.readByte();
/*  98 */     this.l = ☃.readInt();
/*     */     
/* 100 */     this.f = ☃.readShort();
/* 101 */     this.g = ☃.readShort();
/* 102 */     this.h = ☃.readShort();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/* 107 */     ☃.d(this.a);
/* 108 */     ☃.a(this.b);
/* 109 */     ☃.writeByte(this.k);
/* 110 */     ☃.writeDouble(this.c);
/* 111 */     ☃.writeDouble(this.d);
/* 112 */     ☃.writeDouble(this.e);
/* 113 */     ☃.writeByte(this.i);
/* 114 */     ☃.writeByte(this.j);
/* 115 */     ☃.writeInt(this.l);
/*     */     
/* 117 */     ☃.writeShort(this.f);
/* 118 */     ☃.writeShort(this.g);
/* 119 */     ☃.writeShort(this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/* 124 */     ☃.a(this);
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
/*     */   public void a(int ☃) {
/* 176 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 180 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 184 */     this.h = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\iz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */