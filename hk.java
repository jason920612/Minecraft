/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.properties.Property;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public final class hk
/*     */ {
/*  35 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static GameProfile a(gy ☃) {
/*  43 */     String str1 = null;
/*  44 */     String str2 = null;
/*     */     
/*  46 */     if (☃.c("Name", 8)) {
/*  47 */       str1 = ☃.l("Name");
/*     */     }
/*  49 */     if (☃.c("Id", 8)) {
/*  50 */       str2 = ☃.l("Id");
/*     */     }
/*     */     
/*     */     try {
/*     */       UUID uUID;
/*     */       try {
/*  56 */         uUID = UUID.fromString(str2);
/*  57 */       } catch (Throwable throwable) {
/*  58 */         uUID = null;
/*     */       } 
/*  60 */       GameProfile gameProfile = new GameProfile(uUID, str1);
/*     */       
/*  62 */       if (☃.c("Properties", 10)) {
/*  63 */         gy gy1 = ☃.p("Properties");
/*     */         
/*  65 */         for (String str : gy1.c()) {
/*  66 */           he he = gy1.d(str, 10);
/*  67 */           for (int i = 0; i < he.size(); i++) {
/*  68 */             gy gy2 = he.e(i);
/*  69 */             String str3 = gy2.l("Value");
/*     */             
/*  71 */             if (gy2.c("Signature", 8)) {
/*  72 */               gameProfile.getProperties().put(str, new Property(str, str3, gy2.l("Signature")));
/*     */             } else {
/*  74 */               gameProfile.getProperties().put(str, new Property(str, str3));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*  80 */       return gameProfile;
/*  81 */     } catch (Throwable throwable) {
/*     */       
/*  83 */       return null;
/*     */     } 
/*     */   }
/*     */   public static gy a(gy ☃, GameProfile gameProfile) {
/*  87 */     if (!xw.b(gameProfile.getName())) {
/*  88 */       ☃.a("Name", gameProfile.getName());
/*     */     }
/*  90 */     if (gameProfile.getId() != null) {
/*  91 */       ☃.a("Id", gameProfile.getId().toString());
/*     */     }
/*  93 */     if (!gameProfile.getProperties().isEmpty()) {
/*  94 */       gy gy1 = new gy();
/*  95 */       for (String str : gameProfile.getProperties().keySet()) {
/*  96 */         he he = new he();
/*  97 */         for (Property property : gameProfile.getProperties().get(str)) {
/*  98 */           gy gy2 = new gy();
/*  99 */           gy2.a("Value", property.getValue());
/* 100 */           if (property.hasSignature()) {
/* 101 */             gy2.a("Signature", property.getSignature());
/*     */           }
/* 103 */           he.a(gy2);
/*     */         } 
/* 105 */         gy1.a(str, he);
/*     */       } 
/* 107 */       ☃.a("Properties", gy1);
/*     */     } 
/*     */     
/* 110 */     return ☃;
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   public static boolean a(@Nullable ho ☃, @Nullable ho ho1, boolean bool) {
/* 115 */     if (☃ == ho1) {
/* 116 */       return true;
/*     */     }
/* 118 */     if (☃ == null) {
/* 119 */       return true;
/*     */     }
/* 121 */     if (ho1 == null) {
/* 122 */       return false;
/*     */     }
/* 124 */     if (!☃.getClass().equals(ho1.getClass())) {
/* 125 */       return false;
/*     */     }
/*     */     
/* 128 */     if (☃ instanceof gy) {
/* 129 */       gy gy1 = (gy)☃;
/* 130 */       gy gy2 = (gy)ho1;
/*     */       
/* 132 */       for (String str : gy1.c()) {
/* 133 */         ho ho2 = gy1.c(str);
/* 134 */         if (!a(ho2, gy2.c(str), bool)) {
/* 135 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 139 */       return true;
/* 140 */     }  if (☃ instanceof he && bool) {
/* 141 */       he he1 = (he)☃;
/* 142 */       he he2 = (he)ho1;
/*     */       
/* 144 */       if (he1.isEmpty()) {
/* 145 */         return he2.isEmpty();
/*     */       }
/*     */       
/* 148 */       for (int i = 0; i < he1.size(); i++) {
/* 149 */         ho ho2 = he1.d(i);
/* 150 */         boolean bool1 = false;
/* 151 */         for (int j = 0; j < he2.size(); j++) {
/* 152 */           if (a(ho2, he2.d(j), bool)) {
/* 153 */             bool1 = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 157 */         if (!bool1) {
/* 158 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 162 */       return true;
/*     */     } 
/* 164 */     return ☃.equals(ho1);
/*     */   }
/*     */ 
/*     */   
/*     */   public static gy a(UUID ☃) {
/* 169 */     gy gy = new gy();
/* 170 */     gy.a("M", ☃.getMostSignificantBits());
/* 171 */     gy.a("L", ☃.getLeastSignificantBits());
/* 172 */     return gy;
/*     */   }
/*     */   
/*     */   public static UUID b(gy ☃) {
/* 176 */     return new UUID(☃.i("M"), ☃.i("L"));
/*     */   }
/*     */   
/*     */   public static el c(gy ☃) {
/* 180 */     return new el(☃.h("X"), ☃.h("Y"), ☃.h("Z"));
/*     */   }
/*     */   
/*     */   public static gy a(el ☃) {
/* 184 */     gy gy = new gy();
/* 185 */     gy.b("X", ☃.o());
/* 186 */     gy.b("Y", ☃.p());
/* 187 */     gy.b("Z", ☃.q());
/* 188 */     return gy;
/*     */   }
/*     */   
/*     */   public static blc d(gy ☃) {
/* 192 */     if (!☃.c("Name", 8)) {
/* 193 */       return bct.a.p();
/*     */     }
/*     */     
/* 196 */     bcs bcs = fc.g.a(new pc(☃.l("Name")));
/* 197 */     blc blc = bcs.p();
/*     */     
/* 199 */     if (☃.c("Properties", 10)) {
/* 200 */       gy gy1 = ☃.p("Properties");
/*     */       
/* 202 */       ble<bcs, blc> ble = bcs.o();
/* 203 */       for (String str : gy1.c()) {
/* 204 */         bmm<?> bmm = ble.a(str);
/* 205 */         if (bmm != null) {
/* 206 */           blc = a(blc, bmm, str, gy1, ☃);
/*     */         }
/*     */       } 
/*     */     } 
/* 210 */     return blc;
/*     */   }
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
/*     */   private static <S extends blf<S>, T extends Comparable<T>> S a(S ☃, bmm<T> bmm1, String str, gy gy1, gy gy2) {
/* 237 */     Optional<T> optional = bmm1.b(gy1.l(str));
/* 238 */     if (optional.isPresent()) {
/* 239 */       return (S)☃.<T, Comparable>a(bmm1, (Comparable)optional.get());
/*     */     }
/*     */     
/* 242 */     a.warn("Unable to read property: {} with value: {} for blockstate: {}", str, gy1.l(str), gy2.toString());
/* 243 */     return ☃;
/*     */   }
/*     */   
/*     */   public static gy a(blc ☃) {
/* 247 */     gy gy = new gy();
/* 248 */     gy.a("Name", fc.g.b(☃.c()).toString());
/*     */     
/* 250 */     ImmutableMap<bmm<?>, Comparable<?>> immutableMap = ☃.b();
/* 251 */     if (!immutableMap.isEmpty()) {
/* 252 */       gy gy1 = new gy();
/*     */       
/* 254 */       for (UnmodifiableIterator<Map.Entry<bmm<?>, Comparable<?>>> unmodifiableIterator = immutableMap.entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<bmm<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 255 */         bmm<?> bmm = entry.getKey();
/* 256 */         gy1.a(bmm.a(), a(bmm, entry.getValue())); }
/*     */       
/* 258 */       gy.a("Properties", gy1);
/*     */     } 
/*     */     
/* 261 */     return gy;
/*     */   }
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
/*     */   private static <T extends Comparable<T>> String a(bmm<T> ☃, Comparable<?> comparable) {
/* 285 */     return ☃.a((T)comparable);
/*     */   }
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
/*     */   public static gy a(DataFixer ☃, DSL.TypeReference typeReference, gy gy1, int i) {
/* 490 */     return a(☃, typeReference, gy1, i, 1631);
/*     */   }
/*     */   
/*     */   public static gy a(DataFixer ☃, DSL.TypeReference typeReference, gy gy1, int i, int j) {
/* 494 */     return (gy)☃.update(typeReference, new Dynamic(hj.a, gy1), i, j).getValue();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */