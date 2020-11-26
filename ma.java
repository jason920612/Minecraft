/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ma
/*     */   implements iv<iy>
/*     */ {
/*     */   private int a;
/*  17 */   private final List<a> b = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ma(int ☃, Collection<afn> collection) {
/*  23 */     this.a = ☃;
/*     */     
/*  25 */     for (afn afn : collection) {
/*  26 */       this.b.add(new a(this, afn.a().a(), afn.b(), afn.c()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  32 */     this.a = ☃.g();
/*     */     
/*  34 */     int i = ☃.readInt();
/*  35 */     for (int j = 0; j < i; j++) {
/*  36 */       String str = ☃.e(64);
/*  37 */       double d = ☃.readDouble();
/*  38 */       List<afo> list = Lists.newArrayList();
/*  39 */       int k = ☃.g();
/*     */       
/*  41 */       for (int m = 0; m < k; m++) {
/*  42 */         UUID uUID = ☃.i();
/*  43 */         list.add(new afo(uUID, "Unknown synced attribute modifier", ☃.readDouble(), ☃.readByte()));
/*     */       } 
/*     */       
/*  46 */       this.b.add(new a(this, str, d, list));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  52 */     ☃.d(this.a);
/*  53 */     ☃.writeInt(this.b.size());
/*     */     
/*  55 */     for (a a : this.b) {
/*  56 */       ☃.a(a.a());
/*  57 */       ☃.writeDouble(a.b());
/*  58 */       ☃.d(a.c().size());
/*     */       
/*  60 */       for (afo afo : a.c()) {
/*  61 */         ☃.a(afo.a());
/*  62 */         ☃.writeDouble(afo.d());
/*  63 */         ☃.writeByte(afo.c());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iy ☃) {
/*  70 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public ma() {}
/*     */ 
/*     */   
/*     */   public class a
/*     */   {
/*     */     private final String b;
/*     */     
/*     */     private final double c;
/*     */     
/*     */     private final Collection<afo> d;
/*     */ 
/*     */     
/*     */     public a(ma ☃, String str, double d, Collection<afo> collection) {
/*  87 */       this.b = str;
/*  88 */       this.c = d;
/*  89 */       this.d = collection;
/*     */     }
/*     */     
/*     */     public String a() {
/*  93 */       return this.b;
/*     */     }
/*     */     
/*     */     public double b() {
/*  97 */       return this.c;
/*     */     }
/*     */     
/*     */     public Collection<afo> c() {
/* 101 */       return this.d;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ma.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */