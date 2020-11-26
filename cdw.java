/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cdw
/*    */   implements Runnable
/*    */ {
/* 12 */   private static final Logger a = LogManager.getLogger();
/* 13 */   private static final cdw b = new cdw();
/*    */   
/* 15 */   private final List<cdx> c = Collections.synchronizedList(Lists.newArrayList());
/*    */   
/*    */   private volatile long d;
/*    */   private volatile long e;
/*    */   private volatile boolean f;
/*    */   
/*    */   private cdw() {
/* 22 */     Thread ☃ = new Thread(this, "File IO Thread");
/* 23 */     ☃.setUncaughtExceptionHandler(new f(a));
/* 24 */     ☃.setPriority(1);
/* 25 */     ☃.start();
/*    */   }
/*    */   
/*    */   public static cdw a() {
/* 29 */     return b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/*    */     while (true) {
/* 35 */       c();
/*    */     }
/*    */   }
/*    */   
/*    */   private void c() {
/* 40 */     for (int ☃ = 0; ☃ < this.c.size(); ☃++) {
/* 41 */       boolean bool; cdx cdx = this.c.get(☃);
/*    */       
/* 43 */       synchronized (cdx) {
/* 44 */         bool = cdx.a();
/*    */       } 
/* 46 */       if (!bool) {
/* 47 */         this.c.remove(☃--);
/* 48 */         this.e++;
/*    */       } 
/*    */       
/*    */       try {
/* 52 */         Thread.sleep(this.f ? 0L : 10L);
/* 53 */       } catch (InterruptedException interruptedException) {
/* 54 */         interruptedException.printStackTrace();
/*    */       } 
/*    */     } 
/* 57 */     if (this.c.isEmpty()) {
/*    */       try {
/* 59 */         Thread.sleep(25L);
/* 60 */       } catch (InterruptedException interruptedException) {
/* 61 */         interruptedException.printStackTrace();
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(cdx ☃) {
/* 67 */     if (this.c.contains(☃)) {
/*    */       return;
/*    */     }
/* 70 */     this.d++;
/* 71 */     this.c.add(☃);
/*    */   }
/*    */   
/*    */   public void b() throws InterruptedException {
/* 75 */     this.f = true;
/* 76 */     while (this.d != this.e) {
/* 77 */       Thread.sleep(10L);
/*    */     }
/* 79 */     this.f = false;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\cdw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */