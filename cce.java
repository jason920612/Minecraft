/*    */ import java.io.File;
/*    */ import java.time.format.DateTimeFormatter;
/*    */ import java.time.format.DateTimeFormatterBuilder;
/*    */ import java.time.format.SignStyle;
/*    */ import java.time.temporal.ChronoField;
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.server.MinecraftServer;
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
/*    */ public interface cce
/*    */ {
/* 27 */   public static final DateTimeFormatter d = (new DateTimeFormatterBuilder())
/* 28 */     .appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
/* 29 */     .appendLiteral('-')
/* 30 */     .appendValue(ChronoField.MONTH_OF_YEAR, 2)
/* 31 */     .appendLiteral('-')
/* 32 */     .appendValue(ChronoField.DAY_OF_MONTH, 2)
/* 33 */     .appendLiteral('_')
/* 34 */     .appendValue(ChronoField.HOUR_OF_DAY, 2)
/* 35 */     .appendLiteral('-')
/* 36 */     .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
/* 37 */     .appendLiteral('-')
/* 38 */     .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
/* 39 */     .toFormatter();
/*    */   
/*    */   ccc a(String paramString, @Nullable MinecraftServer paramMinecraftServer);
/*    */   
/*    */   @Nullable
/*    */   ccb c(String paramString);
/*    */   
/*    */   boolean b(String paramString);
/*    */   
/*    */   boolean a(String paramString, xs paramxs);
/*    */   
/*    */   File b(String paramString1, String paramString2);
/*    */ }


/* Location:              F:\dw\server.jar!\cce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */