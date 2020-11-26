/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class an
/*     */   implements s<an.b>
/*     */ {
/*  20 */   private static final pc a = new pc("entity_hurt_player");
/*     */   
/*  22 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  26 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  31 */     a a2 = this.b.get(☃);
/*  32 */     if (a2 == null) {
/*  33 */       a2 = new a(☃);
/*  34 */       this.b.put(☃, a2);
/*     */     } 
/*  36 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  41 */     a a2 = this.b.get(☃);
/*  42 */     if (a2 != null) {
/*  43 */       a2.b(a1);
/*  44 */       if (a2.a()) {
/*  45 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  52 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  57 */     ag ag = ag.a(☃.get("damage"));
/*  58 */     return new b(ag);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, aea aea1, float f1, float f2, boolean bool) {
/*  62 */     a a = this.b.get(☃.L());
/*  63 */     if (a != null)
/*  64 */       a.a(☃, aea1, f1, f2, bool); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ag a;
/*     */     
/*     */     public b(ag ☃) {
/*  72 */       super(an.b());
/*  73 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static b a(ag.a ☃) {
/*  85 */       return new b(☃.b());
/*     */     }
/*     */     
/*     */     public boolean a(tf ☃, aea aea1, float f1, float f2, boolean bool) {
/*  89 */       if (!this.a.a(☃, aea1, f1, f2, bool)) {
/*  90 */         return false;
/*     */       }
/*  92 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  97 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  99 */       ☃.add("damage", this.a.a());
/*     */       
/* 101 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 107 */     private final Set<s.a<an.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 110 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 114 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<an.b> ☃) {
/* 118 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<an.b> ☃) {
/* 122 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, aea aea1, float f1, float f2, boolean bool) {
/* 126 */       List<s.a<an.b>> list = null;
/* 127 */       for (s.a<an.b> a1 : this.b) {
/* 128 */         if (((an.b)a1.a()).a(☃, aea1, f1, f2, bool)) {
/* 129 */           if (list == null) {
/* 130 */             list = Lists.newArrayList();
/*     */           }
/* 132 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 135 */       if (list != null)
/* 136 */         for (s.a<an.b> a1 : list)
/* 137 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */