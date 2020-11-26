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
/*    */ public class asy
/*    */   extends ata
/*    */ {
/*    */   private final Class<? extends ama> a;
/*    */   
/*    */   public asy(Class<? extends ama> ☃, ata.a a1) {
/* 18 */     super(a1);
/* 19 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public adm a(aup ☃) {
/* 24 */     el el1 = ☃.a();
/* 25 */     eq eq = ☃.l();
/*    */     
/* 27 */     el el2 = el1.a(eq);
/* 28 */     aog aog = ☃.j();
/* 29 */     if (aog != null && !a(aog, eq, ☃.i(), el2)) {
/* 30 */       return adm.c;
/*    */     }
/*    */     
/* 33 */     axy axy = ☃.k();
/* 34 */     ama ama = a(axy, el2, eq);
/* 35 */     if (ama != null && ama.i()) {
/* 36 */       if (!axy.B) {
/* 37 */         ama.m();
/* 38 */         axy.a(ama);
/*    */       } 
/* 40 */       ☃.i().g(1);
/*    */     } 
/* 42 */     return adm.a;
/*    */   }
/*    */   
/*    */   protected boolean a(aog ☃, eq eq1, ate ate1, el el1) {
/* 46 */     return (!eq1.k().b() && ☃.a(el1, eq1, ate1));
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private ama a(axy ☃, el el1, eq eq1) {
/* 51 */     if (this.a == ame.class)
/* 52 */       return new ame(☃, el1, eq1); 
/* 53 */     if (this.a == amb.class) {
/* 54 */       return new amb(☃, el1, eq1);
/*    */     }
/* 56 */     return null;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\asy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */