/*    */ import java.util.List;
/*    */ import java.util.Random;
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
/*    */ public enum bog
/*    */ {
/* 16 */   a
/*    */   {
/*    */     public void a(td ☃, boh boh1, List<alc> list, int i, el el1) {
/* 19 */       el el2 = new el(0, 128, 0);
/* 20 */       for (alc alc : list) {
/* 21 */         alc.a(el2);
/*    */       }
/* 23 */       boh1.a(b);
/*    */     }
/*    */   },
/* 26 */   b
/*    */   {
/*    */     public void a(td ☃, boh boh1, List<alc> list, int i, el el1) {
/* 29 */       if (i < 100) {
/* 30 */         if (i == 0 || i == 50 || i == 51 || i == 52 || i >= 95) {
/* 31 */           ☃.b(3001, new el(0, 128, 0), 0);
/*    */         }
/*    */       } else {
/* 34 */         boh1.a(c);
/*    */       } 
/*    */     }
/*    */   },
/* 38 */   c
/*    */   {
/*    */     public void a(td ☃, boh boh1, List<alc> list, int i, el el1) {
/* 41 */       int j = 40;
/* 42 */       boolean bool1 = (i % 40 == 0);
/* 43 */       boolean bool2 = (i % 40 == 39);
/* 44 */       if (bool1 || bool2) {
/* 45 */         btf.a[] arrayOfA = bvs.a(☃);
/* 46 */         int k = i / 40;
/* 47 */         if (k < arrayOfA.length) {
/* 48 */           btf.a a = arrayOfA[k];
/*    */           
/* 50 */           if (bool1) {
/* 51 */             for (alc alc : list) {
/* 52 */               alc.a(new el(a.a(), a.d() + 1, a.b()));
/*    */             }
/*    */           } else {
/* 55 */             int m = 10;
/* 56 */             for (el.a a1 : el.b(new el(a
/* 57 */                   .a() - 10, a.d() - 10, a.b() - 10), new el(a
/* 58 */                   .a() + 10, a.d() + 10, a.b() + 10)))
/*    */             {
/* 60 */               ☃.g(a1);
/*    */             }
/* 62 */             ☃.a((aer)null, (a.a() + 0.5F), a.d(), (a.b() + 0.5F), 5.0F, true);
/*    */             
/* 64 */             btf btf = new btf();
/* 65 */             btf.a(a);
/* 66 */             btf.a(true);
/* 67 */             btf.a(new el(0, 128, 0));
/* 68 */             btf.a(☃, (bmy)☃.v().f(), new Random(), new el(a.a(), 45, a.b()), bqp.e);
/*    */           } 
/* 70 */         } else if (bool1) {
/* 71 */           boh1.a(d);
/*    */         } 
/*    */       } 
/*    */     }
/*    */   },
/* 76 */   d
/*    */   {
/*    */     public void a(td ☃, boh boh1, List<alc> list, int i, el el1) {
/* 79 */       if (i >= 100) {
/* 80 */         boh1.a(e);
/* 81 */         boh1.f();
/* 82 */         for (alc alc : list) {
/* 83 */           alc.a((el)null);
/* 84 */           ☃.a(alc, alc.q, alc.r, alc.s, 6.0F, false);
/* 85 */           alc.V();
/*    */         } 
/* 87 */       } else if (i >= 80) {
/* 88 */         ☃.b(3001, new el(0, 128, 0), 0);
/* 89 */       } else if (i == 0) {
/* 90 */         for (alc alc : list) {
/* 91 */           alc.a(new el(0, 128, 0));
/*    */         }
/* 93 */       } else if (i < 5) {
/* 94 */         ☃.b(3001, new el(0, 128, 0), 0);
/*    */       } 
/*    */     }
/*    */   },
/* 98 */   e {
/*    */     public void a(td ☃, boh boh1, List<alc> list, int i, el el1) {}
/*    */   };
/*    */   
/*    */   public abstract void a(td paramtd, boh paramboh, List<alc> paramList, int paramInt, el paramel);
/*    */ }


/* Location:              F:\dw\server.jar!\bog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */