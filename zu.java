/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zu
/*    */   extends aao
/*    */ {
/*    */   public zu(Schema ☃, boolean bool) {
/* 14 */     super(☃, bool, "EntityZombieVillagerTypeFix", aax.o, "Zombie");
/*    */   }
/*    */   
/* 17 */   private static final Random a = new Random();
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 20 */     if (☃.getBoolean("IsVillager")) {
/* 21 */       if (!☃.get("ZombieType").isPresent()) {
/* 22 */         int i = a(☃.getInt("VillagerProfession", -1));
/* 23 */         if (i == -1) {
/* 24 */           i = a(a.nextInt(6));
/*    */         }
/*    */         
/* 27 */         ☃ = ☃.set("ZombieType", ☃.createInt(i));
/*    */       } 
/*    */       
/* 30 */       ☃ = ☃.remove("IsVillager");
/*    */     } 
/* 32 */     return ☃;
/*    */   }
/*    */   
/*    */   private int a(int ☃) {
/* 36 */     if (☃ < 0 || ☃ >= 6) {
/* 37 */       return -1;
/*    */     }
/* 39 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 44 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */