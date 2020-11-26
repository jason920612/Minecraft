/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class al
/*     */ {
/*  17 */   public static final al a = new al();
/*     */   
/*     */   private final awe b;
/*     */   private final ba.d c;
/*     */   
/*     */   public al() {
/*  23 */     this.b = null;
/*  24 */     this.c = ba.d.e;
/*     */   }
/*     */   
/*     */   public al(@Nullable awe ☃, ba.d d1) {
/*  28 */     this.b = ☃;
/*  29 */     this.c = d1;
/*     */   }
/*     */   
/*     */   public boolean a(Map<awe, Integer> ☃) {
/*  33 */     if (this.b != null) {
/*     */       
/*  35 */       if (!☃.containsKey(this.b)) {
/*  36 */         return false;
/*     */       }
/*  38 */       int i = ((Integer)☃.get(this.b)).intValue();
/*  39 */       if (this.c != null && !this.c.d(i)) {
/*  40 */         return false;
/*     */       }
/*  42 */     } else if (this.c != null) {
/*     */       
/*  44 */       for (Integer integer : ☃.values()) {
/*  45 */         if (this.c.d(integer.intValue())) {
/*  46 */           return true;
/*     */         }
/*     */       } 
/*  49 */       return false;
/*     */     } 
/*     */     
/*  52 */     return true;
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  56 */     if (this == a) {
/*  57 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  60 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  62 */     if (this.b != null) {
/*  63 */       ☃.addProperty("enchantment", fc.q.b(this.b).toString());
/*     */     }
/*  65 */     ☃.add("levels", this.c.d());
/*     */     
/*  67 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static al a(@Nullable JsonElement ☃) {
/*  71 */     if (☃ == null || ☃.isJsonNull()) {
/*  72 */       return a;
/*     */     }
/*  74 */     JsonObject jsonObject = xj.m(☃, "enchantment");
/*     */     
/*  76 */     awe awe1 = null;
/*  77 */     if (jsonObject.has("enchantment")) {
/*  78 */       pc pc = new pc(xj.h(jsonObject, "enchantment"));
/*  79 */       awe1 = fc.q.b(pc);
/*  80 */       if (awe1 == null) {
/*  81 */         throw new JsonSyntaxException("Unknown enchantment '" + pc + "'");
/*     */       }
/*     */     } 
/*  84 */     ba.d d1 = ba.d.a(jsonObject.get("levels"));
/*     */     
/*  86 */     return new al(awe1, d1);
/*     */   }
/*     */   
/*     */   public static al[] b(@Nullable JsonElement ☃) {
/*  90 */     if (☃ == null || ☃.isJsonNull()) {
/*  91 */       return new al[0];
/*     */     }
/*     */     
/*  94 */     JsonArray jsonArray = xj.n(☃, "enchantments");
/*  95 */     al[] arrayOfAl = new al[jsonArray.size()];
/*  96 */     for (int i = 0; i < arrayOfAl.length; i++) {
/*  97 */       arrayOfAl[i] = a(jsonArray.get(i));
/*     */     }
/*     */     
/* 100 */     return arrayOfAl;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */