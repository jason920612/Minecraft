/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bwy
/*     */ {
/*  27 */   private static final Logger a = LogManager.getLogger();
/*  28 */   private static final Map<String, Class<? extends bxc>> b = Maps.newHashMap();
/*  29 */   private static final Map<Class<? extends bxc>, String> c = Maps.newHashMap();
/*     */   
/*  31 */   private static final Map<String, Class<? extends bxb>> d = Maps.newHashMap();
/*  32 */   private static final Map<Class<? extends bxb>, String> e = Maps.newHashMap();
/*     */   
/*     */   private static void b(Class<? extends bxc> ☃, String str) {
/*  35 */     b.put(str, ☃);
/*  36 */     c.put(☃, str);
/*     */   }
/*     */   
/*     */   public static void a(Class<? extends bxb> ☃, String str) {
/*  40 */     d.put(str, ☃);
/*  41 */     e.put(☃, str);
/*     */   }
/*     */   
/*     */   static {
/*  45 */     b((Class)bru.a.class, "Mineshaft");
/*  46 */     b((Class)btv.a.class, "Village");
/*  47 */     b((Class)brx.a.class, "Fortress");
/*  48 */     b((Class)btk.a.class, "Stronghold");
/*  49 */     b((Class)brj.a.class, "Jungle_Pyramid");
/*  50 */     b((Class)bwt.a.class, "Ocean_Ruin");
/*  51 */     b((Class)bqc.a.class, "Desert_Pyramid");
/*  52 */     b((Class)brg.a.class, "Igloo");
/*  53 */     b((Class)btp.a.class, "Swamp_Hut");
/*  54 */     b((Class)bsb.a.class, "Monument");
/*  55 */     b((Class)bqj.a.class, "EndCity");
/*  56 */     b((Class)bua.a.class, "Mansion");
/*  57 */     b((Class)bpi.a.class, "Buried_Treasure");
/*  58 */     b((Class)bsz.a.class, "Shipwreck");
/*     */     
/*  60 */     bwq.a();
/*  61 */     bxh.a();
/*  62 */     bwr.a();
/*  63 */     bwx.a();
/*  64 */     bwo.ad_();
/*  65 */     bwu.a();
/*  66 */     bwn.a();
/*  67 */     bxd.b();
/*  68 */     bwk.ac_();
/*  69 */     bws.a();
/*  70 */     bwl.a();
/*  71 */     bxi.a();
/*  72 */     bwg.a();
/*  73 */     bww.a();
/*     */   }
/*     */   
/*     */   public static String a(bxc ☃) {
/*  77 */     return c.get(☃.getClass());
/*     */   }
/*     */   
/*     */   public static String a(bxb ☃) {
/*  81 */     return e.get(☃.getClass());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static bxc a(gy ☃, axz axz1) {
/*  86 */     bxc bxc = null;
/*     */     
/*  88 */     String str = ☃.l("id");
/*  89 */     if ("INVALID".equals(str)) {
/*  90 */       return btl.a;
/*     */     }
/*     */     
/*     */     try {
/*  94 */       Class<? extends bxc> clazz = b.get(str);
/*  95 */       if (clazz != null) {
/*  96 */         bxc = clazz.newInstance();
/*     */       }
/*  98 */     } catch (Exception exception) {
/*  99 */       a.warn("Failed Start with id {}", str);
/* 100 */       exception.printStackTrace();
/*     */     } 
/* 102 */     if (bxc != null) {
/* 103 */       bxc.a(axz1, ☃);
/*     */     } else {
/* 105 */       a.warn("Skipping Structure with id {}", str);
/*     */     } 
/* 107 */     return bxc;
/*     */   }
/*     */   
/*     */   public static bxb b(gy ☃, axz axz1) {
/* 111 */     bxb bxb = null;
/*     */     
/*     */     try {
/* 114 */       Class<? extends bxb> clazz = d.get(☃.l("id"));
/* 115 */       if (clazz != null) {
/* 116 */         bxb = clazz.newInstance();
/*     */       }
/* 118 */     } catch (Exception exception) {
/* 119 */       a.warn("Failed Piece with id {}", ☃.l("id"));
/* 120 */       exception.printStackTrace();
/*     */     } 
/* 122 */     if (bxb != null) {
/* 123 */       bxb.a(axz1, ☃);
/*     */     } else {
/* 125 */       a.warn("Skipping Piece with id {}", ☃.l("id"));
/*     */     } 
/* 127 */     return bxb;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bwy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */