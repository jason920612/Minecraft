/*    */ package net.minecraft.data;
/*    */ 
/*    */ import fp;
/*    */ import fq;
/*    */ import fs;
/*    */ import fz;
/*    */ import ga;
/*    */ import gb;
/*    */ import gf;
/*    */ import gl;
/*    */ import gm;
/*    */ import go;
/*    */ import gp;
/*    */ import gq;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.Paths;
/*    */ import java.util.Collection;
/*    */ import java.util.stream.Collectors;
/*    */ import joptsimple.AbstractOptionSpec;
/*    */ import joptsimple.ArgumentAcceptingOptionSpec;
/*    */ import joptsimple.OptionParser;
/*    */ import joptsimple.OptionSet;
/*    */ import joptsimple.OptionSpec;
/*    */ import joptsimple.OptionSpecBuilder;
/*    */ 
/*    */ public class Main {
/*    */   public static void main(String[] ☃) throws IOException {
/* 29 */     OptionParser optionParser = new OptionParser();
/* 30 */     AbstractOptionSpec<Void> abstractOptionSpec = optionParser.accepts("help", "Show the help menu").forHelp();
/* 31 */     OptionSpecBuilder optionSpecBuilder1 = optionParser.accepts("server", "Include server generators");
/* 32 */     OptionSpecBuilder optionSpecBuilder2 = optionParser.accepts("client", "Include client generators");
/* 33 */     OptionSpecBuilder optionSpecBuilder3 = optionParser.accepts("dev", "Include development tools");
/* 34 */     OptionSpecBuilder optionSpecBuilder4 = optionParser.accepts("reports", "Include data reports");
/* 35 */     OptionSpecBuilder optionSpecBuilder5 = optionParser.accepts("all", "Include all generators");
/* 36 */     ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec1 = optionParser.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", (Object[])new String[0]);
/* 37 */     ArgumentAcceptingOptionSpec<String> argumentAcceptingOptionSpec2 = optionParser.accepts("input", "Input folder").withRequiredArg();
/* 38 */     OptionSet optionSet = optionParser.parse(☃);
/*    */     
/* 40 */     if (optionSet.has((OptionSpec)abstractOptionSpec) || !optionSet.hasOptions()) {
/* 41 */       optionParser.printHelpOn(System.out);
/*    */       
/*    */       return;
/*    */     } 
/* 45 */     Path path = Paths.get((String)argumentAcceptingOptionSpec1.value(optionSet), new String[0]);
/* 46 */     boolean bool1 = (optionSet.has((OptionSpec)optionSpecBuilder2) || optionSet.has((OptionSpec)optionSpecBuilder5));
/* 47 */     boolean bool2 = (optionSet.has((OptionSpec)optionSpecBuilder1) || optionSet.has((OptionSpec)optionSpecBuilder5));
/* 48 */     boolean bool3 = (optionSet.has((OptionSpec)optionSpecBuilder3) || optionSet.has((OptionSpec)optionSpecBuilder5));
/* 49 */     boolean bool4 = (optionSet.has((OptionSpec)optionSpecBuilder4) || optionSet.has((OptionSpec)optionSpecBuilder5));
/* 50 */     fp fp = a(path, (Collection<Path>)optionSet.valuesOf((OptionSpec)argumentAcceptingOptionSpec2).stream().map(☃ -> Paths.get(☃, new String[0])).collect(Collectors.toList()), bool1, bool2, bool3, bool4);
/* 51 */     fp.c();
/*    */   }
/*    */   
/*    */   public static fp a(Path ☃, Collection<Path> collection, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/* 55 */     fp fp = new fp(☃, collection);
/* 56 */     if (bool1 || bool2) {
/* 57 */       fp.a((fq)new gm(fp));
/*    */     }
/* 59 */     if (bool2) {
/* 60 */       fp.a((fq)new gp(fp));
/* 61 */       fp.a((fq)new go(fp));
/* 62 */       fp.a((fq)new gq(fp));
/* 63 */       fp.a((fq)new gf(fp));
/* 64 */       fp.a((fq)new fs(fp));
/*    */     } 
/* 66 */     if (bool3) {
/* 67 */       fp.a((fq)new gl(fp));
/*    */     }
/* 69 */     if (bool4) {
/* 70 */       fp.a((fq)new fz(fp));
/* 71 */       fp.a((fq)new gb(fp));
/* 72 */       fp.a((fq)new ga(fp));
/*    */     } 
/* 74 */     return fp;
/*    */   }
/*    */ }


/* Location:              F:\dw\server.jar!\net\minecraft\data\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */