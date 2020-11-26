/*     */ import java.io.IOException;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class kt
/*     */   implements iv<iy>
/*     */ {
/*     */   private double a;
/*     */   private double b;
/*     */   private double c;
/*     */   private float d;
/*     */   private float e;
/*     */   private Set<a> f;
/*     */   private int g;
/*     */   
/*     */   public kt() {}
/*     */   
/*     */   public kt(double ☃, double d1, double d2, float f1, float f2, Set<a> set, int i) {
/*  24 */     this.a = ☃;
/*  25 */     this.b = d1;
/*  26 */     this.c = d2;
/*  27 */     this.d = f1;
/*  28 */     this.e = f2;
/*  29 */     this.f = set;
/*  30 */     this.g = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  35 */     this.a = ☃.readDouble();
/*  36 */     this.b = ☃.readDouble();
/*  37 */     this.c = ☃.readDouble();
/*  38 */     this.d = ☃.readFloat();
/*  39 */     this.e = ☃.readFloat();
/*  40 */     this.f = a.a(☃.readUnsignedByte());
/*  41 */     this.g = ☃.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  46 */     ☃.writeDouble(this.a);
/*  47 */     ☃.writeDouble(this.b);
/*  48 */     ☃.writeDouble(this.c);
/*  49 */     ☃.writeFloat(this.d);
/*  50 */     ☃.writeFloat(this.e);
/*  51 */     ☃.writeByte(a.a(this.f));
/*  52 */     ☃.d(this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/*  57 */     ☃.a(this);
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
/*     */   public enum a
/*     */   {
/*  89 */     a(0),
/*  90 */     b(1),
/*  91 */     c(2),
/*  92 */     d(3),
/*  93 */     e(4);
/*     */     
/*     */     private final int f;
/*     */ 
/*     */     
/*     */     a(int ☃) {
/*  99 */       this.f = ☃;
/*     */     }
/*     */     
/*     */     private int a() {
/* 103 */       return 1 << this.f;
/*     */     }
/*     */     
/*     */     private boolean b(int ☃) {
/* 107 */       return ((☃ & a()) == a());
/*     */     }
/*     */     
/*     */     public static Set<a> a(int ☃) {
/* 111 */       Set<a> set = EnumSet.noneOf(a.class);
/*     */       
/* 113 */       for (a a1 : values()) {
/* 114 */         if (a1.b(☃)) {
/* 115 */           set.add(a1);
/*     */         }
/*     */       } 
/*     */       
/* 119 */       return set;
/*     */     }
/*     */     
/*     */     public static int a(Set<a> ☃) {
/* 123 */       int i = 0;
/*     */       
/* 125 */       for (a a1 : ☃) {
/* 126 */         i |= a1.a();
/*     */       }
/*     */       
/* 129 */       return i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\kt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */