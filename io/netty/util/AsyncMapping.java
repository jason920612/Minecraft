package io.netty.util;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;

public interface AsyncMapping<IN, OUT> {
  Future<OUT> map(IN paramIN, Promise<OUT> paramPromise);
}


/* Location:              F:\dw\server.jar!\io\nett\\util\AsyncMapping.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */