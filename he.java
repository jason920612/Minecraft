/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class he
/*     */   extends gx<ho>
/*     */ {
/*  18 */   private static final Logger f = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  31 */   private List<ho> g = Lists.newArrayList();
/*  32 */   private byte h = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  39 */     if (this.g.isEmpty()) {
/*  40 */       this.h = 0;
/*     */     } else {
/*  42 */       this.h = ((ho)this.g.get(0)).a();
/*     */     } 
/*     */     
/*  45 */     ☃.writeByte(this.h);
/*  46 */     ☃.writeInt(this.g.size());
/*  47 */     for (int i = 0; i < this.g.size(); i++) {
/*  48 */       ((ho)this.g.get(i)).a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  54 */     hh1.a(296L);
/*     */     
/*  56 */     if (i > 512) {
/*  57 */       throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*     */     }
/*  59 */     this.h = ☃.readByte();
/*  60 */     int j = ☃.readInt();
/*  61 */     if (this.h == 0 && j > 0) {
/*  62 */       throw new RuntimeException("Missing type on ListTag");
/*     */     }
/*  64 */     hh1.a(32L * j);
/*     */     
/*  66 */     this.g = Lists.newArrayListWithCapacity(j);
/*  67 */     for (int k = 0; k < j; k++) {
/*  68 */       ho ho = ho.a(this.h);
/*  69 */       ho.a(☃, i + 1, hh1);
/*  70 */       this.g.add(ho);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  76 */     return 9;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  81 */     StringBuilder ☃ = new StringBuilder("[");
/*  82 */     for (int i = 0; i < this.g.size(); i++) {
/*  83 */       if (i != 0) {
/*  84 */         ☃.append(',');
/*     */       }
/*  86 */       ☃.append(this.g.get(i));
/*     */     } 
/*  88 */     return ☃.append(']').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ho ☃) {
/*  93 */     if (☃.a() == 0) {
/*  94 */       f.warn("Invalid TagEnd added to ListTag");
/*  95 */       return false;
/*     */     } 
/*  97 */     if (this.h == 0) {
/*  98 */       this.h = ☃.a();
/*  99 */     } else if (this.h != ☃.a()) {
/* 100 */       f.warn("Adding mismatching tag types to tag list");
/* 101 */       return false;
/*     */     } 
/* 103 */     this.g.add(☃);
/* 104 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ho b(int ☃, ho ho1) {
/* 109 */     if (ho1.a() == 0) {
/* 110 */       f.warn("Invalid TagEnd added to ListTag");
/* 111 */       return this.g.get(☃);
/*     */     } 
/* 113 */     if (☃ < 0 || ☃ >= this.g.size()) {
/* 114 */       f.warn("index out of bounds to set tag in tag list");
/* 115 */       return null;
/*     */     } 
/* 117 */     if (this.h == 0) {
/* 118 */       this.h = ho1.a();
/* 119 */     } else if (this.h != ho1.a()) {
/* 120 */       f.warn("Adding mismatching tag types to tag list");
/* 121 */       return this.g.get(☃);
/*     */     } 
/* 123 */     return this.g.set(☃, ho1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ho a(int ☃) {
/* 128 */     return this.g.remove(☃);
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
/*     */   public boolean isEmpty() {
/* 144 */     return this.g.isEmpty();
/*     */   }
/*     */   
/*     */   public gy e(int ☃) {
/* 148 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 149 */       ho ho = this.g.get(☃);
/* 150 */       if (ho.a() == 10) {
/* 151 */         return (gy)ho;
/*     */       }
/*     */     } 
/* 154 */     return new gy();
/*     */   }
/*     */   
/*     */   public he f(int ☃) {
/* 158 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 159 */       ho ho = this.g.get(☃);
/* 160 */       if (ho.a() == 9) {
/* 161 */         return (he)ho;
/*     */       }
/*     */     } 
/* 164 */     return new he();
/*     */   }
/*     */   
/*     */   public short g(int ☃) {
/* 168 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 169 */       ho ho = this.g.get(☃);
/* 170 */       if (ho.a() == 2) {
/* 171 */         return ((hm)ho).f();
/*     */       }
/*     */     } 
/* 174 */     return 0;
/*     */   }
/*     */   
/*     */   public int h(int ☃) {
/* 178 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 179 */       ho ho = this.g.get(☃);
/* 180 */       if (ho.a() == 3) {
/* 181 */         return ((hd)ho).e();
/*     */       }
/*     */     } 
/* 184 */     return 0;
/*     */   }
/*     */   
/*     */   public int[] i(int ☃) {
/* 188 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 189 */       ho ho = this.g.get(☃);
/* 190 */       if (ho.a() == 11) {
/* 191 */         return ((hc)ho).d();
/*     */       }
/*     */     } 
/* 194 */     return new int[0];
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
/*     */   public double k(int ☃) {
/* 208 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 209 */       ho ho = this.g.get(☃);
/* 210 */       if (ho.a() == 6) {
/* 211 */         return ((gz)ho).h();
/*     */       }
/*     */     } 
/* 214 */     return 0.0D;
/*     */   }
/*     */   
/*     */   public float l(int ☃) {
/* 218 */     if (☃ >= 0 && ☃ < this.g.size()) {
/* 219 */       ho ho = this.g.get(☃);
/* 220 */       if (ho.a() == 5) {
/* 221 */         return ((hb)ho).i();
/*     */       }
/*     */     } 
/* 224 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public String m(int ☃) {
/* 228 */     if (☃ < 0 || ☃ >= this.g.size()) {
/* 229 */       return "";
/*     */     }
/* 231 */     ho ho = this.g.get(☃);
/* 232 */     if (ho.a() == 8) {
/* 233 */       return ho.b_();
/*     */     }
/* 235 */     return ho.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public ho d(int ☃) {
/* 240 */     if (☃ < 0 || ☃ >= this.g.size()) {
/* 241 */       return new ha();
/*     */     }
/* 243 */     return this.g.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 248 */     return this.g.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public ho c(int ☃) {
/* 253 */     return this.g.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, ho ho1) {
/* 258 */     this.g.set(☃, ho1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃) {
/* 263 */     this.g.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public he c() {
/* 268 */     he ☃ = new he();
/* 269 */     ☃.h = this.h;
/* 270 */     for (ho ho1 : this.g) {
/* 271 */       ho ho2 = ho1.b();
/* 272 */       ☃.g.add(ho2);
/*     */     } 
/* 274 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 279 */     if (this == ☃) {
/* 280 */       return true;
/*     */     }
/*     */     
/* 283 */     return (☃ instanceof he && Objects.equals(this.g, ((he)☃).g));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 288 */     return this.g.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/* 293 */     if (isEmpty()) {
/* 294 */       return new iq("[]");
/*     */     }
/*     */     
/* 297 */     ij ij = new iq("[");
/* 298 */     if (!☃.isEmpty()) {
/* 299 */       ij.a("\n");
/*     */     }
/* 301 */     for (int j = 0; j < this.g.size(); j++) {
/* 302 */       ij ij1 = new iq(Strings.repeat(☃, i + 1));
/* 303 */       ij1.a(((ho)this.g.get(j)).a(☃, i + 1));
/* 304 */       if (j != this.g.size() - 1) {
/* 305 */         ij1.a(String.valueOf(',')).a(☃.isEmpty() ? " " : "\n");
/*     */       }
/* 307 */       ij.a(ij1);
/*     */     } 
/* 309 */     if (!☃.isEmpty()) {
/* 310 */       ij.a("\n").a(Strings.repeat(☃, i));
/*     */     }
/* 312 */     ij.a("]");
/*     */     
/* 314 */     return ij;
/*     */   }
/*     */   
/*     */   public int d() {
/* 318 */     return this.h;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\he.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */