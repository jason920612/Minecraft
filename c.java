/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */ {
/*     */   private final b a;
/*     */   private final String b;
/*  14 */   private final List<a> c = Lists.newArrayList();
/*  15 */   private StackTraceElement[] d = new StackTraceElement[0];
/*     */   
/*     */   public c(b ☃, String str) {
/*  18 */     this.a = ☃;
/*  19 */     this.b = str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String a(el ☃) {
/*  27 */     return a(☃.o(), ☃.p(), ☃.q());
/*     */   }
/*     */   
/*     */   public static String a(int ☃, int i, int j) {
/*  31 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/*     */     try {
/*  34 */       stringBuilder.append(String.format("World: (%d,%d,%d)", new Object[] { Integer.valueOf(☃), Integer.valueOf(i), Integer.valueOf(j) }));
/*  35 */     } catch (Throwable throwable) {
/*  36 */       stringBuilder.append("(Error finding world loc)");
/*     */     } 
/*     */     
/*  39 */     stringBuilder.append(", ");
/*     */     
/*     */     try {
/*  42 */       int k = ☃ >> 4;
/*  43 */       int m = j >> 4;
/*  44 */       int n = ☃ & 0xF;
/*  45 */       int i1 = i >> 4;
/*  46 */       int i2 = j & 0xF;
/*  47 */       int i3 = k << 4;
/*  48 */       int i4 = m << 4;
/*  49 */       int i5 = (k + 1 << 4) - 1;
/*  50 */       int i6 = (m + 1 << 4) - 1;
/*  51 */       stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6) }));
/*  52 */     } catch (Throwable throwable) {
/*  53 */       stringBuilder.append("(Error finding chunk loc)");
/*     */     } 
/*     */     
/*  56 */     stringBuilder.append(", ");
/*     */     
/*     */     try {
/*  59 */       int k = ☃ >> 9;
/*  60 */       int m = j >> 9;
/*  61 */       int n = k << 5;
/*  62 */       int i1 = m << 5;
/*  63 */       int i2 = (k + 1 << 5) - 1;
/*  64 */       int i3 = (m + 1 << 5) - 1;
/*  65 */       int i4 = k << 9;
/*  66 */       int i5 = m << 9;
/*  67 */       int i6 = (k + 1 << 9) - 1;
/*  68 */       int i7 = (m + 1 << 9) - 1;
/*  69 */       stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7) }));
/*  70 */     } catch (Throwable throwable) {
/*  71 */       stringBuilder.append("(Error finding world loc)");
/*     */     } 
/*     */     
/*  74 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public void a(String ☃, d<String> d1) {
/*     */     try {
/*  79 */       a(☃, d1.call());
/*  80 */     } catch (Throwable throwable) {
/*  81 */       a(☃, throwable);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃, Object object) {
/*  86 */     this.c.add(new a(☃, object));
/*     */   }
/*     */   
/*     */   public void a(String ☃, Throwable throwable) {
/*  90 */     a(☃, throwable);
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/*  94 */     StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
/*     */ 
/*     */     
/*  97 */     if (arrayOfStackTraceElement.length <= 0) {
/*  98 */       return 0;
/*     */     }
/*     */     
/* 101 */     this.d = new StackTraceElement[arrayOfStackTraceElement.length - 3 - ☃];
/* 102 */     System.arraycopy(arrayOfStackTraceElement, 3 + ☃, this.d, 0, this.d.length);
/* 103 */     return this.d.length;
/*     */   }
/*     */   
/*     */   public boolean a(StackTraceElement ☃, StackTraceElement stackTraceElement1) {
/* 107 */     if (this.d.length == 0 || ☃ == null) {
/* 108 */       return false;
/*     */     }
/*     */     
/* 111 */     StackTraceElement stackTraceElement = this.d[0];
/*     */ 
/*     */     
/* 114 */     if (stackTraceElement.isNativeMethod() != ☃.isNativeMethod() || 
/* 115 */       !stackTraceElement.getClassName().equals(☃.getClassName()) || 
/* 116 */       !stackTraceElement.getFileName().equals(☃.getFileName()) || 
/* 117 */       !stackTraceElement.getMethodName().equals(☃.getMethodName()))
/*     */     {
/* 119 */       return false;
/*     */     }
/*     */     
/* 122 */     if (((stackTraceElement1 != null) ? true : false) != ((this.d.length > 1) ? true : false)) {
/* 123 */       return false;
/*     */     }
/* 125 */     if (stackTraceElement1 != null && !this.d[1].equals(stackTraceElement1)) {
/* 126 */       return false;
/*     */     }
/*     */     
/* 129 */     this.d[0] = ☃;
/*     */     
/* 131 */     return true;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 135 */     StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[this.d.length - ☃];
/* 136 */     System.arraycopy(this.d, 0, arrayOfStackTraceElement, 0, arrayOfStackTraceElement.length);
/* 137 */     this.d = arrayOfStackTraceElement;
/*     */   }
/*     */   
/*     */   public void a(StringBuilder ☃) {
/* 141 */     ☃.append("-- ").append(this.b).append(" --\n");
/* 142 */     ☃.append("Details:");
/*     */     
/* 144 */     for (a a : this.c) {
/* 145 */       ☃.append("\n\t");
/* 146 */       ☃.append(a.a());
/* 147 */       ☃.append(": ");
/* 148 */       ☃.append(a.b());
/*     */     } 
/*     */     
/* 151 */     if (this.d != null && this.d.length > 0) {
/* 152 */       ☃.append("\nStacktrace:");
/*     */       
/* 154 */       for (StackTraceElement stackTraceElement : this.d) {
/* 155 */         ☃.append("\n\tat ");
/* 156 */         ☃.append(stackTraceElement);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public StackTraceElement[] a() {
/* 162 */     return this.d;
/*     */   }
/*     */   
/*     */   public static void a(c ☃, el el1, @Nullable blc blc1) {
/* 166 */     if (blc1 != null) {
/* 167 */       ☃.a("Block", blc1::toString);
/*     */     }
/*     */     
/* 170 */     ☃.a("Block location", () -> a(☃));
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final String a;
/*     */     private final String b;
/*     */     
/*     */     public a(String ☃, Object object) {
/* 178 */       this.a = ☃;
/*     */       
/* 180 */       if (object == null) {
/* 181 */         this.b = "~~NULL~~";
/* 182 */       } else if (object instanceof Throwable) {
/* 183 */         Throwable throwable = (Throwable)object;
/* 184 */         this.b = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
/*     */       } else {
/* 186 */         this.b = object.toString();
/*     */       } 
/*     */     }
/*     */     
/*     */     public String a() {
/* 191 */       return this.a;
/*     */     }
/*     */     
/*     */     public String b() {
/* 195 */       return this.b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */