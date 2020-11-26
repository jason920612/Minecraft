/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringWriter;
/*     */ import java.io.Writer;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*  22 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final String b;
/*     */   private final Throwable c;
/*  26 */   private final c d = new c(this, "System Details");
/*  27 */   private final List<c> e = Lists.newArrayList();
/*     */   private File f;
/*     */   private boolean g = true;
/*  30 */   private StackTraceElement[] h = new StackTraceElement[0];
/*     */   
/*     */   public b(String ☃, Throwable throwable) {
/*  33 */     this.b = ☃;
/*  34 */     this.c = throwable;
/*     */     
/*  36 */     h();
/*     */   }
/*     */   
/*     */   private void h() {
/*  40 */     this.d.a("Minecraft Version", () -> "1.13.2");
/*  41 */     this.d.a("Operating System", () -> System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
/*  42 */     this.d.a("Java Version", () -> System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
/*  43 */     this.d.a("Java VM Version", () -> System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
/*     */     
/*  45 */     this.d.a("Memory", () -> {
/*     */           Runtime ☃ = Runtime.getRuntime();
/*     */           
/*     */           long l1 = ☃.maxMemory();
/*     */           
/*     */           long l2 = ☃.totalMemory();
/*     */           long l3 = ☃.freeMemory();
/*     */           long l4 = l1 / 1024L / 1024L;
/*     */           long l5 = l2 / 1024L / 1024L;
/*     */           long l6 = l3 / 1024L / 1024L;
/*     */           return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l1 + " bytes (" + l4 + " MB)";
/*     */         });
/*  57 */     this.d.a("JVM Flags", () -> {
/*     */           List<String> ☃ = k.f().collect((Collector)Collectors.toList());
/*     */           return String.format("%d total; %s", new Object[] { Integer.valueOf(☃.size()), ☃.stream().collect(Collectors.joining(" ")) });
/*     */         });
/*     */   }
/*     */   
/*     */   public String a() {
/*  64 */     return this.b;
/*     */   }
/*     */   
/*     */   public Throwable b() {
/*  68 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(StringBuilder ☃) {
/*  80 */     if ((this.h == null || this.h.length <= 0) && !this.e.isEmpty()) {
/*  81 */       this.h = (StackTraceElement[])ArrayUtils.subarray((Object[])((c)this.e.get(0)).a(), 0, 1);
/*     */     }
/*     */     
/*  84 */     if (this.h != null && this.h.length > 0) {
/*  85 */       ☃.append("-- Head --\n");
/*  86 */       ☃.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
/*  87 */       ☃.append("Stacktrace:\n");
/*     */       
/*  89 */       for (StackTraceElement stackTraceElement : this.h) {
/*  90 */         ☃.append("\t").append("at ").append(stackTraceElement);
/*  91 */         ☃.append("\n");
/*     */       } 
/*  93 */       ☃.append("\n");
/*     */     } 
/*     */     
/*  96 */     for (c c1 : this.e) {
/*  97 */       c1.a(☃);
/*  98 */       ☃.append("\n\n");
/*     */     } 
/*     */     
/* 101 */     this.d.a(☃);
/*     */   }
/*     */   
/*     */   public String d() {
/* 105 */     StringWriter ☃ = null;
/* 106 */     PrintWriter printWriter = null;
/* 107 */     Throwable throwable = this.c;
/*     */     
/* 109 */     if (throwable.getMessage() == null) {
/*     */       
/* 111 */       if (throwable instanceof NullPointerException) {
/* 112 */         throwable = new NullPointerException(this.b);
/* 113 */       } else if (throwable instanceof StackOverflowError) {
/* 114 */         throwable = new StackOverflowError(this.b);
/* 115 */       } else if (throwable instanceof OutOfMemoryError) {
/* 116 */         throwable = new OutOfMemoryError(this.b);
/*     */       } 
/*     */       
/* 119 */       throwable.setStackTrace(this.c.getStackTrace());
/*     */     } 
/*     */     
/*     */     try {
/* 123 */       ☃ = new StringWriter();
/* 124 */       printWriter = new PrintWriter(☃);
/* 125 */       throwable.printStackTrace(printWriter);
/* 126 */       return ☃.toString();
/*     */     } finally {
/* 128 */       IOUtils.closeQuietly(☃);
/* 129 */       IOUtils.closeQuietly(printWriter);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String e() {
/* 134 */     StringBuilder ☃ = new StringBuilder();
/*     */     
/* 136 */     ☃.append("---- Minecraft Crash Report ----\n");
/* 137 */     ☃.append("// ");
/* 138 */     ☃.append(i());
/* 139 */     ☃.append("\n\n");
/*     */     
/* 141 */     ☃.append("Time: ");
/* 142 */     ☃.append((new SimpleDateFormat()).format(new Date()));
/* 143 */     ☃.append("\n");
/*     */     
/* 145 */     ☃.append("Description: ");
/* 146 */     ☃.append(this.b);
/* 147 */     ☃.append("\n\n");
/*     */     
/* 149 */     ☃.append(d());
/* 150 */     ☃.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
/*     */     
/* 152 */     for (int i = 0; i < 87; i++) {
/* 153 */       ☃.append("-");
/*     */     }
/* 155 */     ☃.append("\n\n");
/* 156 */     a(☃);
/*     */     
/* 158 */     return ☃.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(File ☃) {
/* 166 */     if (this.f != null) {
/* 167 */       return false;
/*     */     }
/* 169 */     if (☃.getParentFile() != null) {
/* 170 */       ☃.getParentFile().mkdirs();
/*     */     }
/*     */     
/* 173 */     Writer writer = null;
/*     */     try {
/* 175 */       writer = new OutputStreamWriter(new FileOutputStream(☃), StandardCharsets.UTF_8);
/* 176 */       writer.write(e());
/*     */       
/* 178 */       this.f = ☃;
/* 179 */       return true;
/* 180 */     } catch (Throwable throwable) {
/* 181 */       a.error("Could not save crash report to {}", ☃, throwable);
/* 182 */       return false;
/*     */     } finally {
/* 184 */       IOUtils.closeQuietly(writer);
/*     */     } 
/*     */   }
/*     */   
/*     */   public c g() {
/* 189 */     return this.d;
/*     */   }
/*     */   
/*     */   public c a(String ☃) {
/* 193 */     return a(☃, 1);
/*     */   }
/*     */   
/*     */   public c a(String ☃, int i) {
/* 197 */     c c1 = new c(this, ☃);
/*     */     
/* 199 */     if (this.g) {
/* 200 */       int j = c1.a(i);
/* 201 */       StackTraceElement[] arrayOfStackTraceElement = this.c.getStackTrace();
/* 202 */       StackTraceElement stackTraceElement1 = null;
/* 203 */       StackTraceElement stackTraceElement2 = null;
/*     */       
/* 205 */       int k = arrayOfStackTraceElement.length - j;
/* 206 */       if (k < 0) {
/* 207 */         System.out.println("Negative index in crash report handler (" + arrayOfStackTraceElement.length + "/" + j + ")");
/*     */       }
/*     */       
/* 210 */       if (arrayOfStackTraceElement != null && 0 <= k && k < arrayOfStackTraceElement.length) {
/* 211 */         stackTraceElement1 = arrayOfStackTraceElement[k];
/*     */         
/* 213 */         if (arrayOfStackTraceElement.length + 1 - j < arrayOfStackTraceElement.length) {
/* 214 */           stackTraceElement2 = arrayOfStackTraceElement[arrayOfStackTraceElement.length + 1 - j];
/*     */         }
/*     */       } 
/*     */       
/* 218 */       this.g = c1.a(stackTraceElement1, stackTraceElement2);
/*     */       
/* 220 */       if (j > 0 && !this.e.isEmpty()) {
/* 221 */         c c2 = this.e.get(this.e.size() - 1);
/* 222 */         c2.b(j);
/* 223 */       } else if (arrayOfStackTraceElement != null && arrayOfStackTraceElement.length >= j && 0 <= k && k < arrayOfStackTraceElement.length) {
/* 224 */         this.h = new StackTraceElement[k];
/* 225 */         System.arraycopy(arrayOfStackTraceElement, 0, this.h, 0, this.h.length);
/*     */       } else {
/* 227 */         this.g = false;
/*     */       } 
/*     */     } 
/*     */     
/* 231 */     this.e.add(c1);
/* 232 */     return c1;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String i() {
/* 237 */     String[] ☃ = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 275 */       return ☃[(int)(k.c() % ☃.length)];
/* 276 */     } catch (Throwable throwable) {
/* 277 */       return "Witty comment unavailable :(";
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static b a(Throwable ☃, String str) {
/*     */     b b1;
/* 284 */     if (☃ instanceof h) {
/* 285 */       b1 = ((h)☃).a();
/*     */     } else {
/* 287 */       b1 = new b(str, ☃);
/*     */     } 
/*     */     
/* 290 */     return b1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */