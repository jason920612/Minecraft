/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class zo
/*    */   extends abb
/*    */ {
/*    */   public zo(Schema ☃, boolean bool) {
/* 11 */     super("EntitySkeletonSplitFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Dynamic<?>> a(String ☃, Dynamic<?> dynamic) {
/* 16 */     if (Objects.equals(☃, "Skeleton")) {
/* 17 */       int i = dynamic.getInt("SkeletonType");
/* 18 */       if (i == 1) {
/* 19 */         ☃ = "WitherSkeleton";
/* 20 */       } else if (i == 2) {
/* 21 */         ☃ = "Stray";
/*    */       } 
/*    */     } 
/* 24 */     return Pair.of(☃, dynamic);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */