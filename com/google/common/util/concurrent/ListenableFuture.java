package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@GwtCompatible
public interface ListenableFuture<V> extends Future<V> {
  void addListener(Runnable paramRunnable, Executor paramExecutor);
}


/* Location:              F:\dw\server.jar!\com\google\commo\\util\concurrent\ListenableFuture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */