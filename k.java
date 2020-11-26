/*     */ import com.google.common.collect.Iterators;
/*     */ import it.unimi.dsi.fastutil.Hash;
/*     */ import java.lang.management.ManagementFactory;
/*     */ import java.lang.management.RuntimeMXBean;
/*     */ import java.nio.file.InvalidPathException;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.time.Instant;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ExecutionException;
/*     */ import java.util.concurrent.FutureTask;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.LongSupplier;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.regex.Pattern;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
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
/*     */ public class k
/*     */ {
/*  42 */   public static LongSupplier a = System::nanoTime;
/*     */   
/*  44 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  46 */   private static final Pattern c = Pattern.compile(".*\\.|(?:CON|PRN|AUX|NUL|COM1|COM2|COM3|COM4|COM5|COM6|COM7|COM8|COM9|LPT1|LPT2|LPT3|LPT4|LPT5|LPT6|LPT7|LPT8|LPT9)(?:\\..*)?", 2);
/*     */   
/*     */   public static <K, V> Collector<Map.Entry<? extends K, ? extends V>, ?, Map<K, V>> a() {
/*  49 */     return Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T extends Comparable<T>> String a(bmm<T> ☃, Object object) {
/*  54 */     return ☃.a((T)object);
/*     */   }
/*     */   
/*     */   public static String a(String ☃, @Nullable pc pc1) {
/*  58 */     if (pc1 == null) {
/*  59 */       return ☃ + ".unregistered_sadface";
/*     */     }
/*  61 */     return ☃ + '.' + pc1.b() + '.' + pc1.a().replace('/', '.');
/*     */   }
/*     */   
/*     */   public static long b() {
/*  65 */     return c() / 1000000L;
/*     */   }
/*     */   
/*     */   public static long c() {
/*  69 */     return a.getAsLong();
/*     */   }
/*     */   
/*     */   public static long d() {
/*  73 */     return Instant.now().toEpochMilli();
/*     */   }
/*     */   
/*     */   public enum b {
/*  77 */     a,
/*  78 */     b,
/*  79 */     c
/*     */     {
/*     */ 
/*     */ 
/*     */     
/*     */     },
/*  85 */     d
/*     */     {
/*     */ 
/*     */ 
/*     */     
/*     */     },
/*  91 */     e;
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
/*     */   public static b e() {
/* 143 */     String ☃ = System.getProperty("os.name").toLowerCase(Locale.ROOT);
/* 144 */     if (☃.contains("win")) {
/* 145 */       return b.c;
/*     */     }
/* 147 */     if (☃.contains("mac")) {
/* 148 */       return b.d;
/*     */     }
/* 150 */     if (☃.contains("solaris")) {
/* 151 */       return b.b;
/*     */     }
/* 153 */     if (☃.contains("sunos")) {
/* 154 */       return b.b;
/*     */     }
/* 156 */     if (☃.contains("linux")) {
/* 157 */       return b.a;
/*     */     }
/* 159 */     if (☃.contains("unix")) {
/* 160 */       return b.a;
/*     */     }
/* 162 */     return b.e;
/*     */   }
/*     */   
/*     */   public static Stream<String> f() {
/* 166 */     RuntimeMXBean ☃ = ManagementFactory.getRuntimeMXBean();
/* 167 */     return ☃.getInputArguments().stream().filter(☃ -> ☃.startsWith("-X"));
/*     */   }
/*     */   
/*     */   public static boolean a(Path ☃) {
/* 171 */     Path path = ☃.normalize();
/* 172 */     return path.equals(☃);
/*     */   }
/*     */   
/*     */   public static boolean b(Path ☃) {
/* 176 */     for (Path path : ☃) {
/* 177 */       if (c.matcher(path.toString()).matches()) {
/* 178 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 182 */     return true;
/*     */   }
/*     */   
/*     */   public static Path a(Path ☃, String str1, String str2) {
/* 186 */     String str = str1 + str2;
/* 187 */     Path path = Paths.get(str, new String[0]);
/*     */     
/* 189 */     if (path.endsWith(str2)) {
/* 190 */       throw new InvalidPathException(str, "empty resource name");
/*     */     }
/*     */     
/* 193 */     return ☃.resolve(path);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <V> V a(FutureTask<V> ☃, Logger logger) {
/*     */     try {
/* 199 */       ☃.run();
/* 200 */       return ☃.get();
/* 201 */     } catch (ExecutionException executionException) {
/* 202 */       logger.fatal("Error executing task", executionException);
/* 203 */     } catch (InterruptedException interruptedException) {
/* 204 */       logger.fatal("Error executing task", interruptedException);
/*     */     } 
/*     */     
/* 207 */     return null;
/*     */   }
/*     */   
/*     */   public static <T> T a(List<T> ☃) {
/* 211 */     return ☃.get(☃.size() - 1);
/*     */   }
/*     */   
/*     */   public static <T> T a(Iterable<T> ☃, @Nullable T t) {
/* 215 */     Iterator<T> iterator = ☃.iterator();
/* 216 */     T t1 = iterator.next();
/*     */     
/* 218 */     if (t != null) {
/* 219 */       T t2 = t1;
/*     */       while (true) {
/* 221 */         if (t2 == t) {
/* 222 */           if (iterator.hasNext()) {
/* 223 */             return iterator.next();
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/* 228 */         if (iterator.hasNext()) {
/* 229 */           t2 = iterator.next();
/*     */         }
/*     */       } 
/*     */     } 
/* 233 */     return t1;
/*     */   }
/*     */   
/*     */   public static <T> T b(Iterable<T> ☃, @Nullable T t) {
/* 237 */     Iterator<T> iterator = ☃.iterator();
/* 238 */     T t1 = null;
/* 239 */     while (iterator.hasNext()) {
/* 240 */       T t2 = iterator.next();
/* 241 */       if (t2 == t) {
/* 242 */         if (t1 == null) {
/* 243 */           t1 = iterator.hasNext() ? (T)Iterators.getLast(iterator) : t;
/*     */         }
/*     */         break;
/*     */       } 
/* 247 */       t1 = t2;
/*     */     } 
/* 249 */     return t1;
/*     */   }
/*     */   
/*     */   public static <T> T a(Supplier<T> ☃) {
/* 253 */     return ☃.get();
/*     */   }
/*     */   
/*     */   public static <T> T a(T ☃, Consumer<T> consumer) {
/* 257 */     consumer.accept(☃);
/* 258 */     return ☃;
/*     */   }
/*     */   
/*     */   enum a implements Hash.Strategy<Object> {
/* 262 */     a;
/*     */ 
/*     */     
/*     */     public int hashCode(Object ☃) {
/* 266 */       return System.identityHashCode(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃, Object object1) {
/* 271 */       return (☃ == object1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static <K> Hash.Strategy<K> g() {
/* 277 */     return a.a;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */