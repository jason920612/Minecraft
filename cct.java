/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.Map;
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
/*    */ public class cct
/*    */   implements vg
/*    */ {
/* 23 */   private static final Logger c = LogManager.getLogger();
/* 24 */   private static final Gson d = (new GsonBuilder())
/* 25 */     .registerTypeAdapter(ccu.class, new ccu.a())
/* 26 */     .registerTypeAdapter(cco.class, new cco.a())
/* 27 */     .registerTypeAdapter(ccq.class, new ccq.a())
/* 28 */     .registerTypeHierarchyAdapter(ccp.class, new ccp.a())
/* 29 */     .registerTypeHierarchyAdapter(ccy.class, new ccz.a())
/* 30 */     .registerTypeHierarchyAdapter(cdk.class, new cdl.a())
/* 31 */     .registerTypeHierarchyAdapter(ccr.b.class, new ccr.b.a())
/* 32 */     .create();
/*    */   
/* 34 */   private final Map<pc, ccq> e = Maps.newHashMap();
/* 35 */   public static final int a = "loot_tables/".length();
/*    */   
/* 37 */   public static final int b = ".json".length();
/*    */   
/*    */   public ccq a(pc ☃) {
/* 40 */     return this.e.getOrDefault(☃, ccq.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(vf ☃) {
/* 45 */     this.e.clear();
/*    */     
/* 47 */     for (pc pc1 : ☃.a("loot_tables", ☃ -> ☃.endsWith(".json"))) {
/* 48 */       String str = pc1.a();
/* 49 */       pc pc2 = new pc(pc1.b(), str.substring(a, str.length() - b));
/* 50 */       try (ve ☃ = ☃.a(pc1)) {
/* 51 */         ccq ccq = xj.<ccq>a(d, IOUtils.toString(ve.b(), StandardCharsets.UTF_8), ccq.class);
/* 52 */         if (ccq != null) {
/* 53 */           this.e.put(pc2, ccq);
/*    */         }
/* 55 */       } catch (Throwable throwable) {
/* 56 */         c.error("Couldn't read loot table {} from {}", pc2, pc1, throwable);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */