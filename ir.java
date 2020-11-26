/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Streams;
/*     */ import java.util.Arrays;
/*     */ import java.util.IllegalFormatException;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ir
/*     */   extends ig
/*     */ {
/*  16 */   private static final gt d = new gt();
/*     */ 
/*     */   
/*  19 */   private static final gt e = gt.a();
/*     */   
/*     */   private final String f;
/*     */   private final Object[] g;
/*  23 */   private final Object h = new Object();
/*  24 */   private long i = -1L;
/*     */   
/*     */   @VisibleForTesting
/*  27 */   List<ij> b = Lists.newArrayList();
/*     */   
/*  29 */   public static final Pattern c = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
/*     */   
/*     */   public ir(String ☃, Object... arrayOfObject) {
/*  32 */     this.f = ☃;
/*  33 */     this.g = arrayOfObject;
/*     */     
/*  35 */     for (int i = 0; i < arrayOfObject.length; i++) {
/*  36 */       Object object = arrayOfObject[i];
/*  37 */       if (object instanceof ij) {
/*  38 */         ij ij = ((ij)object).h();
/*  39 */         this.g[i] = ij;
/*  40 */         ij.b().a(b());
/*  41 */       } else if (object == null) {
/*  42 */         this.g[i] = "null";
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   synchronized void i() {
/*  49 */     synchronized (this.h) {
/*  50 */       long ☃ = e.b();
/*  51 */       if (☃ == this.i) {
/*     */         return;
/*     */       }
/*  54 */       this.i = ☃;
/*  55 */       this.b.clear();
/*     */     } 
/*     */     
/*     */     try {
/*  59 */       b(e.a(this.f));
/*  60 */     } catch (is ☃) {
/*  61 */       this.b.clear();
/*     */       try {
/*  63 */         b(d.a(this.f));
/*  64 */       } catch (is is) {
/*  65 */         throw ☃;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(String ☃) {
/*  71 */     Matcher matcher = c.matcher(☃);
/*     */     
/*     */     try {
/*  74 */       int i = 0;
/*  75 */       int j = 0;
/*     */       
/*  77 */       while (matcher.find(j)) {
/*  78 */         int k = matcher.start();
/*  79 */         int m = matcher.end();
/*     */ 
/*     */         
/*  82 */         if (k > j) {
/*  83 */           ij ij = new iq(String.format(☃.substring(j, k), new Object[0]));
/*  84 */           ij.b().a(b());
/*  85 */           this.b.add(ij);
/*     */         } 
/*     */         
/*  88 */         String str1 = matcher.group(2);
/*  89 */         String str2 = ☃.substring(k, m);
/*     */ 
/*     */         
/*  92 */         if ("%".equals(str1) && "%%".equals(str2)) {
/*  93 */           ij ij = new iq("%");
/*  94 */           ij.b().a(b());
/*  95 */           this.b.add(ij);
/*  96 */         } else if ("s".equals(str1)) {
/*  97 */           String str = matcher.group(1);
/*  98 */           int n = (str != null) ? (Integer.parseInt(str) - 1) : i++;
/*  99 */           if (n < this.g.length) {
/* 100 */             this.b.add(b(n));
/*     */           }
/*     */         } else {
/* 103 */           throw new is(this, "Unsupported format: '" + str2 + "'");
/*     */         } 
/*     */         
/* 106 */         j = m;
/*     */       } 
/*     */ 
/*     */       
/* 110 */       if (j < ☃.length()) {
/* 111 */         ij ij = new iq(String.format(☃.substring(j), new Object[0]));
/* 112 */         ij.b().a(b());
/* 113 */         this.b.add(ij);
/*     */       } 
/* 115 */     } catch (IllegalFormatException illegalFormatException) {
/* 116 */       throw new is(this, illegalFormatException);
/*     */     } 
/*     */   }
/*     */   private ij b(int ☃) {
/*     */     ij ij;
/* 121 */     if (☃ >= this.g.length) {
/* 122 */       throw new is(this, ☃);
/*     */     }
/*     */     
/* 125 */     Object object = this.g[☃];
/*     */ 
/*     */     
/* 128 */     if (object instanceof ij) {
/* 129 */       ij = (ij)object;
/*     */     } else {
/* 131 */       ij = new iq((object == null) ? "null" : object.toString());
/* 132 */       ij.b().a(b());
/*     */     } 
/*     */     
/* 135 */     return ij;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(ip ☃) {
/* 140 */     super.a(☃);
/*     */     
/* 142 */     for (Object object : this.g) {
/* 143 */       if (object instanceof ij) {
/* 144 */         ((ij)object).b().a(b());
/*     */       }
/*     */     } 
/*     */     
/* 148 */     if (this.i > -1L) {
/* 149 */       for (ij ij : this.b) {
/* 150 */         ij.b().a(☃);
/*     */       }
/*     */     }
/*     */     
/* 154 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<ij> c() {
/* 159 */     i();
/*     */     
/* 161 */     return Streams.concat(new Stream[] { this.b.stream(), this.a.stream() }).flatMap(ij::c);
/*     */   }
/*     */ 
/*     */   
/*     */   public String d() {
/* 166 */     i();
/*     */     
/* 168 */     StringBuilder ☃ = new StringBuilder();
/*     */     
/* 170 */     for (ij ij : this.b) {
/* 171 */       ☃.append(ij.d());
/*     */     }
/*     */     
/* 174 */     return ☃.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public ir j() {
/* 179 */     Object[] ☃ = new Object[this.g.length];
/*     */     
/* 181 */     for (int i = 0; i < this.g.length; i++) {
/* 182 */       if (this.g[i] instanceof ij) {
/* 183 */         ☃[i] = ((ij)this.g[i]).h();
/*     */       } else {
/* 185 */         ☃[i] = this.g[i];
/*     */       } 
/*     */     } 
/*     */     
/* 189 */     return new ir(this.f, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 194 */     if (this == ☃) {
/* 195 */       return true;
/*     */     }
/*     */     
/* 198 */     if (☃ instanceof ir) {
/* 199 */       ir ir1 = (ir)☃;
/* 200 */       return (Arrays.equals(this.g, ir1.g) && this.f.equals(ir1.f) && super.equals(☃));
/*     */     } 
/*     */     
/* 203 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 208 */     int ☃ = super.hashCode();
/* 209 */     ☃ = 31 * ☃ + this.f.hashCode();
/* 210 */     ☃ = 31 * ☃ + Arrays.hashCode(this.g);
/* 211 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 216 */     return "TranslatableComponent{key='" + this.f + '\'' + ", args=" + 
/*     */       
/* 218 */       Arrays.toString(this.g) + ", siblings=" + this.a + ", style=" + 
/*     */       
/* 220 */       b() + '}';
/*     */   }
/*     */ 
/*     */   
/*     */   public String k() {
/* 225 */     return this.f;
/*     */   }
/*     */   
/*     */   public Object[] l() {
/* 229 */     return this.g;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */