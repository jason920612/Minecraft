/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import java.text.ParseException;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class r
/*    */ {
/* 14 */   private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
/*    */   
/*    */   private Date b;
/*    */   
/*    */   public boolean a() {
/* 19 */     return (this.b != null);
/*    */   }
/*    */   
/*    */   public void b() {
/* 23 */     this.b = new Date();
/*    */   }
/*    */   
/*    */   public void c() {
/* 27 */     this.b = null;
/*    */   }
/*    */   
/*    */   public Date d() {
/* 31 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 36 */     return "CriterionProgress{obtained=" + ((this.b == null) ? "false" : (String)this.b) + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(hy ☃) {
/* 42 */     ☃.writeBoolean((this.b != null));
/* 43 */     if (this.b != null) {
/* 44 */       ☃.a(this.b);
/*    */     }
/*    */   }
/*    */   
/*    */   public JsonElement e() {
/* 49 */     if (this.b != null) {
/* 50 */       return (JsonElement)new JsonPrimitive(a.format(this.b));
/*    */     }
/* 52 */     return (JsonElement)JsonNull.INSTANCE;
/*    */   }
/*    */ 
/*    */   
/*    */   public static r b(hy ☃) {
/* 57 */     r r1 = new r();
/* 58 */     if (☃.readBoolean()) {
/* 59 */       r1.b = ☃.m();
/*    */     }
/* 61 */     return r1;
/*    */   }
/*    */   
/*    */   public static r a(String ☃) {
/* 65 */     r r1 = new r();
/*    */     try {
/* 67 */       r1.b = a.parse(☃);
/* 68 */     } catch (ParseException parseException) {
/* 69 */       throw new JsonSyntaxException("Invalid datetime: " + ☃, parseException);
/*    */     } 
/* 71 */     return r1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */