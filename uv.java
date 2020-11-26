/*    */ import java.io.File;
/*    */ import java.io.FileFilter;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class uv
/*    */   implements uy
/*    */ {
/*    */   private static final FileFilter a;
/*    */   private final File b;
/*    */   
/*    */   static {
/* 13 */     a = (☃ -> {
/* 14 */         boolean bool1 = (☃.isFile() && ☃.getName().endsWith(".zip"));
/* 15 */         boolean bool2 = (☃.isDirectory() && (new File(☃, "pack.mcmeta")).isFile());
/*    */         
/* 17 */         return (bool1 || bool2);
/*    */       });
/*    */   }
/*    */ 
/*    */   
/*    */   public uv(File ☃) {
/* 23 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T extends va> void a(Map<String, T> ☃, va.b<T> b1) {
/* 28 */     if (!this.b.isDirectory())
/*    */     {
/* 30 */       this.b.mkdirs();
/*    */     }
/* 32 */     File[] arrayOfFile = this.b.listFiles(a);
/* 33 */     if (arrayOfFile == null) {
/*    */       return;
/*    */     }
/* 36 */     for (File file : arrayOfFile) {
/* 37 */       String str = "file/" + file.getName();
/* 38 */       T t = va.a(str, false, a(file), b1, va.a.a);
/* 39 */       if (t != null) {
/* 40 */         ☃.put(str, t);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   private Supplier<ul> a(File ☃) {
/* 46 */     if (☃.isDirectory()) {
/* 47 */       return () -> new uk(☃);
/*    */     }
/* 49 */     return () -> new uj(☃);
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar\\uv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */