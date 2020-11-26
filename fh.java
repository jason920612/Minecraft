/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fh
/*    */   implements fk
/*    */ {
/* 11 */   public static final fk.a<fh> a = new fk.a<fh>()
/*    */     {
/*    */       public fh a(fl<fh> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 14 */         stringReader.expect(' ');
/* 15 */         return new fh(☃, (new cw(stringReader, false)).a(false).b());
/*    */       }
/*    */ 
/*    */       
/*    */       public fh a(fl<fh> ☃, hy hy1) {
/* 20 */         return new fh(☃, bcs.e.a(hy1.g()));
/*    */       }
/*    */     };
/*    */   
/*    */   private final fl<fh> b;
/*    */   private final blc c;
/*    */   
/*    */   public fh(fl<fh> ☃, blc blc1) {
/* 28 */     this.b = ☃;
/* 29 */     this.c = blc1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) {
/* 34 */     ☃.d(bcs.e.a(this.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 39 */     return b().d() + " " + cw.a(this.c, (gy)null);
/*    */   }
/*    */ 
/*    */   
/*    */   public fl<fh> b() {
/* 44 */     return this.b;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */