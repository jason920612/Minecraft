/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class b
/*     */   extends y
/*     */ {
/*     */   private final ba.d a;
/*     */   private final ba.d b;
/*     */   private final ba.d c;
/*     */   private final av[] d;
/*     */   
/*     */   public b(ba.d ☃, ba.d d1, ba.d d2, av[] arrayOfAv) {
/*  84 */     super(at.b());
/*  85 */     this.a = ☃;
/*  86 */     this.b = d1;
/*  87 */     this.c = d2;
/*  88 */     this.d = arrayOfAv;
/*     */   }
/*     */   
/*     */   public static b a(av... ☃) {
/*  92 */     return new b(ba.d.e, ba.d.e, ba.d.e, ☃);
/*     */   }
/*     */   
/*     */   public static b a(axx... ☃) {
/*  96 */     av[] arrayOfAv = new av[☃.length];
/*  97 */     for (int i = 0; i < ☃.length; i++) {
/*  98 */       arrayOfAv[i] = new av(null, ☃[i].h(), ba.d.e, ba.d.e, new al[0], null, bc.a);
/*     */     }
/* 100 */     return a(arrayOfAv);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/* 105 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 107 */     if (!this.a.c() || !this.b.c() || !this.c.c()) {
/* 108 */       JsonObject jsonObject = new JsonObject();
/* 109 */       jsonObject.add("occupied", this.a.d());
/* 110 */       jsonObject.add("full", this.b.d());
/* 111 */       jsonObject.add("empty", this.c.d());
/* 112 */       ☃.add("slots", (JsonElement)jsonObject);
/*     */     } 
/*     */     
/* 115 */     if (this.d.length > 0) {
/* 116 */       JsonArray jsonArray = new JsonArray();
/* 117 */       for (av av1 : this.d) {
/* 118 */         jsonArray.add(av1.a());
/*     */       }
/* 120 */       ☃.add("items", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 123 */     return (JsonElement)☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aof ☃) {
/* 128 */     int i = 0;
/* 129 */     int j = 0;
/* 130 */     int k = 0;
/* 131 */     List<av> list = Lists.newArrayList((Object[])this.d);
/* 132 */     for (int m = 0; m < ☃.T_(); m++) {
/* 133 */       ate ate = ☃.a(m);
/* 134 */       if (ate.a()) {
/* 135 */         j++;
/*     */       } else {
/* 137 */         k++;
/* 138 */         if (ate.C() >= ate.c()) {
/* 139 */           i++;
/*     */         }
/* 141 */         for (Iterator<av> iterator = list.iterator(); iterator.hasNext(); ) {
/* 142 */           av av1 = iterator.next();
/* 143 */           if (av1.a(ate)) {
/* 144 */             iterator.remove();
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 149 */     if (!this.b.d(i)) {
/* 150 */       return false;
/*     */     }
/* 152 */     if (!this.c.d(j)) {
/* 153 */       return false;
/*     */     }
/* 155 */     if (!this.a.d(k)) {
/* 156 */       return false;
/*     */     }
/* 158 */     if (!list.isEmpty()) {
/* 159 */       return false;
/*     */     }
/* 161 */     return true;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\at$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */