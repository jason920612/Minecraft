/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class in
/*     */   extends ig
/*     */ {
/*     */   private final String b;
/*     */   @Nullable
/*     */   private final dr c;
/*     */   private final String d;
/*  23 */   private String e = "";
/*     */   
/*     */   public in(String ☃, String str1) {
/*  26 */     this.b = ☃;
/*  27 */     this.d = str1;
/*     */     
/*  29 */     dr dr1 = null;
/*     */     try {
/*  31 */       ds ds = new ds(new StringReader(☃));
/*  32 */       dr1 = ds.s();
/*  33 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*     */     
/*  35 */     this.c = dr1;
/*     */   }
/*     */   
/*     */   public String i() {
/*  39 */     return this.b;
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
/*     */   @Nullable
/*     */   public dr j() {
/*  58 */     return this.c;
/*     */   }
/*     */   
/*     */   public String k() {
/*  62 */     return this.d;
/*     */   }
/*     */   
/*     */   public void b(String ☃) {
/*  66 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String d() {
/*  71 */     return this.e;
/*     */   }
/*     */   
/*     */   public void b(bu ☃) {
/*  75 */     MinecraftServer minecraftServer = ☃.j();
/*  76 */     if (minecraftServer != null && minecraftServer.D() && xw.b(this.e)) {
/*  77 */       cfc cfc = minecraftServer.aM();
/*  78 */       cez cez = cfc.d(this.d);
/*  79 */       if (cfc.b(this.b, cez)) {
/*  80 */         cfb cfb = cfc.c(this.b, cez);
/*  81 */         b(String.format("%d", new Object[] { Integer.valueOf(cfb.b()) }));
/*     */       } else {
/*  83 */         this.e = "";
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public in l() {
/*  90 */     in ☃ = new in(this.b, this.d);
/*  91 */     ☃.b(this.e);
/*  92 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  97 */     if (this == ☃) {
/*  98 */       return true;
/*     */     }
/*     */     
/* 101 */     if (☃ instanceof in) {
/* 102 */       in in1 = (in)☃;
/* 103 */       return (this.b.equals(in1.b) && this.d.equals(in1.d) && super.equals(☃));
/*     */     } 
/*     */     
/* 106 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 111 */     return "ScoreComponent{name='" + this.b + '\'' + "objective='" + this.d + '\'' + ", siblings=" + this.a + ", style=" + 
/*     */ 
/*     */ 
/*     */       
/* 115 */       b() + '}';
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\in.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */