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
/*     */ public class ab
/*     */   implements s<ab.b>
/*     */ {
/*  22 */   private static final pc a = new pc("changed_dimension");
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
/*  59 */     bod bod1 = ☃.has("from") ? bod.a(new pc(xj.h(☃, "from"))) : null;
/*  60 */     bod bod2 = ☃.has("to") ? bod.a(new pc(xj.h(☃, "to"))) : null;
/*  61 */     return new b(bod1, bod2);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, bod bod1, bod bod2) {
/*  65 */     a a = this.b.get(☃.L());
/*  66 */     if (a != null)
/*  67 */       a.a(bod1, bod2); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     @Nullable
/*     */     private final bod a;
/*     */     @Nullable
/*     */     private final bod b;
/*     */     
/*     */     public b(@Nullable bod ☃, @Nullable bod bod1) {
/*  78 */       super(ab.b());
/*  79 */       this.a = ☃;
/*  80 */       this.b = bod1;
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
/*     */     public static b a(bod ☃) {
/*  92 */       return new b(null, ☃);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean b(bod ☃, bod bod1) {
/* 100 */       if (this.a != null && this.a != ☃) {
/* 101 */         return false;
/*     */       }
/* 103 */       if (this.b != null && this.b != bod1) {
/* 104 */         return false;
/*     */       }
/* 106 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 111 */       JsonObject ☃ = new JsonObject();
/* 112 */       if (this.a != null) {
/* 113 */         ☃.addProperty("from", bod.a(this.a).toString());
/*     */       }
/* 115 */       if (this.b != null) {
/* 116 */         ☃.addProperty("to", bod.a(this.b).toString());
/*     */       }
/* 118 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 124 */     private final Set<s.a<ab.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 127 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 131 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<ab.b> ☃) {
/* 135 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<ab.b> ☃) {
/* 139 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(bod ☃, bod bod1) {
/* 143 */       List<s.a<ab.b>> list = null;
/* 144 */       for (s.a<ab.b> a1 : this.b) {
/* 145 */         if (((ab.b)a1.a()).b(☃, bod1)) {
/* 146 */           if (list == null) {
/* 147 */             list = Lists.newArrayList();
/*     */           }
/* 149 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 152 */       if (list != null)
/* 153 */         for (s.a<ab.b> a1 : list)
/* 154 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */