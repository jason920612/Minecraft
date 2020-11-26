/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class yt
/*    */   extends DataFix
/*    */ {
/*    */   public yt(Schema ☃, boolean bool) {
/* 24 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 29 */     Type<?> ☃ = getInputSchema().getType(aax.c);
/* 30 */     Type<?> type1 = getOutputSchema().getType(aax.c);
/* 31 */     Type<?> type2 = ☃.findFieldType("Level");
/* 32 */     Type<?> type3 = type1.findFieldType("Level");
/* 33 */     Type<?> type4 = type2.findFieldType("TileTicks");
/*    */     
/* 35 */     OpticFinder<?> opticFinder1 = DSL.fieldFinder("Level", type2);
/* 36 */     OpticFinder<?> opticFinder2 = DSL.fieldFinder("TileTicks", type4);
/*    */     
/* 38 */     return TypeRewriteRule.seq(
/* 39 */         fixTypeEverywhereTyped("ChunkToProtoChunkFix", ☃, getOutputSchema().getType(aax.c), typed -> typed.updateTyped(☃, type, ())), 
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
/* 82 */         writeAndRead("Structure biome inject", getInputSchema().getType(aax.s), getOutputSchema().getType(aax.s)));
/*    */   }
/*    */ 
/*    */   
/*    */   private static short a(int ☃, int i, int j) {
/* 87 */     return (short)(☃ & 0xF | (i & 0xF) << 4 | (j & 0xF) << 8);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\yt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */