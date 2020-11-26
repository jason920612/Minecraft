package org.apache.logging.log4j.core.appender;

public interface ManagerFactory<M, T> {
  M createManager(String paramString, T paramT);
}


/* Location:              F:\dw\server.jar!\org\apache\logging\log4j\core\appender\ManagerFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */