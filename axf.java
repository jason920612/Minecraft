/*     */ import java.util.ArrayList;
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
/*     */ public class axf
/*     */   extends ArrayList<axe>
/*     */ {
/*     */   public axf() {}
/*     */   
/*     */   public axf(gy ☃) {
/*  19 */     a(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public axe a(ate ☃, ate ate1, int i) {
/*  24 */     if (i > 0 && i < size()) {
/*     */       
/*  26 */       axe axe = get(i);
/*  27 */       if (a(☃, axe.a()) && ((ate1.a() && !axe.c()) || (axe.c() && a(ate1, axe.b()))) && 
/*  28 */         ☃.C() >= axe.a().C() && (!axe.c() || ate1.C() >= axe.b().C())) {
/*  29 */         return axe;
/*     */       }
/*     */       
/*  32 */       return null;
/*     */     } 
/*  34 */     for (int j = 0; j < size(); j++) {
/*  35 */       axe axe = get(j);
/*  36 */       if (a(☃, axe.a()) && ☃.C() >= axe.a().C() && ((!axe.c() && ate1.a()) || (axe.c() && a(ate1, axe.b()) && ate1.C() >= axe.b().C()))) {
/*  37 */         return axe;
/*     */       }
/*     */     } 
/*  40 */     return null;
/*     */   }
/*     */   
/*     */   private boolean a(ate ☃, ate ate1) {
/*  44 */     ate ate2 = ☃.i();
/*  45 */     if (ate2.b().k()) {
/*  46 */       ate2.b(ate2.g());
/*     */     }
/*  48 */     return (ate.c(ate2, ate1) && (!ate1.m() || (ate2.m() && hk.a(ate1.n(), ate2.n(), false))));
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
/*     */   public void a(hy ☃) {
/*  78 */     ☃.writeByte((byte)(size() & 0xFF));
/*  79 */     for (int i = 0; i < size(); i++) {
/*  80 */       axe axe = get(i);
/*  81 */       ☃.a(axe.a());
/*  82 */       ☃.a(axe.d());
/*     */       
/*  84 */       ate ate = axe.b();
/*  85 */       ☃.writeBoolean(!ate.a());
/*  86 */       if (!ate.a()) {
/*  87 */         ☃.a(ate);
/*     */       }
/*  89 */       ☃.writeBoolean(axe.h());
/*  90 */       ☃.writeInt(axe.e());
/*  91 */       ☃.writeInt(axe.f());
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
/*     */   public void a(gy ☃) {
/* 121 */     he he = ☃.d("Recipes", 10);
/*     */     
/* 123 */     for (int i = 0; i < he.size(); i++) {
/* 124 */       gy gy1 = he.e(i);
/* 125 */       add(new axe(gy1));
/*     */     } 
/*     */   }
/*     */   
/*     */   public gy a() {
/* 130 */     gy ☃ = new gy();
/*     */     
/* 132 */     he he = new he();
/* 133 */     for (int i = 0; i < size(); i++) {
/* 134 */       axe axe = get(i);
/* 135 */       he.a(axe.k());
/*     */     } 
/* 137 */     ☃.a("Recipes", he);
/* 138 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\axf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */