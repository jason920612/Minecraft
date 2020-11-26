/*    */ import com.google.common.base.Joiner;
/*    */ import com.google.common.base.Predicates;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.lang.reflect.Array;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class blj
/*    */ {
/* 16 */   private static final Joiner a = Joiner.on(",");
/*    */   
/* 18 */   private final List<String[]> b = Lists.newArrayList();
/* 19 */   private final Map<Character, Predicate<blh>> c = Maps.newHashMap();
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   private blj() {
/* 24 */     this.c.put(Character.valueOf(' '), Predicates.alwaysTrue());
/*    */   }
/*    */   
/*    */   public blj a(String... ☃) {
/* 28 */     if (ArrayUtils.isEmpty((Object[])☃) || StringUtils.isEmpty(☃[0])) {
/* 29 */       throw new IllegalArgumentException("Empty pattern for aisle");
/*    */     }
/*    */     
/* 32 */     if (this.b.isEmpty()) {
/* 33 */       this.d = ☃.length;
/* 34 */       this.e = ☃[0].length();
/*    */     } 
/*    */     
/* 37 */     if (☃.length != this.d) {
/* 38 */       throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + ☃.length + ")");
/*    */     }
/*    */     
/* 41 */     for (String str : ☃) {
/* 42 */       if (str.length() != this.e) {
/* 43 */         throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + str.length() + ")");
/*    */       }
/* 45 */       for (char c : str.toCharArray()) {
/* 46 */         if (!this.c.containsKey(Character.valueOf(c))) {
/* 47 */           this.c.put(Character.valueOf(c), null);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 52 */     this.b.add(☃);
/*    */     
/* 54 */     return this;
/*    */   }
/*    */   
/*    */   public static blj a() {
/* 58 */     return new blj();
/*    */   }
/*    */   
/*    */   public blj a(char ☃, Predicate<blh> predicate) {
/* 62 */     this.c.put(Character.valueOf(☃), predicate);
/*    */     
/* 64 */     return this;
/*    */   }
/*    */   
/*    */   public bli b() {
/* 68 */     return new bli(c());
/*    */   }
/*    */ 
/*    */   
/*    */   private Predicate<blh>[][][] c() {
/* 73 */     d();
/*    */     
/* 75 */     Predicate[][][] arrayOfPredicate = (Predicate[][][])Array.newInstance(Predicate.class, new int[] { this.b.size(), this.d, this.e });
/*    */     
/* 77 */     for (int ☃ = 0; ☃ < this.b.size(); ☃++) {
/* 78 */       for (int i = 0; i < this.d; i++) {
/* 79 */         for (int j = 0; j < this.e; j++) {
/* 80 */           arrayOfPredicate[☃][i][j] = this.c.get(Character.valueOf(((String[])this.b.get(☃))[i].charAt(j)));
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 85 */     return (Predicate<blh>[][][])arrayOfPredicate;
/*    */   }
/*    */   
/*    */   private void d() {
/* 89 */     List<Character> ☃ = Lists.newArrayList();
/*    */     
/* 91 */     for (Map.Entry<Character, Predicate<blh>> entry : this.c.entrySet()) {
/* 92 */       if (entry.getValue() == null) {
/* 93 */         ☃.add(entry.getKey());
/*    */       }
/*    */     } 
/*    */     
/* 97 */     if (!☃.isEmpty())
/* 98 */       throw new IllegalStateException("Predicates for character(s) " + a.join(☃) + " are missing"); 
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\blj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */