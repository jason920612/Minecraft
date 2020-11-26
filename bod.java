/*    */ import java.io.File;
/*    */ import java.util.function.Supplier;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bod
/*    */ {
/* 14 */   public static final bod a = a("overworld", new bod(1, "", "", bof::new));
/* 15 */   public static final bod b = a("the_nether", new bod(0, "_nether", "DIM-1", boe::new));
/* 16 */   public static final bod c = a("the_end", new bod(2, "_end", "DIM1", boi::new));
/*    */   
/*    */   private final int d;
/*    */   
/*    */   private final String e;
/*    */   
/*    */   private static bod a(String ☃, bod bod1) {
/* 23 */     fc.k.a(bod1.d, new pc(☃), bod1);
/* 24 */     return bod1;
/*    */   }
/*    */   
/*    */   private final String f;
/*    */   private final Supplier<? extends boc> g;
/*    */   
/*    */   public static void a() {}
/*    */   
/*    */   protected bod(int ☃, String str1, String str2, Supplier<? extends boc> supplier) {
/* 33 */     this.d = ☃;
/* 34 */     this.e = str1;
/* 35 */     this.f = str2;
/* 36 */     this.g = supplier;
/*    */   }
/*    */   
/*    */   public static Iterable<bod> b() {
/* 40 */     return fc.k;
/*    */   }
/*    */   
/*    */   public int c() {
/* 44 */     return this.d + -1;
/*    */   }
/*    */   
/*    */   public String d() {
/* 48 */     return this.e;
/*    */   }
/*    */   
/*    */   public File a(File ☃) {
/* 52 */     if (this.f.isEmpty()) {
/* 53 */       return ☃;
/*    */     }
/* 55 */     return new File(☃, this.f);
/*    */   }
/*    */   
/*    */   public boc e() {
/* 59 */     return this.g.get();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 64 */     return a(this).toString();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static bod a(int ☃) {
/* 69 */     return fc.k.a(☃ - -1);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static bod a(pc ☃) {
/* 74 */     return fc.k.b(☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static pc a(bod ☃) {
/* 79 */     return fc.k.b(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */