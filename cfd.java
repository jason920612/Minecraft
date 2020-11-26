/*     */ import java.util.Collection;
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
/*     */ public class cfd
/*     */   extends cbo
/*     */ {
/*  17 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private cfc b;
/*     */   
/*     */   private gy c;
/*     */   
/*     */   public cfd() {
/*  24 */     this("scoreboard");
/*     */   }
/*     */   
/*     */   public cfd(String ☃) {
/*  28 */     super(☃);
/*     */   }
/*     */   
/*     */   public void a(cfc ☃) {
/*  32 */     this.b = ☃;
/*     */     
/*  34 */     if (this.c != null) {
/*  35 */       a(this.c);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/*  41 */     if (this.b == null) {
/*  42 */       this.c = ☃;
/*     */       
/*     */       return;
/*     */     } 
/*  46 */     b(☃.d("Objectives", 10));
/*  47 */     this.b.a(☃.d("PlayerScores", 10));
/*     */     
/*  49 */     if (☃.c("DisplaySlots", 10)) {
/*  50 */       c(☃.p("DisplaySlots"));
/*     */     }
/*     */     
/*  53 */     if (☃.c("Teams", 9)) {
/*  54 */       a(☃.d("Teams", 10));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(he ☃) {
/*  59 */     for (int i = 0; i < ☃.size(); i++) {
/*  60 */       gy gy1 = ☃.e(i);
/*     */       
/*  62 */       String str = gy1.l("Name");
/*  63 */       if (str.length() > 16)
/*     */       {
/*  65 */         str = str.substring(0, 16);
/*     */       }
/*  67 */       cfa cfa = this.b.g(str);
/*  68 */       ij ij = ij.a.a(gy1.l("DisplayName"));
/*  69 */       if (ij != null) {
/*  70 */         cfa.a(ij);
/*     */       }
/*  72 */       if (gy1.c("TeamColor", 8)) {
/*  73 */         cfa.a(a.c(gy1.l("TeamColor")));
/*     */       }
/*  75 */       if (gy1.c("AllowFriendlyFire", 99)) {
/*  76 */         cfa.a(gy1.q("AllowFriendlyFire"));
/*     */       }
/*  78 */       if (gy1.c("SeeFriendlyInvisibles", 99)) {
/*  79 */         cfa.b(gy1.q("SeeFriendlyInvisibles"));
/*     */       }
/*  81 */       if (gy1.c("MemberNamePrefix", 8)) {
/*  82 */         ij ij1 = ij.a.a(gy1.l("MemberNamePrefix"));
/*  83 */         if (ij1 != null) {
/*  84 */           cfa.b(ij1);
/*     */         }
/*     */       } 
/*  87 */       if (gy1.c("MemberNameSuffix", 8)) {
/*  88 */         ij ij1 = ij.a.a(gy1.l("MemberNameSuffix"));
/*  89 */         if (ij1 != null) {
/*  90 */           cfa.c(ij1);
/*     */         }
/*     */       } 
/*  93 */       if (gy1.c("NameTagVisibility", 8)) {
/*  94 */         cfe.b b = cfe.b.a(gy1.l("NameTagVisibility"));
/*  95 */         if (b != null) {
/*  96 */           cfa.a(b);
/*     */         }
/*     */       } 
/*  99 */       if (gy1.c("DeathMessageVisibility", 8)) {
/* 100 */         cfe.b b = cfe.b.a(gy1.l("DeathMessageVisibility"));
/* 101 */         if (b != null) {
/* 102 */           cfa.b(b);
/*     */         }
/*     */       } 
/* 105 */       if (gy1.c("CollisionRule", 8)) {
/* 106 */         cfe.a a = cfe.a.a(gy1.l("CollisionRule"));
/* 107 */         if (a != null) {
/* 108 */           cfa.a(a);
/*     */         }
/*     */       } 
/*     */       
/* 112 */       a(cfa, gy1.d("Players", 8));
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(cfa ☃, he he1) {
/* 117 */     for (int i = 0; i < he1.size(); i++) {
/* 118 */       this.b.a(he1.m(i), ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(gy ☃) {
/* 123 */     for (int i = 0; i < 19; i++) {
/* 124 */       if (☃.c("slot_" + i, 8)) {
/* 125 */         String str = ☃.l("slot_" + i);
/* 126 */         cez cez = this.b.d(str);
/* 127 */         this.b.a(i, cez);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(he ☃) {
/* 133 */     for (int i = 0; i < ☃.size(); i++) {
/* 134 */       gy gy1 = ☃.e(i);
/*     */       
/* 136 */       cff cff = cff.a(gy1.l("CriteriaName"));
/* 137 */       if (cff != null) {
/*     */ 
/*     */         
/* 140 */         String str = gy1.l("Name");
/* 141 */         if (str.length() > 16)
/*     */         {
/* 143 */           str = str.substring(0, 16);
/*     */         }
/* 145 */         ij ij = ij.a.a(gy1.l("DisplayName"));
/* 146 */         cff.a a = cff.a.a(gy1.l("RenderType"));
/* 147 */         this.b.a(str, cff, ij, a);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public gy b(gy ☃) {
/* 153 */     if (this.b == null) {
/* 154 */       a.warn("Tried to save scoreboard without having a scoreboard...");
/* 155 */       return ☃;
/*     */     } 
/*     */     
/* 158 */     ☃.a("Objectives", b());
/* 159 */     ☃.a("PlayerScores", this.b.i());
/* 160 */     ☃.a("Teams", a());
/*     */     
/* 162 */     d(☃);
/*     */     
/* 164 */     return ☃;
/*     */   }
/*     */   
/*     */   protected he a() {
/* 168 */     he ☃ = new he();
/* 169 */     Collection<cfa> collection = this.b.g();
/*     */     
/* 171 */     for (cfa cfa : collection) {
/* 172 */       gy gy1 = new gy();
/*     */       
/* 174 */       gy1.a("Name", cfa.b());
/* 175 */       gy1.a("DisplayName", ij.a.a(cfa.c()));
/* 176 */       if (cfa.n().b() >= 0) {
/* 177 */         gy1.a("TeamColor", cfa.n().g());
/*     */       }
/* 179 */       gy1.a("AllowFriendlyFire", cfa.h());
/* 180 */       gy1.a("SeeFriendlyInvisibles", cfa.i());
/* 181 */       gy1.a("MemberNamePrefix", ij.a.a(cfa.e()));
/* 182 */       gy1.a("MemberNameSuffix", ij.a.a(cfa.f()));
/* 183 */       gy1.a("NameTagVisibility", (cfa.j()).e);
/* 184 */       gy1.a("DeathMessageVisibility", (cfa.k()).e);
/* 185 */       gy1.a("CollisionRule", (cfa.l()).e);
/*     */       
/* 187 */       he he = new he();
/*     */       
/* 189 */       for (String str : cfa.g()) {
/* 190 */         he.a(new hn(str));
/*     */       }
/*     */       
/* 193 */       gy1.a("Players", he);
/*     */       
/* 195 */       ☃.a(gy1);
/*     */     } 
/*     */     
/* 198 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void d(gy ☃) {
/* 202 */     gy gy1 = new gy();
/* 203 */     boolean bool = false;
/*     */     
/* 205 */     for (int i = 0; i < 19; i++) {
/* 206 */       cez cez = this.b.a(i);
/*     */       
/* 208 */       if (cez != null) {
/* 209 */         gy1.a("slot_" + i, cez.b());
/* 210 */         bool = true;
/*     */       } 
/*     */     } 
/*     */     
/* 214 */     if (bool) {
/* 215 */       ☃.a("DisplaySlots", gy1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected he b() {
/* 220 */     he ☃ = new he();
/* 221 */     Collection<cez> collection = this.b.c();
/*     */     
/* 223 */     for (cez cez : collection) {
/* 224 */       if (cez.c() == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 228 */       gy gy1 = new gy();
/* 229 */       gy1.a("Name", cez.b());
/* 230 */       gy1.a("CriteriaName", cez.c().c());
/* 231 */       gy1.a("DisplayName", ij.a.a(cez.d()));
/* 232 */       gy1.a("RenderType", cez.f().a());
/* 233 */       ☃.a(gy1);
/*     */     } 
/*     */     
/* 236 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cfd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */