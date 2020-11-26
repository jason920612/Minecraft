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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class be
/*     */   implements s<be.b>
/*     */ {
/*  32 */   private static final pc a = new pc("placed_block");
/*     */   
/*  34 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  38 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  43 */     a a2 = this.b.get(☃);
/*  44 */     if (a2 == null) {
/*  45 */       a2 = new a(☃);
/*  46 */       this.b.put(☃, a2);
/*     */     } 
/*  48 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  53 */     a a2 = this.b.get(☃);
/*  54 */     if (a2 != null) {
/*  55 */       a2.b(a1);
/*  56 */       if (a2.a()) {
/*  57 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  64 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  69 */     bcs bcs = null;
/*  70 */     if (☃.has("block")) {
/*  71 */       pc pc1 = new pc(xj.h(☃, "block"));
/*  72 */       if (fc.g.c(pc1)) {
/*  73 */         bcs = fc.g.a(pc1);
/*     */       } else {
/*  75 */         throw new JsonSyntaxException("Unknown block type '" + pc1 + "'");
/*     */       } 
/*     */     } 
/*  78 */     Map<bmm<?>, Object> map = null;
/*  79 */     if (☃.has("state")) {
/*  80 */       if (bcs == null) {
/*  81 */         throw new JsonSyntaxException("Can't define block state without a specific block type");
/*     */       }
/*  83 */       ble<bcs, blc> ble = bcs.o();
/*  84 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)xj.t(☃, "state").entrySet()) {
/*  85 */         bmm<?> bmm = ble.a(entry.getKey());
/*  86 */         if (bmm == null) {
/*  87 */           throw new JsonSyntaxException("Unknown block state property '" + (String)entry.getKey() + "' for block '" + fc.g.b(bcs) + "'");
/*     */         }
/*  89 */         String str = xj.a(entry.getValue(), entry.getKey());
/*  90 */         Optional<?> optional = bmm.b(str);
/*  91 */         if (optional.isPresent()) {
/*  92 */           if (map == null) {
/*  93 */             map = Maps.newHashMap();
/*     */           }
/*  95 */           map.put(bmm, optional.get()); continue;
/*     */         } 
/*  97 */         throw new JsonSyntaxException("Invalid block state value '" + str + "' for property '" + (String)entry.getKey() + "' on block '" + fc.g.b(bcs) + "'");
/*     */       } 
/*     */     } 
/*     */     
/* 101 */     ay ay = ay.a(☃.get("location"));
/* 102 */     av av = av.a(☃.get("item"));
/*     */     
/* 104 */     return new b(bcs, map, ay, av);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, el el1, ate ate1) {
/* 108 */     blc blc = ☃.m.a_(el1);
/* 109 */     a a = this.b.get(☃.L());
/* 110 */     if (a != null)
/* 111 */       a.a(blc, el1, ☃.s(), ate1); 
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends y {
/*     */     private final bcs a;
/*     */     private final Map<bmm<?>, Object> b;
/*     */     private final ay c;
/*     */     private final av d;
/*     */     
/*     */     public b(@Nullable bcs ☃, @Nullable Map<bmm<?>, Object> map, ay ay1, av av1) {
/* 122 */       super(be.b());
/* 123 */       this.a = ☃;
/* 124 */       this.b = map;
/* 125 */       this.c = ay1;
/* 126 */       this.d = av1;
/*     */     }
/*     */     
/*     */     public static b a(bcs ☃) {
/* 130 */       return new b(☃, null, ay.a, av.a);
/*     */     }
/*     */     
/*     */     public boolean a(blc ☃, el el1, td td1, ate ate1) {
/* 134 */       if (this.a != null && ☃.c() != this.a) {
/* 135 */         return false;
/*     */       }
/* 137 */       if (this.b != null) {
/* 138 */         for (Map.Entry<bmm<?>, Object> entry : this.b.entrySet()) {
/* 139 */           if (☃.c(entry.getKey()) != entry.getValue()) {
/* 140 */             return false;
/*     */           }
/*     */         } 
/*     */       }
/* 144 */       if (!this.c.a(td1, el1.o(), el1.p(), el1.q())) {
/* 145 */         return false;
/*     */       }
/* 147 */       if (!this.d.a(ate1)) {
/* 148 */         return false;
/*     */       }
/* 150 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 155 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 157 */       if (this.a != null) {
/* 158 */         ☃.addProperty("block", fc.g.b(this.a).toString());
/*     */       }
/*     */       
/* 161 */       if (this.b != null) {
/* 162 */         JsonObject jsonObject = new JsonObject();
/*     */         
/* 164 */         for (Map.Entry<bmm<?>, Object> entry : this.b.entrySet()) {
/* 165 */           jsonObject.addProperty(((bmm)entry.getKey()).a(), k.a((bmm<Comparable>)entry.getKey(), entry.getValue()));
/*     */         }
/*     */         
/* 168 */         ☃.add("state", (JsonElement)jsonObject);
/*     */       } 
/*     */       
/* 171 */       ☃.add("location", this.c.a());
/* 172 */       ☃.add("item", this.d.a());
/*     */       
/* 174 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/* 180 */     private final Set<s.a<be.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/* 183 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 187 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<be.b> ☃) {
/* 191 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<be.b> ☃) {
/* 195 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(blc ☃, el el1, td td1, ate ate1) {
/* 199 */       List<s.a<be.b>> list = null;
/* 200 */       for (s.a<be.b> a1 : this.b) {
/* 201 */         if (((be.b)a1.a()).a(☃, el1, td1, ate1)) {
/* 202 */           if (list == null) {
/* 203 */             list = Lists.newArrayList();
/*     */           }
/* 205 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 208 */       if (list != null)
/* 209 */         for (s.a<be.b> a1 : list)
/* 210 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\be.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */