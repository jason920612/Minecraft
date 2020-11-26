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
/*     */ public class ava
/*     */   extends avd
/*     */ {
/*     */   public ava(pc ☃) {
/*  23 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  28 */     if (!(☃ instanceof aqc)) {
/*  29 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  33 */     boolean bool = false;
/*  34 */     for (int i = 0; i < ☃.T_(); i++) {
/*  35 */       ate ate = ☃.a(i);
/*  36 */       if (ate.b() instanceof arh) {
/*     */ 
/*     */ 
/*     */         
/*  40 */         if (bool) {
/*  41 */           return false;
/*     */         }
/*  43 */         if (bje.a(ate) >= 6)
/*     */         {
/*  45 */           return false;
/*     */         }
/*     */         
/*  48 */         bool = true;
/*     */       } 
/*  50 */     }  return (bool && c(☃) != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/*  55 */     ate ate = ate.a;
/*  56 */     for (int i = 0; i < ☃.T_(); i++) {
/*  57 */       ate ate1 = ☃.a(i);
/*  58 */       if (!ate1.a())
/*     */       {
/*     */         
/*  61 */         if (ate1.b() instanceof arh) {
/*  62 */           ate = ate1.i();
/*  63 */           ate.e(1);
/*     */           
/*     */           break;
/*     */         } 
/*     */       }
/*     */     } 
/*  69 */     bjf bjf = c(☃);
/*  70 */     if (bjf != null) {
/*     */       he he;
/*  72 */       asc asc = asc.a;
/*  73 */       for (int j = 0; j < ☃.T_(); j++) {
/*  74 */         ata ata = ☃.a(j).b();
/*  75 */         if (ata instanceof asd) {
/*  76 */           asc = ((asd)ata).d();
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*  81 */       gy gy1 = ate.a("BlockEntityTag");
/*     */       
/*  83 */       if (gy1.c("Patterns", 9)) {
/*  84 */         he = gy1.d("Patterns", 10);
/*     */       } else {
/*  86 */         he = new he();
/*  87 */         gy1.a("Patterns", he);
/*     */       } 
/*  89 */       gy gy2 = new gy();
/*  90 */       gy2.a("Pattern", bjf.b());
/*  91 */       gy2.b("Color", asc.a());
/*  92 */       he.a(gy2);
/*     */     } 
/*     */     
/*  95 */     return ate;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bjf c(ade ☃) {
/* 100 */     for (bjf bjf : bjf.values()) {
/* 101 */       if (bjf.d()) {
/*     */ 
/*     */         
/* 104 */         boolean bool = true;
/* 105 */         if (bjf.e()) {
/*     */           
/* 107 */           boolean bool1 = false;
/* 108 */           boolean bool2 = false;
/* 109 */           for (int i = 0; i < ☃.T_() && bool; i++) {
/* 110 */             ate ate = ☃.a(i);
/* 111 */             if (!ate.a() && !(ate.b() instanceof arh))
/*     */             {
/*     */               
/* 114 */               if (ate.b() instanceof asd) {
/* 115 */                 if (bool2) {
/*     */                   
/* 117 */                   bool = false;
/*     */                   break;
/*     */                 } 
/* 120 */                 bool2 = true;
/* 121 */               } else if (!bool1 && ate.a(bjf.f())) {
/* 122 */                 bool1 = true;
/*     */               } else {
/* 124 */                 bool = false;
/*     */                 break;
/*     */               }  } 
/*     */           } 
/* 128 */           if (!bool1 || !bool2) {
/* 129 */             bool = false;
/*     */           }
/* 131 */         } else if (☃.T_() == (bjf.c()).length * bjf.c()[0].length()) {
/*     */           
/* 133 */           asc asc = null;
/* 134 */           for (int i = 0; i < ☃.T_() && bool; i++) {
/* 135 */             int j = i / 3;
/* 136 */             int k = i % 3;
/*     */             
/* 138 */             ate ate = ☃.a(i);
/* 139 */             ata ata = ate.b();
/* 140 */             if (ate.a() || ata instanceof arh) {
/* 141 */               if (bjf.c()[j].charAt(k) != ' ') {
/* 142 */                 bool = false;
/*     */ 
/*     */                 
/*     */                 break;
/*     */               } 
/* 147 */             } else if (ata instanceof asd) {
/* 148 */               asc asc1 = ((asd)ata).d();
/* 149 */               if (asc != null && asc != asc1) {
/* 150 */                 bool = false;
/*     */                 break;
/*     */               } 
/* 153 */               if (bjf.c()[j].charAt(k) == ' ') {
/* 154 */                 bool = false;
/*     */                 break;
/*     */               } 
/* 157 */               asc = asc1;
/*     */             } else {
/* 159 */               bool = false;
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } else {
/* 164 */           bool = false;
/*     */         } 
/* 166 */         if (bool)
/* 167 */           return bjf; 
/*     */       } 
/*     */     } 
/* 170 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/* 180 */     return avn.m;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ava.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */