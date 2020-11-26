/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum bmk
/*    */   implements xv
/*    */ {
/* 13 */   a("harp", wj.fI),
/* 14 */   b("basedrum", wj.fC),
/* 15 */   c("snare", wj.fL),
/* 16 */   d("hat", wj.fJ),
/* 17 */   e("bass", wj.fD),
/* 18 */   f("flute", wj.fG),
/* 19 */   g("bell", wj.fE),
/* 20 */   h("guitar", wj.fH),
/* 21 */   i("chime", wj.fF),
/* 22 */   j("xylophone", wj.fM);
/*    */   
/*    */   private final String k;
/*    */   
/*    */   private final wi l;
/*    */   
/*    */   bmk(String ☃, wi wi1) {
/* 29 */     this.k = ☃;
/* 30 */     this.l = wi1;
/*    */   }
/*    */ 
/*    */   
/*    */   public String m() {
/* 35 */     return this.k;
/*    */   }
/*    */   
/*    */   public wi a() {
/* 39 */     return this.l;
/*    */   }
/*    */   
/*    */   public static bmk a(blc ☃) {
/* 43 */     bcs bcs = ☃.c();
/* 44 */     if (bcs == bct.cU) {
/* 45 */       return f;
/*    */     }
/* 47 */     if (bcs == bct.bB) {
/* 48 */       return g;
/*    */     }
/* 50 */     if (bcs.a(wv.a)) {
/* 51 */       return h;
/*    */     }
/* 53 */     if (bcs == bct.gp) {
/* 54 */       return i;
/*    */     }
/* 56 */     if (bcs == bct.in) {
/* 57 */       return j;
/*    */     }
/*    */     
/* 60 */     bza bza = ☃.d();
/* 61 */     if (bza == bza.D) {
/* 62 */       return b;
/*    */     }
/* 64 */     if (bza == bza.u) {
/* 65 */       return c;
/*    */     }
/* 67 */     if (bza == bza.A) {
/* 68 */       return d;
/*    */     }
/* 70 */     if (bza == bza.w) {
/* 71 */       return e;
/*    */     }
/*    */     
/* 74 */     return a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bmk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */