/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   private final String a;
/*     */   private final cf.b[] b;
/*     */   
/*     */   public a(String ☃, cf.b[] arrayOfB) {
/*  46 */     this.a = ☃;
/*  47 */     this.b = arrayOfB;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ij a(bu ☃, boolean bool) throws CommandSyntaxException {
/*  59 */     if (this.b.length == 0 || !bool) {
/*  60 */       return new iq(this.a);
/*     */     }
/*     */     
/*  63 */     ij ij = new iq(this.a.substring(0, this.b[0].a()));
/*  64 */     int i = this.b[0].a();
/*     */     
/*  66 */     for (cf.b b1 : this.b) {
/*  67 */       ij ij1 = b1.a(☃);
/*  68 */       if (i < b1.a()) {
/*  69 */         ij.a(this.a.substring(i, b1.a()));
/*     */       }
/*  71 */       if (ij1 != null) {
/*  72 */         ij.a(ij1);
/*     */       }
/*  74 */       i = b1.b();
/*     */     } 
/*     */     
/*  77 */     if (i < this.a.length()) {
/*  78 */       ij.a(this.a.substring(i, this.a.length()));
/*     */     }
/*     */     
/*  81 */     return ij;
/*     */   }
/*     */   
/*     */   public static a a(StringReader ☃, boolean bool) throws CommandSyntaxException {
/*  85 */     String str = ☃.getString().substring(☃.getCursor(), ☃.getTotalLength());
/*     */     
/*  87 */     if (!bool) {
/*  88 */       ☃.setCursor(☃.getTotalLength());
/*  89 */       return new a(str, new cf.b[0]);
/*     */     } 
/*     */     
/*  92 */     List<cf.b> list = Lists.newArrayList();
/*  93 */     int i = ☃.getCursor();
/*     */     
/*  95 */     while (☃.canRead()) {
/*  96 */       if (☃.peek() == '@') {
/*  97 */         dr dr; int j = ☃.getCursor();
/*     */         
/*     */         try {
/* 100 */           ds ds = new ds(☃);
/* 101 */           dr = ds.s();
/* 102 */         } catch (CommandSyntaxException commandSyntaxException) {
/* 103 */           if (commandSyntaxException.getType() == ds.d || commandSyntaxException.getType() == ds.b) {
/* 104 */             ☃.setCursor(j + 1);
/*     */             continue;
/*     */           } 
/* 107 */           throw commandSyntaxException;
/*     */         } 
/* 109 */         list.add(new cf.b(j - i, ☃.getCursor() - i, dr)); continue;
/*     */       } 
/* 111 */       ☃.skip();
/*     */     } 
/*     */ 
/*     */     
/* 115 */     return new a(str, list.<cf.b>toArray(new cf.b[list.size()]));
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */