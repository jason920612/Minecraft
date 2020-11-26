/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pv
/*    */ {
/*    */   private final MinecraftServer a;
/* 16 */   private final Map<pc, pu> b = Maps.newHashMap();
/*    */   
/*    */   public pv(MinecraftServer ☃) {
/* 19 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public pu a(pc ☃) {
/* 24 */     return this.b.get(☃);
/*    */   }
/*    */   
/*    */   public pu a(pc ☃, ij ij1) {
/* 28 */     pu pu = new pu(☃, ij1);
/* 29 */     this.b.put(☃, pu);
/* 30 */     return pu;
/*    */   }
/*    */   
/*    */   public void a(pu ☃) {
/* 34 */     this.b.remove(☃.a());
/*    */   }
/*    */   
/*    */   public Collection<pc> a() {
/* 38 */     return this.b.keySet();
/*    */   }
/*    */   
/*    */   public Collection<pu> b() {
/* 42 */     return this.b.values();
/*    */   }
/*    */   
/*    */   public gy c() {
/* 46 */     gy ☃ = new gy();
/*    */     
/* 48 */     for (pu pu : this.b.values()) {
/* 49 */       ☃.a(pu.a().toString(), pu.f());
/*    */     }
/*    */     
/* 52 */     return ☃;
/*    */   }
/*    */   
/*    */   public void a(gy ☃) {
/* 56 */     for (String str : ☃.c()) {
/* 57 */       pc pc = new pc(str);
/* 58 */       this.b.put(pc, pu.a(☃.p(str), pc));
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(tf ☃) {
/* 63 */     for (pu pu : this.b.values()) {
/* 64 */       pu.c(☃);
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(tf ☃) {
/* 69 */     for (pu pu : this.b.values())
/* 70 */       pu.d(☃); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\pv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */