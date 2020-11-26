/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agu
/*     */ {
/*  14 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   class a
/*     */   {
/*     */     public final agt a;
/*     */     public final int b;
/*     */     public boolean c;
/*     */     
/*     */     public a(agu this$0, int ☃, agt agt1) {
/*  23 */       this.b = ☃;
/*  24 */       this.a = agt1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(@Nullable Object ☃) {
/*  29 */       if (this == ☃) {
/*  30 */         return true;
/*     */       }
/*  32 */       if (☃ == null || getClass() != ☃.getClass()) {
/*  33 */         return false;
/*     */       }
/*  35 */       return this.a.equals(((a)☃).a);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/*  40 */       return this.a.hashCode();
/*     */     }
/*     */   }
/*     */   
/*  44 */   private final Set<a> b = Sets.newLinkedHashSet();
/*  45 */   private final Set<a> c = Sets.newLinkedHashSet();
/*     */   private final xr d;
/*     */   private int e;
/*  48 */   private int f = 3;
/*     */   private int g;
/*     */   
/*     */   public agu(xr ☃) {
/*  52 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃, agt agt1) {
/*  56 */     this.b.add(new a(this, ☃, agt1));
/*     */   }
/*     */   
/*     */   public void a(agt ☃) {
/*  60 */     Iterator<a> iterator = this.b.iterator();
/*  61 */     while (iterator.hasNext()) {
/*  62 */       a a = iterator.next();
/*  63 */       agt agt1 = a.a;
/*     */       
/*  65 */       if (agt1 == ☃) {
/*  66 */         if (a.c) {
/*  67 */           a.c = false;
/*  68 */           a.a.d();
/*  69 */           this.c.remove(a);
/*     */         } 
/*  71 */         iterator.remove();
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/*  78 */     this.d.a("goalSetup");
/*     */     
/*  80 */     if (this.e++ % this.f == 0) {
/*  81 */       for (a ☃ : this.b) {
/*  82 */         if (☃.c) {
/*  83 */           if (!b(☃) || !a(☃)) {
/*     */ 
/*     */ 
/*     */             
/*  87 */             ☃.c = false;
/*  88 */             ☃.a.d();
/*  89 */             this.c.remove(☃);
/*     */           } 
/*     */           
/*     */           continue;
/*     */         } 
/*  94 */         if (!b(☃) || !☃.a.a()) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 101 */         ☃.c = true;
/* 102 */         ☃.a.c();
/* 103 */         this.c.add(☃);
/*     */       } 
/*     */     } else {
/* 106 */       for (Iterator<a> ☃ = this.c.iterator(); ☃.hasNext(); ) {
/* 107 */         a a = ☃.next();
/* 108 */         if (!a(a)) {
/*     */ 
/*     */ 
/*     */           
/* 112 */           a.c = false;
/* 113 */           a.a.d();
/* 114 */           ☃.remove();
/*     */         } 
/*     */       } 
/*     */     } 
/* 118 */     this.d.e();
/*     */     
/* 120 */     if (!this.c.isEmpty()) {
/* 121 */       this.d.a("goalTick");
/*     */ 
/*     */ 
/*     */       
/* 125 */       for (a ☃ : this.c)
/*     */       {
/*     */ 
/*     */         
/* 129 */         ☃.a.e();
/*     */       }
/* 131 */       this.d.e();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(a ☃) {
/* 136 */     return ☃.a.b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean b(a ☃) {
/* 144 */     if (this.c.isEmpty()) {
/* 145 */       return true;
/*     */     }
/*     */     
/* 148 */     if (b(☃.a.h())) {
/* 149 */       return false;
/*     */     }
/*     */     
/* 152 */     for (a a1 : this.c) {
/* 153 */       if (a1 == ☃) {
/*     */         continue;
/*     */       }
/*     */       
/* 157 */       if (☃.b >= a1.b) {
/* 158 */         if (!a(☃, a1))
/* 159 */           return false;  continue;
/*     */       } 
/* 161 */       if (!a1.a.f()) {
/* 162 */         return false;
/*     */       }
/*     */     } 
/* 165 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(a ☃, a a1) {
/* 169 */     return ((☃.a.h() & a1.a.h()) == 0);
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
/*     */   public boolean b(int ☃) {
/* 181 */     return ((this.g & ☃) > 0);
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 185 */     this.g |= ☃;
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 189 */     this.g &= ☃ ^ 0xFFFFFFFF;
/*     */   }
/*     */   
/*     */   public void a(int ☃, boolean bool) {
/* 193 */     if (bool) {
/* 194 */       d(☃);
/*     */     } else {
/* 196 */       c(☃);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\agu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */