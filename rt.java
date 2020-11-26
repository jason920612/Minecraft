/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class rt
/*     */ {
/*     */   private static final Dynamic4CommandExceptionType a;
/*     */   private static final Dynamic4CommandExceptionType b;
/*     */   
/*     */   static {
/*  42 */     a = new Dynamic4CommandExceptionType((☃, object1, object2, object3) -> new ir("commands.spreadplayers.failed.teams", new Object[] { ☃, object1, object2, object3 }));
/*  43 */     b = new Dynamic4CommandExceptionType((☃, object1, object2, object3) -> new ir("commands.spreadplayers.failed.entities", new Object[] { ☃, object1, object2, object3 }));
/*     */   }
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  46 */     ☃.register(
/*  47 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("spreadplayers")
/*  48 */         .requires(☃ -> ☃.c(2)))
/*  49 */         .then(
/*  50 */           bv.<T>a("center", de.a())
/*  51 */           .then(
/*  52 */             bv.<T>a("spreadDistance", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/*  53 */             .then(
/*  54 */               bv.<T>a("maxRange", (ArgumentType<T>)FloatArgumentType.floatArg(1.0F))
/*  55 */               .then(
/*  56 */                 bv.<T>a("respectTeams", (ArgumentType<T>)BoolArgumentType.bool())
/*  57 */                 .then(
/*  58 */                   bv.<T>a("targets", cb.b())
/*  59 */                   .executes(☃ -> a((bu)☃.getSource(), de.a(☃, "center"), FloatArgumentType.getFloat(☃, "spreadDistance"), FloatArgumentType.getFloat(☃, "maxRange"), BoolArgumentType.getBool(☃, "respectTeams"), cb.b(☃, "targets")))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(bu ☃, ced ced1, float f1, float f2, boolean bool, Collection<? extends aer> collection) throws CommandSyntaxException {
/*  69 */     Random random = new Random();
/*  70 */     double d1 = (ced1.i - f2);
/*  71 */     double d2 = (ced1.j - f2);
/*  72 */     double d3 = (ced1.i + f2);
/*  73 */     double d4 = (ced1.j + f2);
/*     */     
/*  75 */     a[] arrayOfA = a(random, bool ? a(collection) : collection.size(), d1, d2, d3, d4);
/*  76 */     a(ced1, f1, ☃.e(), random, d1, d2, d3, d4, arrayOfA, bool);
/*  77 */     double d5 = a(collection, ☃.e(), arrayOfA, bool);
/*     */     
/*  79 */     ☃.a(new ir("commands.spreadplayers.success." + (bool ? "teams" : "entities"), new Object[] { Integer.valueOf(arrayOfA.length), Float.valueOf(ced1.i), Float.valueOf(ced1.j), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d5) }) }), true);
/*  80 */     return arrayOfA.length;
/*     */   }
/*     */   
/*     */   private static int a(Collection<? extends aer> ☃) {
/*  84 */     Set<cfe> set = Sets.newHashSet();
/*     */     
/*  86 */     for (aer aer : ☃) {
/*  87 */       if (aer instanceof aog) {
/*  88 */         set.add(aer.be()); continue;
/*     */       } 
/*  90 */       set.add(null);
/*     */     } 
/*     */ 
/*     */     
/*  94 */     return set.size();
/*     */   }
/*     */   
/*     */   private static void a(ced ☃, double d1, td td1, Random random, double d2, double d3, double d4, double d5, a[] arrayOfA, boolean bool) throws CommandSyntaxException {
/*  98 */     boolean bool1 = true;
/*     */     
/* 100 */     double d = 3.4028234663852886E38D;
/*     */     int i;
/* 102 */     for (i = 0; i < 10000 && bool1; i++) {
/* 103 */       bool1 = false;
/* 104 */       d = 3.4028234663852886E38D;
/*     */       
/* 106 */       for (int j = 0; j < arrayOfA.length; j++) {
/* 107 */         a a1 = arrayOfA[j];
/* 108 */         int k = 0;
/* 109 */         a a2 = new a();
/*     */         
/* 111 */         for (int m = 0; m < arrayOfA.length; m++) {
/* 112 */           if (j != m) {
/*     */ 
/*     */             
/* 115 */             a a3 = arrayOfA[m];
/*     */             
/* 117 */             double d6 = a1.a(a3);
/* 118 */             d = Math.min(d6, d);
/* 119 */             if (d6 < d1) {
/* 120 */               k++;
/* 121 */               a.a(a2, a.c(a2) + a.c(a3) - a.c(a1));
/* 122 */               a.b(a2, a.d(a2) + a.d(a3) - a.d(a1));
/*     */             } 
/*     */           } 
/*     */         } 
/* 126 */         if (k > 0) {
/* 127 */           a.a(a2, a.c(a2) / k);
/* 128 */           a.b(a2, a.d(a2) / k);
/* 129 */           double d6 = a2.b();
/*     */           
/* 131 */           if (d6 > 0.0D) {
/* 132 */             a2.a();
/*     */             
/* 134 */             a1.b(a2);
/*     */           } else {
/* 136 */             a1.a(random, d2, d3, d4, d5);
/*     */           } 
/*     */           
/* 139 */           bool1 = true;
/*     */         } 
/*     */         
/* 142 */         if (a1.a(d2, d3, d4, d5)) {
/* 143 */           bool1 = true;
/*     */         }
/*     */       } 
/*     */       
/* 147 */       if (!bool1) {
/* 148 */         for (a a1 : arrayOfA) {
/* 149 */           if (!a1.b(td1)) {
/* 150 */             a1.a(random, d2, d3, d4, d5);
/* 151 */             bool1 = true;
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 158 */     if (d == 3.4028234663852886E38D) {
/* 159 */       d = 0.0D;
/*     */     }
/*     */     
/* 162 */     if (i >= 10000) {
/* 163 */       if (bool) {
/* 164 */         throw a.create(Integer.valueOf(arrayOfA.length), Float.valueOf(☃.i), Float.valueOf(☃.j), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }));
/*     */       }
/* 166 */       throw b.create(Integer.valueOf(arrayOfA.length), Float.valueOf(☃.i), Float.valueOf(☃.j), String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static double a(Collection<? extends aer> ☃, td td1, a[] arrayOfA, boolean bool) {
/* 172 */     double d = 0.0D;
/* 173 */     int i = 0;
/* 174 */     Map<cfe, a> map = Maps.newHashMap();
/*     */     
/* 176 */     for (aer aer : ☃) {
/*     */       a a1;
/*     */       
/* 179 */       if (bool) {
/* 180 */         cfe cfe = (aer instanceof aog) ? aer.be() : null;
/*     */         
/* 182 */         if (!map.containsKey(cfe)) {
/* 183 */           map.put(cfe, arrayOfA[i++]);
/*     */         }
/*     */         
/* 186 */         a1 = map.get(cfe);
/*     */       } else {
/* 188 */         a1 = arrayOfA[i++];
/*     */       } 
/*     */       
/* 191 */       aer.a((xq.c(a.c(a1)) + 0.5F), a1.a(td1), xq.c(a.d(a1)) + 0.5D);
/*     */       
/* 193 */       double d1 = Double.MAX_VALUE;
/* 194 */       for (a a2 : arrayOfA) {
/* 195 */         if (a1 != a2) {
/*     */ 
/*     */ 
/*     */           
/* 199 */           double d2 = a1.a(a2);
/* 200 */           d1 = Math.min(d2, d1);
/*     */         } 
/* 202 */       }  d += d1;
/*     */     } 
/* 204 */     if (☃.size() < 2) {
/* 205 */       return 0.0D;
/*     */     }
/*     */     
/* 208 */     d /= ☃.size();
/* 209 */     return d;
/*     */   }
/*     */   
/*     */   private static a[] a(Random ☃, int i, double d1, double d2, double d3, double d4) {
/* 213 */     a[] arrayOfA = new a[i];
/*     */     
/* 215 */     for (int j = 0; j < arrayOfA.length; j++) {
/* 216 */       a a = new a();
/* 217 */       a.a(☃, d1, d2, d3, d4);
/* 218 */       arrayOfA[j] = a;
/*     */     } 
/*     */     
/* 221 */     return arrayOfA;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/*     */     private double a;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private double b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     double a(a ☃) {
/* 242 */       double d1 = this.a - ☃.a;
/* 243 */       double d2 = this.b - ☃.b;
/*     */       
/* 245 */       return Math.sqrt(d1 * d1 + d2 * d2);
/*     */     }
/*     */     
/*     */     void a() {
/* 249 */       double ☃ = b();
/* 250 */       this.a /= ☃;
/* 251 */       this.b /= ☃;
/*     */     }
/*     */     
/*     */     float b() {
/* 255 */       return xq.a(this.a * this.a + this.b * this.b);
/*     */     }
/*     */     
/*     */     public void b(a ☃) {
/* 259 */       this.a -= ☃.a;
/* 260 */       this.b -= ☃.b;
/*     */     }
/*     */     
/*     */     public boolean a(double ☃, double d1, double d2, double d3) {
/* 264 */       boolean bool = false;
/*     */       
/* 266 */       if (this.a < ☃) {
/* 267 */         this.a = ☃;
/* 268 */         bool = true;
/* 269 */       } else if (this.a > d2) {
/* 270 */         this.a = d2;
/* 271 */         bool = true;
/*     */       } 
/*     */       
/* 274 */       if (this.b < d1) {
/* 275 */         this.b = d1;
/* 276 */         bool = true;
/* 277 */       } else if (this.b > d3) {
/* 278 */         this.b = d3;
/* 279 */         bool = true;
/*     */       } 
/*     */       
/* 282 */       return bool;
/*     */     }
/*     */     
/*     */     public int a(axk ☃) {
/* 286 */       el el = new el(this.a, 256.0D, this.b);
/* 287 */       while (el.p() > 0) {
/* 288 */         el = el.b();
/*     */         
/* 290 */         if (!☃.a_(el).f()) {
/* 291 */           return el.p() + 1;
/*     */         }
/*     */       } 
/*     */       
/* 295 */       return 257;
/*     */     }
/*     */     
/*     */     public boolean b(axk ☃) {
/* 299 */       el el = new el(this.a, 256.0D, this.b);
/* 300 */       while (el.p() > 0) {
/* 301 */         el = el.b();
/*     */         
/* 303 */         blc blc = ☃.a_(el);
/* 304 */         if (!blc.f()) {
/* 305 */           bza bza = blc.d();
/* 306 */           return (!bza.a() && bza != bza.m);
/*     */         } 
/*     */       } 
/*     */       
/* 310 */       return false;
/*     */     }
/*     */     
/*     */     public void a(Random ☃, double d1, double d2, double d3, double d4) {
/* 314 */       this.a = xq.a(☃, d1, d3);
/* 315 */       this.b = xq.a(☃, d2, d4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\rt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */