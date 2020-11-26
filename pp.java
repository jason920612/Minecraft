/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.CompletionException;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ public class pp
/*     */   implements pt, vg
/*     */ {
/*  31 */   private static final Logger c = LogManager.getLogger();
/*  32 */   private static final pc d = new pc("tick");
/*  33 */   private static final pc e = new pc("load");
/*     */ 
/*     */   
/*  36 */   public static final int a = "functions/".length();
/*  37 */   public static final int b = ".mcfunction".length();
/*     */   
/*     */   private final MinecraftServer f;
/*  40 */   private final Map<pc, br> g = Maps.newHashMap();
/*  41 */   private final ArrayDeque<a> h = new ArrayDeque<>(); private boolean i; private final xa<br> j;
/*     */   public pp(MinecraftServer ☃) {
/*  43 */     this.j = new xa<>(☃ -> (a(☃) != null), this::a, "tags/functions", true, "function");
/*  44 */     this.k = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */     
/*  48 */     this.f = ☃;
/*     */   }
/*     */   private final List<br> k; private boolean l;
/*     */   @Nullable
/*     */   public br a(pc ☃) {
/*  53 */     return this.g.get(☃);
/*     */   }
/*     */   
/*     */   public MinecraftServer a() {
/*  57 */     return this.f;
/*     */   }
/*     */   
/*     */   public int b() {
/*  61 */     return this.f.aO().c("maxCommandChainLength");
/*     */   }
/*     */   
/*     */   public Map<pc, br> c() {
/*  65 */     return this.g;
/*     */   }
/*     */   
/*     */   public CommandDispatcher<bu> d() {
/*  69 */     return this.f.aI().a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/*  74 */     this.f.b.a(d::toString);
/*  75 */     for (br ☃ : this.k) {
/*  76 */       a(☃, f());
/*     */     }
/*  78 */     this.f.b.e();
/*     */     
/*  80 */     if (this.l) {
/*  81 */       this.l = false;
/*  82 */       Collection<br> ☃ = g().b(e).a();
/*  83 */       this.f.b.a(e::toString);
/*  84 */       for (br br : ☃) {
/*  85 */         a(br, f());
/*     */       }
/*  87 */       this.f.b.e();
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(br ☃, bu bu1) {
/*  92 */     int i = b();
/*     */     
/*  94 */     if (this.i) {
/*     */       
/*  96 */       if (this.h.size() < i) {
/*  97 */         this.h.addFirst(new a(this, bu1, new br.d(☃)));
/*     */       }
/*  99 */       return 0;
/*     */     } 
/*     */     
/*     */     try {
/* 103 */       this.i = true;
/* 104 */       int j = 0;
/* 105 */       br.c[] arrayOfC = ☃.b(); int k;
/* 106 */       for (k = arrayOfC.length - 1; k >= 0; k--) {
/* 107 */         this.h.push(new a(this, bu1, arrayOfC[k]));
/*     */       }
/*     */       
/* 110 */       while (!this.h.isEmpty()) {
/*     */         try {
/* 112 */           a a = this.h.removeFirst();
/* 113 */           this.f.b.a(a::toString);
/* 114 */           a.a(this.h, i);
/*     */         } finally {
/* 116 */           this.f.b.e();
/*     */         } 
/* 118 */         j++;
/*     */         
/* 120 */         if (j >= i) {
/* 121 */           k = j; return k;
/*     */         } 
/*     */       } 
/*     */       
/* 125 */       k = j; return k;
/*     */     } finally {
/*     */       
/* 128 */       this.h.clear();
/* 129 */       this.i = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(vf ☃) {
/* 135 */     this.g.clear();
/* 136 */     this.k.clear();
/* 137 */     this.j.b();
/*     */     
/* 139 */     Collection<pc> collection = ☃.a("functions", ☃ -> ☃.endsWith(".mcfunction"));
/* 140 */     List<CompletableFuture<br>> list = Lists.newArrayList();
/*     */     
/* 142 */     for (pc pc1 : collection) {
/* 143 */       String str = pc1.a();
/* 144 */       pc pc2 = new pc(pc1.b(), str.substring(a, str.length() - b));
/* 145 */       list.add(
/* 146 */           CompletableFuture.supplyAsync(() -> a(☃, pc1), vi.a)
/* 147 */           .thenApplyAsync(list -> br.a(☃, this, list))
/* 148 */           .handle((br1, throwable) -> a(br1, throwable, ☃)));
/*     */     } 
/*     */ 
/*     */     
/* 152 */     CompletableFuture.allOf((CompletableFuture<?>[])list.<CompletableFuture>toArray(new CompletableFuture[0])).join();
/*     */     
/* 154 */     if (!this.g.isEmpty()) {
/* 155 */       c.info("Loaded {} custom command functions", Integer.valueOf(this.g.size()));
/*     */     }
/*     */     
/* 158 */     this.j.a(☃);
/* 159 */     this.k.addAll(this.j.b(d).a());
/* 160 */     this.l = true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private br a(br ☃, @Nullable Throwable throwable, pc pc1) {
/* 165 */     if (throwable != null) {
/* 166 */       c.error("Couldn't load function at {}", pc1, throwable);
/* 167 */       return null;
/*     */     } 
/* 169 */     synchronized (this.g) {
/* 170 */       this.g.put(☃.a(), ☃);
/*     */     } 
/* 172 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   private static List<String> a(vf ☃, pc pc1) {
/* 177 */     try (ve ☃ = ☃.a(pc1)) {
/* 178 */       return IOUtils.readLines(ve.b(), StandardCharsets.UTF_8);
/* 179 */     } catch (IOException iOException) {
/* 180 */       throw new CompletionException(iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public bu f() {
/* 185 */     return this.f.aJ().a(2).a();
/*     */   }
/*     */   
/*     */   public xa<br> g() {
/* 189 */     return this.j;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final pp a;
/*     */     private final bu b;
/*     */     private final br.c c;
/*     */     
/*     */     public a(pp ☃, bu bu1, br.c c1) {
/* 198 */       this.a = ☃;
/* 199 */       this.b = bu1;
/* 200 */       this.c = c1;
/*     */     }
/*     */     
/*     */     public void a(ArrayDeque<a> ☃, int i) {
/*     */       try {
/* 205 */         this.c.a(this.a, this.b, ☃, i);
/* 206 */       } catch (Throwable throwable) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 212 */       return this.c.toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\pp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */