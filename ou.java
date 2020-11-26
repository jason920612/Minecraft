/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import io.netty.handler.codec.DecoderException;
/*     */ import io.netty.handler.codec.EncoderException;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.locks.ReadWriteLock;
/*     */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.ObjectUtils;
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
/*     */ public class ou
/*     */ {
/*  24 */   private static final Logger a = LogManager.getLogger();
/*  25 */   private static final Map<Class<? extends aer>, Integer> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   private final aer c;
/*     */   
/*  30 */   private final Map<Integer, a<?>> d = Maps.newHashMap();
/*  31 */   private final ReadWriteLock e = new ReentrantReadWriteLock();
/*     */   
/*     */   private boolean f = true;
/*     */   private boolean g;
/*     */   
/*     */   public ou(aer ☃) {
/*  37 */     this.c = ☃;
/*     */   }
/*     */   public static <T> or<T> a(Class<? extends aer> ☃, os<T> os1) {
/*     */     int i;
/*  41 */     if (a.isDebugEnabled()) {
/*     */       try {
/*  43 */         Class<?> clazz = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
/*  44 */         if (!clazz.equals(☃)) {
/*  45 */           a.debug("defineId called for: {} from {}", ☃, clazz, new RuntimeException());
/*     */         }
/*  47 */       } catch (ClassNotFoundException classNotFoundException) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  52 */     if (b.containsKey(☃)) {
/*  53 */       i = ((Integer)b.get(☃)).intValue() + 1;
/*     */     } else {
/*  55 */       int j = 0;
/*  56 */       Class<?> clazz = ☃;
/*  57 */       while (clazz != aer.class) {
/*  58 */         clazz = clazz.getSuperclass();
/*  59 */         if (b.containsKey(clazz)) {
/*  60 */           j = ((Integer)b.get(clazz)).intValue() + 1;
/*     */           break;
/*     */         } 
/*     */       } 
/*  64 */       i = j;
/*     */     } 
/*  66 */     if (i > 254) {
/*  67 */       throw new IllegalArgumentException("Data value id is too big with " + i + "! (Max is " + 'þ' + ")");
/*     */     }
/*  69 */     b.put(☃, Integer.valueOf(i));
/*  70 */     return os1.a(i);
/*     */   }
/*     */   
/*     */   public <T> void a(or<T> ☃, T t) {
/*  74 */     int i = ☃.a();
/*  75 */     if (i > 254) {
/*  76 */       throw new IllegalArgumentException("Data value id is too big with " + i + "! (Max is " + 'þ' + ")");
/*     */     }
/*  78 */     if (this.d.containsKey(Integer.valueOf(i))) {
/*  79 */       throw new IllegalArgumentException("Duplicate id value for " + i + "!");
/*     */     }
/*  81 */     if (ot.b(☃.b()) < 0) {
/*  82 */       throw new IllegalArgumentException("Unregistered serializer " + ☃.b() + " for " + i + "!");
/*     */     }
/*     */     
/*  85 */     c(☃, t);
/*     */   }
/*     */   
/*     */   private <T> void c(or<T> ☃, T t) {
/*  89 */     a<T> a = new a<>(☃, t);
/*  90 */     this.e.writeLock().lock();
/*  91 */     this.d.put(Integer.valueOf(☃.a()), a);
/*  92 */     this.f = false;
/*  93 */     this.e.writeLock().unlock();
/*     */   }
/*     */ 
/*     */   
/*     */   private <T> a<T> b(or<T> ☃) {
/*     */     a<T> a;
/*  99 */     this.e.readLock().lock();
/*     */     
/*     */     try {
/* 102 */       a = (a<T>)this.d.get(Integer.valueOf(☃.a()));
/* 103 */     } catch (Throwable throwable) {
/* 104 */       b b = b.a(throwable, "Getting synched entity data");
/* 105 */       c c = b.a("Synched entity data");
/*     */       
/* 107 */       c.a("Data ID", ☃);
/* 108 */       throw new h(b);
/*     */     } 
/*     */     
/* 111 */     this.e.readLock().unlock();
/* 112 */     return a;
/*     */   }
/*     */   
/*     */   public <T> T a(or<T> ☃) {
/* 116 */     return b(☃).b();
/*     */   }
/*     */   
/*     */   public <T> void b(or<T> ☃, T t) {
/* 120 */     a<T> a = b(☃);
/*     */ 
/*     */     
/* 123 */     if (ObjectUtils.notEqual(t, a.b())) {
/* 124 */       a.a(t);
/* 125 */       this.c.a(☃);
/* 126 */       a.a(true);
/* 127 */       this.g = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 132 */     return this.g;
/*     */   }
/*     */   
/*     */   public static void a(List<a<?>> ☃, hy hy1) throws IOException {
/* 136 */     if (☃ != null) {
/* 137 */       for (int i = 0, j = ☃.size(); i < j; i++) {
/* 138 */         a(hy1, ☃.get(i));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 143 */     hy1.writeByte(255);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public List<a<?>> b() {
/* 148 */     List<a<?>> ☃ = null;
/*     */     
/* 150 */     if (this.g) {
/* 151 */       this.e.readLock().lock();
/* 152 */       for (a<?> a : this.d.values()) {
/* 153 */         if (a.c()) {
/* 154 */           a.a(false);
/*     */           
/* 156 */           if (☃ == null) {
/* 157 */             ☃ = Lists.newArrayList();
/*     */           }
/* 159 */           ☃.add(a.d());
/*     */         } 
/*     */       } 
/* 162 */       this.e.readLock().unlock();
/*     */     } 
/* 164 */     this.g = false;
/*     */     
/* 166 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/* 170 */     this.e.readLock().lock();
/* 171 */     for (a<?> a : this.d.values()) {
/* 172 */       a(☃, a);
/*     */     }
/* 174 */     this.e.readLock().unlock();
/*     */ 
/*     */     
/* 177 */     ☃.writeByte(255);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public List<a<?>> c() {
/* 182 */     List<a<?>> ☃ = null;
/*     */     
/* 184 */     this.e.readLock().lock();
/* 185 */     for (a<?> a : this.d.values()) {
/* 186 */       if (☃ == null) {
/* 187 */         ☃ = Lists.newArrayList();
/*     */       }
/* 189 */       ☃.add(a.d());
/*     */     } 
/* 191 */     this.e.readLock().unlock();
/*     */     
/* 193 */     return ☃;
/*     */   }
/*     */   
/*     */   private static <T> void a(hy ☃, a<T> a1) throws IOException {
/* 197 */     or<T> or = a1.a();
/* 198 */     int i = ot.b(or.b());
/* 199 */     if (i < 0) {
/* 200 */       throw new EncoderException("Unknown serializer type " + or.b());
/*     */     }
/* 202 */     ☃.writeByte(or.a());
/* 203 */     ☃.d(i);
/* 204 */     or.b().a(☃, a1.b());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static List<a<?>> b(hy ☃) throws IOException {
/* 209 */     List<a<?>> list = null;
/*     */     
/*     */     int i;
/* 212 */     while ((i = ☃.readUnsignedByte()) != 255) {
/* 213 */       if (list == null) {
/* 214 */         list = Lists.newArrayList();
/*     */       }
/*     */       
/* 217 */       int j = ☃.g();
/* 218 */       os<?> os = ot.a(j);
/* 219 */       if (os == null) {
/* 220 */         throw new DecoderException("Unknown serializer type " + j);
/*     */       }
/*     */       
/* 223 */       list.add(a(☃, i, os));
/*     */     } 
/*     */     
/* 226 */     return list;
/*     */   }
/*     */   
/*     */   private static <T> a<T> a(hy ☃, int i, os<T> os1) {
/* 230 */     return new a<>(os1.a(i), os1.a(☃));
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
/*     */   public boolean d() {
/* 254 */     return this.f;
/*     */   }
/*     */   
/*     */   public void e() {
/* 258 */     this.g = false;
/*     */     
/* 260 */     this.e.readLock().lock();
/* 261 */     for (a<?> ☃ : this.d.values()) {
/* 262 */       ☃.a(false);
/*     */     }
/* 264 */     this.e.readLock().unlock();
/*     */   }
/*     */   
/*     */   public static class a<T> {
/*     */     private final or<T> a;
/*     */     private T b;
/*     */     private boolean c;
/*     */     
/*     */     public a(or<T> ☃, T t) {
/* 273 */       this.a = ☃;
/* 274 */       this.b = t;
/* 275 */       this.c = true;
/*     */     }
/*     */     
/*     */     public or<T> a() {
/* 279 */       return this.a;
/*     */     }
/*     */     
/*     */     public void a(T ☃) {
/* 283 */       this.b = ☃;
/*     */     }
/*     */     
/*     */     public T b() {
/* 287 */       return this.b;
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 291 */       return this.c;
/*     */     }
/*     */     
/*     */     public void a(boolean ☃) {
/* 295 */       this.c = ☃;
/*     */     }
/*     */     
/*     */     public a<T> d() {
/* 299 */       return new a(this.a, this.a.b().a(this.b));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ou.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */