/*    */ import com.mojang.datafixers.DataFixer;
/*    */ import java.io.File;
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cbv
/*    */   extends cbz
/*    */ {
/*    */   public cbv(File ☃, String str, @Nullable MinecraftServer minecraftServer, DataFixer dataFixer) {
/* 20 */     super(☃, str, minecraftServer, dataFixer);
/*    */   }
/*    */ 
/*    */   
/*    */   public bnw a(boc ☃) {
/* 25 */     File file = ☃.q().a(b());
/* 26 */     file.mkdirs();
/* 27 */     return new bnv(file, this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ccb ☃, @Nullable gy gy1) {
/* 32 */     ☃.d(19133);
/* 33 */     super.a(☃, gy1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/*    */     try {
/* 39 */       cdw.a().b();
/* 40 */     } catch (InterruptedException ☃) {
/* 41 */       ☃.printStackTrace();
/*    */     } 
/*    */     
/* 44 */     boa.a();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cbv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */