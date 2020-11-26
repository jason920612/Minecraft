/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fi
/*    */   implements fk
/*    */ {
/* 11 */   public static final fi a = new fi(1.0F, 0.0F, 0.0F, 1.0F);
/* 12 */   public static final fk.a<fi> b = new fk.a<fi>()
/*    */     {
/*    */       public fi a(fl<fi> ☃, StringReader stringReader) throws CommandSyntaxException
/*    */       {
/* 16 */         stringReader.expect(' ');
/* 17 */         float f1 = (float)stringReader.readDouble();
/* 18 */         stringReader.expect(' ');
/* 19 */         float f2 = (float)stringReader.readDouble();
/* 20 */         stringReader.expect(' ');
/* 21 */         float f3 = (float)stringReader.readDouble();
/* 22 */         stringReader.expect(' ');
/* 23 */         float f4 = (float)stringReader.readDouble();
/* 24 */         return new fi(f1, f2, f3, f4);
/*    */       }
/*    */ 
/*    */       
/*    */       public fi a(fl<fi> ☃, hy hy1) {
/* 29 */         return new fi(hy1.readFloat(), hy1.readFloat(), hy1.readFloat(), hy1.readFloat());
/*    */       }
/*    */     };
/*    */   
/*    */   private final float c;
/*    */   private final float d;
/*    */   private final float e;
/*    */   private final float f;
/*    */   
/*    */   public fi(float ☃, float f1, float f2, float f3) {
/* 39 */     this.c = ☃;
/* 40 */     this.d = f1;
/* 41 */     this.e = f2;
/*    */     
/* 43 */     this.f = xq.a(f3, 0.01F, 4.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) {
/* 48 */     ☃.writeFloat(this.c);
/* 49 */     ☃.writeFloat(this.d);
/* 50 */     ☃.writeFloat(this.e);
/* 51 */     ☃.writeFloat(this.f);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 56 */     return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", new Object[] { b().d(), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f) });
/*    */   }
/*    */ 
/*    */   
/*    */   public fl<fi> b() {
/* 61 */     return fm.m;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */