/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class zd
/*    */   extends zl
/*    */ {
/*    */   public zd(Schema ☃, boolean bool) {
/* 14 */     super("EntityHorseSplitFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Typed<?>> a(String ☃, Typed<?> typed) {
/* 19 */     Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/* 20 */     if (Objects.equals("EntityHorse", ☃)) {
/*    */       
/* 22 */       int i = dynamic.getInt("Type");
/* 23 */       switch (i)
/*    */       
/*    */       { default:
/* 26 */           str = "Horse";
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
/*    */ 
/*    */           
/* 41 */           dynamic.remove("Type");
/*    */           
/* 43 */           type = (Type)getOutputSchema().findChoiceType(aax.o).types().get(str);
/* 44 */           return Pair.of(str, ((Optional)type.readTyped(typed.write()).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse the new horse")));case 1: str = "Donkey"; dynamic.remove("Type"); type = (Type)getOutputSchema().findChoiceType(aax.o).types().get(str); return Pair.of(str, ((Optional)type.readTyped(typed.write()).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse the new horse")));case 2: str = "Mule"; dynamic.remove("Type"); type = (Type)getOutputSchema().findChoiceType(aax.o).types().get(str); return Pair.of(str, ((Optional)type.readTyped(typed.write()).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse the new horse")));case 3: str = "ZombieHorse"; dynamic.remove("Type"); type = (Type)getOutputSchema().findChoiceType(aax.o).types().get(str); return Pair.of(str, ((Optional)type.readTyped(typed.write()).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse the new horse")));case 4: break; }  String str = "SkeletonHorse"; dynamic.remove("Type"); Type<?> type = (Type)getOutputSchema().findChoiceType(aax.o).types().get(str); return Pair.of(str, ((Optional)type.readTyped(typed.write()).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse the new horse")));
/*    */     } 
/* 46 */     return Pair.of(☃, typed);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */