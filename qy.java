/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
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
/*    */ public class qy
/*    */ {
/* 21 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new ir("commands.locate.failed", new Object[0]));
/*    */   
/*    */   public static void a(CommandDispatcher<bu> ☃) {
/* 24 */     ☃.register(
/* 25 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("locate")
/* 26 */         .requires(☃ -> ☃.c(2)))
/* 27 */         .then(bv.a("Village").executes(☃ -> a((bu)☃.getSource(), "Village"))))
/* 28 */         .then(bv.a("Mineshaft").executes(☃ -> a((bu)☃.getSource(), "Mineshaft"))))
/* 29 */         .then(bv.a("Mansion").executes(☃ -> a((bu)☃.getSource(), "Mansion"))))
/* 30 */         .then(bv.a("Igloo").executes(☃ -> a((bu)☃.getSource(), "Igloo"))))
/* 31 */         .then(bv.a("Desert_Pyramid").executes(☃ -> a((bu)☃.getSource(), "Desert_Pyramid"))))
/* 32 */         .then(bv.a("Jungle_Pyramid").executes(☃ -> a((bu)☃.getSource(), "Jungle_Pyramid"))))
/* 33 */         .then(bv.a("Swamp_Hut").executes(☃ -> a((bu)☃.getSource(), "Swamp_Hut"))))
/* 34 */         .then(bv.a("Stronghold").executes(☃ -> a((bu)☃.getSource(), "Stronghold"))))
/* 35 */         .then(bv.a("Monument").executes(☃ -> a((bu)☃.getSource(), "Monument"))))
/* 36 */         .then(bv.a("Fortress").executes(☃ -> a((bu)☃.getSource(), "Fortress"))))
/* 37 */         .then(bv.a("EndCity").executes(☃ -> a((bu)☃.getSource(), "EndCity"))))
/* 38 */         .then(bv.a("Ocean_Ruin").executes(☃ -> a((bu)☃.getSource(), "Ocean_Ruin"))))
/* 39 */         .then(bv.a("Buried_Treasure").executes(☃ -> a((bu)☃.getSource(), "Buried_Treasure"))))
/* 40 */         .then(bv.a("Shipwreck").executes(☃ -> a((bu)☃.getSource(), "Shipwreck"))));
/*    */   }
/*    */ 
/*    */   
/*    */   private static int a(bu ☃, String str) throws CommandSyntaxException {
/* 45 */     el el1 = new el(☃.d());
/* 46 */     el el2 = ☃.e().a(str, el1, 100, false);
/* 47 */     if (el2 == null) {
/* 48 */       throw a.create();
/*    */     }
/*    */     
/* 51 */     int i = xq.d(a(el1.o(), el1.q(), el2.o(), el2.q()));
/* 52 */     ij ij = ik.a(new ir("chat.coordinates", new Object[] { Integer.valueOf(el2.o()), "~", Integer.valueOf(el2.q()) })).a(ip1 -> ip1.a(a.k).a(new ii(ii.a.d, "/tp @s " + ☃.o() + " ~ " + ☃.q())).a(new il(il.a.a, new ir("chat.coordinates.tooltip", new Object[0]))));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     ☃.a(new ir("commands.locate.success", new Object[] { str, ij, Integer.valueOf(i) }), false);
/*    */     
/* 59 */     return i;
/*    */   }
/*    */   
/*    */   private static float a(int ☃, int i, int j, int k) {
/* 63 */     int m = j - ☃;
/* 64 */     int n = k - i;
/* 65 */     return xq.c((m * m + n * n));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\qy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */