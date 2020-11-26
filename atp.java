/*     */ import java.util.List;
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
/*     */ public class atp
/*     */   extends ata
/*     */ {
/*     */   public atp(ata.a ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ate a(ate ☃, axy axy1, afa afa1) {
/*  37 */     aog aog = (afa1 instanceof aog) ? (aog)afa1 : null;
/*     */     
/*  39 */     if (aog == null || !aog.bV.d) {
/*  40 */       ☃.g(1);
/*     */     }
/*     */     
/*  43 */     if (aog instanceof tf) {
/*  44 */       p.z.a((tf)aog, ☃);
/*     */     }
/*  46 */     if (!axy1.B) {
/*  47 */       List<aek> list = auv.a(☃);
/*  48 */       for (aek aek : list) {
/*  49 */         if (aek.a().a()) {
/*  50 */           aek.a().a(aog, aog, afa1, aek.c(), 1.0D); continue;
/*     */         } 
/*  52 */         afa1.c(new aek(aek));
/*     */       } 
/*     */     } 
/*     */     
/*  56 */     if (aog != null) {
/*  57 */       aog.b(ws.c.b(this));
/*     */     }
/*  59 */     if (aog == null || !aog.bV.d) {
/*  60 */       if (☃.a())
/*  61 */         return new ate(atf.cq); 
/*  62 */       if (aog != null) {
/*  63 */         aog.bB.e(new ate(atf.cq));
/*     */       }
/*     */     } 
/*     */     
/*  67 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(ate ☃) {
/*  72 */     return 32;
/*     */   }
/*     */ 
/*     */   
/*     */   public auo d(ate ☃) {
/*  77 */     return auo.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  82 */     aog1.c(adk1);
/*  83 */     return new adn<>(adm.a, aog1.b(adk1));
/*     */   }
/*     */ 
/*     */   
/*     */   public String h(ate ☃) {
/*  88 */     return auv.d(☃).b(a() + ".effect.");
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
/*     */   public void a(ary ☃, ez<ate> ez1) {
/* 103 */     if (a(☃))
/* 104 */       for (aut aut : fc.j) {
/* 105 */         if (aut != auw.a)
/* 106 */           ez1.add(auv.a(new ate(this), aut)); 
/*     */       }  
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\atp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */