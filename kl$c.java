/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */   extends kl
/*     */ {
/*     */   public c() {
/* 104 */     this.h = true;
/*     */   }
/*     */   
/*     */   public c(int ☃, byte b1, byte b2, boolean bool) {
/* 108 */     super(☃);
/* 109 */     this.e = b1;
/* 110 */     this.f = b2;
/* 111 */     this.h = true;
/* 112 */     this.g = bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/* 117 */     super.a(☃);
/* 118 */     this.e = ☃.readByte();
/* 119 */     this.f = ☃.readByte();
/* 120 */     this.g = ☃.readBoolean();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/* 125 */     super.b(☃);
/* 126 */     ☃.writeByte(this.e);
/* 127 */     ☃.writeByte(this.f);
/* 128 */     ☃.writeBoolean(this.g);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\kl$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */