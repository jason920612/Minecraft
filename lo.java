/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lo
/*     */   implements iv<iy>
/*     */ {
/*  27 */   private String a = "";
/*  28 */   private ij b = new iq("");
/*  29 */   private ij c = new iq("");
/*  30 */   private ij d = new iq("");
/*  31 */   private String e = cfe.b.a.e;
/*  32 */   private String f = cfe.a.a.e;
/*  33 */   private a g = a.v;
/*  34 */   private final Collection<String> h = Lists.newArrayList();
/*     */   
/*     */   private int i;
/*     */   
/*     */   private int j;
/*     */ 
/*     */   
/*     */   public lo(cfa ☃, int i) {
/*  42 */     this.a = ☃.b();
/*  43 */     this.i = i;
/*     */     
/*  45 */     if (i == 0 || i == 2) {
/*  46 */       this.b = ☃.c();
/*  47 */       this.j = ☃.m();
/*  48 */       this.e = (☃.j()).e;
/*  49 */       this.f = (☃.l()).e;
/*  50 */       this.g = ☃.n();
/*  51 */       this.c = ☃.e();
/*  52 */       this.d = ☃.f();
/*     */     } 
/*  54 */     if (i == 0) {
/*  55 */       this.h.addAll(☃.g());
/*     */     }
/*     */   }
/*     */   
/*     */   public lo(cfa ☃, Collection<String> collection, int i) {
/*  60 */     if (i != 3 && i != 4) {
/*  61 */       throw new IllegalArgumentException("Method must be join or leave for player constructor");
/*     */     }
/*  63 */     if (collection == null || collection.isEmpty()) {
/*  64 */       throw new IllegalArgumentException("Players cannot be null/empty");
/*     */     }
/*     */     
/*  67 */     this.i = i;
/*  68 */     this.a = ☃.b();
/*  69 */     this.h.addAll(collection);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  74 */     this.a = ☃.e(16);
/*  75 */     this.i = ☃.readByte();
/*     */     
/*  77 */     if (this.i == 0 || this.i == 2) {
/*  78 */       this.b = ☃.f();
/*  79 */       this.j = ☃.readByte();
/*  80 */       this.e = ☃.e(40);
/*  81 */       this.f = ☃.e(40);
/*  82 */       this.g = ☃.<a>a(a.class);
/*  83 */       this.c = ☃.f();
/*  84 */       this.d = ☃.f();
/*     */     } 
/*     */     
/*  87 */     if (this.i == 0 || this.i == 3 || this.i == 4) {
/*  88 */       int i = ☃.g();
/*     */       
/*  90 */       for (int j = 0; j < i; j++) {
/*  91 */         this.h.add(☃.e(40));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  98 */     ☃.a(this.a);
/*  99 */     ☃.writeByte(this.i);
/*     */     
/* 101 */     if (this.i == 0 || this.i == 2) {
/* 102 */       ☃.a(this.b);
/* 103 */       ☃.writeByte(this.j);
/* 104 */       ☃.a(this.e);
/* 105 */       ☃.a(this.f);
/* 106 */       ☃.a(this.g);
/* 107 */       ☃.a(this.c);
/* 108 */       ☃.a(this.d);
/*     */     } 
/*     */     
/* 111 */     if (this.i == 0 || this.i == 3 || this.i == 4) {
/* 112 */       ☃.d(this.h.size());
/*     */       
/* 114 */       for (String str : this.h) {
/* 115 */         ☃.a(str);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/* 122 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public lo() {}
/*     */ }


/* Location:              F:\dw\server.jar!\lo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */