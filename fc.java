/*     */ import java.util.Iterator;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public interface fc<T>
/*     */   extends et<T>
/*     */ {
/*  34 */   public static final Logger e = LogManager.getLogger();
/*     */   
/*  36 */   public static final fc<fc<?>> f = new ey<>();
/*     */   
/*  38 */   public static final fc<bcs> g = a("block", new ep<>(new pc("air")));
/*  39 */   public static final fc<byv> h = a("fluid", new ep<>(new pc("empty")));
/*  40 */   public static final fc<amd> i = a("motive", new ep<>(new pc("kebab")));
/*  41 */   public static final fc<aut> j = a("potion", new ep<>(new pc("empty")));
/*  42 */   public static final fc<bod> k = a("dimension_type", new ey<>());
/*  43 */   public static final fc<pc> l = a("custom_stat", new ey<>());
/*  44 */   public static final fc<ayu> m = a("biome", new ey<>());
/*  45 */   public static final fc<ayy<?, ?>> n = a("biome_source_type", new ey<>());
/*  46 */   public static final fc<bjj<?>> o = a("block_entity_type", new ey<>());
/*  47 */   public static final fc<bnb<?, ?>> p = a("chunk_generator_type", new ey<>());
/*  48 */   public static final fc<awe> q = a("enchantment", new ey<>());
/*  49 */   public static final fc<aev<?>> r = a("entity_type", new ey<>());
/*  50 */   public static final fc<ata> s = a("item", new ey<>());
/*  51 */   public static final fc<aej> t = a("mob_effect", new ey<>());
/*  52 */   public static final fc<fl<? extends fk>> u = a("particle_type", new ey<>());
/*  53 */   public static final fc<wi> v = a("sound_event", new ey<>());
/*  54 */   public static final fc<wr<?>> w = a("stats", new ey<>());
/*     */   
/*     */   static <T> fc<T> a(String ☃, fc<T> fc1) {
/*  57 */     f.a(new pc(☃), fc1);
/*     */     
/*  59 */     return fc1;
/*     */   }
/*     */   
/*     */   static void e() {
/*  63 */     f.forEach(☃ -> {
/*     */           if (☃.d()) {
/*     */             e.error("Registry '{}' was empty after loading", f.b(☃));
/*     */             if (j.b) {
/*     */               throw new IllegalStateException("Registry: '" + f.b(☃) + "' is empty, not allowed, fix me!");
/*     */             }
/*     */           } 
/*     */           if (☃ instanceof ep) {
/*     */             pc pc = ☃.b();
/*     */             Validate.notNull(☃.b(pc), "Missing default of DefaultedMappedRegistry: " + pc, new Object[0]);
/*     */           } 
/*     */         });
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
/*     */   default Stream<T> f() {
/* 111 */     return StreamSupport.stream(spliterator(), false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   pc b(T paramT);
/*     */   
/*     */   T a(@Nullable pc parampc);
/*     */   
/*     */   pc b();
/*     */   
/*     */   int a(@Nullable T paramT);
/*     */   
/*     */   @Nullable
/*     */   T a(int paramInt);
/*     */   
/*     */   Iterator<T> iterator();
/*     */   
/*     */   @Nullable
/*     */   T b(@Nullable pc parampc);
/*     */   
/*     */   void a(int paramInt, pc parampc, T paramT);
/*     */   
/*     */   void a(pc parampc, T paramT);
/*     */   
/*     */   Set<pc> c();
/*     */   
/*     */   boolean d();
/*     */   
/*     */   @Nullable
/*     */   T a(Random paramRandom);
/*     */   
/*     */   boolean c(pc parampc);
/*     */ }


/* Location:              F:\dw\server.jar!\fc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */