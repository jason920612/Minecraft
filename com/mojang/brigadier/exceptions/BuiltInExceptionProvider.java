package com.mojang.brigadier.exceptions;

public interface BuiltInExceptionProvider {
  Dynamic2CommandExceptionType doubleTooLow();
  
  Dynamic2CommandExceptionType doubleTooHigh();
  
  Dynamic2CommandExceptionType floatTooLow();
  
  Dynamic2CommandExceptionType floatTooHigh();
  
  Dynamic2CommandExceptionType integerTooLow();
  
  Dynamic2CommandExceptionType integerTooHigh();
  
  DynamicCommandExceptionType literalIncorrect();
  
  SimpleCommandExceptionType readerExpectedStartOfQuote();
  
  SimpleCommandExceptionType readerExpectedEndOfQuote();
  
  DynamicCommandExceptionType readerInvalidEscape();
  
  DynamicCommandExceptionType readerInvalidBool();
  
  DynamicCommandExceptionType readerInvalidInt();
  
  SimpleCommandExceptionType readerExpectedInt();
  
  DynamicCommandExceptionType readerInvalidDouble();
  
  SimpleCommandExceptionType readerExpectedDouble();
  
  DynamicCommandExceptionType readerInvalidFloat();
  
  SimpleCommandExceptionType readerExpectedFloat();
  
  SimpleCommandExceptionType readerExpectedBool();
  
  DynamicCommandExceptionType readerExpectedSymbol();
  
  SimpleCommandExceptionType dispatcherUnknownCommand();
  
  SimpleCommandExceptionType dispatcherUnknownArgument();
  
  SimpleCommandExceptionType dispatcherExpectedArgumentSeparator();
  
  DynamicCommandExceptionType dispatcherParseException();
}


/* Location:              F:\dw\server.jar!\com\mojang\brigadier\exceptions\BuiltInExceptionProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */