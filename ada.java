/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import it.unimi.dsi.fastutil.objects.Object2FloatMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap;
/*     */ import java.io.File;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ThreadFactory;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class ada
/*     */ {
/*  29 */   private static final Logger a = LogManager.getLogger();
/*  30 */   private static final ThreadFactory b = (new ThreadFactoryBuilder()).setDaemon(true).build();
/*     */   
/*     */   private final String c;
/*     */   
/*     */   private final ccc d;
/*     */   private final cck e;
/*     */   private final Thread f;
/*     */   private volatile boolean g = true;
/*     */   private volatile boolean h = false;
/*     */   private volatile float i;
/*     */   private volatile int j;
/*  41 */   private volatile int k = 0;
/*  42 */   private volatile int l = 0;
/*  43 */   private final Object2FloatMap<bod> m = Object2FloatMaps.synchronize((Object2FloatMap)new Object2FloatOpenCustomHashMap(k.g()));
/*     */   
/*  45 */   private volatile ij n = new ir("optimizeWorld.stage.counting", new Object[0]);
/*     */   
/*     */   public ada(String ☃, cce cce1, ccb ccb1) {
/*  48 */     this.c = ccb1.j();
/*  49 */     this.d = cce1.a(☃, (MinecraftServer)null);
/*  50 */     this.d.a(ccb1);
/*  51 */     this.e = new cck(this.d);
/*     */     
/*  53 */     this.f = b.newThread(this::i);
/*  54 */     this.f.setUncaughtExceptionHandler(this::a);
/*  55 */     this.f.start();
/*     */   }
/*     */   
/*     */   private void a(Thread ☃, Throwable throwable) {
/*  59 */     a.error("Error upgrading world", throwable);
/*  60 */     this.g = false;
/*  61 */     this.n = new ir("optimizeWorld.stage.failed", new Object[0]);
/*     */   }
/*     */   
/*     */   public void a() {
/*  65 */     this.g = false;
/*     */     try {
/*  67 */       this.f.join();
/*  68 */     } catch (InterruptedException interruptedException) {}
/*     */   }
/*     */ 
/*     */   
/*     */   private void i() {
/*  73 */     File ☃ = this.d.b();
/*  74 */     acz acz = new acz(☃);
/*     */     
/*  76 */     ImmutableMap.Builder<bod, bnv> builder = ImmutableMap.builder();
/*  77 */     for (bod bod : bod.b()) {
/*  78 */       builder.put(bod, new bnv(bod.a(☃), this.d.i()));
/*     */     }
/*  80 */     ImmutableMap immutableMap = builder.build();
/*  81 */     long l = k.b();
/*     */     
/*  83 */     this.j = 0;
/*  84 */     ImmutableMap.Builder<bod, ListIterator<axm>> builder1 = ImmutableMap.builder();
/*  85 */     for (bod bod : bod.b()) {
/*  86 */       List<axm> list = acz.a(bod);
/*  87 */       builder1.put(bod, list.listIterator());
/*  88 */       this.j += list.size();
/*     */     } 
/*  90 */     ImmutableMap<bod, ListIterator<axm>> immutableMap1 = builder1.build();
/*     */     
/*  92 */     float f = this.j;
/*     */     
/*  94 */     this.n = new ir("optimizeWorld.stage.structures", new Object[0]);
/*     */     
/*  96 */     for (Map.Entry<bod, bnv> entry : (Iterable<Map.Entry<bod, bnv>>)immutableMap.entrySet()) {
/*  97 */       ((bnv)entry.getValue()).a(entry.getKey(), this.e);
/*     */     }
/*  99 */     this.e.a();
/*     */     
/* 101 */     this.n = new ir("optimizeWorld.stage.upgrading", new Object[0]);
/*     */     
/* 103 */     if (f <= 0.0F) {
/* 104 */       for (bod bod : bod.b()) {
/* 105 */         this.m.put(bod, 1.0F / immutableMap.size());
/*     */       }
/*     */     }
/*     */     
/* 109 */     while (this.g) {
/* 110 */       boolean bool = false;
/*     */       
/* 112 */       float f1 = 0.0F;
/* 113 */       for (bod bod : bod.b()) {
/* 114 */         ListIterator<axm> listIterator = (ListIterator<axm>)immutableMap1.get(bod);
/* 115 */         bool |= a((bnv)immutableMap.get(bod), listIterator, bod);
/* 116 */         if (f > 0.0F) {
/* 117 */           float f2 = listIterator.nextIndex() / f;
/* 118 */           this.m.put(bod, f2);
/* 119 */           f1 += f2;
/*     */         } 
/*     */       } 
/*     */       
/* 123 */       this.i = f1;
/*     */       
/* 125 */       if (!bool) {
/* 126 */         this.g = false;
/*     */       }
/*     */     } 
/*     */     
/* 130 */     this.n = new ir("optimizeWorld.stage.finished", new Object[0]);
/*     */     
/* 132 */     l = k.b() - l;
/* 133 */     a.info("World optimizaton finished after {} ms", Long.valueOf(l));
/* 134 */     immutableMap.values().forEach(bnv::b);
/* 135 */     this.e.a();
/* 136 */     this.d.a();
/* 137 */     this.h = true;
/*     */   }
/*     */   
/*     */   private boolean a(bnv ☃, ListIterator<axm> listIterator, bod bod1) {
/* 141 */     if (listIterator.hasNext()) {
/*     */       boolean bool;
/* 143 */       synchronized (☃) {
/* 144 */         bool = ☃.a(listIterator.next(), bod1, this.e);
/*     */       } 
/* 146 */       if (bool) {
/* 147 */         this.k++;
/*     */       } else {
/* 149 */         this.l++;
/*     */       } 
/* 151 */       return true;
/*     */     } 
/* 153 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 157 */     return this.h;
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
/*     */   public int d() {
/* 169 */     return this.j;
/*     */   }
/*     */   
/*     */   public int e() {
/* 173 */     return this.k;
/*     */   }
/*     */   
/*     */   public int f() {
/* 177 */     return this.l;
/*     */   }
/*     */   
/*     */   public ij g() {
/* 181 */     return this.n;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ada.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */