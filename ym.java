/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.lang.reflect.Type;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ym
/*    */   extends aao
/*    */ {
/*    */   public ym(Schema ☃, boolean bool) {
/* 23 */     super(☃, bool, "BlockEntitySignTextStrictJsonFix", aax.j, "Sign");
/*    */   }
/*    */   
/* 26 */   public static final Gson a = (new GsonBuilder())
/* 27 */     .registerTypeAdapter(ij.class, new JsonDeserializer<ij>()
/*    */       {
/*    */         public ij a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 30 */           if (☃.isJsonPrimitive())
/*    */           {
/* 32 */             return new iq(☃.getAsString()); } 
/* 33 */           if (☃.isJsonArray()) {
/*    */             
/* 35 */             JsonArray jsonArray = ☃.getAsJsonArray();
/* 36 */             ij ij = null;
/*    */             
/* 38 */             for (JsonElement jsonElement : jsonArray) {
/* 39 */               ij ij1 = a(jsonElement, jsonElement.getClass(), jsonDeserializationContext);
/* 40 */               if (ij == null) {
/* 41 */                 ij = ij1; continue;
/*    */               } 
/* 43 */               ij.a(ij1);
/*    */             } 
/*    */ 
/*    */             
/* 47 */             return ij;
/*    */           } 
/* 49 */           throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*    */         }
/* 53 */       }).create();
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃, String str) {
/* 56 */     String str1 = ☃.getString(str);
/*    */     
/* 58 */     ij ij = null;
/* 59 */     if ("null".equals(str1) || StringUtils.isEmpty(str1)) {
/* 60 */       ij = new iq("");
/* 61 */     } else if ((str1
/* 62 */       .charAt(0) == '"' && str1.charAt(str1.length() - 1) == '"') || (str1
/* 63 */       .charAt(0) == '{' && str1.charAt(str1.length() - 1) == '}')) {
/*    */       
/*    */       try {
/* 66 */         ij = xj.<ij>a(a, str1, ij.class, true);
/* 67 */         if (ij == null) {
/* 68 */           ij = new iq("");
/*    */         }
/* 70 */       } catch (JsonParseException jsonParseException) {}
/*    */ 
/*    */       
/* 73 */       if (ij == null) {
/*    */         try {
/* 75 */           ij = ij.a.a(str1);
/* 76 */         } catch (JsonParseException jsonParseException) {}
/*    */       }
/*    */ 
/*    */       
/* 80 */       if (ij == null) {
/*    */         try {
/* 82 */           ij = ij.a.b(str1);
/* 83 */         } catch (JsonParseException jsonParseException) {}
/*    */       }
/*    */ 
/*    */       
/* 87 */       if (ij == null) {
/* 88 */         ij = new iq(str1);
/*    */       }
/*    */     } else {
/* 91 */       ij = new iq(str1);
/*    */     } 
/*    */     
/* 94 */     return ☃.set(str, ☃.createString(ij.a.a(ij)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 99 */     return ☃.update(DSL.remainderFinder(), ☃ -> {
/*    */           ☃ = a(☃, "Text1");
/*    */           ☃ = a(☃, "Text2");
/*    */           ☃ = a(☃, "Text3");
/*    */           return a(☃, "Text4");
/*    */         });
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ym.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */