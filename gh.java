/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
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
/*     */ public class gh
/*     */ {
/*  25 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final ata b;
/*     */   private final int c;
/*  29 */   private final List<avh> d = Lists.newArrayList();
/*  30 */   private final l.a e = l.a.a();
/*     */   private String f;
/*     */   
/*     */   public gh(axx ☃, int i) {
/*  34 */     this.b = ☃.h();
/*  35 */     this.c = i;
/*     */   }
/*     */   
/*     */   public static gh a(axx ☃) {
/*  39 */     return new gh(☃, 1);
/*     */   }
/*     */   
/*     */   public static gh a(axx ☃, int i) {
/*  43 */     return new gh(☃, i);
/*     */   }
/*     */   
/*     */   public gh a(wz<ata> ☃) {
/*  47 */     return a(avh.a(☃));
/*     */   }
/*     */   
/*     */   public gh b(axx ☃) {
/*  51 */     return b(☃, 1);
/*     */   }
/*     */   
/*     */   public gh b(axx ☃, int i) {
/*  55 */     for (int j = 0; j < i; j++) {
/*  56 */       a(avh.a(new axx[] { ☃ }));
/*     */     } 
/*  58 */     return this;
/*     */   }
/*     */   
/*     */   public gh a(avh ☃) {
/*  62 */     return a(☃, 1);
/*     */   }
/*     */   
/*     */   public gh a(avh ☃, int i) {
/*  66 */     for (int j = 0; j < i; j++) {
/*  67 */       this.d.add(☃);
/*     */     }
/*  69 */     return this;
/*     */   }
/*     */   
/*     */   public gh a(String ☃, t t1) {
/*  73 */     this.e.a(☃, t1);
/*  74 */     return this;
/*     */   }
/*     */   
/*     */   public gh a(String ☃) {
/*  78 */     this.f = ☃;
/*  79 */     return this;
/*     */   }
/*     */   
/*     */   public void a(Consumer<ge> ☃) {
/*  83 */     a(☃, fc.s.b(this.b));
/*     */   }
/*     */   
/*     */   public void a(Consumer<ge> ☃, String str) {
/*  87 */     pc pc = fc.s.b(this.b);
/*  88 */     if ((new pc(str)).equals(pc)) {
/*  89 */       throw new IllegalStateException("Shapeless Recipe " + str + " should remove its 'save' argument");
/*     */     }
/*  91 */     a(☃, new pc(str));
/*     */   }
/*     */   
/*     */   public void a(Consumer<ge> ☃, pc pc1) {
/*  95 */     a(pc1);
/*  96 */     this.e
/*  97 */       .a(new pc("minecraft:recipes/root"))
/*  98 */       .a("has_the_recipe", new bg.b(pc1))
/*  99 */       .a(o.a.c(pc1))
/* 100 */       .a(w.OR);
/* 101 */     ☃.accept(new a(pc1, this.b, this.c, (this.f == null) ? "" : this.f, this.d, this.e, new pc(pc1.b(), "recipes/" + this.b.q().c() + "/" + pc1.a())));
/*     */   }
/*     */   
/*     */   private void a(pc ☃) {
/* 105 */     if (this.e.c().isEmpty())
/* 106 */       throw new IllegalStateException("No way of obtaining recipe " + ☃); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements ge {
/*     */     private final pc a;
/*     */     private final ata b;
/*     */     private final int c;
/*     */     private final String d;
/*     */     private final List<avh> e;
/*     */     private final l.a f;
/*     */     private final pc g;
/*     */     
/*     */     public a(pc ☃, ata ata1, int i, String str, List<avh> list, l.a a1, pc pc1) {
/* 120 */       this.a = ☃;
/* 121 */       this.b = ata1;
/* 122 */       this.c = i;
/* 123 */       this.d = str;
/* 124 */       this.e = list;
/* 125 */       this.f = a1;
/* 126 */       this.g = pc1;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject a() {
/* 131 */       JsonObject ☃ = new JsonObject();
/* 132 */       ☃.addProperty("type", "crafting_shapeless");
/*     */       
/* 134 */       if (!this.d.isEmpty()) {
/* 135 */         ☃.addProperty("group", this.d);
/*     */       }
/*     */       
/* 138 */       JsonArray jsonArray = new JsonArray();
/* 139 */       for (avh avh : this.e) {
/* 140 */         jsonArray.add(avh.c());
/*     */       }
/* 142 */       ☃.add("ingredients", (JsonElement)jsonArray);
/*     */       
/* 144 */       JsonObject jsonObject1 = new JsonObject();
/* 145 */       jsonObject1.addProperty("item", fc.s.b(this.b).toString());
/* 146 */       if (this.c > 1) {
/* 147 */         jsonObject1.addProperty("count", Integer.valueOf(this.c));
/*     */       }
/* 149 */       ☃.add("result", (JsonElement)jsonObject1);
/*     */       
/* 151 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public pc b() {
/* 156 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonObject c() {
/* 162 */       return this.f.b();
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public pc d() {
/* 168 */       return this.g;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */