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
/*     */ public class bjq
/*     */   extends bka
/*     */ {
/*  20 */   private static final Random a = new Random();
/*     */   
/*  22 */   private ez<ate> e = ez.a(9, ate.a);
/*     */   
/*     */   protected bjq(bjj<?> ☃) {
/*  25 */     super(☃);
/*     */   }
/*     */   
/*     */   public bjq() {
/*  29 */     this(bjj.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int T_() {
/*  34 */     return 9;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean P_() {
/*  39 */     for (ate ☃ : this.e) {
/*  40 */       if (!☃.a()) {
/*  41 */         return false;
/*     */       }
/*     */     } 
/*  44 */     return true;
/*     */   }
/*     */   
/*     */   public int p() {
/*  48 */     d((aog)null);
/*  49 */     int ☃ = -1;
/*  50 */     int i = 1;
/*     */     
/*  52 */     for (int j = 0; j < this.e.size(); j++) {
/*  53 */       if (!((ate)this.e.get(j)).a() && a.nextInt(i++) == 0) {
/*  54 */         ☃ = j;
/*     */       }
/*     */     } 
/*     */     
/*  58 */     return ☃;
/*     */   }
/*     */   
/*     */   public int a(ate ☃) {
/*  62 */     for (int i = 0; i < this.e.size(); i++) {
/*  63 */       if (((ate)this.e.get(i)).a()) {
/*  64 */         a(i, ☃);
/*  65 */         return i;
/*     */       } 
/*     */     } 
/*     */     
/*  69 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij N_() {
/*  74 */     ij ☃ = e();
/*  75 */     if (☃ != null) {
/*  76 */       return ☃;
/*     */     }
/*  78 */     return new ir("container.dispenser", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(gy ☃) {
/*  83 */     super.b(☃);
/*     */     
/*  85 */     this.e = ez.a(T_(), ate.a);
/*  86 */     if (!d(☃)) {
/*  87 */       adf.b(☃, this.e);
/*     */     }
/*     */     
/*  90 */     if (☃.c("CustomName", 8)) {
/*  91 */       this.i = ij.a.a(☃.l("CustomName"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public gy a(gy ☃) {
/*  97 */     super.a(☃);
/*     */     
/*  99 */     if (!e(☃)) {
/* 100 */       adf.a(☃, this.e);
/*     */     }
/*     */     
/* 103 */     ij ij = e();
/* 104 */     if (ij != null) {
/* 105 */       ☃.a("CustomName", ij.a.a(ij));
/*     */     }
/*     */     
/* 108 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 113 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 118 */     return "minecraft:dispenser";
/*     */   }
/*     */ 
/*     */   
/*     */   public apv a(aof ☃, aog aog1) {
/* 123 */     d(aog1);
/* 124 */     return new aqe(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ez<ate> q() {
/* 129 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ez<ate> ☃) {
/* 134 */     this.e = ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */