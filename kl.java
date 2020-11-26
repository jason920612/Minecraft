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
/*     */ public class kl
/*     */   implements iv<iy>
/*     */ {
/*     */   protected int a;
/*     */   protected int b;
/*     */   protected int c;
/*     */   protected int d;
/*     */   protected byte e;
/*     */   protected byte f;
/*     */   protected boolean g;
/*     */   protected boolean h;
/*     */   
/*     */   public static class b
/*     */     extends kl
/*     */   {
/*     */     public b() {
/*  28 */       this.h = true;
/*     */     }
/*     */     
/*     */     public b(int ☃, long l1, long l2, long l3, byte b1, byte b2, boolean bool) {
/*  32 */       super(☃);
/*     */ 
/*     */       
/*  35 */       this.b = (int)l1;
/*  36 */       this.c = (int)l2;
/*  37 */       this.d = (int)l3;
/*  38 */       this.e = b1;
/*  39 */       this.f = b2;
/*  40 */       this.g = bool;
/*  41 */       this.h = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(hy ☃) throws IOException {
/*  46 */       super.a(☃);
/*  47 */       this.b = ☃.readShort();
/*  48 */       this.c = ☃.readShort();
/*  49 */       this.d = ☃.readShort();
/*  50 */       this.e = ☃.readByte();
/*  51 */       this.f = ☃.readByte();
/*  52 */       this.g = ☃.readBoolean();
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(hy ☃) throws IOException {
/*  57 */       super.b(☃);
/*  58 */       ☃.writeShort(this.b);
/*  59 */       ☃.writeShort(this.c);
/*  60 */       ☃.writeShort(this.d);
/*  61 */       ☃.writeByte(this.e);
/*  62 */       ☃.writeByte(this.f);
/*  63 */       ☃.writeBoolean(this.g);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends kl
/*     */   {
/*     */     public a() {}
/*     */     
/*     */     public a(int ☃, long l1, long l2, long l3, boolean bool) {
/*  73 */       super(☃);
/*     */ 
/*     */       
/*  76 */       this.b = (int)l1;
/*  77 */       this.c = (int)l2;
/*  78 */       this.d = (int)l3;
/*  79 */       this.g = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(hy ☃) throws IOException {
/*  84 */       super.a(☃);
/*  85 */       this.b = ☃.readShort();
/*  86 */       this.c = ☃.readShort();
/*  87 */       this.d = ☃.readShort();
/*  88 */       this.g = ☃.readBoolean();
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(hy ☃) throws IOException {
/*  93 */       super.b(☃);
/*  94 */       ☃.writeShort(this.b);
/*  95 */       ☃.writeShort(this.c);
/*  96 */       ☃.writeShort(this.d);
/*  97 */       ☃.writeBoolean(this.g);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c
/*     */     extends kl {
/*     */     public c() {
/* 104 */       this.h = true;
/*     */     }
/*     */     
/*     */     public c(int ☃, byte b1, byte b2, boolean bool) {
/* 108 */       super(☃);
/* 109 */       this.e = b1;
/* 110 */       this.f = b2;
/* 111 */       this.h = true;
/* 112 */       this.g = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(hy ☃) throws IOException {
/* 117 */       super.a(☃);
/* 118 */       this.e = ☃.readByte();
/* 119 */       this.f = ☃.readByte();
/* 120 */       this.g = ☃.readBoolean();
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(hy ☃) throws IOException {
/* 125 */       super.b(☃);
/* 126 */       ☃.writeByte(this.e);
/* 127 */       ☃.writeByte(this.f);
/* 128 */       ☃.writeBoolean(this.g);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public kl() {}
/*     */ 
/*     */   
/*     */   public kl(int ☃) {
/* 137 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/* 142 */     this.a = ☃.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/* 147 */     ☃.d(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/* 152 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 157 */     return "Entity_" + super.toString();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\kl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */