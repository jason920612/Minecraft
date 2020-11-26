/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Arrays;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum er
/*    */ {
/*  9 */   a(new eq[] { eq.c }),
/* 10 */   b(new eq[] { eq.c, eq.f }),
/* 11 */   c(new eq[] { eq.f }),
/* 12 */   d(new eq[] { eq.d, eq.f }),
/* 13 */   e(new eq[] { eq.d }),
/* 14 */   f(new eq[] { eq.d, eq.e }),
/* 15 */   g(new eq[] { eq.e }),
/* 16 */   h(new eq[] { eq.c, eq.e }); private static final int i; private static final int j; private static final int k; private static final int l;
/*    */   static {
/* 18 */     i = 1 << h.ordinal();
/* 19 */     j = 1 << g.ordinal();
/* 20 */     k = 1 << f.ordinal();
/* 21 */     l = 1 << e.ordinal();
/* 22 */     m = 1 << d.ordinal();
/* 23 */     n = 1 << c.ordinal();
/* 24 */     o = 1 << b.ordinal();
/* 25 */     p = 1 << a.ordinal();
/*    */   }
/*    */   private static final int m; private static final int n; private static final int o; private static final int p; private final Set<eq> q;
/*    */   
/*    */   er(eq... ☃) {
/* 30 */     this.q = (Set<eq>)Sets.immutableEnumSet(Arrays.asList(☃));
/*    */   }
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
/*    */   public Set<eq> a() {
/* 60 */     return this.q;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\er.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */