/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.regex.Pattern;
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
/*     */ public class gy
/*     */   implements ho
/*     */ {
/*  29 */   private static final Logger f = LogManager.getLogger();
/*  30 */   private static final Pattern g = Pattern.compile("[A-Za-z0-9._+-]+");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   private final Map<String, ho> h = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  61 */     for (String str : this.h.keySet()) {
/*  62 */       ho ho1 = this.h.get(str);
/*  63 */       a(str, ho1, ☃);
/*     */     } 
/*  65 */     ☃.writeByte(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  70 */     hh1.a(384L);
/*     */     
/*  72 */     if (i > 512) {
/*  73 */       throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*     */     }
/*  75 */     this.h.clear();
/*     */     byte b;
/*  77 */     while ((b = a(☃, hh1)) != 0) {
/*  78 */       String str = b(☃, hh1);
/*  79 */       hh1.a((224 + 16 * str.length()));
/*     */       
/*  81 */       ho ho1 = a(b, str, ☃, i + 1, hh1);
/*  82 */       if (this.h.put(str, ho1) != null) {
/*  83 */         hh1.a(288L);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public Set<String> c() {
/*  89 */     return this.h.keySet();
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  94 */     return 10;
/*     */   }
/*     */   
/*     */   public int d() {
/*  98 */     return this.h.size();
/*     */   }
/*     */   
/*     */   public void a(String ☃, ho ho1) {
/* 102 */     this.h.put(☃, ho1);
/*     */   }
/*     */   
/*     */   public void a(String ☃, byte b) {
/* 106 */     this.h.put(☃, new gw(b));
/*     */   }
/*     */   
/*     */   public void a(String ☃, short s) {
/* 110 */     this.h.put(☃, new hm(s));
/*     */   }
/*     */   
/*     */   public void b(String ☃, int i) {
/* 114 */     this.h.put(☃, new hd(i));
/*     */   }
/*     */   
/*     */   public void a(String ☃, long l) {
/* 118 */     this.h.put(☃, new hg(l));
/*     */   }
/*     */   
/*     */   public void a(String ☃, UUID uUID) {
/* 122 */     a(☃ + "Most", uUID.getMostSignificantBits());
/* 123 */     a(☃ + "Least", uUID.getLeastSignificantBits());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public UUID a(String ☃) {
/* 128 */     return new UUID(i(☃ + "Most"), i(☃ + "Least"));
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/* 132 */     return (c(☃ + "Most", 99) && c(☃ + "Least", 99));
/*     */   }
/*     */   
/*     */   public void a(String ☃, float f) {
/* 136 */     this.h.put(☃, new hb(f));
/*     */   }
/*     */   
/*     */   public void a(String ☃, double d) {
/* 140 */     this.h.put(☃, new gz(d));
/*     */   }
/*     */   
/*     */   public void a(String ☃, String str1) {
/* 144 */     this.h.put(☃, new hn(str1));
/*     */   }
/*     */   
/*     */   public void a(String ☃, byte[] arrayOfByte) {
/* 148 */     this.h.put(☃, new gv(arrayOfByte));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String ☃, int[] arrayOfInt) {
/* 156 */     this.h.put(☃, new hc(arrayOfInt));
/*     */   }
/*     */   
/*     */   public void b(String ☃, List<Integer> list) {
/* 160 */     this.h.put(☃, new hc(list));
/*     */   }
/*     */   
/*     */   public void a(String ☃, long[] arrayOfLong) {
/* 164 */     this.h.put(☃, new hf(arrayOfLong));
/*     */   }
/*     */   
/*     */   public void c(String ☃, List<Long> list) {
/* 168 */     this.h.put(☃, new hf(list));
/*     */   }
/*     */   
/*     */   public void a(String ☃, boolean bool) {
/* 172 */     a(☃, bool ? 1 : 0);
/*     */   }
/*     */   
/*     */   public ho c(String ☃) {
/* 176 */     return this.h.get(☃);
/*     */   }
/*     */   
/*     */   public byte d(String ☃) {
/* 180 */     ho ho1 = this.h.get(☃);
/* 181 */     if (ho1 == null) {
/* 182 */       return 0;
/*     */     }
/* 184 */     return ho1.a();
/*     */   }
/*     */   
/*     */   public boolean e(String ☃) {
/* 188 */     return this.h.containsKey(☃);
/*     */   }
/*     */   
/*     */   public boolean c(String ☃, int i) {
/* 192 */     int j = d(☃);
/* 193 */     if (j == i) {
/* 194 */       return true;
/*     */     }
/* 196 */     if (i == 99) {
/* 197 */       return (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6);
/*     */     }
/*     */     
/* 200 */     return false;
/*     */   }
/*     */   
/*     */   public byte f(String ☃) {
/*     */     try {
/* 205 */       if (c(☃, 99)) {
/* 206 */         return ((hl)this.h.get(☃)).g();
/*     */       }
/* 208 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 210 */     return 0;
/*     */   }
/*     */   
/*     */   public short g(String ☃) {
/*     */     try {
/* 215 */       if (c(☃, 99)) {
/* 216 */         return ((hl)this.h.get(☃)).f();
/*     */       }
/* 218 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 220 */     return 0;
/*     */   }
/*     */   
/*     */   public int h(String ☃) {
/*     */     try {
/* 225 */       if (c(☃, 99)) {
/* 226 */         return ((hl)this.h.get(☃)).e();
/*     */       }
/* 228 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 230 */     return 0;
/*     */   }
/*     */   
/*     */   public long i(String ☃) {
/*     */     try {
/* 235 */       if (c(☃, 99)) {
/* 236 */         return ((hl)this.h.get(☃)).d();
/*     */       }
/* 238 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 240 */     return 0L;
/*     */   }
/*     */   
/*     */   public float j(String ☃) {
/*     */     try {
/* 245 */       if (c(☃, 99)) {
/* 246 */         return ((hl)this.h.get(☃)).i();
/*     */       }
/* 248 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 250 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public double k(String ☃) {
/*     */     try {
/* 255 */       if (c(☃, 99)) {
/* 256 */         return ((hl)this.h.get(☃)).h();
/*     */       }
/* 258 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 260 */     return 0.0D;
/*     */   }
/*     */   
/*     */   public String l(String ☃) {
/*     */     try {
/* 265 */       if (c(☃, 8)) {
/* 266 */         return ((ho)this.h.get(☃)).b_();
/*     */       }
/* 268 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 270 */     return "";
/*     */   }
/*     */   
/*     */   public byte[] m(String ☃) {
/*     */     try {
/* 275 */       if (c(☃, 7)) {
/* 276 */         return ((gv)this.h.get(☃)).c();
/*     */       }
/* 278 */     } catch (ClassCastException classCastException) {
/* 279 */       throw new h(a(☃, 7, classCastException));
/*     */     } 
/* 281 */     return new byte[0];
/*     */   }
/*     */   
/*     */   public int[] n(String ☃) {
/*     */     try {
/* 286 */       if (c(☃, 11)) {
/* 287 */         return ((hc)this.h.get(☃)).d();
/*     */       }
/* 289 */     } catch (ClassCastException classCastException) {
/* 290 */       throw new h(a(☃, 11, classCastException));
/*     */     } 
/* 292 */     return new int[0];
/*     */   }
/*     */   
/*     */   public long[] o(String ☃) {
/*     */     try {
/* 297 */       if (c(☃, 12)) {
/* 298 */         return ((hf)this.h.get(☃)).d();
/*     */       }
/* 300 */     } catch (ClassCastException classCastException) {
/* 301 */       throw new h(a(☃, 12, classCastException));
/*     */     } 
/* 303 */     return new long[0];
/*     */   }
/*     */   
/*     */   public gy p(String ☃) {
/*     */     try {
/* 308 */       if (c(☃, 10)) {
/* 309 */         return (gy)this.h.get(☃);
/*     */       }
/* 311 */     } catch (ClassCastException classCastException) {
/* 312 */       throw new h(a(☃, 10, classCastException));
/*     */     } 
/* 314 */     return new gy();
/*     */   }
/*     */   
/*     */   public he d(String ☃, int i) {
/*     */     try {
/* 319 */       if (d(☃) == 9) {
/* 320 */         he he = (he)this.h.get(☃);
/* 321 */         if (he.isEmpty() || he.d() == i) {
/* 322 */           return he;
/*     */         }
/* 324 */         return new he();
/*     */       } 
/* 326 */     } catch (ClassCastException classCastException) {
/* 327 */       throw new h(a(☃, 9, classCastException));
/*     */     } 
/* 329 */     return new he();
/*     */   }
/*     */   
/*     */   public boolean q(String ☃) {
/* 333 */     return (f(☃) != 0);
/*     */   }
/*     */   
/*     */   public void r(String ☃) {
/* 337 */     this.h.remove(☃);
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
/*     */   public String toString() {
/* 357 */     StringBuilder ☃ = new StringBuilder("{");
/*     */     
/* 359 */     Collection<String> collection = this.h.keySet();
/* 360 */     if (f.isDebugEnabled()) {
/* 361 */       List<String> list = Lists.newArrayList(this.h.keySet());
/* 362 */       Collections.sort(list);
/* 363 */       collection = list;
/*     */     } 
/* 365 */     for (String str : collection) {
/* 366 */       if (☃.length() != 1) {
/* 367 */         ☃.append(',');
/*     */       }
/* 369 */       ☃.append(s(str)).append(':').append(this.h.get(str));
/*     */     } 
/*     */     
/* 372 */     return ☃.append('}').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 377 */     return this.h.isEmpty();
/*     */   }
/*     */   
/*     */   private b a(String ☃, int i, ClassCastException classCastException) {
/* 381 */     b b = b.a(classCastException, "Reading NBT data");
/* 382 */     c c = b.a("Corrupt NBT tag", 1);
/*     */     
/* 384 */     c.a("Tag type found", () -> a[((ho)this.h.get(☃)).a()]);
/* 385 */     c.a("Tag type expected", () -> a[☃]);
/* 386 */     c.a("Tag name", ☃);
/*     */     
/* 388 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public gy f() {
/* 393 */     gy ☃ = new gy();
/* 394 */     for (String str : this.h.keySet()) {
/* 395 */       ☃.a(str, ((ho)this.h.get(str)).b());
/*     */     }
/* 397 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 402 */     if (this == ☃) {
/* 403 */       return true;
/*     */     }
/*     */     
/* 406 */     return (☃ instanceof gy && Objects.equals(this.h, ((gy)☃).h));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 411 */     return this.h.hashCode();
/*     */   }
/*     */   
/*     */   private static void a(String ☃, ho ho1, DataOutput dataOutput) throws IOException {
/* 415 */     dataOutput.writeByte(ho1.a());
/* 416 */     if (ho1.a() == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 420 */     dataOutput.writeUTF(☃);
/*     */     
/* 422 */     ho1.a(dataOutput);
/*     */   }
/*     */   
/*     */   private static byte a(DataInput ☃, hh hh1) throws IOException {
/* 426 */     return ☃.readByte();
/*     */   }
/*     */   
/*     */   private static String b(DataInput ☃, hh hh1) throws IOException {
/* 430 */     return ☃.readUTF();
/*     */   }
/*     */   
/*     */   static ho a(byte ☃, String str, DataInput dataInput, int i, hh hh1) throws IOException {
/* 434 */     ho ho1 = ho.a(☃);
/*     */     
/*     */     try {
/* 437 */       ho1.a(dataInput, i, hh1);
/* 438 */     } catch (IOException iOException) {
/* 439 */       b b = b.a(iOException, "Loading NBT data");
/* 440 */       c c = b.a("NBT Tag");
/* 441 */       c.a("Tag name", str);
/* 442 */       c.a("Tag type", Byte.valueOf(☃));
/* 443 */       throw new h(b);
/*     */     } 
/*     */     
/* 446 */     return ho1;
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
/*     */   public gy a(gy ☃) {
/* 463 */     for (String str : ☃.h.keySet()) {
/* 464 */       ho ho1 = ☃.h.get(str);
/*     */ 
/*     */       
/* 467 */       if (ho1.a() == 10) {
/* 468 */         if (c(str, 10)) {
/* 469 */           gy gy1 = p(str);
/* 470 */           gy1.a((gy)ho1); continue;
/*     */         } 
/* 472 */         a(str, ho1.b());
/*     */         continue;
/*     */       } 
/* 475 */       a(str, ho1.b());
/*     */     } 
/*     */     
/* 478 */     return this;
/*     */   }
/*     */   
/*     */   protected static String s(String ☃) {
/* 482 */     if (g.matcher(☃).matches()) {
/* 483 */       return ☃;
/*     */     }
/*     */     
/* 486 */     return hn.a(☃, true);
/*     */   }
/*     */   
/*     */   protected static ij t(String ☃) {
/* 490 */     if (g.matcher(☃).matches()) {
/* 491 */       return (new iq(☃)).a(b);
/*     */     }
/*     */     
/* 494 */     ij ij = (new iq(hn.a(☃, false))).a(b);
/* 495 */     return (new iq("\"")).a(ij).a("\"");
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/* 500 */     if (this.h.isEmpty()) {
/* 501 */       return new iq("{}");
/*     */     }
/*     */     
/* 504 */     ij ij = new iq("{");
/*     */     
/* 506 */     Collection<String> collection = this.h.keySet();
/* 507 */     if (f.isDebugEnabled()) {
/* 508 */       List<String> list = Lists.newArrayList(this.h.keySet());
/* 509 */       Collections.sort(list);
/* 510 */       collection = list;
/*     */     } 
/*     */     
/* 513 */     if (!☃.isEmpty()) {
/* 514 */       ij.a("\n");
/*     */     }
/*     */     
/* 517 */     for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); ) {
/* 518 */       String str = iterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 523 */       ij ij1 = (new iq(Strings.repeat(☃, i + 1))).a(t(str)).a(String.valueOf(':')).a(" ").a(((ho)this.h.get(str)).a(☃, i + 1));
/*     */       
/* 525 */       if (iterator.hasNext()) {
/* 526 */         ij1.a(String.valueOf(',')).a(☃.isEmpty() ? " " : "\n");
/*     */       }
/* 528 */       ij.a(ij1);
/*     */     } 
/* 530 */     if (!☃.isEmpty()) {
/* 531 */       ij.a("\n").a(Strings.repeat(☃, i));
/*     */     }
/* 533 */     ij.a("}");
/* 534 */     return ij;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */