/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
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
/*     */ public class pu
/*     */   extends tb
/*     */ {
/*     */   private final pc h;
/*  23 */   private final Set<UUID> i = Sets.newHashSet();
/*     */   private int j;
/*  25 */   private int k = 100;
/*     */   
/*     */   public pu(pc ☃, ij ij1) {
/*  28 */     super(ij1, adc.a.g, adc.b.a);
/*  29 */     this.h = ☃;
/*  30 */     a(0.0F);
/*     */   }
/*     */   
/*     */   public pc a() {
/*  34 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(tf ☃) {
/*  39 */     super.a(☃);
/*  40 */     this.i.add(☃.bt());
/*     */   }
/*     */   
/*     */   public void a(UUID ☃) {
/*  44 */     this.i.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(tf ☃) {
/*  49 */     super.b(☃);
/*  50 */     this.i.remove(☃.bt());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  55 */     super.b();
/*  56 */     this.i.clear();
/*     */   }
/*     */   
/*     */   public int c() {
/*  60 */     return this.j;
/*     */   }
/*     */   
/*     */   public int d() {
/*  64 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  68 */     this.j = ☃;
/*  69 */     a(xq.a(☃ / this.k, 0.0F, 1.0F));
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/*  73 */     this.k = ☃;
/*  74 */     a(xq.a(this.j / ☃, 0.0F, 1.0F));
/*     */   }
/*     */   
/*     */   public final ij e() {
/*  78 */     return ik.a(j()).a(☃ -> ☃.a(l().a()).a(new il(il.a.a, new iq(a().toString()))).a(a().toString()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(Collection<tf> ☃) {
/*  86 */     Set<UUID> set = Sets.newHashSet();
/*  87 */     Set<tf> set1 = Sets.newHashSet();
/*     */     
/*  89 */     for (UUID uUID : this.i) {
/*  90 */       boolean bool = false;
/*  91 */       for (tf tf : ☃) {
/*  92 */         if (tf.bt().equals(uUID)) {
/*  93 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/*  97 */       if (!bool) {
/*  98 */         set.add(uUID);
/*     */       }
/*     */     } 
/*     */     
/* 102 */     for (tf tf : ☃) {
/* 103 */       boolean bool = false;
/* 104 */       for (UUID uUID : this.i) {
/* 105 */         if (tf.bt().equals(uUID)) {
/* 106 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 110 */       if (!bool) {
/* 111 */         set1.add(tf);
/*     */       }
/*     */     } 
/*     */     
/* 115 */     for (UUID uUID : set) {
/* 116 */       for (tf tf : h()) {
/* 117 */         if (tf.bt().equals(uUID)) {
/* 118 */           b(tf);
/*     */           break;
/*     */         } 
/*     */       } 
/* 122 */       this.i.remove(uUID);
/*     */     } 
/*     */     
/* 125 */     for (tf tf : set1) {
/* 126 */       a(tf);
/*     */     }
/*     */     
/* 129 */     return (!set.isEmpty() || !set1.isEmpty());
/*     */   }
/*     */   
/*     */   public gy f() {
/* 133 */     gy ☃ = new gy();
/*     */     
/* 135 */     ☃.a("Name", ij.a.a(this.a));
/* 136 */     ☃.a("Visible", g());
/* 137 */     ☃.b("Value", this.j);
/* 138 */     ☃.b("Max", this.k);
/* 139 */     ☃.a("Color", l().b());
/* 140 */     ☃.a("Overlay", m().a());
/* 141 */     ☃.a("DarkenScreen", n());
/* 142 */     ☃.a("PlayBossMusic", o());
/* 143 */     ☃.a("CreateWorldFog", p());
/*     */     
/* 145 */     he he = new he();
/* 146 */     for (UUID uUID : this.i) {
/* 147 */       he.a(hk.a(uUID));
/*     */     }
/* 149 */     ☃.a("Players", he);
/*     */     
/* 151 */     return ☃;
/*     */   }
/*     */   
/*     */   public static pu a(gy ☃, pc pc1) {
/* 155 */     pu pu1 = new pu(pc1, ij.a.a(☃.l("Name")));
/* 156 */     pu1.d(☃.q("Visible"));
/* 157 */     pu1.a(☃.h("Value"));
/* 158 */     pu1.b(☃.h("Max"));
/* 159 */     pu1.a(adc.a.a(☃.l("Color")));
/* 160 */     pu1.a(adc.b.a(☃.l("Overlay")));
/* 161 */     pu1.a(☃.q("DarkenScreen"));
/* 162 */     pu1.b(☃.q("PlayBossMusic"));
/* 163 */     pu1.c(☃.q("CreateWorldFog"));
/*     */     
/* 165 */     he he = ☃.d("Players", 10);
/* 166 */     for (int i = 0; i < he.size(); i++) {
/* 167 */       pu1.a(hk.b(he.e(i)));
/*     */     }
/*     */     
/* 170 */     return pu1;
/*     */   }
/*     */   
/*     */   public void c(tf ☃) {
/* 174 */     if (this.i.contains(☃.bt())) {
/* 175 */       a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void d(tf ☃) {
/* 180 */     super.b(☃);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\pu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */