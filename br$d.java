/*     */ import java.util.ArrayDeque;
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
/*     */ public class d
/*     */   implements br.c
/*     */ {
/*     */   private final br.a a;
/*     */   
/*     */   public d(br ☃) {
/*  99 */     this.a = new br.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(pp ☃, bu bu1, ArrayDeque<pp.a> arrayDeque, int i) {
/* 104 */     br br = this.a.a(☃);
/* 105 */     if (br != null) {
/* 106 */       br.c[] arrayOfC = br.b();
/* 107 */       int j = i - arrayDeque.size();
/* 108 */       int k = Math.min(arrayOfC.length, j);
/* 109 */       for (int m = k - 1; m >= 0; m--) {
/* 110 */         arrayDeque.addFirst(new pp.a(☃, bu1, arrayOfC[m]));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 117 */     return "function " + this.a.a();
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\br$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */