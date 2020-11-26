/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ public class kv implements iv<iy> {
/*    */   private a a;
/*    */   private List<pc> b;
/*    */   private List<pc> c;
/*    */   private boolean d;
/*    */   private boolean e;
/*    */   private boolean f;
/*    */   private boolean g;
/*    */   
/*    */   public enum a {
/* 15 */     a, b, c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public kv() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public kv(a ☃, Collection<pc> collection1, Collection<pc> collection2, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/* 32 */     this.a = ☃;
/* 33 */     this.b = (List<pc>)ImmutableList.copyOf(collection1);
/* 34 */     this.c = (List<pc>)ImmutableList.copyOf(collection2);
/*    */     
/* 36 */     this.d = bool1;
/* 37 */     this.e = bool2;
/* 38 */     this.f = bool3;
/* 39 */     this.g = bool4;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(iy ☃) {
/* 44 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hy ☃) throws IOException {
/* 49 */     this.a = ☃.<a>a(a.class);
/* 50 */     this.d = ☃.readBoolean();
/* 51 */     this.e = ☃.readBoolean();
/* 52 */     this.f = ☃.readBoolean();
/* 53 */     this.g = ☃.readBoolean();
/*    */     
/* 55 */     int i = ☃.g();
/* 56 */     this.b = Lists.newArrayList(); int j;
/* 57 */     for (j = 0; j < i; j++) {
/* 58 */       this.b.add(☃.l());
/*    */     }
/*    */     
/* 61 */     if (this.a == a.a) {
/* 62 */       i = ☃.g();
/* 63 */       this.c = Lists.newArrayList();
/* 64 */       for (j = 0; j < i; j++) {
/* 65 */         this.c.add(☃.l());
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(hy ☃) throws IOException {
/* 72 */     ☃.a(this.a);
/* 73 */     ☃.writeBoolean(this.d);
/* 74 */     ☃.writeBoolean(this.e);
/* 75 */     ☃.writeBoolean(this.f);
/* 76 */     ☃.writeBoolean(this.g);
/*    */     
/* 78 */     ☃.d(this.b.size());
/* 79 */     for (pc pc : this.b) {
/* 80 */       ☃.a(pc);
/*    */     }
/*    */     
/* 83 */     if (this.a == a.a) {
/* 84 */       ☃.d(this.c.size());
/* 85 */       for (pc pc : this.c)
/* 86 */         ☃.a(pc); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\kv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */