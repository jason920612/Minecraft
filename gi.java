/*     */ import com.google.gson.JsonObject;
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
/*     */ public class gi
/*     */ {
/*  21 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final ata b;
/*     */   private final avh c;
/*     */   private final float d;
/*     */   private final int e;
/*  27 */   private final l.a f = l.a.a();
/*     */   private String g;
/*     */   
/*     */   public gi(avh ☃, axx axx1, float f, int i) {
/*  31 */     this.b = axx1.h();
/*  32 */     this.c = ☃;
/*  33 */     this.d = f;
/*  34 */     this.e = i;
/*     */   }
/*     */   
/*     */   public static gi a(avh ☃, axx axx1, float f, int i) {
/*  38 */     return new gi(☃, axx1, f, i);
/*     */   }
/*     */   
/*     */   public gi a(String ☃, t t1) {
/*  42 */     this.f.a(☃, t1);
/*  43 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Consumer<ge> ☃) {
/*  52 */     a(☃, fc.s.b(this.b));
/*     */   }
/*     */   
/*     */   public void a(Consumer<ge> ☃, String str) {
/*  56 */     pc pc = fc.s.b(this.b);
/*  57 */     if ((new pc(str)).equals(pc)) {
/*  58 */       throw new IllegalStateException("Smelting Recipe " + str + " should remove its 'save' argument");
/*     */     }
/*  60 */     a(☃, new pc(str));
/*     */   }
/*     */   
/*     */   public void a(Consumer<ge> ☃, pc pc1) {
/*  64 */     a(pc1);
/*  65 */     this.f
/*  66 */       .a(new pc("minecraft:recipes/root"))
/*  67 */       .a("has_the_recipe", new bg.b(pc1))
/*  68 */       .a(o.a.c(pc1))
/*  69 */       .a(w.OR);
/*  70 */     ☃.accept(new a(pc1, (this.g == null) ? "" : this.g, this.c, this.b, this.d, this.e, this.f, new pc(pc1.b(), "recipes/" + this.b.q().c() + "/" + pc1.a())));
/*     */   }
/*     */   
/*     */   private void a(pc ☃) {
/*  74 */     if (this.f.c().isEmpty())
/*  75 */       throw new IllegalStateException("No way of obtaining recipe " + ☃); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements ge {
/*     */     private final pc a;
/*     */     private final String b;
/*     */     private final avh c;
/*     */     private final ata d;
/*     */     private final float e;
/*     */     private final int f;
/*     */     private final l.a g;
/*     */     private final pc h;
/*     */     
/*     */     public a(pc ☃, String str, avh avh1, ata ata1, float f, int i, l.a a1, pc pc1) {
/*  90 */       this.a = ☃;
/*  91 */       this.b = str;
/*  92 */       this.c = avh1;
/*  93 */       this.d = ata1;
/*  94 */       this.e = f;
/*  95 */       this.f = i;
/*  96 */       this.g = a1;
/*  97 */       this.h = pc1;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject a() {
/* 102 */       JsonObject ☃ = new JsonObject();
/* 103 */       ☃.addProperty("type", "smelting");
/*     */       
/* 105 */       if (!this.b.isEmpty()) {
/* 106 */         ☃.addProperty("group", this.b);
/*     */       }
/*     */       
/* 109 */       ☃.add("ingredient", this.c.c());
/* 110 */       ☃.addProperty("result", fc.s.b(this.d).toString());
/* 111 */       ☃.addProperty("experience", Float.valueOf(this.e));
/* 112 */       ☃.addProperty("cookingtime", Integer.valueOf(this.f));
/*     */       
/* 114 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public pc b() {
/* 119 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonObject c() {
/* 125 */       return this.g.b();
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public pc d() {
/* 131 */       return this.h;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */