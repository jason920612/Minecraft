/*     */ import java.util.Collection;
/*     */ import java.util.UUID;
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
/*     */ public class ank
/*     */ {
/*  19 */   private static final Logger k = LogManager.getLogger();
/*  20 */   public static final afm a = (new aft(null, "generic.maxHealth", 20.0D, 0.0D, 1024.0D)).a("Max Health").a(true);
/*  21 */   public static final afm b = (new aft(null, "generic.followRange", 32.0D, 0.0D, 2048.0D)).a("Follow Range");
/*  22 */   public static final afm c = (new aft(null, "generic.knockbackResistance", 0.0D, 0.0D, 1.0D)).a("Knockback Resistance");
/*  23 */   public static final afm d = (new aft(null, "generic.movementSpeed", 0.699999988079071D, 0.0D, 1024.0D)).a("Movement Speed").a(true);
/*  24 */   public static final afm e = (new aft(null, "generic.flyingSpeed", 0.4000000059604645D, 0.0D, 1024.0D)).a("Flying Speed").a(true);
/*  25 */   public static final afm f = new aft(null, "generic.attackDamage", 2.0D, 0.0D, 2048.0D);
/*  26 */   public static final afm g = (new aft(null, "generic.attackSpeed", 4.0D, 0.0D, 1024.0D)).a(true);
/*  27 */   public static final afm h = (new aft(null, "generic.armor", 0.0D, 0.0D, 30.0D)).a(true);
/*  28 */   public static final afm i = (new aft(null, "generic.armorToughness", 0.0D, 0.0D, 20.0D)).a(true);
/*  29 */   public static final afm j = (new aft(null, "generic.luck", 0.0D, -1024.0D, 1024.0D)).a(true);
/*     */   
/*     */   public static he a(afq ☃) {
/*  32 */     he he = new he();
/*     */     
/*  34 */     for (afn afn : ☃.a()) {
/*  35 */       he.a(a(afn));
/*     */     }
/*     */     
/*  38 */     return he;
/*     */   }
/*     */   
/*     */   private static gy a(afn ☃) {
/*  42 */     gy gy = new gy();
/*  43 */     afm afm1 = ☃.a();
/*     */     
/*  45 */     gy.a("Name", afm1.a());
/*  46 */     gy.a("Base", ☃.b());
/*     */     
/*  48 */     Collection<afo> collection = ☃.c();
/*     */     
/*  50 */     if (collection != null && !collection.isEmpty()) {
/*  51 */       he he = new he();
/*     */       
/*  53 */       for (afo afo : collection) {
/*  54 */         if (afo.e()) {
/*  55 */           he.a(a(afo));
/*     */         }
/*     */       } 
/*     */       
/*  59 */       gy.a("Modifiers", he);
/*     */     } 
/*     */     
/*  62 */     return gy;
/*     */   }
/*     */   
/*     */   public static gy a(afo ☃) {
/*  66 */     gy gy = new gy();
/*     */     
/*  68 */     gy.a("Name", ☃.b());
/*  69 */     gy.a("Amount", ☃.d());
/*  70 */     gy.b("Operation", ☃.c());
/*  71 */     gy.a("UUID", ☃.a());
/*     */     
/*  73 */     return gy;
/*     */   }
/*     */   
/*     */   public static void a(afq ☃, he he1) {
/*  77 */     for (int i = 0; i < he1.size(); i++) {
/*  78 */       gy gy = he1.e(i);
/*  79 */       afn afn = ☃.a(gy.l("Name"));
/*     */       
/*  81 */       if (afn == null) {
/*  82 */         k.warn("Ignoring unknown attribute '{}'", gy.l("Name"));
/*     */       } else {
/*  84 */         a(afn, gy);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(afn ☃, gy gy1) {
/*  90 */     ☃.a(gy1.k("Base"));
/*     */     
/*  92 */     if (gy1.c("Modifiers", 9)) {
/*  93 */       he he = gy1.d("Modifiers", 10);
/*     */       
/*  95 */       for (int i = 0; i < he.size(); i++) {
/*  96 */         afo afo = a(he.e(i));
/*  97 */         if (afo != null) {
/*     */ 
/*     */           
/* 100 */           afo afo1 = ☃.a(afo.a());
/* 101 */           if (afo1 != null) {
/* 102 */             ☃.c(afo1);
/*     */           }
/* 104 */           ☃.b(afo);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   @Nullable
/*     */   public static afo a(gy ☃) {
/* 111 */     UUID uUID = ☃.a("UUID");
/*     */     try {
/* 113 */       return new afo(uUID, ☃.l("Name"), ☃.k("Amount"), ☃.h("Operation"));
/* 114 */     } catch (Exception exception) {
/* 115 */       k.warn("Unable to create attribute: {}", exception.getMessage());
/* 116 */       return null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ank.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */