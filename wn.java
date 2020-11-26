/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
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
/*     */ 
/*     */ public class wn
/*     */   extends wm
/*     */ {
/*  23 */   private static final Logger g = LogManager.getLogger();
/*     */   
/*     */   private final avl h;
/*     */   
/*     */   public wn(avl ☃) {
/*  28 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public int a(Collection<avk> ☃, tf tf1) {
/*  32 */     List<pc> list = Lists.newArrayList();
/*  33 */     int i = 0;
/*     */     
/*  35 */     for (avk avk : ☃) {
/*  36 */       pc pc = avk.b();
/*  37 */       if (!this.a.contains(pc) && !avk.c()) {
/*  38 */         a(pc);
/*  39 */         c(pc);
/*  40 */         list.add(pc);
/*  41 */         p.f.a(tf1, avk);
/*  42 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/*  46 */     a(kv.a.b, tf1, list);
/*  47 */     return i;
/*     */   }
/*     */   
/*     */   public int b(Collection<avk> ☃, tf tf1) {
/*  51 */     List<pc> list = Lists.newArrayList();
/*  52 */     int i = 0;
/*     */     
/*  54 */     for (avk avk : ☃) {
/*  55 */       pc pc = avk.b();
/*  56 */       if (this.a.contains(pc)) {
/*  57 */         b(pc);
/*  58 */         list.add(pc);
/*  59 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     a(kv.a.c, tf1, list);
/*  64 */     return i;
/*     */   }
/*     */   
/*     */   private void a(kv.a ☃, tf tf1, List<pc> list) {
/*  68 */     tf1.a.a(new kv(☃, list, Collections.emptyList(), this.c, this.d, this.e, this.f));
/*     */   }
/*     */   
/*     */   public gy e() {
/*  72 */     gy ☃ = new gy();
/*  73 */     ☃.a("isGuiOpen", this.c);
/*  74 */     ☃.a("isFilteringCraftable", this.d);
/*  75 */     ☃.a("isFurnaceGuiOpen", this.e);
/*  76 */     ☃.a("isFurnaceFilteringCraftable", this.f);
/*     */     
/*  78 */     he he1 = new he();
/*  79 */     for (pc pc : this.a) {
/*  80 */       he1.a(new hn(pc.toString()));
/*     */     }
/*  82 */     ☃.a("recipes", he1);
/*     */     
/*  84 */     he he2 = new he();
/*  85 */     for (pc pc : this.b) {
/*  86 */       he2.a(new hn(pc.toString()));
/*     */     }
/*  88 */     ☃.a("toBeDisplayed", he2);
/*     */     
/*  90 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(gy ☃) {
/*  94 */     this.c = ☃.q("isGuiOpen");
/*  95 */     this.d = ☃.q("isFilteringCraftable");
/*  96 */     this.e = ☃.q("isFurnaceGuiOpen");
/*  97 */     this.f = ☃.q("isFurnaceFilteringCraftable");
/*     */     
/*  99 */     he he1 = ☃.d("recipes", 8);
/* 100 */     for (int i = 0; i < he1.size(); i++) {
/* 101 */       pc pc = new pc(he1.m(i));
/* 102 */       avk avk = this.h.a(pc);
/* 103 */       if (avk == null) {
/* 104 */         g.error("Tried to load unrecognized recipe: {} removed now.", pc);
/*     */       }
/*     */       else {
/*     */         
/* 108 */         a(avk);
/*     */       } 
/*     */     } 
/* 111 */     he he2 = ☃.d("toBeDisplayed", 8);
/* 112 */     for (int j = 0; j < he2.size(); j++) {
/* 113 */       pc pc = new pc(he2.m(j));
/* 114 */       avk avk = this.h.a(pc);
/* 115 */       if (avk == null) {
/* 116 */         g.error("Tried to load unrecognized recipe: {} removed now.", pc);
/*     */       } else {
/*     */         
/* 119 */         f(avk);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void a(tf ☃) {
/* 124 */     ☃.a.a(new kv(kv.a.a, this.a, this.b, this.c, this.d, this.e, this.f));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */