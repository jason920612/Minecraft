/*     */ import com.google.common.base.Objects;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class tb
/*     */   extends adc
/*     */ {
/*  15 */   private final Set<tf> h = Sets.newHashSet();
/*  16 */   private final Set<tf> i = Collections.unmodifiableSet(this.h);
/*     */   private boolean j = true;
/*     */   
/*     */   public tb(ij ☃, adc.a a1, adc.b b1) {
/*  20 */     super(xq.a(), ☃, a1, b1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/*  25 */     if (☃ != this.b) {
/*  26 */       super.a(☃);
/*  27 */       a(jl.a.c);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adc.a ☃) {
/*  33 */     if (☃ != this.c) {
/*  34 */       super.a(☃);
/*  35 */       a(jl.a.e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adc.b ☃) {
/*  41 */     if (☃ != this.d) {
/*  42 */       super.a(☃);
/*  43 */       a(jl.a.e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public adc a(boolean ☃) {
/*  49 */     if (☃ != this.e) {
/*  50 */       super.a(☃);
/*  51 */       a(jl.a.f);
/*     */     } 
/*  53 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public adc b(boolean ☃) {
/*  58 */     if (☃ != this.f) {
/*  59 */       super.b(☃);
/*  60 */       a(jl.a.f);
/*     */     } 
/*  62 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public adc c(boolean ☃) {
/*  67 */     if (☃ != this.g) {
/*  68 */       super.c(☃);
/*  69 */       a(jl.a.f);
/*     */     } 
/*  71 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ij ☃) {
/*  76 */     if (!Objects.equal(☃, this.a)) {
/*  77 */       super.a(☃);
/*  78 */       a(jl.a.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(jl.a ☃) {
/*  83 */     if (this.j) {
/*  84 */       jl jl = new jl(☃, this);
/*  85 */       for (tf tf : this.h) {
/*  86 */         tf.a.a(jl);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(tf ☃) {
/*  92 */     if (this.h.add(☃) && this.j) {
/*  93 */       ☃.a.a(new jl(jl.a.a, this));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(tf ☃) {
/*  98 */     if (this.h.remove(☃) && this.j) {
/*  99 */       ☃.a.a(new jl(jl.a.b, this));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 104 */     if (!this.h.isEmpty()) {
/* 105 */       for (tf ☃ : this.h) {
/* 106 */         b(☃);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 112 */     return this.j;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 116 */     if (☃ != this.j) {
/* 117 */       this.j = ☃;
/*     */       
/* 119 */       for (tf tf : this.h) {
/* 120 */         tf.a.a(new jl(☃ ? jl.a.a : jl.a.b, this));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public Collection<tf> h() {
/* 126 */     return this.i;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\tb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */