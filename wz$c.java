/*     */ import com.google.gson.JsonArray;
/*     */ import java.util.Collection;
/*     */ import java.util.function.Function;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c<T>
/*     */   implements wz.b<T>
/*     */ {
/*     */   @Nullable
/*     */   private final pc a;
/*     */   @Nullable
/*     */   private wz<T> b;
/*     */   
/*     */   public c(pc ☃) {
/* 205 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public c(wz<T> ☃) {
/* 209 */     this.a = ☃.c();
/* 210 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Function<pc, wz<T>> ☃) {
/* 215 */     if (this.b == null) {
/* 216 */       this.b = ☃.apply(this.a);
/*     */     }
/*     */     
/* 219 */     return (this.b != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Collection<T> ☃) {
/* 224 */     if (this.b == null) {
/* 225 */       throw new IllegalStateException("Cannot build unresolved tag entry");
/*     */     }
/* 227 */     ☃.addAll(this.b.a());
/*     */   }
/*     */   
/*     */   public pc a() {
/* 231 */     if (this.b != null)
/* 232 */       return this.b.c(); 
/* 233 */     if (this.a != null) {
/* 234 */       return this.a;
/*     */     }
/* 236 */     throw new IllegalStateException("Cannot serialize an anonymous tag to json!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(JsonArray ☃, Function<T, pc> function) {
/* 242 */     ☃.add("#" + a());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\wz$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */