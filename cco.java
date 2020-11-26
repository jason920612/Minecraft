/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cco
/*    */ {
/*    */   private final ccp[] a;
/*    */   private final cdk[] b;
/*    */   private final ccu c;
/*    */   private final ccu d;
/*    */   
/*    */   public cco(ccp[] ☃, cdk[] arrayOfCdk, ccu ccu1, ccu ccu2) {
/* 30 */     this.a = ☃;
/* 31 */     this.b = arrayOfCdk;
/* 32 */     this.c = ccu1;
/* 33 */     this.d = ccu2;
/*    */   }
/*    */   
/*    */   protected void a(Collection<ate> ☃, Random random, ccr ccr1) {
/* 37 */     List<ccp> list = Lists.newArrayList();
/* 38 */     int i = 0;
/* 39 */     for (ccp ccp1 : this.a) {
/* 40 */       if (cdl.a(ccp1.e, random, ccr1)) {
/* 41 */         int k = ccp1.a(ccr1.g());
/* 42 */         if (k > 0) {
/* 43 */           list.add(ccp1);
/* 44 */           i += k;
/*    */         } 
/*    */       } 
/*    */     } 
/* 48 */     if (i == 0 || list.isEmpty()) {
/*    */       return;
/*    */     }
/* 51 */     int j = random.nextInt(i);
/* 52 */     for (ccp ccp1 : list) {
/* 53 */       j -= ccp1.a(ccr1.g());
/* 54 */       if (j < 0) {
/* 55 */         ccp1.a(☃, random, ccr1);
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void b(Collection<ate> ☃, Random random, ccr ccr1) {
/* 62 */     if (!cdl.a(this.b, random, ccr1)) {
/*    */       return;
/*    */     }
/* 65 */     int i = this.c.a(random) + xq.d(this.d.b(random) * ccr1.g());
/* 66 */     for (int j = 0; j < i; j++)
/* 67 */       a(☃, random, ccr1); 
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements JsonDeserializer<cco>, JsonSerializer<cco>
/*    */   {
/*    */     public cco a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 74 */       JsonObject jsonObject = xj.m(☃, "loot pool");
/* 75 */       ccp[] arrayOfCcp = xj.<ccp[]>a(jsonObject, "entries", jsonDeserializationContext, (Class)ccp[].class);
/* 76 */       cdk[] arrayOfCdk = xj.<cdk[]>a(jsonObject, "conditions", new cdk[0], jsonDeserializationContext, (Class)cdk[].class);
/* 77 */       ccu ccu1 = xj.<ccu>a(jsonObject, "rolls", jsonDeserializationContext, ccu.class);
/* 78 */       ccu ccu2 = xj.<ccu>a(jsonObject, "bonus_rolls", new ccu(0.0F, 0.0F), jsonDeserializationContext, ccu.class);
/* 79 */       return new cco(arrayOfCcp, arrayOfCdk, ccu1, ccu2);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonElement a(cco ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 84 */       JsonObject jsonObject = new JsonObject();
/* 85 */       jsonObject.add("entries", jsonSerializationContext.serialize(cco.a(☃)));
/* 86 */       jsonObject.add("rolls", jsonSerializationContext.serialize(cco.b(☃)));
/* 87 */       if (cco.c(☃).a() != 0.0F && cco.c(☃).b() != 0.0F) {
/* 88 */         jsonObject.add("bonus_rolls", jsonSerializationContext.serialize(cco.c(☃)));
/*    */       }
/* 90 */       if (!ArrayUtils.isEmpty((Object[])cco.d(☃))) {
/* 91 */         jsonObject.add("conditions", jsonSerializationContext.serialize(cco.d(☃)));
/*    */       }
/*    */       
/* 94 */       return (JsonElement)jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cco.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */