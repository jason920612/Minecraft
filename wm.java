/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wm
/*     */ {
/*  13 */   protected final Set<pc> a = Sets.newHashSet();
/*  14 */   protected final Set<pc> b = Sets.newHashSet();
/*     */   
/*     */   protected boolean c;
/*     */   
/*     */   protected boolean d;
/*     */   protected boolean e;
/*     */   protected boolean f;
/*     */   
/*     */   public void a(wm ☃) {
/*  23 */     this.a.clear();
/*  24 */     this.b.clear();
/*     */     
/*  26 */     this.a.addAll(☃.a);
/*  27 */     this.b.addAll(☃.b);
/*     */   }
/*     */   
/*     */   public void a(avk ☃) {
/*  31 */     if (!☃.c()) {
/*  32 */       a(☃.b());
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(pc ☃) {
/*  37 */     this.a.add(☃);
/*     */   }
/*     */   
/*     */   public boolean b(@Nullable avk ☃) {
/*  41 */     if (☃ == null) {
/*  42 */       return false;
/*     */     }
/*  44 */     return this.a.contains(☃.b());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(pc ☃) {
/*  52 */     this.a.remove(☃);
/*  53 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e(avk ☃) {
/*  61 */     this.b.remove(☃.b());
/*     */   }
/*     */   
/*     */   public void f(avk ☃) {
/*  65 */     c(☃.b());
/*     */   }
/*     */   
/*     */   protected void c(pc ☃) {
/*  69 */     this.b.add(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/*  77 */     this.c = ☃;
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
/*     */   public void b(boolean ☃) {
/*  93 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(boolean ☃) {
/* 101 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(boolean ☃) {
/* 109 */     this.f = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */