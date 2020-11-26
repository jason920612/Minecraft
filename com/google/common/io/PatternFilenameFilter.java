/*    */ package com.google.common.io;
/*    */ 
/*    */ import com.google.common.annotations.Beta;
/*    */ import com.google.common.annotations.GwtIncompatible;
/*    */ import com.google.common.base.Preconditions;
/*    */ import java.io.File;
/*    */ import java.io.FilenameFilter;
/*    */ import java.util.regex.Pattern;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Beta
/*    */ @GwtIncompatible
/*    */ public final class PatternFilenameFilter
/*    */   implements FilenameFilter
/*    */ {
/*    */   private final Pattern pattern;
/*    */   
/*    */   public PatternFilenameFilter(String patternStr) {
/* 47 */     this(Pattern.compile(patternStr));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public PatternFilenameFilter(Pattern pattern) {
/* 56 */     this.pattern = (Pattern)Preconditions.checkNotNull(pattern);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean accept(@Nullable File dir, String fileName) {
/* 61 */     return this.pattern.matcher(fileName).matches();
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\com\google\common\io\PatternFilenameFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */