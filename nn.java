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
/*     */ public class nn
/*     */   implements iv<me>
/*     */ {
/*     */   private el a;
/*     */   private bkf.a b;
/*     */   private bmr c;
/*     */   private String d;
/*     */   private el e;
/*     */   private el f;
/*     */   private bfz g;
/*     */   private bhb h;
/*     */   private String i;
/*     */   private boolean j;
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   private float m;
/*     */   private long n;
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  57 */     this.a = ☃.e();
/*  58 */     this.b = ☃.<bkf.a>a(bkf.a.class);
/*  59 */     this.c = ☃.<bmr>a(bmr.class);
/*  60 */     this.d = ☃.e(32767);
/*  61 */     this.e = new el(xq.a(☃.readByte(), -32, 32), xq.a(☃.readByte(), -32, 32), xq.a(☃.readByte(), -32, 32));
/*  62 */     this.f = new el(xq.a(☃.readByte(), 0, 32), xq.a(☃.readByte(), 0, 32), xq.a(☃.readByte(), 0, 32));
/*  63 */     this.g = ☃.<bfz>a(bfz.class);
/*  64 */     this.h = ☃.<bhb>a(bhb.class);
/*  65 */     this.i = ☃.e(12);
/*  66 */     this.m = xq.a(☃.readFloat(), 0.0F, 1.0F);
/*  67 */     this.n = ☃.h();
/*  68 */     int i = ☃.readByte();
/*  69 */     this.j = ((i & 0x1) != 0);
/*  70 */     this.k = ((i & 0x2) != 0);
/*  71 */     this.l = ((i & 0x4) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  76 */     ☃.a(this.a);
/*  77 */     ☃.a(this.b);
/*  78 */     ☃.a(this.c);
/*  79 */     ☃.a(this.d);
/*  80 */     ☃.writeByte(this.e.o());
/*  81 */     ☃.writeByte(this.e.p());
/*  82 */     ☃.writeByte(this.e.q());
/*  83 */     ☃.writeByte(this.f.o());
/*  84 */     ☃.writeByte(this.f.p());
/*  85 */     ☃.writeByte(this.f.q());
/*  86 */     ☃.a(this.g);
/*  87 */     ☃.a(this.h);
/*  88 */     ☃.a(this.i);
/*  89 */     ☃.writeFloat(this.m);
/*  90 */     ☃.b(this.n);
/*     */     
/*  92 */     int i = 0;
/*  93 */     if (this.j) {
/*  94 */       i |= 0x1;
/*     */     }
/*  96 */     if (this.k) {
/*  97 */       i |= 0x2;
/*     */     }
/*  99 */     if (this.l) {
/* 100 */       i |= 0x4;
/*     */     }
/* 102 */     ☃.writeByte(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(me ☃) {
/* 107 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public el b() {
/* 111 */     return this.a;
/*     */   }
/*     */   
/*     */   public bkf.a c() {
/* 115 */     return this.b;
/*     */   }
/*     */   
/*     */   public bmr d() {
/* 119 */     return this.c;
/*     */   }
/*     */   
/*     */   public String e() {
/* 123 */     return this.d;
/*     */   }
/*     */   
/*     */   public el f() {
/* 127 */     return this.e;
/*     */   }
/*     */   
/*     */   public el g() {
/* 131 */     return this.f;
/*     */   }
/*     */   
/*     */   public bfz h() {
/* 135 */     return this.g;
/*     */   }
/*     */   
/*     */   public bhb i() {
/* 139 */     return this.h;
/*     */   }
/*     */   
/*     */   public String j() {
/* 143 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 147 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 151 */     return this.k;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 155 */     return this.l;
/*     */   }
/*     */   
/*     */   public float n() {
/* 159 */     return this.m;
/*     */   }
/*     */   
/*     */   public long o() {
/* 163 */     return this.n;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\nn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */