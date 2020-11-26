/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Collection;
/*    */ import java.util.Random;
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
/*    */ public class ccn
/*    */   extends ccp
/*    */ {
/*    */   protected final ata a;
/*    */   protected final ccy[] b;
/*    */   
/*    */   public ccn(ata ☃, int i, int j, ccy[] arrayOfCcy, cdk[] arrayOfCdk) {
/* 23 */     super(i, j, arrayOfCdk);
/* 24 */     this.a = ☃;
/* 25 */     this.b = arrayOfCcy;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Collection<ate> ☃, Random random, ccr ccr1) {
/* 30 */     ate ate = new ate(this.a);
/* 31 */     for (ccy ccy1 : this.b) {
/* 32 */       if (cdl.a(ccy1.b(), random, ccr1)) {
/* 33 */         ate = ccy1.a(ate, random, ccr1);
/*    */       }
/*    */     } 
/*    */     
/* 37 */     if (!ate.a()) {
/* 38 */       if (ate.C() < this.a.i()) {
/* 39 */         ☃.add(ate);
/*    */       } else {
/* 41 */         int i = ate.C();
/* 42 */         while (i > 0) {
/* 43 */           ate ate1 = ate.i();
/* 44 */           ate1.e(Math.min(ate.c(), i));
/* 45 */           i -= ate1.C();
/* 46 */           ☃.add(ate1);
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃, JsonSerializationContext jsonSerializationContext) {
/* 54 */     if (this.b != null && this.b.length > 0) {
/* 55 */       ☃.add("functions", jsonSerializationContext.serialize(this.b));
/*    */     }
/*    */     
/* 58 */     pc pc = fc.s.b(this.a);
/* 59 */     if (pc == null) {
/* 60 */       throw new IllegalArgumentException("Can't serialize unknown item " + this.a);
/*    */     }
/*    */     
/* 63 */     ☃.addProperty("name", pc.toString());
/*    */   }
/*    */   public static ccn a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, cdk[] arrayOfCdk) {
/*    */     ccy[] arrayOfCcy;
/* 67 */     ata ata1 = xj.i(☃, "name");
/*    */ 
/*    */     
/* 70 */     if (☃.has("functions")) {
/* 71 */       arrayOfCcy = xj.<ccy[]>a(☃, "functions", jsonDeserializationContext, (Class)ccy[].class);
/*    */     } else {
/* 73 */       arrayOfCcy = new ccy[0];
/*    */     } 
/*    */     
/* 76 */     return new ccn(ata1, i, j, arrayOfCcy, arrayOfCdk);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ccn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */