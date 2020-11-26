/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wx
/*    */ {
/*  9 */   private static xa<ata> E = new xa<>(☃ -> false, ☃ -> null, "", false, "");
/*    */ 
/*    */   
/*    */   private static int F;
/*    */ 
/*    */   
/* 15 */   public static final wz<ata> a = a("wool");
/* 16 */   public static final wz<ata> b = a("planks");
/* 17 */   public static final wz<ata> c = a("stone_bricks");
/* 18 */   public static final wz<ata> d = a("wooden_buttons");
/* 19 */   public static final wz<ata> e = a("buttons");
/* 20 */   public static final wz<ata> f = a("carpets");
/* 21 */   public static final wz<ata> g = a("wooden_doors");
/* 22 */   public static final wz<ata> h = a("wooden_stairs");
/* 23 */   public static final wz<ata> i = a("wooden_slabs");
/* 24 */   public static final wz<ata> j = a("wooden_pressure_plates");
/* 25 */   public static final wz<ata> k = a("wooden_trapdoors");
/* 26 */   public static final wz<ata> l = a("doors");
/* 27 */   public static final wz<ata> m = a("saplings");
/* 28 */   public static final wz<ata> n = a("logs");
/* 29 */   public static final wz<ata> o = a("dark_oak_logs");
/* 30 */   public static final wz<ata> p = a("oak_logs");
/* 31 */   public static final wz<ata> q = a("birch_logs");
/* 32 */   public static final wz<ata> r = a("acacia_logs");
/* 33 */   public static final wz<ata> s = a("jungle_logs");
/* 34 */   public static final wz<ata> t = a("spruce_logs");
/* 35 */   public static final wz<ata> u = a("banners");
/* 36 */   public static final wz<ata> v = a("sand");
/* 37 */   public static final wz<ata> w = a("stairs");
/* 38 */   public static final wz<ata> x = a("slabs");
/* 39 */   public static final wz<ata> y = a("anvil");
/* 40 */   public static final wz<ata> z = a("rails");
/* 41 */   public static final wz<ata> A = a("leaves");
/* 42 */   public static final wz<ata> B = a("trapdoors");
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 47 */   public static final wz<ata> C = a("boats");
/* 48 */   public static final wz<ata> D = a("fishes");
/*    */   
/*    */   public static void a(xa<ata> ☃) {
/* 51 */     E = ☃;
/* 52 */     F++;
/*    */   }
/*    */   
/*    */   public static xa<ata> a() {
/* 56 */     return E;
/*    */   }
/*    */   
/*    */   private static wz<ata> a(String ☃) {
/* 60 */     return new a(new pc(☃));
/*    */   }
/*    */   
/*    */   public static class a extends wz<ata> {
/* 64 */     private int a = -1;
/*    */     private wz<ata> b;
/*    */     
/*    */     public a(pc ☃) {
/* 68 */       super(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(ata ☃) {
/* 73 */       if (this.a != wx.b()) {
/* 74 */         this.b = wx.c().b(c());
/* 75 */         this.a = wx.b();
/*    */       } 
/* 77 */       return this.b.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public Collection<ata> a() {
/* 82 */       if (this.a != wx.b()) {
/* 83 */         this.b = wx.c().b(c());
/* 84 */         this.a = wx.b();
/*    */       } 
/* 86 */       return this.b.a();
/*    */     }
/*    */ 
/*    */     
/*    */     public Collection<wz.b<ata>> b() {
/* 91 */       if (this.a != wx.b()) {
/* 92 */         this.b = wx.c().b(c());
/* 93 */         this.a = wx.b();
/*    */       } 
/* 95 */       return this.b.b();
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\wx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */