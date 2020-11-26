/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import java.util.BitSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
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
/*     */ public interface bmx
/*     */   extends axk
/*     */ {
/*     */   @Nullable
/*     */   blc a(el paramel, blc paramblc, boolean paramBoolean);
/*     */   
/*     */   void a(el paramel, bji parambji);
/*     */   
/*     */   void a(aer paramaer);
/*     */   
/*     */   void a(bnd parambnd);
/*     */   
/*     */   @Nullable
/*     */   default bnk a() {
/*  38 */     bnk[] ☃ = c();
/*  39 */     for (int i = ☃.length - 1; i >= 0; i--) {
/*  40 */       if (☃[i] != bnj.a) {
/*  41 */         return ☃[i];
/*     */       }
/*     */     } 
/*  44 */     return null;
/*     */   }
/*     */   
/*     */   default int b() {
/*  48 */     bnk ☃ = a();
/*  49 */     return (☃ == null) ? 0 : ☃.e();
/*     */   }
/*     */ 
/*     */   
/*     */   bnk[] c();
/*     */ 
/*     */   
/*     */   int a(ayi paramayi, el paramel, boolean paramBoolean);
/*     */ 
/*     */   
/*     */   int a(el paramel, int paramInt, boolean paramBoolean);
/*     */ 
/*     */   
/*     */   boolean c(el paramel);
/*     */ 
/*     */   
/*     */   int a(bor.a parama, int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   axm d();
/*     */ 
/*     */   
/*     */   void a(long paramLong);
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   bxc a(String paramString);
/*     */ 
/*     */   
/*     */   void a(String paramString, bxc parambxc);
/*     */ 
/*     */   
/*     */   Map<String, bxc> e();
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   LongSet b(String paramString);
/*     */ 
/*     */   
/*     */   void a(String paramString, long paramLong);
/*     */   
/*     */   Map<String, LongSet> f();
/*     */   
/*     */   ayu[] g();
/*     */   
/*     */   bnd i();
/*     */   
/*     */   void d(el paramel);
/*     */   
/*     */   void a(ayi paramayi, boolean paramBoolean, el paramel, int paramInt);
/*     */   
/*     */   default void e(el ☃) {
/* 101 */     LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", ☃);
/*     */   }
/*     */   
/*     */   default void a(gy ☃) {
/* 105 */     LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default gy g(el ☃) {
/* 110 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   default void a(ayu[] ☃) {
/* 114 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   void a(bor.a... ☃) {
/* 118 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   default List<el> j() {
/* 122 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   ayo<bcs> k();
/*     */   
/*     */   ayo<byv> l();
/*     */   
/*     */   BitSet a(boq.a parama);
/*     */ }


/* Location:              F:\dw\server.jar!\bmx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */