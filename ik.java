/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ik
/*     */ {
/*     */   public static ij a(ij ☃, ip ip1) {
/*  21 */     if (ip1.g()) {
/*  22 */       return ☃;
/*     */     }
/*     */     
/*  25 */     if (☃.b().g()) {
/*  26 */       return ☃.a(ip1.m());
/*     */     }
/*     */     
/*  29 */     return (new iq("")).a(☃).a(ip1.m());
/*     */   }
/*     */ 
/*     */   
/*     */   public static ij a(@Nullable bu ☃, ij ij1, @Nullable aer aer1) throws CommandSyntaxException {
/*     */     ij ij2;
/*  35 */     if (ij1 instanceof in && ☃ != null) {
/*  36 */       String str1; in in = (in)ij1;
/*     */       
/*  38 */       if (in.j() != null) {
/*  39 */         List<? extends aer> list = in.j().b(☃);
/*  40 */         if (list.isEmpty()) {
/*  41 */           str1 = in.i();
/*  42 */         } else if (list.size() == 1) {
/*  43 */           str1 = ((aer)list.get(0)).bv();
/*     */         } else {
/*  45 */           throw cb.a.create();
/*     */         } 
/*     */       } else {
/*  48 */         str1 = in.i();
/*     */       } 
/*  50 */       String str2 = (aer1 != null && str1.equals("*")) ? aer1.bv() : str1;
/*  51 */       ij2 = new in(str2, in.k());
/*  52 */       ((in)ij2).b(in.d());
/*     */       
/*  54 */       ((in)ij2).b(☃);
/*  55 */     } else if (ij1 instanceof io && ☃ != null) {
/*  56 */       ij2 = ((io)ij1).a(☃);
/*  57 */     } else if (ij1 instanceof iq) {
/*  58 */       ij2 = new iq(((iq)ij1).i());
/*  59 */     } else if (ij1 instanceof im) {
/*  60 */       ij2 = new im(((im)ij1).j());
/*  61 */     } else if (ij1 instanceof ir) {
/*  62 */       Object[] arrayOfObject = ((ir)ij1).l();
/*  63 */       for (int i = 0; i < arrayOfObject.length; i++) {
/*  64 */         Object object = arrayOfObject[i];
/*  65 */         if (object instanceof ij) {
/*  66 */           arrayOfObject[i] = a(☃, (ij)object, aer1);
/*     */         }
/*     */       } 
/*  69 */       ij2 = new ir(((ir)ij1).k(), arrayOfObject);
/*     */     } else {
/*  71 */       return ij1;
/*     */     } 
/*     */     
/*  74 */     for (ij ij3 : ij1.a()) {
/*  75 */       ij2.a(a(☃, ij3, aer1));
/*     */     }
/*     */     
/*  78 */     return a(ij2, ij1.b());
/*     */   }
/*     */   
/*     */   public static ij a(GameProfile ☃) {
/*  82 */     if (☃.getName() != null)
/*  83 */       return new iq(☃.getName()); 
/*  84 */     if (☃.getId() != null) {
/*  85 */       return new iq(☃.getId().toString());
/*     */     }
/*  87 */     return new iq("(unknown)");
/*     */   }
/*     */ 
/*     */   
/*     */   public static ij a(Collection<String> ☃) {
/*  92 */     return a(☃, ☃ -> (new iq(☃)).a(a.k));
/*     */   }
/*     */   
/*     */   public static <T extends Comparable<T>> ij a(Collection<T> ☃, Function<T, ij> function) {
/*  96 */     if (☃.isEmpty())
/*  97 */       return new iq(""); 
/*  98 */     if (☃.size() == 1) {
/*  99 */       return function.apply(☃.iterator().next());
/*     */     }
/*     */     
/* 102 */     List<T> list = Lists.newArrayList(☃);
/* 103 */     list.sort(Comparable::compareTo);
/* 104 */     return b(☃, function);
/*     */   }
/*     */   
/*     */   public static <T> ij b(Collection<T> ☃, Function<T, ij> function) {
/* 108 */     if (☃.isEmpty())
/* 109 */       return new iq(""); 
/* 110 */     if (☃.size() == 1) {
/* 111 */       return function.apply(☃.iterator().next());
/*     */     }
/*     */     
/* 114 */     ij ij = new iq("");
/* 115 */     boolean bool = true;
/* 116 */     for (T t : ☃) {
/* 117 */       if (!bool) {
/* 118 */         ij.a((new iq(", ")).a(a.h));
/*     */       }
/* 120 */       ij.a(function.apply(t));
/* 121 */       bool = false;
/*     */     } 
/*     */     
/* 124 */     return ij;
/*     */   }
/*     */   
/*     */   public static ij a(ij ☃) {
/* 128 */     return (new iq("[")).a(☃).a("]");
/*     */   }
/*     */   
/*     */   public static ij a(Message ☃) {
/* 132 */     if (☃ instanceof ij) {
/* 133 */       return (ij)☃;
/*     */     }
/* 135 */     return new iq(☃.getString());
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\ik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */