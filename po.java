/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.io.IOException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class po
/*    */   implements vg
/*    */ {
/* 32 */   private static final Logger c = LogManager.getLogger();
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Gson d;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static {
/* 42 */     d = (new GsonBuilder()).registerTypeHierarchyAdapter(l.a.class, (☃, type, jsonDeserializationContext) -> { JsonObject jsonObject = xj.m(☃, "advancement"); return (JsonDeserializer)l.a.a(jsonObject, jsonDeserializationContext); }).registerTypeAdapter(o.class, new o.b()).registerTypeHierarchyAdapter(ij.class, new ij.a()).registerTypeHierarchyAdapter(ip.class, new ip.a()).registerTypeAdapterFactory(new xp()).create();
/* 43 */   } private static final m e = new m();
/* 44 */   public static final int a = "advancements/".length();
/*    */   
/* 46 */   public static final int b = ".json".length();
/*    */ 
/*    */   
/*    */   private boolean f;
/*    */ 
/*    */ 
/*    */   
/*    */   private Map<pc, l.a> b(vf ☃) {
/* 54 */     Map<pc, l.a> map = Maps.newHashMap();
/*    */     
/* 56 */     for (pc pc1 : ☃.a("advancements", ☃ -> ☃.endsWith(".json"))) {
/* 57 */       String str = pc1.a();
/* 58 */       pc pc2 = new pc(pc1.b(), str.substring(a, str.length() - b));
/* 59 */       try (ve ☃ = ☃.a(pc1)) {
/* 60 */         l.a a = xj.<l.a>a(d, IOUtils.toString(ve.b(), StandardCharsets.UTF_8), l.a.class);
/* 61 */         if (a == null) {
/* 62 */           c.error("Couldn't load custom advancement {} from {} as it's empty or null", pc2, pc1);
/*    */         } else {
/* 64 */           map.put(pc2, a);
/*    */         } 
/* 66 */       } catch (JsonParseException|IllegalArgumentException runtimeException) {
/* 67 */         c.error("Parsing error loading custom advancement {}: {}", pc2, runtimeException.getMessage());
/* 68 */         this.f = true;
/* 69 */       } catch (IOException iOException) {
/* 70 */         c.error("Couldn't read custom advancement {} from {}", pc2, pc1, iOException);
/* 71 */         this.f = true;
/*    */       } 
/*    */     } 
/*    */     
/* 75 */     return map;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public l a(pc ☃) {
/* 80 */     return e.a(☃);
/*    */   }
/*    */   
/*    */   public Collection<l> b() {
/* 84 */     return e.c();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(vf ☃) {
/* 89 */     this.f = false;
/* 90 */     e.a();
/* 91 */     Map<pc, l.a> map = b(☃);
/* 92 */     e.a(map);
/* 93 */     for (l l : e.b()) {
/* 94 */       if (l.c() != null)
/* 95 */         x.a(l); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\po.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */