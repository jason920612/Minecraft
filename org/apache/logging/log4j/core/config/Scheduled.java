package org.apache.logging.log4j.core.config;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Scheduled {}


/* Location:              F:\dw\server.jar!\org\apache\logging\log4j\core\config\Scheduled.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */