/*     */ package io.netty.util.concurrent;
/*     */ 
/*     */ import io.netty.util.internal.ObjectUtil;
/*     */ import io.netty.util.internal.PlatformDependent;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Queue;
/*     */ import java.util.concurrent.Callable;
/*     */ import java.util.concurrent.ExecutionException;
/*     */ import java.util.concurrent.Future;
/*     */ import java.util.concurrent.RejectedExecutionException;
/*     */ import java.util.concurrent.ScheduledFuture;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.concurrent.TimeoutException;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NonStickyEventExecutorGroup
/*     */   implements EventExecutorGroup
/*     */ {
/*     */   private final EventExecutorGroup group;
/*     */   private final int maxTaskExecutePerRun;
/*     */   
/*     */   public NonStickyEventExecutorGroup(EventExecutorGroup group) {
/*  50 */     this(group, 1024);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NonStickyEventExecutorGroup(EventExecutorGroup group, int maxTaskExecutePerRun) {
/*  58 */     this.group = verify(group);
/*  59 */     this.maxTaskExecutePerRun = ObjectUtil.checkPositive(maxTaskExecutePerRun, "maxTaskExecutePerRun");
/*     */   }
/*     */   
/*     */   private static EventExecutorGroup verify(EventExecutorGroup group) {
/*  63 */     Iterator<EventExecutor> executors = ((EventExecutorGroup)ObjectUtil.checkNotNull(group, "group")).iterator();
/*  64 */     while (executors.hasNext()) {
/*  65 */       EventExecutor executor = executors.next();
/*  66 */       if (executor instanceof OrderedEventExecutor) {
/*  67 */         throw new IllegalArgumentException("EventExecutorGroup " + group + " contains OrderedEventExecutors: " + executor);
/*     */       }
/*     */     } 
/*     */     
/*  71 */     return group;
/*     */   }
/*     */   
/*     */   private NonStickyOrderedEventExecutor newExecutor(EventExecutor executor) {
/*  75 */     return new NonStickyOrderedEventExecutor(executor, this.maxTaskExecutePerRun);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isShuttingDown() {
/*  80 */     return this.group.isShuttingDown();
/*     */   }
/*     */ 
/*     */   
/*     */   public Future<?> shutdownGracefully() {
/*  85 */     return this.group.shutdownGracefully();
/*     */   }
/*     */ 
/*     */   
/*     */   public Future<?> shutdownGracefully(long quietPeriod, long timeout, TimeUnit unit) {
/*  90 */     return this.group.shutdownGracefully(quietPeriod, timeout, unit);
/*     */   }
/*     */ 
/*     */   
/*     */   public Future<?> terminationFuture() {
/*  95 */     return this.group.terminationFuture();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void shutdown() {
/* 101 */     this.group.shutdown();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Runnable> shutdownNow() {
/* 107 */     return this.group.shutdownNow();
/*     */   }
/*     */ 
/*     */   
/*     */   public EventExecutor next() {
/* 112 */     return newExecutor(this.group.next());
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<EventExecutor> iterator() {
/* 117 */     final Iterator<EventExecutor> itr = this.group.iterator();
/* 118 */     return new Iterator<EventExecutor>()
/*     */       {
/*     */         public boolean hasNext() {
/* 121 */           return itr.hasNext();
/*     */         }
/*     */ 
/*     */         
/*     */         public EventExecutor next() {
/* 126 */           return NonStickyEventExecutorGroup.this.newExecutor(itr.next());
/*     */         }
/*     */ 
/*     */         
/*     */         public void remove() {
/* 131 */           itr.remove();
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public Future<?> submit(Runnable task) {
/* 138 */     return this.group.submit(task);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> Future<T> submit(Runnable task, T result) {
/* 143 */     return this.group.submit(task, result);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> Future<T> submit(Callable<T> task) {
/* 148 */     return this.group.submit(task);
/*     */   }
/*     */ 
/*     */   
/*     */   public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
/* 153 */     return this.group.schedule(command, delay, unit);
/*     */   }
/*     */ 
/*     */   
/*     */   public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
/* 158 */     return this.group.schedule(callable, delay, unit);
/*     */   }
/*     */ 
/*     */   
/*     */   public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
/* 163 */     return this.group.scheduleAtFixedRate(command, initialDelay, period, unit);
/*     */   }
/*     */ 
/*     */   
/*     */   public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
/* 168 */     return this.group.scheduleWithFixedDelay(command, initialDelay, delay, unit);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isShutdown() {
/* 173 */     return this.group.isShutdown();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isTerminated() {
/* 178 */     return this.group.isTerminated();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
/* 183 */     return this.group.awaitTermination(timeout, unit);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
/* 189 */     return this.group.invokeAll(tasks);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
/* 195 */     return this.group.invokeAll(tasks, timeout, unit);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
/* 200 */     return this.group.invokeAny(tasks);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
/* 206 */     return this.group.invokeAny(tasks, timeout, unit);
/*     */   }
/*     */ 
/*     */   
/*     */   public void execute(Runnable command) {
/* 211 */     this.group.execute(command);
/*     */   }
/*     */   
/*     */   private static final class NonStickyOrderedEventExecutor
/*     */     extends AbstractEventExecutor implements Runnable, OrderedEventExecutor {
/*     */     private final EventExecutor executor;
/* 217 */     private final Queue<Runnable> tasks = PlatformDependent.newMpscQueue();
/*     */     
/*     */     private static final int NONE = 0;
/*     */     
/*     */     private static final int SUBMITTED = 1;
/*     */     private static final int RUNNING = 2;
/* 223 */     private final AtomicInteger state = new AtomicInteger();
/*     */     private final int maxTaskExecutePerRun;
/*     */     
/*     */     NonStickyOrderedEventExecutor(EventExecutor executor, int maxTaskExecutePerRun) {
/* 227 */       super(executor);
/* 228 */       this.executor = executor;
/* 229 */       this.maxTaskExecutePerRun = maxTaskExecutePerRun;
/*     */     }
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
/*     */     
/*     */     public void run() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield state : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */       //   4: iconst_1
/*     */       //   5: iconst_2
/*     */       //   6: invokevirtual compareAndSet : (II)Z
/*     */       //   9: ifne -> 13
/*     */       //   12: return
/*     */       //   13: iconst_0
/*     */       //   14: istore_1
/*     */       //   15: iload_1
/*     */       //   16: aload_0
/*     */       //   17: getfield maxTaskExecutePerRun : I
/*     */       //   20: if_icmpge -> 53
/*     */       //   23: aload_0
/*     */       //   24: getfield tasks : Ljava/util/Queue;
/*     */       //   27: invokeinterface poll : ()Ljava/lang/Object;
/*     */       //   32: checkcast java/lang/Runnable
/*     */       //   35: astore_2
/*     */       //   36: aload_2
/*     */       //   37: ifnonnull -> 43
/*     */       //   40: goto -> 53
/*     */       //   43: aload_2
/*     */       //   44: invokestatic safeExecute : (Ljava/lang/Runnable;)V
/*     */       //   47: iinc #1, 1
/*     */       //   50: goto -> 15
/*     */       //   53: iload_1
/*     */       //   54: aload_0
/*     */       //   55: getfield maxTaskExecutePerRun : I
/*     */       //   58: if_icmpne -> 92
/*     */       //   61: aload_0
/*     */       //   62: getfield state : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */       //   65: iconst_1
/*     */       //   66: invokevirtual set : (I)V
/*     */       //   69: aload_0
/*     */       //   70: getfield executor : Lio/netty/util/concurrent/EventExecutor;
/*     */       //   73: aload_0
/*     */       //   74: invokeinterface execute : (Ljava/lang/Runnable;)V
/*     */       //   79: return
/*     */       //   80: astore_2
/*     */       //   81: aload_0
/*     */       //   82: getfield state : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */       //   85: iconst_2
/*     */       //   86: invokevirtual set : (I)V
/*     */       //   89: goto -> 153
/*     */       //   92: aload_0
/*     */       //   93: getfield state : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */       //   96: iconst_0
/*     */       //   97: invokevirtual set : (I)V
/*     */       //   100: return
/*     */       //   101: astore_3
/*     */       //   102: iload_1
/*     */       //   103: aload_0
/*     */       //   104: getfield maxTaskExecutePerRun : I
/*     */       //   107: if_icmpne -> 142
/*     */       //   110: aload_0
/*     */       //   111: getfield state : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */       //   114: iconst_1
/*     */       //   115: invokevirtual set : (I)V
/*     */       //   118: aload_0
/*     */       //   119: getfield executor : Lio/netty/util/concurrent/EventExecutor;
/*     */       //   122: aload_0
/*     */       //   123: invokeinterface execute : (Ljava/lang/Runnable;)V
/*     */       //   128: return
/*     */       //   129: astore #4
/*     */       //   131: aload_0
/*     */       //   132: getfield state : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */       //   135: iconst_2
/*     */       //   136: invokevirtual set : (I)V
/*     */       //   139: goto -> 151
/*     */       //   142: aload_0
/*     */       //   143: getfield state : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */       //   146: iconst_0
/*     */       //   147: invokevirtual set : (I)V
/*     */       //   150: return
/*     */       //   151: aload_3
/*     */       //   152: athrow
/*     */       //   153: goto -> 13
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #234	-> 0
/*     */       //   #235	-> 12
/*     */       //   #238	-> 13
/*     */       //   #240	-> 15
/*     */       //   #241	-> 23
/*     */       //   #242	-> 36
/*     */       //   #243	-> 40
/*     */       //   #245	-> 43
/*     */       //   #240	-> 47
/*     */       //   #248	-> 53
/*     */       //   #250	-> 61
/*     */       //   #251	-> 69
/*     */       //   #252	-> 79
/*     */       //   #253	-> 80
/*     */       //   #255	-> 81
/*     */       //   #259	-> 89
/*     */       //   #261	-> 92
/*     */       //   #262	-> 100
/*     */       //   #248	-> 101
/*     */       //   #250	-> 110
/*     */       //   #251	-> 118
/*     */       //   #252	-> 128
/*     */       //   #253	-> 129
/*     */       //   #255	-> 131
/*     */       //   #259	-> 139
/*     */       //   #261	-> 142
/*     */       //   #262	-> 150
/*     */       //   #264	-> 151
/*     */       //   #265	-> 153
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   36	11	2	task	Ljava/lang/Runnable;
/*     */       //   81	8	2	ignore	Ljava/lang/Throwable;
/*     */       //   131	8	4	ignore	Ljava/lang/Throwable;
/*     */       //   15	138	1	i	I
/*     */       //   0	156	0	this	Lio/netty/util/concurrent/NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   15	53	101	finally
/*     */       //   61	79	80	java/lang/Throwable
/*     */       //   110	128	129	java/lang/Throwable
/*     */     }
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
/*     */     public boolean inEventLoop(Thread thread) {
/* 270 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean inEventLoop() {
/* 275 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isShuttingDown() {
/* 280 */       return this.executor.isShutdown();
/*     */     }
/*     */ 
/*     */     
/*     */     public Future<?> shutdownGracefully(long quietPeriod, long timeout, TimeUnit unit) {
/* 285 */       return this.executor.shutdownGracefully(quietPeriod, timeout, unit);
/*     */     }
/*     */ 
/*     */     
/*     */     public Future<?> terminationFuture() {
/* 290 */       return this.executor.terminationFuture();
/*     */     }
/*     */ 
/*     */     
/*     */     public void shutdown() {
/* 295 */       this.executor.shutdown();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isShutdown() {
/* 300 */       return this.executor.isShutdown();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isTerminated() {
/* 305 */       return this.executor.isTerminated();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
/* 310 */       return this.executor.awaitTermination(timeout, unit);
/*     */     }
/*     */ 
/*     */     
/*     */     public void execute(Runnable command) {
/* 315 */       if (!this.tasks.offer(command)) {
/* 316 */         throw new RejectedExecutionException();
/*     */       }
/* 318 */       if (this.state.compareAndSet(0, 1))
/*     */         
/*     */         try {
/*     */           
/* 322 */           this.executor.execute(this);
/* 323 */         } catch (Throwable e) {
/*     */           
/* 325 */           this.tasks.remove(command);
/* 326 */           PlatformDependent.throwException(e);
/*     */         }  
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\io\nett\\util\concurrent\NonStickyEventExecutorGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */