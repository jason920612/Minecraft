package org.apache.logging.log4j.message;

interface ThreadInformation {
  void printThreadInfo(StringBuilder paramStringBuilder);
  
  void printStack(StringBuilder paramStringBuilder, StackTraceElement[] paramArrayOfStackTraceElement);
}


/* Location:              F:\dw\server.jar!\org\apache\logging\log4j\message\ThreadInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */