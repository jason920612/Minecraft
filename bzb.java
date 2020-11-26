/*    */ 
/*    */ public class bzb
/*    */ {
/*  4 */   public static final bzb[] a = new bzb[64];
/*    */   
/*  6 */   public static final bzb b = new bzb(0, 0);
/*  7 */   public static final bzb c = new bzb(1, 8368696);
/*  8 */   public static final bzb d = new bzb(2, 16247203);
/*  9 */   public static final bzb e = new bzb(3, 13092807);
/* 10 */   public static final bzb f = new bzb(4, 16711680);
/* 11 */   public static final bzb g = new bzb(5, 10526975);
/* 12 */   public static final bzb h = new bzb(6, 10987431);
/* 13 */   public static final bzb i = new bzb(7, 31744);
/* 14 */   public static final bzb j = new bzb(8, 16777215);
/* 15 */   public static final bzb k = new bzb(9, 10791096);
/* 16 */   public static final bzb l = new bzb(10, 9923917);
/* 17 */   public static final bzb m = new bzb(11, 7368816);
/* 18 */   public static final bzb n = new bzb(12, 4210943);
/* 19 */   public static final bzb o = new bzb(13, 9402184);
/* 20 */   public static final bzb p = new bzb(14, 16776437);
/* 21 */   public static final bzb q = new bzb(15, 14188339);
/* 22 */   public static final bzb r = new bzb(16, 11685080);
/* 23 */   public static final bzb s = new bzb(17, 6724056);
/* 24 */   public static final bzb t = new bzb(18, 15066419);
/* 25 */   public static final bzb u = new bzb(19, 8375321);
/* 26 */   public static final bzb v = new bzb(20, 15892389);
/* 27 */   public static final bzb w = new bzb(21, 5000268);
/* 28 */   public static final bzb x = new bzb(22, 10066329);
/* 29 */   public static final bzb y = new bzb(23, 5013401);
/* 30 */   public static final bzb z = new bzb(24, 8339378);
/* 31 */   public static final bzb A = new bzb(25, 3361970);
/* 32 */   public static final bzb B = new bzb(26, 6704179);
/* 33 */   public static final bzb C = new bzb(27, 6717235);
/* 34 */   public static final bzb D = new bzb(28, 10040115);
/* 35 */   public static final bzb E = new bzb(29, 1644825);
/* 36 */   public static final bzb F = new bzb(30, 16445005);
/* 37 */   public static final bzb G = new bzb(31, 6085589);
/* 38 */   public static final bzb H = new bzb(32, 4882687);
/* 39 */   public static final bzb I = new bzb(33, 55610);
/* 40 */   public static final bzb J = new bzb(34, 8476209);
/* 41 */   public static final bzb K = new bzb(35, 7340544);
/*    */   
/* 43 */   public static final bzb L = new bzb(36, 13742497);
/* 44 */   public static final bzb M = new bzb(37, 10441252);
/* 45 */   public static final bzb N = new bzb(38, 9787244);
/* 46 */   public static final bzb O = new bzb(39, 7367818);
/* 47 */   public static final bzb P = new bzb(40, 12223780);
/* 48 */   public static final bzb Q = new bzb(41, 6780213);
/* 49 */   public static final bzb R = new bzb(42, 10505550);
/* 50 */   public static final bzb S = new bzb(43, 3746083);
/* 51 */   public static final bzb T = new bzb(44, 8874850);
/* 52 */   public static final bzb U = new bzb(45, 5725276);
/* 53 */   public static final bzb V = new bzb(46, 8014168);
/* 54 */   public static final bzb W = new bzb(47, 4996700);
/* 55 */   public static final bzb X = new bzb(48, 4993571);
/* 56 */   public static final bzb Y = new bzb(49, 5001770);
/* 57 */   public static final bzb Z = new bzb(50, 9321518);
/* 58 */   public static final bzb aa = new bzb(51, 2430480);
/*    */   
/*    */   public final int ab;
/*    */   public final int ac;
/*    */   
/*    */   private bzb(int ☃, int i) {
/* 64 */     if (☃ < 0 || ☃ > 63) {
/* 65 */       throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
/*    */     }
/* 67 */     this.ac = ☃;
/* 68 */     this.ab = i;
/* 69 */     a[☃] = this;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\bzb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */