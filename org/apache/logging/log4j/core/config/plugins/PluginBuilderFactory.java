package org.apache.logging.log4j.core.config.plugins;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface PluginBuilderFactory {}


/* Location:              F:\dw\server.jar!\org\apache\logging\log4j\core\config\plugins\PluginBuilderFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */