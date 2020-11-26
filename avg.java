/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class avg
/*     */   extends avd
/*     */ {
/*  21 */   private static final avh a = avh.a(new axx[] { atf.dx, atf.K, atf.cl, atf.dI, atf.dJ, atf.dL, atf.dK, atf.dN, atf.dM });
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
/*  32 */   private static final avh b = avh.a(new axx[] { atf.m }); private static final Map<ata, asp.a> d;
/*  33 */   private static final avh c = avh.a(new axx[] { atf.ba });
/*     */   static {
/*  35 */     d = k.<Map<ata, asp.a>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(atf.dx, asp.a.b);
/*     */           ☃.put(atf.K, asp.a.e);
/*     */           ☃.put(atf.cl, asp.a.c);
/*     */           ☃.put(atf.dI, asp.a.d);
/*     */           ☃.put(atf.dJ, asp.a.d);
/*     */           ☃.put(atf.dL, asp.a.d);
/*     */           ☃.put(atf.dK, asp.a.d);
/*     */           ☃.put(atf.dN, asp.a.d);
/*     */           ☃.put(atf.dM, asp.a.d);
/*     */         });
/*     */   }
/*  47 */   private static final avh e = avh.a(new axx[] { atf.L });
/*     */   
/*     */   public avg(pc ☃) {
/*  50 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  55 */     if (!(☃ instanceof aqc)) {
/*  56 */       return false;
/*     */     }
/*     */     
/*  59 */     boolean bool1 = false;
/*  60 */     boolean bool2 = false;
/*  61 */     boolean bool3 = false;
/*  62 */     boolean bool4 = false;
/*  63 */     boolean bool5 = false;
/*     */     
/*  65 */     for (int i = 0; i < ☃.T_(); i++) {
/*  66 */       ate ate = ☃.a(i);
/*  67 */       if (!ate.a())
/*     */       {
/*     */ 
/*     */         
/*  71 */         if (a.a(ate)) {
/*  72 */           if (bool3) {
/*  73 */             return false;
/*     */           }
/*  75 */           bool3 = true;
/*  76 */         } else if (c.a(ate)) {
/*  77 */           if (bool5) {
/*  78 */             return false;
/*     */           }
/*  80 */           bool5 = true;
/*  81 */         } else if (b.a(ate)) {
/*  82 */           if (bool4) {
/*  83 */             return false;
/*     */           }
/*  85 */           bool4 = true;
/*  86 */         } else if (e.a(ate)) {
/*  87 */           if (bool1) {
/*  88 */             return false;
/*     */           }
/*  90 */           bool1 = true;
/*  91 */         } else if (ate.b() instanceof asd) {
/*  92 */           bool2 = true;
/*     */         } else {
/*  94 */           return false;
/*     */         } 
/*     */       }
/*     */     } 
/*  98 */     return (bool1 && bool2);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/* 103 */     ate ate = new ate(atf.dS);
/* 104 */     gy gy = ate.a("Explosion");
/*     */     
/* 106 */     asp.a a = asp.a.a;
/* 107 */     List<Integer> list = Lists.newArrayList();
/*     */     
/* 109 */     for (int i = 0; i < ☃.T_(); i++) {
/* 110 */       ate ate1 = ☃.a(i);
/* 111 */       if (!ate1.a())
/*     */       {
/*     */ 
/*     */         
/* 115 */         if (a.a(ate1)) {
/* 116 */           a = d.get(ate1.b());
/* 117 */         } else if (c.a(ate1)) {
/* 118 */           gy.a("Flicker", true);
/* 119 */         } else if (b.a(ate1)) {
/* 120 */           gy.a("Trail", true);
/* 121 */         } else if (ate1.b() instanceof asd) {
/* 122 */           list.add(Integer.valueOf(((asd)ate1.b()).d().f()));
/*     */         } 
/*     */       }
/*     */     } 
/* 126 */     gy.b("Colors", list);
/* 127 */     gy.a("Type", (byte)a.a());
/*     */     
/* 129 */     return ate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ate d() {
/* 139 */     return new ate(atf.dS);
/*     */   }
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/* 144 */     return avn.h;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */