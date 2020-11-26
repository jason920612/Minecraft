/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class axh
/*     */   implements bt
/*     */ {
/*  24 */   private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
/*     */   
/*  26 */   private long b = -1L;
/*     */   private boolean c = true;
/*     */   private int d;
/*     */   private boolean e = true;
/*     */   private ij f;
/*  31 */   private String g = "";
/*  32 */   private ij h = new iq("@");
/*     */   
/*     */   public int i() {
/*  35 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  39 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public ij j() {
/*  43 */     return (this.f == null) ? new iq("") : this.f;
/*     */   }
/*     */   
/*     */   public gy a(gy ☃) {
/*  47 */     ☃.a("Command", this.g);
/*  48 */     ☃.b("SuccessCount", this.d);
/*  49 */     ☃.a("CustomName", ij.a.a(this.h));
/*  50 */     ☃.a("TrackOutput", this.e);
/*  51 */     if (this.f != null && this.e) {
/*  52 */       ☃.a("LastOutput", ij.a.a(this.f));
/*     */     }
/*  54 */     ☃.a("UpdateLastExecution", this.c);
/*  55 */     if (this.c && this.b > 0L) {
/*  56 */       ☃.a("LastExecution", this.b);
/*     */     }
/*     */     
/*  59 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(gy ☃) {
/*  63 */     this.g = ☃.l("Command");
/*  64 */     this.d = ☃.h("SuccessCount");
/*  65 */     if (☃.c("CustomName", 8)) {
/*  66 */       this.h = ij.a.a(☃.l("CustomName"));
/*     */     }
/*  68 */     if (☃.c("TrackOutput", 1)) {
/*  69 */       this.e = ☃.q("TrackOutput");
/*     */     }
/*  71 */     if (☃.c("LastOutput", 8) && this.e) {
/*     */       try {
/*  73 */         this.f = ij.a.a(☃.l("LastOutput"));
/*  74 */       } catch (Throwable throwable) {
/*  75 */         this.f = new iq(throwable.getMessage());
/*     */       } 
/*     */     } else {
/*  78 */       this.f = null;
/*     */     } 
/*  80 */     if (☃.e("UpdateLastExecution")) {
/*  81 */       this.c = ☃.q("UpdateLastExecution");
/*     */     }
/*  83 */     if (this.c && ☃.e("LastExecution")) {
/*  84 */       this.b = ☃.i("LastExecution");
/*     */     } else {
/*  86 */       this.b = -1L;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  91 */     this.g = ☃;
/*  92 */     this.d = 0;
/*     */   }
/*     */   
/*     */   public String k() {
/*  96 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean a(axy ☃) {
/* 100 */     if (☃.B || ☃.V() == this.b) {
/* 101 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 105 */     if ("Searge".equalsIgnoreCase(this.g)) {
/* 106 */       this.f = new iq("#itzlipofutzli");
/* 107 */       this.d = 1;
/* 108 */       return true;
/*     */     } 
/*     */     
/* 111 */     this.d = 0;
/*     */     
/* 113 */     MinecraftServer minecraftServer = d().z();
/* 114 */     if (minecraftServer != null && minecraftServer.D() && minecraftServer.Y() && !xw.b(this.g)) {
/*     */       try {
/* 116 */         this.f = null;
/* 117 */         bu bu = h().a((☃, bool, i) -> {
/*     */               if (bool) {
/*     */                 this.d++;
/*     */               }
/*     */             });
/* 122 */         minecraftServer.aI().a(bu, this.g);
/* 123 */       } catch (Throwable throwable) {
/* 124 */         b b = b.a(throwable, "Executing command block");
/* 125 */         c c = b.a("Command to be executed");
/*     */         
/* 127 */         c.a("Command", this::k);
/*     */         
/* 129 */         c.a("Name", () -> l().getString());
/*     */         
/* 131 */         throw new h(b);
/*     */       } 
/*     */     }
/*     */     
/* 135 */     if (this.c) {
/* 136 */       this.b = ☃.V();
/*     */     } else {
/* 138 */       this.b = -1L;
/*     */     } 
/*     */     
/* 141 */     return true;
/*     */   }
/*     */   
/*     */   public ij l() {
/* 145 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(ij ☃) {
/* 149 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ij ☃) {
/* 154 */     if (this.e) {
/* 155 */       this.f = (new iq("[" + a.format(new Date()) + "] ")).a(☃);
/* 156 */       e();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(@Nullable ij ☃) {
/* 167 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 171 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aog ☃) {
/* 179 */     if (!☃.dK()) {
/* 180 */       return false;
/*     */     }
/* 182 */     if ((☃.bJ()).B) {
/* 183 */       ☃.a(this);
/*     */     }
/* 185 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 194 */     return (d().X().b("sendCommandFeedback") && this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 199 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B_() {
/* 204 */     return d().X().b("commandBlockOutput");
/*     */   }
/*     */   
/*     */   public abstract td d();
/*     */   
/*     */   public abstract void e();
/*     */   
/*     */   public abstract bu h();
/*     */ }


/* Location:              F:\dw\server.jar!\axh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */