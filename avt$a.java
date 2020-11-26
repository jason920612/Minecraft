/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
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
/*     */ public class a
/*     */   implements avm<avt>
/*     */ {
/*     */   public avt b(pc ☃, JsonObject jsonObject) {
/*     */     avh avh;
/*     */     ate ate;
/*  86 */     String str1 = xj.a(jsonObject, "group", "");
/*     */ 
/*     */     
/*  89 */     if (xj.d(jsonObject, "ingredient")) {
/*  90 */       avh = avh.a((JsonElement)xj.u(jsonObject, "ingredient"));
/*     */     } else {
/*  92 */       avh = avh.a((JsonElement)xj.t(jsonObject, "ingredient"));
/*     */     } 
/*     */ 
/*     */     
/*  96 */     String str2 = xj.h(jsonObject, "result");
/*  97 */     ata ata = fc.s.b(new pc(str2));
/*  98 */     if (ata != null) {
/*  99 */       ate = new ate(ata);
/*     */     } else {
/* 101 */       throw new IllegalStateException(str2 + " did not exist");
/*     */     } 
/* 103 */     float f = xj.a(jsonObject, "experience", 0.0F);
/* 104 */     int i = xj.a(jsonObject, "cookingtime", 200);
/*     */     
/* 106 */     return new avt(☃, str1, avh, ate, f, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public avt b(pc ☃, hy hy1) {
/* 111 */     String str = hy1.e(32767);
/* 112 */     avh avh = avh.b(hy1);
/* 113 */     ate ate = hy1.k();
/* 114 */     float f = hy1.readFloat();
/* 115 */     int i = hy1.g();
/* 116 */     return new avt(☃, str, avh, ate, f, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃, avt avt1) {
/* 121 */     ☃.a(avt.a(avt1));
/* 122 */     avt.b(avt1).a(☃);
/* 123 */     ☃.a(avt.c(avt1));
/* 124 */     ☃.writeFloat(avt.d(avt1));
/* 125 */     ☃.d(avt.e(avt1));
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 130 */     return "smelting";
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avt$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */