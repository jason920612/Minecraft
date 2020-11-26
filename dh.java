/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dh
/*     */   implements da
/*     */ {
/*     */   private final dg a;
/*     */   private final dg b;
/*     */   private final dg c;
/*     */   
/*     */   public dh(dg ☃, dg dg1, dg dg2) {
/*  15 */     this.a = ☃;
/*  16 */     this.b = dg1;
/*  17 */     this.c = dg2;
/*     */   }
/*     */ 
/*     */   
/*     */   public cee a(bu ☃) {
/*  22 */     cee cee = ☃.d();
/*  23 */     return new cee(this.a.a(cee.b), this.b.a(cee.c), this.c.a(cee.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public ced b(bu ☃) {
/*  28 */     ced ced = ☃.i();
/*  29 */     return new ced((float)this.a.a(ced.i), (float)this.b.a(ced.j));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  34 */     return this.a.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  39 */     return this.b.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  44 */     return this.c.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  49 */     if (this == ☃) {
/*  50 */       return true;
/*     */     }
/*  52 */     if (!(☃ instanceof dh)) {
/*  53 */       return false;
/*     */     }
/*     */     
/*  56 */     dh dh1 = (dh)☃;
/*     */     
/*  58 */     if (!this.a.equals(dh1.a)) {
/*  59 */       return false;
/*     */     }
/*  61 */     if (!this.b.equals(dh1.b)) {
/*  62 */       return false;
/*     */     }
/*  64 */     return this.c.equals(dh1.c);
/*     */   }
/*     */   
/*     */   public static dh a(StringReader ☃) throws CommandSyntaxException {
/*  68 */     int i = ☃.getCursor();
/*  69 */     dg dg1 = dg.a(☃);
/*  70 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  71 */       ☃.setCursor(i);
/*  72 */       throw df.a.createWithContext(☃);
/*     */     } 
/*  74 */     ☃.skip();
/*  75 */     dg dg2 = dg.a(☃);
/*  76 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  77 */       ☃.setCursor(i);
/*  78 */       throw df.a.createWithContext(☃);
/*     */     } 
/*  80 */     ☃.skip();
/*  81 */     dg dg3 = dg.a(☃);
/*  82 */     return new dh(dg1, dg2, dg3);
/*     */   }
/*     */   
/*     */   public static dh a(StringReader ☃, boolean bool) throws CommandSyntaxException {
/*  86 */     int i = ☃.getCursor();
/*  87 */     dg dg1 = dg.a(☃, bool);
/*  88 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  89 */       ☃.setCursor(i);
/*  90 */       throw df.a.createWithContext(☃);
/*     */     } 
/*  92 */     ☃.skip();
/*  93 */     dg dg2 = dg.a(☃, false);
/*  94 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  95 */       ☃.setCursor(i);
/*  96 */       throw df.a.createWithContext(☃);
/*     */     } 
/*  98 */     ☃.skip();
/*  99 */     dg dg3 = dg.a(☃, bool);
/* 100 */     return new dh(dg1, dg2, dg3);
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
/*     */   public static dh d() {
/* 112 */     return new dh(new dg(true, 0.0D), new dg(true, 0.0D), new dg(true, 0.0D));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 117 */     int ☃ = this.a.hashCode();
/* 118 */     ☃ = 31 * ☃ + this.b.hashCode();
/* 119 */     ☃ = 31 * ☃ + this.c.hashCode();
/* 120 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */