/*     */ import java.util.BitSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ceh
/*     */   extends cem
/*     */ {
/*     */   private final BitSet d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   
/*     */   public ceh(int ☃, int i, int j) {
/*  17 */     this(☃, i, j, ☃, i, j, 0, 0, 0);
/*     */   }
/*     */   
/*     */   public ceh(int ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3) {
/*  21 */     super(☃, i, j);
/*  22 */     this.d = new BitSet(☃ * i * j);
/*  23 */     this.e = k;
/*  24 */     this.f = m;
/*  25 */     this.g = n;
/*  26 */     this.h = i1;
/*  27 */     this.i = i2;
/*  28 */     this.j = i3;
/*     */   }
/*     */   
/*     */   public ceh(cem ☃) {
/*  32 */     super(☃.a, ☃.b, ☃.c);
/*     */ 
/*     */     
/*  35 */     if (☃ instanceof ceh) {
/*  36 */       this.d = (BitSet)((ceh)☃).d.clone();
/*     */     } else {
/*  38 */       this.d = new BitSet(this.a * this.b * this.c);
/*  39 */       for (int i = 0; i < this.a; i++) {
/*  40 */         for (int j = 0; j < this.b; j++) {
/*  41 */           for (int k = 0; k < this.c; k++) {
/*  42 */             if (☃.b(i, j, k)) {
/*  43 */               this.d.set(a(i, j, k));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  50 */     this.e = ☃.a(eq.a.a);
/*  51 */     this.f = ☃.a(eq.a.b);
/*  52 */     this.g = ☃.a(eq.a.c);
/*     */     
/*  54 */     this.h = ☃.b(eq.a.a);
/*  55 */     this.i = ☃.b(eq.a.b);
/*  56 */     this.j = ☃.b(eq.a.c);
/*     */   }
/*     */   
/*     */   protected int a(int ☃, int i, int j) {
/*  60 */     return (☃ * this.b + i) * this.c + j;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, int i, int j) {
/*  65 */     return this.d.get(a(☃, i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool1, boolean bool2) {
/*  70 */     this.d.set(a(☃, i, j), bool2);
/*  71 */     if (bool1 && bool2) {
/*  72 */       this.e = Math.min(this.e, ☃);
/*  73 */       this.f = Math.min(this.f, i);
/*  74 */       this.g = Math.min(this.g, j);
/*     */       
/*  76 */       this.h = Math.max(this.h, ☃ + 1);
/*  77 */       this.i = Math.max(this.i, i + 1);
/*  78 */       this.j = Math.max(this.j, j + 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  84 */     return this.d.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(eq.a ☃) {
/*  89 */     return ☃.a(this.e, this.f, this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(eq.a ☃) {
/*  94 */     return ☃.a(this.h, this.i, this.j);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k) {
/* 100 */     if (j < 0 || k < 0 || ☃ < 0) {
/* 101 */       return false;
/*     */     }
/* 103 */     if (j >= this.a || k >= this.b || i > this.c) {
/* 104 */       return false;
/*     */     }
/* 106 */     return (this.d.nextClearBit(a(j, k, ☃)) >= a(j, k, i));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int ☃, int i, int j, int k, boolean bool) {
/* 112 */     this.d.set(a(j, k, ☃), a(j, k, i), bool);
/*     */   }
/*     */   
/*     */   static ceh a(cem ☃, cem cem1, ceo ceo1, ceo ceo2, ceo ceo3, cei cei1) {
/* 116 */     ceh ceh1 = new ceh(ceo1.a().size() - 1, ceo2.a().size() - 1, ceo3.a().size() - 1);
/* 117 */     int[] arrayOfInt = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     ceo1.a((i, j, k) -> {
/*     */           boolean[] arrayOfBoolean = { false };
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           boolean bool = ☃.a(());
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           if (arrayOfBoolean[0]) {
/*     */             arrayOfInt[0] = Math.min(arrayOfInt[0], k);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             arrayOfInt[3] = Math.max(arrayOfInt[3], k);
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/*     */           return bool;
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 153 */     ceh1.e = arrayOfInt[0];
/* 154 */     ceh1.f = arrayOfInt[1];
/* 155 */     ceh1.g = arrayOfInt[2];
/* 156 */     ceh1.h = arrayOfInt[3] + 1;
/* 157 */     ceh1.i = arrayOfInt[4] + 1;
/* 158 */     ceh1.j = arrayOfInt[5] + 1;
/* 159 */     return ceh1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ceh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */