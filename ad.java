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
/*     */ public class ad
/*     */   implements s<ad.b>
/*     */ {
/*  20 */   private static final pc a = new pc("construct_beacon");
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
/*  57 */     ba.d d = ba.d.a(☃.get("level"));
/*  58 */     return new b(d);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, bjg bjg1) {
/*  62 */     a a = this.b.get(☃.L());
/*  63 */     if (a != null)
/*  64 */       a.a(bjg1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ba.d a;
/*     */     
/*     */     public b(ba.d ☃) {
/*  72 */       super(ad.b());
/*  73 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static b a(ba.d ☃) {
/*  81 */       return new b(☃);
/*     */     }
/*     */     
/*     */     public boolean a(bjg ☃) {
/*  85 */       return this.a.d(☃.s());
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  90 */       JsonObject ☃ = new JsonObject();
/*     */       
/*  92 */       ☃.add("level", this.a.d());
/*     */       
/*  94 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 100 */     private final Set<s.a<ad.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 103 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 107 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<ad.b> ☃) {
/* 111 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<ad.b> ☃) {
/* 115 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(bjg ☃) {
/* 119 */       List<s.a<ad.b>> list = null;
/* 120 */       for (s.a<ad.b> a1 : this.b) {
/* 121 */         if (((ad.b)a1.a()).a(☃)) {
/* 122 */           if (list == null) {
/* 123 */             list = Lists.newArrayList();
/*     */           }
/* 125 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 128 */       if (list != null)
/* 129 */         for (s.a<ad.b> a1 : list)
/* 130 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */