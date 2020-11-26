/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wv
/*     */ {
/*   9 */   private static xa<bcs> M = new xa<>(☃ -> false, ☃ -> null, "", false, "");
/*     */ 
/*     */   
/*     */   private static int N;
/*     */ 
/*     */   
/*  15 */   public static final wz<bcs> a = a("wool");
/*  16 */   public static final wz<bcs> b = a("planks");
/*  17 */   public static final wz<bcs> c = a("stone_bricks");
/*  18 */   public static final wz<bcs> d = a("wooden_buttons");
/*  19 */   public static final wz<bcs> e = a("buttons");
/*  20 */   public static final wz<bcs> f = a("carpets");
/*  21 */   public static final wz<bcs> g = a("wooden_doors");
/*  22 */   public static final wz<bcs> h = a("wooden_stairs");
/*  23 */   public static final wz<bcs> i = a("wooden_slabs");
/*  24 */   public static final wz<bcs> j = a("wooden_pressure_plates");
/*  25 */   public static final wz<bcs> k = a("wooden_trapdoors");
/*  26 */   public static final wz<bcs> l = a("doors");
/*  27 */   public static final wz<bcs> m = a("saplings");
/*  28 */   public static final wz<bcs> n = a("logs");
/*  29 */   public static final wz<bcs> o = a("dark_oak_logs");
/*  30 */   public static final wz<bcs> p = a("oak_logs");
/*  31 */   public static final wz<bcs> q = a("birch_logs");
/*  32 */   public static final wz<bcs> r = a("acacia_logs");
/*  33 */   public static final wz<bcs> s = a("jungle_logs");
/*  34 */   public static final wz<bcs> t = a("spruce_logs");
/*  35 */   public static final wz<bcs> u = a("banners");
/*  36 */   public static final wz<bcs> v = a("sand");
/*  37 */   public static final wz<bcs> w = a("stairs");
/*  38 */   public static final wz<bcs> x = a("slabs");
/*  39 */   public static final wz<bcs> y = a("anvil");
/*  40 */   public static final wz<bcs> z = a("rails");
/*  41 */   public static final wz<bcs> A = a("leaves");
/*  42 */   public static final wz<bcs> B = a("trapdoors");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  47 */   public static final wz<bcs> C = a("flower_pots");
/*  48 */   public static final wz<bcs> D = a("enderman_holdable");
/*  49 */   public static final wz<bcs> E = a("ice");
/*  50 */   public static final wz<bcs> F = a("valid_spawn");
/*  51 */   public static final wz<bcs> G = a("impermeable");
/*  52 */   public static final wz<bcs> H = a("underwater_bonemeals");
/*  53 */   public static final wz<bcs> I = a("coral_blocks");
/*  54 */   public static final wz<bcs> J = a("wall_corals");
/*  55 */   public static final wz<bcs> K = a("coral_plants");
/*  56 */   public static final wz<bcs> L = a("corals");
/*     */   
/*     */   public static void a(xa<bcs> ☃) {
/*  59 */     M = ☃;
/*  60 */     N++;
/*     */   }
/*     */   
/*     */   public static xa<bcs> a() {
/*  64 */     return M;
/*     */   }
/*     */   
/*     */   private static wz<bcs> a(String ☃) {
/*  68 */     return new a(new pc(☃));
/*     */   }
/*     */   
/*     */   static class a extends wz<bcs> {
/*  72 */     private int a = -1;
/*     */     private wz<bcs> b;
/*     */     
/*     */     public a(pc ☃) {
/*  76 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bcs ☃) {
/*  81 */       if (this.a != wv.b()) {
/*  82 */         this.b = wv.c().b(c());
/*  83 */         this.a = wv.b();
/*     */       } 
/*  85 */       return this.b.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<bcs> a() {
/*  90 */       if (this.a != wv.b()) {
/*  91 */         this.b = wv.c().b(c());
/*  92 */         this.a = wv.b();
/*     */       } 
/*  94 */       return this.b.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<wz.b<bcs>> b() {
/*  99 */       if (this.a != wv.b()) {
/* 100 */         this.b = wv.c().b(c());
/* 101 */         this.a = wv.b();
/*     */       } 
/* 103 */       return this.b.b();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */