/*    */ import com.google.common.collect.HashMultimap;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class afq
/*    */ {
/* 13 */   protected final Map<afm, afn> a = Maps.newHashMap();
/* 14 */   protected final Map<String, afn> b = new xl<>();
/* 15 */   protected final Multimap<afm, afm> c = (Multimap<afm, afm>)HashMultimap.create();
/*    */   
/*    */   public afn a(afm ☃) {
/* 18 */     return this.a.get(☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public afn a(String ☃) {
/* 23 */     return this.b.get(☃);
/*    */   }
/*    */   
/*    */   public afn b(afm ☃) {
/* 27 */     if (this.b.containsKey(☃.a())) {
/* 28 */       throw new IllegalArgumentException("Attribute is already registered!");
/*    */     }
/*    */     
/* 31 */     afn afn = c(☃);
/* 32 */     this.b.put(☃.a(), afn);
/* 33 */     this.a.put(☃, afn);
/*    */     
/* 35 */     afm afm1 = ☃.d();
/* 36 */     while (afm1 != null) {
/* 37 */       this.c.put(afm1, ☃);
/* 38 */       afm1 = afm1.d();
/*    */     } 
/*    */     
/* 41 */     return afn;
/*    */   }
/*    */   
/*    */   protected abstract afn c(afm paramafm);
/*    */   
/*    */   public Collection<afn> a() {
/* 47 */     return this.b.values();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(afn ☃) {}
/*    */   
/*    */   public void a(Multimap<String, afo> ☃) {
/* 54 */     for (Map.Entry<String, afo> entry : (Iterable<Map.Entry<String, afo>>)☃.entries()) {
/* 55 */       afn afn = a(entry.getKey());
/*    */       
/* 57 */       if (afn != null) {
/* 58 */         afn.c(entry.getValue());
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public void b(Multimap<String, afo> ☃) {
/* 64 */     for (Map.Entry<String, afo> entry : (Iterable<Map.Entry<String, afo>>)☃.entries()) {
/* 65 */       afn afn = a(entry.getKey());
/*    */       
/* 67 */       if (afn != null) {
/* 68 */         afn.c(entry.getValue());
/* 69 */         afn.b(entry.getValue());
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\afq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */