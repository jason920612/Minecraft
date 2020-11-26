/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*     */ public class u
/*     */ {
/*     */   private final ij a;
/*     */   private final ij b;
/*     */   private final ate c;
/*     */   private final pc d;
/*     */   private final v e;
/*     */   private final boolean f;
/*     */   private final boolean g;
/*     */   private final boolean h;
/*     */   private float i;
/*     */   private float j;
/*     */   
/*     */   public u(ate ☃, ij ij1, ij ij2, @Nullable pc pc1, v v1, boolean bool1, boolean bool2, boolean bool3) {
/*  34 */     this.a = ij1;
/*  35 */     this.b = ij2;
/*  36 */     this.c = ☃;
/*  37 */     this.d = pc1;
/*  38 */     this.e = v1;
/*  39 */     this.f = bool1;
/*  40 */     this.g = bool2;
/*  41 */     this.h = bool3;
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1) {
/*  45 */     this.i = ☃;
/*  46 */     this.j = f1;
/*     */   }
/*     */   
/*     */   public ij a() {
/*  50 */     return this.a;
/*     */   }
/*     */   
/*     */   public ij b() {
/*  54 */     return this.b;
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
/*     */   public v e() {
/*  67 */     return this.e;
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
/*     */   public boolean i() {
/*  83 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean j() {
/*  87 */     return this.h;
/*     */   }
/*     */   
/*     */   public static u a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  91 */     ij ij1 = xj.<ij>a(☃, "title", jsonDeserializationContext, ij.class);
/*  92 */     ij ij2 = xj.<ij>a(☃, "description", jsonDeserializationContext, ij.class);
/*     */     
/*  94 */     if (ij1 == null || ij2 == null) {
/*  95 */       throw new JsonSyntaxException("Both title and description must be set");
/*     */     }
/*  97 */     ate ate1 = a(xj.t(☃, "icon"));
/*  98 */     pc pc1 = ☃.has("background") ? new pc(xj.h(☃, "background")) : null;
/*  99 */     v v1 = ☃.has("frame") ? v.a(xj.h(☃, "frame")) : v.a;
/* 100 */     boolean bool1 = xj.a(☃, "show_toast", true);
/* 101 */     boolean bool2 = xj.a(☃, "announce_to_chat", true);
/* 102 */     boolean bool3 = xj.a(☃, "hidden", false);
/* 103 */     return new u(ate1, ij1, ij2, pc1, v1, bool1, bool2, bool3);
/*     */   }
/*     */   
/*     */   private static ate a(JsonObject ☃) {
/* 107 */     if (!☃.has("item")) {
/* 108 */       throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
/*     */     }
/* 110 */     ata ata = xj.i(☃, "item");
/* 111 */     if (☃.has("data")) {
/* 112 */       throw new JsonParseException("Disallowed data tag found");
/*     */     }
/* 114 */     ate ate1 = new ate(ata);
/* 115 */     if (☃.has("nbt")) {
/*     */       try {
/* 117 */         gy gy = hp.a(xj.a(☃.get("nbt"), "nbt"));
/* 118 */         ate1.c(gy);
/* 119 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 120 */         throw new JsonSyntaxException("Invalid nbt tag: " + commandSyntaxException.getMessage());
/*     */       } 
/*     */     }
/*     */     
/* 124 */     return ate1;
/*     */   }
/*     */   
/*     */   public void a(hy ☃) {
/* 128 */     ☃.a(this.a);
/* 129 */     ☃.a(this.b);
/* 130 */     ☃.a(this.c);
/* 131 */     ☃.a(this.e);
/* 132 */     int i = 0;
/* 133 */     if (this.d != null) {
/* 134 */       i |= 0x1;
/*     */     }
/* 136 */     if (this.f) {
/* 137 */       i |= 0x2;
/*     */     }
/* 139 */     if (this.h) {
/* 140 */       i |= 0x4;
/*     */     }
/* 142 */     ☃.writeInt(i);
/* 143 */     if (this.d != null) {
/* 144 */       ☃.a(this.d);
/*     */     }
/* 146 */     ☃.writeFloat(this.i);
/* 147 */     ☃.writeFloat(this.j);
/*     */   }
/*     */   
/*     */   public static u b(hy ☃) {
/* 151 */     ij ij1 = ☃.f();
/* 152 */     ij ij2 = ☃.f();
/* 153 */     ate ate1 = ☃.k();
/* 154 */     v v1 = ☃.<v>a(v.class);
/* 155 */     int i = ☃.readInt();
/* 156 */     pc pc1 = ((i & 0x1) != 0) ? ☃.l() : null;
/* 157 */     boolean bool1 = ((i & 0x2) != 0);
/* 158 */     boolean bool2 = ((i & 0x4) != 0);
/* 159 */     u u1 = new u(ate1, ij1, ij2, pc1, v1, bool1, false, bool2);
/* 160 */     u1.a(☃.readFloat(), ☃.readFloat());
/* 161 */     return u1;
/*     */   }
/*     */   
/*     */   public JsonElement k() {
/* 165 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 167 */     ☃.add("icon", (JsonElement)l());
/* 168 */     ☃.add("title", ij.a.b(this.a));
/* 169 */     ☃.add("description", ij.a.b(this.b));
/* 170 */     ☃.addProperty("frame", this.e.a());
/* 171 */     ☃.addProperty("show_toast", Boolean.valueOf(this.f));
/* 172 */     ☃.addProperty("announce_to_chat", Boolean.valueOf(this.g));
/* 173 */     ☃.addProperty("hidden", Boolean.valueOf(this.h));
/*     */     
/* 175 */     if (this.d != null) {
/* 176 */       ☃.addProperty("background", this.d.toString());
/*     */     }
/*     */     
/* 179 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   private JsonObject l() {
/* 183 */     JsonObject ☃ = new JsonObject();
/* 184 */     ☃.addProperty("item", fc.s.b(this.c.b()).toString());
/* 185 */     return ☃;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar\\u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */