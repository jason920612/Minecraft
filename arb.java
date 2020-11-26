/*     */ import com.google.common.collect.Multimap;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
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
/*     */ public class arb
/*     */   extends ata
/*     */ {
/*  28 */   private static final UUID[] k = new UUID[] {
/*  29 */       UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), 
/*  30 */       UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), 
/*  31 */       UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), 
/*  32 */       UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
/*     */     };
/*     */   
/*  35 */   public static final es a = new eo()
/*     */     {
/*     */       protected ate a(em ☃, ate ate1) {
/*  38 */         ate ate2 = arb.a(☃, ate1);
/*  39 */         return ate2.a() ? super.a(☃, ate1) : ate2;
/*     */       }
/*     */     };
/*     */   
/*     */   public static ate a(em ☃, ate ate1) {
/*  44 */     el el = ☃.d().a((eq)☃.e().c(bec.a));
/*     */     
/*  46 */     List<afa> list = ☃.h().a(afa.class, new cea(el), (Predicate)aeu.f.and(new aeu.a(ate1)));
/*     */     
/*  48 */     if (list.isEmpty()) {
/*  49 */       return ate.a;
/*     */     }
/*     */     
/*  52 */     afa afa = list.get(0);
/*  53 */     aew aew1 = afb.e(ate1);
/*     */     
/*  55 */     ate ate2 = ate1.a(1);
/*  56 */     afa.a(aew1, ate2);
/*  57 */     if (afa instanceof afb) {
/*  58 */       ((afb)afa).a(aew1, 2.0F);
/*  59 */       ((afb)afa).di();
/*     */     } 
/*  61 */     return ate1;
/*     */   }
/*     */   
/*     */   protected final aew b;
/*     */   protected final int c;
/*     */   protected final float d;
/*     */   protected final arc e;
/*     */   
/*     */   public arb(arc ☃, aew aew1, ata.a a1) {
/*  70 */     super(a1.b(☃.a(aew1)));
/*  71 */     this.e = ☃;
/*  72 */     this.b = aew1;
/*  73 */     this.c = ☃.b(aew1);
/*  74 */     this.d = ☃.e();
/*     */     
/*  76 */     bec.a(this, a);
/*     */   }
/*     */   
/*     */   public aew b() {
/*  80 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/*  85 */     return this.e.a();
/*     */   }
/*     */   
/*     */   public arc d() {
/*  89 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ate ☃, ate ate1) {
/*  94 */     return (this.e.c().a(ate1) || super.a(☃, ate1));
/*     */   }
/*     */ 
/*     */   
/*     */   public adn<ate> a(axy ☃, aog aog1, adk adk1) {
/*  99 */     ate ate1 = aog1.b(adk1);
/* 100 */     aew aew1 = afb.e(ate1);
/* 101 */     ate ate2 = aog1.b(aew1);
/*     */     
/* 103 */     if (ate2.a()) {
/* 104 */       aog1.a(aew1, ate1.i());
/* 105 */       ate1.e(0);
/* 106 */       return new adn<>(adm.a, ate1);
/*     */     } 
/*     */     
/* 109 */     return new adn<>(adm.c, ate1);
/*     */   }
/*     */ 
/*     */   
/*     */   public Multimap<String, afo> a(aew ☃) {
/* 114 */     Multimap<String, afo> multimap = super.a(☃);
/*     */ 
/*     */     
/* 117 */     if (☃ == this.b) {
/* 118 */       multimap.put(ank.h.a(), new afo(k[☃.b()], "Armor modifier", this.c, 0));
/* 119 */       multimap.put(ank.i.a(), new afo(k[☃.b()], "Armor toughness", this.d, 0));
/*     */     } 
/*     */     
/* 122 */     return multimap;
/*     */   }
/*     */   
/*     */   public int e() {
/* 126 */     return this.c;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\arb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */