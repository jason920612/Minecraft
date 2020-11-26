/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class yj
/*    */   extends aao {
/*    */   public yj(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool, "BlockEntityJukeboxFix", aax.j, "minecraft:jukebox");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 17 */     Type<?> type1 = getInputSchema().getChoiceType(aax.j, "minecraft:jukebox");
/* 18 */     Type<?> type2 = type1.findFieldType("RecordItem");
/* 19 */     OpticFinder<?> opticFinder = DSL.fieldFinder("RecordItem", type2);
/* 20 */     Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/* 21 */     int i = dynamic.getInt("Record");
/* 22 */     if (i > 0) {
/* 23 */       dynamic.remove("Record");
/*    */       
/* 25 */       String str = aah.a(zz.a(i), 0);
/* 26 */       if (str != null) {
/* 27 */         Dynamic<?> dynamic1 = dynamic.emptyMap();
/* 28 */         dynamic1 = dynamic1.set("id", dynamic1.createString(str));
/* 29 */         dynamic1 = dynamic1.set("Count", dynamic1.createByte((byte)1));
/* 30 */         return ☃.set(opticFinder, (Typed)((Optional)type2.readTyped(dynamic1).getSecond()).orElseThrow(() -> new IllegalStateException("Could not create record item stack."))).set(DSL.remainderFinder(), dynamic);
/*    */       } 
/*    */     } 
/* 33 */     return ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */