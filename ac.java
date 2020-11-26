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
/*     */ public class ac
/*     */   implements s<ac.b>
/*     */ {
/*  21 */   private static final pc a = new pc("channeled_lightning");
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
/*  58 */     ao[] arrayOfAo = ao.b(☃.get("victims"));
/*  59 */     return new b(arrayOfAo);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, Collection<? extends aer> collection) {
/*  63 */     a a = this.b.get(☃.L());
/*  64 */     if (a != null)
/*  65 */       a.a(☃, collection); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ao[] a;
/*     */     
/*     */     public b(ao[] ☃) {
/*  73 */       super(ac.b());
/*  74 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public static b a(ao... ☃) {
/*  78 */       return new b(☃);
/*     */     }
/*     */     
/*     */     public boolean a(tf ☃, Collection<? extends aer> collection) {
/*  82 */       for (ao ao1 : this.a) {
/*  83 */         boolean bool = false;
/*  84 */         for (aer aer : collection) {
/*  85 */           if (ao1.a(☃, aer)) {
/*  86 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/*  90 */         if (!bool) {
/*  91 */           return false;
/*     */         }
/*     */       } 
/*  94 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  99 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 101 */       ☃.add("victims", ao.a(this.a));
/*     */       
/* 103 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 109 */     private final Set<s.a<ac.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 112 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 116 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<ac.b> ☃) {
/* 120 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<ac.b> ☃) {
/* 124 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(tf ☃, Collection<? extends aer> collection) {
/* 128 */       List<s.a<ac.b>> list = null;
/* 129 */       for (s.a<ac.b> a1 : this.b) {
/* 130 */         if (((ac.b)a1.a()).a(☃, collection)) {
/* 131 */           if (list == null) {
/* 132 */             list = Lists.newArrayList();
/*     */           }
/* 134 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 137 */       if (list != null)
/* 138 */         for (s.a<ac.b> a1 : list)
/* 139 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */