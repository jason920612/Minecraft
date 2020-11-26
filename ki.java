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
/*     */ public class ki
/*     */   implements iv<iy>
/*     */ {
/*     */   private float a;
/*     */   private float b;
/*     */   private float c;
/*     */   private float d;
/*     */   private float e;
/*     */   private float f;
/*     */   private float g;
/*     */   private int h;
/*     */   private boolean i;
/*     */   private fk j;
/*     */   
/*     */   public ki() {}
/*     */   
/*     */   public <T extends fk> ki(T ☃, boolean bool, float f1, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
/*  30 */     this.j = (fk)☃;
/*  31 */     this.i = bool;
/*  32 */     this.a = f1;
/*  33 */     this.b = f2;
/*  34 */     this.c = f3;
/*  35 */     this.d = f4;
/*  36 */     this.e = f5;
/*  37 */     this.f = f6;
/*  38 */     this.g = f7;
/*  39 */     this.h = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hy ☃) throws IOException {
/*  44 */     fl<?> fl = fc.u.a(☃.readInt());
/*  45 */     if (fl == null) {
/*  46 */       fl = fm.c;
/*     */     }
/*  48 */     this.i = ☃.readBoolean();
/*  49 */     this.a = ☃.readFloat();
/*  50 */     this.b = ☃.readFloat();
/*  51 */     this.c = ☃.readFloat();
/*  52 */     this.d = ☃.readFloat();
/*  53 */     this.e = ☃.readFloat();
/*  54 */     this.f = ☃.readFloat();
/*  55 */     this.g = ☃.readFloat();
/*  56 */     this.h = ☃.readInt();
/*  57 */     this.j = a(☃, fl);
/*     */   }
/*     */   
/*     */   private <T extends fk> T a(hy ☃, fl<T> fl1) {
/*  61 */     return fl1.f().b(fl1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hy ☃) throws IOException {
/*  66 */     ☃.writeInt(fc.u.a(this.j.b()));
/*  67 */     ☃.writeBoolean(this.i);
/*  68 */     ☃.writeFloat(this.a);
/*  69 */     ☃.writeFloat(this.b);
/*  70 */     ☃.writeFloat(this.c);
/*  71 */     ☃.writeFloat(this.d);
/*  72 */     ☃.writeFloat(this.e);
/*  73 */     ☃.writeFloat(this.f);
/*  74 */     ☃.writeFloat(this.g);
/*  75 */     ☃.writeInt(this.h);
/*  76 */     this.j.a(☃);
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
/*     */   public void a(iy ☃) {
/* 122 */     ☃.a(this);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ki.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */