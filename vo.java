/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.mojang.authlib.Agent;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.ProfileLookupCallback;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.text.ParseException;
/*     */ import java.util.Collection;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class vo
/*     */ {
/*  31 */   private static final Logger e = LogManager.getLogger();
/*  32 */   public static final File a = new File("banned-ips.txt");
/*  33 */   public static final File b = new File("banned-players.txt");
/*  34 */   public static final File c = new File("ops.txt");
/*  35 */   public static final File d = new File("white-list.txt");
/*     */   
/*     */   static List<String> a(File ☃, Map<String, String[]> map) throws IOException {
/*  38 */     List<String> list = Files.readLines(☃, StandardCharsets.UTF_8);
/*  39 */     for (String str : list) {
/*  40 */       str = str.trim();
/*  41 */       if (str.startsWith("#") || str.length() < 1) {
/*     */         continue;
/*     */       }
/*  44 */       String[] arrayOfString = str.split("\\|");
/*  45 */       map.put(arrayOfString[0].toLowerCase(Locale.ROOT), arrayOfString);
/*     */     } 
/*  47 */     return list;
/*     */   }
/*     */   
/*     */   private static void a(MinecraftServer ☃, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
/*  51 */     String[] arrayOfString = (String[])collection.stream().filter(☃ -> !xw.b(☃)).toArray(☃ -> new String[☃]);
/*  52 */     if (☃.R()) {
/*  53 */       ☃.aq().findProfilesByNames(arrayOfString, Agent.MINECRAFT, profileLookupCallback);
/*     */     } else {
/*  55 */       for (String str : arrayOfString) {
/*  56 */         UUID uUID = aog.a(new GameProfile(null, str));
/*  57 */         GameProfile gameProfile = new GameProfile(uUID, str);
/*  58 */         profileLookupCallback.onProfileLookupSucceeded(gameProfile);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(MinecraftServer ☃) {
/*  64 */     vu vu = new vu(vp.a);
/*  65 */     if (b.exists() && b.isFile()) {
/*  66 */       if (vu.c().exists()) {
/*     */         try {
/*  68 */           vu.g();
/*  69 */         } catch (FileNotFoundException fileNotFoundException) {
/*  70 */           e.warn("Could not load existing file {}", vu.c().getName(), fileNotFoundException);
/*     */         } 
/*     */       }
/*     */       try {
/*  74 */         Map<String, String[]> map = Maps.newHashMap();
/*  75 */         a(b, map);
/*     */         
/*  77 */         ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, map, vu)
/*     */           {
/*     */             public void onProfileLookupSucceeded(GameProfile ☃) {
/*  80 */               this.a.ar().a(☃);
/*  81 */               String[] arrayOfString = (String[])this.b.get(☃.getName().toLowerCase(Locale.ROOT));
/*  82 */               if (arrayOfString == null) {
/*  83 */                 vo.a().warn("Could not convert user banlist entry for {}", ☃.getName());
/*  84 */                 throw new vo.a("Profile not in the conversionlist");
/*     */               } 
/*     */               
/*  87 */               Date date1 = (arrayOfString.length > 1) ? vo.a(arrayOfString[1], (Date)null) : null;
/*  88 */               String str1 = (arrayOfString.length > 2) ? arrayOfString[2] : null;
/*  89 */               Date date2 = (arrayOfString.length > 3) ? vo.a(arrayOfString[3], (Date)null) : null;
/*  90 */               String str2 = (arrayOfString.length > 4) ? arrayOfString[4] : null;
/*  91 */               this.c.a(new vv(☃, date1, str1, date2, str2));
/*     */             }
/*     */ 
/*     */             
/*     */             public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/*  96 */               vo.a().warn("Could not lookup user banlist entry for {}", ☃.getName(), exception);
/*  97 */               if (!(exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException)) {
/*  98 */                 throw new vo.a("Could not request user " + ☃.getName() + " from backend systems", exception);
/*     */               }
/*     */             }
/*     */           };
/* 102 */         a(☃, map.keySet(), profileLookupCallback);
/* 103 */         vu.f();
/* 104 */         c(b);
/* 105 */       } catch (IOException iOException) {
/* 106 */         e.warn("Could not read old user banlist to convert it!", iOException);
/* 107 */         return false;
/* 108 */       } catch (a a) {
/* 109 */         e.error("Conversion failed, please try again later", a);
/* 110 */         return false;
/*     */       } 
/* 112 */       return true;
/*     */     } 
/* 114 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean b(MinecraftServer ☃) {
/* 118 */     vm vm = new vm(vp.b);
/* 119 */     if (a.exists() && a.isFile()) {
/* 120 */       if (vm.c().exists()) {
/*     */         try {
/* 122 */           vm.g();
/* 123 */         } catch (FileNotFoundException fileNotFoundException) {
/* 124 */           e.warn("Could not load existing file {}", vm.c().getName(), fileNotFoundException);
/*     */         } 
/*     */       }
/*     */       try {
/* 128 */         Map<String, String[]> map = Maps.newHashMap();
/* 129 */         a(a, map);
/*     */         
/* 131 */         for (String str1 : map.keySet()) {
/* 132 */           String[] arrayOfString = map.get(str1);
/* 133 */           Date date1 = (arrayOfString.length > 1) ? b(arrayOfString[1], null) : null;
/* 134 */           String str2 = (arrayOfString.length > 2) ? arrayOfString[2] : null;
/* 135 */           Date date2 = (arrayOfString.length > 3) ? b(arrayOfString[3], null) : null;
/* 136 */           String str3 = (arrayOfString.length > 4) ? arrayOfString[4] : null;
/* 137 */           vm.a(new vn(str1, date1, str2, date2, str3));
/*     */         } 
/* 139 */         vm.f();
/* 140 */         c(a);
/* 141 */       } catch (IOException iOException) {
/* 142 */         e.warn("Could not parse old ip banlist to convert it!", iOException);
/* 143 */         return false;
/*     */       } 
/* 145 */       return true;
/*     */     } 
/* 147 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean c(MinecraftServer ☃) {
/* 151 */     vq vq = new vq(vp.c);
/* 152 */     if (c.exists() && c.isFile()) {
/* 153 */       if (vq.c().exists()) {
/*     */         try {
/* 155 */           vq.g();
/* 156 */         } catch (FileNotFoundException fileNotFoundException) {
/* 157 */           e.warn("Could not load existing file {}", vq.c().getName(), fileNotFoundException);
/*     */         } 
/*     */       }
/*     */       try {
/* 161 */         List<String> list = Files.readLines(c, StandardCharsets.UTF_8);
/* 162 */         ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, vq)
/*     */           {
/*     */             public void onProfileLookupSucceeded(GameProfile ☃) {
/* 165 */               this.a.ar().a(☃);
/* 166 */               this.b.a(new vr(☃, this.a.j(), false));
/*     */             }
/*     */ 
/*     */             
/*     */             public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 171 */               vo.a().warn("Could not lookup oplist entry for {}", ☃.getName(), exception);
/* 172 */               if (!(exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException)) {
/* 173 */                 throw new vo.a("Could not request user " + ☃.getName() + " from backend systems", exception);
/*     */               }
/*     */             }
/*     */           };
/* 177 */         a(☃, list, profileLookupCallback);
/* 178 */         vq.f();
/* 179 */         c(c);
/* 180 */       } catch (IOException iOException) {
/* 181 */         e.warn("Could not read old oplist to convert it!", iOException);
/* 182 */         return false;
/* 183 */       } catch (a a) {
/* 184 */         e.error("Conversion failed, please try again later", a);
/* 185 */         return false;
/*     */       } 
/* 187 */       return true;
/*     */     } 
/* 189 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean d(MinecraftServer ☃) {
/* 193 */     vw vw = new vw(vp.d);
/* 194 */     if (d.exists() && d.isFile()) {
/* 195 */       if (vw.c().exists()) {
/*     */         try {
/* 197 */           vw.g();
/* 198 */         } catch (FileNotFoundException fileNotFoundException) {
/* 199 */           e.warn("Could not load existing file {}", vw.c().getName(), fileNotFoundException);
/*     */         } 
/*     */       }
/*     */       try {
/* 203 */         List<String> list = Files.readLines(d, StandardCharsets.UTF_8);
/* 204 */         ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, vw)
/*     */           {
/*     */             public void onProfileLookupSucceeded(GameProfile ☃) {
/* 207 */               this.a.ar().a(☃);
/* 208 */               this.b.a(new vx(☃));
/*     */             }
/*     */ 
/*     */             
/*     */             public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 213 */               vo.a().warn("Could not lookup user whitelist entry for {}", ☃.getName(), exception);
/* 214 */               if (!(exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException)) {
/* 215 */                 throw new vo.a("Could not request user " + ☃.getName() + " from backend systems", exception);
/*     */               }
/*     */             }
/*     */           };
/* 219 */         a(☃, list, profileLookupCallback);
/* 220 */         vw.f();
/* 221 */         c(d);
/* 222 */       } catch (IOException iOException) {
/* 223 */         e.warn("Could not read old whitelist to convert it!", iOException);
/* 224 */         return false;
/* 225 */       } catch (a a) {
/* 226 */         e.error("Conversion failed, please try again later", a);
/* 227 */         return false;
/*     */       } 
/* 229 */       return true;
/*     */     } 
/* 231 */     return true;
/*     */   }
/*     */   
/*     */   public static String a(MinecraftServer ☃, String str) {
/* 235 */     if (xw.b(str) || str.length() > 16) {
/* 236 */       return str;
/*     */     }
/*     */     
/* 239 */     GameProfile gameProfile = ☃.ar().a(str);
/* 240 */     if (gameProfile != null && gameProfile.getId() != null) {
/* 241 */       return gameProfile.getId().toString();
/*     */     }
/* 243 */     if (☃.H() || !☃.R()) {
/* 244 */       return aog.a(new GameProfile(null, str)).toString();
/*     */     }
/* 246 */     List<GameProfile> list = Lists.newArrayList();
/* 247 */     ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, list)
/*     */       {
/*     */         public void onProfileLookupSucceeded(GameProfile ☃) {
/* 250 */           this.a.ar().a(☃);
/* 251 */           this.b.add(☃);
/*     */         }
/*     */ 
/*     */         
/*     */         public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 256 */           vo.a().warn("Could not lookup user whitelist entry for {}", ☃.getName(), exception);
/*     */         }
/*     */       };
/* 259 */     a(☃, Lists.newArrayList((Object[])new String[] { str }, ), profileLookupCallback);
/* 260 */     if (!list.isEmpty() && ((GameProfile)list.get(0)).getId() != null) {
/* 261 */       return ((GameProfile)list.get(0)).getId().toString();
/*     */     }
/*     */     
/* 264 */     return "";
/*     */   }
/*     */   
/*     */   static class a extends RuntimeException {
/*     */     private a(String ☃, Throwable throwable) {
/* 269 */       super(☃, throwable);
/*     */     }
/*     */     
/*     */     private a(String ☃) {
/* 273 */       super(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean a(so ☃, ps ps1) {
/* 278 */     File file1 = d(ps1);
/* 279 */     File file2 = new File(file1.getParentFile(), "playerdata");
/* 280 */     File file3 = new File(file1.getParentFile(), "unknownplayers");
/* 281 */     if (!file1.exists() || !file1.isDirectory()) {
/* 282 */       return true;
/*     */     }
/* 284 */     File[] arrayOfFile = file1.listFiles();
/* 285 */     List<String> list = Lists.newArrayList();
/* 286 */     for (File file : arrayOfFile) {
/* 287 */       String str = file.getName();
/* 288 */       if (str.toLowerCase(Locale.ROOT).endsWith(".dat")) {
/*     */ 
/*     */         
/* 291 */         String str1 = str.substring(0, str.length() - ".dat".length());
/* 292 */         if (!str1.isEmpty()) {
/* 293 */           list.add(str1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     try {
/* 298 */       String[] arrayOfString = list.<String>toArray(new String[list.size()]);
/* 299 */       ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, file2, file3, file1, arrayOfString)
/*     */         {
/*     */           public void onProfileLookupSucceeded(GameProfile ☃) {
/* 302 */             this.a.ar().a(☃);
/* 303 */             UUID uUID = ☃.getId();
/* 304 */             if (uUID == null) {
/* 305 */               throw new vo.a("Missing UUID for user profile " + ☃.getName());
/*     */             }
/* 307 */             a(this.b, a(☃), uUID.toString());
/*     */           }
/*     */ 
/*     */           
/*     */           public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 312 */             vo.a().warn("Could not lookup user uuid for {}", ☃.getName(), exception);
/* 313 */             if (exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException) {
/* 314 */               String str = a(☃);
/* 315 */               a(this.c, str, str);
/*     */             } else {
/* 317 */               throw new vo.a("Could not request user " + ☃.getName() + " from backend systems", exception);
/*     */             } 
/*     */           }
/*     */           
/*     */           private void a(File ☃, String str1, String str2) {
/* 322 */             File file1 = new File(this.d, str1 + ".dat");
/* 323 */             File file2 = new File(☃, str2 + ".dat");
/* 324 */             vo.a(☃);
/* 325 */             if (!file1.renameTo(file2)) {
/* 326 */               throw new vo.a("Could not convert file for " + str1);
/*     */             }
/*     */           }
/*     */           
/*     */           private String a(GameProfile ☃) {
/* 331 */             String str = null;
/* 332 */             for (String str1 : this.e) {
/* 333 */               if (str1 != null && str1.equalsIgnoreCase(☃.getName())) {
/* 334 */                 str = str1;
/*     */                 break;
/*     */               } 
/*     */             } 
/* 338 */             if (str == null) {
/* 339 */               throw new vo.a("Could not find the filename for " + ☃.getName() + " anymore");
/*     */             }
/* 341 */             return str;
/*     */           }
/*     */         };
/* 344 */       a(☃, Lists.newArrayList((Object[])arrayOfString), profileLookupCallback);
/* 345 */     } catch (a a) {
/* 346 */       e.error("Conversion failed, please try again later", a);
/* 347 */       return false;
/*     */     } 
/*     */     
/* 350 */     return true;
/*     */   }
/*     */   
/*     */   private static void b(File ☃) {
/* 354 */     if (☃.exists()) {
/* 355 */       if (☃.isDirectory()) {
/*     */         return;
/*     */       }
/* 358 */       throw new a("Can't create directory " + ☃.getName() + " in world save directory.");
/*     */     } 
/*     */     
/* 361 */     if (!☃.mkdirs()) {
/* 362 */       throw new a("Can't create directory " + ☃.getName() + " in world save directory.");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(ps ☃) {
/* 368 */     boolean bool = b(☃);
/* 369 */     bool = (bool && c(☃));
/* 370 */     return bool;
/*     */   }
/*     */   
/*     */   private static boolean b(ps ☃) {
/* 374 */     boolean bool1 = false;
/* 375 */     if (b.exists() && b.isFile()) {
/* 376 */       bool1 = true;
/*     */     }
/* 378 */     boolean bool2 = false;
/* 379 */     if (a.exists() && a.isFile()) {
/* 380 */       bool2 = true;
/*     */     }
/* 382 */     boolean bool3 = false;
/* 383 */     if (c.exists() && c.isFile()) {
/* 384 */       bool3 = true;
/*     */     }
/* 386 */     boolean bool4 = false;
/* 387 */     if (d.exists() && d.isFile()) {
/* 388 */       bool4 = true;
/*     */     }
/*     */     
/* 391 */     if (bool1 || bool2 || bool3 || bool4) {
/* 392 */       e.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
/* 393 */       e.warn("** please remove the following files and restart the server:");
/* 394 */       if (bool1) {
/* 395 */         e.warn("* {}", b.getName());
/*     */       }
/* 397 */       if (bool2) {
/* 398 */         e.warn("* {}", a.getName());
/*     */       }
/* 400 */       if (bool3) {
/* 401 */         e.warn("* {}", c.getName());
/*     */       }
/* 403 */       if (bool4) {
/* 404 */         e.warn("* {}", d.getName());
/*     */       }
/* 406 */       return false;
/*     */     } 
/* 408 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean c(ps ☃) {
/* 412 */     File file = d(☃);
/* 413 */     if (file.exists() && file.isDirectory() && ((
/* 414 */       file.list()).length > 0 || !file.delete())) {
/* 415 */       e.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
/* 416 */       e.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
/* 417 */       e.warn("** please restart the server and if the problem persists, remove the directory '{}'", file.getPath());
/* 418 */       return false;
/*     */     } 
/*     */     
/* 421 */     return true;
/*     */   }
/*     */   
/*     */   private static File d(ps ☃) {
/* 425 */     String str = ☃.a("level-name", "world");
/* 426 */     File file = new File(str);
/* 427 */     return new File(file, "players");
/*     */   }
/*     */   
/*     */   private static void c(File ☃) {
/* 431 */     File file = new File(☃.getName() + ".converted");
/* 432 */     ☃.renameTo(file);
/*     */   }
/*     */   
/*     */   private static Date b(String ☃, Date date) {
/*     */     Date date1;
/*     */     try {
/* 438 */       date1 = vk.a.parse(☃);
/* 439 */     } catch (ParseException parseException) {
/* 440 */       date1 = date;
/*     */     } 
/* 442 */     return date1;
/*     */   }
/*     */ }


/* Location:              F:\dw\server.jar!\vo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */