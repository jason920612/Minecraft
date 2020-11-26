/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bl
/*     */   implements s<bl.b>
/*     */ {
/*  19 */   private static final pc a = new pc("used_ender_eye");
/*     */   
/*  21 */   private final Map<pm, a> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   public pc a() {
/*  25 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃, s.a<b> a1) {
/*  30 */     a a2 = this.b.get(☃);
/*  31 */     if (a2 == null) {
/*  32 */       a2 = new a(☃);
/*  33 */       this.b.put(☃, a2);
/*     */     } 
/*  35 */     a2.a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(pm ☃, s.a<b> a1) {
/*  40 */     a a2 = this.b.get(☃);
/*  41 */     if (a2 != null) {
/*  42 */       a2.b(a1);
/*  43 */       if (a2.a()) {
/*  44 */         this.b.remove(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pm ☃) {
/*  51 */     this.b.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public b b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  56 */     ba.c c = ba.c.a(☃.get("distance"));
/*  57 */     return new b(c);
/*     */   }
/*     */   
/*     */   public void a(tf ☃, el el1) {
/*  61 */     a a = this.b.get(☃.L());
/*  62 */     if (a != null) {
/*  63 */       double d1 = ☃.q - el1.o();
/*  64 */       double d2 = ☃.s - el1.q();
/*  65 */       a.a(d1 * d1 + d2 * d2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class b extends y {
/*     */     private final ba.c a;
/*     */     
/*     */     public b(ba.c ☃) {
/*  73 */       super(bl.b());
/*  74 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a(double ☃) {
/*  78 */       return this.a.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final pm a;
/*  84 */     private final Set<s.a<bl.b>> b = Sets.newHashSet();
/*     */     
/*     */     public a(pm ☃) {
/*  87 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/*  91 */       return this.b.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(s.a<bl.b> ☃) {
/*  95 */       this.b.add(☃);
/*     */     }
/*     */     
/*     */     public void b(s.a<bl.b> ☃) {
/*  99 */       this.b.remove(☃);
/*     */     }
/*     */     
/*     */     public void a(double ☃) {
/* 103 */       List<s.a<bl.b>> list = null;
/* 104 */       for (s.a<bl.b> a1 : this.b) {
/* 105 */         if (((bl.b)a1.a()).a(☃)) {
/* 106 */           if (list == null) {
/* 107 */             list = Lists.newArrayList();
/*     */           }
/* 109 */           list.add(a1);
/*     */         } 
/*     */       } 
/* 112 */       if (list != null)
/* 113 */         for (s.a<bl.b> a1 : list)
/* 114 */           a1.a(this.a);  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */