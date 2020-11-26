/*    */ import com.mojang.authlib.GameProfile;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ato
/*    */   extends auf
/*    */ {
/*    */   public ato(bcs ☃, bcs bcs1, ata.a a1) {
/* 15 */     super(☃, bcs1, a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public ij i(ate ☃) {
/* 20 */     if (☃.b() == atf.dK && ☃.m()) {
/* 21 */       String str = null;
/* 22 */       gy gy = ☃.n();
/* 23 */       if (gy.c("SkullOwner", 8)) {
/* 24 */         str = gy.l("SkullOwner");
/* 25 */       } else if (gy.c("SkullOwner", 10)) {
/* 26 */         gy gy1 = gy.p("SkullOwner");
/* 27 */         if (gy1.c("Name", 8)) {
/* 28 */           str = gy1.l("Name");
/*    */         }
/*    */       } 
/* 31 */       if (str != null) {
/* 32 */         return new ir(a() + ".named", new Object[] { str });
/*    */       }
/*    */     } 
/* 35 */     return super.i(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(gy ☃) {
/* 40 */     super.a(☃);
/* 41 */     if (☃.c("SkullOwner", 8) && !StringUtils.isBlank(☃.l("SkullOwner"))) {
/* 42 */       GameProfile gameProfile = new GameProfile(null, ☃.l("SkullOwner"));
/* 43 */       gameProfile = bkd.b(gameProfile);
/* 44 */       ☃.a("SkullOwner", hk.a(new gy(), gameProfile));
/* 45 */       return true;
/*    */     } 
/* 47 */     return false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ato.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */