/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class xr
/*     */ {
/*  15 */   private static final Logger a = LogManager.getLogger();
/*  16 */   private final List<String> b = Lists.newArrayList();
/*  17 */   private final List<Long> c = Lists.newArrayList();
/*     */   private boolean d;
/*  19 */   private String e = "";
/*  20 */   private final Map<String, Long> f = Maps.newHashMap();
/*     */   private long g;
/*     */   private int h;
/*     */   
/*     */   public boolean a() {
/*  25 */     return this.d;
/*     */   }
/*     */   
/*     */   public void b() {
/*  29 */     this.d = false;
/*     */   }
/*     */   
/*     */   public long c() {
/*  33 */     return this.g;
/*     */   }
/*     */   
/*     */   public int d() {
/*  37 */     return this.h;
/*     */   }
/*     */   
/*     */   public static final class a implements Comparable<a> {
/*     */     public double a;
/*     */     public double b;
/*     */     public String c;
/*     */     
/*     */     public a(String ☃, double d1, double d2) {
/*  46 */       this.c = ☃;
/*  47 */       this.a = d1;
/*  48 */       this.b = d2;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(a ☃) {
/*  53 */       if (☃.a < this.a) {
/*  54 */         return -1;
/*     */       }
/*  56 */       if (☃.a > this.a) {
/*  57 */         return 1;
/*     */       }
/*  59 */       return ☃.c.compareTo(this.c);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/*  68 */     if (this.d) {
/*     */       return;
/*     */     }
/*     */     
/*  72 */     this.d = true;
/*  73 */     this.f.clear();
/*  74 */     this.e = "";
/*  75 */     this.b.clear();
/*  76 */     this.h = ☃;
/*  77 */     this.g = k.c();
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  81 */     if (!this.d) {
/*     */       return;
/*     */     }
/*  84 */     if (!this.e.isEmpty()) {
/*  85 */       this.e += ".";
/*     */     }
/*  87 */     this.e += ☃;
/*  88 */     this.b.add(this.e);
/*  89 */     this.c.add(Long.valueOf(k.c()));
/*     */   }
/*     */   
/*     */   public void a(Supplier<String> ☃) {
/*  93 */     if (!this.d) {
/*     */       return;
/*     */     }
/*  96 */     a(☃.get());
/*     */   }
/*     */   
/*     */   public void e() {
/* 100 */     if (!this.d || this.c.isEmpty()) {
/*     */       return;
/*     */     }
/* 103 */     long ☃ = k.c();
/* 104 */     long l1 = ((Long)this.c.remove(this.c.size() - 1)).longValue();
/* 105 */     this.b.remove(this.b.size() - 1);
/* 106 */     long l2 = ☃ - l1;
/*     */     
/* 108 */     if (this.f.containsKey(this.e)) {
/* 109 */       this.f.put(this.e, Long.valueOf(((Long)this.f.get(this.e)).longValue() + l2));
/*     */     } else {
/* 111 */       this.f.put(this.e, Long.valueOf(l2));
/*     */     } 
/*     */     
/* 114 */     if (l2 > 100000000L) {
/* 115 */       a.warn("Something's taking too long! '{}' took aprox {} ms", this.e, Double.valueOf(l2 / 1000000.0D));
/*     */     }
/*     */     
/* 118 */     this.e = this.b.isEmpty() ? "" : this.b.get(this.b.size() - 1);
/*     */   }
/*     */   
/*     */   public List<a> b(String ☃) {
/* 122 */     String str = ☃;
/* 123 */     long l1 = this.f.containsKey("root") ? ((Long)this.f.get("root")).longValue() : 0L;
/* 124 */     long l2 = this.f.containsKey(☃) ? ((Long)this.f.get(☃)).longValue() : -1L;
/*     */     
/* 126 */     List<a> list = Lists.newArrayList();
/*     */     
/* 128 */     if (!☃.isEmpty()) {
/* 129 */       ☃ = ☃ + ".";
/*     */     }
/* 131 */     long l3 = 0L;
/*     */     
/* 133 */     for (String str1 : this.f.keySet()) {
/* 134 */       if (str1.length() > ☃.length() && str1.startsWith(☃) && str1.indexOf(".", ☃.length() + 1) < 0) {
/* 135 */         l3 += ((Long)this.f.get(str1)).longValue();
/*     */       }
/*     */     } 
/*     */     
/* 139 */     float f = (float)l3;
/* 140 */     if (l3 < l2) {
/* 141 */       l3 = l2;
/*     */     }
/* 143 */     if (l1 < l3) {
/* 144 */       l1 = l3;
/*     */     }
/*     */     
/* 147 */     for (String str1 : this.f.keySet()) {
/* 148 */       if (str1.length() > ☃.length() && str1.startsWith(☃) && str1.indexOf(".", ☃.length() + 1) < 0) {
/* 149 */         long l = ((Long)this.f.get(str1)).longValue();
/* 150 */         double d1 = l * 100.0D / l3;
/* 151 */         double d2 = l * 100.0D / l1;
/* 152 */         String str2 = str1.substring(☃.length());
/* 153 */         list.add(new a(str2, d1, d2));
/*     */       } 
/*     */     } 
/*     */     
/* 157 */     for (String str1 : this.f.keySet()) {
/* 158 */       this.f.put(str1, Long.valueOf(((Long)this.f.get(str1)).longValue() * 999L / 1000L));
/*     */     }
/*     */     
/* 161 */     if ((float)l3 > f) {
/* 162 */       list.add(new a("unspecified", ((float)l3 - f) * 100.0D / l3, ((float)l3 - f) * 100.0D / l1));
/*     */     }
/*     */     
/* 165 */     Collections.sort(list);
/* 166 */     list.add(0, new a(str, 100.0D, l3 * 100.0D / l1));
/* 167 */     return list;
/*     */   }
/*     */   
/*     */   public void c(String ☃) {
/* 171 */     e();
/* 172 */     a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String f() {
/* 181 */     return this.b.isEmpty() ? "[UNKNOWN]" : this.b.get(this.b.size() - 1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\xr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */