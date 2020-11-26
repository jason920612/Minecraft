/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.ParseResults;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class br
/*     */ {
/*     */   private final c[] a;
/*     */   private final pc b;
/*     */   
/*     */   public br(pc ☃, c[] arrayOfC) {
/*  19 */     this.b = ☃;
/*  20 */     this.a = arrayOfC;
/*     */   }
/*     */   
/*     */   public pc a() {
/*  24 */     return this.b;
/*     */   }
/*     */   
/*     */   public c[] b() {
/*  28 */     return this.a;
/*     */   }
/*     */   
/*     */   public static br a(pc ☃, pp pp1, List<String> list) {
/*  32 */     List<c> list1 = Lists.newArrayListWithCapacity(list.size());
/*  33 */     for (int i = 0; i < list.size(); i++) {
/*  34 */       int j = i + 1;
/*  35 */       String str = ((String)list.get(i)).trim();
/*  36 */       StringReader stringReader = new StringReader(str);
/*     */       
/*  38 */       if (stringReader.canRead() && stringReader.peek() != '#') {
/*     */ 
/*     */ 
/*     */         
/*  42 */         if (stringReader.peek() == '/') {
/*  43 */           stringReader.skip();
/*  44 */           if (stringReader.peek() == '/') {
/*  45 */             throw new IllegalArgumentException("Unknown or invalid command '" + str + "' on line " + j + " (if you intended to make a comment, use '#' not '//')");
/*     */           }
/*  47 */           String str1 = stringReader.readUnquotedString();
/*  48 */           throw new IllegalArgumentException("Unknown or invalid command '" + str + "' on line " + j + " (did you mean '" + str1 + "'? Do not use a preceding forwards slash.)");
/*     */         } 
/*     */ 
/*     */         
/*     */         try {
/*  53 */           ParseResults<bu> parseResults = pp1.a().aI().a().parse(stringReader, pp1.f());
/*  54 */           if (parseResults.getReader().canRead()) {
/*  55 */             if (parseResults.getExceptions().size() == 1)
/*  56 */               throw (CommandSyntaxException)parseResults.getExceptions().values().iterator().next(); 
/*  57 */             if (parseResults.getContext().getRange().isEmpty()) {
/*  58 */               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parseResults.getReader());
/*     */             }
/*  60 */             throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(parseResults.getReader());
/*     */           } 
/*     */           
/*  63 */           list1.add(new b(parseResults));
/*     */         }
/*  65 */         catch (CommandSyntaxException commandSyntaxException) {
/*  66 */           throw new IllegalArgumentException("Whilst parsing command on line " + j + ": " + commandSyntaxException.getMessage());
/*     */         } 
/*     */       } 
/*     */     } 
/*  70 */     return new br(☃, list1.<c>toArray(new c[0]));
/*     */   }
/*     */   
/*     */   public static interface c {
/*     */     void a(pp param1pp, bu param1bu, ArrayDeque<pp.a> param1ArrayDeque, int param1Int) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   public static class b implements c {
/*     */     private final ParseResults<bu> a;
/*     */     
/*     */     public b(ParseResults<bu> ☃) {
/*  81 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(pp ☃, bu bu1, ArrayDeque<pp.a> arrayDeque, int i) throws CommandSyntaxException {
/*  86 */       ☃.d().execute(new ParseResults(this.a.getContext().withSource(bu1), this.a.getStartIndex(), this.a.getReader(), this.a.getExceptions()));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  91 */       return this.a.getReader().getString();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class d implements c {
/*     */     private final br.a a;
/*     */     
/*     */     public d(br ☃) {
/*  99 */       this.a = new br.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(pp ☃, bu bu1, ArrayDeque<pp.a> arrayDeque, int i) {
/* 104 */       br br = this.a.a(☃);
/* 105 */       if (br != null) {
/* 106 */         br.c[] arrayOfC = br.b();
/* 107 */         int j = i - arrayDeque.size();
/* 108 */         int k = Math.min(arrayOfC.length, j);
/* 109 */         for (int m = k - 1; m >= 0; m--) {
/* 110 */           arrayDeque.addFirst(new pp.a(☃, bu1, arrayOfC[m]));
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 117 */       return "function " + this.a.a();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a {
/* 122 */     public static final a a = new a((pc)null);
/*     */     
/*     */     @Nullable
/*     */     private final pc b;
/*     */     private boolean c;
/*     */     private br d;
/*     */     
/*     */     public a(@Nullable pc ☃) {
/* 130 */       this.b = ☃;
/*     */     }
/*     */     
/*     */     public a(br ☃) {
/* 134 */       this.b = null;
/* 135 */       this.d = ☃;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public br a(pp ☃) {
/* 140 */       if (!this.c) {
/* 141 */         if (this.b != null) {
/* 142 */           this.d = ☃.a(this.b);
/*     */         }
/* 144 */         this.c = true;
/*     */       } 
/* 146 */       return this.d;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public pc a() {
/* 151 */       return (this.d != null) ? br.a(this.d) : this.b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\br.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */