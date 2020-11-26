/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
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
/*    */ public class b
/*    */   implements cd.a
/*    */ {
/*    */   private final dr a;
/*    */   
/*    */   public b(dr ☃) {
/* 71 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<GameProfile> getNames(bu ☃) throws CommandSyntaxException {
/* 76 */     List<tf> list = this.a.d(☃);
/* 77 */     if (list.isEmpty()) {
/* 78 */       throw cb.e.create();
/*    */     }
/* 80 */     List<GameProfile> list1 = Lists.newArrayList();
/* 81 */     for (tf tf : list) {
/* 82 */       list1.add(tf.do());
/*    */     }
/* 84 */     return list1;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cd$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */