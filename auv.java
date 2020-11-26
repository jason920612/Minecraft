/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
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
/*     */ public class auv
/*     */ {
/*     */   public static List<aek> a(ate ☃) {
/*  34 */     return a(☃.n());
/*     */   }
/*     */   
/*     */   public static List<aek> a(aut ☃, Collection<aek> collection) {
/*  38 */     List<aek> list = Lists.newArrayList();
/*     */     
/*  40 */     list.addAll(☃.a());
/*  41 */     list.addAll(collection);
/*     */     
/*  43 */     return list;
/*     */   }
/*     */   
/*     */   public static List<aek> a(@Nullable gy ☃) {
/*  47 */     List<aek> list = Lists.newArrayList();
/*     */     
/*  49 */     list.addAll(c(☃).a());
/*  50 */     a(☃, list);
/*     */     
/*  52 */     return list;
/*     */   }
/*     */   
/*     */   public static List<aek> b(ate ☃) {
/*  56 */     return b(☃.n());
/*     */   }
/*     */   
/*     */   public static List<aek> b(@Nullable gy ☃) {
/*  60 */     List<aek> list = Lists.newArrayList();
/*  61 */     a(☃, list);
/*  62 */     return list;
/*     */   }
/*     */   
/*     */   public static void a(@Nullable gy ☃, List<aek> list) {
/*  66 */     if (☃ != null && ☃.c("CustomPotionEffects", 9)) {
/*  67 */       he he = ☃.d("CustomPotionEffects", 10);
/*     */       
/*  69 */       for (int i = 0; i < he.size(); i++) {
/*  70 */         gy gy1 = he.e(i);
/*  71 */         aek aek = aek.b(gy1);
/*  72 */         if (aek != null) {
/*  73 */           list.add(aek);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int c(ate ☃) {
/*  80 */     gy gy = ☃.n();
/*  81 */     if (gy != null && 
/*  82 */       gy.c("CustomPotionColor", 99)) {
/*  83 */       return gy.h("CustomPotionColor");
/*     */     }
/*     */     
/*  86 */     return (d(☃) == auw.a) ? 16253176 : a(a(☃));
/*     */   }
/*     */   
/*     */   public static int a(aut ☃) {
/*  90 */     return (☃ == auw.a) ? 16253176 : a(☃.a());
/*     */   }
/*     */   
/*     */   public static int a(Collection<aek> ☃) {
/*  94 */     int i = 3694022;
/*  95 */     if (☃.isEmpty()) {
/*  96 */       return 3694022;
/*     */     }
/*     */     
/*  99 */     float f1 = 0.0F;
/* 100 */     float f2 = 0.0F;
/* 101 */     float f3 = 0.0F;
/* 102 */     int j = 0;
/*     */     
/* 104 */     for (aek aek : ☃) {
/* 105 */       if (!aek.e()) {
/*     */         continue;
/*     */       }
/*     */       
/* 109 */       int k = aek.a().i();
/* 110 */       int m = aek.c() + 1;
/* 111 */       f1 += (m * (k >> 16 & 0xFF)) / 255.0F;
/* 112 */       f2 += (m * (k >> 8 & 0xFF)) / 255.0F;
/* 113 */       f3 += (m * (k >> 0 & 0xFF)) / 255.0F;
/* 114 */       j += m;
/*     */     } 
/*     */     
/* 117 */     if (j == 0) {
/* 118 */       return 0;
/*     */     }
/*     */     
/* 121 */     f1 = f1 / j * 255.0F;
/* 122 */     f2 = f2 / j * 255.0F;
/* 123 */     f3 = f3 / j * 255.0F;
/*     */     
/* 125 */     return (int)f1 << 16 | (int)f2 << 8 | (int)f3;
/*     */   }
/*     */   
/*     */   public static aut d(ate ☃) {
/* 129 */     return c(☃.n());
/*     */   }
/*     */   
/*     */   public static aut c(@Nullable gy ☃) {
/* 133 */     if (☃ == null) {
/* 134 */       return auw.a;
/*     */     }
/*     */     
/* 137 */     return aut.a(☃.l("Potion"));
/*     */   }
/*     */   
/*     */   public static ate a(ate ☃, aut aut1) {
/* 141 */     pc pc = fc.j.b(aut1);
/*     */     
/* 143 */     if (aut1 == auw.a) {
/* 144 */       ☃.c("Potion");
/*     */     } else {
/* 146 */       ☃.o().a("Potion", pc.toString());
/*     */     } 
/*     */     
/* 149 */     return ☃;
/*     */   }
/*     */   
/*     */   public static ate a(ate ☃, Collection<aek> collection) {
/* 153 */     if (collection.isEmpty()) {
/* 154 */       return ☃;
/*     */     }
/*     */     
/* 157 */     gy gy = ☃.o();
/* 158 */     he he = gy.d("CustomPotionEffects", 9);
/*     */     
/* 160 */     for (aek aek : collection) {
/* 161 */       he.a(aek.a(new gy()));
/*     */     }
/* 163 */     gy.a("CustomPotionEffects", he);
/*     */     
/* 165 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\auv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */