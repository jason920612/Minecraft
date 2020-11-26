/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
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
/*     */ public abstract class afl
/*     */   extends ajq
/*     */   implements aff
/*     */ {
/*  26 */   protected static final or<Byte> bC = ou.a((Class)afl.class, ot.a);
/*  27 */   protected static final or<Optional<UUID>> bD = ou.a((Class)afl.class, ot.o);
/*     */   
/*     */   protected ahz bE;
/*     */   
/*     */   protected afl(aev<?> ☃, axy axy1) {
/*  32 */     super(☃, axy1);
/*  33 */     dz();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  38 */     super.x_();
/*  39 */     this.ab.a(bC, Byte.valueOf((byte)0));
/*  40 */     this.ab.a(bD, Optional.empty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  45 */     super.b(☃);
/*  46 */     if (C_() == null) {
/*  47 */       ☃.a("OwnerUUID", "");
/*     */     } else {
/*  49 */       ☃.a("OwnerUUID", C_().toString());
/*     */     } 
/*  51 */     ☃.a("Sitting", dA());
/*     */   }
/*     */   
/*     */   public void a(gy ☃) {
/*     */     String str;
/*  56 */     super.a(☃);
/*     */     
/*  58 */     if (☃.c("OwnerUUID", 8)) {
/*  59 */       str = ☃.l("OwnerUUID");
/*     */     } else {
/*  61 */       String str1 = ☃.l("Owner");
/*  62 */       str = vo.a(bK(), str1);
/*     */     } 
/*  64 */     if (!str.isEmpty()) {
/*     */       try {
/*  66 */         b(UUID.fromString(str));
/*  67 */         t(true);
/*  68 */       } catch (Throwable throwable) {
/*  69 */         t(false);
/*     */       } 
/*     */     }
/*  72 */     if (this.bE != null) {
/*  73 */       this.bE.a(☃.q("Sitting"));
/*     */     }
/*  75 */     u(☃.q("Sitting"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/*  80 */     return !dm();
/*     */   }
/*     */   
/*     */   protected void s(boolean ☃) {
/*  84 */     fk fk = fm.A;
/*  85 */     if (!☃) {
/*  86 */       fk = fm.M;
/*     */     }
/*  88 */     for (int i = 0; i < 7; i++) {
/*  89 */       double d1 = this.T.nextGaussian() * 0.02D;
/*  90 */       double d2 = this.T.nextGaussian() * 0.02D;
/*  91 */       double d3 = this.T.nextGaussian() * 0.02D;
/*  92 */       this.m.a(fk, this.q + (this.T.nextFloat() * this.H * 2.0F) - this.H, this.r + 0.5D + (this.T.nextFloat() * this.I), this.s + (this.T.nextFloat() * this.H * 2.0F) - this.H, d1, d2, d3);
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
/*     */   public boolean dy() {
/* 108 */     return ((((Byte)this.ab.<Byte>a(bC)).byteValue() & 0x4) != 0);
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 112 */     byte b = ((Byte)this.ab.<Byte>a(bC)).byteValue();
/* 113 */     if (☃) {
/* 114 */       this.ab.b(bC, Byte.valueOf((byte)(b | 0x4)));
/*     */     } else {
/* 116 */       this.ab.b(bC, Byte.valueOf((byte)(b & 0xFFFFFFFB)));
/*     */     } 
/*     */     
/* 119 */     dz();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dz() {}
/*     */   
/*     */   public boolean dA() {
/* 126 */     return ((((Byte)this.ab.<Byte>a(bC)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void u(boolean ☃) {
/* 130 */     byte b = ((Byte)this.ab.<Byte>a(bC)).byteValue();
/* 131 */     if (☃) {
/* 132 */       this.ab.b(bC, Byte.valueOf((byte)(b | 0x1)));
/*     */     } else {
/* 134 */       this.ab.b(bC, Byte.valueOf((byte)(b & 0xFFFFFFFE)));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public UUID C_() {
/* 141 */     return ((Optional<UUID>)this.ab.<Optional<UUID>>a(bD)).orElse(null);
/*     */   }
/*     */   
/*     */   public void b(@Nullable UUID ☃) {
/* 145 */     this.ab.b(bD, Optional.ofNullable(☃));
/*     */   }
/*     */   
/*     */   public void c(aog ☃) {
/* 149 */     t(true);
/* 150 */     b(☃.bt());
/* 151 */     if (☃ instanceof tf) {
/* 152 */       p.x.a((tf)☃, this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public afa dB() {
/*     */     try {
/* 160 */       UUID ☃ = C_();
/* 161 */       if (☃ == null) {
/* 162 */         return null;
/*     */       }
/* 164 */       return this.m.b(☃);
/* 165 */     } catch (IllegalArgumentException ☃) {
/* 166 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean f(afa ☃) {
/* 171 */     return (☃ == dB());
/*     */   }
/*     */   
/*     */   public ahz dC() {
/* 175 */     return this.bE;
/*     */   }
/*     */   
/*     */   public boolean a(afa ☃, afa afa1) {
/* 179 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public cfe be() {
/* 184 */     if (dy()) {
/* 185 */       afa ☃ = dB();
/* 186 */       if (☃ != null) {
/* 187 */         return ☃.be();
/*     */       }
/*     */     } 
/* 190 */     return super.be();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(aer ☃) {
/* 195 */     if (dy()) {
/* 196 */       afa afa = dB();
/* 197 */       if (☃ == afa) {
/* 198 */         return true;
/*     */       }
/* 200 */       if (afa != null) {
/* 201 */         return afa.r(☃);
/*     */       }
/*     */     } 
/* 204 */     return super.r(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aea ☃) {
/* 209 */     if (!this.m.B && this.m.X().b("showDeathMessages") && 
/* 210 */       dB() instanceof tf) {
/* 211 */       dB().a(cu().b());
/*     */     }
/*     */     
/* 214 */     super.a(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\afl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */