/*     */ import com.google.common.collect.Lists;
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
/*     */ public abstract class awe
/*     */ {
/*     */   private final aew[] a;
/*     */   private final a d;
/*     */   @Nullable
/*     */   public awf b;
/*     */   @Nullable
/*     */   protected String c;
/*     */   
/*     */   public enum a
/*     */   {
/*  34 */     a(10),
/*  35 */     b(5),
/*  36 */     c(2),
/*  37 */     d(1);
/*     */     
/*     */     private final int e;
/*     */     
/*     */     a(int ☃) {
/*  42 */       this.e = ☃;
/*     */     }
/*     */     
/*     */     public int a() {
/*  46 */       return this.e;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected awe(a ☃, awf awf1, aew[] arrayOfAew) {
/*  58 */     this.d = ☃;
/*  59 */     this.b = awf1;
/*  60 */     this.a = arrayOfAew;
/*     */   }
/*     */   
/*     */   public List<ate> a(afa ☃) {
/*  64 */     List<ate> list = Lists.newArrayList();
/*  65 */     for (aew aew1 : this.a) {
/*  66 */       ate ate = ☃.b(aew1);
/*  67 */       if (!ate.a()) {
/*  68 */         list.add(ate);
/*     */       }
/*     */     } 
/*  71 */     return list;
/*     */   }
/*     */   
/*     */   public a d() {
/*  75 */     return this.d;
/*     */   }
/*     */   
/*     */   public int e() {
/*  79 */     return 1;
/*     */   }
/*     */   
/*     */   public int a() {
/*  83 */     return 1;
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/*  87 */     return 1 + ☃ * 10;
/*     */   }
/*     */   
/*     */   public int b(int ☃) {
/*  91 */     return a(☃) + 5;
/*     */   }
/*     */   
/*     */   public int a(int ☃, aea aea1) {
/*  95 */     return 0;
/*     */   }
/*     */   
/*     */   public float a(int ☃, afd afd1) {
/*  99 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public final boolean b(awe ☃) {
/* 103 */     return (a(☃) && ☃.a(this));
/*     */   }
/*     */   
/*     */   protected boolean a(awe ☃) {
/* 107 */     return (this != ☃);
/*     */   }
/*     */   
/*     */   protected String f() {
/* 111 */     if (this.c == null) {
/* 112 */       this.c = k.a("enchantment", fc.q.b(this));
/*     */     }
/* 114 */     return this.c;
/*     */   }
/*     */   
/*     */   public String g() {
/* 118 */     return f();
/*     */   }
/*     */   
/*     */   public ij d(int ☃) {
/* 122 */     ij ij = new ir(g(), new Object[0]);
/* 123 */     if (c()) {
/* 124 */       ij.a(a.m);
/*     */     } else {
/* 126 */       ij.a(a.h);
/*     */     } 
/* 128 */     if (☃ != 1 || a() != 1) {
/* 129 */       ij.a(" ").a(new ir("enchantment.level." + ☃, new Object[0]));
/*     */     }
/* 131 */     return ij;
/*     */   }
/*     */   
/*     */   public boolean a(ate ☃) {
/* 135 */     return this.b.a(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(afa ☃, aer aer1, int i) {}
/*     */ 
/*     */   
/*     */   public void b(afa ☃, aer aer1, int i) {}
/*     */   
/*     */   public boolean b() {
/* 145 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 149 */     return false;
/*     */   }
/*     */   
/*     */   public static void h() {
/* 153 */     aew[] ☃ = { aew.f, aew.e, aew.d, aew.c };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     a("protection", new awq(a.a, awq.a.a, ☃));
/* 162 */     a("fire_protection", new awq(a.b, awq.a.b, ☃));
/* 163 */     a("feather_falling", new awq(a.b, awq.a.c, ☃));
/* 164 */     a("blast_protection", new awq(a.c, awq.a.d, ☃));
/* 165 */     a("projectile_protection", new awq(a.b, awq.a.e, ☃));
/* 166 */     a("respiration", new awp(a.c, ☃));
/* 167 */     a("aqua_affinity", new axa(a.c, ☃));
/* 168 */     a("thorns", new aws(a.d, ☃));
/* 169 */     a("depth_strider", new awz(a.c, ☃));
/* 170 */     a("frost_walker", new awl(a.c, new aew[] { aew.c }));
/* 171 */     a("binding_curse", new awa(a.d, ☃));
/*     */ 
/*     */     
/* 174 */     a("sharpness", new awb(a.a, 0, new aew[] { aew.a }));
/* 175 */     a("smite", new awb(a.b, 1, new aew[] { aew.a }));
/* 176 */     a("bane_of_arthropods", new awb(a.b, 2, new aew[] { aew.a }));
/* 177 */     a("knockback", new awm(a.b, new aew[] { aew.a }));
/* 178 */     a("fire_aspect", new awj(a.c, new aew[] { aew.a }));
/* 179 */     a("looting", new awn(a.c, awf.g, new aew[] { aew.a }));
/* 180 */     a("sweeping", new awr(a.c, new aew[] { aew.a }));
/*     */ 
/*     */     
/* 183 */     a("efficiency", new awd(a.a, new aew[] { aew.a }));
/* 184 */     a("silk_touch", new awx(a.d, new aew[] { aew.a }));
/* 185 */     a("unbreaking", new awc(a.b, new aew[] { aew.a }));
/* 186 */     a("fortune", new awn(a.c, awf.h, new aew[] { aew.a }));
/*     */ 
/*     */     
/* 189 */     a("power", new avw(a.a, new aew[] { aew.a }));
/* 190 */     a("punch", new avz(a.c, new aew[] { aew.a }));
/* 191 */     a("flame", new avx(a.c, new aew[] { aew.a }));
/* 192 */     a("infinity", new avy(a.d, new aew[] { aew.a }));
/*     */ 
/*     */     
/* 195 */     a("luck_of_the_sea", new awn(a.c, awf.i, new aew[] { aew.a }));
/* 196 */     a("lure", new awk(a.c, awf.i, new aew[] { aew.a }));
/*     */ 
/*     */     
/* 199 */     a("loyalty", new awv(a.b, new aew[] { aew.a }));
/* 200 */     a("impaling", new awu(a.c, new aew[] { aew.a }));
/* 201 */     a("riptide", new aww(a.c, new aew[] { aew.a }));
/* 202 */     a("channeling", new awt(a.d, new aew[] { aew.a }));
/*     */ 
/*     */     
/* 205 */     a("mending", new awo(a.c, aew.values()));
/* 206 */     a("vanishing_curse", new awy(a.d, aew.values()));
/*     */   }
/*     */   
/*     */   private static void a(String ☃, awe awe1) {
/* 210 */     fc.q.a(new pc(☃), awe1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\awe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */