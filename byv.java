/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Random;
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
/*     */ public abstract class byv
/*     */ {
/*  22 */   public static final eu<byw> c = new eu<>();
/*     */   
/*     */   protected final ble<byv, byw> d;
/*     */   private byw a;
/*     */   
/*     */   protected byv() {
/*  28 */     ble.a<byv, byw> ☃ = new ble.a<>(this);
/*  29 */     a(☃);
/*  30 */     this.d = ☃.a(byx::new);
/*  31 */     f(this.d.b());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ble.a<byv, byw> ☃) {}
/*     */   
/*     */   public ble<byv, byw> h() {
/*  38 */     return this.d;
/*     */   }
/*     */   
/*     */   protected final void f(byw ☃) {
/*  42 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public final byw i() {
/*  46 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract ata b();
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(axy ☃, el el1, byw byw1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(axy ☃, el el1, byw byw1, Random random) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract boolean a(byw parambyw, byv parambyv, eq parameq);
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract cee a(ayc paramayc, el paramel, byw parambyw);
/*     */ 
/*     */   
/*     */   public abstract int a(ayc paramayc);
/*     */ 
/*     */   
/*     */   protected boolean k() {
/*  74 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean c() {
/*  78 */     return false;
/*     */   }
/*     */   
/*     */   protected abstract float d();
/*     */   
/*     */   public abstract float a(byw parambyw);
/*     */   
/*     */   protected abstract blc b(byw parambyw);
/*     */   
/*     */   public abstract boolean c(byw parambyw);
/*     */   
/*     */   public abstract int d(byw parambyw);
/*     */   
/*     */   public boolean a(byv ☃) {
/*  92 */     return (☃ == this);
/*     */   }
/*     */   
/*     */   public boolean a(wz<byv> ☃) {
/*  96 */     return ☃.a(this);
/*     */   }
/*     */   
/*     */   public static void l() {
/* 100 */     a(fc.h.b(), new byt());
/* 101 */     a("flowing_water", new bzd.a());
/* 102 */     a("water", new bzd.b());
/* 103 */     a("flowing_lava", new byz.a());
/* 104 */     a("lava", new byz.b());
/*     */     
/* 106 */     for (byv ☃ : fc.h) {
/* 107 */       for (UnmodifiableIterator<byw> unmodifiableIterator = ☃.h().a().iterator(); unmodifiableIterator.hasNext(); ) { byw byw1 = unmodifiableIterator.next();
/* 108 */         c.b(byw1); }
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(String ☃, byv byv1) {
/* 114 */     a(new pc(☃), byv1);
/*     */   }
/*     */   
/*     */   private static void a(pc ☃, byv byv1) {
/* 118 */     fc.h.a(☃, byv1);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\byv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */