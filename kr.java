/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.properties.Property;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class kr
/*     */   implements iv<iy>
/*     */ {
/*     */   private a a;
/*  20 */   private final List<b> b = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public kr(a ☃, tf... arrayOfTf) {
/*  27 */     this.a = ☃;
/*     */     
/*  29 */     for (tf tf1 : arrayOfTf) {
/*  30 */       this.b.add(new b(this, tf1.do(), tf1.g, tf1.c.b(), tf1.G()));
/*     */     }
/*     */   }
/*     */   
/*     */   public kr(a ☃, Iterable<tf> iterable) {
/*  35 */     this.a = ☃;
/*     */     
/*  37 */     for (tf tf : iterable) {
/*  38 */       this.b.add(new b(this, tf.do(), tf.g, tf.c.b(), tf.G()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  44 */     this.a = ☃.<a>a(a.class);
/*     */     
/*  46 */     int i = ☃.g();
/*  47 */     for (int j = 0; j < i; j++) {
/*  48 */       int m, n; GameProfile gameProfile = null;
/*  49 */       int k = 0;
/*  50 */       axv axv = null;
/*  51 */       ij ij = null;
/*     */       
/*  53 */       switch (null.a[this.a.ordinal()]) {
/*     */         case 1:
/*  55 */           gameProfile = new GameProfile(☃.i(), ☃.e(16));
/*  56 */           m = ☃.g();
/*  57 */           for (n = 0; n < m; n++) {
/*  58 */             String str1 = ☃.e(32767);
/*  59 */             String str2 = ☃.e(32767);
/*     */             
/*  61 */             if (☃.readBoolean()) {
/*  62 */               gameProfile.getProperties().put(str1, new Property(str1, str2, ☃.e(32767)));
/*     */             } else {
/*  64 */               gameProfile.getProperties().put(str1, new Property(str1, str2));
/*     */             } 
/*     */           } 
/*  67 */           axv = axv.a(☃.g());
/*  68 */           k = ☃.g();
/*  69 */           if (☃.readBoolean()) {
/*  70 */             ij = ☃.f();
/*     */           }
/*     */           break;
/*     */         case 2:
/*  74 */           gameProfile = new GameProfile(☃.i(), null);
/*  75 */           axv = axv.a(☃.g());
/*     */           break;
/*     */         case 3:
/*  78 */           gameProfile = new GameProfile(☃.i(), null);
/*  79 */           k = ☃.g();
/*     */           break;
/*     */         case 4:
/*  82 */           gameProfile = new GameProfile(☃.i(), null);
/*  83 */           if (☃.readBoolean()) {
/*  84 */             ij = ☃.f();
/*     */           }
/*     */           break;
/*     */         case 5:
/*  88 */           gameProfile = new GameProfile(☃.i(), null);
/*     */           break;
/*     */       } 
/*     */       
/*  92 */       this.b.add(new b(this, gameProfile, k, axv, ij));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  98 */     ☃.a(this.a);
/*     */     
/* 100 */     ☃.d(this.b.size());
/* 101 */     for (b b : this.b) {
/* 102 */       switch (null.a[this.a.ordinal()]) {
/*     */         case 1:
/* 104 */           ☃.a(b.a().getId());
/* 105 */           ☃.a(b.a().getName());
/* 106 */           ☃.d(b.a().getProperties().size());
/* 107 */           for (Property property : b.a().getProperties().values()) {
/* 108 */             ☃.a(property.getName());
/* 109 */             ☃.a(property.getValue());
/* 110 */             if (property.hasSignature()) {
/* 111 */               ☃.writeBoolean(true);
/* 112 */               ☃.a(property.getSignature()); continue;
/*     */             } 
/* 114 */             ☃.writeBoolean(false);
/*     */           } 
/*     */           
/* 117 */           ☃.d(b.c().a());
/* 118 */           ☃.d(b.b());
/*     */           
/* 120 */           if (b.d() == null) {
/* 121 */             ☃.writeBoolean(false); continue;
/*     */           } 
/* 123 */           ☃.writeBoolean(true);
/* 124 */           ☃.a(b.d());
/*     */ 
/*     */         
/*     */         case 2:
/* 128 */           ☃.a(b.a().getId());
/* 129 */           ☃.d(b.c().a());
/*     */         
/*     */         case 3:
/* 132 */           ☃.a(b.a().getId());
/* 133 */           ☃.d(b.b());
/*     */         
/*     */         case 4:
/* 136 */           ☃.a(b.a().getId());
/* 137 */           if (b.d() == null) {
/* 138 */             ☃.writeBoolean(false); continue;
/*     */           } 
/* 140 */           ☃.writeBoolean(true);
/* 141 */           ☃.a(b.d());
/*     */ 
/*     */         
/*     */         case 5:
/* 145 */           ☃.a(b.a().getId());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/* 153 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum a
/*     */   {
/* 165 */     a,
/* 166 */     b,
/* 167 */     c,
/* 168 */     d,
/* 169 */     e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 175 */     return MoreObjects.toStringHelper(this)
/* 176 */       .add("action", this.a)
/* 177 */       .add("entries", this.b)
/* 178 */       .toString();
/*     */   }
/*     */   
/*     */   public kr() {}
/*     */   
/*     */   public class b {
/*     */     private final int b;
/*     */     private final axv c;
/*     */     
/*     */     public b(kr ☃, GameProfile gameProfile, int i, @Nullable axv axv1, @Nullable ij ij1) {
/* 188 */       this.d = gameProfile;
/* 189 */       this.b = i;
/* 190 */       this.c = axv1;
/* 191 */       this.e = ij1;
/*     */     }
/*     */     private final GameProfile d; private final ij e;
/*     */     public GameProfile a() {
/* 195 */       return this.d;
/*     */     }
/*     */     
/*     */     public int b() {
/* 199 */       return this.b;
/*     */     }
/*     */     
/*     */     public axv c() {
/* 203 */       return this.c;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public ij d() {
/* 208 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 213 */       return MoreObjects.toStringHelper(this)
/* 214 */         .add("latency", this.b)
/* 215 */         .add("gameMode", this.c)
/* 216 */         .add("profile", this.d)
/* 217 */         .add("displayName", (this.e == null) ? null : ij.a.a(this.e))
/* 218 */         .toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\kr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */