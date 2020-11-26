/*      */ package it.unimi.dsi.fastutil.chars;
/*      */ 
/*      */ import it.unimi.dsi.fastutil.objects.AbstractObjectSortedSet;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectSet;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectSortedSet;
/*      */ import it.unimi.dsi.fastutil.shorts.AbstractShortCollection;
/*      */ import it.unimi.dsi.fastutil.shorts.ShortCollection;
/*      */ import it.unimi.dsi.fastutil.shorts.ShortIterator;
/*      */ import it.unimi.dsi.fastutil.shorts.ShortListIterator;
/*      */ import java.io.IOException;
/*      */ import java.io.ObjectInputStream;
/*      */ import java.io.ObjectOutputStream;
/*      */ import java.io.Serializable;
/*      */ import java.util.Collection;
/*      */ import java.util.Comparator;
/*      */ import java.util.Iterator;
/*      */ import java.util.Map;
/*      */ import java.util.NoSuchElementException;
/*      */ import java.util.Set;
/*      */ import java.util.SortedMap;
/*      */ import java.util.SortedSet;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Char2ShortAVLTreeMap
/*      */   extends AbstractChar2ShortSortedMap
/*      */   implements Serializable, Cloneable
/*      */ {
/*      */   protected transient Entry tree;
/*      */   protected int count;
/*      */   protected transient Entry firstEntry;
/*      */   protected transient Entry lastEntry;
/*      */   protected transient ObjectSortedSet<Char2ShortMap.Entry> entries;
/*      */   protected transient CharSortedSet keys;
/*      */   protected transient ShortCollection values;
/*      */   protected transient boolean modified;
/*      */   protected Comparator<? super Character> storedComparator;
/*      */   protected transient CharComparator actualComparator;
/*      */   private static final long serialVersionUID = -7046029254386353129L;
/*      */   private transient boolean[] dirPath;
/*      */   
/*      */   public Char2ShortAVLTreeMap() {
/*   70 */     allocatePaths();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   76 */     this.tree = null;
/*   77 */     this.count = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void setActualComparator() {
/*   89 */     this.actualComparator = CharComparators.asCharComparator(this.storedComparator);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2ShortAVLTreeMap(Comparator<? super Character> c) {
/*   98 */     this();
/*   99 */     this.storedComparator = c;
/*  100 */     setActualComparator();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2ShortAVLTreeMap(Map<? extends Character, ? extends Short> m) {
/*  109 */     this();
/*  110 */     putAll(m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2ShortAVLTreeMap(SortedMap<Character, Short> m) {
/*  120 */     this(m.comparator());
/*  121 */     putAll(m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2ShortAVLTreeMap(Char2ShortMap m) {
/*  130 */     this();
/*  131 */     putAll(m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2ShortAVLTreeMap(Char2ShortSortedMap m) {
/*  141 */     this(m.comparator());
/*  142 */     putAll(m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2ShortAVLTreeMap(char[] k, short[] v, Comparator<? super Character> c) {
/*  158 */     this(c);
/*  159 */     if (k.length != v.length) {
/*  160 */       throw new IllegalArgumentException("The key array and the value array have different lengths (" + k.length + " and " + v.length + ")");
/*      */     }
/*  162 */     for (int i = 0; i < k.length; i++) {
/*  163 */       put(k[i], v[i]);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2ShortAVLTreeMap(char[] k, short[] v) {
/*  176 */     this(k, v, (Comparator<? super Character>)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   final int compare(char k1, char k2) {
/*  204 */     return (this.actualComparator == null) ? Character.compare(k1, k2) : this.actualComparator.compare(k1, k2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   final Entry findKey(char k) {
/*  216 */     Entry e = this.tree;
/*      */     int cmp;
/*  218 */     while (e != null && (cmp = compare(k, e.key)) != 0)
/*  219 */       e = (cmp < 0) ? e.left() : e.right(); 
/*  220 */     return e;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   final Entry locateKey(char k) {
/*  232 */     Entry e = this.tree, last = this.tree;
/*  233 */     int cmp = 0;
/*  234 */     while (e != null && (cmp = compare(k, e.key)) != 0) {
/*  235 */       last = e;
/*  236 */       e = (cmp < 0) ? e.left() : e.right();
/*      */     } 
/*  238 */     return (cmp == 0) ? e : last;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void allocatePaths() {
/*  246 */     this.dirPath = new boolean[48];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public short addTo(char k, short incr) {
/*  265 */     Entry e = add(k);
/*  266 */     short oldValue = e.value;
/*  267 */     e.value = (short)(e.value + incr);
/*  268 */     return oldValue;
/*      */   }
/*      */   
/*      */   public short put(char k, short v) {
/*  272 */     Entry e = add(k);
/*  273 */     short oldValue = e.value;
/*  274 */     e.value = v;
/*  275 */     return oldValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Entry add(char k) {
/*  292 */     this.modified = false;
/*  293 */     Entry e = null;
/*  294 */     if (this.tree == null) {
/*  295 */       this.count++;
/*  296 */       e = this.tree = this.lastEntry = this.firstEntry = new Entry(k, this.defRetValue);
/*  297 */       this.modified = true;
/*      */     } else {
/*  299 */       Entry p = this.tree, q = null, y = this.tree, z = null, w = null;
/*  300 */       int i = 0; while (true) {
/*      */         int cmp;
/*  302 */         if ((cmp = compare(k, p.key)) == 0) {
/*  303 */           return p;
/*      */         }
/*  305 */         if (p.balance() != 0) {
/*  306 */           i = 0;
/*  307 */           z = q;
/*  308 */           y = p;
/*      */         } 
/*  310 */         this.dirPath[i++] = (cmp > 0); if ((cmp > 0)) {
/*  311 */           if (p.succ()) {
/*  312 */             this.count++;
/*  313 */             e = new Entry(k, this.defRetValue);
/*  314 */             this.modified = true;
/*  315 */             if (p.right == null)
/*  316 */               this.lastEntry = e; 
/*  317 */             e.left = p;
/*  318 */             e.right = p.right;
/*  319 */             p.right(e);
/*      */             break;
/*      */           } 
/*  322 */           q = p;
/*  323 */           p = p.right; continue;
/*      */         } 
/*  325 */         if (p.pred()) {
/*  326 */           this.count++;
/*  327 */           e = new Entry(k, this.defRetValue);
/*  328 */           this.modified = true;
/*  329 */           if (p.left == null)
/*  330 */             this.firstEntry = e; 
/*  331 */           e.right = p;
/*  332 */           e.left = p.left;
/*  333 */           p.left(e);
/*      */           break;
/*      */         } 
/*  336 */         q = p;
/*  337 */         p = p.left;
/*      */       } 
/*      */       
/*  340 */       p = y;
/*  341 */       i = 0;
/*  342 */       while (p != e) {
/*  343 */         if (this.dirPath[i]) {
/*  344 */           p.incBalance();
/*      */         } else {
/*  346 */           p.decBalance();
/*  347 */         }  p = this.dirPath[i++] ? p.right : p.left;
/*      */       } 
/*  349 */       if (y.balance() == -2) {
/*  350 */         Entry x = y.left;
/*  351 */         if (x.balance() == -1) {
/*  352 */           w = x;
/*  353 */           if (x.succ()) {
/*  354 */             x.succ(false);
/*  355 */             y.pred(x);
/*      */           } else {
/*  357 */             y.left = x.right;
/*  358 */           }  x.right = y;
/*  359 */           x.balance(0);
/*  360 */           y.balance(0);
/*      */         } else {
/*  362 */           assert x.balance() == 1;
/*  363 */           w = x.right;
/*  364 */           x.right = w.left;
/*  365 */           w.left = x;
/*  366 */           y.left = w.right;
/*  367 */           w.right = y;
/*  368 */           if (w.balance() == -1) {
/*  369 */             x.balance(0);
/*  370 */             y.balance(1);
/*  371 */           } else if (w.balance() == 0) {
/*  372 */             x.balance(0);
/*  373 */             y.balance(0);
/*      */           } else {
/*  375 */             x.balance(-1);
/*  376 */             y.balance(0);
/*      */           } 
/*  378 */           w.balance(0);
/*  379 */           if (w.pred()) {
/*  380 */             x.succ(w);
/*  381 */             w.pred(false);
/*      */           } 
/*  383 */           if (w.succ()) {
/*  384 */             y.pred(w);
/*  385 */             w.succ(false);
/*      */           } 
/*      */         } 
/*  388 */       } else if (y.balance() == 2) {
/*  389 */         Entry x = y.right;
/*  390 */         if (x.balance() == 1) {
/*  391 */           w = x;
/*  392 */           if (x.pred()) {
/*  393 */             x.pred(false);
/*  394 */             y.succ(x);
/*      */           } else {
/*  396 */             y.right = x.left;
/*  397 */           }  x.left = y;
/*  398 */           x.balance(0);
/*  399 */           y.balance(0);
/*      */         } else {
/*  401 */           assert x.balance() == -1;
/*  402 */           w = x.left;
/*  403 */           x.left = w.right;
/*  404 */           w.right = x;
/*  405 */           y.right = w.left;
/*  406 */           w.left = y;
/*  407 */           if (w.balance() == 1) {
/*  408 */             x.balance(0);
/*  409 */             y.balance(-1);
/*  410 */           } else if (w.balance() == 0) {
/*  411 */             x.balance(0);
/*  412 */             y.balance(0);
/*      */           } else {
/*  414 */             x.balance(1);
/*  415 */             y.balance(0);
/*      */           } 
/*  417 */           w.balance(0);
/*  418 */           if (w.pred()) {
/*  419 */             y.succ(w);
/*  420 */             w.pred(false);
/*      */           } 
/*  422 */           if (w.succ()) {
/*  423 */             x.pred(w);
/*  424 */             w.succ(false);
/*      */           } 
/*      */         } 
/*      */       } else {
/*  428 */         return e;
/*  429 */       }  if (z == null) {
/*  430 */         this.tree = w;
/*      */       }
/*  432 */       else if (z.left == y) {
/*  433 */         z.left = w;
/*      */       } else {
/*  435 */         z.right = w;
/*      */       } 
/*      */     } 
/*  438 */     return e;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Entry parent(Entry e) {
/*  448 */     if (e == this.tree) {
/*  449 */       return null;
/*      */     }
/*  451 */     Entry y = e, x = y;
/*      */     while (true) {
/*  453 */       if (y.succ()) {
/*  454 */         Entry p = y.right;
/*  455 */         if (p == null || p.left != e) {
/*  456 */           while (!x.pred())
/*  457 */             x = x.left; 
/*  458 */           p = x.left;
/*      */         } 
/*  460 */         return p;
/*  461 */       }  if (x.pred()) {
/*  462 */         Entry p = x.left;
/*  463 */         if (p == null || p.right != e) {
/*  464 */           while (!y.succ())
/*  465 */             y = y.right; 
/*  466 */           p = y.right;
/*      */         } 
/*  468 */         return p;
/*      */       } 
/*  470 */       x = x.left;
/*  471 */       y = y.right;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public short remove(char k) {
/*  481 */     this.modified = false;
/*  482 */     if (this.tree == null) {
/*  483 */       return this.defRetValue;
/*      */     }
/*  485 */     Entry p = this.tree, q = null;
/*  486 */     boolean dir = false;
/*  487 */     char kk = k;
/*      */     int cmp;
/*  489 */     while ((cmp = compare(kk, p.key)) != 0) {
/*      */       
/*  491 */       if (dir = (cmp > 0)) {
/*  492 */         q = p;
/*  493 */         if ((p = p.right()) == null)
/*  494 */           return this.defRetValue;  continue;
/*      */       } 
/*  496 */       q = p;
/*  497 */       if ((p = p.left()) == null) {
/*  498 */         return this.defRetValue;
/*      */       }
/*      */     } 
/*  501 */     if (p.left == null)
/*  502 */       this.firstEntry = p.next(); 
/*  503 */     if (p.right == null)
/*  504 */       this.lastEntry = p.prev(); 
/*  505 */     if (p.succ())
/*  506 */     { if (p.pred())
/*  507 */       { if (q != null)
/*  508 */         { if (dir) {
/*  509 */             q.succ(p.right);
/*      */           } else {
/*  511 */             q.pred(p.left);
/*      */           }  }
/*  513 */         else { this.tree = dir ? p.right : p.left; }
/*      */          }
/*  515 */       else { (p.prev()).right = p.right;
/*  516 */         if (q != null)
/*  517 */         { if (dir) {
/*  518 */             q.right = p.left;
/*      */           } else {
/*  520 */             q.left = p.left;
/*      */           }  }
/*  522 */         else { this.tree = p.left; }
/*      */          }
/*      */        }
/*  525 */     else { Entry r = p.right;
/*  526 */       if (r.pred()) {
/*  527 */         r.left = p.left;
/*  528 */         r.pred(p.pred());
/*  529 */         if (!r.pred())
/*  530 */           (r.prev()).right = r; 
/*  531 */         if (q != null)
/*  532 */         { if (dir) {
/*  533 */             q.right = r;
/*      */           } else {
/*  535 */             q.left = r;
/*      */           }  }
/*  537 */         else { this.tree = r; }
/*  538 */          r.balance(p.balance());
/*  539 */         q = r;
/*  540 */         dir = true;
/*      */       } else {
/*      */         Entry s;
/*      */         while (true) {
/*  544 */           s = r.left;
/*  545 */           if (s.pred())
/*      */             break; 
/*  547 */           r = s;
/*      */         } 
/*  549 */         if (s.succ()) {
/*  550 */           r.pred(s);
/*      */         } else {
/*  552 */           r.left = s.right;
/*  553 */         }  s.left = p.left;
/*  554 */         if (!p.pred()) {
/*  555 */           (p.prev()).right = s;
/*  556 */           s.pred(false);
/*      */         } 
/*  558 */         s.right = p.right;
/*  559 */         s.succ(false);
/*  560 */         if (q != null)
/*  561 */         { if (dir) {
/*  562 */             q.right = s;
/*      */           } else {
/*  564 */             q.left = s;
/*      */           }  }
/*  566 */         else { this.tree = s; }
/*  567 */          s.balance(p.balance());
/*  568 */         q = r;
/*  569 */         dir = false;
/*      */       }  }
/*      */ 
/*      */     
/*  573 */     while (q != null) {
/*  574 */       Entry y = q;
/*  575 */       q = parent(y);
/*  576 */       if (!dir) {
/*  577 */         dir = (q != null && q.left != y);
/*  578 */         y.incBalance();
/*  579 */         if (y.balance() == 1)
/*      */           break; 
/*  581 */         if (y.balance() == 2) {
/*  582 */           Entry x = y.right;
/*  583 */           assert x != null;
/*  584 */           if (x.balance() == -1) {
/*      */             
/*  586 */             assert x.balance() == -1;
/*  587 */             Entry w = x.left;
/*  588 */             x.left = w.right;
/*  589 */             w.right = x;
/*  590 */             y.right = w.left;
/*  591 */             w.left = y;
/*  592 */             if (w.balance() == 1) {
/*  593 */               x.balance(0);
/*  594 */               y.balance(-1);
/*  595 */             } else if (w.balance() == 0) {
/*  596 */               x.balance(0);
/*  597 */               y.balance(0);
/*      */             } else {
/*  599 */               assert w.balance() == -1;
/*  600 */               x.balance(1);
/*  601 */               y.balance(0);
/*      */             } 
/*  603 */             w.balance(0);
/*  604 */             if (w.pred()) {
/*  605 */               y.succ(w);
/*  606 */               w.pred(false);
/*      */             } 
/*  608 */             if (w.succ()) {
/*  609 */               x.pred(w);
/*  610 */               w.succ(false);
/*      */             } 
/*  612 */             if (q != null) {
/*  613 */               if (dir) {
/*  614 */                 q.right = w; continue;
/*      */               } 
/*  616 */               q.left = w; continue;
/*      */             } 
/*  618 */             this.tree = w; continue;
/*      */           } 
/*  620 */           if (q != null)
/*  621 */           { if (dir) {
/*  622 */               q.right = x;
/*      */             } else {
/*  624 */               q.left = x;
/*      */             }  }
/*  626 */           else { this.tree = x; }
/*  627 */            if (x.balance() == 0) {
/*  628 */             y.right = x.left;
/*  629 */             x.left = y;
/*  630 */             x.balance(-1);
/*  631 */             y.balance(1);
/*      */             break;
/*      */           } 
/*  634 */           assert x.balance() == 1;
/*  635 */           if (x.pred()) {
/*  636 */             y.succ(true);
/*  637 */             x.pred(false);
/*      */           } else {
/*  639 */             y.right = x.left;
/*  640 */           }  x.left = y;
/*  641 */           y.balance(0);
/*  642 */           x.balance(0);
/*      */         } 
/*      */         continue;
/*      */       } 
/*  646 */       dir = (q != null && q.left != y);
/*  647 */       y.decBalance();
/*  648 */       if (y.balance() == -1)
/*      */         break; 
/*  650 */       if (y.balance() == -2) {
/*  651 */         Entry x = y.left;
/*  652 */         assert x != null;
/*  653 */         if (x.balance() == 1) {
/*      */           
/*  655 */           assert x.balance() == 1;
/*  656 */           Entry w = x.right;
/*  657 */           x.right = w.left;
/*  658 */           w.left = x;
/*  659 */           y.left = w.right;
/*  660 */           w.right = y;
/*  661 */           if (w.balance() == -1) {
/*  662 */             x.balance(0);
/*  663 */             y.balance(1);
/*  664 */           } else if (w.balance() == 0) {
/*  665 */             x.balance(0);
/*  666 */             y.balance(0);
/*      */           } else {
/*  668 */             assert w.balance() == 1;
/*  669 */             x.balance(-1);
/*  670 */             y.balance(0);
/*      */           } 
/*  672 */           w.balance(0);
/*  673 */           if (w.pred()) {
/*  674 */             x.succ(w);
/*  675 */             w.pred(false);
/*      */           } 
/*  677 */           if (w.succ()) {
/*  678 */             y.pred(w);
/*  679 */             w.succ(false);
/*      */           } 
/*  681 */           if (q != null) {
/*  682 */             if (dir) {
/*  683 */               q.right = w; continue;
/*      */             } 
/*  685 */             q.left = w; continue;
/*      */           } 
/*  687 */           this.tree = w; continue;
/*      */         } 
/*  689 */         if (q != null)
/*  690 */         { if (dir) {
/*  691 */             q.right = x;
/*      */           } else {
/*  693 */             q.left = x;
/*      */           }  }
/*  695 */         else { this.tree = x; }
/*  696 */          if (x.balance() == 0) {
/*  697 */           y.left = x.right;
/*  698 */           x.right = y;
/*  699 */           x.balance(1);
/*  700 */           y.balance(-1);
/*      */           break;
/*      */         } 
/*  703 */         assert x.balance() == -1;
/*  704 */         if (x.succ()) {
/*  705 */           y.pred(true);
/*  706 */           x.succ(false);
/*      */         } else {
/*  708 */           y.left = x.right;
/*  709 */         }  x.right = y;
/*  710 */         y.balance(0);
/*  711 */         x.balance(0);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  716 */     this.modified = true;
/*  717 */     this.count--;
/*  718 */     return p.value;
/*      */   }
/*      */   
/*      */   public boolean containsValue(short v) {
/*  722 */     ValueIterator i = new ValueIterator();
/*      */     
/*  724 */     int j = this.count;
/*  725 */     while (j-- != 0) {
/*  726 */       short ev = i.nextShort();
/*  727 */       if (ev == v)
/*  728 */         return true; 
/*      */     } 
/*  730 */     return false;
/*      */   }
/*      */   
/*      */   public void clear() {
/*  734 */     this.count = 0;
/*  735 */     this.tree = null;
/*  736 */     this.entries = null;
/*  737 */     this.values = null;
/*  738 */     this.keys = null;
/*  739 */     this.firstEntry = this.lastEntry = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final class Entry
/*      */     extends AbstractChar2ShortMap.BasicEntry
/*      */     implements Cloneable
/*      */   {
/*      */     private static final int SUCC_MASK = -2147483648;
/*      */ 
/*      */ 
/*      */     
/*      */     private static final int PRED_MASK = 1073741824;
/*      */ 
/*      */     
/*      */     private static final int BALANCE_MASK = 255;
/*      */ 
/*      */     
/*      */     Entry left;
/*      */ 
/*      */     
/*      */     Entry right;
/*      */ 
/*      */     
/*      */     int info;
/*      */ 
/*      */ 
/*      */     
/*      */     Entry() {
/*  770 */       super(false, (short)0);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Entry(char k, short v) {
/*  781 */       super(k, v);
/*  782 */       this.info = -1073741824;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Entry left() {
/*  790 */       return ((this.info & 0x40000000) != 0) ? null : this.left;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Entry right() {
/*  798 */       return ((this.info & Integer.MIN_VALUE) != 0) ? null : this.right;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     boolean pred() {
/*  806 */       return ((this.info & 0x40000000) != 0);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     boolean succ() {
/*  814 */       return ((this.info & Integer.MIN_VALUE) != 0);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void pred(boolean pred) {
/*  823 */       if (pred) {
/*  824 */         this.info |= 0x40000000;
/*      */       } else {
/*  826 */         this.info &= 0xBFFFFFFF;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void succ(boolean succ) {
/*  835 */       if (succ) {
/*  836 */         this.info |= Integer.MIN_VALUE;
/*      */       } else {
/*  838 */         this.info &= Integer.MAX_VALUE;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void pred(Entry pred) {
/*  847 */       this.info |= 0x40000000;
/*  848 */       this.left = pred;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void succ(Entry succ) {
/*  857 */       this.info |= Integer.MIN_VALUE;
/*  858 */       this.right = succ;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void left(Entry left) {
/*  867 */       this.info &= 0xBFFFFFFF;
/*  868 */       this.left = left;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void right(Entry right) {
/*  877 */       this.info &= Integer.MAX_VALUE;
/*  878 */       this.right = right;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int balance() {
/*  886 */       return (byte)this.info;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void balance(int level) {
/*  895 */       this.info &= 0xFFFFFF00;
/*  896 */       this.info |= level & 0xFF;
/*      */     }
/*      */     
/*      */     void incBalance() {
/*  900 */       this.info = this.info & 0xFFFFFF00 | (byte)this.info + 1 & 0xFF;
/*      */     }
/*      */     
/*      */     protected void decBalance() {
/*  904 */       this.info = this.info & 0xFFFFFF00 | (byte)this.info - 1 & 0xFF;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Entry next() {
/*  912 */       Entry next = this.right;
/*  913 */       if ((this.info & Integer.MIN_VALUE) == 0)
/*  914 */         while ((next.info & 0x40000000) == 0)
/*  915 */           next = next.left;  
/*  916 */       return next;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Entry prev() {
/*  924 */       Entry prev = this.left;
/*  925 */       if ((this.info & 0x40000000) == 0)
/*  926 */         while ((prev.info & Integer.MIN_VALUE) == 0)
/*  927 */           prev = prev.right;  
/*  928 */       return prev;
/*      */     }
/*      */     
/*      */     public short setValue(short value) {
/*  932 */       short oldValue = this.value;
/*  933 */       this.value = value;
/*  934 */       return oldValue;
/*      */     }
/*      */ 
/*      */     
/*      */     public Entry clone() {
/*      */       Entry c;
/*      */       try {
/*  941 */         c = (Entry)super.clone();
/*  942 */       } catch (CloneNotSupportedException cantHappen) {
/*  943 */         throw new InternalError();
/*      */       } 
/*  945 */       c.key = this.key;
/*  946 */       c.value = this.value;
/*  947 */       c.info = this.info;
/*  948 */       return c;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object o) {
/*  953 */       if (!(o instanceof Map.Entry))
/*  954 */         return false; 
/*  955 */       Map.Entry<Character, Short> e = (Map.Entry<Character, Short>)o;
/*  956 */       return (this.key == ((Character)e.getKey()).charValue() && this.value == ((Short)e.getValue()).shortValue());
/*      */     }
/*      */     
/*      */     public int hashCode() {
/*  960 */       return this.key ^ this.value;
/*      */     }
/*      */     
/*      */     public String toString() {
/*  964 */       return this.key + "=>" + this.value;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean containsKey(char k) {
/*  985 */     return (findKey(k) != null);
/*      */   }
/*      */   
/*      */   public int size() {
/*  989 */     return this.count;
/*      */   }
/*      */   
/*      */   public boolean isEmpty() {
/*  993 */     return (this.count == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public short get(char k) {
/*  998 */     Entry e = findKey(k);
/*  999 */     return (e == null) ? this.defRetValue : e.value;
/*      */   }
/*      */   
/*      */   public char firstCharKey() {
/* 1003 */     if (this.tree == null)
/* 1004 */       throw new NoSuchElementException(); 
/* 1005 */     return this.firstEntry.key;
/*      */   }
/*      */   
/*      */   public char lastCharKey() {
/* 1009 */     if (this.tree == null)
/* 1010 */       throw new NoSuchElementException(); 
/* 1011 */     return this.lastEntry.key;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class TreeIterator
/*      */   {
/*      */     Char2ShortAVLTreeMap.Entry prev;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Char2ShortAVLTreeMap.Entry next;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Char2ShortAVLTreeMap.Entry curr;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1042 */     int index = 0;
/*      */     TreeIterator() {
/* 1044 */       this.next = Char2ShortAVLTreeMap.this.firstEntry;
/*      */     }
/*      */     TreeIterator(char k) {
/* 1047 */       if ((this.next = Char2ShortAVLTreeMap.this.locateKey(k)) != null)
/* 1048 */         if (Char2ShortAVLTreeMap.this.compare(this.next.key, k) <= 0) {
/* 1049 */           this.prev = this.next;
/* 1050 */           this.next = this.next.next();
/*      */         } else {
/* 1052 */           this.prev = this.next.prev();
/*      */         }  
/*      */     }
/*      */     public boolean hasNext() {
/* 1056 */       return (this.next != null);
/*      */     }
/*      */     public boolean hasPrevious() {
/* 1059 */       return (this.prev != null);
/*      */     }
/*      */     void updateNext() {
/* 1062 */       this.next = this.next.next();
/*      */     }
/*      */     Char2ShortAVLTreeMap.Entry nextEntry() {
/* 1065 */       if (!hasNext())
/* 1066 */         throw new NoSuchElementException(); 
/* 1067 */       this.curr = this.prev = this.next;
/* 1068 */       this.index++;
/* 1069 */       updateNext();
/* 1070 */       return this.curr;
/*      */     }
/*      */     void updatePrevious() {
/* 1073 */       this.prev = this.prev.prev();
/*      */     }
/*      */     Char2ShortAVLTreeMap.Entry previousEntry() {
/* 1076 */       if (!hasPrevious())
/* 1077 */         throw new NoSuchElementException(); 
/* 1078 */       this.curr = this.next = this.prev;
/* 1079 */       this.index--;
/* 1080 */       updatePrevious();
/* 1081 */       return this.curr;
/*      */     }
/*      */     public int nextIndex() {
/* 1084 */       return this.index;
/*      */     }
/*      */     public int previousIndex() {
/* 1087 */       return this.index - 1;
/*      */     }
/*      */     public void remove() {
/* 1090 */       if (this.curr == null) {
/* 1091 */         throw new IllegalStateException();
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1096 */       if (this.curr == this.prev)
/* 1097 */         this.index--; 
/* 1098 */       this.next = this.prev = this.curr;
/* 1099 */       updatePrevious();
/* 1100 */       updateNext();
/* 1101 */       Char2ShortAVLTreeMap.this.remove(this.curr.key);
/* 1102 */       this.curr = null;
/*      */     }
/*      */     public int skip(int n) {
/* 1105 */       int i = n;
/* 1106 */       while (i-- != 0 && hasNext())
/* 1107 */         nextEntry(); 
/* 1108 */       return n - i - 1;
/*      */     }
/*      */     public int back(int n) {
/* 1111 */       int i = n;
/* 1112 */       while (i-- != 0 && hasPrevious())
/* 1113 */         previousEntry(); 
/* 1114 */       return n - i - 1;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private class EntryIterator
/*      */     extends TreeIterator
/*      */     implements ObjectListIterator<Char2ShortMap.Entry>
/*      */   {
/*      */     EntryIterator() {}
/*      */ 
/*      */     
/*      */     EntryIterator(char k) {
/* 1127 */       super(k);
/*      */     }
/*      */     
/*      */     public Char2ShortMap.Entry next() {
/* 1131 */       return nextEntry();
/*      */     }
/*      */     
/*      */     public Char2ShortMap.Entry previous() {
/* 1135 */       return previousEntry();
/*      */     }
/*      */     
/*      */     public void set(Char2ShortMap.Entry ok) {
/* 1139 */       throw new UnsupportedOperationException();
/*      */     }
/*      */     
/*      */     public void add(Char2ShortMap.Entry ok) {
/* 1143 */       throw new UnsupportedOperationException();
/*      */     }
/*      */   }
/*      */   
/*      */   public ObjectSortedSet<Char2ShortMap.Entry> char2ShortEntrySet() {
/* 1148 */     if (this.entries == null)
/* 1149 */       this.entries = (ObjectSortedSet<Char2ShortMap.Entry>)new AbstractObjectSortedSet<Char2ShortMap.Entry>()
/*      */         {
/*      */           final Comparator<? super Char2ShortMap.Entry> comparator;
/*      */           
/*      */           public Comparator<? super Char2ShortMap.Entry> comparator() {
/* 1154 */             return this.comparator;
/*      */           }
/*      */           
/*      */           public ObjectBidirectionalIterator<Char2ShortMap.Entry> iterator() {
/* 1158 */             return (ObjectBidirectionalIterator<Char2ShortMap.Entry>)new Char2ShortAVLTreeMap.EntryIterator();
/*      */           }
/*      */           
/*      */           public ObjectBidirectionalIterator<Char2ShortMap.Entry> iterator(Char2ShortMap.Entry from) {
/* 1162 */             return (ObjectBidirectionalIterator<Char2ShortMap.Entry>)new Char2ShortAVLTreeMap.EntryIterator(from.getCharKey());
/*      */           }
/*      */ 
/*      */           
/*      */           public boolean contains(Object o) {
/* 1167 */             if (!(o instanceof Map.Entry))
/* 1168 */               return false; 
/* 1169 */             Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/* 1170 */             if (e.getKey() == null || !(e.getKey() instanceof Character))
/* 1171 */               return false; 
/* 1172 */             if (e.getValue() == null || !(e.getValue() instanceof Short))
/* 1173 */               return false; 
/* 1174 */             Char2ShortAVLTreeMap.Entry f = Char2ShortAVLTreeMap.this.findKey(((Character)e.getKey()).charValue());
/* 1175 */             return e.equals(f);
/*      */           }
/*      */ 
/*      */           
/*      */           public boolean remove(Object o) {
/* 1180 */             if (!(o instanceof Map.Entry))
/* 1181 */               return false; 
/* 1182 */             Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/* 1183 */             if (e.getKey() == null || !(e.getKey() instanceof Character))
/* 1184 */               return false; 
/* 1185 */             if (e.getValue() == null || !(e.getValue() instanceof Short))
/* 1186 */               return false; 
/* 1187 */             Char2ShortAVLTreeMap.Entry f = Char2ShortAVLTreeMap.this.findKey(((Character)e.getKey()).charValue());
/* 1188 */             if (f == null || f.getShortValue() != ((Short)e.getValue()).shortValue())
/* 1189 */               return false; 
/* 1190 */             Char2ShortAVLTreeMap.this.remove(f.key);
/* 1191 */             return true;
/*      */           }
/*      */           
/*      */           public int size() {
/* 1195 */             return Char2ShortAVLTreeMap.this.count;
/*      */           }
/*      */           
/*      */           public void clear() {
/* 1199 */             Char2ShortAVLTreeMap.this.clear();
/*      */           }
/*      */           
/*      */           public Char2ShortMap.Entry first() {
/* 1203 */             return Char2ShortAVLTreeMap.this.firstEntry;
/*      */           }
/*      */           
/*      */           public Char2ShortMap.Entry last() {
/* 1207 */             return Char2ShortAVLTreeMap.this.lastEntry;
/*      */           }
/*      */           
/*      */           public ObjectSortedSet<Char2ShortMap.Entry> subSet(Char2ShortMap.Entry from, Char2ShortMap.Entry to) {
/* 1211 */             return Char2ShortAVLTreeMap.this.subMap(from.getCharKey(), to.getCharKey()).char2ShortEntrySet();
/*      */           }
/*      */           
/*      */           public ObjectSortedSet<Char2ShortMap.Entry> headSet(Char2ShortMap.Entry to) {
/* 1215 */             return Char2ShortAVLTreeMap.this.headMap(to.getCharKey()).char2ShortEntrySet();
/*      */           }
/*      */           
/*      */           public ObjectSortedSet<Char2ShortMap.Entry> tailSet(Char2ShortMap.Entry from) {
/* 1219 */             return Char2ShortAVLTreeMap.this.tailMap(from.getCharKey()).char2ShortEntrySet();
/*      */           }
/*      */         }; 
/* 1222 */     return this.entries;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final class KeyIterator
/*      */     extends TreeIterator
/*      */     implements CharListIterator
/*      */   {
/*      */     public KeyIterator() {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public KeyIterator(char k) {
/* 1238 */       super(k);
/*      */     }
/*      */     
/*      */     public char nextChar() {
/* 1242 */       return (nextEntry()).key;
/*      */     }
/*      */     
/*      */     public char previousChar() {
/* 1246 */       return (previousEntry()).key;
/*      */     } }
/*      */   
/*      */   private class KeySet extends AbstractChar2ShortSortedMap.KeySet {
/*      */     private KeySet() {}
/*      */     
/*      */     public CharBidirectionalIterator iterator() {
/* 1253 */       return new Char2ShortAVLTreeMap.KeyIterator();
/*      */     }
/*      */     
/*      */     public CharBidirectionalIterator iterator(char from) {
/* 1257 */       return new Char2ShortAVLTreeMap.KeyIterator(from);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CharSortedSet keySet() {
/* 1272 */     if (this.keys == null)
/* 1273 */       this.keys = new KeySet(); 
/* 1274 */     return this.keys;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final class ValueIterator
/*      */     extends TreeIterator
/*      */     implements ShortListIterator
/*      */   {
/*      */     private ValueIterator() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public short nextShort() {
/* 1289 */       return (nextEntry()).value;
/*      */     }
/*      */     
/*      */     public short previousShort() {
/* 1293 */       return (previousEntry()).value;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ShortCollection values() {
/* 1308 */     if (this.values == null)
/* 1309 */       this.values = (ShortCollection)new AbstractShortCollection()
/*      */         {
/*      */           public ShortIterator iterator() {
/* 1312 */             return (ShortIterator)new Char2ShortAVLTreeMap.ValueIterator();
/*      */           }
/*      */           
/*      */           public boolean contains(short k) {
/* 1316 */             return Char2ShortAVLTreeMap.this.containsValue(k);
/*      */           }
/*      */           
/*      */           public int size() {
/* 1320 */             return Char2ShortAVLTreeMap.this.count;
/*      */           }
/*      */           
/*      */           public void clear() {
/* 1324 */             Char2ShortAVLTreeMap.this.clear();
/*      */           }
/*      */         }; 
/* 1327 */     return this.values;
/*      */   }
/*      */   
/*      */   public CharComparator comparator() {
/* 1331 */     return this.actualComparator;
/*      */   }
/*      */   
/*      */   public Char2ShortSortedMap headMap(char to) {
/* 1335 */     return new Submap(false, true, to, false);
/*      */   }
/*      */   
/*      */   public Char2ShortSortedMap tailMap(char from) {
/* 1339 */     return new Submap(from, false, false, true);
/*      */   }
/*      */   
/*      */   public Char2ShortSortedMap subMap(char from, char to) {
/* 1343 */     return new Submap(from, false, to, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final class Submap
/*      */     extends AbstractChar2ShortSortedMap
/*      */     implements Serializable
/*      */   {
/*      */     private static final long serialVersionUID = -7046029254386353129L;
/*      */ 
/*      */ 
/*      */     
/*      */     char from;
/*      */ 
/*      */ 
/*      */     
/*      */     char to;
/*      */ 
/*      */ 
/*      */     
/*      */     boolean bottom;
/*      */ 
/*      */ 
/*      */     
/*      */     boolean top;
/*      */ 
/*      */ 
/*      */     
/*      */     protected transient ObjectSortedSet<Char2ShortMap.Entry> entries;
/*      */ 
/*      */ 
/*      */     
/*      */     protected transient CharSortedSet keys;
/*      */ 
/*      */ 
/*      */     
/*      */     protected transient ShortCollection values;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Submap(char from, boolean bottom, char to, boolean top) {
/* 1387 */       if (!bottom && !top && Char2ShortAVLTreeMap.this.compare(from, to) > 0)
/* 1388 */         throw new IllegalArgumentException("Start key (" + from + ") is larger than end key (" + to + ")"); 
/* 1389 */       this.from = from;
/* 1390 */       this.bottom = bottom;
/* 1391 */       this.to = to;
/* 1392 */       this.top = top;
/* 1393 */       this.defRetValue = Char2ShortAVLTreeMap.this.defRetValue;
/*      */     }
/*      */     
/*      */     public void clear() {
/* 1397 */       SubmapIterator i = new SubmapIterator();
/* 1398 */       while (i.hasNext()) {
/* 1399 */         i.nextEntry();
/* 1400 */         i.remove();
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     final boolean in(char k) {
/* 1411 */       return ((this.bottom || Char2ShortAVLTreeMap.this.compare(k, this.from) >= 0) && (this.top || Char2ShortAVLTreeMap.this
/* 1412 */         .compare(k, this.to) < 0));
/*      */     }
/*      */     
/*      */     public ObjectSortedSet<Char2ShortMap.Entry> char2ShortEntrySet() {
/* 1416 */       if (this.entries == null)
/* 1417 */         this.entries = (ObjectSortedSet<Char2ShortMap.Entry>)new AbstractObjectSortedSet<Char2ShortMap.Entry>()
/*      */           {
/*      */             public ObjectBidirectionalIterator<Char2ShortMap.Entry> iterator() {
/* 1420 */               return (ObjectBidirectionalIterator<Char2ShortMap.Entry>)new Char2ShortAVLTreeMap.Submap.SubmapEntryIterator();
/*      */             }
/*      */             
/*      */             public ObjectBidirectionalIterator<Char2ShortMap.Entry> iterator(Char2ShortMap.Entry from) {
/* 1424 */               return (ObjectBidirectionalIterator<Char2ShortMap.Entry>)new Char2ShortAVLTreeMap.Submap.SubmapEntryIterator(from.getCharKey());
/*      */             }
/*      */             
/*      */             public Comparator<? super Char2ShortMap.Entry> comparator() {
/* 1428 */               return Char2ShortAVLTreeMap.this.char2ShortEntrySet().comparator();
/*      */             }
/*      */ 
/*      */             
/*      */             public boolean contains(Object o) {
/* 1433 */               if (!(o instanceof Map.Entry))
/* 1434 */                 return false; 
/* 1435 */               Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/* 1436 */               if (e.getKey() == null || !(e.getKey() instanceof Character))
/* 1437 */                 return false; 
/* 1438 */               if (e.getValue() == null || !(e.getValue() instanceof Short))
/* 1439 */                 return false; 
/* 1440 */               Char2ShortAVLTreeMap.Entry f = Char2ShortAVLTreeMap.this.findKey(((Character)e.getKey()).charValue());
/* 1441 */               return (f != null && Char2ShortAVLTreeMap.Submap.this.in(f.key) && e.equals(f));
/*      */             }
/*      */ 
/*      */             
/*      */             public boolean remove(Object o) {
/* 1446 */               if (!(o instanceof Map.Entry))
/* 1447 */                 return false; 
/* 1448 */               Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
/* 1449 */               if (e.getKey() == null || !(e.getKey() instanceof Character))
/* 1450 */                 return false; 
/* 1451 */               if (e.getValue() == null || !(e.getValue() instanceof Short))
/* 1452 */                 return false; 
/* 1453 */               Char2ShortAVLTreeMap.Entry f = Char2ShortAVLTreeMap.this.findKey(((Character)e.getKey()).charValue());
/* 1454 */               if (f != null && Char2ShortAVLTreeMap.Submap.this.in(f.key))
/* 1455 */                 Char2ShortAVLTreeMap.Submap.this.remove(f.key); 
/* 1456 */               return (f != null);
/*      */             }
/*      */             
/*      */             public int size() {
/* 1460 */               int c = 0;
/* 1461 */               for (ObjectBidirectionalIterator<Char2ShortMap.Entry> objectBidirectionalIterator = iterator(); objectBidirectionalIterator.hasNext(); objectBidirectionalIterator.next())
/* 1462 */                 c++; 
/* 1463 */               return c;
/*      */             }
/*      */             
/*      */             public boolean isEmpty() {
/* 1467 */               return !(new Char2ShortAVLTreeMap.Submap.SubmapIterator()).hasNext();
/*      */             }
/*      */             
/*      */             public void clear() {
/* 1471 */               Char2ShortAVLTreeMap.Submap.this.clear();
/*      */             }
/*      */             
/*      */             public Char2ShortMap.Entry first() {
/* 1475 */               return Char2ShortAVLTreeMap.Submap.this.firstEntry();
/*      */             }
/*      */             
/*      */             public Char2ShortMap.Entry last() {
/* 1479 */               return Char2ShortAVLTreeMap.Submap.this.lastEntry();
/*      */             }
/*      */ 
/*      */             
/*      */             public ObjectSortedSet<Char2ShortMap.Entry> subSet(Char2ShortMap.Entry from, Char2ShortMap.Entry to) {
/* 1484 */               return Char2ShortAVLTreeMap.Submap.this.subMap(from.getCharKey(), to.getCharKey()).char2ShortEntrySet();
/*      */             }
/*      */             
/*      */             public ObjectSortedSet<Char2ShortMap.Entry> headSet(Char2ShortMap.Entry to) {
/* 1488 */               return Char2ShortAVLTreeMap.Submap.this.headMap(to.getCharKey()).char2ShortEntrySet();
/*      */             }
/*      */             
/*      */             public ObjectSortedSet<Char2ShortMap.Entry> tailSet(Char2ShortMap.Entry from) {
/* 1492 */               return Char2ShortAVLTreeMap.Submap.this.tailMap(from.getCharKey()).char2ShortEntrySet();
/*      */             }
/*      */           }; 
/* 1495 */       return this.entries;
/*      */     }
/*      */     
/*      */     private class KeySet extends AbstractChar2ShortSortedMap.KeySet {
/*      */       public CharBidirectionalIterator iterator() {
/* 1500 */         return new Char2ShortAVLTreeMap.Submap.SubmapKeyIterator();
/*      */       }
/*      */       private KeySet() {}
/*      */       public CharBidirectionalIterator iterator(char from) {
/* 1504 */         return new Char2ShortAVLTreeMap.Submap.SubmapKeyIterator(from);
/*      */       }
/*      */     }
/*      */     
/*      */     public CharSortedSet keySet() {
/* 1509 */       if (this.keys == null)
/* 1510 */         this.keys = new KeySet(); 
/* 1511 */       return this.keys;
/*      */     }
/*      */     
/*      */     public ShortCollection values() {
/* 1515 */       if (this.values == null)
/* 1516 */         this.values = (ShortCollection)new AbstractShortCollection()
/*      */           {
/*      */             public ShortIterator iterator() {
/* 1519 */               return (ShortIterator)new Char2ShortAVLTreeMap.Submap.SubmapValueIterator();
/*      */             }
/*      */             
/*      */             public boolean contains(short k) {
/* 1523 */               return Char2ShortAVLTreeMap.Submap.this.containsValue(k);
/*      */             }
/*      */             
/*      */             public int size() {
/* 1527 */               return Char2ShortAVLTreeMap.Submap.this.size();
/*      */             }
/*      */             
/*      */             public void clear() {
/* 1531 */               Char2ShortAVLTreeMap.Submap.this.clear();
/*      */             }
/*      */           }; 
/* 1534 */       return this.values;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsKey(char k) {
/* 1539 */       return (in(k) && Char2ShortAVLTreeMap.this.containsKey(k));
/*      */     }
/*      */     
/*      */     public boolean containsValue(short v) {
/* 1543 */       SubmapIterator i = new SubmapIterator();
/*      */       
/* 1545 */       while (i.hasNext()) {
/* 1546 */         short ev = (i.nextEntry()).value;
/* 1547 */         if (ev == v)
/* 1548 */           return true; 
/*      */       } 
/* 1550 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public short get(char k) {
/* 1556 */       char kk = k; Char2ShortAVLTreeMap.Entry e;
/* 1557 */       return (in(kk) && (e = Char2ShortAVLTreeMap.this.findKey(kk)) != null) ? e.value : this.defRetValue;
/*      */     }
/*      */     
/*      */     public short put(char k, short v) {
/* 1561 */       Char2ShortAVLTreeMap.this.modified = false;
/* 1562 */       if (!in(k))
/* 1563 */         throw new IllegalArgumentException("Key (" + k + ") out of range [" + (
/* 1564 */             this.bottom ? "-" : String.valueOf(this.from)) + ", " + (this.top ? "-" : String.valueOf(this.to)) + ")"); 
/* 1565 */       short oldValue = Char2ShortAVLTreeMap.this.put(k, v);
/* 1566 */       return Char2ShortAVLTreeMap.this.modified ? this.defRetValue : oldValue;
/*      */     }
/*      */ 
/*      */     
/*      */     public short remove(char k) {
/* 1571 */       Char2ShortAVLTreeMap.this.modified = false;
/* 1572 */       if (!in(k))
/* 1573 */         return this.defRetValue; 
/* 1574 */       short oldValue = Char2ShortAVLTreeMap.this.remove(k);
/* 1575 */       return Char2ShortAVLTreeMap.this.modified ? oldValue : this.defRetValue;
/*      */     }
/*      */     
/*      */     public int size() {
/* 1579 */       SubmapIterator i = new SubmapIterator();
/* 1580 */       int n = 0;
/* 1581 */       while (i.hasNext()) {
/* 1582 */         n++;
/* 1583 */         i.nextEntry();
/*      */       } 
/* 1585 */       return n;
/*      */     }
/*      */     
/*      */     public boolean isEmpty() {
/* 1589 */       return !(new SubmapIterator()).hasNext();
/*      */     }
/*      */     
/*      */     public CharComparator comparator() {
/* 1593 */       return Char2ShortAVLTreeMap.this.actualComparator;
/*      */     }
/*      */     
/*      */     public Char2ShortSortedMap headMap(char to) {
/* 1597 */       if (this.top)
/* 1598 */         return new Submap(this.from, this.bottom, to, false); 
/* 1599 */       return (Char2ShortAVLTreeMap.this.compare(to, this.to) < 0) ? new Submap(this.from, this.bottom, to, false) : this;
/*      */     }
/*      */     
/*      */     public Char2ShortSortedMap tailMap(char from) {
/* 1603 */       if (this.bottom)
/* 1604 */         return new Submap(from, false, this.to, this.top); 
/* 1605 */       return (Char2ShortAVLTreeMap.this.compare(from, this.from) > 0) ? new Submap(from, false, this.to, this.top) : this;
/*      */     }
/*      */     
/*      */     public Char2ShortSortedMap subMap(char from, char to) {
/* 1609 */       if (this.top && this.bottom)
/* 1610 */         return new Submap(from, false, to, false); 
/* 1611 */       if (!this.top)
/* 1612 */         to = (Char2ShortAVLTreeMap.this.compare(to, this.to) < 0) ? to : this.to; 
/* 1613 */       if (!this.bottom)
/* 1614 */         from = (Char2ShortAVLTreeMap.this.compare(from, this.from) > 0) ? from : this.from; 
/* 1615 */       if (!this.top && !this.bottom && from == this.from && to == this.to)
/* 1616 */         return this; 
/* 1617 */       return new Submap(from, false, to, false);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Char2ShortAVLTreeMap.Entry firstEntry() {
/*      */       Char2ShortAVLTreeMap.Entry e;
/* 1626 */       if (Char2ShortAVLTreeMap.this.tree == null) {
/* 1627 */         return null;
/*      */       }
/*      */ 
/*      */       
/* 1631 */       if (this.bottom) {
/* 1632 */         e = Char2ShortAVLTreeMap.this.firstEntry;
/*      */       } else {
/* 1634 */         e = Char2ShortAVLTreeMap.this.locateKey(this.from);
/*      */         
/* 1636 */         if (Char2ShortAVLTreeMap.this.compare(e.key, this.from) < 0) {
/* 1637 */           e = e.next();
/*      */         }
/*      */       } 
/*      */       
/* 1641 */       if (e == null || (!this.top && Char2ShortAVLTreeMap.this.compare(e.key, this.to) >= 0))
/* 1642 */         return null; 
/* 1643 */       return e;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Char2ShortAVLTreeMap.Entry lastEntry() {
/*      */       Char2ShortAVLTreeMap.Entry e;
/* 1652 */       if (Char2ShortAVLTreeMap.this.tree == null) {
/* 1653 */         return null;
/*      */       }
/*      */ 
/*      */       
/* 1657 */       if (this.top) {
/* 1658 */         e = Char2ShortAVLTreeMap.this.lastEntry;
/*      */       } else {
/* 1660 */         e = Char2ShortAVLTreeMap.this.locateKey(this.to);
/*      */         
/* 1662 */         if (Char2ShortAVLTreeMap.this.compare(e.key, this.to) >= 0) {
/* 1663 */           e = e.prev();
/*      */         }
/*      */       } 
/*      */       
/* 1667 */       if (e == null || (!this.bottom && Char2ShortAVLTreeMap.this.compare(e.key, this.from) < 0))
/* 1668 */         return null; 
/* 1669 */       return e;
/*      */     }
/*      */     
/*      */     public char firstCharKey() {
/* 1673 */       Char2ShortAVLTreeMap.Entry e = firstEntry();
/* 1674 */       if (e == null)
/* 1675 */         throw new NoSuchElementException(); 
/* 1676 */       return e.key;
/*      */     }
/*      */     
/*      */     public char lastCharKey() {
/* 1680 */       Char2ShortAVLTreeMap.Entry e = lastEntry();
/* 1681 */       if (e == null)
/* 1682 */         throw new NoSuchElementException(); 
/* 1683 */       return e.key;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private class SubmapIterator
/*      */       extends Char2ShortAVLTreeMap.TreeIterator
/*      */     {
/*      */       SubmapIterator() {
/* 1696 */         this.next = Char2ShortAVLTreeMap.Submap.this.firstEntry();
/*      */       }
/*      */       SubmapIterator(char k) {
/* 1699 */         this();
/* 1700 */         if (this.next != null)
/* 1701 */           if (!Char2ShortAVLTreeMap.Submap.this.bottom && Char2ShortAVLTreeMap.this.compare(k, this.next.key) < 0) {
/* 1702 */             this.prev = null;
/* 1703 */           } else if (!Char2ShortAVLTreeMap.Submap.this.top && Char2ShortAVLTreeMap.this.compare(k, (this.prev = Char2ShortAVLTreeMap.Submap.this.lastEntry()).key) >= 0) {
/* 1704 */             this.next = null;
/*      */           } else {
/* 1706 */             this.next = Char2ShortAVLTreeMap.this.locateKey(k);
/* 1707 */             if (Char2ShortAVLTreeMap.this.compare(this.next.key, k) <= 0) {
/* 1708 */               this.prev = this.next;
/* 1709 */               this.next = this.next.next();
/*      */             } else {
/* 1711 */               this.prev = this.next.prev();
/*      */             } 
/*      */           }  
/*      */       }
/*      */       
/*      */       void updatePrevious() {
/* 1717 */         this.prev = this.prev.prev();
/* 1718 */         if (!Char2ShortAVLTreeMap.Submap.this.bottom && this.prev != null && Char2ShortAVLTreeMap.this.compare(this.prev.key, Char2ShortAVLTreeMap.Submap.this.from) < 0)
/* 1719 */           this.prev = null; 
/*      */       }
/*      */       
/*      */       void updateNext() {
/* 1723 */         this.next = this.next.next();
/* 1724 */         if (!Char2ShortAVLTreeMap.Submap.this.top && this.next != null && Char2ShortAVLTreeMap.this.compare(this.next.key, Char2ShortAVLTreeMap.Submap.this.to) >= 0)
/* 1725 */           this.next = null; 
/*      */       } }
/*      */     
/*      */     private class SubmapEntryIterator extends SubmapIterator implements ObjectListIterator<Char2ShortMap.Entry> {
/*      */       SubmapEntryIterator() {}
/*      */       
/*      */       SubmapEntryIterator(char k) {
/* 1732 */         super(k);
/*      */       }
/*      */       
/*      */       public Char2ShortMap.Entry next() {
/* 1736 */         return nextEntry();
/*      */       }
/*      */       
/*      */       public Char2ShortMap.Entry previous() {
/* 1740 */         return previousEntry();
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final class SubmapKeyIterator
/*      */       extends SubmapIterator
/*      */       implements CharListIterator
/*      */     {
/*      */       public SubmapKeyIterator() {}
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public SubmapKeyIterator(char from) {
/* 1758 */         super(from);
/*      */       }
/*      */       
/*      */       public char nextChar() {
/* 1762 */         return (nextEntry()).key;
/*      */       }
/*      */       
/*      */       public char previousChar() {
/* 1766 */         return (previousEntry()).key;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final class SubmapValueIterator
/*      */       extends SubmapIterator
/*      */       implements ShortListIterator
/*      */     {
/*      */       private SubmapValueIterator() {}
/*      */ 
/*      */ 
/*      */       
/*      */       public short nextShort() {
/* 1782 */         return (nextEntry()).value;
/*      */       }
/*      */       
/*      */       public short previousShort() {
/* 1786 */         return (previousEntry()).value;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Char2ShortAVLTreeMap clone() {
/*      */     Char2ShortAVLTreeMap c;
/*      */     try {
/* 1805 */       c = (Char2ShortAVLTreeMap)super.clone();
/* 1806 */     } catch (CloneNotSupportedException cantHappen) {
/* 1807 */       throw new InternalError();
/*      */     } 
/* 1809 */     c.keys = null;
/* 1810 */     c.values = null;
/* 1811 */     c.entries = null;
/* 1812 */     c.allocatePaths();
/* 1813 */     if (this.count != 0) {
/*      */       
/* 1815 */       Entry rp = new Entry(), rq = new Entry();
/* 1816 */       Entry p = rp;
/* 1817 */       rp.left(this.tree);
/* 1818 */       Entry q = rq;
/* 1819 */       rq.pred((Entry)null);
/*      */       while (true) {
/* 1821 */         if (!p.pred()) {
/* 1822 */           Entry e = p.left.clone();
/* 1823 */           e.pred(q.left);
/* 1824 */           e.succ(q);
/* 1825 */           q.left(e);
/* 1826 */           p = p.left;
/* 1827 */           q = q.left;
/*      */         } else {
/* 1829 */           while (p.succ()) {
/* 1830 */             p = p.right;
/* 1831 */             if (p == null) {
/* 1832 */               q.right = null;
/* 1833 */               c.tree = rq.left;
/* 1834 */               c.firstEntry = c.tree;
/* 1835 */               while (c.firstEntry.left != null)
/* 1836 */                 c.firstEntry = c.firstEntry.left; 
/* 1837 */               c.lastEntry = c.tree;
/* 1838 */               while (c.lastEntry.right != null)
/* 1839 */                 c.lastEntry = c.lastEntry.right; 
/* 1840 */               return c;
/*      */             } 
/* 1842 */             q = q.right;
/*      */           } 
/* 1844 */           p = p.right;
/* 1845 */           q = q.right;
/*      */         } 
/* 1847 */         if (!p.succ()) {
/* 1848 */           Entry e = p.right.clone();
/* 1849 */           e.succ(q.right);
/* 1850 */           e.pred(q);
/* 1851 */           q.right(e);
/*      */         } 
/*      */       } 
/*      */     } 
/* 1855 */     return c;
/*      */   }
/*      */   private void writeObject(ObjectOutputStream s) throws IOException {
/* 1858 */     int n = this.count;
/* 1859 */     EntryIterator i = new EntryIterator();
/*      */     
/* 1861 */     s.defaultWriteObject();
/* 1862 */     while (n-- != 0) {
/* 1863 */       Entry e = i.nextEntry();
/* 1864 */       s.writeChar(e.key);
/* 1865 */       s.writeShort(e.value);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Entry readTree(ObjectInputStream s, int n, Entry pred, Entry succ) throws IOException, ClassNotFoundException {
/* 1886 */     if (n == 1) {
/* 1887 */       Entry entry = new Entry(s.readChar(), s.readShort());
/* 1888 */       entry.pred(pred);
/* 1889 */       entry.succ(succ);
/* 1890 */       return entry;
/*      */     } 
/* 1892 */     if (n == 2) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1897 */       Entry entry = new Entry(s.readChar(), s.readShort());
/* 1898 */       entry.right(new Entry(s.readChar(), s.readShort()));
/* 1899 */       entry.right.pred(entry);
/* 1900 */       entry.balance(1);
/* 1901 */       entry.pred(pred);
/* 1902 */       entry.right.succ(succ);
/* 1903 */       return entry;
/*      */     } 
/*      */     
/* 1906 */     int rightN = n / 2, leftN = n - rightN - 1;
/* 1907 */     Entry top = new Entry();
/* 1908 */     top.left(readTree(s, leftN, pred, top));
/* 1909 */     top.key = s.readChar();
/* 1910 */     top.value = s.readShort();
/* 1911 */     top.right(readTree(s, rightN, top, succ));
/* 1912 */     if (n == (n & -n))
/* 1913 */       top.balance(1); 
/* 1914 */     return top;
/*      */   }
/*      */   private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
/* 1917 */     s.defaultReadObject();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1922 */     setActualComparator();
/* 1923 */     allocatePaths();
/* 1924 */     if (this.count != 0) {
/* 1925 */       this.tree = readTree(s, this.count, (Entry)null, (Entry)null);
/*      */       
/* 1927 */       Entry e = this.tree;
/* 1928 */       while (e.left() != null)
/* 1929 */         e = e.left(); 
/* 1930 */       this.firstEntry = e;
/* 1931 */       e = this.tree;
/* 1932 */       while (e.right() != null)
/* 1933 */         e = e.right(); 
/* 1934 */       this.lastEntry = e;
/*      */     } 
/*      */   }
/*      */ }


/* Location:              F:\dw\server.jar!\i\\unimi\dsi\fastutil\chars\Char2ShortAVLTreeMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */