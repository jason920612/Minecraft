/*    */ 
/*    */ public enum ej
/*    */ {
/*  4 */   a
/*    */   {
/*    */     public int a(int ☃, int i, int j, eq.a a1) {
/*  7 */       return a1.a(☃, i, j);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public eq.a a(eq.a ☃) {
/* 17 */       return ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public ej a() {
/* 22 */       return this;
/*    */     }
/*    */   },
/*    */ 
/*    */ 
/*    */   
/* 28 */   b
/*    */   {
/*    */     public int a(int ☃, int i, int j, eq.a a1) {
/* 31 */       return a1.a(j, ☃, i);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public eq.a a(eq.a ☃) {
/* 41 */       return d[Math.floorMod(☃.ordinal() + 1, 3)];
/*    */     }
/*    */ 
/*    */     
/*    */     public ej a() {
/* 46 */       return c;
/*    */     }
/*    */   },
/* 49 */   c
/*    */   {
/*    */     public int a(int ☃, int i, int j, eq.a a1) {
/* 52 */       return a1.a(i, j, ☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public eq.a a(eq.a ☃) {
/* 62 */       return d[Math.floorMod(☃.ordinal() - 1, 3)];
/*    */     }
/*    */ 
/*    */     
/*    */     public ej a() {
/* 67 */       return b;
/*    */     }
/*    */   };
/*    */   
/*    */   static {
/* 72 */     d = eq.a.values();
/* 73 */     e = values();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final eq.a[] d;
/*    */ 
/*    */ 
/*    */   
/*    */   public static final ej[] e;
/*    */ 
/*    */ 
/*    */   
/*    */   public static ej a(eq.a ☃, eq.a a1) {
/* 88 */     return e[Math.floorMod(a1.ordinal() - ☃.ordinal(), 3)];
/*    */   }
/*    */   
/*    */   public abstract int a(int paramInt1, int paramInt2, int paramInt3, eq.a parama);
/*    */   
/*    */   public abstract eq.a a(eq.a parama);
/*    */   
/*    */   public abstract ej a();
/*    */ }


/* Location:              F:\dw\server.jar!\ej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */