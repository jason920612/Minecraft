/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.TreeMap;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Supplier;
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
/*     */ public class axu
/*     */ {
/*     */   private static final TreeMap<String, b> a;
/*     */   
/*     */   static {
/*  52 */     a = k.<TreeMap<String, b>>a(new TreeMap<>(), ☃ -> {
/*     */           ☃.put("doFireTick", new b("true", c.b));
/*     */           ☃.put("mobGriefing", new b("true", c.b));
/*     */           ☃.put("keepInventory", new b("false", c.b));
/*     */           ☃.put("doMobSpawning", new b("true", c.b));
/*     */           ☃.put("doMobLoot", new b("true", c.b));
/*     */           ☃.put("doTileDrops", new b("true", c.b));
/*     */           ☃.put("doEntityDrops", new b("true", c.b));
/*     */           ☃.put("commandBlockOutput", new b("true", c.b));
/*     */           ☃.put("naturalRegeneration", new b("true", c.b));
/*     */           ☃.put("doDaylightCycle", new b("true", c.b));
/*     */           ☃.put("logAdminCommands", new b("true", c.b));
/*     */           ☃.put("showDeathMessages", new b("true", c.b));
/*     */           ☃.put("randomTickSpeed", new b("3", c.c));
/*     */           ☃.put("sendCommandFeedback", new b("true", c.b));
/*     */           ☃.put("reducedDebugInfo", new b("false", c.b, ()));
/*     */           ☃.put("spectatorsGenerateChunks", new b("true", c.b));
/*     */           ☃.put("spawnRadius", new b("10", c.c));
/*     */           ☃.put("disableElytraMovementCheck", new b("false", c.b));
/*     */           ☃.put("maxEntityCramming", new b("24", c.c));
/*     */           ☃.put("doWeatherCycle", new b("true", c.b));
/*     */           ☃.put("doLimitedCrafting", new b("false", c.b));
/*     */           ☃.put("maxCommandChainLength", new b("65536", c.c));
/*     */           ☃.put("announceAdvancements", new b("true", c.b));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   private final TreeMap<String, a> b = new TreeMap<>();
/*     */   
/*     */   public axu() {
/*  86 */     for (Map.Entry<String, b> ☃ : a.entrySet()) {
/*  87 */       this.b.put(☃.getKey(), ((b)☃.getValue()).a());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(String ☃, String str1, @Nullable MinecraftServer minecraftServer) {
/*  92 */     a a = this.b.get(☃);
/*  93 */     if (a != null) {
/*  94 */       a.a(str1, minecraftServer);
/*     */     }
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
/*     */   public boolean b(String ☃) {
/* 107 */     a a = this.b.get(☃);
/* 108 */     if (a != null) {
/* 109 */       return a.b();
/*     */     }
/* 111 */     return false;
/*     */   }
/*     */   
/*     */   public int c(String ☃) {
/* 115 */     a a = this.b.get(☃);
/* 116 */     if (a != null) {
/* 117 */       return a.c();
/*     */     }
/* 119 */     return 0;
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
/*     */   public gy a() {
/* 131 */     gy ☃ = new gy();
/*     */     
/* 133 */     for (String str : this.b.keySet()) {
/* 134 */       a a = this.b.get(str);
/* 135 */       ☃.a(str, a.a());
/*     */     } 
/*     */     
/* 138 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(gy ☃) {
/* 142 */     Set<String> set = ☃.c();
/* 143 */     for (String str : set) {
/* 144 */       a(str, ☃.l(str), null);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a f(String ☃) {
/* 153 */     return this.b.get(☃);
/*     */   }
/*     */   
/*     */   public static TreeMap<String, b> b() {
/* 157 */     return a;
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     private final axu.c a;
/*     */     private final String b;
/*     */     private final BiConsumer<MinecraftServer, axu.a> c;
/*     */     
/*     */     public b(String ☃, axu.c c1) {
/* 166 */       this(☃, c1, (☃, a1) -> {
/*     */           
/*     */           });
/*     */     } public b(String ☃, axu.c c1, BiConsumer<MinecraftServer, axu.a> biConsumer) {
/* 170 */       this.a = c1;
/* 171 */       this.b = ☃;
/* 172 */       this.c = biConsumer;
/*     */     }
/*     */     
/*     */     public axu.a a() {
/* 176 */       return new axu.a(this.b, this.a, this.c);
/*     */     }
/*     */     
/*     */     public axu.c b() {
/* 180 */       return this.a;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     private String a;
/*     */     
/*     */     private boolean b;
/*     */     
/*     */     private int c;
/*     */     
/*     */     private double d;
/*     */     
/*     */     private final axu.c e;
/*     */     
/*     */     private final BiConsumer<MinecraftServer, a> f;
/*     */ 
/*     */     
/*     */     public a(String ☃, axu.c c1, BiConsumer<MinecraftServer, a> biConsumer) {
/* 201 */       this.e = c1;
/* 202 */       this.f = biConsumer;
/* 203 */       a(☃, null);
/*     */     }
/*     */     
/*     */     public void a(String ☃, @Nullable MinecraftServer minecraftServer) {
/* 207 */       this.a = ☃;
/* 208 */       this.b = Boolean.parseBoolean(☃);
/* 209 */       this.c = this.b ? 1 : 0;
/*     */       try {
/* 211 */         this.c = Integer.parseInt(☃);
/* 212 */       } catch (NumberFormatException numberFormatException) {}
/*     */       
/*     */       try {
/* 215 */         this.d = Double.parseDouble(☃);
/* 216 */       } catch (NumberFormatException numberFormatException) {}
/*     */       
/* 218 */       if (minecraftServer != null) {
/* 219 */         this.f.accept(minecraftServer, this);
/*     */       }
/*     */     }
/*     */     
/*     */     public String a() {
/* 224 */       return this.a;
/*     */     }
/*     */     
/*     */     public boolean b() {
/* 228 */       return this.b;
/*     */     }
/*     */     
/*     */     public int c() {
/* 232 */       return this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public axu.c e() {
/* 240 */       return this.e;
/*     */     } }
/*     */   
/*     */   public enum c {
/*     */     static {
/* 245 */       a = new c("ANY_VALUE", 0, StringArgumentType::greedyString, (☃, str) -> (String)☃.getArgument(str, String.class));
/* 246 */       b = new c("BOOLEAN_VALUE", 1, BoolArgumentType::bool, (☃, str) -> ((Boolean)☃.getArgument(str, Boolean.class)).toString());
/* 247 */       c = new c("NUMERICAL_VALUE", 2, IntegerArgumentType::integer, (☃, str) -> ((Integer)☃.getArgument(str, Integer.class)).toString());
/*     */     }
/*     */     a, b, c;
/*     */     private final Supplier<ArgumentType<?>> d;
/*     */     private final BiFunction<CommandContext<bu>, String, String> e;
/*     */     
/*     */     c(Supplier<ArgumentType<?>> ☃, BiFunction<CommandContext<bu>, String, String> biFunction) {
/* 254 */       this.d = ☃;
/* 255 */       this.e = biFunction;
/*     */     }
/*     */     
/*     */     public RequiredArgumentBuilder<bu, ?> a(String ☃) {
/* 259 */       return bv.a(☃, this.d.get());
/*     */     }
/*     */     
/*     */     public void a(CommandContext<bu> ☃, String str, axu.a a1) {
/* 263 */       a1.a(this.e.apply(☃, str), ((bu)☃.getSource()).j());
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\axu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */