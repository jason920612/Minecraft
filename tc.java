/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
/*     */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.function.Consumer;
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
/*     */ public class tc
/*     */   implements bnc
/*     */ {
/*  39 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*  42 */   private final LongSet b = (LongSet)new LongOpenHashSet();
/*     */   
/*     */   private final bmy<?> c;
/*     */   private final bnw d;
/*  46 */   private final Long2ObjectMap<bnj> e = Long2ObjectMaps.synchronize((Long2ObjectMap)new ta(8192));
/*     */   
/*     */   private bnj f;
/*     */   private final tx g;
/*     */   private final acw<axm, bnd, bnr> h;
/*     */   private final td i;
/*     */   private final acv j;
/*     */   
/*     */   public tc(td ☃, bnw bnw1, bmy<?> bmy1, acv acv1) {
/*  55 */     this.i = ☃;
/*  56 */     this.d = bnw1;
/*  57 */     this.c = bmy1;
/*  58 */     this.j = acv1;
/*  59 */     this.g = new tx(2, ☃, bmy1, bnw1, acv1);
/*  60 */     this.h = new acw<>(this.g);
/*     */   }
/*     */   
/*     */   public Collection<bnj> a() {
/*  64 */     return (Collection<bnj>)this.e.values();
/*     */   }
/*     */   
/*     */   public void a(bnj ☃) {
/*  68 */     if (this.i.t.a(☃.b, ☃.c)) {
/*  69 */       this.b.add(axm.a(☃.b, ☃.c));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/*  74 */     for (ObjectIterator<bnj> objectIterator = this.e.values().iterator(); objectIterator.hasNext(); ) { bnj ☃ = objectIterator.next();
/*  75 */       a(☃); }
/*     */   
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/*  80 */     this.b.remove(axm.a(☃, i));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bnj a(int ☃, int i, boolean bool1, boolean bool2) {
/*     */     bnj bnj1;
/*  88 */     synchronized (this.d) {
/*  89 */       if (this.f != null && (this.f.d()).a == ☃ && (this.f.d()).b == i) {
/*  90 */         return this.f;
/*     */       }
/*  92 */       long l = axm.a(☃, i);
/*  93 */       bnj1 = (bnj)this.e.get(l);
/*     */       
/*  95 */       if (bnj1 != null) {
/*  96 */         this.f = bnj1;
/*  97 */         return bnj1;
/*     */       } 
/*     */       
/* 100 */       if (bool1) {
/*     */         try {
/* 102 */           bnj1 = this.d.a(this.i, ☃, i, bnj1 -> {
/*     */                 bnj1.a(this.i.V());
/*     */                 this.e.put(axm.a(☃, i), bnj1);
/*     */               });
/* 106 */         } catch (Exception exception) {
/* 107 */           a.error("Couldn't load chunk", exception);
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 112 */     if (bnj1 != null) {
/* 113 */       this.j.a(bnj1::p);
/* 114 */       return bnj1;
/*     */     } 
/*     */     
/* 117 */     if (bool2) {
/*     */       try {
/* 119 */         this.h.b();
/* 120 */         this.h.a(new axm(☃, i));
/* 121 */         CompletableFuture<bnr> completableFuture = this.h.c();
/* 122 */         return completableFuture.<bnj>thenApply(this::a).join();
/* 123 */       } catch (RuntimeException runtimeException) {
/* 124 */         throw a(☃, i, runtimeException);
/*     */       } 
/*     */     }
/*     */     
/* 128 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public bmx a(int ☃, int i, boolean bool) {
/* 134 */     bmx bmx = a(☃, i, true, false);
/* 135 */     if (bmx != null) {
/* 136 */       return bmx;
/*     */     }
/*     */ 
/*     */     
/* 140 */     return this.g.b(new axm(☃, i), bool);
/*     */   }
/*     */   
/*     */   public CompletableFuture<bnr> a(Iterable<axm> ☃, Consumer<bnj> consumer) {
/* 144 */     this.h.b();
/* 145 */     for (axm axm : ☃) {
/* 146 */       bnj bnj1 = a(axm.a, axm.b, true, false);
/* 147 */       if (bnj1 != null) {
/* 148 */         consumer.accept(bnj1);
/*     */         
/*     */         continue;
/*     */       } 
/* 152 */       this.h.a(axm).thenApply(this::a).thenAccept(consumer);
/*     */     } 
/* 154 */     return this.h.c();
/*     */   }
/*     */   
/*     */   private h a(int ☃, int i, Throwable throwable) {
/* 158 */     b b = b.a(throwable, "Exception generating new chunk");
/* 159 */     c c = b.a("Chunk to be generated");
/*     */     
/* 161 */     c.a("Location", String.format("%d,%d", new Object[] { Integer.valueOf(☃), Integer.valueOf(i) }));
/* 162 */     c.a("Position hash", Long.valueOf(axm.a(☃, i)));
/* 163 */     c.a("Generator", this.c);
/*     */     
/* 165 */     return new h(b);
/*     */   }
/*     */   private bnj a(bmx ☃) {
/*     */     bnj bnj1;
/* 169 */     axm axm = ☃.d();
/* 170 */     int i = axm.a;
/* 171 */     int j = axm.b;
/* 172 */     long l = axm.a(i, j);
/*     */ 
/*     */     
/* 175 */     synchronized (this.e) {
/* 176 */       bnj bnj2 = (bnj)this.e.get(l);
/* 177 */       if (bnj2 != null) {
/* 178 */         return bnj2;
/*     */       }
/*     */       
/* 181 */       if (☃ instanceof bnj) {
/* 182 */         bnj1 = (bnj)☃;
/* 183 */       } else if (☃ instanceof bnr) {
/* 184 */         bnj1 = new bnj(this.i, (bnr)☃, i, j);
/*     */       } else {
/* 186 */         throw new IllegalStateException();
/*     */       } 
/* 188 */       this.e.put(l, bnj1);
/* 189 */       this.f = bnj1;
/*     */     } 
/*     */     
/* 192 */     this.j.a(bnj1::p);
/* 193 */     return bnj1;
/*     */   }
/*     */   
/*     */   private void b(bmx ☃) {
/*     */     try {
/* 198 */       ☃.a(this.i.V());
/* 199 */       this.d.a(this.i, ☃);
/* 200 */     } catch (IOException iOException) {
/* 201 */       a.error("Couldn't save chunk", iOException);
/* 202 */     } catch (aya aya) {
/* 203 */       a.error("Couldn't save chunk; already in use by another instance of Minecraft?", aya);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(boolean ☃) {
/* 210 */     int i = 0;
/* 211 */     this.g.a(() -> true);
/*     */     
/* 213 */     synchronized (this.d) {
/* 214 */       for (ObjectIterator<bnj> objectIterator = this.e.values().iterator(); objectIterator.hasNext(); ) { bnj bnj1 = objectIterator.next();
/* 215 */         if (bnj1.c(☃)) {
/* 216 */           b(bnj1);
/* 217 */           bnj1.a(false);
/* 218 */           if (++i == 24 && !☃) {
/* 219 */             return false;
/*     */           }
/*     */         }  }
/*     */     
/*     */     } 
/*     */     
/* 225 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*     */     try {
/* 231 */       this.h.a();
/* 232 */     } catch (InterruptedException ☃) {
/* 233 */       a.error("Couldn't stop taskManager", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c() {
/* 238 */     synchronized (this.d) {
/* 239 */       this.d.b();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(BooleanSupplier ☃) {
/* 245 */     if (!this.i.b) {
/* 246 */       if (!this.b.isEmpty()) {
/* 247 */         LongIterator<Long> longIterator = this.b.iterator();
/* 248 */         int i = 0;
/* 249 */         while (longIterator.hasNext() && (☃.getAsBoolean() || i < 200 || this.b.size() > 2000)) {
/* 250 */           Long long_ = longIterator.next();
/*     */           
/* 252 */           synchronized (this.d) {
/* 253 */             bnj bnj1 = (bnj)this.e.get(long_);
/* 254 */             if (bnj1 != null) {
/* 255 */               bnj1.q();
/* 256 */               b(bnj1);
/* 257 */               this.e.remove(long_);
/* 258 */               this.f = null;
/* 259 */               i++;
/*     */             } 
/*     */           } 
/* 262 */           longIterator.remove();
/*     */         } 
/*     */       } 
/*     */       
/* 266 */       this.g.a(☃);
/*     */     } 
/*     */     
/* 269 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 273 */     return !this.i.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public String e() {
/* 278 */     return "ServerChunkCache: " + this.e.size() + " Drop: " + this.b.size();
/*     */   }
/*     */   
/*     */   public List<ayu.e> a(afc ☃, el el1) {
/* 282 */     return this.c.a(☃, el1);
/*     */   }
/*     */   
/*     */   public int a(axy ☃, boolean bool1, boolean bool2) {
/* 286 */     return this.c.a(☃, bool1, bool2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public el a(axy ☃, String str, el el1, int i, boolean bool) {
/* 291 */     return this.c.a(☃, str, el1, i, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmy<?> f() {
/* 296 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 301 */     return this.e.size();
/*     */   }
/*     */   
/*     */   public boolean b(int ☃, int i) {
/* 305 */     return this.e.containsKey(axm.a(☃, i));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\tc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */