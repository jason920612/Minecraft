/*     */ import java.util.function.BiConsumer;
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
/*     */ public class a
/*     */ {
/*     */   private String a;
/*     */   private boolean b;
/*     */   private int c;
/*     */   private double d;
/*     */   private final axu.c e;
/*     */   private final BiConsumer<MinecraftServer, a> f;
/*     */   
/*     */   public a(String ☃, axu.c c1, BiConsumer<MinecraftServer, a> biConsumer) {
/* 201 */     this.e = c1;
/* 202 */     this.f = biConsumer;
/* 203 */     a(☃, null);
/*     */   }
/*     */   
/*     */   public void a(String ☃, @Nullable MinecraftServer minecraftServer) {
/* 207 */     this.a = ☃;
/* 208 */     this.b = Boolean.parseBoolean(☃);
/* 209 */     this.c = this.b ? 1 : 0;
/*     */     try {
/* 211 */       this.c = Integer.parseInt(☃);
/* 212 */     } catch (NumberFormatException numberFormatException) {}
/*     */     
/*     */     try {
/* 215 */       this.d = Double.parseDouble(☃);
/* 216 */     } catch (NumberFormatException numberFormatException) {}
/*     */     
/* 218 */     if (minecraftServer != null) {
/* 219 */       this.f.accept(minecraftServer, this);
/*     */     }
/*     */   }
/*     */   
/*     */   public String a() {
/* 224 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 228 */     return this.b;
/*     */   }
/*     */   
/*     */   public int c() {
/* 232 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public axu.c e() {
/* 240 */     return this.e;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\axu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */