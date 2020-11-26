/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.types.DynamicOps;
/*     */ import com.mojang.datafixers.types.JsonOps;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bof
/*     */   extends boc
/*     */ {
/*     */   public bod q() {
/*  54 */     return bod.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/*  59 */     return (!this.b.e(☃, i) && super.a(☃, i));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m() {
/*  64 */     this.e = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmy<? extends bom> n() {
/*  69 */     ayg ☃ = this.b.g().t();
/*     */     
/*  71 */     bnb<bud, bop> bnb = bnb.e;
/*  72 */     bnb<bon, boo> bnb1 = bnb.d;
/*  73 */     bnb<bos, bot> bnb2 = bnb.b;
/*  74 */     bnb<box, boy> bnb3 = bnb.c;
/*  75 */     bnb<bou, bov> bnb4 = bnb.a;
/*     */     
/*  77 */     ayy<azu, azt> ayy = ayy.b;
/*  78 */     ayy<bav, bau> ayy1 = ayy.c;
/*  79 */     ayy<azd, azc> ayy2 = ayy.a;
/*     */     
/*  81 */     if (☃ == ayg.c) {
/*  82 */       bud bud = bud.a(new Dynamic(hj.a, this.b.g().A()));
/*  83 */       azu azu = ((azu)ayy.b()).a(bud.t());
/*  84 */       return bnb.create(this.b, ayy.a(azu), bud);
/*  85 */     }  if (☃ == ayg.h) {
/*  86 */       azu azu = ((azu)ayy.b()).a(ayz.c);
/*  87 */       return bnb1.create(this.b, ayy.a(azu), bnb1.b());
/*  88 */     }  if (☃ == ayg.g) {
/*  89 */       ayw ayw = null;
/*     */       
/*  91 */       JsonElement jsonElement = (JsonElement)Dynamic.convert(hj.a, (DynamicOps)JsonOps.INSTANCE, this.b.g().A());
/*  92 */       JsonObject jsonObject = jsonElement.getAsJsonObject();
/*     */       
/*  94 */       if (jsonObject.has("biome_source") && jsonObject
/*  95 */         .getAsJsonObject("biome_source").has("type") && jsonObject
/*  96 */         .getAsJsonObject("biome_source").has("options")) {
/*     */         
/*  98 */         pc pc = new pc(jsonObject.getAsJsonObject("biome_source").getAsJsonPrimitive("type").getAsString());
/*  99 */         JsonObject jsonObject1 = jsonObject.getAsJsonObject("biome_source").getAsJsonObject("options");
/*     */         
/* 101 */         ayu[] arrayOfAyu = { ayz.a };
/*     */         
/* 103 */         if (jsonObject1.has("biomes")) {
/* 104 */           JsonArray jsonArray = jsonObject1.getAsJsonArray("biomes");
/* 105 */           (new ayu[1])[0] = ayz.a; arrayOfAyu = (jsonArray.size() > 0) ? new ayu[jsonArray.size()] : new ayu[1];
/* 106 */           for (int i = 0; i < jsonArray.size(); i++) {
/* 107 */             ayu ayu = fc.m.b(new pc(jsonArray.get(i).getAsString()));
/* 108 */             arrayOfAyu[i] = (ayu != null) ? ayu : ayz.a;
/*     */           } 
/*     */         } 
/*     */         
/* 112 */         if (ayy.b.c().equals(pc)) {
/* 113 */           azu azu = ((azu)ayy.b()).a(arrayOfAyu[0]);
/* 114 */           ayw = ayy.a(azu);
/*     */         } 
/*     */         
/* 117 */         if (ayy.a.c().equals(pc)) {
/* 118 */           int i = jsonObject1.has("size") ? jsonObject1.getAsJsonPrimitive("size").getAsInt() : 2;
/* 119 */           azd azd = ((azd)ayy2.b()).a(arrayOfAyu).a(i);
/* 120 */           ayw = ayy2.a(azd);
/*     */         } 
/*     */         
/* 123 */         if (ayy.c.c().equals(pc)) {
/* 124 */           bav bav1 = ((bav)ayy1.b()).a(new bou()).a(this.b.g());
/* 125 */           ayw = ayy1.a(bav1);
/*     */         } 
/*     */       } 
/*     */       
/* 129 */       if (ayw == null) {
/* 130 */         ayw = ayy.a(((azu)ayy.b()).a(ayz.a));
/*     */       }
/*     */       
/* 133 */       blc blc1 = bct.b.p();
/* 134 */       blc blc2 = bct.A.p();
/*     */       
/* 136 */       if (jsonObject.has("chunk_generator") && jsonObject.getAsJsonObject("chunk_generator").has("options")) {
/* 137 */         if (jsonObject.getAsJsonObject("chunk_generator").getAsJsonObject("options").has("default_block")) {
/* 138 */           String str = jsonObject.getAsJsonObject("chunk_generator").getAsJsonObject("options").getAsJsonPrimitive("default_block").getAsString();
/* 139 */           bcs bcs = fc.g.a(new pc(str));
/* 140 */           if (bcs != null) {
/* 141 */             blc1 = bcs.p();
/*     */           }
/*     */         } 
/*     */         
/* 145 */         if (jsonObject.getAsJsonObject("chunk_generator").getAsJsonObject("options").has("default_fluid")) {
/* 146 */           String str = jsonObject.getAsJsonObject("chunk_generator").getAsJsonObject("options").getAsJsonPrimitive("default_fluid").getAsString();
/* 147 */           bcs bcs = fc.g.a(new pc(str));
/* 148 */           if (bcs != null) {
/* 149 */             blc2 = bcs.p();
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 154 */       if (jsonObject.has("chunk_generator") && jsonObject.getAsJsonObject("chunk_generator").has("type")) {
/* 155 */         pc pc = new pc(jsonObject.getAsJsonObject("chunk_generator").getAsJsonPrimitive("type").getAsString());
/* 156 */         if (bnb.b.d().equals(pc)) {
/* 157 */           bos bos = bnb2.b();
/* 158 */           bos.a(blc1);
/* 159 */           bos.b(blc2);
/* 160 */           return bnb2.create(this.b, ayw, bos);
/*     */         } 
/* 162 */         if (bnb.c.d().equals(pc)) {
/* 163 */           box box = bnb3.b();
/* 164 */           box.a(new el(0, 64, 0));
/* 165 */           box.a(blc1);
/* 166 */           box.b(blc2);
/* 167 */           return bnb3.create(this.b, ayw, box);
/*     */         } 
/*     */       } 
/*     */       
/* 171 */       bou bou1 = bnb4.b();
/* 172 */       bou1.a(blc1);
/* 173 */       bou1.b(blc2);
/* 174 */       return bnb4.create(this.b, ayw, bou1);
/*     */     } 
/* 176 */     bou bou = bnb4.b();
/* 177 */     bav bav = ((bav)ayy1.b()).a(this.b.g()).a(bou);
/* 178 */     return bnb4.create(this.b, ayy1.a(bav), bou);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(axm ☃, boolean bool) {
/* 185 */     for (int i = ☃.d(); i <= ☃.f(); i++) {
/* 186 */       for (int j = ☃.e(); j <= ☃.g(); j++) {
/* 187 */         el el = a(i, j, bool);
/* 188 */         if (el != null) {
/* 189 */           return el;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 194 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el a(int ☃, int i, boolean bool) {
/* 200 */     el.a a = new el.a(☃, 0, i);
/* 201 */     ayu ayu = this.b.d(a);
/*     */     
/* 203 */     blc blc = ayu.r().a();
/* 204 */     if (bool && !blc.c().a(wv.F)) {
/* 205 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 210 */     bnj bnj = this.b.c(☃ >> 4, i >> 4);
/* 211 */     int j = bnj.a(bor.a.d, ☃ & 0xF, i & 0xF);
/*     */ 
/*     */     
/* 214 */     if (j < 0) {
/* 215 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 219 */     if (bnj.a(bor.a.g, ☃ & 0xF, i & 0xF) > bnj.a(bor.a.f, ☃ & 0xF, i & 0xF)) {
/* 220 */       return null;
/*     */     }
/*     */     
/* 223 */     for (int k = j + 1; k >= 0; k--) {
/* 224 */       a.c(☃, k, i);
/* 225 */       blc blc1 = this.b.a_(a);
/*     */ 
/*     */       
/* 228 */       if (!blc1.s().e()) {
/*     */         break;
/*     */       }
/*     */       
/* 232 */       if (blc1.equals(blc)) {
/* 233 */         return a.a().h();
/*     */       }
/*     */     } 
/* 236 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(long ☃, float f) {
/* 241 */     int i = (int)(☃ % 24000L);
/* 242 */     float f1 = (i + f) / 24000.0F - 0.25F;
/* 243 */     if (f1 < 0.0F) {
/* 244 */       f1++;
/*     */     }
/* 246 */     if (f1 > 1.0F) {
/* 247 */       f1--;
/*     */     }
/* 249 */     float f2 = f1;
/* 250 */     f1 = 1.0F - (float)((Math.cos(f1 * Math.PI) + 1.0D) / 2.0D);
/* 251 */     f1 = f2 + (f1 - f2) / 3.0F;
/* 252 */     return f1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 257 */     return true;
/*     */   }
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
/*     */   public boolean p() {
/* 277 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */