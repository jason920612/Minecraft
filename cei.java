/*    */ public interface cei {
/*    */   public static final cei FALSE = (☃, bool1) -> false;
/*    */   
/*    */   static {
/*  5 */     NOT_OR = ((☃, bool1) -> (!☃ && !bool1));
/*  6 */     ONLY_SECOND = ((☃, bool1) -> (bool1 && !☃));
/*  7 */     NOT_FIRST = ((☃, bool1) -> !☃);
/*  8 */     ONLY_FIRST = ((☃, bool1) -> (☃ && !bool1));
/*  9 */     NOT_SECOND = ((☃, bool1) -> !bool1);
/* 10 */     NOT_SAME = ((☃, bool1) -> (☃ != bool1));
/* 11 */     NOT_AND = ((☃, bool1) -> (!☃ || !bool1));
/* 12 */     AND = ((☃, bool1) -> (☃ && bool1));
/* 13 */     SAME = ((☃, bool1) -> (☃ == bool1));
/* 14 */     SECOND = ((☃, bool1) -> bool1);
/* 15 */     CAUSES = ((☃, bool1) -> (!☃ || bool1));
/* 16 */     FIRST = ((☃, bool1) -> ☃);
/* 17 */     CAUSED_BY = ((☃, bool1) -> (☃ || !bool1));
/* 18 */     OR = ((☃, bool1) -> (☃ || bool1));
/*    */   }
/*    */   
/*    */   public static final cei NOT_OR;
/*    */   public static final cei ONLY_SECOND;
/*    */   public static final cei NOT_FIRST;
/*    */   public static final cei ONLY_FIRST;
/*    */   public static final cei NOT_SECOND;
/*    */   public static final cei NOT_SAME;
/*    */   public static final cei NOT_AND;
/*    */   public static final cei AND;
/*    */   public static final cei SAME;
/*    */   public static final cei SECOND;
/*    */   public static final cei CAUSES;
/*    */   public static final cei FIRST;
/*    */   public static final cei CAUSED_BY;
/*    */   public static final cei OR;
/*    */   public static final cei TRUE = (☃, bool1) -> true;
/*    */   
/*    */   boolean apply(boolean paramBoolean1, boolean paramBoolean2);
/*    */ }


/* Location:              F:\dw\server.jar!\cei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */