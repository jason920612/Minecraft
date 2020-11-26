/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.HashMap;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class zi
/*    */   extends aao {
/*    */   private static final Map<String, String> a;
/*    */   
/*    */   public zi(Schema ☃, boolean bool) {
/* 17 */     super(☃, bool, "EntityPaintingMotiveFix", aax.o, "minecraft:painting");
/*    */   }
/*    */   static {
/* 20 */     a = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*    */           ☃.put("donkeykong", "donkey_kong");
/*    */           ☃.put("burningskull", "burning_skull");
/*    */           ☃.put("skullandroses", "skull_and_roses");
/*    */         });
/*    */   }
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 27 */     Optional<String> optional = ☃.get("Motive").flatMap(Dynamic::getStringValue);
/* 28 */     if (optional.isPresent()) {
/* 29 */       String str = ((String)optional.get()).toLowerCase(Locale.ROOT);
/* 30 */       return ☃.set("Motive", ☃.createString((new pc(a.getOrDefault(str, str))).toString()));
/*    */     } 
/* 32 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 37 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */