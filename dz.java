/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.tree.ArgumentCommandNode;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
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
/*     */ public class dz
/*     */ {
/*  56 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  58 */   private static final Map<Class<?>, a<?>> b = Maps.newHashMap();
/*  59 */   private static final Map<pc, a<?>> c = Maps.newHashMap();
/*     */   
/*     */   public static <T extends ArgumentType<?>> void a(pc ☃, Class<T> clazz, dy<T> dy1) {
/*  62 */     if (b.containsKey(clazz)) {
/*  63 */       throw new IllegalArgumentException("Class " + clazz.getName() + " already has a serializer!");
/*     */     }
/*  65 */     if (c.containsKey(☃)) {
/*  66 */       throw new IllegalArgumentException("'" + ☃ + "' is already a registered serializer!");
/*     */     }
/*  68 */     a<T> a = new a<>(clazz, dy1, ☃);
/*  69 */     b.put(clazz, a);
/*  70 */     c.put(☃, a);
/*     */   }
/*     */   
/*     */   public static void a() {
/*  74 */     ec.a();
/*  75 */     a(new pc("minecraft:entity"), cb.class, new cb.a());
/*  76 */     a(new pc("minecraft:game_profile"), cd.class, new ea<>(cd::a));
/*  77 */     a(new pc("minecraft:block_pos"), cy.class, new ea<>(cy::a));
/*  78 */     a(new pc("minecraft:column_pos"), cz.class, new ea<>(cz::a));
/*  79 */     a(new pc("minecraft:vec3"), df.class, new ea<>(df::a));
/*  80 */     a(new pc("minecraft:vec2"), de.class, new ea<>(de::a));
/*  81 */     a(new pc("minecraft:block_state"), cv.class, new ea<>(cv::a));
/*  82 */     a(new pc("minecraft:block_predicate"), cu.class, new ea<>(cu::a));
/*  83 */     a(new pc("minecraft:item_stack"), dk.class, new ea<>(dk::a));
/*  84 */     a(new pc("minecraft:item_predicate"), dn.class, new ea<>(dn::a));
/*  85 */     a(new pc("minecraft:color"), bx.class, new ea<>(bx::a));
/*  86 */     a(new pc("minecraft:component"), by.class, new ea<>(by::a));
/*  87 */     a(new pc("minecraft:message"), cf.class, new ea<>(cf::a));
/*  88 */     a(new pc("minecraft:nbt"), ch.class, new ea<>(ch::a));
/*  89 */     a(new pc("minecraft:nbt_path"), ci.class, new ea<>(ci::a));
/*  90 */     a(new pc("minecraft:objective"), cj.class, new ea<>(cj::a));
/*  91 */     a(new pc("minecraft:objective_criteria"), ck.class, new ea<>(ck::a));
/*  92 */     a(new pc("minecraft:operation"), cl.class, new ea<>(cl::a));
/*  93 */     a(new pc("minecraft:particle"), cm.class, new ea<>(cm::a));
/*  94 */     a(new pc("minecraft:rotation"), dc.class, new ea<>(dc::a));
/*  95 */     a(new pc("minecraft:scoreboard_slot"), cq.class, new ea<>(cq::a));
/*  96 */     a(new pc("minecraft:score_holder"), cp.class, new cp.c());
/*  97 */     a(new pc("minecraft:swizzle"), dd.class, new ea<>(dd::a));
/*  98 */     a(new pc("minecraft:team"), cs.class, new ea<>(cs::a));
/*  99 */     a(new pc("minecraft:item_slot"), cr.class, new ea<>(cr::a));
/* 100 */     a(new pc("minecraft:resource_location"), co.class, new ea<>(co::a));
/* 101 */     a(new pc("minecraft:mob_effect"), cg.class, new ea<>(cg::a));
/* 102 */     a(new pc("minecraft:function"), dj.class, new ea<>(dj::a));
/* 103 */     a(new pc("minecraft:entity_anchor"), ca.class, new ea<>(ca::a));
/* 104 */     a(new pc("minecraft:int_range"), cn.b.class, new cn.b.a());
/* 105 */     a(new pc("minecraft:float_range"), cn.a.class, new cn.a.a());
/* 106 */     a(new pc("minecraft:item_enchantment"), ce.class, new ea<>(ce::a));
/* 107 */     a(new pc("minecraft:entity_summon"), cc.class, new ea<>(cc::a));
/* 108 */     a(new pc("minecraft:dimension"), bz.class, new ea<>(bz::a));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static a<?> a(pc ☃) {
/* 113 */     return c.get(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static a<?> a(ArgumentType<?> ☃) {
/* 118 */     return b.get(☃.getClass());
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T extends ArgumentType<?>> void a(hy ☃, T t) {
/* 123 */     a<T> a = (a)a((ArgumentType<?>)t);
/* 124 */     if (a == null) {
/* 125 */       a.error("Could not serialize {} ({}) - will not be sent to client!", t, t.getClass());
/* 126 */       ☃.a(new pc(""));
/*     */       
/*     */       return;
/*     */     } 
/* 130 */     ☃.a(a.c);
/* 131 */     a.b.a(t, ☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ArgumentType<?> a(hy ☃) {
/* 136 */     pc pc = ☃.l();
/* 137 */     a<?> a = a(pc);
/*     */     
/* 139 */     if (a == null) {
/* 140 */       a.error("Could not deserialize {}", pc);
/* 141 */       return null;
/*     */     } 
/*     */     
/* 144 */     return (ArgumentType<?>)a.b.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T extends ArgumentType<?>> void a(JsonObject ☃, T t) {
/* 149 */     a<T> a = (a)a((ArgumentType<?>)t);
/* 150 */     if (a == null) {
/* 151 */       a.error("Could not serialize argument {} ({})!", t, t.getClass());
/* 152 */       ☃.addProperty("type", "unknown");
/*     */     } else {
/* 154 */       ☃.addProperty("type", "argument");
/* 155 */       ☃.addProperty("parser", a.c.toString());
/*     */       
/* 157 */       JsonObject jsonObject = new JsonObject();
/* 158 */       a.b.a(t, jsonObject);
/* 159 */       if (jsonObject.size() > 0) {
/* 160 */         ☃.add("properties", (JsonElement)jsonObject);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static <S> JsonObject a(CommandDispatcher<S> ☃, CommandNode<S> commandNode) {
/* 166 */     JsonObject jsonObject1 = new JsonObject();
/*     */     
/* 168 */     if (commandNode instanceof com.mojang.brigadier.tree.RootCommandNode) {
/* 169 */       jsonObject1.addProperty("type", "root");
/* 170 */     } else if (commandNode instanceof com.mojang.brigadier.tree.LiteralCommandNode) {
/* 171 */       jsonObject1.addProperty("type", "literal");
/* 172 */     } else if (commandNode instanceof ArgumentCommandNode) {
/* 173 */       a(jsonObject1, ((ArgumentCommandNode)commandNode).getType());
/*     */     } else {
/* 175 */       a.error("Could not serialize node {} ({})!", commandNode, commandNode.getClass());
/*     */       
/* 177 */       jsonObject1.addProperty("type", "unknown");
/*     */     } 
/*     */     
/* 180 */     JsonObject jsonObject2 = new JsonObject();
/* 181 */     for (CommandNode<S> commandNode1 : (Iterable<CommandNode<S>>)commandNode.getChildren()) {
/* 182 */       jsonObject2.add(commandNode1.getName(), (JsonElement)a(☃, commandNode1));
/*     */     }
/* 184 */     if (jsonObject2.size() > 0) {
/* 185 */       jsonObject1.add("children", (JsonElement)jsonObject2);
/*     */     }
/*     */     
/* 188 */     if (commandNode.getCommand() != null) {
/* 189 */       jsonObject1.addProperty("executable", Boolean.valueOf(true));
/*     */     }
/*     */     
/* 192 */     if (commandNode.getRedirect() != null) {
/* 193 */       Collection<String> collection = ☃.getPath(commandNode.getRedirect());
/* 194 */       if (!collection.isEmpty()) {
/* 195 */         JsonArray jsonArray = new JsonArray();
/* 196 */         for (String str : collection) {
/* 197 */           jsonArray.add(str);
/*     */         }
/* 199 */         jsonObject1.add("redirect", (JsonElement)jsonArray);
/*     */       } 
/*     */     } 
/*     */     
/* 203 */     return jsonObject1;
/*     */   }
/*     */   
/*     */   static class a<T extends ArgumentType<?>> {
/*     */     public final Class<T> a;
/*     */     public final dy<T> b;
/*     */     public final pc c;
/*     */     
/*     */     private a(Class<T> ☃, dy<T> dy1, pc pc1) {
/* 212 */       this.a = ☃;
/* 213 */       this.b = dy1;
/* 214 */       this.c = pc1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\dz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */