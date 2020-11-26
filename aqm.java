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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aqm
/*     */   extends aqr
/*     */ {
/*  34 */   private static final String[] h = new String[] { "item/empty_armor_slot_boots", "item/empty_armor_slot_leggings", "item/empty_armor_slot_chestplate", "item/empty_armor_slot_helmet" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   private static final aew[] i = new aew[] { aew.f, aew.e, aew.d, aew.c };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   public aqc a = new aqc(this, 2, 2);
/*  49 */   public aqt f = new aqt();
/*     */   public boolean g;
/*     */   private final aog j;
/*     */   
/*     */   public aqm(aof ☃, boolean bool, aog aog1) {
/*  54 */     this.g = bool;
/*  55 */     this.j = aog1;
/*  56 */     a(new aqu(☃.e, this.a, this.f, 0, 154, 28));
/*     */     int i;
/*  58 */     for (i = 0; i < 2; i++) {
/*  59 */       for (int j = 0; j < 2; j++) {
/*  60 */         a(new aqx(this.a, j + i * 2, 98 + j * 18, 18 + i * 18));
/*     */       }
/*     */     } 
/*     */     
/*  64 */     for (i = 0; i < 4; i++) {
/*  65 */       aew aew1 = i[i];
/*  66 */       a(new aqx(this, ☃, 39 - i, 8, 8 + i * 18, aew1)
/*     */           {
/*     */             public int a() {
/*  69 */               return 1;
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean a(ate ☃) {
/*  74 */               return (this.a == afb.e(☃));
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean a(aog ☃) {
/*  79 */               ate ate = d();
/*  80 */               if (!ate.a() && !☃.u() && awg.d(ate)) {
/*  81 */                 return false;
/*     */               }
/*  83 */               return super.a(☃);
/*     */             }
/*     */           });
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     for (i = 0; i < 3; i++) {
/*  94 */       for (int j = 0; j < 9; j++) {
/*  95 */         a(new aqx(☃, j + (i + 1) * 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  98 */     for (i = 0; i < 9; i++) {
/*  99 */       a(new aqx(☃, i, 8 + i * 18, 142));
/*     */     }
/*     */     
/* 102 */     a(new aqx(this, ☃, 40, 77, 62)
/*     */         {
/*     */         
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aoi ☃) {
/* 113 */     this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 118 */     this.f.m();
/* 119 */     this.a.m();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(avk ☃) {
/* 124 */     return ☃.a(this.a, this.j.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ade ☃) {
/* 129 */     a(this.j.m, this.j, this.a, this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aog ☃) {
/* 134 */     super.b(☃);
/*     */     
/* 136 */     this.f.m();
/*     */     
/* 138 */     if (☃.m.B) {
/*     */       return;
/*     */     }
/*     */     
/* 142 */     a(☃, ☃.m, this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 147 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate b(aog ☃, int i) {
/* 152 */     ate ate = ate.a;
/* 153 */     aqx aqx = this.c.get(i);
/* 154 */     if (aqx != null && aqx.e()) {
/* 155 */       ate ate1 = aqx.d();
/* 156 */       ate = ate1.i();
/*     */       
/* 158 */       aew aew1 = afb.e(ate);
/*     */       
/* 160 */       if (i == 0) {
/* 161 */         if (!a(ate1, 9, 45, true)) {
/* 162 */           return ate.a;
/*     */         }
/* 164 */         aqx.a(ate1, ate);
/* 165 */       } else if (i >= 1 && i < 5) {
/* 166 */         if (!a(ate1, 9, 45, false)) {
/* 167 */           return ate.a;
/*     */         }
/* 169 */       } else if (i >= 5 && i < 9) {
/* 170 */         if (!a(ate1, 9, 45, false)) {
/* 171 */           return ate.a;
/*     */         }
/* 173 */       } else if (aew1.a() == aew.a.b && !((aqx)this.c.get(8 - aew1.b())).e()) {
/* 174 */         int j = 8 - aew1.b();
/* 175 */         if (!a(ate1, j, j + 1, false)) {
/* 176 */           return ate.a;
/*     */         }
/* 178 */       } else if (aew1 == aew.b && !((aqx)this.c.get(45)).e()) {
/* 179 */         if (!a(ate1, 45, 46, false)) {
/* 180 */           return ate.a;
/*     */         }
/* 182 */       } else if (i >= 9 && i < 36) {
/* 183 */         if (!a(ate1, 36, 45, false)) {
/* 184 */           return ate.a;
/*     */         }
/* 186 */       } else if (i >= 36 && i < 45) {
/* 187 */         if (!a(ate1, 9, 36, false)) {
/* 188 */           return ate.a;
/*     */         }
/*     */       }
/* 191 */       else if (!a(ate1, 9, 45, false)) {
/* 192 */         return ate.a;
/*     */       } 
/*     */       
/* 195 */       if (ate1.a()) {
/* 196 */         aqx.d(ate.a);
/*     */       } else {
/* 198 */         aqx.f();
/*     */       } 
/* 200 */       if (ate1.C() == ate.C())
/*     */       {
/* 202 */         return ate.a;
/*     */       }
/* 204 */       ate ate2 = aqx.a(☃, ate1);
/* 205 */       if (i == 0) {
/* 206 */         ☃.a(ate2, false);
/*     */       }
/*     */     } 
/*     */     
/* 210 */     return ate;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ate ☃, aqx aqx1) {
/* 215 */     return (aqx1.d != this.f && super.a(☃, aqx1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/* 220 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 225 */     return this.a.U_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 230 */     return this.a.n();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aqm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */