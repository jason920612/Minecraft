/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.Writer;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class qg
/*     */ {
/*  31 */   private static final Logger a = LogManager.getLogger();
/*  32 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new ir("commands.debug.notRunning", new Object[0]));
/*  33 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("commands.debug.alreadyRunning", new Object[0]));
/*     */   
/*     */   public static void a(CommandDispatcher<bu> ☃) {
/*  36 */     ☃.register(
/*  37 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)bv.a("debug")
/*  38 */         .requires(☃ -> ☃.c(3)))
/*  39 */         .then(bv.a("start").executes(☃ -> a((bu)☃.getSource()))))
/*  40 */         .then(bv.a("stop").executes(☃ -> b((bu)☃.getSource()))));
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(bu ☃) throws CommandSyntaxException {
/*  45 */     MinecraftServer minecraftServer = ☃.j();
/*  46 */     xr xr = minecraftServer.b;
/*  47 */     if (xr.a()) {
/*  48 */       throw c.create();
/*     */     }
/*  50 */     minecraftServer.ai();
/*  51 */     ☃.a(new ir("commands.debug.started", new Object[] { "Started the debug profiler. Type '/debug stop' to stop it." }), true);
/*  52 */     return 0;
/*     */   }
/*     */   
/*     */   private static int b(bu ☃) throws CommandSyntaxException {
/*  56 */     MinecraftServer minecraftServer = ☃.j();
/*  57 */     xr xr = minecraftServer.b;
/*  58 */     if (!xr.a()) {
/*  59 */       throw b.create();
/*     */     }
/*  61 */     long l1 = k.c();
/*  62 */     int i = minecraftServer.ah();
/*     */     
/*  64 */     long l2 = l1 - xr.c();
/*  65 */     int j = i - xr.d();
/*  66 */     File file = new File(minecraftServer.c("debug"), "profile-results-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + ".txt");
/*     */     
/*  68 */     file.getParentFile().mkdirs();
/*     */     
/*  70 */     Writer writer = null;
/*     */     try {
/*  72 */       writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
/*  73 */       writer.write(a(l2, j, xr));
/*  74 */     } catch (Throwable throwable) {
/*  75 */       a.error("Could not save profiler results to {}", file, throwable);
/*     */     } finally {
/*  77 */       IOUtils.closeQuietly(writer);
/*     */     } 
/*     */     
/*  80 */     xr.b();
/*     */     
/*  82 */     float f1 = (float)l2 / 1.0E9F;
/*  83 */     float f2 = j / f1;
/*  84 */     ☃.a(new ir("commands.debug.stopped", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(f1) }), Integer.valueOf(j), String.format("%.2f", new Object[] { Float.valueOf(f2) }) }), true);
/*     */     
/*  86 */     return xq.d(f2);
/*     */   }
/*     */   
/*     */   private static String a(long ☃, int i, xr xr1) {
/*  90 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/*  92 */     stringBuilder.append("---- Minecraft Profiler Results ----\n");
/*  93 */     stringBuilder.append("// ");
/*  94 */     stringBuilder.append(a());
/*  95 */     stringBuilder.append("\n\n");
/*     */     
/*  97 */     stringBuilder.append("Time span: ").append(☃).append(" ms\n");
/*  98 */     stringBuilder.append("Tick span: ").append(i).append(" ticks\n");
/*  99 */     stringBuilder.append("// This is approximately ").append(String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(i / (float)☃ / 1.0E9F) })).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
/*     */     
/* 101 */     stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
/*     */     
/* 103 */     a(0, "root", stringBuilder, xr1);
/*     */     
/* 105 */     stringBuilder.append("--- END PROFILE DUMP ---\n\n");
/*     */     
/* 107 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   private static void a(int ☃, String str, StringBuilder stringBuilder, xr xr1) {
/* 111 */     List<xr.a> list = xr1.b(str);
/* 112 */     if (list == null || list.size() < 3) {
/*     */       return;
/*     */     }
/*     */     
/* 116 */     for (int i = 1; i < list.size(); i++) {
/* 117 */       xr.a a = list.get(i);
/*     */       
/* 119 */       stringBuilder.append(String.format("[%02d] ", new Object[] { Integer.valueOf(☃) }));
/* 120 */       for (int j = 0; j < ☃; j++) {
/* 121 */         stringBuilder.append("|   ");
/*     */       }
/* 123 */       stringBuilder.append(a.c).append(" - ")
/* 124 */         .append(String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(a.a) })).append("%/")
/* 125 */         .append(String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(a.b) })).append("%\n");
/*     */       
/* 127 */       if (!"unspecified".equals(a.c)) {
/*     */         try {
/* 129 */           a(☃ + 1, str + "." + a.c, stringBuilder, xr1);
/* 130 */         } catch (Exception exception) {
/* 131 */           stringBuilder.append("[[ EXCEPTION ").append(exception).append(" ]]");
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static String a() {
/* 139 */     String[] ☃ = { "Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server." };
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
/* 157 */       return ☃[(int)(k.c() % ☃.length)];
/* 158 */     } catch (Throwable throwable) {
/* 159 */       return "Witty comment unavailable :(";
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\qg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */