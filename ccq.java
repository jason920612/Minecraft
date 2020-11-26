/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ccq
/*     */ {
/*  25 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  27 */   public static final ccq a = new ccq(new cco[0]);
/*     */   
/*     */   private final cco[] c;
/*     */   
/*     */   public ccq(cco[] ☃) {
/*  32 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public List<ate> a(Random ☃, ccr ccr1) {
/*  36 */     List<ate> list = Lists.newArrayList();
/*  37 */     if (ccr1.a(this)) {
/*  38 */       for (cco cco1 : this.c) {
/*  39 */         cco1.b(list, ☃, ccr1);
/*     */       }
/*  41 */       ccr1.b(this);
/*     */     } else {
/*  43 */       b.warn("Detected infinite loop in loot tables");
/*     */     } 
/*  45 */     return list;
/*     */   }
/*     */   
/*     */   public void a(ade ☃, Random random, ccr ccr1) {
/*  49 */     List<ate> list = a(random, ccr1);
/*  50 */     List<Integer> list1 = a(☃, random);
/*  51 */     a(list, list1.size(), random);
/*  52 */     for (ate ate : list) {
/*  53 */       if (list1.isEmpty()) {
/*  54 */         b.warn("Tried to over-fill a container");
/*     */         
/*     */         return;
/*     */       } 
/*  58 */       if (ate.a()) {
/*  59 */         ☃.a(((Integer)list1.remove(list1.size() - 1)).intValue(), ate.a); continue;
/*     */       } 
/*  61 */       ☃.a(((Integer)list1.remove(list1.size() - 1)).intValue(), ate);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(List<ate> ☃, int i, Random random) {
/*  67 */     List<ate> list = Lists.newArrayList();
/*  68 */     for (Iterator<ate> iterator = ☃.iterator(); iterator.hasNext(); ) {
/*  69 */       ate ate = iterator.next();
/*  70 */       if (ate.a()) {
/*  71 */         iterator.remove(); continue;
/*  72 */       }  if (ate.C() > 1) {
/*  73 */         list.add(ate);
/*  74 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */     
/*  78 */     while (i - ☃.size() - list.size() > 0 && !list.isEmpty()) {
/*  79 */       ate ate1 = list.remove(xq.a(random, 0, list.size() - 1));
/*  80 */       int j = xq.a(random, 1, ate1.C() / 2);
/*  81 */       ate ate2 = ate1.a(j);
/*     */       
/*  83 */       if (ate1.C() > 1 && random.nextBoolean()) {
/*  84 */         list.add(ate1);
/*     */       } else {
/*  86 */         ☃.add(ate1);
/*     */       } 
/*     */       
/*  89 */       if (ate2.C() > 1 && random.nextBoolean()) {
/*  90 */         list.add(ate2); continue;
/*     */       } 
/*  92 */       ☃.add(ate2);
/*     */     } 
/*     */ 
/*     */     
/*  96 */     ☃.addAll(list);
/*     */     
/*  98 */     Collections.shuffle(☃, random);
/*     */   }
/*     */   
/*     */   private List<Integer> a(ade ☃, Random random) {
/* 102 */     List<Integer> list = Lists.newArrayList();
/*     */     
/* 104 */     for (int i = 0; i < ☃.T_(); i++) {
/* 105 */       if (☃.a(i).a()) {
/* 106 */         list.add(Integer.valueOf(i));
/*     */       }
/*     */     } 
/*     */     
/* 110 */     Collections.shuffle(list, random);
/* 111 */     return list;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<ccq>, JsonSerializer<ccq> {
/*     */     public ccq a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 117 */       JsonObject jsonObject = xj.m(☃, "loot table");
/* 118 */       cco[] arrayOfCco = xj.<cco[]>a(jsonObject, "pools", new cco[0], jsonDeserializationContext, (Class)cco[].class);
/* 119 */       return new ccq(arrayOfCco);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a(ccq ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 124 */       JsonObject jsonObject = new JsonObject();
/* 125 */       jsonObject.add("pools", jsonSerializationContext.serialize(ccq.a(☃)));
/*     */       
/* 127 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ccq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */