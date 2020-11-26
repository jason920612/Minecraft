/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.Collection;
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
/*     */ 
/*     */ 
/*     */ public class ar
/*     */   implements s<ar.b>
/*     */ {
/*  23 */   private static final pc a = new pc("fishing_rod_hooked");
/*     */   
/*  25 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  29 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  34 */     a a2 = this.b.get(☃);
/*  35 */     if (a2 == null) {
/*  36 */       a2 = new a(☃);
/*  37 */       this.b.put(☃, a2);
/*     */     } 
/*  39 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  44 */     a a2 = this.b.get(☃);
/*  45 */     if (a2 != null) {
/*  46 */       a2.b(a1);
/*  47 */       if (a2.a()) {
/*  48 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  55 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  60 */     av av1 = av.a(☃.get("rod"));
/*  61 */     ao ao = ao.a(☃.get("entity"));
/*  62 */     av av2 = av.a(☃.get("item"));
/*  63 */     return new b(av1, ao, av2);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, ate ate1, amg amg1, Collection<ate> collection) {
/*  67 */     a a = this.b.get(☃.L());
/*  68 */     if (a != null)
/*  69 */       a.a(☃, ate1, amg1, collection); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final av a;
/*     */     private final ao b;
/*     */     private final av c;
/*     */     
/*     */     public b(av ☃, ao ao1, av av1) {
/*  79 */       super(ar.b());
/*  80 */       this.a = ☃;
/*  81 */       this.b = ao1;
/*  82 */       this.c = av1;
/*     */     }
/*     */     
/*     */     public static b a(av ☃, ao ao1, av av1) {
/*  86 */       return new b(☃, ao1, av1);
/*     */     }
/*     */     
/*     */     public boolean a(tf ☃, ate ate1, amg amg1, Collection<ate> collection) {
/*  90 */       if (!this.a.a(ate1)) {
/*  91 */         return false;
/*     */       }
/*  93 */       if (!this.b.a(☃, amg1.a)) {
/*  94 */         return false;
/*     */       }
/*  96 */       if (this.c != av.a) {
/*  97 */         boolean bool = false;
/*  98 */         if (amg1.a instanceof amm) {
/*  99 */           amm amm = (amm)amg1.a;
/* 100 */           if (this.c.a(amm.i())) {
/* 101 */             bool = true;
/*     */           }
/*     */         } 
/* 104 */         for (ate ate2 : collection) {
/* 105 */           if (this.c.a(ate2)) {
/* 106 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 110 */         if (!bool) {
/* 111 */           return false;
/*     */         }
/*     */       } 
/* 114 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 119 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 121 */       ☃.add("rod", this.a.a());
/* 122 */       ☃.add("entity", this.b.a());
/* 123 */       ☃.add("item", this.c.a());
/*     */       
/* 125 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 131 */     private final Set<s.a<ar.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 134 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 138 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<ar.b> ☃) {
/* 142 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<ar.b> ☃) {
/* 146 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, ate ate1, amg amg1, Collection<ate> collection) {
/* 150 */       List<s.a<ar.b>> list = null;
/* 151 */       for (s.a<ar.b> a1 : this.b) {
/* 152 */         if (((ar.b)a1.a()).a(☃, ate1, amg1, collection)) {
/* 153 */           if (list == null) {
/* 154 */             list = Lists.newArrayList();
/*     */           }
/* 156 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 159 */       if (list != null)
/* 160 */         for (s.a<ar.b> a1 : list)
/* 161 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */