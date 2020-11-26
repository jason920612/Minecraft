/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ot
/*     */ {
/*  22 */   private static final xg<os<?>> q = new xg<>(16);
/*     */   
/*  24 */   public static final os<Byte> a = new os<Byte>()
/*     */     {
/*     */       public void a(hy ☃, Byte byte_) {
/*  27 */         ☃.writeByte(byte_.byteValue());
/*     */       }
/*     */ 
/*     */       
/*     */       public Byte b(hy ☃) {
/*  32 */         return Byte.valueOf(☃.readByte());
/*     */       }
/*     */ 
/*     */       
/*     */       public or<Byte> a(int ☃) {
/*  37 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public Byte a(Byte ☃) {
/*  42 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/*  46 */   public static final os<Integer> b = new os<Integer>()
/*     */     {
/*     */       public void a(hy ☃, Integer integer) {
/*  49 */         ☃.d(integer.intValue());
/*     */       }
/*     */ 
/*     */       
/*     */       public Integer b(hy ☃) {
/*  54 */         return Integer.valueOf(☃.g());
/*     */       }
/*     */ 
/*     */       
/*     */       public or<Integer> a(int ☃) {
/*  59 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public Integer a(Integer ☃) {
/*  64 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/*  68 */   public static final os<Float> c = new os<Float>()
/*     */     {
/*     */       public void a(hy ☃, Float float_) {
/*  71 */         ☃.writeFloat(float_.floatValue());
/*     */       }
/*     */ 
/*     */       
/*     */       public Float b(hy ☃) {
/*  76 */         return Float.valueOf(☃.readFloat());
/*     */       }
/*     */ 
/*     */       
/*     */       public or<Float> a(int ☃) {
/*  81 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public Float a(Float ☃) {
/*  86 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/*  90 */   public static final os<String> d = new os<String>()
/*     */     {
/*     */       public void a(hy ☃, String str) {
/*  93 */         ☃.a(str);
/*     */       }
/*     */ 
/*     */       
/*     */       public String b(hy ☃) {
/*  98 */         return ☃.e(32767);
/*     */       }
/*     */ 
/*     */       
/*     */       public or<String> a(int ☃) {
/* 103 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public String a(String ☃) {
/* 108 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 112 */   public static final os<ij> e = new os<ij>()
/*     */     {
/*     */       public void a(hy ☃, ij ij1) {
/* 115 */         ☃.a(ij1);
/*     */       }
/*     */ 
/*     */       
/*     */       public ij b(hy ☃) {
/* 120 */         return ☃.f();
/*     */       }
/*     */ 
/*     */       
/*     */       public or<ij> a(int ☃) {
/* 125 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public ij a(ij ☃) {
/* 130 */         return ☃.h();
/*     */       }
/*     */     };
/*     */   
/* 134 */   public static final os<Optional<ij>> f = new os<Optional<ij>>()
/*     */     {
/*     */       public void a(hy ☃, Optional<ij> optional) {
/* 137 */         if (optional.isPresent()) {
/* 138 */           ☃.writeBoolean(true);
/* 139 */           ☃.a(optional.get());
/*     */         } else {
/* 141 */           ☃.writeBoolean(false);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<ij> b(hy ☃) {
/* 147 */         return ☃.readBoolean() ? Optional.<ij>of(☃.f()) : Optional.<ij>empty();
/*     */       }
/*     */ 
/*     */       
/*     */       public or<Optional<ij>> a(int ☃) {
/* 152 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<ij> a(Optional<ij> ☃) {
/* 157 */         return ☃.isPresent() ? Optional.<ij>of(((ij)☃.get()).h()) : Optional.<ij>empty();
/*     */       }
/*     */     };
/*     */   
/* 161 */   public static final os<ate> g = new os<ate>()
/*     */     {
/*     */       public void a(hy ☃, ate ate1) {
/* 164 */         ☃.a(ate1);
/*     */       }
/*     */ 
/*     */       
/*     */       public ate b(hy ☃) {
/* 169 */         return ☃.k();
/*     */       }
/*     */ 
/*     */       
/*     */       public or<ate> a(int ☃) {
/* 174 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public ate a(ate ☃) {
/* 179 */         return ☃.i();
/*     */       }
/*     */     };
/*     */   
/* 183 */   public static final os<Optional<blc>> h = new os<Optional<blc>>()
/*     */     {
/*     */       public void a(hy ☃, Optional<blc> optional) {
/* 186 */         if (optional.isPresent()) {
/* 187 */           ☃.d(bcs.l(optional.get()));
/*     */         } else {
/* 189 */           ☃.d(0);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<blc> b(hy ☃) {
/* 195 */         int i = ☃.g();
/* 196 */         if (i == 0) {
/* 197 */           return Optional.empty();
/*     */         }
/* 199 */         return Optional.of(bcs.a(i));
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public or<Optional<blc>> a(int ☃) {
/* 205 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<blc> a(Optional<blc> ☃) {
/* 210 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 214 */   public static final os<Boolean> i = new os<Boolean>()
/*     */     {
/*     */       public void a(hy ☃, Boolean bool) {
/* 217 */         ☃.writeBoolean(bool.booleanValue());
/*     */       }
/*     */ 
/*     */       
/*     */       public Boolean b(hy ☃) {
/* 222 */         return Boolean.valueOf(☃.readBoolean());
/*     */       }
/*     */ 
/*     */       
/*     */       public or<Boolean> a(int ☃) {
/* 227 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public Boolean a(Boolean ☃) {
/* 232 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 236 */   public static final os<fk> j = new os<fk>()
/*     */     {
/*     */       public void a(hy ☃, fk fk1) {
/* 239 */         ☃.d(fc.u.a(fk1.b()));
/* 240 */         fk1.a(☃);
/*     */       }
/*     */ 
/*     */       
/*     */       public fk b(hy ☃) {
/* 245 */         return a(☃, (fl<fk>)fc.u.a(☃.g()));
/*     */       }
/*     */       
/*     */       private <T extends fk> T a(hy ☃, fl<T> fl1) {
/* 249 */         return fl1.f().b(fl1, ☃);
/*     */       }
/*     */ 
/*     */       
/*     */       public or<fk> a(int ☃) {
/* 254 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public fk a(fk ☃) {
/* 259 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 263 */   public static final os<fd> k = new os<fd>()
/*     */     {
/*     */       public void a(hy ☃, fd fd1) {
/* 266 */         ☃.writeFloat(fd1.b());
/* 267 */         ☃.writeFloat(fd1.c());
/* 268 */         ☃.writeFloat(fd1.d());
/*     */       }
/*     */ 
/*     */       
/*     */       public fd b(hy ☃) {
/* 273 */         return new fd(☃.readFloat(), ☃.readFloat(), ☃.readFloat());
/*     */       }
/*     */ 
/*     */       
/*     */       public or<fd> a(int ☃) {
/* 278 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public fd a(fd ☃) {
/* 283 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 287 */   public static final os<el> l = new os<el>()
/*     */     {
/*     */       public void a(hy ☃, el el1) {
/* 290 */         ☃.a(el1);
/*     */       }
/*     */ 
/*     */       
/*     */       public el b(hy ☃) {
/* 295 */         return ☃.e();
/*     */       }
/*     */ 
/*     */       
/*     */       public or<el> a(int ☃) {
/* 300 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public el a(el ☃) {
/* 305 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 309 */   public static final os<Optional<el>> m = new os<Optional<el>>()
/*     */     {
/*     */       public void a(hy ☃, Optional<el> optional) {
/* 312 */         ☃.writeBoolean(optional.isPresent());
/* 313 */         if (optional.isPresent()) {
/* 314 */           ☃.a(optional.get());
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<el> b(hy ☃) {
/* 320 */         if (!☃.readBoolean()) {
/* 321 */           return Optional.empty();
/*     */         }
/* 323 */         return Optional.of(☃.e());
/*     */       }
/*     */ 
/*     */       
/*     */       public or<Optional<el>> a(int ☃) {
/* 328 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<el> a(Optional<el> ☃) {
/* 333 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 337 */   public static final os<eq> n = new os<eq>()
/*     */     {
/*     */       public void a(hy ☃, eq eq1) {
/* 340 */         ☃.a(eq1);
/*     */       }
/*     */ 
/*     */       
/*     */       public eq b(hy ☃) {
/* 345 */         return ☃.<eq>a(eq.class);
/*     */       }
/*     */ 
/*     */       
/*     */       public or<eq> a(int ☃) {
/* 350 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public eq a(eq ☃) {
/* 355 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 359 */   public static final os<Optional<UUID>> o = new os<Optional<UUID>>()
/*     */     {
/*     */       public void a(hy ☃, Optional<UUID> optional) {
/* 362 */         ☃.writeBoolean(optional.isPresent());
/* 363 */         if (optional.isPresent()) {
/* 364 */           ☃.a(optional.get());
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<UUID> b(hy ☃) {
/* 370 */         if (!☃.readBoolean()) {
/* 371 */           return Optional.empty();
/*     */         }
/* 373 */         return Optional.of(☃.i());
/*     */       }
/*     */ 
/*     */       
/*     */       public or<Optional<UUID>> a(int ☃) {
/* 378 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<UUID> a(Optional<UUID> ☃) {
/* 383 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 387 */   public static final os<gy> p = new os<gy>()
/*     */     {
/*     */       public void a(hy ☃, gy gy1) {
/* 390 */         ☃.a(gy1);
/*     */       }
/*     */ 
/*     */       
/*     */       public gy b(hy ☃) {
/* 395 */         return ☃.j();
/*     */       }
/*     */ 
/*     */       
/*     */       public or<gy> a(int ☃) {
/* 400 */         return new or<>(☃, this);
/*     */       }
/*     */ 
/*     */       
/*     */       public gy a(gy ☃) {
/* 405 */         return ☃.f();
/*     */       }
/*     */     };
/*     */   
/*     */   static {
/* 410 */     a(a);
/* 411 */     a(b);
/* 412 */     a(c);
/* 413 */     a(d);
/* 414 */     a(e);
/* 415 */     a(f);
/* 416 */     a(g);
/* 417 */     a(i);
/* 418 */     a(k);
/* 419 */     a(l);
/* 420 */     a(m);
/* 421 */     a(n);
/* 422 */     a(o);
/* 423 */     a(h);
/* 424 */     a(p);
/* 425 */     a(j);
/*     */   }
/*     */   
/*     */   public static void a(os<?> ☃) {
/* 429 */     q.c(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static os<?> a(int ☃) {
/* 434 */     return q.a(☃);
/*     */   }
/*     */   
/*     */   public static int b(os<?> ☃) {
/* 438 */     return q.a(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */