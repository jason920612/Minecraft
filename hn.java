/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hn
/*     */   implements ho
/*     */ {
/*     */   private String f;
/*     */   
/*     */   public hn() {
/*  22 */     this("");
/*     */   }
/*     */   
/*     */   public hn(String ☃) {
/*  26 */     Objects.requireNonNull(☃, "Null string not allowed");
/*     */     
/*  28 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  33 */     ☃.writeUTF(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataInput ☃, int i, hh hh1) throws IOException {
/*  38 */     hh1.a(288L);
/*     */ 
/*     */     
/*  41 */     this.f = ☃.readUTF();
/*  42 */     hh1.a((16 * this.f.length()));
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  47 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  52 */     return a(this.f, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public hn c() {
/*  57 */     return new hn(this.f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  67 */     if (this == ☃) {
/*  68 */       return true;
/*     */     }
/*     */     
/*  71 */     return (☃ instanceof hn && Objects.equals(this.f, ((hn)☃).f));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  76 */     return this.f.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public String b_() {
/*  81 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ij a(String ☃, int i) {
/*  86 */     ij ij = (new iq(a(this.f, false))).a(c);
/*  87 */     return (new iq("\"")).a(ij).a("\"");
/*     */   }
/*     */   
/*     */   public static String a(String ☃, boolean bool) {
/*  91 */     StringBuilder stringBuilder = new StringBuilder();
/*  92 */     if (bool) {
/*  93 */       stringBuilder.append('"');
/*     */     }
/*  95 */     for (int i = 0; i < ☃.length(); i++) {
/*  96 */       char c = ☃.charAt(i);
/*  97 */       if (c == '\\' || c == '"') {
/*  98 */         stringBuilder.append('\\');
/*     */       }
/* 100 */       stringBuilder.append(c);
/*     */     } 
/* 102 */     if (bool) {
/* 103 */       stringBuilder.append('"');
/*     */     }
/* 105 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\hn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */