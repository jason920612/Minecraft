/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*     */ public class bkc
/*     */   extends bji
/*     */   implements bt
/*     */ {
/*  26 */   public final ij[] a = new ij[] { new iq(""), new iq(""), new iq(""), new iq("") };
/*     */ 
/*     */   
/*  29 */   public int e = -1;
/*     */   private boolean f = true;
/*     */   private aog g;
/*  32 */   private final String[] h = new String[4];
/*     */   
/*     */   public bkc() {
/*  35 */     super(bjj.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  40 */     super.a(☃);
/*  41 */     for (int i = 0; i < 4; i++) {
/*  42 */       String str = ij.a.a(this.a[i]);
/*  43 */       ☃.a("Text" + (i + 1), str);
/*     */     } 
/*     */     
/*  46 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  51 */     this.f = false;
/*  52 */     super.b(☃);
/*     */     
/*  54 */     for (int i = 0; i < 4; i++) {
/*  55 */       String str = ☃.l("Text" + (i + 1));
/*  56 */       ij ij1 = ij.a.a(str);
/*  57 */       if (this.c_ instanceof td) {
/*     */         try {
/*  59 */           this.a[i] = ik.a(a((tf)null), ij1, null);
/*  60 */         } catch (CommandSyntaxException commandSyntaxException) {
/*  61 */           this.a[i] = ij1;
/*     */         } 
/*     */       } else {
/*  64 */         this.a[i] = ij1;
/*     */       } 
/*  66 */       this.h[i] = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, ij ij1) {
/*  75 */     this.a[☃] = ij1;
/*  76 */     this.h[☃] = null;
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
/*     */   @Nullable
/*     */   public ji Z_() {
/*  90 */     return new ji(this.d_, 9, aa_());
/*     */   }
/*     */ 
/*     */   
/*     */   public gy aa_() {
/*  95 */     return a(new gy());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B() {
/* 100 */     return true;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 104 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aog ☃) {
/* 115 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public aog e() {
/* 119 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean b(aog ☃) {
/* 123 */     for (ij ij1 : this.a) {
/* 124 */       ip ip = (ij1 == null) ? null : ij1.b();
/* 125 */       if (ip != null && ip.h() != null) {
/*     */ 
/*     */ 
/*     */         
/* 129 */         ii ii = ip.h();
/* 130 */         if (ii.a() == ii.a.c)
/* 131 */           ☃.bK().aI().a(a((tf)☃), ii.b()); 
/*     */       } 
/*     */     } 
/* 134 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ij ☃) {}
/*     */ 
/*     */   
/*     */   public bu a(@Nullable tf ☃) {
/* 142 */     String str = (☃ == null) ? "Sign" : ☃.N_().getString();
/* 143 */     ij ij1 = (☃ == null) ? new iq("Sign") : ☃.O();
/* 144 */     return new bu(this, new cee(this.d_.o() + 0.5D, this.d_.p() + 0.5D, this.d_.q() + 0.5D), ced.a, (td)this.c_, 2, str, ij1, this.c_.z(), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 149 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 154 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B_() {
/* 159 */     return false;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bkc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */