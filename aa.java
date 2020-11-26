/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
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
/*     */ 
/*     */ public class aa
/*     */   implements s<aa.b>
/*     */ {
/*  24 */   private static final pc a = new pc("brewed_potion");
/*     */   
/*  26 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  30 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  35 */     a a2 = this.b.get(☃);
/*  36 */     if (a2 == null) {
/*  37 */       a2 = new a(☃);
/*  38 */       this.b.put(☃, a2);
/*     */     } 
/*  40 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  45 */     a a2 = this.b.get(☃);
/*  46 */     if (a2 != null) {
/*  47 */       a2.b(a1);
/*  48 */       if (a2.a()) {
/*  49 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  56 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  61 */     aut aut = null;
/*  62 */     if (☃.has("potion")) {
/*  63 */       pc pc1 = new pc(xj.h(☃, "potion"));
/*  64 */       if (!fc.j.c(pc1)) {
/*  65 */         throw new JsonSyntaxException("Unknown potion '" + pc1 + "'");
/*     */       }
/*  67 */       aut = fc.j.a(pc1);
/*     */     } 
/*  69 */     return new b(aut);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, aut aut1) {
/*  73 */     a a = this.b.get(☃.L());
/*  74 */     if (a != null)
/*  75 */       a.a(aut1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final aut a;
/*     */     
/*     */     public b(@Nullable aut ☃) {
/*  83 */       super(aa.b());
/*  84 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public static b c() {
/*  88 */       return new b(null);
/*     */     }
/*     */     
/*     */     public boolean a(aut ☃) {
/*  92 */       if (this.a != null && this.a != ☃) {
/*  93 */         return false;
/*     */       }
/*  95 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 100 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 102 */       if (this.a != null) {
/* 103 */         ☃.addProperty("potion", fc.j.b(this.a).toString());
/*     */       }
/*     */       
/* 106 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 112 */     private final Set<s.a<aa.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 115 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 119 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<aa.b> ☃) {
/* 123 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<aa.b> ☃) {
/* 127 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(aut ☃) {
/* 131 */       List<s.a<aa.b>> list = null;
/* 132 */       for (s.a<aa.b> a1 : this.b) {
/* 133 */         if (((aa.b)a1.a()).a(☃)) {
/* 134 */           if (list == null) {
/* 135 */             list = Lists.newArrayList();
/*     */           }
/* 137 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 140 */       if (list != null)
/* 141 */         for (s.a<aa.b> a1 : list)
/* 142 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */