package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import javax.annotation.Nullable;

@GwtCompatible
public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
  @CanIgnoreReturnValue
  <T extends B> T getInstance(Class<T> paramClass);
  
  @CanIgnoreReturnValue
  <T extends B> T putInstance(Class<T> paramClass, @Nullable T paramT);
}


/* Location:              F:\dw\server.jar!\com\google\common\collect\ClassToInstanceMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */