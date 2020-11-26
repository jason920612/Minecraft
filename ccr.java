/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.TypeAdapter;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.google.gson.stream.JsonWriter;
/*     */ import java.io.IOException;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ccr
/*     */ {
/*     */   private final float a;
/*     */   private final td b;
/*     */   private final cct c;
/*     */   @Nullable
/*     */   private final aer d;
/*     */   @Nullable
/*     */   private final aog e;
/*     */   @Nullable
/*     */   private final aea f;
/*     */   @Nullable
/*     */   private final el g;
/*  29 */   private final Set<ccq> h = Sets.newLinkedHashSet();
/*     */   
/*     */   public ccr(float ☃, td td1, cct cct1, @Nullable aer aer1, @Nullable aog aog1, @Nullable aea aea1, @Nullable el el1) {
/*  32 */     this.a = ☃;
/*  33 */     this.b = td1;
/*  34 */     this.c = cct1;
/*  35 */     this.d = aer1;
/*  36 */     this.e = aog1;
/*  37 */     this.f = aea1;
/*  38 */     this.g = el1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer a() {
/*  43 */     return this.d;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer b() {
/*  48 */     return this.e;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer c() {
/*  53 */     return (this.f == null) ? null : this.f.k();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public el e() {
/*  63 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean a(ccq ☃) {
/*  67 */     return this.h.add(☃);
/*     */   }
/*     */   
/*     */   public void b(ccq ☃) {
/*  71 */     this.h.remove(☃);
/*     */   }
/*     */   
/*     */   public cct f() {
/*  75 */     return this.c;
/*     */   }
/*     */   
/*     */   public float g() {
/*  79 */     return this.a;
/*     */   }
/*     */   
/*     */   public td h() {
/*  83 */     return this.b;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aer a(b ☃) {
/*  88 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*  90 */         return a();
/*     */       case 2:
/*  92 */         return c();
/*     */       case 3:
/*  94 */         return b();
/*     */     } 
/*  96 */     return null;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final td a;
/*     */     private float b;
/*     */     private aer c;
/*     */     private aog d;
/*     */     private aea e;
/*     */     private el f;
/*     */     
/*     */     public a(td ☃) {
/* 108 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public a a(float ☃) {
/* 112 */       this.b = ☃;
/* 113 */       return this;
/*     */     }
/*     */     
/*     */     public a a(aer ☃) {
/* 117 */       this.c = ☃;
/* 118 */       return this;
/*     */     }
/*     */     
/*     */     public a a(aog ☃) {
/* 122 */       this.d = ☃;
/* 123 */       return this;
/*     */     }
/*     */     
/*     */     public a a(aea ☃) {
/* 127 */       this.e = ☃;
/* 128 */       return this;
/*     */     }
/*     */     
/*     */     public a a(el ☃) {
/* 132 */       this.f = ☃;
/* 133 */       return this;
/*     */     }
/*     */     
/*     */     public ccr a() {
/* 137 */       return new ccr(this.b, this.a, this.a.z().aN(), this.c, this.d, this.e, this.f);
/*     */     }
/*     */   }
/*     */   
/*     */   public enum b {
/* 142 */     a("this"),
/* 143 */     b("killer"),
/* 144 */     c("killer_player");
/*     */     
/*     */     private final String d;
/*     */ 
/*     */     
/*     */     b(String ☃) {
/* 150 */       this.d = ☃;
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 154 */       for (b b1 : values()) {
/* 155 */         if (b1.d.equals(☃)) {
/* 156 */           return b1;
/*     */         }
/*     */       } 
/* 159 */       throw new IllegalArgumentException("Invalid entity target " + ☃);
/*     */     }
/*     */     
/*     */     public static class a
/*     */       extends TypeAdapter<b> {
/*     */       public void a(JsonWriter ☃, ccr.b b1) throws IOException {
/* 165 */         ☃.value(ccr.b.a(b1));
/*     */       }
/*     */ 
/*     */       
/*     */       public ccr.b a(JsonReader ☃) throws IOException {
/* 170 */         return ccr.b.a(☃.nextString());
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ccr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */