/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class adc
/*     */ {
/*     */   private final UUID h;
/*     */   protected ij a;
/*     */   protected float b;
/*     */   protected a c;
/*     */   protected b d;
/*     */   protected boolean e;
/*     */   protected boolean f;
/*     */   protected boolean g;
/*     */   
/*     */   public adc(UUID ☃, ij ij1, a a1, b b1) {
/*  19 */     this.h = ☃;
/*  20 */     this.a = ij1;
/*  21 */     this.c = a1;
/*  22 */     this.d = b1;
/*  23 */     this.b = 1.0F;
/*     */   }
/*     */   
/*     */   public UUID i() {
/*  27 */     return this.h;
/*     */   }
/*     */   
/*     */   public ij j() {
/*  31 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(ij ☃) {
/*  35 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public float k() {
/*  39 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/*  43 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public a l() {
/*  47 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/*  51 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public b m() {
/*  55 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/*  59 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public boolean n() {
/*  63 */     return this.e;
/*     */   }
/*     */   
/*     */   public adc a(boolean ☃) {
/*  67 */     this.e = ☃;
/*  68 */     return this;
/*     */   }
/*     */   
/*     */   public boolean o() {
/*  72 */     return this.f;
/*     */   }
/*     */   
/*     */   public adc b(boolean ☃) {
/*  76 */     this.f = ☃;
/*  77 */     return this;
/*     */   }
/*     */   
/*     */   public adc c(boolean ☃) {
/*  81 */     this.g = ☃;
/*  82 */     return this;
/*     */   }
/*     */   
/*     */   public boolean p() {
/*  86 */     return this.g;
/*     */   }
/*     */   
/*     */   public enum a {
/*  90 */     a("pink", a.m),
/*  91 */     b("blue", a.j),
/*  92 */     c("red", a.e),
/*  93 */     d("green", a.k),
/*  94 */     e("yellow", a.o),
/*  95 */     f("purple", a.b),
/*  96 */     g("white", a.p);
/*     */     
/*     */     private final String h;
/*     */     
/*     */     private final a i;
/*     */     
/*     */     a(String ☃, a a1) {
/* 103 */       this.h = ☃;
/* 104 */       this.i = a1;
/*     */     }
/*     */     
/*     */     public a a() {
/* 108 */       return this.i;
/*     */     }
/*     */     
/*     */     public String b() {
/* 112 */       return this.h;
/*     */     }
/*     */     
/*     */     public static a a(String ☃) {
/* 116 */       for (a a1 : values()) {
/* 117 */         if (a1.h.equals(☃)) {
/* 118 */           return a1;
/*     */         }
/*     */       } 
/* 121 */       return g;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum b {
/* 126 */     a("progress"),
/* 127 */     b("notched_6"),
/* 128 */     c("notched_10"),
/* 129 */     d("notched_12"),
/* 130 */     e("notched_20");
/*     */     
/*     */     private final String f;
/*     */ 
/*     */     
/*     */     b(String ☃) {
/* 136 */       this.f = ☃;
/*     */     }
/*     */     
/*     */     public String a() {
/* 140 */       return this.f;
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 144 */       for (b b1 : values()) {
/* 145 */         if (b1.f.equals(☃)) {
/* 146 */           return b1;
/*     */         }
/*     */       } 
/* 149 */       return a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\adc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */