/*     */ import com.google.gson.TypeAdapter;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.google.gson.stream.JsonWriter;
/*     */ import java.io.IOException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum b
/*     */ {
/* 142 */   a("this"),
/* 143 */   b("killer"),
/* 144 */   c("killer_player");
/*     */   
/*     */   private final String d;
/*     */ 
/*     */   
/*     */   b(String ☃) {
/* 150 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public static b a(String ☃) {
/* 154 */     for (b b1 : values()) {
/* 155 */       if (b1.d.equals(☃)) {
/* 156 */         return b1;
/*     */       }
/*     */     } 
/* 159 */     throw new IllegalArgumentException("Invalid entity target " + ☃);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends TypeAdapter<b> {
/*     */     public void a(JsonWriter ☃, ccr.b b1) throws IOException {
/* 165 */       ☃.value(ccr.b.a(b1));
/*     */     }
/*     */ 
/*     */     
/*     */     public ccr.b a(JsonReader ☃) throws IOException {
/* 170 */       return ccr.b.a(☃.nextString());
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ccr$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */