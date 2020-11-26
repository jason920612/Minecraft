/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Function;
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
/*     */ public class dr
/*     */ {
/*     */   private final int a;
/*     */   private final boolean b;
/*     */   private final boolean c;
/*     */   private final Predicate<aer> d;
/*     */   private final ba.c e;
/*     */   private final Function<cee, cee> f;
/*     */   @Nullable
/*     */   private final cea g;
/*     */   private final BiConsumer<cee, List<? extends aer>> h;
/*     */   private final boolean i;
/*     */   @Nullable
/*     */   private final String j;
/*     */   @Nullable
/*     */   private final UUID k;
/*     */   private final Class<? extends aer> l;
/*     */   private final boolean m;
/*     */   
/*     */   public dr(int ☃, boolean bool1, boolean bool2, Predicate<aer> predicate, ba.c c1, Function<cee, cee> function, @Nullable cea cea1, BiConsumer<cee, List<? extends aer>> biConsumer, boolean bool3, @Nullable String str, @Nullable UUID uUID, Class<? extends aer> clazz, boolean bool4) {
/*  46 */     this.a = ☃;
/*  47 */     this.b = bool1;
/*  48 */     this.c = bool2;
/*  49 */     this.d = predicate;
/*  50 */     this.e = c1;
/*  51 */     this.f = function;
/*  52 */     this.g = cea1;
/*  53 */     this.h = biConsumer;
/*  54 */     this.i = bool3;
/*  55 */     this.j = str;
/*  56 */     this.k = uUID;
/*  57 */     this.l = clazz;
/*  58 */     this.m = bool4;
/*     */   }
/*     */   
/*     */   public int a() {
/*  62 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  66 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  70 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  74 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void e(bu ☃) throws CommandSyntaxException {
/*  82 */     if (this.m && !☃.c(2)) {
/*  83 */       throw cb.f.create();
/*     */     }
/*     */   }
/*     */   
/*     */   public aer a(bu ☃) throws CommandSyntaxException {
/*  88 */     e(☃);
/*     */     
/*  90 */     List<? extends aer> list = b(☃);
/*  91 */     if (list.isEmpty()) {
/*  92 */       throw cb.d.create();
/*     */     }
/*  94 */     if (list.size() > 1) {
/*  95 */       throw cb.a.create();
/*     */     }
/*  97 */     return list.get(0);
/*     */   }
/*     */   
/*     */   public List<? extends aer> b(bu ☃) throws CommandSyntaxException {
/* 101 */     e(☃);
/*     */     
/* 103 */     if (!this.b) {
/* 104 */       return (List)d(☃);
/*     */     }
/* 106 */     if (this.j != null) {
/* 107 */       tf tf = ☃.j().ac().a(this.j);
/* 108 */       if (tf == null) {
/* 109 */         return Collections.emptyList();
/*     */       }
/* 111 */       return Lists.newArrayList((Object[])new tf[] { tf });
/*     */     } 
/* 113 */     if (this.k != null) {
/* 114 */       for (td td : ☃.j().w()) {
/* 115 */         aer aer = td.a(this.k);
/* 116 */         if (aer != null) {
/* 117 */           return Lists.newArrayList((Object[])new aer[] { aer });
/*     */         }
/*     */       } 
/* 120 */       return Collections.emptyList();
/*     */     } 
/* 122 */     cee cee = this.f.apply(☃.d());
/* 123 */     Predicate<aer> predicate = a(cee);
/*     */     
/* 125 */     if (this.i) {
/* 126 */       if (☃.f() != null && predicate.test(☃.f())) {
/* 127 */         return Lists.newArrayList((Object[])new aer[] { ☃.f() });
/*     */       }
/* 129 */       return Collections.emptyList();
/*     */     } 
/*     */ 
/*     */     
/* 133 */     List<aer> list = Lists.newArrayList();
/*     */     
/* 135 */     if (d()) {
/* 136 */       a(list, ☃.e(), cee, predicate);
/*     */     } else {
/* 138 */       for (td td : ☃.j().w()) {
/* 139 */         a(list, td, cee, predicate);
/*     */       }
/*     */     } 
/*     */     
/* 143 */     return a(cee, list);
/*     */   }
/*     */   
/*     */   private void a(List<aer> ☃, td td1, cee cee1, Predicate<aer> predicate) {
/* 147 */     if (this.g != null) {
/* 148 */       ☃.addAll(td1.a(this.l, this.g.a(cee1), predicate::test));
/*     */     } else {
/* 150 */       ☃.addAll(td1.a(this.l, predicate::test));
/*     */     } 
/*     */   }
/*     */   
/*     */   public tf c(bu ☃) throws CommandSyntaxException {
/* 155 */     e(☃);
/*     */     
/* 157 */     List<tf> list = d(☃);
/* 158 */     if (list.size() != 1) {
/* 159 */       throw cb.e.create();
/*     */     }
/* 161 */     return list.get(0);
/*     */   }
/*     */   public List<tf> d(bu ☃) throws CommandSyntaxException {
/*     */     List<tf> list;
/* 165 */     e(☃);
/*     */     
/* 167 */     if (this.j != null) {
/* 168 */       tf tf = ☃.j().ac().a(this.j);
/* 169 */       if (tf == null) {
/* 170 */         return Collections.emptyList();
/*     */       }
/* 172 */       return Lists.newArrayList((Object[])new tf[] { tf });
/*     */     } 
/* 174 */     if (this.k != null) {
/* 175 */       tf tf = ☃.j().ac().a(this.k);
/* 176 */       if (tf == null) {
/* 177 */         return Collections.emptyList();
/*     */       }
/* 179 */       return Lists.newArrayList((Object[])new tf[] { tf });
/*     */     } 
/*     */ 
/*     */     
/* 183 */     cee cee = this.f.apply(☃.d());
/* 184 */     Predicate<aer> predicate = a(cee);
/*     */     
/* 186 */     if (this.i) {
/* 187 */       if (☃.f() instanceof tf) {
/* 188 */         tf tf = (tf)☃.f();
/* 189 */         if (predicate.test(tf)) {
/* 190 */           return Lists.newArrayList((Object[])new tf[] { tf });
/*     */         }
/*     */       } 
/* 193 */       return Collections.emptyList();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 198 */     if (d()) {
/* 199 */       list = ☃.e().b(tf.class, predicate::test);
/*     */     } else {
/* 201 */       list = Lists.newArrayList();
/* 202 */       for (tf tf : ☃.j().ac().v()) {
/* 203 */         if (predicate.test(tf)) {
/* 204 */           list.add(tf);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 209 */     return a(cee, list);
/*     */   }
/*     */   
/*     */   private Predicate<aer> a(cee ☃) {
/* 213 */     Predicate<aer> predicate = this.d;
/* 214 */     if (this.g != null) {
/* 215 */       cea cea1 = this.g.a(☃);
/* 216 */       predicate = predicate.and(aer1 -> ☃.c(aer1.bD()));
/*     */     } 
/*     */     
/* 219 */     if (!this.e.c()) {
/* 220 */       predicate = predicate.and(aer1 -> this.e.a(aer1.a(☃)));
/*     */     }
/* 222 */     return predicate;
/*     */   }
/*     */   
/*     */   private <T extends aer> List<T> a(cee ☃, List<T> list) {
/* 226 */     if (list.size() > 1) {
/* 227 */       this.h.accept(☃, list);
/*     */     }
/*     */     
/* 230 */     return list.subList(0, Math.min(this.a, list.size()));
/*     */   }
/*     */   
/*     */   public static ij a(List<? extends aer> ☃) {
/* 234 */     return ik.b(☃, aer::O);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\dr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */