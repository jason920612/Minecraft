/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class va
/*     */ {
/*  23 */   private static final Logger a = LogManager.getLogger();
/*  24 */   private static final uq b = new uq((new ir("resourcePack.broken_assets", new Object[0])).a(new a[] { a.m, a.u }), 4);
/*     */   
/*     */   private final String c;
/*     */   private final Supplier<ul> d;
/*     */   private final ij e;
/*     */   private final ij f;
/*     */   private final uw g;
/*     */   private final a h;
/*     */   private final boolean i;
/*     */   private final boolean j;
/*     */   
/*     */   @Nullable
/*     */   public static <T extends va> T a(String ☃, boolean bool, Supplier<ul> supplier, b<T> b1, a a1) {
/*  37 */     try (ul ☃ = (ul)supplier.get()) {
/*  38 */       uq uq1 = ul.<uq>a(uq.a);
/*  39 */       if (bool && uq1 == null) {
/*  40 */         a.error("Broken/missing pack.mcmeta detected, fudging it into existance. Please check that your launcher has downloaded all assets for the game correctly!");
/*  41 */         uq1 = b;
/*     */       } 
/*     */       
/*  44 */       if (uq1 != null) {
/*  45 */         return b1.create(☃, bool, supplier, ul, uq1, a1);
/*     */       }
/*  47 */       a.warn("Couldn't find pack meta for pack {}", ☃);
/*     */     }
/*  49 */     catch (IOException iOException) {
/*  50 */       a.warn("Couldn't get pack info for: {}", iOException.toString());
/*     */     } 
/*  52 */     return null;
/*     */   }
/*     */   
/*     */   public va(String ☃, boolean bool1, Supplier<ul> supplier, ij ij1, ij ij2, uw uw1, a a1, boolean bool2) {
/*  56 */     this.c = ☃;
/*  57 */     this.d = supplier;
/*  58 */     this.e = ij1;
/*  59 */     this.f = ij2;
/*  60 */     this.g = uw1;
/*  61 */     this.i = bool1;
/*  62 */     this.h = a1;
/*  63 */     this.j = bool2;
/*     */   }
/*     */   
/*     */   public va(String ☃, boolean bool, Supplier<ul> supplier, ul ul1, uq uq1, a a1) {
/*  67 */     this(☃, bool, supplier, new iq(ul1.a()), uq1.a(), uw.a(uq1.b()), a1, false);
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
/*     */   public ij a(boolean ☃) {
/*  79 */     return ik.a(new iq(this.c)).a(ip1 -> ip1.a(☃ ? a.k : a.m).a(StringArgumentType.escapeIfRequired(this.c)).a(new il(il.a.a, (new iq("")).a(this.e).a("\n").a(this.f))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public uw c() {
/*  87 */     return this.g;
/*     */   }
/*     */   
/*     */   public ul d() {
/*  91 */     return this.d.get();
/*     */   }
/*     */   
/*     */   public String e() {
/*  95 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  99 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 103 */     return this.j;
/*     */   }
/*     */   
/*     */   public a h() {
/* 107 */     return this.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 118 */     if (this == ☃) {
/* 119 */       return true;
/*     */     }
/* 121 */     if (!(☃ instanceof va)) {
/* 122 */       return false;
/*     */     }
/*     */     
/* 125 */     va va1 = (va)☃;
/*     */     
/* 127 */     return this.c.equals(va1.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 132 */     return this.c.hashCode();
/*     */   }
/*     */   
/*     */   public enum a {
/* 136 */     a,
/* 137 */     b;
/*     */ 
/*     */ 
/*     */     
/*     */     public <T, P extends va> int a(List<T> ☃, T t, Function<T, P> function, boolean bool) {
/* 142 */       a a1 = bool ? a() : this;
/* 143 */       if (a1 == b) {
/* 144 */         int j = 0;
/* 145 */         while (j < ☃.size()) {
/* 146 */           va va = (va)function.apply(☃.get(j));
/* 147 */           if (va.g() && va.h() == this) {
/* 148 */             j++;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 153 */         ☃.add(j, t);
/* 154 */         return j;
/*     */       } 
/* 156 */       int i = ☃.size() - 1;
/* 157 */       while (i >= 0) {
/* 158 */         va va = (va)function.apply(☃.get(i));
/* 159 */         if (va.g() && va.h() == this) {
/* 160 */           i--;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 165 */       ☃.add(i + 1, t);
/* 166 */       return i + 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public a a() {
/* 171 */       return (this == a) ? b : a;
/*     */     }
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface b<T extends va> {
/*     */     @Nullable
/*     */     T create(String param1String, boolean param1Boolean, Supplier<ul> param1Supplier, ul param1ul, uq param1uq, va.a param1a);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\va.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */