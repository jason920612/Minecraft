/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.brigadier.context.StringRange;
/*    */ import com.mojang.brigadier.suggestion.Suggestion;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jp
/*    */   implements iv<iy>
/*    */ {
/*    */   private int a;
/*    */   private Suggestions b;
/*    */   
/*    */   public jp() {}
/*    */   
/*    */   public jp(int ☃, Suggestions suggestions) {
/* 24 */     this.a = ☃;
/* 25 */     this.b = suggestions;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 30 */     this.a = ☃.g();
/* 31 */     int i = ☃.g();
/* 32 */     int j = ☃.g();
/* 33 */     StringRange stringRange = StringRange.between(i, i + j);
/*    */     
/* 35 */     int k = ☃.g();
/* 36 */     List<Suggestion> list = Lists.newArrayListWithCapacity(k);
/*    */     
/* 38 */     for (int m = 0; m < k; m++) {
/* 39 */       String str = ☃.e(32767);
/* 40 */       ij ij = ☃.readBoolean() ? ☃.f() : null;
/* 41 */       list.add(new Suggestion(stringRange, str, ij));
/*    */     } 
/*    */     
/* 44 */     this.b = new Suggestions(stringRange, list);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 49 */     ☃.d(this.a);
/* 50 */     ☃.d(this.b.getRange().getStart());
/* 51 */     ☃.d(this.b.getRange().getLength());
/* 52 */     ☃.d(this.b.getList().size());
/*    */     
/* 54 */     for (Suggestion suggestion : this.b.getList()) {
/* 55 */       ☃.a(suggestion.getText());
/* 56 */       ☃.writeBoolean((suggestion.getTooltip() != null));
/* 57 */       if (suggestion.getTooltip() != null) {
/* 58 */         ☃.a(ik.a(suggestion.getTooltip()));
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 65 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\jp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */