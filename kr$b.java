/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   private final int b;
/*     */   private final axv c;
/*     */   private final GameProfile d;
/*     */   private final ij e;
/*     */   
/*     */   public b(kr ☃, GameProfile gameProfile, int i, @Nullable axv axv1, @Nullable ij ij1) {
/* 188 */     this.d = gameProfile;
/* 189 */     this.b = i;
/* 190 */     this.c = axv1;
/* 191 */     this.e = ij1;
/*     */   }
/*     */   
/*     */   public GameProfile a() {
/* 195 */     return this.d;
/*     */   }
/*     */   
/*     */   public int b() {
/* 199 */     return this.b;
/*     */   }
/*     */   
/*     */   public axv c() {
/* 203 */     return this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ij d() {
/* 208 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 213 */     return MoreObjects.toStringHelper(this)
/* 214 */       .add("latency", this.b)
/* 215 */       .add("gameMode", this.c)
/* 216 */       .add("profile", this.d)
/* 217 */       .add("displayName", (this.e == null) ? null : ij.a.a(this.e))
/* 218 */       .toString();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\kr$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */