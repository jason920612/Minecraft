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
/*     */ public class xm<V>
/*     */ {
/*  20 */   private final float d = 0.75F;
/*  21 */   private int c = 12;
/*  22 */   private transient a<V>[] a = (a<V>[])new a[16];
/*     */   private transient int b;
/*     */   
/*     */   private static int g(int ☃) {
/*  26 */     ☃ ^= ☃ >>> 20 ^ ☃ >>> 12;
/*  27 */     return ☃ ^ ☃ >>> 7 ^ ☃ >>> 4;
/*     */   }
/*     */   
/*     */   private static int a(int ☃, int i) {
/*  31 */     return ☃ & i - 1;
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
/*     */   @Nullable
/*     */   public V a(int ☃) {
/*  44 */     int i = g(☃);
/*  45 */     for (a<V> a1 = this.a[a(i, this.a.length)]; a1 != null; a1 = a.a(a1)) {
/*  46 */       if (a.b(a1) == ☃) {
/*  47 */         return (V)a.c(a1);
/*     */       }
/*     */     } 
/*  50 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b(int ☃) {
/*  54 */     return (c(☃) != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   final a<V> c(int ☃) {
/*  59 */     int i = g(☃);
/*  60 */     for (a<V> a1 = this.a[a(i, this.a.length)]; a1 != null; a1 = a.a(a1)) {
/*  61 */       if (a.b(a1) == ☃) {
/*  62 */         return a1;
/*     */       }
/*     */     } 
/*  65 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int ☃, V v) {
/*  69 */     int i = g(☃);
/*  70 */     int j = a(i, this.a.length);
/*  71 */     for (a<V> a1 = this.a[j]; a1 != null; a1 = a.a(a1)) {
/*  72 */       if (a.b(a1) == ☃) {
/*  73 */         a.a(a1, v);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*  78 */     a(i, ☃, v, j);
/*     */   }
/*     */ 
/*     */   
/*     */   private void h(int ☃) {
/*  83 */     a<V>[] arrayOfA = this.a;
/*  84 */     int i = arrayOfA.length;
/*  85 */     if (i == 1073741824) {
/*  86 */       this.c = Integer.MAX_VALUE;
/*     */       
/*     */       return;
/*     */     } 
/*  90 */     a[] arrayOfA1 = new a[☃];
/*  91 */     a((a<V>[])arrayOfA1);
/*  92 */     this.a = (a<V>[])arrayOfA1;
/*  93 */     this.c = (int)(☃ * this.d);
/*     */   }
/*     */   
/*     */   private void a(a<V>[] ☃) {
/*  97 */     a<V>[] arrayOfA = this.a;
/*  98 */     int i = ☃.length;
/*  99 */     for (int j = 0; j < arrayOfA.length; j++) {
/* 100 */       a<V> a1 = arrayOfA[j];
/* 101 */       if (a1 != null) {
/* 102 */         arrayOfA[j] = null;
/*     */         do {
/* 104 */           a<V> a2 = a.a(a1);
/* 105 */           int k = a(a.d(a1), i);
/* 106 */           a.a(a1, ☃[k]);
/* 107 */           ☃[k] = a1;
/* 108 */           a1 = a2;
/* 109 */         } while (a1 != null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public V d(int ☃) {
/* 116 */     a<V> a1 = e(☃);
/* 117 */     return (a1 == null) ? null : (V)a.c(a1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   final a<V> e(int ☃) {
/* 122 */     int i = g(☃);
/* 123 */     int j = a(i, this.a.length);
/* 124 */     a<V> a1 = this.a[j];
/* 125 */     a<V> a2 = a1;
/*     */     
/* 127 */     while (a2 != null) {
/* 128 */       a<V> a3 = a.a(a2);
/* 129 */       if (a.b(a2) == ☃) {
/* 130 */         this.b--;
/* 131 */         if (a1 == a2) {
/* 132 */           this.a[j] = a3;
/*     */         } else {
/* 134 */           a.a(a1, a3);
/*     */         } 
/* 136 */         return a2;
/*     */       } 
/* 138 */       a1 = a2;
/* 139 */       a2 = a3;
/*     */     } 
/*     */     
/* 142 */     return a2;
/*     */   }
/*     */   
/*     */   public void c() {
/* 146 */     a<V>[] ☃ = this.a;
/* 147 */     for (int i = 0; i < ☃.length; i++) {
/* 148 */       ☃[i] = null;
/*     */     }
/* 150 */     this.b = 0;
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
/*     */   static class a<V>
/*     */   {
/*     */     private final int a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private V b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private a<V> c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final int d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     a(int ☃, int i, V v, a<V> a1) {
/* 197 */       this.b = v;
/* 198 */       this.c = a1;
/* 199 */       this.a = i;
/* 200 */       this.d = ☃;
/*     */     }
/*     */     
/*     */     public final int a() {
/* 204 */       return this.a;
/*     */     }
/*     */     
/*     */     public final V b() {
/* 208 */       return this.b;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean equals(Object ☃) {
/* 214 */       if (!(☃ instanceof a)) {
/* 215 */         return false;
/*     */       }
/* 217 */       a<V> a1 = (a<V>)☃;
/* 218 */       if (this.a == a1.a) {
/* 219 */         Object object1 = b();
/* 220 */         Object object2 = a1.b();
/* 221 */         if (object1 == object2 || (object1 != null && object1.equals(object2))) {
/* 222 */           return true;
/*     */         }
/*     */       } 
/* 225 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public final int hashCode() {
/* 230 */       return xm.f(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public final String toString() {
/* 235 */       return a() + "=" + b();
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, V v, int j) {
/* 240 */     a<V> a1 = this.a[j];
/* 241 */     this.a[j] = new a<>(☃, i, v, a1);
/* 242 */     if (this.b++ >= this.c)
/* 243 */       h(2 * this.a.length); 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\xm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */