/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class gg
/*     */ {
/*  29 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final ata b;
/*     */   private final int c;
/*  33 */   private final List<String> d = Lists.newArrayList();
/*  34 */   private final Map<Character, avh> e = Maps.newLinkedHashMap();
/*  35 */   private final l.a f = l.a.a();
/*     */   private String g;
/*     */   
/*     */   public gg(axx ☃, int i) {
/*  39 */     this.b = ☃.h();
/*  40 */     this.c = i;
/*     */   }
/*     */   
/*     */   public static gg a(axx ☃) {
/*  44 */     return a(☃, 1);
/*     */   }
/*     */   
/*     */   public static gg a(axx ☃, int i) {
/*  48 */     return new gg(☃, i);
/*     */   }
/*     */   
/*     */   public gg a(Character ☃, wz<ata> wz1) {
/*  52 */     return a(☃, avh.a(wz1));
/*     */   }
/*     */   
/*     */   public gg a(Character ☃, axx axx1) {
/*  56 */     return a(☃, avh.a(new axx[] { axx1 }));
/*     */   }
/*     */   
/*     */   public gg a(Character ☃, avh avh1) {
/*  60 */     if (this.e.containsKey(☃)) {
/*  61 */       throw new IllegalArgumentException("Symbol '" + ☃ + "' is already defined!");
/*     */     }
/*  63 */     if (☃.charValue() == ' ') {
/*  64 */       throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
/*     */     }
/*  66 */     this.e.put(☃, avh1);
/*  67 */     return this;
/*     */   }
/*     */   
/*     */   public gg a(String ☃) {
/*  71 */     if (!this.d.isEmpty() && ☃.length() != ((String)this.d.get(0)).length()) {
/*  72 */       throw new IllegalArgumentException("Pattern must be the same width on every line!");
/*     */     }
/*  74 */     this.d.add(☃);
/*  75 */     return this;
/*     */   }
/*     */   
/*     */   public gg a(String ☃, t t1) {
/*  79 */     this.f.a(☃, t1);
/*  80 */     return this;
/*     */   }
/*     */   
/*     */   public gg b(String ☃) {
/*  84 */     this.g = ☃;
/*  85 */     return this;
/*     */   }
/*     */   
/*     */   public void a(Consumer<ge> ☃) {
/*  89 */     a(☃, fc.s.b(this.b));
/*     */   }
/*     */   
/*     */   public void a(Consumer<ge> ☃, String str) {
/*  93 */     pc pc = fc.s.b(this.b);
/*  94 */     if ((new pc(str)).equals(pc)) {
/*  95 */       throw new IllegalStateException("Shaped Recipe " + str + " should remove its 'save' argument");
/*     */     }
/*  97 */     a(☃, new pc(str));
/*     */   }
/*     */   
/*     */   public void a(Consumer<ge> ☃, pc pc1) {
/* 101 */     a(pc1);
/* 102 */     this.f
/* 103 */       .a(new pc("minecraft:recipes/root"))
/* 104 */       .a("has_the_recipe", new bg.b(pc1))
/* 105 */       .a(o.a.c(pc1))
/* 106 */       .a(w.OR);
/* 107 */     ☃.accept(new a(this, pc1, this.b, this.c, (this.g == null) ? "" : this.g, this.d, this.e, this.f, new pc(pc1.b(), "recipes/" + this.b.q().c() + "/" + pc1.a())));
/*     */   }
/*     */   
/*     */   private void a(pc ☃) {
/* 111 */     if (this.d.isEmpty()) {
/* 112 */       throw new IllegalStateException("No pattern is defined for shaped recipe " + ☃ + "!");
/*     */     }
/*     */     
/* 115 */     Set<Character> set = Sets.newHashSet(this.e.keySet());
/* 116 */     set.remove(Character.valueOf(' '));
/*     */     
/* 118 */     for (String str : this.d) {
/* 119 */       for (int i = 0; i < str.length(); i++) {
/* 120 */         char c = str.charAt(i);
/* 121 */         if (!this.e.containsKey(Character.valueOf(c)) && c != ' ') {
/* 122 */           throw new IllegalStateException("Pattern in recipe " + ☃ + " uses undefined symbol '" + c + "'");
/*     */         }
/* 124 */         set.remove(Character.valueOf(c));
/*     */       } 
/*     */     } 
/*     */     
/* 128 */     if (!set.isEmpty()) {
/* 129 */       throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + ☃);
/*     */     }
/*     */     
/* 132 */     if (this.d.size() == 1 && ((String)this.d.get(0)).length() == 1) {
/* 133 */       throw new IllegalStateException("Shaped recipe " + ☃ + " only takes in a single item - should it be a shapeless recipe instead?");
/*     */     }
/*     */     
/* 136 */     if (this.f.c().isEmpty())
/* 137 */       throw new IllegalStateException("No way of obtaining recipe " + ☃); 
/*     */   }
/*     */   
/*     */   class a
/*     */     implements ge {
/*     */     private final pc b;
/*     */     private final ata c;
/*     */     private final int d;
/*     */     private final String e;
/*     */     private final List<String> f;
/*     */     private final Map<Character, avh> g;
/*     */     private final l.a h;
/*     */     private final pc i;
/*     */     
/*     */     public a(gg this$0, pc ☃, ata ata1, int i, String str, List<String> list, Map<Character, avh> map, l.a a1, pc pc1) {
/* 152 */       this.b = ☃;
/* 153 */       this.c = ata1;
/* 154 */       this.d = i;
/* 155 */       this.e = str;
/* 156 */       this.f = list;
/* 157 */       this.g = map;
/* 158 */       this.h = a1;
/* 159 */       this.i = pc1;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject a() {
/* 164 */       JsonObject ☃ = new JsonObject();
/* 165 */       ☃.addProperty("type", "crafting_shaped");
/*     */       
/* 167 */       if (!this.e.isEmpty()) {
/* 168 */         ☃.addProperty("group", this.e);
/*     */       }
/*     */       
/* 171 */       JsonArray jsonArray = new JsonArray();
/* 172 */       for (String str : this.f) {
/* 173 */         jsonArray.add(str);
/*     */       }
/* 175 */       ☃.add("pattern", (JsonElement)jsonArray);
/*     */       
/* 177 */       JsonObject jsonObject1 = new JsonObject();
/* 178 */       for (Map.Entry<Character, avh> entry : this.g.entrySet()) {
/* 179 */         jsonObject1.add(String.valueOf(entry.getKey()), ((avh)entry.getValue()).c());
/*     */       }
/* 181 */       ☃.add("key", (JsonElement)jsonObject1);
/*     */       
/* 183 */       JsonObject jsonObject2 = new JsonObject();
/* 184 */       jsonObject2.addProperty("item", fc.s.b(this.c).toString());
/* 185 */       if (this.d > 1) {
/* 186 */         jsonObject2.addProperty("count", Integer.valueOf(this.d));
/*     */       }
/* 188 */       ☃.add("result", (JsonElement)jsonObject2);
/*     */       
/* 190 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public pc b() {
/* 195 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonObject c() {
/* 201 */       return this.h.b();
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public pc d() {
/* 207 */       return this.i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */