/*     */ import com.google.common.collect.Iterables;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.authlib.properties.Property;
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
/*     */ public class bkd
/*     */   extends bji
/*     */   implements pt
/*     */ {
/*     */   private GameProfile a;
/*     */   private int e;
/*     */   private boolean f;
/*     */   private boolean g = true;
/*     */   private static vl h;
/*     */   private static MinecraftSessionService i;
/*     */   
/*     */   public bkd() {
/*  31 */     super(bjj.o);
/*     */   }
/*     */   
/*     */   public static void a(vl ☃) {
/*  35 */     h = ☃;
/*     */   }
/*     */   
/*     */   public static void a(MinecraftSessionService ☃) {
/*  39 */     i = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  44 */     super.a(☃);
/*     */     
/*  46 */     if (this.a != null) {
/*  47 */       gy gy1 = new gy();
/*  48 */       hk.a(gy1, this.a);
/*  49 */       ☃.a("Owner", gy1);
/*     */     } 
/*     */     
/*  52 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  57 */     super.b(☃);
/*     */     
/*  59 */     if (☃.c("Owner", 10)) {
/*  60 */       a(hk.a(☃.p("Owner")));
/*  61 */     } else if (☃.c("ExtraType", 8)) {
/*  62 */       String str = ☃.l("ExtraType");
/*  63 */       if (!xw.b(str)) {
/*  64 */         a(new GameProfile(null, str));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/*  71 */     bcs ☃ = w().c();
/*  72 */     if (☃ == bct.fm || ☃ == bct.fl) {
/*  73 */       if (this.c_.t(this.d_)) {
/*  74 */         this.f = true;
/*  75 */         this.e++;
/*     */       } else {
/*  77 */         this.f = false;
/*     */       } 
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
/*     */   @Nullable
/*     */   public GameProfile c() {
/*  91 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ji Z_() {
/*  97 */     return new ji(this.d_, 4, aa_());
/*     */   }
/*     */ 
/*     */   
/*     */   public gy aa_() {
/* 102 */     return a(new gy());
/*     */   }
/*     */   
/*     */   public void a(@Nullable GameProfile ☃) {
/* 106 */     this.a = ☃;
/* 107 */     f();
/*     */   }
/*     */   
/*     */   private void f() {
/* 111 */     this.a = b(this.a);
/* 112 */     g();
/*     */   }
/*     */   
/*     */   public static GameProfile b(GameProfile ☃) {
/* 116 */     if (☃ == null || xw.b(☃.getName()))
/* 117 */       return ☃; 
/* 118 */     if (☃.isComplete() && ☃.getProperties().containsKey("textures")) {
/* 119 */       return ☃;
/*     */     }
/*     */     
/* 122 */     if (h == null || i == null) {
/* 123 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/* 127 */     GameProfile gameProfile = h.a(☃.getName());
/* 128 */     if (gameProfile == null) {
/* 129 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/* 133 */     Property property = (Property)Iterables.getFirst(gameProfile.getProperties().get("textures"), null);
/* 134 */     if (property == null) {
/* 135 */       gameProfile = i.fillProfileProperties(gameProfile, true);
/*     */     }
/* 137 */     return gameProfile;
/*     */   }
/*     */   
/*     */   public static void a(axk ☃, el el1) {
/* 141 */     bji bji1 = ☃.f(el1);
/* 142 */     if (bji1 instanceof bkd) {
/* 143 */       bkd bkd1 = (bkd)bji1;
/* 144 */       bkd1.g = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 149 */     return this.g;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bkd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */