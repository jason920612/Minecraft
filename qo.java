/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
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
/*     */ public class qo
/*     */ {
/*     */   private static final Dynamic2CommandExceptionType a;
/*     */   
/*     */   static {
/*  38 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new ir("commands.fill.toobig", new Object[] { ☃, object1 }));
/*  39 */   } private static final ct b = new ct(bct.a.p(), Collections.emptySet(), null);
/*  40 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.fill.failed", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  43 */     ☃.register(
/*  44 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("fill")
/*  45 */         .requires(☃ -> ☃.c(2)))
/*  46 */         .then(
/*  47 */           bv.<T>a("from", cy.a())
/*  48 */           .then(
/*  49 */             bv.<T>a("to", cy.a())
/*  50 */             .then((
/*  51 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("block", cv.a())
/*  52 */               .executes(☃ -> a((bu)☃.getSource(), new bwf(cy.a(☃, "from"), cy.a(☃, "to")), cv.a(☃, "block"), a.a, null)))
/*  53 */               .then((
/*  54 */                 (LiteralArgumentBuilder)bv.a("replace")
/*  55 */                 .executes(☃ -> a((bu)☃.getSource(), new bwf(cy.a(☃, "from"), cy.a(☃, "to")), cv.a(☃, "block"), a.a, null)))
/*  56 */                 .then(
/*  57 */                   bv.<T>a("filter", cu.a())
/*  58 */                   .executes(☃ -> a((bu)☃.getSource(), new bwf(cy.a(☃, "from"), cy.a(☃, "to")), cv.a(☃, "block"), a.a, cu.a(☃, "filter"))))))
/*     */ 
/*     */               
/*  61 */               .then(
/*  62 */                 bv.a("keep")
/*  63 */                 .executes(☃ -> a((bu)☃.getSource(), new bwf(cy.a(☃, "from"), cy.a(☃, "to")), cv.a(☃, "block"), a.a, ()))))
/*     */               
/*  65 */               .then(
/*  66 */                 bv.a("outline")
/*  67 */                 .executes(☃ -> a((bu)☃.getSource(), new bwf(cy.a(☃, "from"), cy.a(☃, "to")), cv.a(☃, "block"), a.b, null))))
/*     */               
/*  69 */               .then(
/*  70 */                 bv.a("hollow")
/*  71 */                 .executes(☃ -> a((bu)☃.getSource(), new bwf(cy.a(☃, "from"), cy.a(☃, "to")), cv.a(☃, "block"), a.c, null))))
/*     */               
/*  73 */               .then(
/*  74 */                 bv.a("destroy")
/*  75 */                 .executes(☃ -> a((bu)☃.getSource(), new bwf(cy.a(☃, "from"), cy.a(☃, "to")), cv.a(☃, "block"), a.d, null)))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, bwf bwf1, ct ct1, a a1, @Nullable Predicate<blh> predicate) throws CommandSyntaxException {
/*  84 */     int i = bwf1.c() * bwf1.d() * bwf1.e();
/*  85 */     if (i > 32768) {
/*  86 */       throw a.create(Integer.valueOf(32768), Integer.valueOf(i));
/*     */     }
/*     */     
/*  89 */     List<el> list = Lists.newArrayList();
/*  90 */     td td = ☃.e();
/*  91 */     int j = 0;
/*     */     
/*  93 */     for (el el : el.a.a(bwf1.a, bwf1.b, bwf1.c, bwf1.d, bwf1.e, bwf1.f)) {
/*  94 */       if (predicate != null && !predicate.test(new blh(td, el, true))) {
/*     */         continue;
/*     */       }
/*  97 */       ct ct2 = a1.e.filter(bwf1, el, ct1, td);
/*  98 */       if (ct2 == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 102 */       bji bji = td.f(el);
/* 103 */       if (bji != null && bji instanceof ade) {
/* 104 */         ((ade)bji).m();
/*     */       }
/*     */       
/* 107 */       if (!ct2.a(td, el, 2)) {
/*     */         continue;
/*     */       }
/*     */       
/* 111 */       list.add(el.h());
/* 112 */       j++;
/*     */     } 
/*     */     
/* 115 */     for (el el : list) {
/* 116 */       bcs bcs = td.a_(el).c();
/* 117 */       td.a(el, bcs);
/*     */     } 
/*     */     
/* 120 */     if (j == 0) {
/* 121 */       throw c.create();
/*     */     }
/*     */     
/* 124 */     ☃.a(new ir("commands.fill.success", new Object[] { Integer.valueOf(j) }), true);
/*     */     
/* 126 */     return j;
/*     */   }
/*     */   enum a { a, b, c, d;
/*     */     static {
/* 130 */       a = new a("REPLACE", 0, (☃, el1, ct1, td1) -> ct1);
/* 131 */       b = new a("OUTLINE", 1, (☃, el1, ct1, td1) -> 
/* 132 */           (el1.o() == ☃.a || el1.o() == ☃.d || el1.p() == ☃.b || el1.p() == ☃.e || el1.q() == ☃.c || el1.q() == ☃.f) ? ct1 : null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 138 */       c = new a("HOLLOW", 2, (☃, el1, ct1, td1) -> 
/* 139 */           (el1.o() == ☃.a || el1.o() == ☃.d || el1.p() == ☃.b || el1.p() == ☃.e || el1.q() == ☃.c || el1.q() == ☃.f) ? ct1 : qo.a());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 145 */       d = new a("DESTROY", 3, (☃, el1, ct1, td1) -> {
/*     */             td1.a(el1, true);
/*     */             return ct1;
/*     */           });
/*     */     }
/*     */     public final rp.a e;
/*     */     
/*     */     a(rp.a ☃) {
/* 153 */       this.e = ☃;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              F:\dw\server.jar!\qo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */