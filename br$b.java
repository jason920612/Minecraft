/*    */ import com.mojang.brigadier.ParseResults;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.ArrayDeque;
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
/*    */   implements br.c
/*    */ {
/*    */   private final ParseResults<bu> a;
/*    */   
/*    */   public b(ParseResults<bu> ☃) {
/* 81 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(pp ☃, bu bu1, ArrayDeque<pp.a> arrayDeque, int i) throws CommandSyntaxException {
/* 86 */     ☃.d().execute(new ParseResults(this.a.getContext().withSource(bu1), this.a.getStartIndex(), this.a.getReader(), this.a.getExceptions()));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 91 */     return this.a.getReader().getString();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\br$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */