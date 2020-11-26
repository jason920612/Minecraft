/*     */ import com.google.common.collect.Lists;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class gq
/*     */   extends gr<ata>
/*     */ {
/*  21 */   private static final Logger e = LogManager.getLogger();
/*     */   
/*     */   public gq(fp ☃) {
/*  24 */     super(☃, fc.s);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  29 */     a(wv.a, wx.a);
/*  30 */     a(wv.b, wx.b);
/*  31 */     a(wv.c, wx.c);
/*  32 */     a(wv.d, wx.d);
/*  33 */     a(wv.e, wx.e);
/*  34 */     a(wv.f, wx.f);
/*  35 */     a(wv.g, wx.g);
/*  36 */     a(wv.h, wx.h);
/*  37 */     a(wv.i, wx.i);
/*  38 */     a(wv.j, wx.j);
/*  39 */     a(wv.l, wx.l);
/*  40 */     a(wv.m, wx.m);
/*  41 */     a(wv.p, wx.p);
/*  42 */     a(wv.o, wx.o);
/*  43 */     a(wv.q, wx.q);
/*  44 */     a(wv.r, wx.r);
/*  45 */     a(wv.t, wx.t);
/*  46 */     a(wv.s, wx.s);
/*  47 */     a(wv.n, wx.n);
/*  48 */     a(wv.v, wx.v);
/*  49 */     a(wv.x, wx.x);
/*  50 */     a(wv.w, wx.w);
/*  51 */     a(wv.y, wx.y);
/*  52 */     a(wv.z, wx.z);
/*  53 */     a(wv.A, wx.A);
/*  54 */     a(wv.k, wx.k);
/*  55 */     a(wv.B, wx.B);
/*     */     
/*  57 */     a(wx.u).a(new ata[] { atf.et, atf.eu, atf.ev, atf.ew, atf.ex, atf.ey, atf.ez, atf.eA, atf.eB, atf.eC, atf.eD, atf.eE, atf.eF, atf.eG, atf.eH, atf.eI });
/*  58 */     a(wx.C).a(new ata[] { atf.aD, atf.aE, atf.aF, atf.aG, atf.aH, atf.aI });
/*  59 */     a(wx.D).a(new ata[] { atf.bb, atf.bf, atf.bc, atf.bg, atf.be, atf.bd });
/*     */   }
/*     */   
/*     */   protected void a(wz<bcs> ☃, wz<ata> wz1) {
/*  63 */     wz.a<ata> a = a(wz1);
/*  64 */     for (wz.b<bcs> b : ☃.b()) {
/*  65 */       wz.b<ata> b1 = a(b);
/*  66 */       a.a(b1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private wz.b<ata> a(wz.b<bcs> ☃) {
/*  71 */     if (☃ instanceof wz.c)
/*  72 */       return new wz.c<>(((wz.c)☃).a()); 
/*  73 */     if (☃ instanceof wz.d) {
/*  74 */       List<ata> list = Lists.newArrayList();
/*  75 */       for (bcs bcs : ((wz.d)☃).a()) {
/*  76 */         ata ata = bcs.h();
/*  77 */         if (ata == atf.a) {
/*  78 */           e.warn("Itemless block copied to item tag: {}", fc.g.b(bcs)); continue;
/*     */         } 
/*  80 */         list.add(ata);
/*     */       } 
/*     */       
/*  83 */       return new wz.d<>(list);
/*     */     } 
/*  85 */     throw new UnsupportedOperationException("Unknown tag entry " + ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected Path a(pc ☃) {
/*  91 */     return this.b.b().resolve("data/" + ☃.b() + "/tags/items/" + ☃.a() + ".json");
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  96 */     return "Item Tags";
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(xa<ata> ☃) {
/* 101 */     wx.a(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\gq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */