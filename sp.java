/*    */ import java.io.File;
/*    */ import java.lang.management.ManagementFactory;
/*    */ import java.lang.management.ThreadInfo;
/*    */ import java.lang.management.ThreadMXBean;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ import java.util.Timer;
/*    */ import java.util.TimerTask;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sp
/*    */   implements Runnable
/*    */ {
/* 21 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final so b;
/*    */   
/*    */   private final long c;
/*    */ 
/*    */   
/*    */   public sp(so ☃) {
/* 29 */     this.b = ☃;
/* 30 */     this.c = ☃.aY();
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 35 */     while (this.b.o()) {
/* 36 */       long ☃ = this.b.ax();
/* 37 */       long l1 = k.b();
/* 38 */       long l2 = l1 - ☃;
/*    */       
/* 40 */       if (l2 > this.c) {
/* 41 */         a.fatal("A single server tick took {} seconds (should be max {})", String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf((float)l2 / 1000.0F) }), String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(0.05F) }));
/* 42 */         a.fatal("Considering it to be crashed, server will forcibly shutdown.");
/*    */         
/* 44 */         ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
/* 45 */         ThreadInfo[] arrayOfThreadInfo = threadMXBean.dumpAllThreads(true, true);
/*    */         
/* 47 */         StringBuilder stringBuilder = new StringBuilder();
/* 48 */         Error error = new Error();
/*    */         
/* 50 */         for (ThreadInfo threadInfo : arrayOfThreadInfo) {
/* 51 */           if (threadInfo.getThreadId() == this.b.ay().getId()) {
/* 52 */             error.setStackTrace(threadInfo.getStackTrace());
/*    */           }
/*    */           
/* 55 */           stringBuilder.append(threadInfo);
/* 56 */           stringBuilder.append("\n");
/*    */         } 
/*    */         
/* 59 */         b b = new b("Watching Server", error);
/* 60 */         this.b.b(b);
/* 61 */         c c = b.a("Thread Dump");
/* 62 */         c.a("Threads", stringBuilder);
/*    */         
/* 64 */         File file = new File(new File(this.b.s(), "crash-reports"), "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-server.txt");
/* 65 */         if (b.a(file)) {
/* 66 */           a.error("This crash report has been saved to: {}", file.getAbsolutePath());
/*    */         } else {
/* 68 */           a.error("We were unable to save this crash report to disk.");
/*    */         } 
/*    */         
/* 71 */         a();
/*    */       } 
/*    */       
/*    */       try {
/* 75 */         Thread.sleep(☃ + this.c - l1);
/* 76 */       } catch (InterruptedException interruptedException) {}
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private void a() {
/*    */     try {
/* 83 */       Timer ☃ = new Timer();
/* 84 */       ☃.schedule(new TimerTask(this)
/*    */           {
/*    */             public void run() {
/* 87 */               Runtime.getRuntime().halt(1);
/*    */             }
/*    */           },  10000L);
/*    */       
/* 91 */       System.exit(1);
/* 92 */     } catch (Throwable ☃) {
/* 93 */       Runtime.getRuntime().halt(1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\sp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */