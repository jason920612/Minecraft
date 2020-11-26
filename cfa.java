/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
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
/*     */ public class cfa
/*     */   extends cfe
/*     */ {
/*     */   private final cfc a;
/*     */   private final String b;
/*  22 */   private final Set<String> c = Sets.newHashSet();
/*     */   private ij d;
/*  24 */   private ij e = new iq("");
/*  25 */   private ij f = new iq("");
/*     */   private boolean g = true;
/*     */   private boolean h = true;
/*  28 */   private cfe.b i = cfe.b.a;
/*  29 */   private cfe.b j = cfe.b.a;
/*  30 */   private a k = a.v;
/*  31 */   private cfe.a l = cfe.a.a;
/*     */   
/*     */   public cfa(cfc ☃, String str) {
/*  34 */     this.a = ☃;
/*  35 */     this.b = str;
/*  36 */     this.d = new iq(str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/*  45 */     return this.b;
/*     */   }
/*     */   
/*     */   public ij c() {
/*  49 */     return this.d;
/*     */   }
/*     */   
/*     */   public ij d() {
/*  53 */     ij ☃ = ik.a(this.d.h().a(☃ -> ☃.a(this.b).a(new il(il.a.a, new iq(this.b)))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     a a1 = n();
/*  59 */     if (a1 != a.v) {
/*  60 */       ☃.a(a1);
/*     */     }
/*     */     
/*  63 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(ij ☃) {
/*  67 */     if (☃ == null) {
/*  68 */       throw new IllegalArgumentException("Name cannot be null");
/*     */     }
/*  70 */     this.d = ☃;
/*  71 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public void b(@Nullable ij ☃) {
/*  75 */     this.e = (☃ == null) ? new iq("") : ☃.h();
/*  76 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public ij e() {
/*  80 */     return this.e;
/*     */   }
/*     */   
/*     */   public void c(@Nullable ij ☃) {
/*  84 */     this.f = (☃ == null) ? new iq("") : ☃.h();
/*  85 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public ij f() {
/*  89 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> g() {
/*  94 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij d(ij ☃) {
/*  99 */     ij ij1 = (new iq("")).a(this.e).a(☃).a(this.f);
/*     */     
/* 101 */     a a1 = n();
/* 102 */     if (a1 != a.v) {
/* 103 */       ij1.a(a1);
/*     */     }
/*     */     
/* 106 */     return ij1;
/*     */   }
/*     */   
/*     */   public static ij a(@Nullable cfe ☃, ij ij1) {
/* 110 */     if (☃ == null) {
/* 111 */       return ij1.h();
/*     */     }
/* 113 */     return ☃.d(ij1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 118 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 122 */     this.g = ☃;
/* 123 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 128 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 132 */     this.h = ☃;
/* 133 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public cfe.b j() {
/* 138 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public cfe.b k() {
/* 143 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(cfe.b ☃) {
/* 147 */     this.i = ☃;
/* 148 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public void b(cfe.b ☃) {
/* 152 */     this.j = ☃;
/* 153 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public cfe.a l() {
/* 158 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(cfe.a ☃) {
/* 162 */     this.l = ☃;
/* 163 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public int m() {
/* 167 */     int ☃ = 0;
/*     */     
/* 169 */     if (h()) {
/* 170 */       ☃ |= 0x1;
/*     */     }
/* 172 */     if (i()) {
/* 173 */       ☃ |= 0x2;
/*     */     }
/*     */     
/* 176 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(a ☃) {
/* 185 */     this.k = ☃;
/* 186 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public a n() {
/* 191 */     return this.k;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cfa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */