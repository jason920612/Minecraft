/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class o
/*     */ {
/*  30 */   public static final o a = new o(0, new pc[0], new pc[0], br.a.a);
/*     */   
/*     */   private final int b;
/*     */   private final pc[] c;
/*     */   private final pc[] d;
/*     */   private final br.a e;
/*     */   
/*     */   public o(int ☃, pc[] arrayOfPc1, pc[] arrayOfPc2, br.a a1) {
/*  38 */     this.b = ☃;
/*  39 */     this.c = arrayOfPc1;
/*  40 */     this.d = arrayOfPc2;
/*  41 */     this.e = a1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(tf ☃) {
/*  49 */     ☃.d(this.b);
/*  50 */     ccr ccr = (new ccr.a(☃.s())).a(☃).a(new el(☃)).a();
/*  51 */     boolean bool = false;
/*  52 */     for (pc pc1 : this.c) {
/*  53 */       for (ate ate : ☃.b.aN().a(pc1).a(☃.ce(), ccr)) {
/*  54 */         if (☃.d(ate)) {
/*  55 */           ☃.m.a((aog)null, ☃.q, ☃.r, ☃.s, wj.eE, wk.h, 0.2F, ((☃.ce().nextFloat() - ☃.ce().nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*  56 */           bool = true; continue;
/*     */         } 
/*  58 */         amm amm = ☃.a(ate, false);
/*  59 */         if (amm != null) {
/*  60 */           amm.o();
/*  61 */           amm.b(☃.bt());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  66 */     if (bool) {
/*  67 */       ☃.bD.b();
/*     */     }
/*  69 */     if (this.d.length > 0) {
/*  70 */       ☃.a(this.d);
/*     */     }
/*  72 */     MinecraftServer minecraftServer = ☃.b;
/*  73 */     br br = this.e.a(minecraftServer.aB());
/*  74 */     if (br != null) {
/*  75 */       minecraftServer.aB().a(br, ☃.bX().a().a(2));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  81 */     return "AdvancementRewards{experience=" + this.b + ", loot=" + 
/*     */       
/*  83 */       Arrays.toString((Object[])this.c) + ", recipes=" + 
/*  84 */       Arrays.toString((Object[])this.d) + ", function=" + this.e + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/*  90 */     if (this == a) {
/*  91 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  94 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  96 */     if (this.b != 0) {
/*  97 */       ☃.addProperty("experience", Integer.valueOf(this.b));
/*     */     }
/*     */     
/* 100 */     if (this.c.length > 0) {
/* 101 */       JsonArray jsonArray = new JsonArray();
/* 102 */       for (pc pc1 : this.c) {
/* 103 */         jsonArray.add(pc1.toString());
/*     */       }
/* 105 */       ☃.add("loot", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 108 */     if (this.d.length > 0) {
/* 109 */       JsonArray jsonArray = new JsonArray();
/* 110 */       for (pc pc1 : this.d) {
/* 111 */         jsonArray.add(pc1.toString());
/*     */       }
/* 113 */       ☃.add("recipes", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 116 */     if (this.e.a() != null) {
/* 117 */       ☃.addProperty("function", this.e.a().toString());
/*     */     }
/*     */     
/* 120 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class b implements JsonDeserializer<o> {
/*     */     public o a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*     */       br.a a;
/* 126 */       JsonObject jsonObject = xj.m(☃, "rewards");
/* 127 */       int i = xj.a(jsonObject, "experience", 0);
/* 128 */       JsonArray jsonArray1 = xj.a(jsonObject, "loot", new JsonArray());
/* 129 */       pc[] arrayOfPc1 = new pc[jsonArray1.size()];
/* 130 */       for (int j = 0; j < arrayOfPc1.length; j++) {
/* 131 */         arrayOfPc1[j] = new pc(xj.a(jsonArray1.get(j), "loot[" + j + "]"));
/*     */       }
/* 133 */       JsonArray jsonArray2 = xj.a(jsonObject, "recipes", new JsonArray());
/* 134 */       pc[] arrayOfPc2 = new pc[jsonArray2.size()];
/* 135 */       for (int k = 0; k < arrayOfPc2.length; k++) {
/* 136 */         arrayOfPc2[k] = new pc(xj.a(jsonArray2.get(k), "recipes[" + k + "]"));
/*     */       }
/*     */       
/* 139 */       if (jsonObject.has("function")) {
/* 140 */         a = new br.a(new pc(xj.h(jsonObject, "function")));
/*     */       } else {
/* 142 */         a = br.a.a;
/*     */       } 
/* 144 */       return new o(i, arrayOfPc1, arrayOfPc2, a);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private int a;
/* 150 */     private final List<pc> b = Lists.newArrayList();
/* 151 */     private final List<pc> c = Lists.newArrayList();
/*     */     @Nullable
/*     */     private pc d;
/*     */     
/*     */     public static a a(int ☃) {
/* 156 */       return (new a()).b(☃);
/*     */     }
/*     */     
/*     */     public a b(int ☃) {
/* 160 */       this.a += ☃;
/* 161 */       return this;
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
/*     */     public static a c(pc ☃) {
/* 174 */       return (new a()).d(☃);
/*     */     }
/*     */     
/*     */     public a d(pc ☃) {
/* 178 */       this.c.add(☃);
/* 179 */       return this;
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
/*     */     public o a() {
/* 192 */       return new o(this.a, this.b.<pc>toArray(new pc[0]), this.c.<pc>toArray(new pc[0]), (this.d == null) ? br.a.a : new br.a(this.d));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */