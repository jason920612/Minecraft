/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class arj
/*     */   extends ata
/*     */ {
/*     */   @Deprecated
/*     */   private final bcs a;
/*     */   
/*     */   public arj(bcs ☃, ata.a a1) {
/*  30 */     super(a1);
/*  31 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public adm a(aup ☃) {
/*  36 */     return a(new ark(☃));
/*     */   }
/*     */   
/*     */   public adm a(ark ☃) {
/*  40 */     if (!☃.b()) {
/*  41 */       return adm.c;
/*     */     }
/*     */     
/*  44 */     blc blc1 = b(☃);
/*  45 */     if (blc1 == null) {
/*  46 */       return adm.c;
/*     */     }
/*     */     
/*  49 */     if (!a(☃, blc1)) {
/*  50 */       return adm.c;
/*     */     }
/*     */     
/*  53 */     el el = ☃.a();
/*  54 */     axy axy = ☃.k();
/*  55 */     aog aog = ☃.j();
/*  56 */     ate ate = ☃.i();
/*     */ 
/*     */     
/*  59 */     blc blc2 = axy.a_(el);
/*  60 */     bcs bcs1 = blc2.c();
/*  61 */     if (bcs1 == blc1.c()) {
/*  62 */       a(el, axy, aog, ate, blc2);
/*  63 */       bcs1.a(axy, el, blc2, aog, ate);
/*  64 */       if (aog instanceof tf) {
/*  65 */         p.y.a((tf)aog, el, ate);
/*     */       }
/*     */     } 
/*  68 */     bhr bhr = bcs1.r();
/*  69 */     axy.a(aog, el, bhr.e(), wk.e, (bhr.a() + 1.0F) / 2.0F, bhr.b() * 0.8F);
/*  70 */     ate.g(1);
/*     */     
/*  72 */     return adm.a;
/*     */   }
/*     */   
/*     */   protected boolean a(el ☃, axy axy1, @Nullable aog aog1, ate ate1, blc blc1) {
/*  76 */     return a(axy1, aog1, ☃, ate1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected blc b(ark ☃) {
/*  81 */     blc blc = d().a(☃);
/*  82 */     return (blc != null && b(☃, blc)) ? blc : null;
/*     */   }
/*     */   
/*     */   protected boolean b(ark ☃, blc blc1) {
/*  86 */     return (blc1.a(☃.k(), ☃.a()) && ☃.k().a(blc1, ☃.a()));
/*     */   }
/*     */   
/*     */   protected boolean a(ark ☃, blc blc1) {
/*  90 */     return ☃.k().a(☃.a(), blc1, 11);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(axy ☃, @Nullable aog aog1, el el1, ate ate1) {
/*  95 */     MinecraftServer minecraftServer = ☃.z();
/*  96 */     if (minecraftServer == null) {
/*  97 */       return false;
/*     */     }
/*     */     
/* 100 */     gy gy = ate1.b("BlockEntityTag");
/* 101 */     if (gy != null) {
/* 102 */       bji bji = ☃.f(el1);
/*     */       
/* 104 */       if (bji != null) {
/* 105 */         if (!☃.B && bji.B() && (aog1 == null || !aog1.dK())) {
/* 106 */           return false;
/*     */         }
/* 108 */         gy gy1 = bji.a(new gy());
/* 109 */         gy gy2 = gy1.f();
/*     */         
/* 111 */         gy1.a(gy);
/* 112 */         gy1.b("x", el1.o());
/* 113 */         gy1.b("y", el1.p());
/* 114 */         gy1.b("z", el1.q());
/*     */         
/* 116 */         if (!gy1.equals(gy2)) {
/* 117 */           bji.b(gy1);
/* 118 */           bji.g();
/* 119 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 123 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 128 */     return d().m();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ary ☃, ez<ate> ez1) {
/* 133 */     if (a(☃)) {
/* 134 */       d().a(☃, ez1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bcs d() {
/* 145 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(Map<bcs, ata> ☃, ata ata1) {
/* 149 */     ☃.put(d(), ata1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\arj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */