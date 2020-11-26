/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ci
/*     */   implements ArgumentType<ci.c>
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final DynamicCommandExceptionType c;
/*  23 */   private static final Collection<String> a = Arrays.asList(new String[] { "foo", "foo.bar", "foo[0]", "[0]", "." }); static {
/*  24 */     b = new DynamicCommandExceptionType(☃ -> new ir("arguments.nbtpath.child.invalid", new Object[] { ☃ }));
/*  25 */     c = new DynamicCommandExceptionType(☃ -> new ir("arguments.nbtpath.element.invalid", new Object[] { ☃ }));
/*  26 */   } private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new ir("arguments.nbtpath.node.invalid", new Object[0]));
/*     */   
/*     */   public static ci a() {
/*  29 */     return new ci();
/*     */   }
/*     */   
/*     */   public static c a(CommandContext<bu> ☃, String str) {
/*  33 */     return (c)☃.getArgument(str, c.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public c a(StringReader ☃) throws CommandSyntaxException {
/*  38 */     List<d> list = Lists.newArrayList();
/*  39 */     int i = ☃.getCursor();
/*     */     
/*  41 */     while (☃.canRead() && ☃.peek() != ' ') {
/*  42 */       switch (☃.peek()) {
/*     */         case '[':
/*  44 */           ☃.skip();
/*  45 */           list.add(new b(☃.readInt()));
/*  46 */           ☃.expect(']');
/*     */           break;
/*     */         case '"':
/*  49 */           list.add(new a(☃.readString()));
/*     */           break;
/*     */         default:
/*  52 */           list.add(new a(b(☃)));
/*     */           break;
/*     */       } 
/*  55 */       if (☃.canRead()) {
/*  56 */         char c = ☃.peek();
/*  57 */         if (c != ' ' && c != '[') {
/*  58 */           ☃.expect('.');
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     return new c(☃.getString().substring(i, ☃.getCursor()), list.<d>toArray(new d[0]));
/*     */   }
/*     */   
/*     */   private String b(StringReader ☃) throws CommandSyntaxException {
/*  67 */     int i = ☃.getCursor();
/*  68 */     while (☃.canRead() && a(☃.peek())) {
/*  69 */       ☃.skip();
/*     */     }
/*  71 */     if (☃.getCursor() == i) {
/*  72 */       throw d.createWithContext(☃);
/*     */     }
/*  74 */     return ☃.getString().substring(i, ☃.getCursor());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/*  79 */     return a;
/*     */   }
/*     */   
/*     */   private static boolean a(char ☃) {
/*  83 */     return (☃ != ' ' && ☃ != '"' && ☃ != '[' && ☃ != ']' && ☃ != '.');
/*     */   }
/*     */   
/*     */   public static class c {
/*     */     private final String a;
/*     */     private final ci.d[] b;
/*     */     
/*     */     public c(String ☃, ci.d[] arrayOfD) {
/*  91 */       this.a = ☃;
/*  92 */       this.b = arrayOfD;
/*     */     }
/*     */     
/*     */     public ho a(ho ☃) throws CommandSyntaxException {
/*  96 */       for (ci.d d1 : this.b) {
/*  97 */         ☃ = d1.a(☃);
/*     */       }
/*  99 */       return ☃;
/*     */     }
/*     */     
/*     */     public ho a(ho ☃, ho ho1) throws CommandSyntaxException {
/* 103 */       for (int i = 0; i < this.b.length; i++) {
/* 104 */         ci.d d1 = this.b[i];
/* 105 */         if (i < this.b.length - 1) {
/* 106 */           int j = i + 1;
/* 107 */           ☃ = d1.a(☃, () -> this.b[☃].a());
/*     */         } else {
/* 109 */           d1.a(☃, ho1);
/*     */         } 
/*     */       } 
/* 112 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 117 */       return this.a;
/*     */     }
/*     */     
/*     */     public void b(ho ☃) throws CommandSyntaxException {
/* 121 */       for (int i = 0; i < this.b.length; i++) {
/* 122 */         ci.d d1 = this.b[i];
/* 123 */         if (i < this.b.length - 1) {
/* 124 */           ☃ = d1.a(☃);
/*     */         } else {
/* 126 */           d1.b(☃);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static interface d {
/*     */     ho a(ho param1ho) throws CommandSyntaxException;
/*     */     
/*     */     ho a(ho param1ho, Supplier<ho> param1Supplier) throws CommandSyntaxException;
/*     */     
/*     */     ho a();
/*     */     
/*     */     void a(ho param1ho1, ho param1ho2) throws CommandSyntaxException;
/*     */     
/*     */     void b(ho param1ho) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   static class a implements d {
/*     */     private final String a;
/*     */     
/*     */     public a(String ☃) {
/* 148 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public ho a(ho ☃) throws CommandSyntaxException {
/* 153 */       if (☃ instanceof gy) {
/* 154 */         return ((gy)☃).c(this.a);
/*     */       }
/* 156 */       throw ci.b().create(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public ho a(ho ☃, Supplier<ho> supplier) throws CommandSyntaxException {
/* 161 */       if (☃ instanceof gy) {
/* 162 */         gy gy = (gy)☃;
/* 163 */         if (gy.e(this.a)) {
/* 164 */           return gy.c(this.a);
/*     */         }
/* 166 */         ho ho1 = supplier.get();
/* 167 */         gy.a(this.a, ho1);
/* 168 */         return ho1;
/*     */       } 
/*     */       
/* 171 */       throw ci.b().create(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public ho a() {
/* 176 */       return new gy();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(ho ☃, ho ho1) throws CommandSyntaxException {
/* 181 */       if (☃ instanceof gy) {
/* 182 */         gy gy = (gy)☃;
/* 183 */         gy.a(this.a, ho1);
/*     */         return;
/*     */       } 
/* 186 */       throw ci.b().create(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(ho ☃) throws CommandSyntaxException {
/* 191 */       if (☃ instanceof gy) {
/* 192 */         gy gy = (gy)☃;
/* 193 */         if (gy.e(this.a)) {
/* 194 */           gy.r(this.a);
/*     */           return;
/*     */         } 
/*     */       } 
/* 198 */       throw ci.b().create(this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b implements d {
/*     */     private final int a;
/*     */     
/*     */     public b(int ☃) {
/* 206 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public ho a(ho ☃) throws CommandSyntaxException {
/* 211 */       if (☃ instanceof gx) {
/* 212 */         gx<?> gx = (gx)☃;
/* 213 */         if (gx.size() > this.a) {
/* 214 */           return (ho)gx.c(this.a);
/*     */         }
/*     */       } 
/* 217 */       throw ci.c().create(Integer.valueOf(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public ho a(ho ☃, Supplier<ho> supplier) throws CommandSyntaxException {
/* 222 */       return a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public ho a() {
/* 227 */       return new he();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(ho ☃, ho ho1) throws CommandSyntaxException {
/* 232 */       if (☃ instanceof gx) {
/* 233 */         gx<?> gx = (gx)☃;
/* 234 */         if (gx.size() > this.a) {
/* 235 */           gx.a(this.a, ho1);
/*     */           return;
/*     */         } 
/*     */       } 
/* 239 */       throw ci.c().create(Integer.valueOf(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(ho ☃) throws CommandSyntaxException {
/* 244 */       if (☃ instanceof gx) {
/* 245 */         gx<?> gx = (gx)☃;
/* 246 */         if (gx.size() > this.a) {
/* 247 */           gx.b(this.a);
/*     */           return;
/*     */         } 
/*     */       } 
/* 251 */       throw ci.c().create(Integer.valueOf(this.a));
/*     */     }
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */