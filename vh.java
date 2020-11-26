/*     */ import com.google.common.base.Stopwatch;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vh
/*     */   implements vd
/*     */ {
/*  25 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  27 */   private final Map<String, vc> b = Maps.newHashMap();
/*  28 */   private final List<vg> c = Lists.newArrayList();
/*  29 */   private final Set<String> d = Sets.newLinkedHashSet();
/*     */   private final um e;
/*     */   
/*     */   public vh(um ☃) {
/*  33 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ul ☃) {
/*  38 */     for (String str : ☃.a(this.e)) {
/*  39 */       this.d.add(str);
/*  40 */       vc vc = this.b.get(str);
/*  41 */       if (vc == null) {
/*  42 */         vc = new vc(this.e);
/*  43 */         this.b.put(str, vc);
/*     */       } 
/*  45 */       vc.a(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ve a(pc ☃) throws IOException {
/*  56 */     vf vf = this.b.get(☃.b());
/*     */     
/*  58 */     if (vf != null) {
/*  59 */       return vf.a(☃);
/*     */     }
/*     */     
/*  62 */     throw new FileNotFoundException(☃.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ve> b(pc ☃) throws IOException {
/*  67 */     vf vf = this.b.get(☃.b());
/*     */     
/*  69 */     if (vf != null) {
/*  70 */       return vf.b(☃);
/*     */     }
/*     */     
/*  73 */     throw new FileNotFoundException(☃.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<pc> a(String ☃, Predicate<String> predicate) {
/*  78 */     Set<pc> set = Sets.newHashSet();
/*     */     
/*  80 */     for (vc vc : this.b.values()) {
/*  81 */       set.addAll(vc.a(☃, predicate));
/*     */     }
/*     */     
/*  84 */     List<pc> list = Lists.newArrayList(set);
/*  85 */     Collections.sort(list);
/*  86 */     return list;
/*     */   }
/*     */   
/*     */   private void b() {
/*  90 */     this.b.clear();
/*  91 */     this.d.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(List<ul> ☃) {
/*  96 */     b();
/*     */     
/*  98 */     a.info("Reloading ResourceManager: {}", ☃.stream().map(ul::a).collect(Collectors.joining(", ")));
/*     */     
/* 100 */     for (ul ul : ☃) {
/* 101 */       a(ul);
/*     */     }
/*     */     
/* 104 */     if (a.isDebugEnabled()) {
/* 105 */       d();
/*     */     } else {
/* 107 */       c();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(vg ☃) {
/* 113 */     this.c.add(☃);
/*     */     
/* 115 */     if (a.isDebugEnabled()) {
/* 116 */       a.info(b(☃));
/*     */     } else {
/* 118 */       ☃.a(this);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c() {
/* 123 */     for (vg ☃ : this.c) {
/* 124 */       ☃.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   private void d() {
/* 129 */     a.info("Reloading all resources! {} listeners to update.", Integer.valueOf(this.c.size()));
/*     */     
/* 131 */     List<String> ☃ = Lists.newArrayList();
/* 132 */     Stopwatch stopwatch = Stopwatch.createStarted();
/* 133 */     for (vg vg : this.c) {
/* 134 */       ☃.add(b(vg));
/*     */     }
/* 136 */     stopwatch.stop();
/*     */     
/* 138 */     a.info("----");
/* 139 */     a.info("Complete resource reload took {} ms", Long.valueOf(stopwatch.elapsed(TimeUnit.MILLISECONDS)));
/*     */     
/* 141 */     for (String str : ☃) {
/* 142 */       a.info(str);
/*     */     }
/* 144 */     a.info("----");
/*     */   }
/*     */   
/*     */   private String b(vg ☃) {
/* 148 */     Stopwatch stopwatch = Stopwatch.createStarted();
/* 149 */     ☃.a(this);
/* 150 */     stopwatch.stop();
/*     */     
/* 152 */     return "Resource reload for " + ☃.getClass().getSimpleName() + " took " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + " ms";
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\vh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */