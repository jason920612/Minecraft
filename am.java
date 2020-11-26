/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class am
/*     */   implements s<am.b>
/*     */ {
/*  29 */   private static final pc a = new pc("enter_block");
/*     */   
/*  31 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  35 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  40 */     a a2 = this.b.get(☃);
/*  41 */     if (a2 == null) {
/*  42 */       a2 = new a(☃);
/*  43 */       this.b.put(☃, a2);
/*     */     } 
/*  45 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  50 */     a a2 = this.b.get(☃);
/*  51 */     if (a2 != null) {
/*  52 */       a2.b(a1);
/*  53 */       if (a2.a()) {
/*  54 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  61 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  66 */     bcs bcs = null;
/*  67 */     if (☃.has("block")) {
/*  68 */       pc pc1 = new pc(xj.h(☃, "block"));
/*  69 */       if (fc.g.c(pc1)) {
/*  70 */         bcs = fc.g.a(pc1);
/*     */       } else {
/*  72 */         throw new JsonSyntaxException("Unknown block type '" + pc1 + "'");
/*     */       } 
/*     */     } 
/*  75 */     Map<bmm<?>, Object> map = null;
/*  76 */     if (☃.has("state")) {
/*  77 */       if (bcs == null) {
/*  78 */         throw new JsonSyntaxException("Can't define block state without a specific block type");
/*     */       }
/*  80 */       ble<bcs, blc> ble = bcs.o();
/*  81 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)xj.t(☃, "state").entrySet()) {
/*  82 */         bmm<?> bmm = ble.a(entry.getKey());
/*  83 */         if (bmm == null) {
/*  84 */           throw new JsonSyntaxException("Unknown block state property '" + (String)entry.getKey() + "' for block '" + fc.g.b(bcs) + "'");
/*     */         }
/*  86 */         String str = xj.a(entry.getValue(), entry.getKey());
/*  87 */         Optional<?> optional = bmm.b(str);
/*  88 */         if (optional.isPresent()) {
/*  89 */           if (map == null) {
/*  90 */             map = Maps.newHashMap();
/*     */           }
/*  92 */           map.put(bmm, optional.get()); continue;
/*     */         } 
/*  94 */         throw new JsonSyntaxException("Invalid block state value '" + str + "' for property '" + (String)entry.getKey() + "' on block '" + fc.g.b(bcs) + "'");
/*     */       } 
/*     */     } 
/*     */     
/*  98 */     return new b(bcs, map);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, blc blc1) {
/* 102 */     a a = this.b.get(☃.L());
/* 103 */     if (a != null)
/* 104 */       a.a(blc1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final bcs a;
/*     */     private final Map<bmm<?>, Object> b;
/*     */     
/*     */     public b(@Nullable bcs ☃, @Nullable Map<bmm<?>, Object> map) {
/* 113 */       super(am.b());
/* 114 */       this.a = ☃;
/* 115 */       this.b = map;
/*     */     }
/*     */     
/*     */     public static b a(bcs ☃) {
/* 119 */       return new b(☃, null);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 124 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 126 */       if (this.a != null) {
/* 127 */         ☃.addProperty("block", fc.g.b(this.a).toString());
/*     */         
/* 129 */         if (this.b != null && !this.b.isEmpty()) {
/* 130 */           JsonObject jsonObject = new JsonObject();
/* 131 */           for (Map.Entry<bmm<?>, ?> entry : this.b.entrySet()) {
/* 132 */             jsonObject.addProperty(((bmm)entry.getKey()).a(), k.a((bmm<Comparable>)entry.getKey(), entry.getValue()));
/*     */           }
/* 134 */           ☃.add("state", (JsonElement)jsonObject);
/*     */         } 
/*     */       } 
/*     */       
/* 138 */       return (JsonElement)☃;
/*     */     }
/*     */     
/*     */     public boolean a(blc ☃) {
/* 142 */       if (this.a != null && ☃.c() != this.a) {
/* 143 */         return false;
/*     */       }
/* 145 */       if (this.b != null) {
/* 146 */         for (Map.Entry<bmm<?>, Object> entry : this.b.entrySet()) {
/* 147 */           if (☃.c(entry.getKey()) != entry.getValue()) {
/* 148 */             return false;
/*     */           }
/*     */         } 
/*     */       }
/* 152 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 158 */     private final Set<s.a<am.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 161 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 165 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<am.b> ☃) {
/* 169 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<am.b> ☃) {
/* 173 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(blc ☃) {
/* 177 */       List<s.a<am.b>> list = null;
/* 178 */       for (s.a<am.b> a1 : this.b) {
/* 179 */         if (((am.b)a1.a()).a(☃)) {
/* 180 */           if (list == null) {
/* 181 */             list = Lists.newArrayList();
/*     */           }
/* 183 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 186 */       if (list != null)
/* 187 */         for (s.a<am.b> a1 : list)
/* 188 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */