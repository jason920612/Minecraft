/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ public class bs
/*    */   extends RuntimeException
/*    */ {
/*    */   private final ij a;
/*    */   
/*    */   public bs(ij ☃) {
/* 10 */     super(☃.d(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
/* 11 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public ij a() {
/* 15 */     return this.a;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */