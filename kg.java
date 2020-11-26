/*     */ import com.google.common.collect.Lists;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class kg
/*     */   implements iv<iy>
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private byte[] d;
/*     */   private List<gy> e;
/*     */   private boolean f;
/*     */   
/*     */   public kg() {}
/*     */   
/*     */   public kg(bnj ☃, int i) {
/*  36 */     this.a = ☃.b;
/*  37 */     this.b = ☃.c;
/*  38 */     this.f = (i == 65535);
/*     */     
/*  40 */     boolean bool = (☃.z()).t.g();
/*  41 */     this.d = new byte[a(☃, bool, i)];
/*  42 */     this.c = a(new hy(h()), ☃, bool, i);
/*     */     
/*  44 */     this.e = Lists.newArrayList();
/*  45 */     for (Map.Entry<el, bji> entry : ☃.B().entrySet()) {
/*  46 */       el el = entry.getKey();
/*  47 */       bji bji = entry.getValue();
/*     */       
/*  49 */       int j = el.p() >> 4;
/*  50 */       if (!f() && (i & 1 << j) == 0) {
/*     */         continue;
/*     */       }
/*     */       
/*  54 */       gy gy = bji.aa_();
/*  55 */       this.e.add(gy);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  61 */     this.a = ☃.readInt();
/*  62 */     this.b = ☃.readInt();
/*  63 */     this.f = ☃.readBoolean();
/*  64 */     this.c = ☃.g();
/*     */     
/*  66 */     int i = ☃.g();
/*  67 */     if (i > 2097152) {
/*  68 */       throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
/*     */     }
/*     */     
/*  71 */     this.d = new byte[i];
/*  72 */     ☃.readBytes(this.d);
/*     */     
/*  74 */     int j = ☃.g();
/*  75 */     this.e = Lists.newArrayList();
/*  76 */     for (int k = 0; k < j; k++) {
/*  77 */       this.e.add(☃.j());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  83 */     ☃.writeInt(this.a);
/*  84 */     ☃.writeInt(this.b);
/*  85 */     ☃.writeBoolean(this.f);
/*  86 */     ☃.d(this.c);
/*  87 */     ☃.d(this.d.length);
/*  88 */     ☃.writeBytes(this.d);
/*     */     
/*  90 */     ☃.d(this.e.size());
/*  91 */     for (gy gy : this.e) {
/*  92 */       ☃.a(gy);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/*  98 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ByteBuf h() {
/* 106 */     ByteBuf ☃ = Unpooled.wrappedBuffer(this.d);
/* 107 */     ☃.writerIndex(0);
/* 108 */     return ☃;
/*     */   }
/*     */   
/*     */   public int a(hy ☃, bnj bnj1, boolean bool, int i) {
/* 112 */     int j = 0;
/*     */     
/* 114 */     bnk[] arrayOfBnk = bnj1.c(); int m;
/* 115 */     for (int k = 0; k < m; k++) {
/* 116 */       bnk bnk = arrayOfBnk[k];
/*     */       
/* 118 */       if (bnk != bnj.a && (!f() || !bnk.a()) && (i & 1 << k) != 0) {
/*     */ 
/*     */ 
/*     */         
/* 122 */         j |= 1 << k;
/*     */         
/* 124 */         bnk.g().b(☃);
/*     */         
/* 126 */         ☃.writeBytes(bnk.h().a());
/*     */         
/* 128 */         if (bool) {
/* 129 */           ☃.writeBytes(bnk.i().a());
/*     */         }
/*     */       } 
/*     */     } 
/* 133 */     if (f()) {
/* 134 */       ayu[] arrayOfAyu = bnj1.g();
/* 135 */       for (m = 0; m < arrayOfAyu.length; m++) {
/* 136 */         ☃.writeInt(fc.m.a(arrayOfAyu[m]));
/*     */       }
/*     */     } 
/*     */     
/* 140 */     return j;
/*     */   }
/*     */   
/*     */   protected int a(bnj ☃, boolean bool, int i) {
/* 144 */     int j = 0;
/*     */     
/* 146 */     bnk[] arrayOfBnk = ☃.c();
/* 147 */     for (int k = 0, m = arrayOfBnk.length; k < m; k++) {
/* 148 */       bnk bnk = arrayOfBnk[k];
/*     */       
/* 150 */       if (bnk != bnj.a && (!f() || !bnk.a()) && (i & 1 << k) != 0) {
/*     */ 
/*     */ 
/*     */         
/* 154 */         j += bnk.g().a();
/* 155 */         j += (bnk.h().a()).length;
/*     */         
/* 157 */         if (bool) {
/* 158 */           j += (bnk.i().a()).length;
/*     */         }
/*     */       } 
/*     */     } 
/* 162 */     if (f()) {
/* 163 */       j += (☃.g()).length * 4;
/*     */     }
/*     */     
/* 166 */     return j;
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
/*     */   public boolean f() {
/* 182 */     return this.f;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\kg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */