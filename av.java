/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class av
/*     */ {
/*  29 */   public static final av a = new av();
/*     */   
/*     */   @Nullable
/*     */   private final wz<ata> b;
/*     */   @Nullable
/*     */   private final ata c;
/*     */   private final ba.d d;
/*     */   private final ba.d e;
/*     */   private final al[] f;
/*     */   @Nullable
/*     */   private final aut g;
/*     */   private final bc h;
/*     */   
/*     */   public av() {
/*  43 */     this.b = null;
/*  44 */     this.c = null;
/*  45 */     this.g = null;
/*  46 */     this.d = ba.d.e;
/*  47 */     this.e = ba.d.e;
/*  48 */     this.f = new al[0];
/*  49 */     this.h = bc.a;
/*     */   }
/*     */   
/*     */   public av(@Nullable wz<ata> ☃, @Nullable ata ata1, ba.d d1, ba.d d2, al[] arrayOfAl, @Nullable aut aut1, bc bc1) {
/*  53 */     this.b = ☃;
/*  54 */     this.c = ata1;
/*  55 */     this.d = d1;
/*  56 */     this.e = d2;
/*  57 */     this.f = arrayOfAl;
/*  58 */     this.g = aut1;
/*  59 */     this.h = bc1;
/*     */   }
/*     */   
/*     */   public boolean a(ate ☃) {
/*  63 */     if (this.b != null && !this.b.a(☃.b())) {
/*  64 */       return false;
/*     */     }
/*  66 */     if (this.c != null && ☃.b() != this.c) {
/*  67 */       return false;
/*     */     }
/*  69 */     if (!this.d.d(☃.C())) {
/*  70 */       return false;
/*     */     }
/*  72 */     if (!this.e.c() && !☃.e()) {
/*  73 */       return false;
/*     */     }
/*  75 */     if (!this.e.d(☃.h() - ☃.g())) {
/*  76 */       return false;
/*     */     }
/*  78 */     if (!this.h.a(☃)) {
/*  79 */       return false;
/*     */     }
/*  81 */     Map<awe, Integer> map = awg.a(☃);
/*  82 */     for (int i = 0; i < this.f.length; i++) {
/*  83 */       if (!this.f[i].a(map)) {
/*  84 */         return false;
/*     */       }
/*     */     } 
/*  87 */     aut aut1 = auv.d(☃);
/*  88 */     if (this.g != null && this.g != aut1) {
/*  89 */       return false;
/*     */     }
/*  91 */     return true;
/*     */   }
/*     */   
/*     */   public static av a(@Nullable JsonElement ☃) {
/*  95 */     if (☃ == null || ☃.isJsonNull()) {
/*  96 */       return a;
/*     */     }
/*  98 */     JsonObject jsonObject = xj.m(☃, "item");
/*  99 */     ba.d d1 = ba.d.a(jsonObject.get("count"));
/* 100 */     ba.d d2 = ba.d.a(jsonObject.get("durability"));
/* 101 */     if (jsonObject.has("data")) {
/* 102 */       throw new JsonParseException("Disallowed data tag found");
/*     */     }
/* 104 */     bc bc1 = bc.a(jsonObject.get("nbt"));
/* 105 */     ata ata1 = null;
/* 106 */     if (jsonObject.has("item")) {
/* 107 */       pc pc = new pc(xj.h(jsonObject, "item"));
/* 108 */       ata1 = fc.s.b(pc);
/* 109 */       if (ata1 == null) {
/* 110 */         throw new JsonSyntaxException("Unknown item id '" + pc + "'");
/*     */       }
/*     */     } 
/* 113 */     wz<ata> wz1 = null;
/* 114 */     if (jsonObject.has("tag")) {
/* 115 */       pc pc = new pc(xj.h(jsonObject, "tag"));
/* 116 */       wz1 = wx.a().a(pc);
/* 117 */       if (wz1 == null) {
/* 118 */         throw new JsonSyntaxException("Unknown item tag '" + pc + "'");
/*     */       }
/*     */     } 
/* 121 */     al[] arrayOfAl = al.b(jsonObject.get("enchantments"));
/* 122 */     aut aut1 = null;
/* 123 */     if (jsonObject.has("potion")) {
/* 124 */       pc pc = new pc(xj.h(jsonObject, "potion"));
/* 125 */       if (!fc.j.c(pc)) {
/* 126 */         throw new JsonSyntaxException("Unknown potion '" + pc + "'");
/*     */       }
/* 128 */       aut1 = fc.j.a(pc);
/*     */     } 
/*     */     
/* 131 */     return new av(wz1, ata1, d1, d2, arrayOfAl, aut1, bc1);
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 135 */     if (this == a) {
/* 136 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 139 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 141 */     if (this.c != null) {
/* 142 */       ☃.addProperty("item", fc.s.b(this.c).toString());
/*     */     }
/*     */     
/* 145 */     if (this.b != null) {
/* 146 */       ☃.addProperty("tag", this.b.c().toString());
/*     */     }
/*     */     
/* 149 */     ☃.add("count", this.d.d());
/* 150 */     ☃.add("durability", this.e.d());
/* 151 */     ☃.add("nbt", this.h.a());
/*     */     
/* 153 */     if (this.f.length > 0) {
/* 154 */       JsonArray jsonArray = new JsonArray();
/* 155 */       for (al al1 : this.f) {
/* 156 */         jsonArray.add(al1.a());
/*     */       }
/* 158 */       ☃.add("enchantments", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 161 */     if (this.g != null) {
/* 162 */       ☃.addProperty("potion", fc.j.b(this.g).toString());
/*     */     }
/*     */     
/* 165 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static av[] b(@Nullable JsonElement ☃) {
/* 169 */     if (☃ == null || ☃.isJsonNull()) {
/* 170 */       return new av[0];
/*     */     }
/*     */     
/* 173 */     JsonArray jsonArray = xj.n(☃, "items");
/* 174 */     av[] arrayOfAv = new av[jsonArray.size()];
/*     */     
/* 176 */     for (int i = 0; i < arrayOfAv.length; i++) {
/* 177 */       arrayOfAv[i] = a(jsonArray.get(i));
/*     */     }
/*     */     
/* 180 */     return arrayOfAv;
/*     */   }
/*     */   
/*     */   public static class a {
/* 184 */     private final List<al> a = Lists.newArrayList();
/*     */     @Nullable
/*     */     private ata b;
/*     */     @Nullable
/*     */     private wz<ata> c;
/* 189 */     private ba.d d = ba.d.e;
/* 190 */     private ba.d e = ba.d.e;
/*     */     @Nullable
/*     */     private aut f;
/* 193 */     private bc g = bc.a;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a a() {
/* 199 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(axx ☃) {
/* 203 */       this.b = ☃.h();
/* 204 */       return this;
/*     */     }
/*     */     
/*     */     public a a(wz<ata> ☃) {
/* 208 */       this.c = ☃;
/* 209 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ba.d ☃) {
/* 213 */       this.d = ☃;
/* 214 */       return this;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public av b() {
/* 238 */       return new av(this.c, this.b, this.d, this.e, this.a.<al>toArray(new al[0]), this.f, this.g);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */