/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.io.IOException;
/*     */ import java.util.EnumMap;
/*     */ import java.util.Map;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class tx
/*     */   extends acu<axm, bnd, bnr>
/*     */ {
/*  26 */   private static final Logger b = LogManager.getLogger();
/*     */   private final axy c;
/*     */   private final bmy<?> d;
/*     */   private final bnw e;
/*     */   private final acv f;
/*     */   
/*  32 */   private final Long2ObjectMap<acu<axm, bnd, bnr>.acu$a> g = (Long2ObjectMap<acu<axm, bnd, bnr>.acu$a>)new axq<acu<axm, bnd, bnr>.acu$a>(this, 8192, 5000)
/*     */     {
/*     */       protected boolean a(acu<axm, bnd, bnr>.a ☃) {
/*  35 */         bnr bnr = (bnr)☃.a();
/*  36 */         return (!bnr.ab_() && !bnr.h());
/*     */       }
/*     */     };
/*     */   
/*     */   public tx(int ☃, axy axy1, bmy<?> bmy1, bnw bnw1, acv acv1) {
/*  41 */     super("WorldGen", ☃, bnd.h, () -> new EnumMap<>(bnd.class), () -> new EnumMap<>(bnd.class));
/*  42 */     this.c = axy1;
/*  43 */     this.d = bmy1;
/*  44 */     this.e = bnw1;
/*  45 */     this.f = acv1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected acu<axm, bnd, bnr>.acu$a a(axm ☃, boolean bool) {
/*  52 */     synchronized (this.e) {
/*  53 */       if (bool) {
/*  54 */         return (acu<axm, bnd, bnr>.acu$a)this.g.computeIfAbsent(☃.a(), l -> {
/*     */               bnr bnr;
/*     */ 
/*     */               
/*     */               try {
/*     */                 bnr = this.e.b(this.c, ☃.a, ☃.b, ());
/*  60 */               } catch (h h) {
/*     */                 throw h;
/*  62 */               } catch (Exception exception) {
/*     */                 b.error("Couldn't load protochunk", exception);
/*     */                 bnr = null;
/*     */               } 
/*     */               if (bnr != null) {
/*     */                 bnr.a(this.c.V());
/*     */                 return new acu.a(this, (K)☃, (R)bnr, (T)bnr.i());
/*     */               } 
/*     */               return new acu.a(this, (K)☃, (R)new bnr(☃, bnt.a), (T)bnd.a);
/*     */             });
/*     */       }
/*  73 */       return (acu<axm, bnd, bnr>.acu$a)this.g.get(☃.a());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected bnr a(axm ☃, bnd bnd1, Map<axm, bnr> map) {
/*  79 */     return bnd1.a(this.c, this.d, map, ☃.a, ☃.b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected acu<axm, bnd, bnr>.acu$a a(axm ☃, acu<axm, bnd, bnr>.a a) {
/*  84 */     ((bnr)a.a()).a(1);
/*  85 */     return (acu<axm, bnd, bnr>.acu$a)a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(axm ☃, acu<axm, bnd, bnr>.a a) {
/*  90 */     ((bnr)a.a()).a(-1);
/*     */   }
/*     */   
/*     */   public void a(BooleanSupplier ☃) {
/*  94 */     synchronized (this.e) {
/*  95 */       for (ObjectIterator<acu.a> objectIterator = this.g.values().iterator(); objectIterator.hasNext(); ) { acu<axm, bnd, bnr>.a a = objectIterator.next();
/*  96 */         bnr bnr = (bnr)a.a();
/*  97 */         if (bnr.h() && bnr.i().d() == bnd.a.a) {
/*     */           try {
/*  99 */             bnr.a(this.c.V());
/* 100 */             this.e.a(this.c, bnr);
/* 101 */             bnr.a(false);
/* 102 */           } catch (IOException iOException) {
/* 103 */             b.error("Couldn't save chunk", iOException);
/* 104 */           } catch (aya aya) {
/* 105 */             b.error("Couldn't save chunk; already in use by another instance of Minecraft?", aya);
/*     */           } 
/*     */         }
/* 108 */         if (!☃.getAsBoolean())
/*     */           return;  }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\tx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */