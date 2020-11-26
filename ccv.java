/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class ccv
/*     */   extends ccy
/*     */ {
/*  31 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final List<awe> b;
/*     */   
/*     */   public ccv(cdk[] ☃, @Nullable List<awe> list) {
/*  36 */     super(☃);
/*  37 */     this.b = (list == null) ? Collections.<awe>emptyList() : list;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ate a(ate ☃, Random random, ccr ccr1) {
/*     */     awe awe;
/*  44 */     if (this.b.isEmpty()) {
/*  45 */       List<awe> list = Lists.newArrayList();
/*  46 */       for (awe awe1 : fc.q) {
/*  47 */         if (☃.b() == atf.aS || awe1.a(☃)) {
/*  48 */           list.add(awe1);
/*     */         }
/*     */       } 
/*  51 */       if (list.isEmpty()) {
/*  52 */         a.warn("Couldn't find a compatible enchantment for {}", ☃);
/*  53 */         return ☃;
/*     */       } 
/*  55 */       awe = list.get(random.nextInt(list.size()));
/*     */     } else {
/*  57 */       awe = this.b.get(random.nextInt(this.b.size()));
/*     */     } 
/*     */     
/*  60 */     int i = xq.a(random, awe.e(), awe.a());
/*  61 */     if (☃.b() == atf.aS) {
/*  62 */       ☃ = new ate(atf.dT);
/*  63 */       asi.a(☃, new awh(awe, i));
/*     */     } else {
/*  65 */       ☃.a(awe, i);
/*     */     } 
/*  67 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a extends ccy.a<ccv> {
/*     */     public a() {
/*  72 */       super(new pc("enchant_randomly"), ccv.class);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃, ccv ccv1, JsonSerializationContext jsonSerializationContext) {
/*  77 */       if (!ccv.a(ccv1).isEmpty()) {
/*  78 */         JsonArray jsonArray = new JsonArray();
/*  79 */         for (awe awe : ccv.a(ccv1)) {
/*  80 */           pc pc = fc.q.b(awe);
/*  81 */           if (pc == null) {
/*  82 */             throw new IllegalArgumentException("Don't know how to serialize enchantment " + awe);
/*     */           }
/*  84 */           jsonArray.add((JsonElement)new JsonPrimitive(pc.toString()));
/*     */         } 
/*  86 */         ☃.add("enchantments", (JsonElement)jsonArray);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public ccv a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/*  92 */       List<awe> list = Lists.newArrayList();
/*  93 */       if (☃.has("enchantments")) {
/*  94 */         JsonArray jsonArray = xj.u(☃, "enchantments");
/*  95 */         for (JsonElement jsonElement : jsonArray) {
/*  96 */           String str = xj.a(jsonElement, "enchantment");
/*  97 */           awe awe = fc.q.b(new pc(str));
/*  98 */           if (awe == null) {
/*  99 */             throw new JsonSyntaxException("Unknown enchantment '" + str + "'");
/*     */           }
/* 101 */           list.add(awe);
/*     */         } 
/*     */       } 
/* 104 */       return new ccv(arrayOfCdk, list);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ccv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */