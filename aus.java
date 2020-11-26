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
/*     */ public class aus
/*     */   extends ata
/*     */ {
/*     */   public aus(ata.a ☃) {
/*  40 */     super(☃);
/*     */   }
/*     */   
/*     */   public static boolean b(@Nullable gy ☃) {
/*  44 */     if (!aur.b(☃)) {
/*  45 */       return false;
/*     */     }
/*     */     
/*  48 */     if (!☃.c("title", 8)) {
/*  49 */       return false;
/*     */     }
/*  51 */     String str = ☃.l("title");
/*  52 */     if (str.length() > 32) {
/*  53 */       return false;
/*     */     }
/*     */     
/*  56 */     return ☃.c("author", 8);
/*     */   }
/*     */   
/*     */   public static int e(ate ☃) {
/*  60 */     return ☃.n().h("generation");
/*     */   }
/*     */ 
/*     */   
/*     */   public ij i(ate ☃) {
/*  65 */     if (☃.m()) {
/*  66 */       gy gy = ☃.n();
/*     */       
/*  68 */       String str = gy.l("title");
/*  69 */       if (!xw.b(str)) {
/*  70 */         return new iq(str);
/*     */       }
/*     */     } 
/*  73 */     return super.i(☃);
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
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  92 */     ate ate = aog1.b(adk1);
/*  93 */     if (!☃.B) {
/*  94 */       a(ate, aog1);
/*     */     }
/*  96 */     aog1.a(ate, adk1);
/*  97 */     aog1.b(ws.c.b(this));
/*  98 */     return new adn<>(adm.a, ate);
/*     */   }
/*     */   
/*     */   private void a(ate ☃, aog aog1) {
/* 102 */     gy gy = ☃.n();
/* 103 */     if (gy == null || gy.q("resolved")) {
/*     */       return;
/*     */     }
/* 106 */     gy.a("resolved", true);
/* 107 */     if (!b(gy)) {
/*     */       return;
/*     */     }
/* 110 */     he he = gy.d("pages", 8);
/* 111 */     for (int i = 0; i < he.size(); i++) {
/* 112 */       ij ij; String str = he.m(i);
/*     */       
/*     */       try {
/* 115 */         ij = ij.a.b(str);
/* 116 */         ij = ik.a(aog1.bX(), ij, aog1);
/* 117 */       } catch (Exception exception) {
/* 118 */         ij = new iq(str);
/*     */       } 
/* 120 */       he.b(i, new hn(ij.a.a(ij)));
/*     */     } 
/* 122 */     gy.a("pages", he);
/* 123 */     if (aog1 instanceof tf && aog1.cB() == ☃) {
/* 124 */       aqx aqx = aog1.bE.a(aog1.bB, aog1.bB.d);
/* 125 */       ((tf)aog1).a.a(new jw(0, aqx.e, ☃));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */