/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acz
/*    */ {
/* 19 */   private static final Pattern a = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
/*    */   
/*    */   private final File b;
/*    */   private final Map<bod, List<axm>> c;
/*    */   
/*    */   public acz(File ☃) {
/* 25 */     this.b = ☃;
/* 26 */     ImmutableMap.Builder<bod, List<axm>> builder = ImmutableMap.builder();
/* 27 */     for (bod bod : bod.b()) {
/* 28 */       builder.put(bod, b(bod));
/*    */     }
/* 30 */     this.c = (Map<bod, List<axm>>)builder.build();
/*    */   }
/*    */   
/*    */   private List<axm> b(bod ☃) {
/* 34 */     ArrayList<axm> arrayList = Lists.newArrayList();
/*    */     
/* 36 */     File file = ☃.a(this.b);
/*    */     
/* 38 */     List<File> list = b(file);
/* 39 */     for (File file1 : list) {
/* 40 */       arrayList.addAll(a(file1));
/*    */     }
/* 42 */     list.sort(File::compareTo);
/*    */     
/* 44 */     return arrayList;
/*    */   }
/*    */   
/*    */   private List<axm> a(File ☃) {
/* 48 */     List<axm> list = Lists.newArrayList();
/* 49 */     bnz bnz = null;
/*    */     try {
/* 51 */       Matcher matcher = a.matcher(☃.getName());
/* 52 */       if (!matcher.matches()) {
/* 53 */         return list;
/*    */       }
/*    */       
/* 56 */       int i = Integer.parseInt(matcher.group(1)) << 5;
/* 57 */       int j = Integer.parseInt(matcher.group(2)) << 5;
/*    */       
/* 59 */       bnz = new bnz(☃);
/*    */       
/* 61 */       for (int k = 0; k < 32; k++) {
/* 62 */         for (int m = 0; m < 32; m++) {
/* 63 */           if (bnz.b(k, m)) {
/* 64 */             list.add(new axm(k + i, m + j));
/*    */           }
/*    */         } 
/*    */       } 
/* 68 */     } catch (Throwable throwable) {
/* 69 */       return Lists.newArrayList();
/*    */     } finally {
/* 71 */       if (bnz != null) {
/*    */         try {
/* 73 */           bnz.c();
/* 74 */         } catch (IOException iOException) {}
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 80 */     return list;
/*    */   }
/*    */   
/*    */   private List<File> b(File ☃) {
/* 84 */     File file = new File(☃, "region");
/* 85 */     File[] arrayOfFile = file.listFiles((☃, str) -> str.endsWith(".mca"));
/*    */     
/* 87 */     if (arrayOfFile != null) {
/* 88 */       return Lists.newArrayList((Object[])arrayOfFile);
/*    */     }
/* 90 */     return Lists.newArrayList();
/*    */   }
/*    */   
/*    */   public List<axm> a(bod ☃) {
/* 94 */     return this.c.get(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\acz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */