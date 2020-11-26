/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ public class at
/*     */   implements s<at.b>
/*     */ {
/*  25 */   private static final pc a = new pc("inventory_changed");
/*     */   
/*  27 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  31 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  36 */     a a2 = this.b.get(☃);
/*  37 */     if (a2 == null) {
/*  38 */       a2 = new a(☃);
/*  39 */       this.b.put(☃, a2);
/*     */     } 
/*  41 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  46 */     a a2 = this.b.get(☃);
/*  47 */     if (a2 != null) {
/*  48 */       a2.b(a1);
/*  49 */       if (a2.a()) {
/*  50 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  57 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  62 */     JsonObject jsonObject = xj.a(☃, "slots", new JsonObject());
/*  63 */     ba.d d1 = ba.d.a(jsonObject.get("occupied"));
/*  64 */     ba.d d2 = ba.d.a(jsonObject.get("full"));
/*  65 */     ba.d d3 = ba.d.a(jsonObject.get("empty"));
/*  66 */     av[] arrayOfAv = av.b(☃.get("items"));
/*  67 */     return new b(d1, d2, d3, arrayOfAv);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, aof aof1) {
/*  71 */     a a = this.b.get(☃.L());
/*  72 */     if (a != null)
/*  73 */       a.a(aof1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final ba.d a;
/*     */     private final ba.d b;
/*     */     private final ba.d c;
/*     */     private final av[] d;
/*     */     
/*     */     public b(ba.d ☃, ba.d d1, ba.d d2, av[] arrayOfAv) {
/*  84 */       super(at.b());
/*  85 */       this.a = ☃;
/*  86 */       this.b = d1;
/*  87 */       this.c = d2;
/*  88 */       this.d = arrayOfAv;
/*     */     }
/*     */     
/*     */     public static b a(av... ☃) {
/*  92 */       return new b(ba.d.e, ba.d.e, ba.d.e, ☃);
/*     */     }
/*     */     
/*     */     public static b a(axx... ☃) {
/*  96 */       av[] arrayOfAv = new av[☃.length];
/*  97 */       for (int i = 0; i < ☃.length; i++) {
/*  98 */         arrayOfAv[i] = new av(null, ☃[i].h(), ba.d.e, ba.d.e, new al[0], null, bc.a);
/*     */       }
/* 100 */       return a(arrayOfAv);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 105 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 107 */       if (!this.a.c() || !this.b.c() || !this.c.c()) {
/* 108 */         JsonObject jsonObject = new JsonObject();
/* 109 */         jsonObject.add("occupied", this.a.d());
/* 110 */         jsonObject.add("full", this.b.d());
/* 111 */         jsonObject.add("empty", this.c.d());
/* 112 */         ☃.add("slots", (JsonElement)jsonObject);
/*     */       } 
/*     */       
/* 115 */       if (this.d.length > 0) {
/* 116 */         JsonArray jsonArray = new JsonArray();
/* 117 */         for (av av1 : this.d) {
/* 118 */           jsonArray.add(av1.a());
/*     */         }
/* 120 */         ☃.add("items", (JsonElement)jsonArray);
/*     */       } 
/*     */       
/* 123 */       return (JsonElement)☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(aof ☃) {
/* 128 */       int i = 0;
/* 129 */       int j = 0;
/* 130 */       int k = 0;
/* 131 */       List<av> list = Lists.newArrayList((Object[])this.d);
/* 132 */       for (int m = 0; m < ☃.T_(); m++) {
/* 133 */         ate ate = ☃.a(m);
/* 134 */         if (ate.a()) {
/* 135 */           j++;
/*     */         } else {
/* 137 */           k++;
/* 138 */           if (ate.C() >= ate.c()) {
/* 139 */             i++;
/*     */           }
/* 141 */           for (Iterator<av> iterator = list.iterator(); iterator.hasNext(); ) {
/* 142 */             av av1 = iterator.next();
/* 143 */             if (av1.a(ate)) {
/* 144 */               iterator.remove();
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 149 */       if (!this.b.d(i)) {
/* 150 */         return false;
/*     */       }
/* 152 */       if (!this.c.d(j)) {
/* 153 */         return false;
/*     */       }
/* 155 */       if (!this.a.d(k)) {
/* 156 */         return false;
/*     */       }
/* 158 */       if (!list.isEmpty()) {
/* 159 */         return false;
/*     */       }
/* 161 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 167 */     private final Set<s.a<at.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 170 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 174 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<at.b> ☃) {
/* 178 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<at.b> ☃) {
/* 182 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(aof ☃) {
/* 186 */       List<s.a<at.b>> list = null;
/* 187 */       for (s.a<at.b> a1 : this.b) {
/* 188 */         if (((at.b)a1.a()).a(☃)) {
/* 189 */           if (list == null) {
/* 190 */             list = Lists.newArrayList();
/*     */           }
/* 192 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 195 */       if (list != null)
/* 196 */         for (s.a<at.b> a1 : list)
/* 197 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */