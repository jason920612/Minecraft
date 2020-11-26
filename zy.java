/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Dynamic;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zy
/*    */   extends DataFix
/*    */ {
/*    */   public zy(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 22 */     Optional<? extends Dynamic<?>> optional = ☃.get("display");
/* 23 */     if (optional.isPresent()) {
/* 24 */       Dynamic<?> dynamic = optional.get();
/* 25 */       Optional<String> optional1 = dynamic.get("Name").flatMap(Dynamic::getStringValue);
/* 26 */       if (optional1.isPresent()) {
/* 27 */         dynamic = dynamic.set("Name", dynamic.createString(ij.a.a(new iq(optional1.get()))));
/*    */       } else {
/* 29 */         Optional<String> optional2 = dynamic.get("LocName").flatMap(Dynamic::getStringValue);
/* 30 */         if (optional2.isPresent()) {
/* 31 */           dynamic = dynamic.set("Name", dynamic.createString(ij.a.a(new ir(optional2.get(), new Object[0]))));
/* 32 */           dynamic = dynamic.remove("LocName");
/*    */         } 
/*    */       } 
/* 35 */       return ☃.set("display", dynamic);
/*    */     } 
/* 37 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 42 */     Type<?> ☃ = getInputSchema().getType(aax.k);
/* 43 */     OpticFinder<?> opticFinder = ☃.findField("tag");
/*    */     
/* 45 */     return fixTypeEverywhereTyped("ItemCustomNameToComponentFix", ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */