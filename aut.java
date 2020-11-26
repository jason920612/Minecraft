/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aut
/*     */ {
/*     */   private final String a;
/*     */   private final ImmutableList<aek> b;
/*     */   
/*     */   public static aut a(String ☃) {
/*  16 */     return fc.j.a(pc.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aut(aek... ☃) {
/*  22 */     this(null, ☃);
/*     */   }
/*     */   
/*     */   public aut(@Nullable String ☃, aek... arrayOfAek) {
/*  26 */     this.a = ☃;
/*  27 */     this.b = ImmutableList.copyOf((Object[])arrayOfAek);
/*     */   }
/*     */   
/*     */   public String b(String ☃) {
/*  31 */     return ☃ + ((this.a == null) ? fc.j.b(this).a() : this.a);
/*     */   }
/*     */   
/*     */   public List<aek> a() {
/*  35 */     return (List<aek>)this.b;
/*     */   }
/*     */   
/*     */   public static void b() {
/*  39 */     a("empty", new aut(new aek[0]));
/*  40 */     a("water", new aut(new aek[0]));
/*  41 */     a("mundane", new aut(new aek[0]));
/*  42 */     a("thick", new aut(new aek[0]));
/*  43 */     a("awkward", new aut(new aek[0]));
/*     */     
/*  45 */     a("night_vision", new aut(new aek[] { new aek(aem.p, 3600) }));
/*  46 */     a("long_night_vision", new aut("night_vision", new aek[] { new aek(aem.p, 9600) }));
/*     */     
/*  48 */     a("invisibility", new aut(new aek[] { new aek(aem.n, 3600) }));
/*  49 */     a("long_invisibility", new aut("invisibility", new aek[] { new aek(aem.n, 9600) }));
/*     */     
/*  51 */     a("leaping", new aut(new aek[] { new aek(aem.h, 3600) }));
/*  52 */     a("long_leaping", new aut("leaping", new aek[] { new aek(aem.h, 9600) }));
/*  53 */     a("strong_leaping", new aut("leaping", new aek[] { new aek(aem.h, 1800, 1) }));
/*     */     
/*  55 */     a("fire_resistance", new aut(new aek[] { new aek(aem.l, 3600) }));
/*  56 */     a("long_fire_resistance", new aut("fire_resistance", new aek[] { new aek(aem.l, 9600) }));
/*     */     
/*  58 */     a("swiftness", new aut(new aek[] { new aek(aem.a, 3600) }));
/*  59 */     a("long_swiftness", new aut("swiftness", new aek[] { new aek(aem.a, 9600) }));
/*  60 */     a("strong_swiftness", new aut("swiftness", new aek[] { new aek(aem.a, 1800, 1) }));
/*     */     
/*  62 */     a("slowness", new aut(new aek[] { new aek(aem.b, 1800) }));
/*  63 */     a("long_slowness", new aut("slowness", new aek[] { new aek(aem.b, 4800) }));
/*  64 */     a("strong_slowness", new aut("slowness", new aek[] { new aek(aem.b, 400, 3) }));
/*     */     
/*  66 */     a("turtle_master", new aut("turtle_master", new aek[] { new aek(aem.b, 400, 3), new aek(aem.k, 400, 2) }));
/*  67 */     a("long_turtle_master", new aut("turtle_master", new aek[] { new aek(aem.b, 800, 3), new aek(aem.k, 800, 2) }));
/*  68 */     a("strong_turtle_master", new aut("turtle_master", new aek[] { new aek(aem.b, 400, 5), new aek(aem.k, 400, 3) }));
/*     */     
/*  70 */     a("water_breathing", new aut(new aek[] { new aek(aem.m, 3600) }));
/*  71 */     a("long_water_breathing", new aut("water_breathing", new aek[] { new aek(aem.m, 9600) }));
/*     */     
/*  73 */     a("healing", new aut(new aek[] { new aek(aem.f, 1) }));
/*  74 */     a("strong_healing", new aut("healing", new aek[] { new aek(aem.f, 1, 1) }));
/*     */     
/*  76 */     a("harming", new aut(new aek[] { new aek(aem.g, 1) }));
/*  77 */     a("strong_harming", new aut("harming", new aek[] { new aek(aem.g, 1, 1) }));
/*     */     
/*  79 */     a("poison", new aut(new aek[] { new aek(aem.s, 900) }));
/*  80 */     a("long_poison", new aut("poison", new aek[] { new aek(aem.s, 1800) }));
/*  81 */     a("strong_poison", new aut("poison", new aek[] { new aek(aem.s, 432, 1) }));
/*     */     
/*  83 */     a("regeneration", new aut(new aek[] { new aek(aem.j, 900) }));
/*  84 */     a("long_regeneration", new aut("regeneration", new aek[] { new aek(aem.j, 1800) }));
/*  85 */     a("strong_regeneration", new aut("regeneration", new aek[] { new aek(aem.j, 450, 1) }));
/*     */     
/*  87 */     a("strength", new aut(new aek[] { new aek(aem.e, 3600) }));
/*  88 */     a("long_strength", new aut("strength", new aek[] { new aek(aem.e, 9600) }));
/*  89 */     a("strong_strength", new aut("strength", new aek[] { new aek(aem.e, 1800, 1) }));
/*     */     
/*  91 */     a("weakness", new aut(new aek[] { new aek(aem.r, 1800) }));
/*  92 */     a("long_weakness", new aut("weakness", new aek[] { new aek(aem.r, 4800) }));
/*     */     
/*  94 */     a("luck", new aut("luck", new aek[] { new aek(aem.z, 6000) }));
/*     */     
/*  96 */     a("slow_falling", new aut(new aek[] { new aek(aem.B, 1800) }));
/*  97 */     a("long_slow_falling", new aut("slow_falling", new aek[] { new aek(aem.B, 4800) }));
/*     */   }
/*     */   
/*     */   protected static void a(String ☃, aut aut1) {
/* 101 */     fc.j.a(new pc(☃), aut1);
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 105 */     if (!this.b.isEmpty()) {
/* 106 */       for (UnmodifiableIterator<aek> unmodifiableIterator = this.b.iterator(); unmodifiableIterator.hasNext(); ) { aek ☃ = unmodifiableIterator.next();
/* 107 */         if (☃.a().a()) {
/* 108 */           return true;
/*     */         } }
/*     */     
/*     */     }
/*     */     
/* 113 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aut.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */