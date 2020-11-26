/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.lang.reflect.Type;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class pc
/*     */   implements Comparable<pc>
/*     */ {
/*  22 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new ir("argument.id.invalid", new Object[0]));
/*     */ 
/*     */   
/*     */   protected final String a;
/*     */ 
/*     */   
/*     */   protected final String b;
/*     */ 
/*     */   
/*     */   protected pc(String[] ☃) {
/*  32 */     this.a = StringUtils.isEmpty(☃[0]) ? "minecraft" : ☃[0];
/*  33 */     this.b = ☃[1];
/*  34 */     if (!this.a.chars().allMatch(☃ -> (☃ == 95 || ☃ == 45 || (☃ >= 97 && ☃ <= 122) || (☃ >= 48 && ☃ <= 57) || ☃ == 46))) {
/*  35 */       throw new i("Non [a-z0-9_.-] character in namespace of location: " + this.a + ':' + this.b);
/*     */     }
/*  37 */     if (!this.b.chars().allMatch(☃ -> (☃ == 95 || ☃ == 45 || (☃ >= 97 && ☃ <= 122) || (☃ >= 48 && ☃ <= 57) || ☃ == 47 || ☃ == 46))) {
/*  38 */       throw new i("Non [a-z0-9/._-] character in path of location: " + this.a + ':' + this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public pc(String ☃) {
/*  43 */     this(b(☃, ':'));
/*     */   }
/*     */   
/*     */   public pc(String ☃, String str1) {
/*  47 */     this(new String[] { ☃, str1 });
/*     */   }
/*     */   
/*     */   public static pc a(String ☃, char c) {
/*  51 */     return new pc(b(☃, c));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static pc a(String ☃) {
/*     */     try {
/*  57 */       return new pc(☃);
/*  58 */     } catch (i i) {
/*  59 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected static String[] b(String ☃, char c) {
/*  64 */     String[] arrayOfString = { "minecraft", ☃ };
/*  65 */     int i = ☃.indexOf(c);
/*  66 */     if (i >= 0) {
/*  67 */       arrayOfString[1] = ☃.substring(i + 1, ☃.length());
/*  68 */       if (i >= 1) {
/*  69 */         arrayOfString[0] = ☃.substring(0, i);
/*     */       }
/*     */     } 
/*     */     
/*  73 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   public String a() {
/*  77 */     return this.b;
/*     */   }
/*     */   
/*     */   public String b() {
/*  81 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  86 */     return this.a + ':' + this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  91 */     if (this == ☃) {
/*  92 */       return true;
/*     */     }
/*     */     
/*  95 */     if (☃ instanceof pc) {
/*  96 */       pc pc1 = (pc)☃;
/*     */       
/*  98 */       return (this.a.equals(pc1.a) && this.b.equals(pc1.b));
/*     */     } 
/*     */     
/* 101 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 106 */     return 31 * this.a.hashCode() + this.b.hashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(pc ☃) {
/* 112 */     int i = this.b.compareTo(☃.b);
/* 113 */     if (i == 0) {
/* 114 */       i = this.a.compareTo(☃.a);
/*     */     }
/* 116 */     return i;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<pc>, JsonSerializer<pc> {
/*     */     public pc a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 122 */       return new pc(xj.a(☃, "location"));
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a(pc ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 127 */       return (JsonElement)new JsonPrimitive(☃.toString());
/*     */     }
/*     */   }
/*     */   
/*     */   public static pc a(StringReader ☃) throws CommandSyntaxException {
/* 132 */     int i = ☃.getCursor();
/* 133 */     while (☃.canRead() && a(☃.peek())) {
/* 134 */       ☃.skip();
/*     */     }
/* 136 */     String str = ☃.getString().substring(i, ☃.getCursor());
/*     */     try {
/* 138 */       return new pc(str);
/* 139 */     } catch (i i1) {
/* 140 */       ☃.setCursor(i);
/* 141 */       throw c.createWithContext(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(char ☃) {
/* 146 */     return ((☃ >= '0' && ☃ <= '9') || (☃ >= 'a' && ☃ <= 'z') || ☃ == '_' || ☃ == ':' || ☃ == '/' || ☃ == '.' || ☃ == '-');
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\pc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */