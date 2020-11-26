/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aom
/*     */   extends aok
/*     */ {
/*  30 */   private static final or<Integer> g = ou.a((Class)aom.class, ot.b);
/*     */ 
/*     */ 
/*     */   
/*  34 */   private aut h = auw.a;
/*  35 */   private final Set<aek> aw = Sets.newHashSet();
/*     */   private boolean ax;
/*     */   
/*     */   public aom(axy ☃) {
/*  39 */     super(aev.c, ☃);
/*     */   }
/*     */   
/*     */   public aom(axy ☃, double d1, double d2, double d3) {
/*  43 */     super(aev.c, d1, d2, d3, ☃);
/*     */   }
/*     */   
/*     */   public aom(axy ☃, afa afa1) {
/*  47 */     super(aev.c, afa1, ☃);
/*     */   }
/*     */   
/*     */   public void b(ate ☃) {
/*  51 */     if (☃.b() == atf.j) {
/*  52 */       this.h = auv.d(☃);
/*  53 */       Collection<aek> collection = auv.b(☃);
/*  54 */       if (!collection.isEmpty()) {
/*  55 */         for (aek aek : collection) {
/*  56 */           this.aw.add(new aek(aek));
/*     */         }
/*     */       }
/*     */       
/*  60 */       int i = c(☃);
/*  61 */       if (i == -1) {
/*  62 */         s();
/*     */       } else {
/*  64 */         c(i);
/*     */       } 
/*  66 */     } else if (☃.b() == atf.h) {
/*  67 */       this.h = auw.a;
/*  68 */       this.aw.clear();
/*  69 */       this.ab.b(g, Integer.valueOf(-1));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int c(ate ☃) {
/*  74 */     gy gy = ☃.n();
/*  75 */     if (gy != null && gy.c("CustomPotionColor", 99)) {
/*  76 */       return gy.h("CustomPotionColor");
/*     */     }
/*  78 */     return -1;
/*     */   }
/*     */   
/*     */   private void s() {
/*  82 */     this.ax = false;
/*  83 */     this.ab.b(g, Integer.valueOf(auv.a(auv.a(this.h, this.aw))));
/*     */   }
/*     */   
/*     */   public void a(aek ☃) {
/*  87 */     this.aw.add(☃);
/*  88 */     T().b(g, Integer.valueOf(auv.a(auv.a(this.h, this.aw))));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void x_() {
/*  93 */     super.x_();
/*  94 */     this.ab.a(g, Integer.valueOf(-1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void R_() {
/*  99 */     super.R_();
/*     */     
/* 101 */     if (this.m.B) {
/* 102 */       if (this.b) {
/* 103 */         if (this.c % 5 == 0) {
/* 104 */           b(1);
/*     */         }
/*     */       } else {
/* 107 */         b(2);
/*     */       }
/*     */     
/* 110 */     } else if (this.b && this.c != 0 && 
/* 111 */       !this.aw.isEmpty() && this.c >= 600) {
/* 112 */       this.m.a(this, (byte)0);
/* 113 */       this.h = auw.a;
/* 114 */       this.aw.clear();
/* 115 */       this.ab.b(g, Integer.valueOf(-1));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(int ☃) {
/* 122 */     int i = r();
/* 123 */     if (i == -1 || ☃ <= 0) {
/*     */       return;
/*     */     }
/*     */     
/* 127 */     double d1 = (i >> 16 & 0xFF) / 255.0D;
/* 128 */     double d2 = (i >> 8 & 0xFF) / 255.0D;
/* 129 */     double d3 = (i >> 0 & 0xFF) / 255.0D;
/*     */     
/* 131 */     for (int j = 0; j < ☃; j++) {
/* 132 */       this.m.a(fm.s, this.q + (this.T.nextDouble() - 0.5D) * this.H, this.r + this.T.nextDouble() * this.I, this.s + (this.T.nextDouble() - 0.5D) * this.H, d1, d2, d3);
/*     */     }
/*     */   }
/*     */   
/*     */   public int r() {
/* 137 */     return ((Integer)this.ab.<Integer>a(g)).intValue();
/*     */   }
/*     */   
/*     */   private void c(int ☃) {
/* 141 */     this.ax = true;
/* 142 */     this.ab.b(g, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 147 */     super.b(☃);
/*     */     
/* 149 */     if (this.h != auw.a && this.h != null) {
/* 150 */       ☃.a("Potion", fc.j.b(this.h).toString());
/*     */     }
/* 152 */     if (this.ax) {
/* 153 */       ☃.b("Color", r());
/*     */     }
/* 155 */     if (!this.aw.isEmpty()) {
/* 156 */       he he = new he();
/* 157 */       for (aek aek : this.aw) {
/* 158 */         he.a(aek.a(new gy()));
/*     */       }
/* 160 */       ☃.a("CustomPotionEffects", he);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gy ☃) {
/* 166 */     super.a(☃);
/*     */     
/* 168 */     if (☃.c("Potion", 8)) {
/* 169 */       this.h = auv.c(☃);
/*     */     }
/* 171 */     for (aek aek : auv.b(☃)) {
/* 172 */       a(aek);
/*     */     }
/*     */     
/* 175 */     if (☃.c("Color", 99)) {
/* 176 */       c(☃.h("Color"));
/*     */     } else {
/* 178 */       s();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(afa ☃) {
/* 184 */     super.a(☃);
/*     */     
/* 186 */     for (aek aek : this.h.a()) {
/* 187 */       ☃.c(new aek(aek.a(), Math.max(aek.b() / 8, 1), aek.c(), aek.d(), aek.e()));
/*     */     }
/* 189 */     if (!this.aw.isEmpty()) {
/* 190 */       for (aek aek : this.aw) {
/* 191 */         ☃.c(aek);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected ate l() {
/* 198 */     if (this.aw.isEmpty() && this.h == auw.a) {
/* 199 */       return new ate(atf.h);
/*     */     }
/* 201 */     ate ☃ = new ate(atf.j);
/* 202 */     auv.a(☃, this.h);
/* 203 */     auv.a(☃, this.aw);
/* 204 */     if (this.ax) {
/* 205 */       ☃.o().b("CustomPotionColor", r());
/*     */     }
/* 207 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */