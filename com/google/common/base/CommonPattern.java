package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
abstract class CommonPattern {
  abstract CommonMatcher matcher(CharSequence paramCharSequence);
  
  abstract String pattern();
  
  abstract int flags();
  
  public abstract String toString();
  
  public abstract int hashCode();
  
  public abstract boolean equals(Object paramObject);
}


/* Location:              F:\dw\server.jar!\com\google\common\base\CommonPattern.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */