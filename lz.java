/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.io.IOException;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lz
/*    */   implements iv<iy>
/*    */ {
/*    */   private boolean a;
/*    */   private Map<pc, l.a> b;
/*    */   private Set<pc> c;
/*    */   private Map<pc, n> d;
/*    */   
/*    */   public lz() {}
/*    */   
/*    */   public lz(boolean ☃, Collection<l> collection, Set<pc> set, Map<pc, n> map) {
/* 27 */     this.a = ☃;
/* 28 */     this.b = Maps.newHashMap();
/* 29 */     for (l l : collection) {
/* 30 */       this.b.put(l.h(), l.a());
/*    */     }
/* 32 */     this.c = set;
/* 33 */     this.d = Maps.newHashMap(map);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 38 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 43 */     this.a = ☃.readBoolean();
/* 44 */     this.b = Maps.newHashMap();
/* 45 */     this.c = Sets.newLinkedHashSet();
/* 46 */     this.d = Maps.newHashMap();
/*    */     
/* 48 */     int i = ☃.g(); int j;
/* 49 */     for (j = 0; j < i; j++) {
/* 50 */       pc pc = ☃.l();
/* 51 */       l.a a = l.a.b(☃);
/* 52 */       this.b.put(pc, a);
/*    */     } 
/*    */     
/* 55 */     i = ☃.g();
/* 56 */     for (j = 0; j < i; j++) {
/* 57 */       pc pc = ☃.l();
/* 58 */       this.c.add(pc);
/*    */     } 
/*    */     
/* 61 */     i = ☃.g();
/* 62 */     for (j = 0; j < i; j++) {
/* 63 */       pc pc = ☃.l();
/* 64 */       this.d.put(pc, n.b(☃));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 70 */     ☃.writeBoolean(this.a);
/*    */     
/* 72 */     ☃.d(this.b.size());
/* 73 */     for (Map.Entry<pc, l.a> entry : this.b.entrySet()) {
/* 74 */       pc pc = entry.getKey();
/* 75 */       l.a a = entry.getValue();
/* 76 */       ☃.a(pc);
/* 77 */       a.a(☃);
/*    */     } 
/*    */     
/* 80 */     ☃.d(this.c.size());
/* 81 */     for (pc pc : this.c) {
/* 82 */       ☃.a(pc);
/*    */     }
/*    */     
/* 85 */     ☃.d(this.d.size());
/* 86 */     for (Map.Entry<pc, n> entry : this.d.entrySet()) {
/* 87 */       ☃.a(entry.getKey());
/* 88 */       ((n)entry.getValue()).a(☃);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\lz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */