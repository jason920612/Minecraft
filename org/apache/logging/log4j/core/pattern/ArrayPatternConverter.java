package org.apache.logging.log4j.core.pattern;

public interface ArrayPatternConverter extends PatternConverter {
  void format(StringBuilder paramStringBuilder, Object... paramVarArgs);
}


/* Location:              F:\dw\server.jar!\org\apache\logging\log4j\core\pattern\ArrayPatternConverter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */