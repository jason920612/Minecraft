/*   */ package com.mojang.datafixers.kinds;
/*   */ 
/*   */ public interface Kind1<F extends K1, Mu extends Kind1.Mu>
/*   */   extends App<Mu, F>
/*   */ {
/*   */   static <F extends K1, Proof extends Mu> Kind1<F, Proof> unbox(App<Proof, F> proofBox) {
/* 7 */     return (Kind1<F, Proof>)proofBox;
/*   */   }
/*   */   
/*   */   public static interface Mu extends K1 {}
/*   */ }


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\kinds\Kind1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */