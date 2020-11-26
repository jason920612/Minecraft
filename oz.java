/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class oz
/*     */   implements oy<Integer>
/*     */ {
/*  25 */   protected static final Logger a = LogManager.getLogger();
/*     */   
/*  27 */   protected final aoi b = new aoi();
/*     */   
/*     */   protected aof c;
/*     */   protected aqr d;
/*     */   
/*     */   public void a(tf ☃, @Nullable avk avk1, boolean bool) {
/*  33 */     if (avk1 == null || !☃.B().b(avk1)) {
/*     */       return;
/*     */     }
/*     */     
/*  37 */     this.c = ☃.bB;
/*  38 */     this.d = (aqr)☃.bE;
/*     */ 
/*     */     
/*  41 */     if (!b() && !☃.u()) {
/*     */       return;
/*     */     }
/*     */     
/*  45 */     this.b.a();
/*  46 */     ☃.bB.a(this.b);
/*  47 */     this.d.a(this.b);
/*     */     
/*  49 */     if (this.b.a(avk1, (IntList)null)) {
/*  50 */       a(avk1, bool);
/*     */     } else {
/*  52 */       a();
/*  53 */       ☃.a.a(new ko(☃.bE.d, avk1));
/*     */     } 
/*     */     
/*  56 */     ☃.bB.g();
/*     */   }
/*     */   
/*     */   protected void a() {
/*  60 */     for (int ☃ = 0; ☃ < this.d.f() * this.d.g() + 1; ☃++) {
/*  61 */       if (☃ != this.d.e() || (!(this.d instanceof aqd) && !(this.d instanceof aqm)))
/*     */       {
/*     */         
/*  64 */         a(☃);
/*     */       }
/*     */     } 
/*  67 */     this.d.d();
/*     */   }
/*     */   
/*     */   protected void a(int ☃) {
/*  71 */     ate ate = this.d.a(☃).d();
/*  72 */     if (ate.a()) {
/*     */       return;
/*     */     }
/*     */     
/*  76 */     while (ate.C() > 0) {
/*  77 */       int i = this.c.d(ate);
/*  78 */       if (i == -1) {
/*  79 */         i = this.c.k();
/*     */       }
/*  81 */       ate ate1 = ate.i();
/*  82 */       ate1.e(1);
/*     */       
/*  84 */       if (!this.c.c(i, ate1)) {
/*  85 */         a.error("Can't find any space for item in the inventory");
/*     */       }
/*     */       
/*  88 */       this.d.a(☃).a(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(avk ☃, boolean bool) {
/*  93 */     boolean bool1 = this.d.a(☃);
/*  94 */     int i = this.b.b(☃, (IntList)null);
/*     */ 
/*     */     
/*  97 */     if (bool1) {
/*  98 */       for (int k = 0; k < this.d.g() * this.d.f() + 1; k++) {
/*  99 */         if (k != this.d.e()) {
/*     */ 
/*     */           
/* 102 */           ate ate = this.d.a(k).d();
/* 103 */           if (!ate.a() && Math.min(i, ate.c()) < ate.C() + 1) {
/*     */             return;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/* 109 */     int j = a(bool, i, bool1);
/* 110 */     IntArrayList intArrayList = new IntArrayList();
/* 111 */     if (this.b.a(☃, (IntList)intArrayList, j)) {
/*     */       
/* 113 */       int k = j;
/* 114 */       for (IntListIterator<Integer> intListIterator = intArrayList.iterator(); intListIterator.hasNext(); ) { int m = ((Integer)intListIterator.next()).intValue();
/* 115 */         int n = aoi.b(m).c();
/* 116 */         if (n < k) {
/* 117 */           k = n;
/*     */         } }
/*     */       
/* 120 */       j = k;
/*     */ 
/*     */       
/* 123 */       if (this.b.a(☃, (IntList)intArrayList, j)) {
/* 124 */         a();
/* 125 */         a(this.d.f(), this.d.g(), this.d.e(), ☃, (Iterator<Integer>)intArrayList.iterator(), j);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Iterator<Integer> ☃, int i, int j, int k, int m) {
/* 132 */     aqx aqx = this.d.a(i);
/* 133 */     ate ate = aoi.b(((Integer)☃.next()).intValue());
/* 134 */     if (!ate.a()) {
/* 135 */       for (int n = 0; n < j; n++) {
/* 136 */         a(aqx, ate);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected int a(boolean ☃, int i, boolean bool1) {
/* 142 */     int j = 1;
/* 143 */     if (☃) {
/* 144 */       j = i;
/* 145 */     } else if (bool1) {
/* 146 */       j = 64;
/* 147 */       for (int k = 0; k < this.d.f() * this.d.g() + 1; k++) {
/* 148 */         if (k != this.d.e()) {
/*     */ 
/*     */ 
/*     */           
/* 152 */           ate ate = this.d.a(k).d();
/* 153 */           if (!ate.a() && j > ate.C()) {
/* 154 */             j = ate.C();
/*     */           }
/*     */         } 
/*     */       } 
/* 158 */       if (j < 64) {
/* 159 */         j++;
/*     */       }
/*     */     } 
/*     */     
/* 163 */     return j;
/*     */   }
/*     */   
/*     */   protected void a(aqx ☃, ate ate1) {
/* 167 */     int i = this.c.c(ate1);
/* 168 */     if (i == -1) {
/*     */       return;
/*     */     }
/* 171 */     ate ate2 = this.c.a(i).i();
/*     */     
/* 173 */     if (ate2.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 177 */     if (ate2.C() > 1) {
/* 178 */       this.c.a(i, 1);
/*     */     } else {
/* 180 */       this.c.b(i);
/*     */     } 
/* 182 */     ate2.e(1);
/*     */     
/* 184 */     if (☃.d().a()) {
/* 185 */       ☃.d(ate2);
/*     */     } else {
/* 187 */       ☃.d().f(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean b() {
/* 192 */     List<ate> ☃ = Lists.newArrayList();
/* 193 */     int i = c();
/*     */     
/* 195 */     for (int j = 0; j < this.d.f() * this.d.g() + 1; j++) {
/* 196 */       if (j != this.d.e()) {
/*     */ 
/*     */ 
/*     */         
/* 200 */         ate ate = this.d.a(j).d().i();
/* 201 */         if (!ate.a()) {
/*     */ 
/*     */ 
/*     */           
/* 205 */           int k = this.c.d(ate);
/* 206 */           if (k == -1 && ☃.size() <= i) {
/* 207 */             for (ate ate1 : ☃) {
/* 208 */               if (ate1.a(ate) && ate1.C() != ate1.c() && ate1.C() + ate.C() <= ate1.c()) {
/* 209 */                 ate1.f(ate.C());
/* 210 */                 ate.e(0);
/*     */                 
/*     */                 break;
/*     */               } 
/*     */             } 
/* 215 */             if (!ate.a()) {
/* 216 */               if (☃.size() < i) {
/* 217 */                 ☃.add(ate);
/*     */               } else {
/* 219 */                 return false;
/*     */               
/*     */               }
/*     */ 
/*     */             
/*     */             }
/*     */           }
/* 226 */           else if (k == -1) {
/* 227 */             return false;
/*     */           } 
/*     */         } 
/*     */       } 
/* 231 */     }  return true;
/*     */   }
/*     */   
/*     */   private int c() {
/* 235 */     int ☃ = 0;
/* 236 */     for (ate ate : this.c.a) {
/* 237 */       if (ate.a()) {
/* 238 */         ☃++;
/*     */       }
/*     */     } 
/* 241 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\oz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */