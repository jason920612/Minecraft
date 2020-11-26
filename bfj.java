/*    */ import java.util.Map;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfj
/*    */   extends bcs
/*    */ {
/* 20 */   public static final bmb a = bgj.a;
/* 21 */   public static final bmb b = bgj.b;
/* 22 */   public static final bmb c = bgj.c;
/* 23 */   public static final bmb o = bgj.o;
/* 24 */   public static final bmb p = bgj.p;
/* 25 */   public static final bmb q = bgj.q;
/*    */   
/* 27 */   private static final Map<eq, bmb> r = bgj.r;
/*    */   
/*    */   @Nullable
/*    */   private final bcs s;
/*    */   
/*    */   public bfj(@Nullable bcs ☃, bcs.c c1) {
/* 33 */     super(c1);
/* 34 */     this.s = ☃;
/*    */     
/* 36 */     v(((blc)this.m.b()).a(a, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(true)).a(o, Boolean.valueOf(true)).a(p, Boolean.valueOf(true)).a(q, Boolean.valueOf(true)));
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(blc ☃, Random random) {
/* 41 */     return Math.max(0, random.nextInt(9) - 6);
/*    */   }
/*    */ 
/*    */   
/*    */   public axx a(blc ☃, axy axy1, el el1, int i) {
/* 46 */     return (this.s == null) ? atf.a : this.s;
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(ark ☃) {
/* 51 */     axk axk = ☃.k();
/* 52 */     el el = ☃.a();
/*    */     
/* 54 */     return p()
/* 55 */       .a(q, Boolean.valueOf((this != axk.a_(el.b()).c())))
/* 56 */       .a(p, Boolean.valueOf((this != axk.a_(el.a()).c())))
/* 57 */       .a(a, Boolean.valueOf((this != axk.a_(el.c()).c())))
/* 58 */       .a(b, Boolean.valueOf((this != axk.a_(el.f()).c())))
/* 59 */       .a(c, Boolean.valueOf((this != axk.a_(el.d()).c())))
/* 60 */       .a(o, Boolean.valueOf((this != axk.a_(el.e()).c())));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, eq eq1, blc blc1, axz axz1, el el1, el el2) {
/* 66 */     if (blc1.c() == this) {
/* 67 */       return ☃.a(r.get(eq1), Boolean.valueOf(false));
/*    */     }
/* 69 */     return super.a(☃, eq1, blc1, axz1, el1, el2);
/*    */   }
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bhb bhb1) {
/* 74 */     return ☃
/* 75 */       .a(r.get(bhb1.a(eq.c)), ☃.c(a))
/* 76 */       .a(r.get(bhb1.a(eq.d)), ☃.c(c))
/* 77 */       .a(r.get(bhb1.a(eq.f)), ☃.c(b))
/* 78 */       .a(r.get(bhb1.a(eq.e)), ☃.c(o))
/* 79 */       .a(r.get(bhb1.a(eq.b)), ☃.c(p))
/* 80 */       .a(r.get(bhb1.a(eq.a)), ☃.c(q));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public blc a(blc ☃, bfz bfz1) {
/* 86 */     return ☃
/* 87 */       .a(r.get(bfz1.b(eq.c)), ☃.c(a))
/* 88 */       .a(r.get(bfz1.b(eq.d)), ☃.c(c))
/* 89 */       .a(r.get(bfz1.b(eq.f)), ☃.c(b))
/* 90 */       .a(r.get(bfz1.b(eq.e)), ☃.c(o))
/* 91 */       .a(r.get(bfz1.b(eq.b)), ☃.c(p))
/* 92 */       .a(r.get(bfz1.b(eq.a)), ☃.c(q));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(ble.a<bcs, blc> ☃) {
/* 98 */     ☃.a((bmm<?>[])new bmm[] { p, q, a, b, c, o });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bfj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */