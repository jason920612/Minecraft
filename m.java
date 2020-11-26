/*     */ import com.google.common.base.Function;
/*     */ import com.google.common.base.Functions;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class m
/*     */ {
/*  18 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  20 */   private final Map<pc, l> b = Maps.newHashMap();
/*  21 */   private final Set<l> c = Sets.newLinkedHashSet();
/*  22 */   private final Set<l> d = Sets.newLinkedHashSet();
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
/*     */   private a e;
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
/*     */   public void a(Map<pc, l.a> ☃) {
/*  57 */     Function function = Functions.forMap(this.b, null);
/*     */     
/*  59 */     while (!☃.isEmpty()) {
/*  60 */       boolean bool = false; Iterator<Map.Entry<pc, l.a>> iterator;
/*  61 */       for (iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) {
/*  62 */         Map.Entry<pc, l.a> entry = iterator.next();
/*  63 */         pc pc = entry.getKey();
/*  64 */         l.a a1 = entry.getValue();
/*  65 */         if (a1.a((Function<pc, l>)function)) {
/*  66 */           l l = a1.b(pc);
/*  67 */           this.b.put(pc, l);
/*  68 */           bool = true;
/*  69 */           iterator.remove();
/*     */           
/*  71 */           if (l.b() == null) {
/*  72 */             this.c.add(l);
/*  73 */             if (this.e != null)
/*  74 */               this.e.a(l); 
/*     */             continue;
/*     */           } 
/*  77 */           this.d.add(l);
/*  78 */           if (this.e != null) {
/*  79 */             this.e.c(l);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/*  84 */       if (!bool) {
/*  85 */         for (iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<pc, l.a> entry = iterator.next();
/*  86 */           a.error("Couldn't load advancement {}: {}", entry.getKey(), entry.getValue()); }
/*     */ 
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  92 */     a.info("Loaded {} advancements", Integer.valueOf(this.b.size()));
/*     */   }
/*     */   
/*     */   public void a() {
/*  96 */     this.b.clear();
/*  97 */     this.c.clear();
/*  98 */     this.d.clear();
/*  99 */     if (this.e != null) {
/* 100 */       this.e.a();
/*     */     }
/*     */   }
/*     */   
/*     */   public Iterable<l> b() {
/* 105 */     return this.c;
/*     */   }
/*     */   
/*     */   public Collection<l> c() {
/* 109 */     return this.b.values();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public l a(pc ☃) {
/* 114 */     return this.b.get(☃);
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void a(l param1l);
/*     */     
/*     */     void c(l param1l);
/*     */     
/*     */     void a();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */