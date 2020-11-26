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
/*     */ public class au
/*     */   implements s<au.b>
/*     */ {
/*  20 */   private static final pc a = new pc("item_durability_changed");
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
/*  57 */     av av = av.a(☃.get("item"));
/*  58 */     ba.d d1 = ba.d.a(☃.get("durability"));
/*  59 */     ba.d d2 = ba.d.a(☃.get("delta"));
/*  60 */     return new b(av, d1, d2);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ate ate1, int i) {
/*  64 */     a a = this.b.get(☃.L());
/*  65 */     if (a != null)
/*  66 */       a.a(ate1, i); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final av a;
/*     */     private final ba.d b;
/*     */     private final ba.d c;
/*     */     
/*     */     public b(av ☃, ba.d d1, ba.d d2) {
/*  76 */       super(au.b());
/*  77 */       this.a = ☃;
/*  78 */       this.b = d1;
/*  79 */       this.c = d2;
/*     */     }
/*     */     
/*     */     public static b a(av ☃, ba.d d1) {
/*  83 */       return new b(☃, d1, ba.d.e);
/*     */     }
/*     */     
/*     */     public boolean a(ate ☃, int i) {
/*  87 */       if (!this.a.a(☃)) {
/*  88 */         return false;
/*     */       }
/*  90 */       if (!this.b.d(☃.h() - i)) {
/*  91 */         return false;
/*     */       }
/*  93 */       if (!this.c.d(☃.g() - i)) {
/*  94 */         return false;
/*     */       }
/*  96 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 101 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 103 */       ☃.add("item", this.a.a());
/* 104 */       ☃.add("durability", this.b.d());
/* 105 */       ☃.add("delta", this.c.d());
/*     */       
/* 107 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 113 */     private final Set<s.a<au.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 116 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 120 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<au.b> ☃) {
/* 124 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<au.b> ☃) {
/* 128 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(ate ☃, int i) {
/* 132 */       List<s.a<au.b>> list = null;
/* 133 */       for (s.a<au.b> a1 : this.b) {
/* 134 */         if (((au.b)a1.a()).a(☃, i)) {
/* 135 */           if (list == null) {
/* 136 */             list = Lists.newArrayList();
/*     */           }
/* 138 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 141 */       if (list != null)
/* 142 */         for (s.a<au.b> a1 : list)
/* 143 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */