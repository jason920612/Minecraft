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
/*     */ public class jl
/*     */   implements iv<iy>
/*     */ {
/*     */   private UUID a;
/*     */   private a b;
/*     */   private ij c;
/*     */   private float d;
/*     */   private adc.a e;
/*     */   private adc.b f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private boolean i;
/*     */   
/*     */   public jl() {}
/*     */   
/*     */   public jl(a ☃, adc adc1) {
/*  31 */     this.b = ☃;
/*  32 */     this.a = adc1.i();
/*  33 */     this.c = adc1.j();
/*  34 */     this.d = adc1.k();
/*  35 */     this.e = adc1.l();
/*  36 */     this.f = adc1.m();
/*  37 */     this.g = adc1.n();
/*  38 */     this.h = adc1.o();
/*  39 */     this.i = adc1.p();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  44 */     this.a = ☃.i();
/*  45 */     this.b = ☃.<a>a(a.class);
/*     */     
/*  47 */     switch (null.a[this.b.ordinal()]) {
/*     */       case 1:
/*  49 */         this.c = ☃.f();
/*  50 */         this.d = ☃.readFloat();
/*  51 */         this.e = ☃.<adc.a>a(adc.a.class);
/*  52 */         this.f = ☃.<adc.b>a(adc.b.class);
/*  53 */         a(☃.readUnsignedByte());
/*     */         break;
/*     */ 
/*     */       
/*     */       case 3:
/*  58 */         this.d = ☃.readFloat();
/*     */         break;
/*     */       case 4:
/*  61 */         this.c = ☃.f();
/*     */         break;
/*     */       case 5:
/*  64 */         this.e = ☃.<adc.a>a(adc.a.class);
/*  65 */         this.f = ☃.<adc.b>a(adc.b.class);
/*     */         break;
/*     */       case 6:
/*  68 */         a(☃.readUnsignedByte());
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/*  74 */     this.g = ((☃ & 0x1) > 0);
/*  75 */     this.h = ((☃ & 0x2) > 0);
/*  76 */     this.i = ((☃ & 0x4) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  81 */     ☃.a(this.a);
/*  82 */     ☃.a(this.b);
/*     */     
/*  84 */     switch (null.a[this.b.ordinal()]) {
/*     */       case 1:
/*  86 */         ☃.a(this.c);
/*  87 */         ☃.writeFloat(this.d);
/*  88 */         ☃.a(this.e);
/*  89 */         ☃.a(this.f);
/*  90 */         ☃.writeByte(k());
/*     */         break;
/*     */ 
/*     */       
/*     */       case 3:
/*  95 */         ☃.writeFloat(this.d);
/*     */         break;
/*     */       case 4:
/*  98 */         ☃.a(this.c);
/*     */         break;
/*     */       case 5:
/* 101 */         ☃.a(this.e);
/* 102 */         ☃.a(this.f);
/*     */         break;
/*     */       case 6:
/* 105 */         ☃.writeByte(k());
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private int k() {
/* 111 */     int ☃ = 0;
/* 112 */     if (this.g) {
/* 113 */       ☃ |= 0x1;
/*     */     }
/* 115 */     if (this.h) {
/* 116 */       ☃ |= 0x2;
/*     */     }
/* 118 */     if (this.i) {
/* 119 */       ☃ |= 0x4;
/*     */     }
/* 121 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/* 126 */     ☃.a(this);
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
/*     */   public enum a
/*     */   {
/* 166 */     a,
/* 167 */     b,
/* 168 */     c,
/* 169 */     d,
/* 170 */     e,
/* 171 */     f;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\jl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */