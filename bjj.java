/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import java.util.function.Supplier;
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
/*     */ public class bjj<T extends bji>
/*     */ {
/*  18 */   private static final Logger z = LogManager.getLogger();
/*     */   
/*     */   @Nullable
/*     */   public static pc a(bjj<?> ☃) {
/*  22 */     return fc.o.b(☃);
/*     */   }
/*     */   
/*     */   public static <T extends bji> bjj<T> a(String ☃, a<T> a1) {
/*  26 */     Type<?> type = null;
/*     */     try {
/*  28 */       type = xz.a().getSchema(DataFixUtils.makeKey(1631)).getChoiceType(aax.j, ☃);
/*  29 */     } catch (IllegalStateException illegalStateException) {
/*  30 */       if (j.b) {
/*  31 */         throw illegalStateException;
/*     */       }
/*  33 */       z.warn("No data fixer registered for block entity {}", ☃);
/*     */     } 
/*     */     
/*  36 */     bjj<T> bjj1 = a1.a(type);
/*  37 */     fc.o.a(new pc(☃), bjj1);
/*     */     
/*  39 */     return bjj1;
/*     */   }
/*     */   
/*  42 */   public static final bjj<bju> a = a("furnace", a.a(bju::new));
/*  43 */   public static final bjj<bjl> b = a("chest", a.a(bjl::new));
/*  44 */   public static final bjj<bki> c = a("trapped_chest", a.a(bki::new));
/*  45 */   public static final bjj<bjt> d = a("ender_chest", a.a(bjt::new));
/*  46 */   public static final bjj<bjx> e = a("jukebox", a.a(bjx::new));
/*  47 */   public static final bjj<bjq> f = a("dispenser", a.a(bjq::new));
/*  48 */   public static final bjj<bjr> g = a("dropper", a.a(bjr::new));
/*  49 */   public static final bjj<bkc> h = a("sign", a.a(bkc::new));
/*  50 */   public static final bjj<bke> i = a("mob_spawner", a.a(bke::new));
/*  51 */   public static final bjj<bkx> j = a("piston", a.a(bkx::new));
/*  52 */   public static final bjj<bjk> k = a("brewing_stand", a.a(bjk::new));
/*  53 */   public static final bjj<bjs> l = a("enchanting_table", a.a(bjs::new));
/*  54 */   public static final bjj<bkh> m = a("end_portal", a.a(bkh::new));
/*  55 */   public static final bjj<bjg> n = a("beacon", a.a(bjg::new));
/*  56 */   public static final bjj<bkd> o = a("skull", a.a(bkd::new));
/*  57 */   public static final bjj<bjp> p = a("daylight_detector", a.a(bjp::new));
/*  58 */   public static final bjj<bjw> q = a("hopper", a.a(bjw::new));
/*  59 */   public static final bjj<bjn> r = a("comparator", a.a(bjn::new));
/*  60 */   public static final bjj<bje> s = a("banner", a.a(bje::new));
/*  61 */   public static final bjj<bkf> t = a("structure_block", a.a(bkf::new));
/*  62 */   public static final bjj<bkg> u = a("end_gateway", a.a(bkg::new));
/*  63 */   public static final bjj<bjm> v = a("command_block", a.a(bjm::new));
/*  64 */   public static final bjj<bkb> w = a("shulker_box", a.a(bkb::new));
/*  65 */   public static final bjj<bjh> x = a("bed", a.a(bjh::new));
/*  66 */   public static final bjj<bjo> y = a("conduit", a.a(bjo::new));
/*     */   
/*     */   private final Supplier<? extends T> A;
/*     */   
/*     */   private final Type<?> B;
/*     */ 
/*     */   
/*     */   public static void a() {}
/*     */   
/*     */   public bjj(Supplier<? extends T> ☃, Type<?> type) {
/*  76 */     this.A = ☃;
/*  77 */     this.B = type;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public T b() {
/*  82 */     return this.A.get();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   static bji a(String ☃) {
/*  87 */     bjj<?> bjj1 = fc.o.b(new pc(☃));
/*  88 */     return (bjj1 == null) ? null : (bji)bjj1.b();
/*     */   }
/*     */   
/*     */   public static final class a<T extends bji> {
/*     */     private final Supplier<? extends T> a;
/*     */     
/*     */     private a(Supplier<? extends T> ☃) {
/*  95 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public static <T extends bji> a<T> a(Supplier<? extends T> ☃) {
/*  99 */       return new a<>(☃);
/*     */     }
/*     */     
/*     */     public bjj<T> a(Type<?> ☃) {
/* 103 */       return new bjj<>(this.a, ☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bjj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */