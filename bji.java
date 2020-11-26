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
/*     */ 
/*     */ 
/*     */ public abstract class bji
/*     */ {
/*  19 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final bjj<?> e;
/*     */   protected axy c_;
/*  23 */   protected el d_ = el.a;
/*     */   
/*     */   protected boolean d;
/*     */   @Nullable
/*     */   private blc f;
/*     */   
/*     */   public bji(bjj<?> ☃) {
/*  30 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public axy F() {
/*  35 */     return this.c_;
/*     */   }
/*     */   
/*     */   public void a(axy ☃) {
/*  39 */     this.c_ = ☃;
/*     */   }
/*     */   
/*     */   public boolean u() {
/*  43 */     return (this.c_ != null);
/*     */   }
/*     */   
/*     */   public void b(gy ☃) {
/*  47 */     this.d_ = new el(☃.h("x"), ☃.h("y"), ☃.h("z"));
/*     */   }
/*     */   
/*     */   public gy a(gy ☃) {
/*  51 */     return d(☃);
/*     */   }
/*     */   
/*     */   private gy d(gy ☃) {
/*  55 */     pc pc = bjj.a(C());
/*  56 */     if (pc == null) {
/*  57 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*     */     }
/*  59 */     ☃.a("id", pc.toString());
/*  60 */     ☃.b("x", this.d_.o());
/*  61 */     ☃.b("y", this.d_.p());
/*  62 */     ☃.b("z", this.d_.q());
/*     */     
/*  64 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static bji c(gy ☃) {
/*  69 */     bji bji1 = null;
/*  70 */     String str = ☃.l("id");
/*     */     try {
/*  72 */       bji1 = bjj.a(str);
/*  73 */     } catch (Throwable throwable) {
/*  74 */       a.error("Failed to create block entity {}", str, throwable);
/*     */     } 
/*  76 */     if (bji1 != null) {
/*     */       try {
/*  78 */         bji1.b(☃);
/*  79 */       } catch (Throwable throwable) {
/*  80 */         a.error("Failed to load data for block entity {}", str, throwable);
/*  81 */         bji1 = null;
/*     */       } 
/*     */     } else {
/*  84 */       a.warn("Skipping BlockEntity with id {}", str);
/*     */     } 
/*  86 */     return bji1;
/*     */   }
/*     */   
/*     */   public void g() {
/*  90 */     if (this.c_ != null) {
/*  91 */       this.f = this.c_.a_(this.d_);
/*  92 */       this.c_.b(this.d_, this);
/*     */       
/*  94 */       if (!this.f.f()) {
/*  95 */         this.c_.c(this.d_, this.f.c());
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public el v() {
/* 112 */     return this.d_;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public blc w() {
/* 119 */     if (this.f == null) {
/* 120 */       this.f = this.c_.a_(this.d_);
/*     */     }
/* 122 */     return this.f;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ji Z_() {
/* 127 */     return null;
/*     */   }
/*     */   
/*     */   public gy aa_() {
/* 131 */     return d(new gy());
/*     */   }
/*     */   
/*     */   public boolean x() {
/* 135 */     return this.d;
/*     */   }
/*     */   
/*     */   public void y() {
/* 139 */     this.d = true;
/*     */   }
/*     */   
/*     */   public void z() {
/* 143 */     this.d = false;
/*     */   }
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 147 */     return false;
/*     */   }
/*     */   
/*     */   public void A() {
/* 151 */     this.f = null;
/*     */   }
/*     */   
/*     */   public void a(c ☃) {
/* 155 */     ☃.a("Name", () -> fc.o.b(C()) + " // " + getClass().getCanonicalName());
/*     */     
/* 157 */     if (this.c_ == null) {
/*     */       return;
/*     */     }
/*     */     
/* 161 */     c.a(☃, this.d_, w());
/*     */     
/* 163 */     c.a(☃, this.d_, this.c_.a_(this.d_));
/*     */   }
/*     */   
/*     */   public void a(el ☃) {
/* 167 */     this.d_ = ☃.h();
/*     */   }
/*     */   
/*     */   public boolean B() {
/* 171 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bhb ☃) {}
/*     */ 
/*     */   
/*     */   public void a(bfz ☃) {}
/*     */   
/*     */   public bjj<?> C() {
/* 181 */     return this.e;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */