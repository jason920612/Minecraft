/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Streams;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ public abstract class ig
/*    */   implements ij
/*    */ {
/* 11 */   protected List<ij> a = Lists.newArrayList();
/*    */   
/*    */   private ip b;
/*    */   
/*    */   public ij a(ij ☃) {
/* 16 */     ☃.b().a(b());
/* 17 */     this.a.add(☃);
/* 18 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ij> a() {
/* 23 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public ij a(ip ☃) {
/* 28 */     this.b = ☃;
/*    */     
/* 30 */     for (ij ij1 : this.a) {
/* 31 */       ij1.b().a(b());
/*    */     }
/*    */     
/* 34 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public ip b() {
/* 39 */     if (this.b == null) {
/* 40 */       this.b = new ip();
/* 41 */       for (ij ☃ : this.a) {
/* 42 */         ☃.b().a(this.b);
/*    */       }
/*    */     } 
/* 45 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<ij> c() {
/* 50 */     return Streams.concat(new Stream[] { Stream.of(this), this.a.stream().flatMap(ij::c) });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 55 */     if (this == ☃) {
/* 56 */       return true;
/*    */     }
/*    */     
/* 59 */     if (☃ instanceof ig) {
/* 60 */       ig ig1 = (ig)☃;
/* 61 */       return (this.a.equals(ig1.a) && b().equals(ig1.b()));
/*    */     } 
/*    */     
/* 64 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 69 */     return Objects.hash(new Object[] { b(), this.a });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 74 */     return "BaseComponent{style=" + this.b + ", siblings=" + this.a + '}';
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\ig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */