/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cff
/*     */ {
/*  14 */   public static final Map<String, cff> a = Maps.newHashMap();
/*  15 */   public static final cff b = new cff("dummy");
/*  16 */   public static final cff c = new cff("trigger");
/*  17 */   public static final cff d = new cff("deathCount");
/*  18 */   public static final cff e = new cff("playerKillCount");
/*  19 */   public static final cff f = new cff("totalKillCount");
/*  20 */   public static final cff g = new cff("health", true, a.b);
/*  21 */   public static final cff h = new cff("food", true, a.a);
/*  22 */   public static final cff i = new cff("air", true, a.a);
/*  23 */   public static final cff j = new cff("armor", true, a.a);
/*  24 */   public static final cff k = new cff("xp", true, a.a);
/*  25 */   public static final cff l = new cff("level", true, a.a);
/*  26 */   public static final cff[] m = new cff[] { new cff("teamkill." + a.a
/*  27 */         .g()), new cff("teamkill." + a.b.g()), new cff("teamkill." + a.c
/*  28 */         .g()), new cff("teamkill." + a.d.g()), new cff("teamkill." + a.e
/*  29 */         .g()), new cff("teamkill." + a.f.g()), new cff("teamkill." + a.g
/*  30 */         .g()), new cff("teamkill." + a.h.g()), new cff("teamkill." + a.i
/*  31 */         .g()), new cff("teamkill." + a.j.g()), new cff("teamkill." + a.k
/*  32 */         .g()), new cff("teamkill." + a.l.g()), new cff("teamkill." + a.m
/*  33 */         .g()), new cff("teamkill." + a.n.g()), new cff("teamkill." + a.o
/*  34 */         .g()), new cff("teamkill." + a.p.g()) };
/*     */   
/*  36 */   public static final cff[] n = new cff[] { new cff("killedByTeam." + a.a
/*  37 */         .g()), new cff("killedByTeam." + a.b.g()), new cff("killedByTeam." + a.c
/*  38 */         .g()), new cff("killedByTeam." + a.d.g()), new cff("killedByTeam." + a.e
/*  39 */         .g()), new cff("killedByTeam." + a.f.g()), new cff("killedByTeam." + a.g
/*  40 */         .g()), new cff("killedByTeam." + a.h.g()), new cff("killedByTeam." + a.i
/*  41 */         .g()), new cff("killedByTeam." + a.j.g()), new cff("killedByTeam." + a.k
/*  42 */         .g()), new cff("killedByTeam." + a.l.g()), new cff("killedByTeam." + a.m
/*  43 */         .g()), new cff("killedByTeam." + a.n.g()), new cff("killedByTeam." + a.o
/*  44 */         .g()), new cff("killedByTeam." + a.p.g()) };
/*     */   
/*     */   private final String o;
/*     */   
/*     */   private final boolean p;
/*     */   private final a q;
/*     */   
/*     */   public cff(String ☃) {
/*  52 */     this(☃, false, a.a);
/*     */   }
/*     */   
/*     */   protected cff(String ☃, boolean bool, a a1) {
/*  56 */     this.o = ☃;
/*  57 */     this.p = bool;
/*  58 */     this.q = a1;
/*  59 */     a.put(☃, this);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cff a(String ☃) {
/*  64 */     if (a.containsKey(☃)) {
/*  65 */       return a.get(☃);
/*     */     }
/*  67 */     int i = ☃.indexOf(':');
/*  68 */     if (i < 0) {
/*  69 */       return null;
/*     */     }
/*  71 */     wr<?> wr = fc.w.b(pc.a(☃.substring(0, i), '.'));
/*  72 */     if (wr == null) {
/*  73 */       return null;
/*     */     }
/*  75 */     return a(wr, pc.a(☃.substring(i + 1), '.'));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static <T> cff a(wr<T> ☃, pc pc1) {
/*  81 */     fc<T> fc = ☃.a();
/*  82 */     if (fc.c(pc1)) {
/*  83 */       return ☃.b(fc.b(pc1));
/*     */     }
/*  85 */     return null;
/*     */   }
/*     */   
/*     */   public String c() {
/*  89 */     return this.o;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  93 */     return this.p;
/*     */   }
/*     */   
/*     */   public a e() {
/*  97 */     return this.q;
/*     */   }
/*     */   
/*     */   public enum a {
/* 101 */     a("integer"),
/* 102 */     b("hearts");
/*     */     
/*     */     private final String c;
/*     */     private static final Map<String, a> d;
/*     */     
/*     */     a(String ☃) {
/* 108 */       this.c = ☃;
/*     */     }
/*     */     
/*     */     public String a() {
/* 112 */       return this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     static {
/* 118 */       ImmutableMap.Builder<String, a> ☃ = ImmutableMap.builder();
/* 119 */       for (a a1 : values()) {
/* 120 */         ☃.put(a1.c, a1);
/*     */       }
/* 122 */       d = (Map<String, a>)☃.build();
/*     */     }
/*     */     
/*     */     public static a a(String ☃) {
/* 126 */       return d.getOrDefault(☃, a);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */