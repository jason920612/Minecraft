/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Locale;
/*    */ import java.util.Random;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ccx
/*    */   extends ccy
/*    */ {
/* 27 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final String b;
/*    */   private final cbq.a c;
/*    */   private final byte d;
/*    */   private final int e;
/*    */   private final boolean f;
/*    */   
/*    */   public ccx(cdk[] ☃, String str, cbq.a a1, byte b, int i, boolean bool) {
/* 36 */     super(☃);
/* 37 */     this.b = str;
/* 38 */     this.c = a1;
/* 39 */     this.d = b;
/* 40 */     this.e = i;
/* 41 */     this.f = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public ate a(ate ☃, Random random, ccr ccr1) {
/* 46 */     if (☃.b() != atf.dG) {
/* 47 */       return ☃;
/*    */     }
/*    */     
/* 50 */     el el1 = ccr1.e();
/* 51 */     if (el1 == null) {
/* 52 */       return ☃;
/*    */     }
/* 54 */     td td = ccr1.h();
/*    */     
/* 56 */     el el2 = td.a(this.b, el1, this.e, this.f);
/* 57 */     if (el2 != null) {
/* 58 */       ate ate1 = atj.a(td, el2.o(), el2.q(), this.d, true, true);
/* 59 */       atj.a(td, ate1);
/* 60 */       cbs.a(ate1, el2, "+", this.c);
/* 61 */       ate1.a(new ir("filled_map." + this.b.toLowerCase(Locale.ROOT), new Object[0]));
/* 62 */       return ate1;
/*    */     } 
/*    */     
/* 65 */     return ☃;
/*    */   }
/*    */   
/*    */   public static class a extends ccy.a<ccx> {
/*    */     protected a() {
/* 70 */       super(new pc("exploration_map"), ccx.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃, ccx ccx1, JsonSerializationContext jsonSerializationContext) {
/* 75 */       ☃.add("destination", jsonSerializationContext.serialize(ccx.a(ccx1)));
/* 76 */       ☃.add("decoration", jsonSerializationContext.serialize(ccx.b(ccx1).toString().toLowerCase(Locale.ROOT)));
/*    */     }
/*    */ 
/*    */     
/*    */     public ccx a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, cdk[] arrayOfCdk) {
/* 81 */       String str1 = ☃.has("destination") ? xj.h(☃, "destination") : "Buried_Treasure";
/* 82 */       str1 = bqo.aF.containsKey(str1.toLowerCase(Locale.ROOT)) ? str1 : "Buried_Treasure";
/*    */       
/* 84 */       String str2 = ☃.has("decoration") ? xj.h(☃, "decoration") : "mansion";
/* 85 */       cbq.a a1 = cbq.a.i;
/*    */       try {
/* 87 */         a1 = cbq.a.valueOf(str2.toUpperCase(Locale.ROOT));
/* 88 */       } catch (IllegalArgumentException illegalArgumentException) {
/* 89 */         ccx.a().error("Error while parsing loot table decoration entry. Found {}. Defaulting to MANSION", str2);
/*    */       } 
/*    */       
/* 92 */       byte b = ☃.has("zoom") ? xj.o(☃, "zoom") : 2;
/*    */       
/* 94 */       int i = ☃.has("search_radius") ? xj.n(☃, "search_radius") : 50;
/*    */       
/* 96 */       boolean bool = ☃.has("skip_existing_chunks") ? xj.j(☃, "skip_existing_chunks") : true;
/*    */       
/* 98 */       return new ccx(arrayOfCdk, str1, a1, b, i, bool);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */