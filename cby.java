/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixTypes;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class cby
/*     */ {
/*  28 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final bod b;
/*  31 */   private Map<String, cbo> c = Maps.newHashMap();
/*  32 */   private final Object2IntMap<String> d = (Object2IntMap<String>)new Object2IntOpenHashMap();
/*     */   @Nullable
/*     */   private final ccc e;
/*     */   
/*     */   public cby(bod ☃, @Nullable ccc ccc1) {
/*  37 */     this.b = ☃;
/*  38 */     this.e = ccc1;
/*  39 */     this.d.defaultReturnValue(-1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <T extends cbo> T a(Function<String, T> ☃, String str) {
/*  45 */     cbo cbo = this.c.get(str);
/*  46 */     if (cbo == null && this.e != null) {
/*     */       try {
/*  48 */         File file = this.e.a(this.b, str);
/*  49 */         if (file != null && file.exists()) {
/*  50 */           cbo = (cbo)☃.apply(str);
/*     */           
/*  52 */           cbo.a(a(this.e, this.b, str, 1631).p("data"));
/*     */           
/*  54 */           this.c.put(str, cbo);
/*     */         } 
/*  56 */       } catch (Exception exception) {
/*  57 */         a.error("Error loading saved data: {}", str, exception);
/*     */       } 
/*     */     }
/*  60 */     return (T)cbo;
/*     */   }
/*     */   public void a(String ☃, cbo cbo1) {
/*  63 */     this.c.put(☃, cbo1);
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     try {
/*  68 */       this.d.clear();
/*  69 */       if (this.e == null) {
/*     */         return;
/*     */       }
/*  72 */       File ☃ = this.e.a(this.b, "idcounts");
/*  73 */       if (☃ != null && ☃.exists()) {
/*  74 */         DataInputStream dataInputStream = new DataInputStream(new FileInputStream(☃));
/*  75 */         gy gy = hi.a(dataInputStream);
/*  76 */         dataInputStream.close();
/*     */         
/*  78 */         for (String str : gy.c()) {
/*  79 */           if (gy.c(str, 99)) {
/*  80 */             this.d.put(str, gy.h(str));
/*     */           }
/*     */         } 
/*     */       } 
/*  84 */     } catch (Exception ☃) {
/*  85 */       a.error("Could not load aux values", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(String ☃) {
/*  90 */     int i = this.d.getInt(☃) + 1;
/*  91 */     this.d.put(☃, i);
/*  92 */     if (this.e == null) {
/*  93 */       return i;
/*     */     }
/*     */     try {
/*  96 */       File file = this.e.a(this.b, "idcounts");
/*  97 */       if (file != null) {
/*  98 */         gy gy = new gy();
/*     */         
/* 100 */         for (ObjectIterator<Object2IntMap.Entry<String>> objectIterator = this.d.object2IntEntrySet().iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<String> entry = objectIterator.next();
/* 101 */           gy.b((String)entry.getKey(), entry.getIntValue()); }
/*     */ 
/*     */         
/* 104 */         DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
/* 105 */         hi.a(gy, dataOutputStream);
/* 106 */         dataOutputStream.close();
/*     */       } 
/* 108 */     } catch (Exception exception) {
/* 109 */       a.error("Could not get free aux value {}", ☃, exception);
/*     */     } 
/* 111 */     return i;
/*     */   }
/*     */   
/*     */   public static gy a(ccc ☃, bod bod1, String str, int i) throws IOException {
/* 115 */     File file = ☃.a(bod1, str);
/* 116 */     try (FileInputStream ☃ = new FileInputStream(file)) {
/* 117 */       gy gy = hi.a(fileInputStream);
/*     */       
/* 119 */       int j = gy.c("DataVersion", 99) ? gy.h("DataVersion") : 1343;
/* 120 */       return hk.a(☃.i(), (DSL.TypeReference)DataFixTypes.SAVED_DATA, gy, j, i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/* 125 */     if (this.e == null) {
/*     */       return;
/*     */     }
/* 128 */     for (cbo ☃ : this.c.values()) {
/* 129 */       if (☃.d()) {
/* 130 */         a(☃);
/* 131 */         ☃.a(false);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(cbo ☃) {
/* 137 */     if (this.e == null) {
/*     */       return;
/*     */     }
/*     */     try {
/* 141 */       File file = this.e.a(this.b, ☃.e());
/* 142 */       if (file != null) {
/* 143 */         gy gy = new gy();
/* 144 */         gy.a("data", ☃.b(new gy()));
/* 145 */         gy.b("DataVersion", 1631);
/*     */         
/* 147 */         FileOutputStream fileOutputStream = new FileOutputStream(file);
/* 148 */         hi.a(gy, fileOutputStream);
/* 149 */         fileOutputStream.close();
/*     */       } 
/* 151 */     } catch (Exception exception) {
/* 152 */       a.error("Could not save data {}", ☃, exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\cby.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */