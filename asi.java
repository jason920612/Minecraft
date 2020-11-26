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
/*     */ public class asi
/*     */   extends ata
/*     */ {
/*     */   public asi(ata.a ☃) {
/*  21 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ate ☃) {
/*  31 */     return false;
/*     */   }
/*     */   
/*     */   public static he e(ate ☃) {
/*  35 */     gy gy = ☃.n();
/*  36 */     if (gy != null) {
/*  37 */       return gy.d("StoredEnchantments", 10);
/*     */     }
/*     */     
/*  40 */     return new he();
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
/*     */   public static void a(ate ☃, awh awh1) {
/*  60 */     he he = e(☃);
/*  61 */     boolean bool = true;
/*     */     
/*  63 */     pc pc = fc.q.b(awh1.b);
/*  64 */     for (int i = 0; i < he.size(); i++) {
/*  65 */       gy gy = he.e(i);
/*     */       
/*  67 */       pc pc1 = pc.a(gy.l("id"));
/*  68 */       if (pc1 != null && pc1.equals(pc)) {
/*  69 */         if (gy.h("lvl") < awh1.c) {
/*  70 */           gy.a("lvl", (short)awh1.c);
/*     */         }
/*     */         
/*  73 */         bool = false;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  78 */     if (bool) {
/*  79 */       gy gy = new gy();
/*     */       
/*  81 */       gy.a("id", String.valueOf(pc));
/*  82 */       gy.a("lvl", (short)awh1.c);
/*     */       
/*  84 */       he.a(gy);
/*     */     } 
/*     */     
/*  87 */     ☃.o().a("StoredEnchantments", he);
/*     */   }
/*     */   
/*     */   public static ate a(awh ☃) {
/*  91 */     ate ate = new ate(atf.dT);
/*  92 */     a(ate, ☃);
/*  93 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ary ☃, ez<ate> ez1) {
/*  98 */     if (☃ == ary.g) {
/*  99 */       for (awe awe : fc.q) {
/* 100 */         if (awe.b != null) {
/* 101 */           for (int i = awe.e(); i <= awe.a(); i++) {
/* 102 */             ez1.add(a(new awh(awe, i)));
/*     */           }
/*     */         }
/*     */       } 
/* 106 */     } else if ((☃.o()).length != 0) {
/* 107 */       for (awe awe : fc.q) {
/* 108 */         if (☃.a(awe.b))
/* 109 */           ez1.add(a(new awh(awe, awe.a()))); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\asi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */