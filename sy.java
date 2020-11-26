/*    */ import java.util.function.Function;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sy
/*    */   extends td
/*    */ {
/*    */   public sy(MinecraftServer ☃, ccc ccc1, bod bod1, td td1, xr xr1) {
/* 15 */     super(☃, ccc1, td1.h(), new cbx(td1.g()), bod1, xr1);
/*    */     
/* 17 */     td1.d().a(new bmt(this)
/*    */         {
/*    */           public void a(bmv ☃, double d) {
/* 20 */             this.a.d().a(d);
/*    */           }
/*    */ 
/*    */           
/*    */           public void a(bmv ☃, double d1, double d2, long l) {
/* 25 */             this.a.d().a(d1, d2, l);
/*    */           }
/*    */ 
/*    */           
/*    */           public void a(bmv ☃, double d1, double d2) {
/* 30 */             this.a.d().c(d1, d2);
/*    */           }
/*    */ 
/*    */           
/*    */           public void a(bmv ☃, int i) {
/* 35 */             this.a.d().b(i);
/*    */           }
/*    */ 
/*    */           
/*    */           public void b(bmv ☃, int i) {
/* 40 */             this.a.d().c(i);
/*    */           }
/*    */ 
/*    */           
/*    */           public void b(bmv ☃, double d) {
/* 45 */             this.a.d().c(d);
/*    */           }
/*    */ 
/*    */           
/*    */           public void c(bmv ☃, double d) {
/* 50 */             this.a.d().b(d);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public sy b() {
/* 64 */     String ☃ = aji.a(this.t);
/* 65 */     aji aji = a(bod.a, aji::new, ☃);
/* 66 */     if (aji == null) {
/* 67 */       this.z = new aji(this);
/* 68 */       a(bod.a, ☃, this.z);
/*    */     } else {
/* 70 */       this.z = aji;
/* 71 */       this.z.a(this);
/*    */     } 
/*    */     
/* 74 */     return this;
/*    */   }
/*    */   
/*    */   public void t_() {
/* 78 */     this.t.k();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */