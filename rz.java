/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
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
/*     */ public class rz
/*     */ {
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  44 */     LiteralCommandNode<bu> literalCommandNode = ☃.register(
/*  45 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("teleport")
/*  46 */         .requires(☃ -> ☃.c(2)))
/*  47 */         .then((
/*  48 */           (RequiredArgumentBuilder)bv.<T>a("targets", cb.b())
/*  49 */           .then((
/*  50 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)bv.<T>a("location", df.a())
/*  51 */             .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), ((bu)☃.getSource()).e(), df.b(☃, "location"), null, null)))
/*  52 */             .then(
/*  53 */               bv.<T>a("rotation", dc.a())
/*  54 */               .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), ((bu)☃.getSource()).e(), df.b(☃, "location"), dc.a(☃, "rotation"), null))))
/*     */             
/*  56 */             .then((
/*  57 */               (LiteralArgumentBuilder)bv.a("facing")
/*  58 */               .then(
/*  59 */                 bv.a("entity")
/*  60 */                 .then((
/*  61 */                   (RequiredArgumentBuilder)bv.<T>a("facingEntity", cb.a())
/*  62 */                   .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), ((bu)☃.getSource()).e(), df.b(☃, "location"), null, new a(cb.a(☃, "facingEntity"), ca.a.a))))
/*  63 */                   .then(
/*  64 */                     bv.<T>a("facingAnchor", ca.a())
/*  65 */                     .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), ((bu)☃.getSource()).e(), df.b(☃, "location"), null, new a(cb.a(☃, "facingEntity"), ca.a(☃, "facingAnchor"))))))))
/*     */ 
/*     */ 
/*     */               
/*  69 */               .then(
/*  70 */                 bv.<T>a("facingLocation", df.a())
/*  71 */                 .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), ((bu)☃.getSource()).e(), df.b(☃, "location"), null, new a(df.a(☃, "facingLocation"))))))))
/*     */ 
/*     */ 
/*     */           
/*  75 */           .then(
/*  76 */             bv.<T>a("destination", cb.a())
/*  77 */             .executes(☃ -> a((bu)☃.getSource(), cb.b(☃, "targets"), cb.a(☃, "destination"))))))
/*     */ 
/*     */         
/*  80 */         .then(
/*  81 */           bv.<T>a("location", df.a())
/*  82 */           .executes(☃ -> a((bu)☃.getSource(), Collections.singleton(((bu)☃.getSource()).g()), ((bu)☃.getSource()).e(), df.b(☃, "location"), dh.d(), null))))
/*     */         
/*  84 */         .then(
/*  85 */           bv.<T>a("destination", cb.a())
/*  86 */           .executes(☃ -> a((bu)☃.getSource(), Collections.singleton(((bu)☃.getSource()).g()), cb.a(☃, "destination")))));
/*     */ 
/*     */     
/*  89 */     ☃.register(
/*  90 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("tp")
/*  91 */         .requires(☃ -> ☃.c(2)))
/*  92 */         .redirect((CommandNode)literalCommandNode));
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends aer> collection, aer aer1) {
/*  97 */     for (aer aer2 : collection) {
/*  98 */       a(☃, aer2, ☃.e(), aer1.q, aer1.r, aer1.s, EnumSet.noneOf(kt.a.class), aer1.w, aer1.x, null);
/*     */     }
/*     */     
/* 101 */     if (collection.size() == 1) {
/* 102 */       ☃.a(new ir("commands.teleport.success.entity.single", new Object[] { ((aer)collection.iterator().next()).O(), aer1.O() }), true);
/*     */     } else {
/* 104 */       ☃.a(new ir("commands.teleport.success.entity.multiple", new Object[] { Integer.valueOf(collection.size()), aer1.O() }), true);
/*     */     } 
/*     */     
/* 107 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(bu ☃, Collection<? extends aer> collection, td td1, da da1, @Nullable da da2, @Nullable a a1) throws CommandSyntaxException {
/* 111 */     cee cee = da1.a(☃);
/* 112 */     ced ced = (da2 == null) ? null : da2.b(☃);
/* 113 */     Set<kt.a> set = EnumSet.noneOf(kt.a.class);
/*     */     
/* 115 */     if (da1.a()) {
/* 116 */       set.add(kt.a.a);
/*     */     }
/* 118 */     if (da1.b()) {
/* 119 */       set.add(kt.a.b);
/*     */     }
/* 121 */     if (da1.c()) {
/* 122 */       set.add(kt.a.c);
/*     */     }
/* 124 */     if (da2 == null) {
/* 125 */       set.add(kt.a.e);
/* 126 */       set.add(kt.a.d);
/*     */     } else {
/* 128 */       if (da2.a()) {
/* 129 */         set.add(kt.a.e);
/*     */       }
/* 131 */       if (da2.b()) {
/* 132 */         set.add(kt.a.d);
/*     */       }
/*     */     } 
/*     */     
/* 136 */     for (aer aer : collection) {
/* 137 */       if (da2 == null) {
/* 138 */         a(☃, aer, td1, cee.b, cee.c, cee.d, set, aer.w, aer.x, a1); continue;
/*     */       } 
/* 140 */       a(☃, aer, td1, cee.b, cee.c, cee.d, set, ced.j, ced.i, a1);
/*     */     } 
/*     */ 
/*     */     
/* 144 */     if (collection.size() == 1) {
/* 145 */       ☃.a(new ir("commands.teleport.success.location.single", new Object[] { ((aer)collection.iterator().next()).O(), Double.valueOf(cee.b), Double.valueOf(cee.c), Double.valueOf(cee.d) }), true);
/*     */     } else {
/* 147 */       ☃.a(new ir("commands.teleport.success.location.multiple", new Object[] { Integer.valueOf(collection.size()), Double.valueOf(cee.b), Double.valueOf(cee.c), Double.valueOf(cee.d) }), true);
/*     */     } 
/*     */     
/* 150 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static void a(bu ☃, aer aer1, td td1, double d1, double d2, double d3, Set<kt.a> set, float f1, float f2, @Nullable a a1) {
/* 154 */     if (aer1 instanceof tf) {
/* 155 */       aer1.S_();
/*     */       
/* 157 */       if (((tf)aer1).cL()) {
/* 158 */         ((tf)aer1).a(true, true, false);
/*     */       }
/*     */       
/* 161 */       if (td1 == aer1.m) {
/* 162 */         ((tf)aer1).a.a(d1, d2, d3, f1, f2, set);
/*     */       } else {
/* 164 */         ((tf)aer1).a(td1, d1, d2, d3, f1, f2);
/*     */       } 
/* 166 */       aer1.j(f1);
/*     */     } else {
/* 168 */       float f3 = xq.g(f1);
/* 169 */       float f4 = xq.g(f2);
/*     */       
/* 171 */       f4 = xq.a(f4, -90.0F, 90.0F);
/*     */       
/* 173 */       if (td1 == aer1.m) {
/* 174 */         aer1.b(d1, d2, d3, f3, f4);
/* 175 */         aer1.j(f3);
/*     */       } else {
/* 177 */         td td2 = (td)aer1.m;
/* 178 */         td2.e(aer1);
/* 179 */         aer1.ap = td1.t.q();
/* 180 */         aer1.G = false;
/* 181 */         aer aer2 = aer1;
/* 182 */         aer1 = (aer)aer2.P().a(td1);
/* 183 */         if (aer1 != null) {
/* 184 */           aer1.v(aer2);
/* 185 */           aer1.b(d1, d2, d3, f3, f4);
/* 186 */           aer1.j(f3);
/* 187 */           boolean bool = aer1.l;
/* 188 */           aer1.l = true;
/* 189 */           td1.a(aer1);
/* 190 */           aer1.l = bool;
/* 191 */           td1.a(aer1, false);
/*     */           
/* 193 */           aer2.G = true;
/*     */         } else {
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 200 */     if (a1 != null) {
/* 201 */       a1.a(☃, aer1);
/*     */     }
/*     */     
/* 204 */     if (!(aer1 instanceof afa) || !((afa)aer1).dc()) {
/* 205 */       aer1.u = 0.0D;
/* 206 */       aer1.A = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final cee a;
/*     */     private final aer b;
/*     */     private final ca.a c;
/*     */     
/*     */     public a(aer ☃, ca.a a1) {
/* 216 */       this.b = ☃;
/* 217 */       this.c = a1;
/* 218 */       this.a = a1.a(☃);
/*     */     }
/*     */     
/*     */     public a(cee ☃) {
/* 222 */       this.b = null;
/* 223 */       this.a = ☃;
/* 224 */       this.c = null;
/*     */     }
/*     */     
/*     */     public void a(bu ☃, aer aer1) {
/* 228 */       if (this.b != null) {
/* 229 */         if (aer1 instanceof tf) {
/* 230 */           ((tf)aer1).a(☃.k(), this.b, this.c);
/*     */         } else {
/* 232 */           aer1.a(☃.k(), this.a);
/*     */         } 
/*     */       } else {
/* 235 */         aer1.a(☃.k(), this.a);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\rz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */