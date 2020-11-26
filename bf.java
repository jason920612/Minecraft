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
/*     */ 
/*     */ public class bf
/*     */   implements s<bf.b>
/*     */ {
/*  21 */   private static final pc a = new pc("player_hurt_entity");
/*     */   
/*  23 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  27 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  32 */     a a2 = this.b.get(☃);
/*  33 */     if (a2 == null) {
/*  34 */       a2 = new a(☃);
/*  35 */       this.b.put(☃, a2);
/*     */     } 
/*  37 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  42 */     a a2 = this.b.get(☃);
/*  43 */     if (a2 != null) {
/*  44 */       a2.b(a1);
/*  45 */       if (a2.a()) {
/*  46 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  53 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  58 */     ag ag = ag.a(☃.get("damage"));
/*  59 */     ao ao = ao.a(☃.get("entity"));
/*  60 */     return new b(ag, ao);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, aer aer1, aea aea1, float f1, float f2, boolean bool) {
/*  64 */     a a = this.b.get(☃.L());
/*  65 */     if (a != null)
/*  66 */       a.a(☃, aer1, aea1, f1, f2, bool); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ag a;
/*     */     private final ao b;
/*     */     
/*     */     public b(ag ☃, ao ao1) {
/*  75 */       super(bf.b());
/*  76 */       this.a = ☃;
/*  77 */       this.b = ao1;
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
/*  89 */       return new b(☃.b(), ao.a);
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(tf ☃, aer aer1, aea aea1, float f1, float f2, boolean bool) {
/* 105 */       if (!this.a.a(☃, aea1, f1, f2, bool)) {
/* 106 */         return false;
/*     */       }
/* 108 */       if (!this.b.a(☃, aer1)) {
/* 109 */         return false;
/*     */       }
/* 111 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 116 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 118 */       ☃.add("damage", this.a.a());
/* 119 */       ☃.add("entity", this.b.a());
/*     */       
/* 121 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 127 */     private final Set<s.a<bf.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 130 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 134 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<bf.b> ☃) {
/* 138 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<bf.b> ☃) {
/* 142 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, aer aer1, aea aea1, float f1, float f2, boolean bool) {
/* 146 */       List<s.a<bf.b>> list = null;
/* 147 */       for (s.a<bf.b> a1 : this.b) {
/* 148 */         if (((bf.b)a1.a()).a(☃, aer1, aea1, f1, f2, bool)) {
/* 149 */           if (list == null) {
/* 150 */             list = Lists.newArrayList();
/*     */           }
/* 152 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 155 */       if (list != null)
/* 156 */         for (s.a<bf.b> a1 : list)
/* 157 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */