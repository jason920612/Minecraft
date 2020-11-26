/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ public class sz
/*     */ {
/*  52 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final td b;
/*     */   
/*  56 */   private final Set<th> c = Sets.newHashSet();
/*  57 */   private final xm<th> d = new xm<>();
/*     */   private int e;
/*     */   
/*     */   public sz(td ☃) {
/*  61 */     this.b = ☃;
/*  62 */     this.e = ☃.z().ac().d();
/*     */   }
/*     */   
/*     */   public static long a(double ☃) {
/*  66 */     return xq.d(☃ * 4096.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aer ☃) {
/*  76 */     if (☃ instanceof tf) {
/*  77 */       a(☃, 512, 2);
/*  78 */       tf tf = (tf)☃;
/*  79 */       for (th th : this.c) {
/*  80 */         if (th.b() != tf) {
/*  81 */           th.b(tf);
/*     */         }
/*     */       } 
/*  84 */     } else if (☃ instanceof amg) {
/*  85 */       a(☃, 64, 5, true);
/*  86 */     } else if (☃ instanceof aok) {
/*  87 */       a(☃, 64, 20, false);
/*  88 */     } else if (☃ instanceof aow) {
/*  89 */       a(☃, 64, 10, false);
/*  90 */     } else if (☃ instanceof aol) {
/*  91 */       a(☃, 64, 10, true);
/*  92 */     } else if (☃ instanceof aox) {
/*  93 */       a(☃, 64, 10, true);
/*  94 */     } else if (☃ instanceof aos) {
/*  95 */       a(☃, 64, 10, false);
/*  96 */     } else if (☃ instanceof apb) {
/*  97 */       a(☃, 64, 10, true);
/*  98 */     } else if (☃ instanceof aop) {
/*  99 */       a(☃, 64, 4, true);
/* 100 */     } else if (☃ instanceof apa) {
/* 101 */       a(☃, 64, 10, true);
/* 102 */     } else if (☃ instanceof apd) {
/* 103 */       a(☃, 64, 10, true);
/* 104 */     } else if (☃ instanceof apc) {
/* 105 */       a(☃, 64, 10, true);
/* 106 */     } else if (☃ instanceof aoq) {
/* 107 */       a(☃, 64, 10, true);
/* 108 */     } else if (☃ instanceof amm) {
/* 109 */       a(☃, 64, 20, true);
/* 110 */     } else if (☃ instanceof aph) {
/* 111 */       a(☃, 80, 3, true);
/* 112 */     } else if (☃ instanceof apj) {
/* 113 */       a(☃, 80, 3, true);
/* 114 */     } else if (☃ instanceof aki) {
/* 115 */       a(☃, 64, 3, true);
/* 116 */     } else if (☃ instanceof alx) {
/* 117 */       a(☃, 80, 3, false);
/* 118 */     } else if (☃ instanceof aov) {
/* 119 */       a(☃, 80, 3, true);
/* 120 */     } else if (☃ instanceof ajl) {
/* 121 */       a(☃, 80, 3, false);
/* 122 */     } else if (☃ instanceof ald) {
/* 123 */       a(☃, 160, 3, true);
/* 124 */     } else if (☃ instanceof aeq) {
/* 125 */       a(☃, 80, 3, true);
/* 126 */     } else if (☃ instanceof amn) {
/* 127 */       a(☃, 160, 10, true);
/* 128 */     } else if (☃ instanceof aml) {
/* 129 */       a(☃, 160, 20, true);
/* 130 */     } else if (☃ instanceof ama) {
/* 131 */       a(☃, 160, 2147483647, false);
/* 132 */     } else if (☃ instanceof alz) {
/* 133 */       a(☃, 160, 3, true);
/* 134 */     } else if (☃ instanceof aex) {
/* 135 */       a(☃, 160, 20, true);
/* 136 */     } else if (☃ instanceof aep) {
/* 137 */       a(☃, 160, 2147483647, true);
/* 138 */     } else if (☃ instanceof alc) {
/* 139 */       a(☃, 256, 2147483647, false);
/* 140 */     } else if (☃ instanceof aoo) {
/* 141 */       a(☃, 160, 2, false);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aer ☃, int i, int j) {
/* 146 */     a(☃, i, j, false);
/*     */   }
/*     */   
/*     */   public void a(aer ☃, int i, int j, boolean bool) {
/*     */     try {
/* 151 */       if (this.d.b(☃.Q())) {
/* 152 */         throw new IllegalStateException("Entity is already tracked!");
/*     */       }
/* 154 */       th th = new th(☃, i, this.e, j, bool);
/* 155 */       this.c.add(th);
/* 156 */       this.d.a(☃.Q(), th);
/* 157 */       th.b(this.b.j);
/* 158 */     } catch (Throwable throwable) {
/* 159 */       b b = b.a(throwable, "Adding entity to track");
/* 160 */       c c = b.a("Entity To Track");
/*     */       
/* 162 */       c.a("Tracking range", i + " blocks");
/* 163 */       c.a("Update interval", () -> {
/*     */             String str = "Once per " + ☃ + " ticks";
/*     */             if (☃ == Integer.MAX_VALUE) {
/*     */               str = "Maximum (" + str + ")";
/*     */             }
/*     */             return str;
/*     */           });
/* 170 */       ☃.a(c);
/*     */       
/* 172 */       ((th)this.d.a(☃.Q())).b().a(b.a("Entity That Is Already Tracked"));
/*     */       
/*     */       try {
/* 175 */         throw new h(b);
/* 176 */       } catch (h h) {
/* 177 */         a.error("\"Silently\" catching entity tracking error.", h);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(aer ☃) {
/* 183 */     if (☃ instanceof tf) {
/* 184 */       tf tf = (tf)☃;
/* 185 */       for (th th1 : this.c) {
/* 186 */         th1.a(tf);
/*     */       }
/*     */     } 
/* 189 */     th th = this.d.d(☃.Q());
/* 190 */     if (th != null) {
/* 191 */       this.c.remove(th);
/* 192 */       th.a();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/* 197 */     List<tf> ☃ = Lists.newArrayList();
/* 198 */     for (th th : this.c) {
/* 199 */       th.a(this.b.j);
/* 200 */       if (th.b) {
/* 201 */         aer aer = th.b();
/* 202 */         if (aer instanceof tf) {
/* 203 */           ☃.add((tf)aer);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 208 */     for (int i = 0; i < ☃.size(); i++) {
/* 209 */       tf tf = ☃.get(i);
/* 210 */       for (th th : this.c) {
/* 211 */         if (th.b() != tf) {
/* 212 */           th.b(tf);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/* 219 */     for (th th : this.c) {
/* 220 */       if (th.b() == ☃) {
/* 221 */         th.b(this.b.j); continue;
/*     */       } 
/* 223 */       th.b(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aer ☃, iv<?> iv1) {
/* 229 */     th th = this.d.a(☃.Q());
/* 230 */     if (th != null) {
/* 231 */       th.a(iv1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(aer ☃, iv<?> iv1) {
/* 236 */     th th = this.d.a(☃.Q());
/* 237 */     if (th != null) {
/* 238 */       th.b(iv1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(tf ☃) {
/* 243 */     for (th th : this.c) {
/* 244 */       th.d(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(tf ☃, bnj bnj1) {
/* 249 */     List<aer> list1 = Lists.newArrayList();
/* 250 */     List<aer> list2 = Lists.newArrayList();
/*     */ 
/*     */     
/* 253 */     for (th th : this.c) {
/* 254 */       aer aer = th.b();
/* 255 */       if (aer != ☃ && aer.ae == bnj1.b && aer.ag == bnj1.c) {
/* 256 */         th.b(☃);
/*     */         
/* 258 */         if (aer instanceof afb && ((afb)aer).dn() != null) {
/* 259 */           list1.add(aer);
/*     */         }
/*     */         
/* 262 */         if (!aer.bP().isEmpty()) {
/* 263 */           list2.add(aer);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 268 */     if (!list1.isEmpty()) {
/* 269 */       for (aer aer : list1) {
/* 270 */         ☃.a.a(new lh(aer, ((afb)aer).dn()));
/*     */       }
/*     */     }
/*     */     
/* 274 */     if (!list2.isEmpty()) {
/* 275 */       for (aer aer : list2) {
/* 276 */         ☃.a.a(new ln(aer));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 282 */     this.e = (☃ - 1) * 16;
/* 283 */     for (th th : this.c)
/* 284 */       th.a(this.e); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\sz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */