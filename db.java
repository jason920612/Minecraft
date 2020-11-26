/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class db
/*     */   implements da
/*     */ {
/*     */   private final double a;
/*     */   private final double b;
/*     */   private final double c;
/*     */   
/*     */   public db(double ☃, double d1, double d2) {
/*  20 */     this.a = ☃;
/*  21 */     this.b = d1;
/*  22 */     this.c = d2;
/*     */   }
/*     */ 
/*     */   
/*     */   public cee a(bu ☃) {
/*  27 */     ced ced = ☃.i();
/*  28 */     cee cee1 = ☃.k().a(☃);
/*  29 */     float f1 = xq.b((ced.j + 90.0F) * 0.017453292F);
/*  30 */     float f2 = xq.a((ced.j + 90.0F) * 0.017453292F);
/*  31 */     float f3 = xq.b(-ced.i * 0.017453292F);
/*  32 */     float f4 = xq.a(-ced.i * 0.017453292F);
/*  33 */     float f5 = xq.b((-ced.i + 90.0F) * 0.017453292F);
/*  34 */     float f6 = xq.a((-ced.i + 90.0F) * 0.017453292F);
/*  35 */     cee cee2 = new cee((f1 * f3), f4, (f2 * f3));
/*  36 */     cee cee3 = new cee((f1 * f5), f6, (f2 * f5));
/*  37 */     cee cee4 = cee2.c(cee3).a(-1.0D);
/*  38 */     double d1 = cee2.b * this.c + cee3.b * this.b + cee4.b * this.a;
/*  39 */     double d2 = cee2.c * this.c + cee3.c * this.b + cee4.c * this.a;
/*  40 */     double d3 = cee2.d * this.c + cee3.d * this.b + cee4.d * this.a;
/*  41 */     return new cee(cee1.b + d1, cee1.c + d2, cee1.d + d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public ced b(bu ☃) {
/*  46 */     return ced.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  51 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  56 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  61 */     return true;
/*     */   }
/*     */   
/*     */   public static db a(StringReader ☃) throws CommandSyntaxException {
/*  65 */     int i = ☃.getCursor();
/*  66 */     double d1 = a(☃, i);
/*  67 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  68 */       ☃.setCursor(i);
/*  69 */       throw df.a.createWithContext(☃);
/*     */     } 
/*  71 */     ☃.skip();
/*  72 */     double d2 = a(☃, i);
/*  73 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  74 */       ☃.setCursor(i);
/*  75 */       throw df.a.createWithContext(☃);
/*     */     } 
/*  77 */     ☃.skip();
/*  78 */     double d3 = a(☃, i);
/*  79 */     return new db(d1, d2, d3);
/*     */   }
/*     */   
/*     */   private static double a(StringReader ☃, int i) throws CommandSyntaxException {
/*  83 */     if (!☃.canRead()) {
/*  84 */       throw dg.a.createWithContext(☃);
/*     */     }
/*     */     
/*  87 */     if (☃.peek() != '^') {
/*  88 */       ☃.setCursor(i);
/*  89 */       throw df.b.createWithContext(☃);
/*     */     } 
/*  91 */     ☃.skip();
/*     */     
/*  93 */     return (☃.canRead() && ☃.peek() != ' ') ? ☃.readDouble() : 0.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  98 */     if (this == ☃) {
/*  99 */       return true;
/*     */     }
/* 101 */     if (!(☃ instanceof db)) {
/* 102 */       return false;
/*     */     }
/*     */     
/* 105 */     db db1 = (db)☃;
/*     */     
/* 107 */     return (this.a == db1.a && this.b == db1.b && this.c == db1.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 112 */     return Objects.hash(new Object[] { Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c) });
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\db.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */