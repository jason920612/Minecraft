/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public class cbq {
/*     */   private final a a;
/*     */   private byte b;
/*     */   private byte c;
/*     */   private byte d;
/*     */   private final ij e;
/*     */   
/*     */   public enum a {
/*  11 */     a(false),
/*  12 */     b(true),
/*  13 */     c(false),
/*  14 */     d(false),
/*  15 */     e(true),
/*  16 */     f(true),
/*  17 */     g(false),
/*  18 */     h(false),
/*  19 */     i(true, 5393476),
/*  20 */     j(true, 3830373),
/*  21 */     k(true),
/*  22 */     l(true),
/*  23 */     m(true),
/*  24 */     n(true),
/*  25 */     o(true),
/*  26 */     p(true),
/*  27 */     q(true),
/*  28 */     r(true),
/*  29 */     s(true),
/*  30 */     t(true),
/*  31 */     u(true),
/*  32 */     v(true),
/*  33 */     w(true),
/*  34 */     x(true),
/*  35 */     y(true),
/*  36 */     z(true),
/*  37 */     A(true);
/*     */ 
/*     */     
/*     */     private final byte B;
/*     */ 
/*     */     
/*     */     private final boolean C;
/*     */     
/*     */     private final int D;
/*     */ 
/*     */     
/*     */     a(boolean ☃, int i) {
/*  49 */       this.B = (byte)ordinal();
/*  50 */       this.C = ☃;
/*  51 */       this.D = i;
/*     */     }
/*     */     
/*     */     public byte a() {
/*  55 */       return this.B;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean c() {
/*  63 */       return (this.D >= 0);
/*     */     }
/*     */     
/*     */     public int d() {
/*  67 */       return this.D;
/*     */     }
/*     */     
/*     */     public static a a(byte ☃) {
/*  71 */       return values()[xq.a(☃, 0, (values()).length - 1)];
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cbq(a ☃, byte b1, byte b2, byte b3, @Nullable ij ij1) {
/*  82 */     this.a = ☃;
/*  83 */     this.b = b1;
/*  84 */     this.c = b2;
/*  85 */     this.d = b3;
/*  86 */     this.e = ij1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a b() {
/*  94 */     return this.a;
/*     */   }
/*     */   
/*     */   public byte c() {
/*  98 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte d() {
/* 106 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte e() {
/* 114 */     return this.d;
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
/*     */   @Nullable
/*     */   public ij g() {
/* 127 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 132 */     if (this == ☃) {
/* 133 */       return true;
/*     */     }
/* 135 */     if (!(☃ instanceof cbq)) {
/* 136 */       return false;
/*     */     }
/*     */     
/* 139 */     cbq cbq1 = (cbq)☃;
/*     */     
/* 141 */     if (this.a != cbq1.a) {
/* 142 */       return false;
/*     */     }
/* 144 */     if (this.d != cbq1.d) {
/* 145 */       return false;
/*     */     }
/* 147 */     if (this.b != cbq1.b) {
/* 148 */       return false;
/*     */     }
/* 150 */     if (this.c != cbq1.c) {
/* 151 */       return false;
/*     */     }
/* 153 */     if (!Objects.equals(this.e, cbq1.e)) {
/* 154 */       return false;
/*     */     }
/*     */     
/* 157 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 162 */     int ☃ = this.a.a();
/* 163 */     ☃ = 31 * ☃ + this.b;
/* 164 */     ☃ = 31 * ☃ + this.c;
/* 165 */     ☃ = 31 * ☃ + this.d;
/* 166 */     ☃ = 31 * ☃ + Objects.hashCode(this.e);
/* 167 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */