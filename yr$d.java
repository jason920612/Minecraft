/*     */ import com.mojang.datafixers.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Stream;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class d
/*     */ {
/*     */   private int a;
/* 475 */   private final yr.c[] b = new yr.c[16];
/*     */   
/*     */   private final Dynamic<?> c;
/*     */   private final int d;
/*     */   private final int e;
/* 480 */   private final Int2ObjectMap<Dynamic<?>> f = (Int2ObjectMap<Dynamic<?>>)new Int2ObjectLinkedOpenHashMap(16);
/*     */   
/*     */   public d(Dynamic<?> ☃) {
/* 483 */     this.c = ☃;
/* 484 */     this.d = ☃.getInt("xPos") << 4;
/* 485 */     this.e = ☃.getInt("zPos") << 4;
/*     */     
/* 487 */     ☃.get("TileEntities").flatMap(Dynamic::getStream).ifPresent(☃ -> ☃.forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 500 */     boolean bool = ☃.getBoolean("convertedFromAlphaFormat");
/*     */     
/* 502 */     ☃.get("Sections").flatMap(Dynamic::getStream).ifPresent(☃ -> ☃.forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 510 */     for (yr.c c1 : this.b) {
/* 511 */       if (c1 != null)
/*     */       {
/*     */ 
/*     */         
/* 515 */         for (ObjectIterator<Map.Entry<Integer, IntList>> objectIterator = yr.c.a(c1).entrySet().iterator(); objectIterator.hasNext(); ) { IntListIterator<Integer> intListIterator; Map.Entry<Integer, IntList> entry = objectIterator.next();
/* 516 */           int i = c1.a << 12;
/* 517 */           switch (((Integer)entry.getKey()).intValue()) {
/*     */             case 2:
/* 519 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 520 */                 j |= i;
/*     */                 
/* 522 */                 Dynamic<?> dynamic = a(j);
/* 523 */                 if ("minecraft:grass_block".equals(yr.a(dynamic))) {
/* 524 */                   String str = yr.a(a(a(j, yr.b.b)));
/* 525 */                   if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 526 */                     a(j, yr.d());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 3:
/* 533 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 534 */                 j |= i;
/*     */                 
/* 536 */                 Dynamic<?> dynamic = a(j);
/* 537 */                 if ("minecraft:podzol".equals(yr.a(dynamic))) {
/* 538 */                   String str = yr.a(a(a(j, yr.b.b)));
/* 539 */                   if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 540 */                     a(j, yr.e());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 110:
/* 547 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 548 */                 j |= i;
/*     */                 
/* 550 */                 Dynamic<?> dynamic = a(j);
/* 551 */                 if ("minecraft:mycelium".equals(yr.a(dynamic))) {
/* 552 */                   String str = yr.a(a(a(j, yr.b.b)));
/* 553 */                   if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 554 */                     a(j, yr.f());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 25:
/* 561 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 562 */                 j |= i;
/* 563 */                 Dynamic<?> dynamic = c(j);
/* 564 */                 if (dynamic != null) {
/* 565 */                   String str = Boolean.toString(dynamic.getBoolean("powered")) + (byte)Math.min(Math.max(dynamic.getByte("note"), 0), 24);
/* 566 */                   a(j, (Dynamic)yr.g().getOrDefault(str, yr.g().get("false0")));
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 26:
/* 572 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 573 */                 j |= i;
/* 574 */                 Dynamic<?> dynamic1 = b(j);
/* 575 */                 Dynamic<?> dynamic2 = a(j);
/* 576 */                 if (dynamic1 != null) {
/* 577 */                   int k = dynamic1.getInt("color");
/* 578 */                   if (k != 14 && k >= 0 && k < 16) {
/* 579 */                     String str = yr.a(dynamic2, "facing") + yr.a(dynamic2, "occupied") + yr.a(dynamic2, "part") + k;
/* 580 */                     if (yr.h().containsKey(str)) {
/* 581 */                       a(j, (Dynamic)yr.h().get(str));
/*     */                     }
/*     */                   } 
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 176:
/*     */             case 177:
/* 590 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 591 */                 j |= i;
/* 592 */                 Dynamic<?> dynamic1 = b(j);
/* 593 */                 Dynamic<?> dynamic2 = a(j);
/* 594 */                 if (dynamic1 != null) {
/* 595 */                   int k = dynamic1.getInt("Base");
/* 596 */                   if (k != 15 && k >= 0 && k < 16) {
/* 597 */                     String str = yr.a(dynamic2, (((Integer)entry.getKey()).intValue() == 176) ? "rotation" : "facing") + "_" + k;
/* 598 */                     if (yr.i().containsKey(str)) {
/* 599 */                       a(j, (Dynamic)yr.i().get(str));
/*     */                     }
/*     */                   } 
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 86:
/* 607 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 608 */                 j |= i;
/*     */                 
/* 610 */                 Dynamic<?> dynamic = a(j);
/* 611 */                 if ("minecraft:carved_pumpkin".equals(yr.a(dynamic))) {
/* 612 */                   String str = yr.a(a(a(j, yr.b.a)));
/* 613 */                   if ("minecraft:grass_block".equals(str) || "minecraft:dirt".equals(str)) {
/* 614 */                     a(j, yr.j());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 140:
/* 621 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 622 */                 j |= i;
/* 623 */                 Dynamic<?> dynamic = c(j);
/* 624 */                 if (dynamic != null) {
/* 625 */                   String str = dynamic.getString("Item") + dynamic.getInt("Data");
/* 626 */                   a(j, (Dynamic)yr.k().getOrDefault(str, yr.k().get("minecraft:air0")));
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 144:
/* 632 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 633 */                 j |= i;
/* 634 */                 Dynamic<?> dynamic = b(j);
/* 635 */                 if (dynamic != null) {
/* 636 */                   String str3, str1 = String.valueOf(dynamic.getByte("SkullType"));
/* 637 */                   String str2 = yr.a(a(j), "facing");
/*     */                   
/* 639 */                   if ("up".equals(str2) || "down".equals(str2)) {
/* 640 */                     str3 = str1 + String.valueOf(dynamic.getInt("Rot"));
/*     */                   } else {
/* 642 */                     str3 = str1 + str2;
/*     */                   } 
/*     */                   
/* 645 */                   dynamic.remove("SkullType");
/* 646 */                   dynamic.remove("facing");
/* 647 */                   dynamic.remove("Rot");
/*     */                   
/* 649 */                   a(j, (Dynamic)yr.l().getOrDefault(str3, yr.l().get("0north")));
/*     */                 }  }
/*     */             
/*     */             
/*     */             case 64:
/*     */             case 71:
/*     */             case 193:
/*     */             case 194:
/*     */             case 195:
/*     */             case 196:
/*     */             case 197:
/* 660 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 661 */                 j |= i;
/*     */                 
/* 663 */                 Dynamic<?> dynamic = a(j);
/* 664 */                 if (yr.a(dynamic).endsWith("_door")) {
/* 665 */                   Dynamic<?> dynamic1 = a(j);
/* 666 */                   if ("lower".equals(yr.a(dynamic1, "half"))) {
/* 667 */                     int k = a(j, yr.b.b);
/* 668 */                     Dynamic<?> dynamic2 = a(k);
/* 669 */                     String str = yr.a(dynamic1);
/* 670 */                     if (str.equals(yr.a(dynamic2))) {
/* 671 */                       String str1 = yr.a(dynamic1, "facing");
/* 672 */                       String str2 = yr.a(dynamic1, "open");
/* 673 */                       String str3 = bool ? "left" : yr.a(dynamic2, "hinge");
/* 674 */                       String str4 = bool ? "false" : yr.a(dynamic2, "powered");
/* 675 */                       a(j, (Dynamic)yr.m().get(str + str1 + "lower" + str3 + str2 + str4));
/* 676 */                       a(k, (Dynamic)yr.m().get(str + str1 + "upper" + str3 + str2 + str4));
/*     */                     } 
/*     */                   } 
/*     */                 }  }
/*     */             
/*     */ 
/*     */             
/*     */             case 175:
/* 684 */               for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 685 */                 j |= i;
/*     */                 
/* 687 */                 Dynamic<?> dynamic = a(j);
/* 688 */                 if ("upper".equals(yr.a(dynamic, "half"))) {
/* 689 */                   Dynamic<?> dynamic1 = a(a(j, yr.b.a));
/* 690 */                   String str = yr.a(dynamic1);
/* 691 */                   if ("minecraft:sunflower".equals(str)) {
/* 692 */                     a(j, yr.n()); continue;
/* 693 */                   }  if ("minecraft:lilac".equals(str)) {
/* 694 */                     a(j, yr.o()); continue;
/* 695 */                   }  if ("minecraft:tall_grass".equals(str)) {
/* 696 */                     a(j, yr.p()); continue;
/* 697 */                   }  if ("minecraft:large_fern".equals(str)) {
/* 698 */                     a(j, yr.q()); continue;
/* 699 */                   }  if ("minecraft:rose_bush".equals(str)) {
/* 700 */                     a(j, yr.r()); continue;
/* 701 */                   }  if ("minecraft:peony".equals(str)) {
/* 702 */                     a(j, yr.s());
/*     */                   }
/*     */                 }  }
/*     */             
/*     */           }  }
/*     */       
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private Dynamic<?> b(int ☃) {
/* 715 */     return (Dynamic)this.f.get(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private Dynamic<?> c(int ☃) {
/* 720 */     return (Dynamic)this.f.remove(☃); } public static int a(int ☃, yr.b b1) {
/*     */     int i;
/*     */     int j;
/*     */     int k;
/* 724 */     switch (yr.null.a[b1.b().ordinal()]) {
/*     */       case 1:
/* 726 */         i = (☃ & 0xF) + b1.a().a();
/* 727 */         return (i < 0 || i > 15) ? -1 : (☃ & 0xFFFFFFF0 | i);
/*     */       case 2:
/* 729 */         j = (☃ >> 8) + b1.a().a();
/* 730 */         return (j < 0 || j > 255) ? -1 : (☃ & 0xFF | j << 8);
/*     */       case 3:
/* 732 */         k = (☃ >> 4 & 0xF) + b1.a().a();
/* 733 */         return (k < 0 || k > 15) ? -1 : (☃ & 0xFFFFFF0F | k << 4);
/*     */     } 
/* 735 */     return -1;
/*     */   }
/*     */   
/*     */   private void a(int ☃, Dynamic<?> dynamic) {
/* 739 */     if (☃ < 0 || ☃ > 65535) {
/*     */       return;
/*     */     }
/*     */     
/* 743 */     yr.c c1 = d(☃);
/*     */     
/* 745 */     if (c1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 749 */     c1.a(☃ & 0xFFF, dynamic);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private yr.c d(int ☃) {
/* 754 */     int i = ☃ >> 12;
/* 755 */     return (i < this.b.length) ? this.b[i] : null;
/*     */   }
/*     */   
/*     */   public Dynamic<?> a(int ☃) {
/* 759 */     if (☃ < 0 || ☃ > 65535) {
/* 760 */       return yr.a();
/*     */     }
/*     */     
/* 763 */     yr.c c1 = d(☃);
/*     */     
/* 765 */     if (c1 == null) {
/* 766 */       return yr.a();
/*     */     }
/*     */     
/* 769 */     return c1.a(☃ & 0xFFF);
/*     */   }
/*     */   
/*     */   public Dynamic<?> a() {
/* 773 */     Dynamic<?> ☃ = this.c;
/* 774 */     if (this.f.isEmpty()) {
/* 775 */       ☃ = ☃.remove("TileEntities");
/*     */     } else {
/* 777 */       ☃ = ☃.set("TileEntities", ☃.createList(this.f.values().stream()));
/*     */     } 
/*     */     
/* 780 */     Dynamic<?> dynamic1 = ☃.emptyMap();
/* 781 */     Dynamic<?> dynamic2 = ☃.emptyList();
/* 782 */     for (yr.c c1 : this.b) {
/* 783 */       if (c1 != null) {
/* 784 */         dynamic2 = dynamic2.merge(c1.a());
/* 785 */         dynamic1 = dynamic1.set(String.valueOf(c1.a), dynamic1.createIntList(Arrays.stream(yr.c.b(c1).toIntArray())));
/*     */       } 
/*     */     } 
/*     */     
/* 789 */     Dynamic<?> dynamic3 = ☃.emptyMap();
/* 790 */     dynamic3 = dynamic3.set("Sides", dynamic3.createByte((byte)this.a));
/* 791 */     dynamic3 = dynamic3.set("Indices", dynamic1);
/* 792 */     return ☃.set("UpgradeData", dynamic3).set("Sections", dynamic2);
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\yr$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */