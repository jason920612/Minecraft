/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.io.IOException;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class sn
/*     */   extends vp
/*     */ {
/*  11 */   private static final Logger f = LogManager.getLogger();
/*     */   
/*     */   public sn(so ☃) {
/*  14 */     super(☃);
/*     */     
/*  16 */     a(☃.a("view-distance", 10));
/*  17 */     this.e = ☃.a("max-players", 20);
/*  18 */     a(☃.a("white-list", false));
/*     */     
/*  20 */     if (!☃.H()) {
/*  21 */       h().a(true);
/*  22 */       i().a(true);
/*     */     } 
/*     */     
/*  25 */     B();
/*  26 */     z();
/*  27 */     A();
/*  28 */     y();
/*  29 */     C();
/*  30 */     E();
/*  31 */     D();
/*  32 */     if (!k().c().exists()) {
/*  33 */       F();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/*  39 */     super.a(☃);
/*  40 */     b().a("white-list", Boolean.valueOf(☃));
/*  41 */     b().c_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(GameProfile ☃) {
/*  46 */     super.a(☃);
/*  47 */     D();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(GameProfile ☃) {
/*  52 */     super.b(☃);
/*  53 */     D();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/*  70 */     E();
/*     */   }
/*     */   
/*     */   private void y() {
/*     */     try {
/*  75 */       i().f();
/*  76 */     } catch (IOException ☃) {
/*  77 */       f.warn("Failed to save ip banlist: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void z() {
/*     */     try {
/*  83 */       h().f();
/*  84 */     } catch (IOException ☃) {
/*  85 */       f.warn("Failed to save user banlist: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void A() {
/*     */     try {
/*  91 */       i().g();
/*  92 */     } catch (IOException ☃) {
/*  93 */       f.warn("Failed to load ip banlist: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void B() {
/*     */     try {
/*  99 */       h().g();
/* 100 */     } catch (IOException ☃) {
/* 101 */       f.warn("Failed to load user banlist: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void C() {
/*     */     try {
/* 107 */       m().g();
/* 108 */     } catch (Exception ☃) {
/* 109 */       f.warn("Failed to load operators list: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void D() {
/*     */     try {
/* 115 */       m().f();
/* 116 */     } catch (Exception ☃) {
/* 117 */       f.warn("Failed to save operators list: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void E() {
/*     */     try {
/* 123 */       k().g();
/* 124 */     } catch (Exception ☃) {
/* 125 */       f.warn("Failed to load white-list: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void F() {
/*     */     try {
/* 131 */       k().f();
/* 132 */     } catch (Exception ☃) {
/* 133 */       f.warn("Failed to save white-list: ", ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(GameProfile ☃) {
/* 139 */     return (!r() || h(☃) || k().a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public so b() {
/* 144 */     return (so)super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(GameProfile ☃) {
/* 149 */     return m().b(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */