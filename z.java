/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class z
/*     */   implements s<z.b>
/*     */ {
/*  22 */   private static final pc a = new pc("bred_animals");
/*     */   
/*  24 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  28 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  33 */     a a2 = this.b.get(☃);
/*  34 */     if (a2 == null) {
/*  35 */       a2 = new a(☃);
/*  36 */       this.b.put(☃, a2);
/*     */     } 
/*  38 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  43 */     a a2 = this.b.get(☃);
/*  44 */     if (a2 != null) {
/*  45 */       a2.b(a1);
/*  46 */       if (a2.a()) {
/*  47 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  54 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  59 */     ao ao1 = ao.a(☃.get("parent"));
/*  60 */     ao ao2 = ao.a(☃.get("partner"));
/*  61 */     ao ao3 = ao.a(☃.get("child"));
/*  62 */     return new b(ao1, ao2, ao3);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ajq ajq1, ajq ajq2, @Nullable aeo aeo1) {
/*  66 */     a a = this.b.get(☃.L());
/*  67 */     if (a != null)
/*  68 */       a.a(☃, ajq1, ajq2, aeo1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ao a;
/*     */     private final ao b;
/*     */     private final ao c;
/*     */     
/*     */     public b(ao ☃, ao ao1, ao ao2) {
/*  78 */       super(z.b());
/*  79 */       this.a = ☃;
/*  80 */       this.b = ao1;
/*  81 */       this.c = ao2;
/*     */     }
/*     */     
/*     */     public static b c() {
/*  85 */       return new b(ao.a, ao.a, ao.a);
/*     */     }
/*     */     
/*     */     public static b a(ao.a ☃) {
/*  89 */       return new b(☃.b(), ao.a, ao.a);
/*     */     }
/*     */     
/*     */     public boolean a(tf ☃, ajq ajq1, ajq ajq2, @Nullable aeo aeo1) {
/*  93 */       if (!this.c.a(☃, aeo1)) {
/*  94 */         return false;
/*     */       }
/*     */       
/*  97 */       return ((this.a.a(☃, ajq1) && this.b.a(☃, ajq2)) || (this.a.a(☃, ajq2) && this.b.a(☃, ajq1)));
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 102 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 104 */       ☃.add("parent", this.a.a());
/* 105 */       ☃.add("partner", this.b.a());
/* 106 */       ☃.add("child", this.c.a());
/*     */       
/* 108 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 114 */     private final Set<s.a<z.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 117 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 121 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<z.b> ☃) {
/* 125 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<z.b> ☃) {
/* 129 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, ajq ajq1, ajq ajq2, @Nullable aeo aeo1) {
/* 133 */       List<s.a<z.b>> list = null;
/* 134 */       for (s.a<z.b> a1 : this.b) {
/* 135 */         if (((z.b)a1.a()).a(☃, ajq1, ajq2, aeo1)) {
/* 136 */           if (list == null) {
/* 137 */             list = Lists.newArrayList();
/*     */           }
/* 139 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 142 */       if (list != null)
/* 143 */         for (s.a<z.b> a1 : list)
/* 144 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */