/*    */ import com.mojang.authlib.GameProfile;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.lang3.StringUtils;
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
/*    */ 
/*    */ public class bgk
/*    */   extends bhk
/*    */ {
/*    */   protected bgk(bcs.c ☃) {
/* 20 */     super(bhk.b.c, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(axy ☃, el el1, blc blc1, @Nullable afa afa1, ate ate1) {
/* 25 */     super.a(☃, el1, blc1, afa1, ate1);
/*    */     
/* 27 */     bji bji = ☃.f(el1);
/*    */     
/* 29 */     if (bji instanceof bkd) {
/* 30 */       bkd bkd = (bkd)bji;
/* 31 */       GameProfile gameProfile = null;
/* 32 */       if (ate1.m()) {
/* 33 */         gy gy = ate1.n();
/*    */ 
/*    */         
/* 36 */         if (gy.c("SkullOwner", 10)) {
/* 37 */           gameProfile = hk.a(gy.p("SkullOwner"));
/* 38 */         } else if (gy.c("SkullOwner", 8) && !StringUtils.isBlank(gy.l("SkullOwner"))) {
/* 39 */           gameProfile = new GameProfile(null, gy.l("SkullOwner"));
/*    */         } 
/*    */       } 
/*    */       
/* 43 */       bkd.a(gameProfile);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bgk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */