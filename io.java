/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class io
/*    */   extends ig
/*    */ {
/* 14 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   private final String c;
/*    */   @Nullable
/*    */   private final dr d;
/*    */   
/*    */   public io(String ☃) {
/* 21 */     this.c = ☃;
/*    */     
/* 23 */     dr dr1 = null;
/*    */     try {
/* 25 */       ds ds = new ds(new StringReader(☃));
/* 26 */       dr1 = ds.s();
/* 27 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 28 */       b.warn("Invalid selector component: {}", ☃, commandSyntaxException.getMessage());
/*    */     } 
/* 30 */     this.d = dr1;
/*    */   }
/*    */   
/*    */   public String i() {
/* 34 */     return this.c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ij a(bu ☃) throws CommandSyntaxException {
/* 43 */     if (this.d == null) {
/* 44 */       return new iq("");
/*    */     }
/* 46 */     return dr.a(this.d.b(☃));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String d() {
/* 52 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public io k() {
/* 57 */     return new io(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 62 */     if (this == ☃) {
/* 63 */       return true;
/*    */     }
/*    */     
/* 66 */     if (☃ instanceof io) {
/* 67 */       io io1 = (io)☃;
/* 68 */       return (this.c.equals(io1.c) && super.equals(☃));
/*    */     } 
/*    */     
/* 71 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 76 */     return "SelectorComponent{pattern='" + this.c + '\'' + ", siblings=" + this.a + ", style=" + 
/*    */ 
/*    */       
/* 79 */       b() + '}';
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\io.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */