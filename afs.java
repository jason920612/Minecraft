/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afs
/*    */   extends afq
/*    */ {
/* 11 */   private final Set<afn> e = Sets.newHashSet();
/* 12 */   protected final Map<String, afn> d = new xl<>();
/*    */ 
/*    */   
/*    */   public afr e(afm ☃) {
/* 16 */     return (afr)super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public afr b(String ☃) {
/* 21 */     afn afn = super.a(☃);
/* 22 */     if (afn == null) {
/* 23 */       afn = this.d.get(☃);
/*    */     }
/* 25 */     return (afr)afn;
/*    */   }
/*    */ 
/*    */   
/*    */   public afn b(afm ☃) {
/* 30 */     afn afn = super.b(☃);
/*    */     
/* 32 */     if (☃ instanceof aft && ((aft)☃).g() != null) {
/* 33 */       this.d.put(((aft)☃).g(), afn);
/*    */     }
/*    */     
/* 36 */     return afn;
/*    */   }
/*    */ 
/*    */   
/*    */   protected afn c(afm ☃) {
/* 41 */     return new afr(this, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(afn ☃) {
/* 46 */     if (☃.a().c()) {
/* 47 */       this.e.add(☃);
/*    */     }
/*    */     
/* 50 */     for (afm afm : this.c.get(☃.a())) {
/* 51 */       afr afr = e(afm);
/* 52 */       if (afr != null) {
/* 53 */         afr.f();
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public Set<afn> b() {
/* 59 */     return this.e;
/*    */   }
/*    */   
/*    */   public Collection<afn> c() {
/* 63 */     Set<afn> ☃ = Sets.newHashSet();
/*    */     
/* 65 */     for (afn afn : a()) {
/* 66 */       if (afn.a().c()) {
/* 67 */         ☃.add(afn);
/*    */       }
/*    */     } 
/*    */     
/* 71 */     return ☃;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\afs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */