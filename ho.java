/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
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
/*     */ public interface ho
/*     */ {
/*  34 */   public static final String[] a = new String[] { "END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]", "LONG[]" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   public static final a b = a.l;
/*  42 */   public static final a c = a.k;
/*  43 */   public static final a d = a.g;
/*  44 */   public static final a e = a.m;
/*     */ 
/*     */   
/*     */   void a(DataOutput paramDataOutput) throws IOException;
/*     */ 
/*     */   
/*     */   void a(DataInput paramDataInput, int paramInt, hh paramhh) throws IOException;
/*     */ 
/*     */   
/*     */   String toString();
/*     */   
/*     */   byte a();
/*     */   
/*     */   static ho a(byte ☃) {
/*  58 */     switch (☃) {
/*     */       case 0:
/*  60 */         return new ha();
/*     */       case 1:
/*  62 */         return new gw();
/*     */       case 2:
/*  64 */         return new hm();
/*     */       case 3:
/*  66 */         return new hd();
/*     */       case 4:
/*  68 */         return new hg();
/*     */       case 5:
/*  70 */         return new hb();
/*     */       case 6:
/*  72 */         return new gz();
/*     */       case 7:
/*  74 */         return new gv();
/*     */       case 11:
/*  76 */         return new hc();
/*     */       case 12:
/*  78 */         return new hf();
/*     */       case 8:
/*  80 */         return new hn();
/*     */       case 9:
/*  82 */         return new he();
/*     */       case 10:
/*  84 */         return new gy();
/*     */     } 
/*  86 */     return null;
/*     */   }
/*     */   
/*     */   static String n(int ☃) {
/*  90 */     switch (☃) {
/*     */       case 0:
/*  92 */         return "TAG_End";
/*     */       case 1:
/*  94 */         return "TAG_Byte";
/*     */       case 2:
/*  96 */         return "TAG_Short";
/*     */       case 3:
/*  98 */         return "TAG_Int";
/*     */       case 4:
/* 100 */         return "TAG_Long";
/*     */       case 5:
/* 102 */         return "TAG_Float";
/*     */       case 6:
/* 104 */         return "TAG_Double";
/*     */       case 7:
/* 106 */         return "TAG_Byte_Array";
/*     */       case 11:
/* 108 */         return "TAG_Int_Array";
/*     */       case 12:
/* 110 */         return "TAG_Long_Array";
/*     */       case 8:
/* 112 */         return "TAG_String";
/*     */       case 9:
/* 114 */         return "TAG_List";
/*     */       case 10:
/* 116 */         return "TAG_Compound";
/*     */       case 99:
/* 118 */         return "Any Numeric Tag";
/*     */     } 
/* 120 */     return "UNKNOWN";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   ho b();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default String b_() {
/* 133 */     return toString();
/*     */   }
/*     */   
/*     */   default ij k() {
/* 137 */     return a("", 0);
/*     */   }
/*     */   
/*     */   ij a(String paramString, int paramInt);
/*     */ }


/* Location:              F:\dw\server.jar!\ho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */