/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Deque;
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
/*     */ 
/*     */ 
/*     */ public class qd
/*     */ {
/*     */   private static final Dynamic2CommandExceptionType c;
/*  38 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.clone.overlap", new Object[0])); static {
/*  39 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new ir("commands.clone.toobig", new Object[] { ☃, object1 }));
/*  40 */   } private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("commands.clone.failed", new Object[0])); static {
/*  41 */     a = (☃ -> !☃.a().f());
/*     */   } public static final Predicate<blh> a;
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  44 */     ☃.register(
/*  45 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("clone")
/*  46 */         .requires(☃ -> ☃.c(2)))
/*  47 */         .then(
/*  48 */           bv.<T>a("begin", cy.a())
/*  49 */           .then(
/*  50 */             bv.<T>a("end", cy.a())
/*  51 */             .then((
/*  52 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("destination", cy.a())
/*  53 */               .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), (), b.c)))
/*  54 */               .then((
/*  55 */                 (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("replace")
/*  56 */                 .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), (), b.c)))
/*  57 */                 .then(
/*  58 */                   bv.a("force")
/*  59 */                   .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), (), b.a))))
/*     */                 
/*  61 */                 .then(
/*  62 */                   bv.a("move")
/*  63 */                   .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), (), b.b))))
/*     */                 
/*  65 */                 .then(
/*  66 */                   bv.a("normal")
/*  67 */                   .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), (), b.c)))))
/*     */ 
/*     */               
/*  70 */               .then((
/*  71 */                 (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("masked")
/*  72 */                 .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), a, b.c)))
/*  73 */                 .then(
/*  74 */                   bv.a("force")
/*  75 */                   .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), a, b.a))))
/*     */                 
/*  77 */                 .then(
/*  78 */                   bv.a("move")
/*  79 */                   .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), a, b.b))))
/*     */                 
/*  81 */                 .then(
/*  82 */                   bv.a("normal")
/*  83 */                   .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), a, b.c)))))
/*     */ 
/*     */               
/*  86 */               .then(
/*  87 */                 bv.a("filtered")
/*  88 */                 .then((
/*  89 */                   (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("filter", cu.a())
/*  90 */                   .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), cu.a(☃, "filter"), b.c)))
/*  91 */                   .then(
/*  92 */                     bv.a("force")
/*  93 */                     .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), cu.a(☃, "filter"), b.a))))
/*     */                   
/*  95 */                   .then(
/*  96 */                     bv.a("move")
/*  97 */                     .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), cu.a(☃, "filter"), b.b))))
/*     */                   
/*  99 */                   .then(
/* 100 */                     bv.a("normal")
/* 101 */                     .executes(☃ -> a((bu)☃.getSource(), cy.a(☃, "begin"), cy.a(☃, "end"), cy.a(☃, "destination"), cu.a(☃, "filter"), b.c)))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, el el1, el el2, el el3, Predicate<blh> predicate, b b1) throws CommandSyntaxException {
/* 112 */     bwf bwf1 = new bwf(el1, el2);
/* 113 */     bwf bwf2 = new bwf(el3, el3.a(bwf1.b()));
/* 114 */     if (!b1.a() && bwf2.a(bwf1)) {
/* 115 */       throw b.create();
/*     */     }
/* 117 */     int i = bwf1.c() * bwf1.d() * bwf1.e();
/* 118 */     if (i > 32768) {
/* 119 */       throw c.create(Integer.valueOf(32768), Integer.valueOf(i));
/*     */     }
/* 121 */     td td = ☃.e();
/* 122 */     if (!td.a(bwf1) || !td.a(bwf2)) {
/* 123 */       throw cy.a.create();
/*     */     }
/*     */     
/* 126 */     List<a> list1 = Lists.newArrayList();
/* 127 */     List<a> list2 = Lists.newArrayList();
/* 128 */     List<a> list3 = Lists.newArrayList();
/* 129 */     Deque<el> deque = Lists.newLinkedList();
/*     */     
/* 131 */     el el4 = new el(bwf2.a - bwf1.a, bwf2.b - bwf1.b, bwf2.c - bwf1.c);
/* 132 */     for (int j = bwf1.c; j <= bwf1.f; j++) {
/* 133 */       for (int m = bwf1.b; m <= bwf1.e; m++) {
/* 134 */         for (int n = bwf1.a; n <= bwf1.d; n++) {
/* 135 */           el el5 = new el(n, m, j);
/* 136 */           el el6 = el5.a(el4);
/* 137 */           blh blh = new blh(td, el5, false);
/* 138 */           blc blc = blh.a();
/* 139 */           if (predicate.test(blh)) {
/*     */ 
/*     */ 
/*     */             
/* 143 */             bji bji = td.f(el5);
/* 144 */             if (bji != null) {
/* 145 */               gy gy = bji.a(new gy());
/* 146 */               list2.add(new a(el6, blc, gy));
/* 147 */               deque.addLast(el5);
/* 148 */             } else if (blc.f(td, el5) || blc.g()) {
/* 149 */               list1.add(new a(el6, blc, null));
/* 150 */               deque.addLast(el5);
/*     */             } else {
/* 152 */               list3.add(new a(el6, blc, null));
/* 153 */               deque.addFirst(el5);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 159 */     if (b1 == b.b) {
/* 160 */       for (el el5 : deque) {
/* 161 */         bji bji = td.f(el5);
/* 162 */         if (bji instanceof ade) {
/* 163 */           ((ade)bji).m();
/*     */         }
/* 165 */         td.a(el5, bct.fU.p(), 2);
/*     */       } 
/* 167 */       for (el el5 : deque) {
/* 168 */         td.a(el5, bct.a.p(), 3);
/*     */       }
/*     */     } 
/*     */     
/* 172 */     List<a> list4 = Lists.newArrayList();
/* 173 */     list4.addAll(list1);
/* 174 */     list4.addAll(list2);
/* 175 */     list4.addAll(list3);
/*     */     
/* 177 */     List<a> list5 = Lists.reverse(list4);
/* 178 */     for (a a : list5) {
/* 179 */       bji bji = td.f(a.a);
/* 180 */       if (bji instanceof ade) {
/* 181 */         ((ade)bji).m();
/*     */       }
/* 183 */       td.a(a.a, bct.fU.p(), 2);
/*     */     } 
/*     */     
/* 186 */     int k = 0;
/* 187 */     for (a a : list4) {
/* 188 */       if (td.a(a.a, a.b, 2)) {
/* 189 */         k++;
/*     */       }
/*     */     } 
/* 192 */     for (a a : list2) {
/* 193 */       bji bji = td.f(a.a);
/* 194 */       if (a.c != null && bji != null) {
/* 195 */         a.c.b("x", a.a.o());
/* 196 */         a.c.b("y", a.a.p());
/* 197 */         a.c.b("z", a.a.q());
/* 198 */         bji.b(a.c);
/* 199 */         bji.g();
/*     */       } 
/* 201 */       td.a(a.a, a.b, 2);
/*     */     } 
/*     */     
/* 204 */     for (a a : list5) {
/* 205 */       td.a(a.a, a.b.c());
/*     */     }
/*     */     
/* 208 */     td.x().a(bwf1, el4);
/*     */     
/* 210 */     if (k == 0) {
/* 211 */       throw d.create();
/*     */     }
/*     */     
/* 214 */     ☃.a(new ir("commands.clone.success", new Object[] { Integer.valueOf(k) }), true);
/*     */     
/* 216 */     return k;
/*     */   }
/*     */   
/*     */   enum b {
/* 220 */     a(true),
/* 221 */     b(true),
/* 222 */     c(false);
/*     */     
/*     */     private final boolean d;
/*     */ 
/*     */     
/*     */     b(boolean ☃) {
/* 228 */       this.d = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 232 */       return this.d;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     public final el a;
/*     */     public final blc b;
/*     */     @Nullable
/*     */     public final gy c;
/*     */     
/*     */     public a(el ☃, blc blc1, @Nullable gy gy1) {
/* 243 */       this.a = ☃;
/* 244 */       this.b = blc1;
/* 245 */       this.c = gy1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\qd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */