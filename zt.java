/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class zt
/*    */   extends abb
/*    */ {
/*    */   public zt(Schema ☃, boolean bool) {
/* 11 */     super("EntityZombieSplitFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Dynamic<?>> a(String ☃, Dynamic<?> dynamic) {
/* 16 */     if (Objects.equals("Zombie", ☃))
/* 17 */     { String str = "Zombie";
/* 18 */       int i = dynamic.getInt("ZombieType");
/* 19 */       switch (i)
/*    */       
/*    */       { 
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
/*    */         default:
/* 35 */           dynamic = dynamic.remove("ZombieType");
/* 36 */           return Pair.of(str, dynamic);
/*    */         case 1: case 2: case 3: case 4: case 5: str = "ZombieVillager"; dynamic = dynamic.set("Profession", dynamic.createInt(i - 1));
/* 38 */         case 6: break; }  str = "Husk"; }  return Pair.of(☃, dynamic);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */