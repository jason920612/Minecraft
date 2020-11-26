/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asd
/*    */   extends ata
/*    */ {
/* 12 */   private static final Map<asc, asd> a = Maps.newEnumMap(asc.class);
/*    */   
/*    */   private final asc b;
/*    */   
/*    */   public asd(asc ☃, ata.a a1) {
/* 17 */     super(a1);
/* 18 */     this.b = ☃;
/* 19 */     a.put(☃, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ate ☃, aog aog1, afa afa1, adk adk1) {
/* 24 */     if (afa1 instanceof akf) {
/* 25 */       akf akf = (akf)afa1;
/* 26 */       if (!akf.dz() && akf.dy() != this.b) {
/* 27 */         akf.b(this.b);
/* 28 */         ☃.g(1);
/*    */       } 
/*    */       
/* 31 */       return true;
/*    */     } 
/* 33 */     return false;
/*    */   }
/*    */   
/*    */   public asc d() {
/* 37 */     return this.b;
/*    */   }
/*    */   
/*    */   public static asd a(asc ☃) {
/* 41 */     return a.get(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\asd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */