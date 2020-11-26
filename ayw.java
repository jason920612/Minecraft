/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ayw
/*    */   implements pt
/*    */ {
/* 18 */   private static final List<ayu> c = Lists.newArrayList((Object[])new ayu[] { ayz.f, ayz.c, ayz.g, ayz.u, ayz.t, ayz.w, ayz.x });
/*    */   
/* 20 */   protected final Map<btl<?>, Boolean> a = Maps.newHashMap();
/* 21 */   protected final Set<blc> b = Sets.newHashSet();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<ayu> a() {
/* 27 */     return c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void Y_() {}
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public abstract ayu a(el paramel, @Nullable ayu paramayu);
/*    */   
/*    */   public abstract ayu[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   public ayu[] b(int ☃, int i, int j, int k) {
/* 40 */     return a(☃, i, j, k, true);
/*    */   }
/*    */ 
/*    */   
/*    */   public abstract ayu[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean);
/*    */ 
/*    */   
/*    */   public abstract Set<ayu> a(int paramInt1, int paramInt2, int paramInt3);
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public abstract el a(int paramInt1, int paramInt2, int paramInt3, List<ayu> paramList, Random paramRandom);
/*    */   
/*    */   public float c(int ☃, int i, int j, int k) {
/* 54 */     return 0.0F;
/*    */   }
/*    */   
/*    */   public abstract boolean a(btl<?> parambtl);
/*    */   
/*    */   public abstract Set<blc> b();
/*    */ }


/* Location:              F:\dw\server.jar!\ayw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */