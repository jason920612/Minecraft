/*     */ import java.util.Objects;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class cbp
/*     */ {
/*     */   private final el a;
/*     */   private final asc b;
/*     */   @Nullable
/*     */   private final ij c;
/*     */   
/*     */   public cbp(el ☃, asc asc1, @Nullable ij ij1) {
/*  22 */     this.a = ☃;
/*  23 */     this.b = asc1;
/*  24 */     this.c = ij1;
/*     */   }
/*     */   
/*     */   public static cbp a(gy ☃) {
/*  28 */     el el1 = hk.c(☃.p("Pos"));
/*  29 */     asc asc1 = asc.a(☃.l("Color"));
/*  30 */     ij ij1 = ☃.e("Name") ? ij.a.a(☃.l("Name")) : null;
/*  31 */     return new cbp(el1, asc1, ij1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cbp a(axk ☃, el el1) {
/*  36 */     bji bji = ☃.f(el1);
/*  37 */     if (bji instanceof bje) {
/*  38 */       bje bje = (bje)bji;
/*  39 */       asc asc1 = bje.a(() -> ☃.a_(el1));
/*  40 */       ij ij1 = bje.O_() ? bje.e() : null;
/*  41 */       return new cbp(el1, asc1, ij1);
/*     */     } 
/*  43 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public el a() {
/*  48 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cbq.a c() {
/*  56 */     switch (null.a[this.b.ordinal()]) {
/*     */       case 1:
/*  58 */         return cbq.a.k;
/*     */       case 2:
/*  60 */         return cbq.a.l;
/*     */       case 3:
/*  62 */         return cbq.a.m;
/*     */       case 4:
/*  64 */         return cbq.a.n;
/*     */       case 5:
/*  66 */         return cbq.a.o;
/*     */       case 6:
/*  68 */         return cbq.a.p;
/*     */       case 7:
/*  70 */         return cbq.a.q;
/*     */       case 8:
/*  72 */         return cbq.a.r;
/*     */       case 9:
/*  74 */         return cbq.a.s;
/*     */       case 10:
/*  76 */         return cbq.a.t;
/*     */       case 11:
/*  78 */         return cbq.a.u;
/*     */       case 12:
/*  80 */         return cbq.a.v;
/*     */       case 13:
/*  82 */         return cbq.a.w;
/*     */       case 14:
/*  84 */         return cbq.a.x;
/*     */       case 15:
/*  86 */         return cbq.a.y;
/*     */     } 
/*     */     
/*  89 */     return cbq.a.z;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij d() {
/*  95 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 100 */     if (this == ☃) {
/* 101 */       return true;
/*     */     }
/* 103 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 104 */       return false;
/*     */     }
/* 106 */     cbp cbp1 = (cbp)☃;
/* 107 */     return (Objects.equals(this.a, cbp1.a) && this.b == cbp1.b && Objects.equals(this.c, cbp1.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 112 */     return Objects.hash(new Object[] { this.a, this.b, this.c });
/*     */   }
/*     */   
/*     */   public gy e() {
/* 116 */     gy ☃ = new gy();
/*     */     
/* 118 */     ☃.a("Pos", hk.a(this.a));
/* 119 */     ☃.a("Color", this.b.b());
/*     */     
/* 121 */     if (this.c != null) {
/* 122 */       ☃.a("Name", ij.a.a(this.c));
/*     */     }
/*     */     
/* 125 */     return ☃;
/*     */   }
/*     */   
/*     */   public String f() {
/* 129 */     return "banner-" + this.a.o() + "," + this.a.p() + "," + this.a.q();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cbp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */