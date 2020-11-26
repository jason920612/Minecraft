/*     */ import java.util.List;
/*     */ import java.util.function.Supplier;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bje
/*     */   extends bji
/*     */   implements adr
/*     */ {
/*     */   private ij a;
/*  30 */   private asc e = asc.a;
/*     */   
/*     */   private he f;
/*     */   
/*     */   private boolean g;
/*     */   private List<bjf> h;
/*     */   private List<asc> i;
/*     */   private String j;
/*     */   
/*     */   public bje() {
/*  40 */     super(bjj.s);
/*     */   }
/*     */   
/*     */   public bje(asc ☃) {
/*  44 */     this();
/*  45 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public void a(ate ☃, asc asc1) {
/*  49 */     this.f = null;
/*  50 */     gy gy = ☃.b("BlockEntityTag");
/*  51 */     if (gy != null && gy.c("Patterns", 9)) {
/*  52 */       this.f = gy.d("Patterns", 10).c();
/*     */     }
/*  54 */     this.e = asc1;
/*  55 */     this.h = null;
/*  56 */     this.i = null;
/*  57 */     this.j = "";
/*  58 */     this.g = true;
/*  59 */     this.a = ☃.s() ? ☃.q() : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/*  64 */     if (this.a != null) {
/*  65 */       return this.a;
/*     */     }
/*  67 */     return new ir("block.minecraft.banner", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/*  72 */     return (this.a != null);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ij e() {
/*  78 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  87 */     super.a(☃);
/*     */     
/*  89 */     if (this.f != null) {
/*  90 */       ☃.a("Patterns", this.f);
/*     */     }
/*     */     
/*  93 */     if (this.a != null) {
/*  94 */       ☃.a("CustomName", ij.a.a(this.a));
/*     */     }
/*     */     
/*  97 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/* 102 */     super.b(☃);
/*     */     
/* 104 */     if (☃.c("CustomName", 8)) {
/* 105 */       this.a = ij.a.a(☃.l("CustomName"));
/*     */     }
/*     */     
/* 108 */     if (u()) {
/* 109 */       this.e = ((bcb)w().c()).b();
/*     */     } else {
/* 111 */       this.e = null;
/*     */     } 
/* 113 */     this.f = ☃.d("Patterns", 10);
/*     */     
/* 115 */     this.h = null;
/* 116 */     this.i = null;
/* 117 */     this.j = null;
/* 118 */     this.g = true;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ji Z_() {
/* 124 */     return new ji(this.d_, 6, aa_());
/*     */   }
/*     */ 
/*     */   
/*     */   public gy aa_() {
/* 129 */     return a(new gy());
/*     */   }
/*     */   
/*     */   public static int a(ate ☃) {
/* 133 */     gy gy = ☃.b("BlockEntityTag");
/* 134 */     if (gy != null && gy.e("Patterns")) {
/* 135 */       return gy.d("Patterns", 10).size();
/*     */     }
/* 137 */     return 0;
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
/*     */   public static void b(ate ☃) {
/* 192 */     gy gy = ☃.b("BlockEntityTag");
/* 193 */     if (gy == null || !gy.c("Patterns", 9)) {
/*     */       return;
/*     */     }
/*     */     
/* 197 */     he he1 = gy.d("Patterns", 10);
/* 198 */     if (he1.isEmpty()) {
/*     */       return;
/*     */     }
/* 201 */     he1.a(he1.size() - 1);
/*     */     
/* 203 */     if (he1.isEmpty()) {
/* 204 */       ☃.c("BlockEntityTag");
/*     */     }
/*     */   }
/*     */   
/*     */   public ate a(blc ☃) {
/* 209 */     ate ate = new ate(bcg.a(a(() -> ☃)));
/* 210 */     if (this.f != null && !this.f.isEmpty()) {
/* 211 */       ate.a("BlockEntityTag").a("Patterns", this.f.c());
/*     */     }
/*     */     
/* 214 */     if (this.a != null) {
/* 215 */       ate.a(this.a);
/*     */     }
/* 217 */     return ate;
/*     */   }
/*     */   
/*     */   public asc a(Supplier<blc> ☃) {
/* 221 */     if (this.e == null) {
/* 222 */       this.e = ((bcb)((blc)☃.get()).c()).b();
/*     */     }
/* 224 */     return this.e;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bje.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */