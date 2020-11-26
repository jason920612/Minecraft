/*    */ import com.google.common.base.Stopwatch;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fp
/*    */ {
/* 16 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final Collection<Path> b;
/*    */   private final Path c;
/* 20 */   private final List<fq> d = Lists.newArrayList();
/*    */   
/*    */   static {
/* 23 */     pf.c();
/*    */   }
/*    */   
/*    */   public fp(Path ☃, Collection<Path> collection) {
/* 27 */     this.c = ☃;
/* 28 */     this.b = collection;
/*    */   }
/*    */   
/*    */   public Collection<Path> a() {
/* 32 */     return this.b;
/*    */   }
/*    */   
/*    */   public Path b() {
/* 36 */     return this.c;
/*    */   }
/*    */   
/*    */   public void c() throws IOException {
/* 40 */     fr ☃ = new fr(this.c, "cache");
/*    */     
/* 42 */     Stopwatch stopwatch = Stopwatch.createUnstarted();
/* 43 */     for (fq fq : this.d) {
/* 44 */       a.info("Starting provider: {}", fq.a());
/* 45 */       stopwatch.start();
/* 46 */       fq.a(☃);
/* 47 */       stopwatch.stop();
/* 48 */       a.info("{} finished after {} ms", fq.a(), Long.valueOf(stopwatch.elapsed(TimeUnit.MILLISECONDS)));
/* 49 */       stopwatch.reset();
/*    */     } 
/*    */     
/* 52 */     ☃.a();
/*    */   }
/*    */   
/*    */   public void a(fq ☃) {
/* 56 */     this.d.add(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\fp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */