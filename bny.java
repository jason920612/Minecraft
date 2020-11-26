/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bny
/*     */ {
/*     */   public static a a(gy ☃) {
/*  17 */     int i = ☃.h("xPos");
/*  18 */     int j = ☃.h("zPos");
/*     */     
/*  20 */     a a = new a(i, j);
/*  21 */     a.g = ☃.m("Blocks");
/*  22 */     a.f = new bnn(☃.m("Data"), 7);
/*  23 */     a.e = new bnn(☃.m("SkyLight"), 7);
/*  24 */     a.d = new bnn(☃.m("BlockLight"), 7);
/*  25 */     a.c = ☃.m("HeightMap");
/*  26 */     a.b = ☃.q("TerrainPopulated");
/*  27 */     a.h = ☃.d("Entities", 10);
/*  28 */     a.i = ☃.d("TileEntities", 10);
/*  29 */     a.j = ☃.d("TileTicks", 10);
/*     */ 
/*     */     
/*     */     try {
/*  33 */       a.a = ☃.i("LastUpdate");
/*  34 */     } catch (ClassCastException classCastException) {
/*  35 */       a.a = ☃.h("LastUpdate");
/*     */     } 
/*     */     
/*  38 */     return a;
/*     */   }
/*     */   
/*     */   public static void a(a ☃, gy gy1, ayw ayw1) {
/*  42 */     gy1.b("xPos", ☃.k);
/*  43 */     gy1.b("zPos", ☃.l);
/*  44 */     gy1.a("LastUpdate", ☃.a);
/*  45 */     int[] arrayOfInt = new int[☃.c.length];
/*  46 */     for (int i = 0; i < ☃.c.length; i++) {
/*  47 */       arrayOfInt[i] = ☃.c[i];
/*     */     }
/*  49 */     gy1.a("HeightMap", arrayOfInt);
/*  50 */     gy1.a("TerrainPopulated", ☃.b);
/*     */     
/*  52 */     he he = new he();
/*  53 */     for (int j = 0; j < 8; j++) {
/*     */       
/*  55 */       boolean bool = true;
/*  56 */       for (int m = 0; m < 16 && bool; m++) {
/*  57 */         for (int n = 0; n < 16 && bool; n++) {
/*  58 */           for (int i1 = 0; i1 < 16; i1++) {
/*  59 */             int i2 = m << 11 | i1 << 7 | n + (j << 4);
/*  60 */             int i3 = ☃.g[i2];
/*  61 */             if (i3 != 0) {
/*  62 */               bool = false;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*  69 */       if (!bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  74 */         byte[] arrayOfByte1 = new byte[4096];
/*  75 */         bne bne1 = new bne();
/*  76 */         bne bne2 = new bne();
/*  77 */         bne bne3 = new bne();
/*     */         
/*  79 */         for (int n = 0; n < 16; n++) {
/*  80 */           for (int i1 = 0; i1 < 16; i1++) {
/*  81 */             for (int i2 = 0; i2 < 16; i2++) {
/*  82 */               int i3 = n << 11 | i2 << 7 | i1 + (j << 4);
/*  83 */               int i4 = ☃.g[i3];
/*     */               
/*  85 */               arrayOfByte1[i1 << 8 | i2 << 4 | n] = (byte)(i4 & 0xFF);
/*  86 */               bne1.a(n, i1, i2, ☃.f.a(n, i1 + (j << 4), i2));
/*  87 */               bne2.a(n, i1, i2, ☃.e.a(n, i1 + (j << 4), i2));
/*  88 */               bne3.a(n, i1, i2, ☃.d.a(n, i1 + (j << 4), i2));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/*  93 */         gy gy2 = new gy();
/*     */         
/*  95 */         gy2.a("Y", (byte)(j & 0xFF));
/*  96 */         gy2.a("Blocks", arrayOfByte1);
/*  97 */         gy2.a("Data", bne1.a());
/*  98 */         gy2.a("SkyLight", bne2.a());
/*  99 */         gy2.a("BlockLight", bne3.a());
/*     */         
/* 101 */         he.a(gy2);
/*     */       } 
/* 103 */     }  gy1.a("Sections", he);
/*     */ 
/*     */     
/* 106 */     byte[] arrayOfByte = new byte[256];
/* 107 */     el.a a1 = new el.a();
/* 108 */     for (int k = 0; k < 16; k++) {
/* 109 */       for (int m = 0; m < 16; m++) {
/* 110 */         a1.c(☃.k << 4 | k, 0, ☃.l << 4 | m);
/* 111 */         arrayOfByte[m << 4 | k] = (byte)(fc.m.a((T)ayw1.a(a1, ayz.b)) & 0xFF);
/*     */       } 
/*     */     } 
/* 114 */     gy1.a("Biomes", arrayOfByte);
/* 115 */     gy1.a("Entities", ☃.h);
/* 116 */     gy1.a("TileEntities", ☃.i);
/* 117 */     if (☃.j != null) {
/* 118 */       gy1.a("TileTicks", ☃.j);
/*     */     }
/* 120 */     gy1.a("convertedFromAlphaFormat", true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     public long a;
/*     */     public boolean b;
/*     */     public byte[] c;
/*     */     public bnn d;
/*     */     public bnn e;
/*     */     public bnn f;
/*     */     public byte[] g;
/*     */     public he h;
/*     */     public he i;
/*     */     public he j;
/*     */     public final int k;
/*     */     public final int l;
/*     */     
/*     */     public a(int ☃, int i) {
/* 140 */       this.k = ☃;
/* 141 */       this.l = i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bny.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */