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
/*     */ public class ajh
/*     */ {
/*     */   private final axy a;
/*     */   private boolean b;
/*  20 */   private int c = -1;
/*     */   
/*     */   private int d;
/*     */   
/*     */   private int e;
/*     */   
/*     */   private ajg f;
/*     */   
/*     */   private int g;
/*     */   
/*     */   private int h;
/*     */   private int i;
/*     */   
/*     */   public ajh(axy ☃) {
/*  34 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/*  44 */     if (this.a.L()) {
/*  45 */       this.c = 0;
/*     */       
/*     */       return;
/*     */     } 
/*  49 */     if (this.c == 2) {
/*     */       return;
/*     */     }
/*     */     
/*  53 */     if (this.c == 0) {
/*  54 */       float ☃ = this.a.k(0.0F);
/*  55 */       if (☃ < 0.5D || ☃ > 0.501D) {
/*     */         return;
/*     */       }
/*  58 */       this.c = (this.a.s.nextInt(10) == 0) ? 1 : 2;
/*  59 */       this.b = false;
/*  60 */       if (this.c == 2) {
/*     */         return;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  66 */     if (this.c == -1) {
/*     */       return;
/*     */     }
/*     */     
/*  70 */     if (!this.b) {
/*  71 */       if (b()) {
/*  72 */         this.b = true;
/*     */       } else {
/*     */         return;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*  79 */     if (this.e > 0) {
/*  80 */       this.e--;
/*     */       
/*     */       return;
/*     */     } 
/*  84 */     this.e = 2;
/*  85 */     if (this.d > 0) {
/*  86 */       c();
/*  87 */       this.d--;
/*     */     } else {
/*  89 */       this.c = 2;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean b() {
/*  94 */     List<aog> ☃ = this.a.j;
/*  95 */     for (aog aog : ☃) {
/*  96 */       if (!aog.t()) {
/*  97 */         this.f = this.a.af().a(new el(aog), 1);
/*  98 */         if (this.f == null) {
/*     */           continue;
/*     */         }
/* 101 */         if (this.f.c() < 10) {
/*     */           continue;
/*     */         }
/* 104 */         if (this.f.d() < 20) {
/*     */           continue;
/*     */         }
/* 107 */         if (this.f.e() < 20) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */         
/* 112 */         el el = this.f.a();
/* 113 */         float f = this.f.b();
/*     */         
/* 115 */         boolean bool = false;
/* 116 */         for (int i = 0; i < 10; i++) {
/* 117 */           float f1 = this.a.s.nextFloat() * 6.2831855F;
/* 118 */           this.g = el.o() + (int)((xq.b(f1) * f) * 0.9D);
/* 119 */           this.h = el.p();
/* 120 */           this.i = el.q() + (int)((xq.a(f1) * f) * 0.9D);
/* 121 */           bool = false;
/* 122 */           for (ajg ajg1 : this.a.af().b()) {
/* 123 */             if (ajg1 == this.f) {
/*     */               continue;
/*     */             }
/* 126 */             if (ajg1.a(new el(this.g, this.h, this.i))) {
/* 127 */               bool = true;
/*     */               break;
/*     */             } 
/*     */           } 
/* 131 */           if (!bool) {
/*     */             break;
/*     */           }
/*     */         } 
/* 135 */         if (bool) {
/* 136 */           return false;
/*     */         }
/*     */         
/* 139 */         cee cee = a(new el(this.g, this.h, this.i));
/* 140 */         if (cee == null) {
/*     */           continue;
/*     */         }
/*     */         
/* 144 */         this.e = 0;
/* 145 */         this.d = 20;
/* 146 */         return true;
/*     */       } 
/*     */     } 
/* 149 */     return false;
/*     */   }
/*     */   private boolean c() {
/*     */     anw anw;
/* 153 */     cee ☃ = a(new el(this.g, this.h, this.i));
/* 154 */     if (☃ == null) {
/* 155 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 159 */       anw = new anw(this.a);
/* 160 */       anw.a(this.a.h(new el(anw)), (afj)null, (gy)null);
/* 161 */     } catch (Exception exception) {
/* 162 */       exception.printStackTrace();
/* 163 */       return false;
/*     */     } 
/* 165 */     anw.b(☃.b, ☃.c, ☃.d, this.a.s.nextFloat() * 360.0F, 0.0F);
/* 166 */     this.a.a(anw);
/* 167 */     el el = this.f.a();
/* 168 */     anw.a(el, this.f.b());
/* 169 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cee a(el ☃) {
/* 174 */     for (int i = 0; i < 10; i++) {
/* 175 */       el el1 = ☃.a(this.a.s.nextInt(16) - 8, this.a.s.nextInt(6) - 3, this.a.s.nextInt(16) - 8);
/*     */       
/* 177 */       if (this.f.a(el1))
/*     */       {
/*     */         
/* 180 */         if (ayj.a(afk.b.a, this.a, el1, (aev<? extends afb>)null))
/* 181 */           return new cee(el1.o(), el1.p(), el1.q()); 
/*     */       }
/*     */     } 
/* 184 */     return null;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ajh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */