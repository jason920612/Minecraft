/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
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
/*     */ public class bud
/*     */   extends bol
/*     */ {
/*  61 */   private static final Logger w = LogManager.getLogger();
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
/*  85 */   private static final bpn<brt, bry> x = ayu.a(bqo.f, new brt(0.004D, bru.b.a), ayu.n, bpx.e);
/*  86 */   private static final bpn<btu, bry> y = ayu.a(bqo.e, new btu(0, bxh.n.a), ayu.n, bpx.e);
/*  87 */   private static final bpn<btj, bry> z = ayu.a(bqo.m, new btj(), ayu.n, bpx.e);
/*  88 */   private static final bpn<bto, bry> A = ayu.a(bqo.l, new bto(), ayu.n, bpx.e);
/*  89 */   private static final bpn<bqb, bry> B = ayu.a(bqo.i, new bqb(), ayu.n, bpx.e);
/*  90 */   private static final bpn<bri, bry> C = ayu.a(bqo.h, new bri(), ayu.n, bpx.e);
/*  91 */   private static final bpn<brf, bry> D = ayu.a(bqo.j, new brf(), ayu.n, bpx.e);
/*  92 */   private static final bpn<bsy, bry> E = ayu.a(bqo.k, new bsy(false), ayu.n, bpx.e);
/*  93 */   private static final bpn<bsa, bry> F = ayu.a(bqo.n, new bsa(), ayu.n, bpx.e);
/*  94 */   private static final bpn<brm, bvj> G = ayu.a(bqo.am, new brm(bct.A), ayu.K, new bvj(4));
/*  95 */   private static final bpn<brm, bvj> H = ayu.a(bqo.am, new brm(bct.C), ayu.J, new bvj(80));
/*  96 */   private static final bpn<bqi, bry> I = ayu.a(bqo.q, new bqi(), ayu.n, bpx.e);
/*  97 */   private static final bpn<btz, bry> J = ayu.a(bqo.g, new btz(), ayu.n, bpx.e);
/*  98 */   private static final bpn<brw, bry> K = ayu.a(bqo.p, new brw(), ayu.n, bpx.e); public static final Map<bpn<?, ?>, boq.b> t; public static final Map<String, bpn<?, ?>[]> u;
/*  99 */   private static final bpn<bsc, bry> L = ayu.a(bqo.o, new bsc(bwt.b.b, 0.3F, 0.1F), ayu.n, bpx.e); public static final Map<bpn<?, ?>, bqp> v;
/*     */   static {
/* 101 */     t = k.<Map<bpn<?, ?>, boq.b>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(x, boq.b.c);
/*     */           
/*     */           ☃.put(y, boq.b.d);
/*     */           ☃.put(z, boq.b.c);
/*     */           ☃.put(A, boq.b.d);
/*     */           ☃.put(B, boq.b.d);
/*     */           ☃.put(C, boq.b.d);
/*     */           ☃.put(D, boq.b.d);
/*     */           ☃.put(E, boq.b.d);
/*     */           ☃.put(L, boq.b.d);
/*     */           ☃.put(G, boq.b.b);
/*     */           ☃.put(H, boq.b.b);
/*     */           ☃.put(I, boq.b.d);
/*     */           ☃.put(J, boq.b.d);
/*     */           ☃.put(K, boq.b.c);
/*     */           ☃.put(F, boq.b.d);
/*     */         });
/* 119 */     u = k.<Map<String, bpn<?, ?>[]>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("mineshaft", new bpn[] { x });
/*     */           
/*     */           ☃.put("village", new bpn[] { y });
/*     */           ☃.put("stronghold", new bpn[] { z });
/*     */           ☃.put("biome_1", new bpn[] { A, B, C, D, L, E });
/*     */           ☃.put("oceanmonument", new bpn[] { F });
/*     */           ☃.put("lake", new bpn[] { G });
/*     */           ☃.put("lava_lake", new bpn[] { H });
/*     */           ☃.put("endcity", new bpn[] { I });
/*     */           ☃.put("mansion", new bpn[] { J });
/*     */           ☃.put("fortress", new bpn[] { K });
/*     */         });
/* 132 */     v = k.<Map<bpn<?, ?>, bqp>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(x, new brt(0.004D, bru.b.a));
/*     */           ☃.put(y, new btu(0, bxh.n.a));
/*     */           ☃.put(z, new btj());
/*     */           ☃.put(A, new bto());
/*     */           ☃.put(B, new bqb());
/*     */           ☃.put(C, new bri());
/*     */           ☃.put(D, new brf());
/*     */           ☃.put(L, new bsc(bwt.b.b, 0.3F, 0.9F));
/*     */           ☃.put(E, new bsy(false));
/*     */           ☃.put(F, new bsa());
/*     */           ☃.put(I, new bqi());
/*     */           ☃.put(J, new btz());
/*     */           ☃.put(K, new brw());
/*     */         });
/*     */   }
/* 148 */   private final List<buc> M = Lists.newArrayList();
/* 149 */   private final Map<String, Map<String, String>> N = Maps.newHashMap();
/*     */   private ayu O;
/* 151 */   private final blc[] P = new blc[256];
/*     */   private boolean Q;
/*     */   private int R;
/*     */   
/*     */   @Nullable
/*     */   public static bcs a(String ☃) {
/*     */     try {
/* 158 */       pc pc = new pc(☃);
/* 159 */       if (fc.g.c(pc)) {
/* 160 */         return fc.g.a(pc);
/*     */       }
/* 162 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 163 */       w.warn("Invalid blockstate: {}", ☃, illegalArgumentException);
/*     */     } 
/*     */     
/* 166 */     return null;
/*     */   }
/*     */   
/*     */   public ayu t() {
/* 170 */     return this.O;
/*     */   }
/*     */   
/*     */   public void a(ayu ☃) {
/* 174 */     this.O = ☃;
/*     */   }
/*     */   
/*     */   public Map<String, Map<String, String>> u() {
/* 178 */     return this.N;
/*     */   }
/*     */   
/*     */   public List<buc> v() {
/* 182 */     return this.M;
/*     */   }
/*     */ 
/*     */   
/*     */   public void w() {
/* 187 */     int ☃ = 0;
/*     */     
/* 189 */     for (buc buc : this.M) {
/* 190 */       buc.a(☃);
/* 191 */       ☃ += buc.a();
/*     */     } 
/*     */ 
/*     */     
/* 195 */     this.R = 0;
/* 196 */     this.Q = true;
/* 197 */     ☃ = 0;
/* 198 */     for (buc buc : this.M) {
/* 199 */       for (int i = buc.c(); i < buc.c() + buc.a(); i++) {
/* 200 */         blc blc1 = buc.b();
/* 201 */         if (blc1.c() != bct.a) {
/*     */ 
/*     */           
/* 204 */           this.Q = false;
/* 205 */           this.P[i] = blc1;
/*     */         } 
/* 207 */       }  if (buc.b().c() == bct.a) {
/* 208 */         ☃ += buc.a(); continue;
/*     */       } 
/* 210 */       this.R += buc.a() + ☃;
/* 211 */       ☃ = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 218 */     StringBuilder ☃ = new StringBuilder();
/*     */     int i;
/* 220 */     for (i = 0; i < this.M.size(); i++) {
/* 221 */       if (i > 0) {
/* 222 */         ☃.append(",");
/*     */       }
/* 224 */       ☃.append(this.M.get(i));
/*     */     } 
/*     */     
/* 227 */     ☃.append(";");
/* 228 */     ☃.append(fc.m.b(this.O));
/*     */     
/* 230 */     ☃.append(";");
/* 231 */     if (!this.N.isEmpty()) {
/* 232 */       i = 0;
/*     */       
/* 234 */       for (Map.Entry<String, Map<String, String>> entry : this.N.entrySet()) {
/* 235 */         if (i++ > 0) {
/* 236 */           ☃.append(",");
/*     */         }
/* 238 */         ☃.append(((String)entry.getKey()).toLowerCase(Locale.ROOT));
/*     */         
/* 240 */         Map<String, String> map = entry.getValue();
/* 241 */         if (!map.isEmpty()) {
/* 242 */           ☃.append("(");
/* 243 */           int j = 0;
/*     */           
/* 245 */           for (Map.Entry<String, String> entry1 : map.entrySet()) {
/* 246 */             if (j++ > 0) {
/* 247 */               ☃.append(" ");
/*     */             }
/* 249 */             ☃.append(entry1.getKey());
/* 250 */             ☃.append("=");
/* 251 */             ☃.append(entry1.getValue());
/*     */           } 
/*     */           
/* 254 */           ☃.append(")");
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 259 */     return ☃.toString();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static bud a(Dynamic<?> ☃) {
/* 340 */     bud bud1 = bnb.e.b();
/*     */     
/* 342 */     List<Pair<Integer, bcs>> list = (List<Pair<Integer, bcs>>)((Stream)☃.get("layers").flatMap(Dynamic::getStream).orElse(Stream.empty())).map(☃ -> Pair.of(Integer.valueOf(☃.getInt("height", 1)), a(☃.getString("block")))).collect(Collectors.toList());
/*     */     
/* 344 */     if (list.stream().anyMatch(☃ -> (☃.getSecond() == null))) {
/* 345 */       return x();
/*     */     }
/* 347 */     List<buc> list1 = (List<buc>)list.stream().map(☃ -> new buc(((Integer)☃.getFirst()).intValue(), (bcs)☃.getSecond())).collect(Collectors.toList());
/*     */     
/* 349 */     if (list1.isEmpty()) {
/* 350 */       return x();
/*     */     }
/*     */     
/* 353 */     bud1.v().addAll(list1);
/* 354 */     bud1.w();
/*     */     
/* 356 */     bud1.a(fc.m.b(new pc(☃.getString("biome"))));
/*     */     
/* 358 */     ☃.get("structures").flatMap(Dynamic::getMapValues).ifPresent(map -> map.keySet().forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 366 */     return bud1;
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
/*     */ 
/*     */   
/*     */   public static bud x() {
/* 468 */     bud ☃ = bnb.e.b();
/*     */     
/* 470 */     ☃.a(ayz.c);
/* 471 */     ☃.v().add(new buc(1, bct.z));
/* 472 */     ☃.v().add(new buc(2, bct.j));
/* 473 */     ☃.v().add(new buc(1, bct.i));
/* 474 */     ☃.w();
/* 475 */     ☃.u().put("village", Maps.newHashMap());
/*     */     
/* 477 */     return ☃;
/*     */   }
/*     */   
/*     */   public boolean y() {
/* 481 */     return this.Q;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public blc[] A() {
/* 489 */     return this.P;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\bud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */