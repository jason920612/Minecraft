/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avq
/*     */   implements avk
/*     */ {
/*     */   private final pc a;
/*     */   private final String b;
/*     */   private final ate c;
/*     */   private final ez<avh> d;
/*     */   
/*     */   public avq(pc ☃, String str, ate ate1, ez<avh> ez1) {
/*  23 */     this.a = ☃;
/*  24 */     this.b = str;
/*  25 */     this.c = ate1;
/*  26 */     this.d = ez1;
/*     */   }
/*     */ 
/*     */   
/*     */   public pc b() {
/*  31 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public avm<?> a() {
/*  36 */     return avn.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ate d() {
/*  46 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ez<avh> e() {
/*  51 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ade ☃, axy axy1) {
/*  56 */     if (!(☃ instanceof aqc)) {
/*  57 */       return false;
/*     */     }
/*     */     
/*  60 */     aoi aoi = new aoi();
/*  61 */     int i = 0;
/*     */     
/*  63 */     for (int j = 0; j < ☃.n(); j++) {
/*  64 */       for (int k = 0; k < ☃.U_(); k++) {
/*  65 */         ate ate1 = ☃.a(k + j * ☃.U_());
/*     */         
/*  67 */         if (!ate1.a()) {
/*  68 */           i++;
/*  69 */           aoi.b(new ate(ate1.b()));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  74 */     return (i == this.d.size() && aoi.a(this, (IntList)null));
/*     */   }
/*     */ 
/*     */   
/*     */   public ate a(ade ☃) {
/*  79 */     return this.c.i();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     implements avm<avq>
/*     */   {
/*     */     public avq b(pc ☃, JsonObject jsonObject) {
/*  90 */       String str = xj.a(jsonObject, "group", "");
/*  91 */       ez<avh> ez = a(xj.u(jsonObject, "ingredients"));
/*  92 */       if (ez.isEmpty())
/*  93 */         throw new JsonParseException("No ingredients for shapeless recipe"); 
/*  94 */       if (ez.size() > 9) {
/*  95 */         throw new JsonParseException("Too many ingredients for shapeless recipe");
/*     */       }
/*     */       
/*  98 */       ate ate = avp.a(xj.t(jsonObject, "result"));
/*  99 */       return new avq(☃, str, ate, ez);
/*     */     }
/*     */     
/*     */     private static ez<avh> a(JsonArray ☃) {
/* 103 */       ez<avh> ez = ez.a();
/*     */       
/* 105 */       for (int i = 0; i < ☃.size(); i++) {
/* 106 */         avh avh = avh.a(☃.get(i));
/* 107 */         if (!avh.d()) {
/* 108 */           ez.add(avh);
/*     */         }
/*     */       } 
/*     */       
/* 112 */       return ez;
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 117 */       return "crafting_shapeless";
/*     */     }
/*     */ 
/*     */     
/*     */     public avq b(pc ☃, hy hy1) {
/* 122 */       String str = hy1.e(32767);
/* 123 */       int i = hy1.g();
/* 124 */       ez<avh> ez = ez.a(i, avh.a);
/* 125 */       for (int j = 0; j < ez.size(); j++) {
/* 126 */         ez.set(j, avh.b(hy1));
/*     */       }
/* 128 */       ate ate = hy1.k();
/* 129 */       return new avq(☃, str, ate, ez);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(hy ☃, avq avq1) {
/* 134 */       ☃.a(avq.a(avq1));
/* 135 */       ☃.d(avq.b(avq1).size());
/* 136 */       for (avh avh : avq.b(avq1)) {
/* 137 */         avh.a(☃);
/*     */       }
/* 139 */       ☃.a(avq.c(avq1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\avq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */