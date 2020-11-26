/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class cdb
/*     */   extends ccy
/*     */ {
/*  26 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final a[] b;
/*     */   
/*     */   public cdb(cdk[] ☃, a[] arrayOfA) {
/*  31 */     super(☃);
/*  32 */     this.b = arrayOfA;
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ate ☃, Random random, ccr ccr1) {
/*  37 */     for (a a1 : this.b) {
/*  38 */       UUID uUID = a.a(a1);
/*  39 */       if (uUID == null) {
/*  40 */         uUID = UUID.randomUUID();
/*     */       }
/*  42 */       aew aew = a.b(a1)[random.nextInt((a.b(a1)).length)];
/*  43 */       ☃.a(a.c(a1), new afo(uUID, a.d(a1), a.e(a1).b(random), a.f(a1)), aew);
/*     */     } 
/*  45 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class b extends ccy.a<cdb> {
/*     */     public b() {
/*  50 */       super(new pc("set_attributes"), cdb.class);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃, cdb cdb1, JsonSerializationContext jsonSerializationContext) {
/*  55 */       JsonArray jsonArray = new JsonArray();
/*  56 */       for (cdb.a a1 : cdb.a(cdb1)) {
/*  57 */         jsonArray.add((JsonElement)a1.a(jsonSerializationContext));
/*     */       }
/*  59 */       ☃.add("modifiers", (JsonElement)jsonArray);
/*     */     }
/*     */ 
/*     */     
/*     */     public cdb a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/*  64 */       JsonArray jsonArray = xj.u(☃, "modifiers");
/*  65 */       cdb.a[] arrayOfA = new cdb.a[jsonArray.size()];
/*  66 */       int i = 0;
/*  67 */       for (JsonElement jsonElement : jsonArray) {
/*  68 */         arrayOfA[i++] = cdb.a.a(xj.m(jsonElement, "modifier"), jsonDeserializationContext);
/*     */       }
/*     */       
/*  71 */       if (arrayOfA.length == 0) {
/*  72 */         throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
/*     */       }
/*  74 */       return new cdb(arrayOfCdk, arrayOfA);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final String a;
/*     */     private final String b;
/*     */     private final int c;
/*     */     private final ccu d;
/*     */     @Nullable
/*     */     private final UUID e;
/*     */     private final aew[] f;
/*     */     
/*     */     private a(String ☃, String str1, int i, ccu ccu1, aew[] arrayOfAew, @Nullable UUID uUID) {
/*  88 */       this.a = ☃;
/*  89 */       this.b = str1;
/*  90 */       this.c = i;
/*  91 */       this.d = ccu1;
/*  92 */       this.e = uUID;
/*  93 */       this.f = arrayOfAew;
/*     */     }
/*     */     
/*     */     public JsonObject a(JsonSerializationContext ☃) {
/*  97 */       JsonObject jsonObject = new JsonObject();
/*  98 */       jsonObject.addProperty("name", this.a);
/*  99 */       jsonObject.addProperty("attribute", this.b);
/* 100 */       jsonObject.addProperty("operation", a(this.c));
/* 101 */       jsonObject.add("amount", ☃.serialize(this.d));
/* 102 */       if (this.e != null) {
/* 103 */         jsonObject.addProperty("id", this.e.toString());
/*     */       }
/* 105 */       if (this.f.length == 1) {
/* 106 */         jsonObject.addProperty("slot", this.f[0].d());
/*     */       } else {
/* 108 */         JsonArray jsonArray = new JsonArray();
/* 109 */         for (aew aew1 : this.f) {
/* 110 */           jsonArray.add((JsonElement)new JsonPrimitive(aew1.d()));
/*     */         }
/* 112 */         jsonObject.add("slot", (JsonElement)jsonArray);
/*     */       } 
/* 114 */       return jsonObject;
/*     */     }
/*     */     public static a a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*     */       aew[] arrayOfAew;
/* 118 */       String str1 = xj.h(☃, "name");
/* 119 */       String str2 = xj.h(☃, "attribute");
/* 120 */       int i = a(xj.h(☃, "operation"));
/* 121 */       ccu ccu1 = xj.<ccu>a(☃, "amount", jsonDeserializationContext, ccu.class);
/*     */       
/* 123 */       UUID uUID = null;
/*     */       
/* 125 */       if (xj.a(☃, "slot")) {
/* 126 */         arrayOfAew = new aew[] { aew.a(xj.h(☃, "slot")) };
/* 127 */       } else if (xj.d(☃, "slot")) {
/* 128 */         JsonArray jsonArray = xj.u(☃, "slot");
/* 129 */         arrayOfAew = new aew[jsonArray.size()];
/* 130 */         int j = 0;
/* 131 */         for (JsonElement jsonElement : jsonArray) {
/* 132 */           arrayOfAew[j++] = aew.a(xj.a(jsonElement, "slot"));
/*     */         }
/* 134 */         if (arrayOfAew.length == 0) {
/* 135 */           throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
/*     */         }
/*     */       } else {
/* 138 */         throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
/*     */       } 
/*     */       
/* 141 */       if (☃.has("id")) {
/* 142 */         String str = xj.h(☃, "id");
/*     */         try {
/* 144 */           uUID = UUID.fromString(str);
/* 145 */         } catch (IllegalArgumentException illegalArgumentException) {
/* 146 */           throw new JsonSyntaxException("Invalid attribute modifier id '" + str + "' (must be UUID format, with dashes)");
/*     */         } 
/*     */       } 
/*     */       
/* 150 */       return new a(str1, str2, i, ccu1, arrayOfAew, uUID);
/*     */     }
/*     */     
/*     */     private static String a(int ☃) {
/* 154 */       switch (☃) {
/*     */         case 0:
/* 156 */           return "addition";
/*     */         case 1:
/* 158 */           return "multiply_base";
/*     */         case 2:
/* 160 */           return "multiply_total";
/*     */       } 
/* 162 */       throw new IllegalArgumentException("Unknown operation " + ☃);
/*     */     }
/*     */     
/*     */     private static int a(String ☃) {
/* 166 */       if ("addition".equals(☃))
/* 167 */         return 0; 
/* 168 */       if ("multiply_base".equals(☃))
/* 169 */         return 1; 
/* 170 */       if ("multiply_total".equals(☃)) {
/* 171 */         return 2;
/*     */       }
/* 173 */       throw new JsonSyntaxException("Unknown attribute modifier operation " + ☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cdb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */