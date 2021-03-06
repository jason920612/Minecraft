package org.apache.commons.lang3.builder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ToStringExclude {}


/* Location:              F:\dw\server.jar!\org\apache\commons\lang3\builder\ToStringExclude.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */