/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ public class pr
/*     */   extends cfc
/*     */ {
/*     */   private final MinecraftServer a;
/*  23 */   private final Set<cez> b = Sets.newHashSet();
/*  24 */   private Runnable[] c = new Runnable[0];
/*     */   
/*     */   public pr(MinecraftServer ☃) {
/*  27 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(cfb ☃) {
/*  36 */     super.a(☃);
/*     */     
/*  38 */     if (this.b.contains(☃.d())) {
/*  39 */       this.a.ac().a(new lp(a.a, ☃.d().b(), ☃.e(), ☃.b()));
/*     */     }
/*     */     
/*  42 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃) {
/*  47 */     super.a(☃);
/*  48 */     this.a.ac().a(new lp(a.b, null, ☃, 0));
/*  49 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃, cez cez1) {
/*  54 */     super.a(☃, cez1);
/*  55 */     if (this.b.contains(cez1)) {
/*  56 */       this.a.ac().a(new lp(a.b, cez1.b(), ☃, 0));
/*     */     }
/*  58 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, @Nullable cez cez1) {
/*  63 */     cez cez2 = a(☃);
/*     */     
/*  65 */     super.a(☃, cez1);
/*     */     
/*  67 */     if (cez2 != cez1 && cez2 != null) {
/*  68 */       if (h(cez2) > 0) {
/*  69 */         this.a.ac().a(new lf(☃, cez1));
/*     */       } else {
/*  71 */         g(cez2);
/*     */       } 
/*     */     }
/*     */     
/*  75 */     if (cez1 != null) {
/*  76 */       if (this.b.contains(cez1)) {
/*  77 */         this.a.ac().a(new lf(☃, cez1));
/*     */       } else {
/*  79 */         e(cez1);
/*     */       } 
/*     */     }
/*     */     
/*  83 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(String ☃, cfa cfa1) {
/*  88 */     if (super.a(☃, cfa1)) {
/*  89 */       this.a.ac().a(new lo(cfa1, Arrays.asList(new String[] { ☃ }, ), 3));
/*  90 */       b();
/*     */       
/*  92 */       return true;
/*     */     } 
/*     */     
/*  95 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(String ☃, cfa cfa1) {
/* 100 */     super.b(☃, cfa1);
/*     */     
/* 102 */     this.a.ac().a(new lo(cfa1, Arrays.asList(new String[] { ☃ }, ), 4));
/*     */     
/* 104 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cez ☃) {
/* 109 */     super.a(☃);
/* 110 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(cez ☃) {
/* 115 */     super.b(☃);
/*     */     
/* 117 */     if (this.b.contains(☃)) {
/* 118 */       this.a.ac().a(new lm(☃, 2));
/*     */     }
/*     */     
/* 121 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(cez ☃) {
/* 126 */     super.c(☃);
/*     */     
/* 128 */     if (this.b.contains(☃)) {
/* 129 */       g(☃);
/*     */     }
/*     */     
/* 132 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cfa ☃) {
/* 137 */     super.a(☃);
/*     */     
/* 139 */     this.a.ac().a(new lo(☃, 0));
/*     */     
/* 141 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(cfa ☃) {
/* 146 */     super.b(☃);
/*     */     
/* 148 */     this.a.ac().a(new lo(☃, 2));
/*     */     
/* 150 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(cfa ☃) {
/* 155 */     super.c(☃);
/*     */     
/* 157 */     this.a.ac().a(new lo(☃, 1));
/*     */     
/* 159 */     b();
/*     */   }
/*     */   
/*     */   public void a(Runnable ☃) {
/* 163 */     this.c = Arrays.<Runnable>copyOf(this.c, this.c.length + 1);
/* 164 */     this.c[this.c.length - 1] = ☃;
/*     */   }
/*     */   
/*     */   protected void b() {
/* 168 */     for (Runnable ☃ : this.c) {
/* 169 */       ☃.run();
/*     */     }
/*     */   }
/*     */   
/*     */   public List<iv<?>> d(cez ☃) {
/* 174 */     List<iv<?>> list = Lists.newArrayList();
/* 175 */     list.add(new lm(☃, 0));
/*     */     
/* 177 */     for (int i = 0; i < 19; i++) {
/* 178 */       if (a(i) == ☃) {
/* 179 */         list.add(new lf(i, ☃));
/*     */       }
/*     */     } 
/*     */     
/* 183 */     for (cfb cfb : i(☃)) {
/* 184 */       list.add(new lp(a.a, cfb.d().b(), cfb.e(), cfb.b()));
/*     */     }
/*     */     
/* 187 */     return list;
/*     */   }
/*     */   
/*     */   public void e(cez ☃) {
/* 191 */     List<iv<?>> list = d(☃);
/*     */     
/* 193 */     for (tf tf : this.a.ac().v()) {
/* 194 */       for (iv<?> iv : list) {
/* 195 */         tf.a.a(iv);
/*     */       }
/*     */     } 
/*     */     
/* 199 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public List<iv<?>> f(cez ☃) {
/* 203 */     List<iv<?>> list = Lists.newArrayList();
/* 204 */     list.add(new lm(☃, 1));
/*     */     
/* 206 */     for (int i = 0; i < 19; i++) {
/* 207 */       if (a(i) == ☃) {
/* 208 */         list.add(new lf(i, ☃));
/*     */       }
/*     */     } 
/*     */     
/* 212 */     return list;
/*     */   }
/*     */   
/*     */   public void g(cez ☃) {
/* 216 */     List<iv<?>> list = f(☃);
/*     */     
/* 218 */     for (tf tf : this.a.ac().v()) {
/* 219 */       for (iv<?> iv : list) {
/* 220 */         tf.a.a(iv);
/*     */       }
/*     */     } 
/*     */     
/* 224 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public int h(cez ☃) {
/* 228 */     int i = 0;
/*     */     
/* 230 */     for (int j = 0; j < 19; j++) {
/* 231 */       if (a(j) == ☃) {
/* 232 */         i++;
/*     */       }
/*     */     } 
/*     */     
/* 236 */     return i;
/*     */   }
/*     */   
/*     */   public enum a {
/* 240 */     a,
/* 241 */     b;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\pr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */